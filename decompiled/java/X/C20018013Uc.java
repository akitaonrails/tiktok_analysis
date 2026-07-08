package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Uc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20018013Uc implements InterfaceC710490Rtv {
    public static final C20018013Uc LIZ = new C20018013Uc();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(255));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(256));
    public static final C01GW LIZLLL = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS219S0000000_30.get$arr$(257));

    @Override // X.InterfaceC710490Rtv
    public final void LJFF(Context context) {
    }

    public static final Keva LJII() {
        return (Keva) LIZLLL.getValue();
    }

    @Override // X.InterfaceC710490Rtv
    public final void LIZ() {
        C20017913Ub c20017913Ub = (C20017913Ub) LIZJ.getValue();
        c20017913Ub.getClass();
        c20017913Ub.LIZLLL = System.currentTimeMillis();
        C20018013Uc c20018013Uc = LIZ;
        Keva kevaLJII = LJII();
        if (c20017913Ub.LIZLLL == 0) {
            c20017913Ub.LIZLLL = LJII().getLong("key_video_frequency_start_time", 0L);
        }
        kevaLJII.storeLong("key_video_frequency_start_time", c20017913Ub.LIZLLL);
        ((ArrayList) c20017913Ub.LIZJ).clear();
    }

    @Override // X.InterfaceC710490Rtv
    public final List<String> LIZLLL() {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC710490Rtv
    public final void LIZJ(Long l) {
        C20017913Ub c20017913Ub = (C20017913Ub) LIZJ.getValue();
        c20017913Ub.getClass();
        if (l != null) {
            l.longValue();
            if (!Intrinsics.LJFF(C13LP.LJJLIIIJL(c20017913Ub.LIZJ), l)) {
                ((ArrayList) c20017913Ub.LIZJ).add(l);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00f7  */
    @Override // X.InterfaceC710490Rtv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ(java.lang.Long r14) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20018013Uc.LJ(java.lang.Long):boolean");
    }

    @Override // X.InterfaceC710490Rtv
    public final void LIZIZ(Long l, String str) {
        C20018113Ud c20018113Ud = (C20018113Ud) LIZIZ.getValue();
        if (c20018113Ud.LIZ() > c20018113Ud.LIZ) {
            c20018113Ud.LIZLLL = (c20018113Ud.LIZ() - c20018113Ud.LIZ) + 1;
        } else {
            c20018113Ud.LIZLLL = c20018113Ud.LIZ() + 1;
        }
        C20018013Uc c20018013Uc = LIZ;
        LJII().storeInt("key_non_click_count", c20018113Ud.LIZ());
        c20018113Ud.LIZJ = System.currentTimeMillis();
        Keva kevaLJII = LJII();
        if (c20018113Ud.LIZJ == 0) {
            c20018113Ud.LIZJ = LJII().getLong("key_last_show_time", 0L);
        }
        kevaLJII.storeLong("key_last_show_time", c20018113Ud.LIZJ);
    }

    @Override // X.InterfaceC710490Rtv
    public final void LJI(Long l, String str) {
        ((C20018113Ud) LIZIZ.getValue()).LIZLLL = 0;
        C20018013Uc c20018013Uc = LIZ;
        LJII().storeInt("key_non_click_count", 0);
    }
}
