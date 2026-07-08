package X;

import android.media.ExifInterface;
import com.bytedance.bpea.cert.token.TokenCert;
import kotlin.Pair;
import kotlin.jvm.internal.AwS386S0200000_20;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.13rv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20144513rv {
    public static boolean LIZ(ExifInterface exifInterface, String[] strArr, TokenCert tokenCert) throws C838130WuJ {
        tokenCert.attachCustomInfo("dataflowID", 1476403202);
        C825940Wae c825940Wae = new C825940Wae(tokenCert, "ExifInterface_getLocation", new String[]{"location"}, Integer.valueOf(EnumC746240TPa.BPEA_ENTRY.getType()), "Collect", 771);
        C837860Wts.LIZ(c825940Wae, "android/media/ExifInterface", "getLatLong([F)Z", C2097908Jt.LIZJ(new Pair("output", strArr)));
        float[] fArr = new float[2];
        Pair pair = (Pair) C838080WuE.LIZ(c825940Wae, new AwS386S0200000_20(exifInterface, fArr, 2));
        if (((Boolean) pair.getFirst()).booleanValue()) {
            String str = (String) pair.getSecond();
            if (str == null) {
                str = "";
            }
            if (!u.LJIJI(a0.LJLIIIL(str).toString(), "V", true)) {
                double d = fArr[0];
                double d2 = fArr[1];
                if (!C19857512mj.LIZ(d, d2)) {
                    return false;
                }
                C1199590hK1 c1199590hK1LIZIZ = C839940WxE.LIZIZ(d, d2, tokenCert);
                strArr[0] = c1199590hK1LIZIZ.LIZ;
                strArr[1] = c1199590hK1LIZIZ.LIZIZ;
                return true;
            }
        }
        return false;
    }
}
