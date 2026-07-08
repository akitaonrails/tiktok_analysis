package X;

import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAvatarConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3GuestMonitoringTipsSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0aWm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C938420aWm extends C2217421BqW implements Function1<List<? extends UserState>, Unit> {
    public C938420aWm(Object obj) {
        super(1, obj, C938400aWk.class, "onUserStateChanged", "onUserStateChanged(Ljava/util/List;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends UserState> list) {
        Object c098200Yq;
        List<? extends UserState> list2 = list;
        C938400aWk c938400aWk = (C938400aWk) this.receiver;
        c938400aWk.getClass();
        Map<String, Object> map = C1338270kvh.LIZ;
        try {
            if (MultiGuestV3GuestMonitoringTipsSetting.INSTANCE.getShowNetworkTip()) {
                c938400aWk.LJII(list2);
            }
            c938400aWk.LJIIIIZZ(list2);
            c938400aWk.LJIIIZ(list2);
            c938400aWk.LJ(list2);
            if (C936430aTZ.LIZ()) {
                c938400aWk.LJIIJ(list2);
            }
            if (MultiGuestAvatarConfigSetting.INSTANCE.getValue().enable) {
                c938400aWk.LJI(list2);
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("------------------- on Error: \n ");
            sbLIZ.append(thM5exceptionOrNullimpl);
            C2188811AlT.LIZIZ(sbLIZ);
            Map<String, Object> map2 = C1338270kvh.LIZ;
        }
        return Unit.LIZ;
    }
}
