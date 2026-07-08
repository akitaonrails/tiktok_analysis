package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.ability.ISeaLiveContextAbility;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.communication.action.SeaLiveActionRegisterManager$initLifecycle$1$1;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS268S0000000_26;

/* JADX INFO: renamed from: X.0vD5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1733450vD5 {
    public final ISeaLiveContextAbility LIZ;
    public final InterfaceC600380Ngi LIZIZ;

    public C1733450vD5(ISeaLiveContextAbility iSeaLiveContextAbility) {
        Unit unit;
        Lifecycle lifecycle;
        this.LIZ = iSeaLiveContextAbility;
        this.LIZIZ = iSeaLiveContextAbility.Cm0();
        try {
            Fragment fragmentTY0 = iSeaLiveContextAbility.tY0();
            if (fragmentTY0 != null && (lifecycle = fragmentTY0.getLifecycle()) != null) {
                lifecycle.addObserver(new SeaLiveActionRegisterManager$initLifecycle$1$1(this));
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        for (Map.Entry entry : C2097608Jq.LJIIIIZZ(new Pair("ecLivePinCardHandleDismissAction", AFwS268S0000000_26.get$arr$(570)), new Pair("ecLiveOpenLiveBagAction", AFwS268S0000000_26.get$arr$(571)), new Pair("ecLiveHandleFollowAnimAction", AFwS268S0000000_26.get$arr$(572)), new Pair("ecLivePinCardDelayEventAction", AFwS268S0000000_26.get$arr$(573)), new Pair("ecLiveBillboardEditAction", AFwS268S0000000_26.get$arr$(574)), new Pair("ecLiveChooseImageAction", AFwS268S0000000_26.get$arr$(575)), new Pair("ecLiveClosePopupAction", AFwS268S0000000_26.get$arr$(576))).entrySet()) {
            String str = (String) entry.getKey();
            Function1 function1 = (Function1) entry.getValue();
            InterfaceC600380Ngi interfaceC600380Ngi = this.LIZIZ;
            ISeaLiveContextAbility iSeaLiveContextAbility2 = this.LIZ;
            interfaceC600380Ngi.Pd(iSeaLiveContextAbility2, str, (Function0) function1.invoke(iSeaLiveContextAbility2));
        }
    }
}
