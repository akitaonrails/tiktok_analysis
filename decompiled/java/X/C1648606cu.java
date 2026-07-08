package X;

import android.util.ArrayMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.06cu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1648606cu implements InterfaceC893360Z2w {
    public static final C1648606cu LIZ = new C1648606cu();

    public static String LJI(EnumC461080I6g enumC461080I6g) {
        int i = C1652306dV.LIZ[enumC461080I6g.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "repost";
            }
            throw new C1954807lC();
        }
        return "post";
    }

    @Override // X.InterfaceC893360Z2w
    public final void LIZ(EnumC461080I6g enumC461080I6g) {
        LJFF(this, enumC461080I6g, "click_cover");
    }

    @Override // X.InterfaceC893360Z2w
    public final void LIZJ(EnumC461080I6g enumC461080I6g) {
        LJFF(this, enumC461080I6g, "click_emoji");
    }

    @Override // X.InterfaceC893360Z2w
    public final void LIZLLL(EnumC461080I6g enumC461080I6g) {
        ArrayMap<String, String> arrayMapLIZ = C1648506ct.LIZ(new Pair("activity_type", LJI(enumC461080I6g)));
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("click_activity_hint", arrayMapLIZ);
    }

    @Override // X.InterfaceC893360Z2w
    public final void LJ(EnumC461080I6g enumC461080I6g) {
        LJFF(this, enumC461080I6g, "click_dismiss");
    }

    @Override // X.InterfaceC893360Z2w
    public final void LIZIZ(EnumC461080I6g enumC461080I6g, InterfaceC1493105sv interfaceC1493105sv) {
        interfaceC1493105sv.sendEvent("show_activity_card", C1648506ct.LIZ(new Pair("activity_type", LJI(enumC461080I6g))));
    }

    public static void LJFF(C1648606cu c1648606cu, EnumC461080I6g enumC461080I6g, String str) {
        C0I0B.LJFF.LIZIZ();
        c1648606cu.getClass();
        C20684815ws.LJIILLIIL("click_activity_card", C1648506ct.LIZ(new Pair("activity_type", LJI(enumC461080I6g)), new Pair("action", str)));
    }
}
