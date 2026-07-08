package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0RyI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C713200RyI {
    /* JADX WARN: Multi-variable type inference failed */
    public static <CURSOR> boolean LIZ(IStoryFeedUserDataAbility<CURSOR> iStoryFeedUserDataAbility) {
        InterfaceC636270OxV interfaceC636270OxV;
        AbstractC1623806Xk<C626160OhC> refreshState;
        C626160OhC c626160OhCLIZ;
        if ((iStoryFeedUserDataAbility instanceof AssemListViewModel) && (interfaceC636270OxV = (InterfaceC636270OxV) ((AssemViewModel) iStoryFeedUserDataAbility).getState()) != null && (refreshState = interfaceC636270OxV.getRefreshState()) != null && (c626160OhCLIZ = refreshState.LIZ()) != null && c626160OhCLIZ.LIZIZ) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <CURSOR> boolean LIZIZ(IStoryFeedUserDataAbility<CURSOR> iStoryFeedUserDataAbility) {
        InterfaceC636270OxV interfaceC636270OxV;
        AbstractC1623806Xk<C626160OhC> loadMoreState = null;
        if ((iStoryFeedUserDataAbility instanceof AssemListViewModel) && (interfaceC636270OxV = (InterfaceC636270OxV) ((AssemViewModel) iStoryFeedUserDataAbility).getState()) != null) {
            loadMoreState = interfaceC636270OxV.getLoadMoreState();
        }
        return loadMoreState instanceof C1623606Xi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <CURSOR> boolean LIZJ(IStoryFeedUserDataAbility<CURSOR> iStoryFeedUserDataAbility) {
        InterfaceC636270OxV interfaceC636270OxV;
        AbstractC1623806Xk<C626160OhC> loadMoreState = null;
        if ((iStoryFeedUserDataAbility instanceof AssemListViewModel) && (interfaceC636270OxV = (InterfaceC636270OxV) ((AssemViewModel) iStoryFeedUserDataAbility).getState()) != null) {
            loadMoreState = interfaceC636270OxV.getLoadMoreState();
        }
        if ((loadMoreState instanceof C1623606Xi) && iStoryFeedUserDataAbility.Hu1()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <CURSOR> void LIZLLL(IStoryFeedUserDataAbility<CURSOR> iStoryFeedUserDataAbility, int i) {
        AssemSingleListViewModel assemSingleListViewModel;
        InterfaceC636270OxV interfaceC636270OxV;
        Object c098200Yq;
        AbstractC1623806Xk<C626160OhC> refreshState = null;
        if ((iStoryFeedUserDataAbility instanceof AssemListViewModel) && (assemSingleListViewModel = (AssemSingleListViewModel) iStoryFeedUserDataAbility) != null) {
            S state = assemSingleListViewModel.getState();
            if (state instanceof InterfaceC636340Oxc) {
                interfaceC636270OxV = (InterfaceC636270OxV) state;
                if (interfaceC636270OxV != null) {
                    refreshState = interfaceC636270OxV.getRefreshState();
                }
            } else {
                interfaceC636270OxV = null;
            }
            if (!(refreshState instanceof C1623606Xi)) {
                return;
            }
            C626160OhC c626160OhCLIZ = interfaceC636270OxV.getRefreshState().LIZ();
            if (c626160OhCLIZ != null && !c626160OhCLIZ.LIZIZ) {
                return;
            }
            C626160OhC c626160OhCLIZ2 = interfaceC636270OxV.getLoadMoreState().LIZ();
            if ((c626160OhCLIZ2 != null && !c626160OhCLIZ2.LIZIZ) || iStoryFeedUserDataAbility.mB0()) {
                return;
            }
            iStoryFeedUserDataAbility.W20();
            if (iStoryFeedUserDataAbility.UW1() - i <= ((Number) C036W.LIZ.getValue()).intValue()) {
                try {
                    iStoryFeedUserDataAbility.yA1(true);
                    assemSingleListViewModel.manualListLoadMore(iStoryFeedUserDataAbility.bK2());
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    iStoryFeedUserDataAbility.yA1(false);
                }
            }
        }
    }
}
