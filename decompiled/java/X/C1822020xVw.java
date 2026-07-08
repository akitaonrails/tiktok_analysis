package X;

/* JADX INFO: renamed from: X.0xVw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1822020xVw {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, C1555840qac c1555840qac) {
        Long l;
        Long l2;
        String str3;
        C1822010xVv c1822010xVv;
        EnumC1785280wYg enumC1785280wYg;
        C1822010xVv c1822010xVv2;
        C1822010xVv c1822010xVv3;
        C1822010xVv c1822010xVv4;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_audience_secondary_page");
        String etServiceTypeValue = null;
        if (c1555840qac != null && (c1822010xVv4 = c1555840qac.LL) != null) {
            l = c1822010xVv4.LJI;
        } else {
            l = null;
        }
        c474500IjALIZ.LJJII(l, "anchor_id");
        if (c1555840qac != null && (c1822010xVv3 = c1555840qac.LL) != null) {
            l2 = c1822010xVv3.LJIIIIZZ;
        } else {
            l2 = null;
        }
        c474500IjALIZ.LJJII(l2, "room_id");
        c474500IjALIZ.LJJII(str, "action_type");
        if (c1555840qac != null && (c1822010xVv2 = c1555840qac.LL) != null) {
            str3 = c1822010xVv2.LIZIZ;
        } else {
            str3 = null;
        }
        c474500IjALIZ.LJJII(str3, "show_entrance");
        c474500IjALIZ.LJJII(str2, "click_position");
        if (c1555840qac != null && (c1822010xVv = c1555840qac.LL) != null && (enumC1785280wYg = c1822010xVv.LIZ) != null) {
            etServiceTypeValue = enumC1785280wYg.getEtServiceTypeValue();
        }
        c474500IjALIZ.LJJII(etServiceTypeValue, "service_type");
        c474500IjALIZ.LIZ();
    }
}
