package X;

import android.net.Uri;
import android.util.Base64;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.passkey.IABJumpACTConfigExp;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.text.Charsets;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0WKz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C821630WKz {
    public static final C821630WKz LIZ = new C821630WKz();

    public static String LIZ(String str) {
        String str2;
        PrivateKey privateKeyGeneratePrivate;
        byte[] bArrSign;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Uri uri;
        Uri.Builder builderBuildUpon;
        Uri.Builder builderAppendQueryParameter;
        Uri uri2 = UriProtector.parse(str);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "session_id");
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "redirect_url");
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "provider");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{\"exp\":");
        sbLIZ.append(System.currentTimeMillis() + ((long) C538540LAe.LLJJJIL));
        sbLIZ.append(",\"aud\":\"");
        sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
        sbLIZ.append("\",\"sid\":\"");
        sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        sbLIZ.append("\"}");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Charset charset = Charsets.UTF_8;
        String strEncodeToString = Base64.encodeToString("{\"alg\":\"ES256\",\"typ\":\"JWT\"}".getBytes(charset), 11);
        String strEncodeToString2 = Base64.encodeToString(strLIZIZ.getBytes(charset), 11);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strEncodeToString);
        sbLIZ2.append('.');
        sbLIZ2.append(strEncodeToString2);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        IABJumpACTConfigExp.EnableIABJumpACTModel enableIABJumpACTModel = (IABJumpACTConfigExp.EnableIABJumpACTModel) IABJumpACTConfigExp.LIZIZ.getValue();
        if (enableIABJumpACTModel == null || (str2 = enableIABJumpACTModel.privateKey) == null) {
            str2 = "";
        }
        if (!a0.LJJJIL(str2)) {
            try {
                privateKeyGeneratePrivate = KeyFactory.getInstance("EC").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(a0.LJLIIIL(u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(str2, "-----BEGIN PRIVATE KEY-----", "", false), "-----END PRIVATE KEY-----", "", false), "-----BEGIN EC PRIVATE KEY-----", "", false), "-----END EC PRIVATE KEY-----", "", false), "\n", "", false), "\r", "", false)).toString(), 0)));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                privateKeyGeneratePrivate = null;
            }
        } else {
            privateKeyGeneratePrivate = null;
        }
        if (privateKeyGeneratePrivate != null) {
            C821630WKz c821630WKz = LIZ;
            byte[] bytes = strLIZIZ2.getBytes(Charsets.UTF_8);
            c821630WKz.getClass();
            try {
                Signature signature = Signature.getInstance("SHA256withECDSA");
                signature.initSign(privateKeyGeneratePrivate);
                signature.update(bytes);
                bArrSign = signature.sign();
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                bArrSign = new byte[0];
            }
            LIZ.getClass();
            if (bArrSign.length >= 8) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrSign);
                if (byteBufferWrap.get() == 48) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    byteBufferWrap.get();
                    if (byteBufferWrap.get() == 2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        byte[] bArr = new byte[byteBufferWrap.get() & 255];
                        byteBufferWrap.get(bArr);
                        if (byteBufferWrap.get() == 2) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            byte[] bArr2 = new byte[byteBufferWrap.get() & 255];
                            byteBufferWrap.get(bArr2);
                            Pair pair = new Pair(new BigInteger(1, bArr), new BigInteger(1, bArr2));
                            BigInteger bigInteger = (BigInteger) pair.getFirst();
                            BigInteger bigInteger2 = (BigInteger) pair.getSecond();
                            byte[] byteArray = bigInteger.toByteArray();
                            if (byteArray.length > 1 && byteArray[0] == 0) {
                                int length = byteArray.length;
                                C1691430u7J.LIZ(length, byteArray.length);
                                byteArray = Arrays.copyOfRange(byteArray, 1, length);
                            }
                            byte[] byteArray2 = bigInteger2.toByteArray();
                            if (byteArray2.length > 1 && byteArray2[0] == 0) {
                                int length2 = byteArray2.length;
                                C1691430u7J.LIZ(length2, byteArray2.length);
                                byteArray2 = Arrays.copyOfRange(byteArray2, 1, length2);
                            }
                            byte[] bArr3 = new byte[64];
                            System.arraycopy(byteArray, 0, bArr3, 32 - byteArray.length, byteArray.length);
                            System.arraycopy(byteArray2, 0, bArr3, 64 - byteArray2.length, byteArray2.length);
                            String strEncodeToString3 = Base64.encodeToString(bArr3, 11);
                            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null || (uri = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) == null || (builderBuildUpon = uri.buildUpon()) == null || (builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("callbackScheme", "snssdk1233://session_complete")) == null) {
                                return null;
                            }
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(strLIZIZ2);
                            sbLIZ3.append('.');
                            sbLIZ3.append(strEncodeToString3);
                            Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("session_token", C2188811AlT.LIZIZ(sbLIZ3));
                            if (builderAppendQueryParameter2 == null) {
                                return null;
                            }
                            return builderAppendQueryParameter2.toString();
                        }
                        "Expected INTEGER for s".toString();
                        throw new IllegalArgumentException("Expected INTEGER for s");
                    }
                    "Expected INTEGER for r".toString();
                    throw new IllegalArgumentException("Expected INTEGER for r");
                }
                "Not a valid DER sequence".toString();
                throw new IllegalArgumentException("Not a valid DER sequence");
            }
            "Invalid DER signature length".toString();
            throw new IllegalArgumentException("Invalid DER signature length");
        }
        return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
    }
}
