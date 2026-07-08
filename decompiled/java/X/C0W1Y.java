package X;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0W1Y, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W1Y {
    public final Map<String, String> LIZ = new ConcurrentHashMap();

    public final String LIZIZ(String str) {
        String strSubstring;
        boolean z;
        int i = 1;
        if (str.contains("%%secretKey=")) {
            strSubstring = str.substring(0, str.indexOf("%%secretKey="));
            String strSubstring2 = str.substring(str.lastIndexOf("=") + 1, str.length());
            if (!TextUtils.isEmpty(strSubstring2)) {
                ((ConcurrentHashMap) this.LIZ).put(strSubstring, strSubstring2);
            }
            z = true;
        } else {
            strSubstring = str;
            z = false;
        }
        if ((z || str.contains("secretKey")) && (str.length() == strSubstring.length() || strSubstring.contains("secretKey"))) {
            Boolean boolValueOf = Boolean.valueOf(z);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ImageEncryptUtils parse failed: rawUrl=");
            sbLIZ.append(str);
            sbLIZ.append(", parseUrl=");
            sbLIZ.append(strSubstring);
            sbLIZ.append(", contain=");
            sbLIZ.append(boolValueOf);
            C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("service", "secret_key_parse_error");
                jSONObject.put("raw_url", str);
                jSONObject.put("parse_url", strSubstring);
                if (!boolValueOf.booleanValue()) {
                    i = 0;
                }
                jSONObject.put("is_contain", i);
                C793770VBv.LJ("im_error_event", jSONObject);
                return strSubstring;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2344809Gs.LJI(e);
            }
        }
        return strSubstring;
    }

    public final Pair LIZ(InputStream inputStream, long j, String str) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (((ConcurrentHashMap) this.LIZ).containsKey(str)) {
            String str2 = (String) ((ConcurrentHashMap) this.LIZ).get(str);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i <= -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                }
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                ((ConcurrentHashMap) this.LIZ).remove(str);
                if (byteArray != null) {
                    int length = str2.length() / 2;
                    byte[] bArr2 = new byte[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        int i3 = i2 * 2;
                        bArr2[i2] = CastIntegerProtector.valueOf(str2.substring(i3, i3 + 2), 16).byteValue();
                    }
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(byteArray, 12, byteArray.length);
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(Arrays.copyOfRange(byteArray, 0, 12));
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
                    Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                    cipher.init(2, secretKeySpec, ivParameterSpec);
                    byte[] bArrDoFinal = cipher.doFinal(bArrCopyOfRange);
                    Pair pair = new Pair(bArrDoFinal, Integer.valueOf(bArrDoFinal.length));
                    inputStream = new ByteArrayInputStream((byte[]) pair.first);
                    j = ((Integer) pair.second).intValue();
                    if (C2213981Bky.LIZIZ.isOffline() && str.contains("p0-tiktok-dm")) {
                        String strEncodeToString = Base64.encodeToString(byteArray, 0);
                        String strEncodeToString2 = Base64.encodeToString((byte[]) pair.first, 0);
                        C2222891BzL c2222891BzL = C2222891BzL.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("url:");
                        sbLIZ.append(str);
                        sbLIZ.append(" ;\n serect key: ");
                        sbLIZ.append(str2);
                        sbLIZ.append(";\noriginImgae: ");
                        sbLIZ.append(strEncodeToString);
                        sbLIZ.append(" ;\n decryptedImage: ");
                        sbLIZ.append(strEncodeToString2);
                        sbLIZ.append(" ;\n");
                        c2222891BzL.LJIJ(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                ((ConcurrentHashMap) this.LIZ).remove(str);
                throw th;
            }
        }
        return new Pair(inputStream, Long.valueOf(j));
    }
}
