package X;

import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;

/* JADX INFO: renamed from: X.0vwm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1761780vwm {
    public static final C1761780vwm LIZ = new C1761780vwm();

    public static C1762960vyg LIZ(C1761780vwm c1761780vwm, String str, String str2, String str3) {
        c1761780vwm.getClass();
        C1762960vyg c1762960vyg = new C1762960vyg(EnumC1761790vwn.PHOTO_INFO, str3, null, null);
        c1762960vyg.LJ = str;
        c1762960vyg.LJFF = str2;
        return c1762960vyg;
    }

    public static C1762980vyi LIZIZ(C1761780vwm c1761780vwm, String str, String str2, InterfaceC1763870w09 interfaceC1763870w09, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            interfaceC1763870w09 = null;
        }
        c1761780vwm.getClass();
        C1762980vyi c1762980vyi = new C1762980vyi(EnumC1761790vwn.PHOTO, str2, interfaceC1763870w09, null);
        c1762980vyi.LJ = str;
        return c1762980vyi;
    }

    public static C1762710vyH LIZJ(String str, String str2, String str3, String str4, Double d, Integer num, Integer num2, C1508390pM5 c1508390pM5, String str5, ECRichText eCRichText) {
        C1762710vyH c1762710vyH = new C1762710vyH(EnumC1761790vwn.VIDEO_V2, str5);
        c1762710vyH.LIZJ = str;
        c1762710vyH.LIZLLL = str2;
        c1762710vyH.LJ = str3;
        c1762710vyH.LJFF = str4;
        c1762710vyH.LJI = d;
        c1762710vyH.LJII = num;
        c1762710vyH.LJIIIIZZ = num2;
        if (c1508390pM5 == null) {
            c1508390pM5 = new C1508390pM5(0);
        }
        c1762710vyH.LJIIIZ = c1508390pM5;
        c1762710vyH.LJIIJ = eCRichText;
        return c1762710vyH;
    }
}
