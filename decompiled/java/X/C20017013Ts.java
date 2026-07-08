package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.settings.EcProductAddConfig;
import java.util.List;

/* JADX INFO: renamed from: X.13Ts, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20017013Ts implements InterfaceC710490Rtv {
    public static final C20017013Ts LIZ = new C20017013Ts();
    public static int LIZIZ = new EcProductAddConfig(false, 7, 7, 10, 30).departureDisplayCountWithoutClick;
    public static long LIZJ = ((long) new EcProductAddConfig(false, 7, 7, 10, 30).departureIntervalDay) * 86400000;
    public static int LIZLLL = new EcProductAddConfig(false, 7, 7, 10, 30).displayDailyMaxCount;
    public static long LJ = ((long) new EcProductAddConfig(false, 7, 7, 10, 30).displayMinTimerIntervalMinutes) * 60000;
    public static C20017213Tu LJFF;

    @Override // X.InterfaceC710490Rtv
    public final void LIZ() {
    }

    @Override // X.InterfaceC710490Rtv
    public final void LIZJ(Long l) {
    }

    @Override // X.InterfaceC710490Rtv
    public final List<String> LIZLLL() {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC710490Rtv
    public final boolean LJ(Long l) {
        try {
            return ((Boolean) C23250099c.LJ(C23271099x.INSTANCE, new C05KG(null))).booleanValue();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return true;
        }
    }

    @Override // X.InterfaceC710490Rtv
    public final void LJFF(Context context) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C05KJ(context, null), 3);
        EcProductAddConfig ecProductAddConfigLIZ = C20017113Tt.LIZ();
        LIZIZ = ecProductAddConfigLIZ.departureDisplayCountWithoutClick;
        LIZJ = ((long) ecProductAddConfigLIZ.departureIntervalDay) * 86400000;
        LIZLLL = ecProductAddConfigLIZ.displayDailyMaxCount;
        LJ = ((long) ecProductAddConfigLIZ.displayMinTimerIntervalMinutes) * 60000;
    }

    @Override // X.InterfaceC710490Rtv
    public final void LIZIZ(Long l, String str) {
        if (l != null) {
            l.longValue();
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C20016913Tr(l, null), 3);
        }
    }

    @Override // X.InterfaceC710490Rtv
    public final void LJI(Long l, String str) {
        if (l != null) {
            l.longValue();
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C20016813Tq(l, null), 3);
        }
    }
}
