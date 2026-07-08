package X;

import android.util.Base64;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.common.experiment.DMTypingRecommendationConfig;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.List;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0XJN, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XJN implements InterfaceC452350HoX {
    public final DMTypingRecommendationConfig LL = C452450Hoh.LIZ();
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(326));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(324));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(328));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(323));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(325));
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(327));

    public static final String LIZ(String str) throws InvalidKeySpecException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        if (str.length() == 0) {
            return "";
        }
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAutV83ecuRlp0W6Omt7Ck\nlTS5cs96EhZRrtRtSXBEUzUdkHkQ1IYSe9v3IcWf5xp/Ah6S9DomremOV1ygHrbl\njjmzNNWTL552Pv0KJckBGxcHE99twRh6X200qD5okc7bi1OmGBJviWJghM+21VFk\nLYBoUa60oCRMQchqJ5E2dPDhhPlMrXIKR7xoGtJjSS8N3PAS9MiKt0UiJ8SxXKvm\n+bbMRSmbCSuvVkk4gWn73GEYS7mWXsu3E1L5w76QWSbW99tixcb2f/HlGVlj4fHq\n3Fiyyj7aDITEI4z4dccDO0wkFVd5ulyksUaf6z6e6cpxMvUT68a5U6fz1EDP3inq\nQQIDAQAB", 0)));
        byte[] bArrLJIILLIIL = u.LJIILLIIL(str);
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(1, publicKeyGeneratePublic);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("giphy encrypted input: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        return Base64.encodeToString(cipher.doFinal(bArrLJIILLIIL), 0);
    }

    public final String LIZIZ(String str) {
        boolean z;
        String string = a0.LJLIIIL(str).toString();
        if (string.length() > this.LL.maxInputLength || string.length() == 0 || ((Regex) this.LLILLJJLI.getValue()).split(string, 0).size() > this.LL.maxWords) {
            return "";
        }
        String strReplace = new Regex("\\d+").replace(((Regex) this.LLILZ.getValue()).replace(((Regex) this.LLILLL.getValue()).replace(string.toLowerCase(Locale.ROOT), ""), ""), "");
        List listLJJII = C09RB.LJJII(Regex.findAll$default((Regex) this.LLILZIL.getValue(), strReplace, 0, 2, null));
        if (listLJJII.isEmpty()) {
            listLJJII = C09RB.LJJII(Regex.findAll$default((Regex) this.LLILZLL.getValue(), strReplace, 0, 2, null));
            z = false;
        } else {
            z = true;
        }
        if (listLJJII.isEmpty()) {
            return strReplace;
        }
        if (listLJJII.size() == 1) {
            return ((MatchResult) ListProtector.get(listLJJII, 0)).getValue();
        }
        String strReplace2 = ((Regex) this.LLIZ.getValue()).replace(((Regex) this.LLILLJJLI.getValue()).replace(strReplace.substring(((MatchResult) C13LP.LJJJJZI(listLJJII)).LIZIZ().LL, ((MatchResult) C13LP.LJJLIIIJJI(listLJJII)).LIZIZ().LLILLJJLI + 1), " "), "");
        if (!z) {
            return strReplace2;
        }
        return ((Regex) this.LLILZLL.getValue()).replace(strReplace2, "");
    }
}
