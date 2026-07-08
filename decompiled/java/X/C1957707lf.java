package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.07lf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1957707lf {
    public static final C1957707lf LIZ = new C1957707lf();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(676));

    public static String LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        sbLIZ.append('_');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LIZIZ(String str) {
        C1957707lf c1957707lf = LIZ;
        c1957707lf.getClass();
        String strLIZ = LIZ(str);
        c1957707lf.getClass();
        C01GW c01gw = LIZIZ;
        if (a0.LJJIIZI(((Keva) c01gw.getValue()).getString("paid_content_banner_showed_campaigns", ""), LIZ(str), false) && LIZJ(strLIZ) == 0) {
            ((Keva) c01gw.getValue()).storeInt(strLIZ, 1);
        }
        Keva keva = (Keva) c01gw.getValue();
        c1957707lf.getClass();
        String string = ((Keva) c01gw.getValue()).getString("paid_content_banner_showed_campaigns", "");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZ(str));
        sbLIZ.append(',');
        keva.storeString("paid_content_banner_showed_campaigns", u.LJJIFFI(string, C2188811AlT.LIZIZ(sbLIZ), "", false));
    }

    public static final int LIZJ(String str) {
        LIZ.getClass();
        return ((Keva) LIZIZ.getValue()).getInt(LIZ(str), 0);
    }
}
