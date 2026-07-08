package X;

import java.util.List;

/* JADX INFO: renamed from: X.0D3F, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D3F {
    public static C0D3I LIZ(C0D3F c0d3f, List list, String str, EnumC332810D2x enumC332810D2x, C0D3G c0d3g, int i) {
        C0D3H c0d3h;
        C0D3G c0d3g2 = c0d3g;
        EnumC332810D2x enumC332810D2x2 = enumC332810D2x;
        if ((i & 4) != 0) {
            enumC332810D2x2 = EnumC332810D2x.STOREFRONT;
        }
        if ((i & 8) != 0) {
            c0d3f.getClass();
            if (list.size() > 1) {
                c0d3h = C0D3H.CAROUSEL;
            } else {
                c0d3h = C0D3H.SINGLE_IMAGE;
            }
        } else {
            c0d3h = null;
        }
        if ((i & 16) != 0) {
            c0d3g2 = C0D3G.ACCEPT_ENRICHMENT;
        }
        c0d3f.getClass();
        return new C0D3I(list, enumC332810D2x2, C0D3J.READY, c0d3h, c0d3g2, str);
    }
}
