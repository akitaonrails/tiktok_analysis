package com.bytedance.android.live.walletnew;

import X.AbstractC1568580qvA;
import X.C01GW;
import X.C098200Yq;
import X.C0IJT;
import X.C0QSJ;
import X.C1121450fHz;
import X.C1123320fL0;
import X.C1126800fQc;
import X.C1134860fdc;
import X.C1161920gLG;
import X.C12ES;
import X.C1323690kYB;
import X.C1388190mED;
import X.C13LE;
import X.C1548820qPI;
import X.C1567220qsy;
import X.C1568560qv8;
import X.C158B;
import X.C1685300txQ;
import X.C16F5;
import X.C16FV;
import X.C1776960wLG;
import X.C1777440wM2;
import X.C1796560wqs;
import X.C1797200wru;
import X.C1797270ws1;
import X.C1802770x0t;
import X.C1803540x28;
import X.C1803550x29;
import X.C1803800x2Y;
import X.C1803830x2b;
import X.C1803840x2c;
import X.C1804030x2v;
import X.C1804110x33;
import X.C1804840x4E;
import X.C1804850x4F;
import X.C1804990x4T;
import X.C1805180x4m;
import X.C1805240x4s;
import X.C1805270x4v;
import X.C1805720x5e;
import X.C1805810x5n;
import X.C1805830x5p;
import X.C1805840x5q;
import X.C1806160x6M;
import X.C1806600x74;
import X.C1806610x75;
import X.C1806690x7D;
import X.C1806860x7U;
import X.C1807180x80;
import X.C1807890x99;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C1AF0;
import X.C21578619ce;
import X.C2217381BqS;
import X.C292401Bi;
import X.C419090Gbz;
import X.C439101nJ;
import X.C452501pT;
import X.C466310IQj;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C673150Qan;
import X.C687700QyG;
import X.C749790Tb7;
import X.C786410Ut5;
import X.DialogC780480UjW;
import X.EnumC1121470fI1;
import X.EnumC1802790x0v;
import X.EnumC1803160x1W;
import X.EnumC1804100x32;
import X.InterfaceC1133710fbl;
import X.InterfaceC1146704e9;
import X.InterfaceC1803460x20;
import X.InterfaceC1805160x4k;
import X.InterfaceC1806230x6T;
import X.InterfaceC1806410x6l;
import X.InterfaceC1807440x8Q;
import X.InterfaceC1870830ymf;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC737790Swr;
import Y.ACListenerS161S0100000_27;
import Y.AObserverS187S0200000_27;
import Y.AObserverS229S0100000_27;
import Y.ARunnableS35S0400000_27;
import Y.ARunnableS60S0300000_27;
import Y.ARunnableS96S0200000_27;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.infrastructure.dialog.DelayLoadingDialog;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.model.ExchangeDisplayInfo;
import com.bytedance.android.live.wallet.model.recharge.RechargeRequestParams;
import com.bytedance.android.live.wallet.view.recharge.BaseRechargeFragment;
import com.bytedance.android.live.wallet.viewmodel.recharge.component.banner.RechargeBannerViewModel;
import com.bytedance.android.live.wallet.viewmodel.recharge.component.banner.VaultRechargeUnlockGiftViewModel;
import com.bytedance.android.live.walletclean.presentation.assem.WalletRechargePanelScope;
import com.bytedance.android.live.walletclean.presentation.assem.body.view.RechargePanelBodyAssemAbility;
import com.bytedance.android.live.walletclean.presentation.assem.body.view.RechargePanelBodyDialogAbility;
import com.bytedance.android.live.walletclean.presentation.assem.header.view.RechargePanelHeaderAssemAbility;
import com.bytedance.android.live.walletclean.presentation.assem.header.view.RechargePanelHeaderDialogAbility;
import com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService;
import com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model.RechargeBannerMetaData;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargePanelHeaderRefactorSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargePanelRefactorSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletLoadingIndicatorSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletNewRechargeLatencyTrackingEnabledSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletRechargeCancelRetentionConfig;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdk.wallet.NoticesResult;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.SmartRouter;
import com.bytedance.tracking.TrackingEventV3Data;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import webcast.api.first_recharge.GetFirstRechargeInfoV2Resp;
import webcast.api.profit.IapListResult;
import wh6.AbS703S0100000_24;

/* JADX INFO: loaded from: classes28.dex */
public final class RechargeDialogNew extends BaseRechargeFragment implements InterfaceC1803460x20, RechargePanelBodyDialogAbility, RechargePanelHeaderDialogAbility, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public static final C1804030x2v LLLLIIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLIILL;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiHELIOSPi4/JCA4JyokZhcpKicyOiIpDSYyJCorByok";
    public LinearLayout LL;
    public TuxTextView LLILLJJLI;
    public FrameLayout LLILLL;
    public TuxTextView LLILZ;
    public TuxIconView LLILZIL;
    public TuxIconView LLILZLL;
    public View LLIZ;
    public C16F5 LLIZLLLIL;
    public LiveIconView LLJ;
    public C197039127h LLJI;
    public C16F5 LLJIJIL;
    public C16FV LLJILJIL;
    public C21578619ce LLJILJILJ;
    public View LLJILLL;
    public View LLJJ;
    public LinearLayout LLJJI;
    public ViewStub LLJJIII;
    public C16F5 LLJJIJI;
    public C16F5 LLJJIJIIJIL;
    public C16F5 LLJJIJIL;
    public C16F5 LLJJJ;
    public C16FV LLJJJIL;
    public TuxTextView LLJJJJ;
    public TuxIconView LLJJJJJIL;
    public C21578619ce LLJJJJLIIL;
    public ViewStub LLJJL;
    public ViewStub LLJJLIIIJLLLLLLLZ;
    public ConstraintLayout LLJL;
    public Context LLJLL;
    public InterfaceC1806230x6T LLJLLIL;
    public C1803830x2b LLJLLL;
    public DataChannel LLJZ;
    public InterfaceC1805160x4k LLJZIJLIL;
    public C1807180x80 LLL;
    public ViewGroup LLLF;
    public C1805270x4v LLLFF;
    public DelayLoadingDialog LLLFZ;
    public C1805830x5p LLLI;
    public boolean LLLII;
    public boolean LLLIIIIL;
    public C1805810x5n LLLIIIL;
    public C1805720x5e LLLIIL;
    public final RechargeBannerMetaData LLLIILIL;
    public final RechargeDialogNew LLLIL;
    public final RechargeDialogNew LLLILZ;
    public final C1805180x4m LLLILZJ;
    public volatile RechargePanelBodyAssemAbility LLLILZLLLI;
    public volatile RechargePanelHeaderAssemAbility LLLIZZ;
    public RechargePanelBodyAssemAbility LLLJ;
    public RechargePanelBodyDialogAbility LLLJIL;
    public RechargePanelHeaderAssemAbility LLLJL;
    public RechargePanelHeaderDialogAbility LLLL;
    public InterfaceC665370Q7z LLLLII;
    public C0QSJ LLLLIIIILLL;
    public final C01GW LLJLIL = C292401Bi.LIZ(new AwS571S0100000_27(this, 140));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 137));
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 130));
    public final C1805240x4s LLLIIII = new C1805240x4s(new AwS571S0100000_27(this, 131), new AwS571S0100000_27(this, 132));

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0x2v] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RechargeDialogNew.class, "panelDialogAbility", "getPanelDialogAbility$livewallet_impl_release()Lcom/bytedance/android/live/walletclean/presentation/assem/body/view/RechargePanelBodyAssemAbility;", 0);
        C13LE.LIZ.getClass();
        LLLLIILL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(RechargeDialogNew.class, "headerAssemAbility", "getHeaderAssemAbility()Lcom/bytedance/android/live/walletclean/presentation/assem/header/view/RechargePanelHeaderAssemAbility;", 0)};
        LLLLIIL = new Object() { // from class: X.0x2v
        };
    }

    public final boolean ES() {
        if (GS(true)) {
            return false;
        }
        Context context = this.LLJLL;
        Diamond value = qS().LLLLIILL.getValue();
        if (value == null) {
            return false;
        }
        long jCurrentTimeMillis = qS().LLLIIL != 0 ? System.currentTimeMillis() - qS().LLLIIL : 0L;
        if (qS().LLLIIIL || jCurrentTimeMillis <= LiveWalletRechargeCancelRetentionConfig.INSTANCE.getValue().rechargePageStayMinDuration * LSPassThroughRecordSizeConfig.DEFAULT) {
            return false;
        }
        RechargeViewModel rechargeViewModelQS = qS();
        C1803830x2b c1803830x2b = this.LLJLLL;
        int i = (c1803830x2b == null ? null : c1803830x2b).LJ;
        String str = (c1803830x2b == null ? null : c1803830x2b).LIZLLL;
        String str2 = (c1803830x2b == null ? null : c1803830x2b).LJIIL;
        if (c1803830x2b == null) {
            c1803830x2b = null;
        }
        Boolean boolValueOf = Boolean.valueOf(C1803840x2c.LIZIZ(c1803830x2b.LJ));
        C1126800fQc.LIZ.py();
        C1134860fdc c1134860fdc = C1134860fdc.LIZ;
        C1803830x2b c1803830x2b2 = this.LLJLLL;
        if (c1803830x2b2 == null) {
            c1803830x2b2 = null;
        }
        int iLIZIZ = c1134860fdc.LIZIZ(c1803830x2b2.LJ, 0);
        VaultRechargeUnlockGiftViewModel vaultRechargeUnlockGiftViewModel = qS().LLLIL;
        RechargeRequestParams rechargeRequestParamsBQ2 = rechargeViewModelQS.BQ2(value, i, null, str, str2, boolValueOf, iLIZIZ, vaultRechargeUnlockGiftViewModel != null ? vaultRechargeUnlockGiftViewModel.LL : null, null);
        RechargeViewModel rechargeViewModelQS2 = qS();
        EnumC1802790x0v enumC1802790x0v = EnumC1802790x0v.EXIT_RECHARGE_PANEL;
        long j = qS().LLLIIL;
        C1803830x2b c1803830x2b3 = this.LLJLLL;
        return C1802770x0t.LIZIZ(context, rechargeViewModelQS2.zQ2(enumC1802790x0v, j, rechargeRequestParamsBQ2, c1803830x2b3 != null ? c1803830x2b3 : null, 0L, qS().LLLIIIIL));
    }

    @Override // com.bytedance.android.live.walletclean.presentation.assem.body.view.RechargePanelBodyDialogAbility
    public final void aG() {
        zz(0, 0, 0, null, null, null, false);
        throw null;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == RechargePanelBodyAssemAbility.class) {
            this.LLLJ = (RechargePanelBodyAssemAbility) obj;
        } else if (cls == RechargePanelBodyDialogAbility.class) {
            this.LLLJIL = (RechargePanelBodyDialogAbility) obj;
        } else if (cls == RechargePanelHeaderAssemAbility.class) {
            this.LLLJL = (RechargePanelHeaderAssemAbility) obj;
        } else if (cls == RechargePanelHeaderDialogAbility.class) {
            this.LLLL = (RechargePanelHeaderDialogAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{WalletRechargePanelScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == RechargePanelBodyAssemAbility.class) {
            return this.LLLJ;
        }
        if (cls == RechargePanelBodyDialogAbility.class) {
            return this.LLLJIL;
        }
        if (cls == RechargePanelHeaderAssemAbility.class) {
            return this.LLLJL;
        }
        if (cls == RechargePanelHeaderDialogAbility.class) {
            return this.LLLL;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(WalletRechargePanelScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(WalletRechargePanelScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == RechargePanelBodyAssemAbility.class) {
            this.LLLJ = null;
        } else if (cls == RechargePanelBodyDialogAbility.class) {
            this.LLLJIL = null;
        } else if (cls == RechargePanelHeaderAssemAbility.class) {
            this.LLLJL = null;
        } else if (cls == RechargePanelHeaderDialogAbility.class) {
            this.LLLL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC1803460x20
    public final void L0() {
        DelayLoadingDialog delayLoadingDialog = this.LLLFZ;
        if (delayLoadingDialog != null) {
            delayLoadingDialog.LIZIZ.removeMessages(10);
            C500260Jjc.LJJLIIIJL(delayLoadingDialog.LIZ);
        }
    }

    public final C0QSJ SR() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLLLIIIILLL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLLII;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLLLII = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{WalletRechargePanelScope.class});
        this.LLLLIIIILLL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final C1805840x5q VR() {
        return (C1805840x5q) this.LLLFFI.getValue();
    }

    @Override // X.InterfaceC1803460x20
    public final void Vc() {
        InterfaceC1805160x4k interfaceC1805160x4k = this.LLJZIJLIL;
        if (interfaceC1805160x4k == null) {
            interfaceC1805160x4k = null;
        }
        interfaceC1805160x4k.dismiss();
    }

    public final C197039127h WR() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.dol) : null;
            this.LLJI = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C21578619ce ZR() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.eua) : null;
            this.LLJILJILJ = (C21578619ce) viewFindViewById;
        }
        return (C21578619ce) viewFindViewById;
    }

    public final C16F5 aS() {
        View viewFindViewById = this.LLJJJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.h7q) : null;
            this.LLJJJ = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    public final TuxIconView bS() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.how) : null;
            this.LLILZIL = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final RechargePanelHeaderAssemAbility cS() {
        RechargePanelHeaderAssemAbility rechargePanelHeaderAssemAbility = this.LLLIZZ;
        if (rechargePanelHeaderAssemAbility == null) {
            synchronized (this) {
                rechargePanelHeaderAssemAbility = this.LLLIZZ;
                if (rechargePanelHeaderAssemAbility == null) {
                    C0QSJ c0qsjSR = SR();
                    RechargePanelHeaderAssemAbility rechargePanelHeaderAssemAbility2 = c0qsjSR != null ? (RechargePanelHeaderAssemAbility) c0qsjSR.getAbility(RechargePanelHeaderAssemAbility.class) : null;
                    this.LLLIZZ = rechargePanelHeaderAssemAbility2;
                    return rechargePanelHeaderAssemAbility2;
                }
            }
        }
        return rechargePanelHeaderAssemAbility;
    }

    public final LinearLayout dS() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.nch) : null;
            this.LL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final RechargePanelBodyAssemAbility gS() {
        RechargePanelBodyAssemAbility rechargePanelBodyAssemAbility = this.LLLILZLLLI;
        if (rechargePanelBodyAssemAbility == null) {
            synchronized (this) {
                rechargePanelBodyAssemAbility = this.LLLILZLLLI;
                if (rechargePanelBodyAssemAbility == null) {
                    C0QSJ c0qsjSR = SR();
                    RechargePanelBodyAssemAbility rechargePanelBodyAssemAbility2 = c0qsjSR != null ? (RechargePanelBodyAssemAbility) c0qsjSR.getAbility(RechargePanelBodyAssemAbility.class) : null;
                    this.LLLILZLLLI = rechargePanelBodyAssemAbility2;
                    return rechargePanelBodyAssemAbility2;
                }
            }
        }
        return rechargePanelBodyAssemAbility;
    }

    public final TuxIconView hS() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sly) : null;
            this.LLILZLL = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final View iS() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sm6) : null;
            this.LLIZ = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final C21578619ce kS() {
        View viewFindViewById = this.LLJJJJLIIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.w0r) : null;
            this.LLJJJJLIIL = (C21578619ce) viewFindViewById;
        }
        return (C21578619ce) viewFindViewById;
    }

    public final TuxTextView mS() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.title) : null;
            this.LLILZ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final C16F5 nS() {
        View viewFindViewById = this.LLJJIJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.zij) : null;
            this.LLJJIJI = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    public final TuxTextView oS() {
        View viewFindViewById = this.LLJJJJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.zl0) : null;
            this.LLJJJJ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    @Override // com.bytedance.android.live.walletclean.presentation.assem.body.view.RechargePanelBodyDialogAbility
    public final void om2() {
        InterfaceC1806230x6T interfaceC1806230x6T = this.LLJLLIL;
        if (interfaceC1806230x6T != null) {
            interfaceC1806230x6T.LIZJ();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        if (LiveWalletLoadingIndicatorSetting.INSTANCE.getValue()) {
            L0();
            this.LLLFZ = null;
        }
        qS().onDestroy();
        C1805720x5e c1805720x5e = this.LLLIIL;
        if (c1805720x5e != null) {
            C1548820qPI.LJIIIIZZ("email_notif_activated", c1805720x5e.LIZLLL);
        }
        C1805810x5n c1805810x5n = this.LLLIIIL;
        if (c1805810x5n != null) {
            c1805810x5n.LIZIZ.vQ2().removeObserver((Observer) c1805810x5n.LIZLLL.getValue());
        }
        C1805240x4s c1805240x4s = this.LLLIIII;
        C466310IQj c466310IQj = c1805240x4s.LJII;
        if (c466310IQj != null) {
            c466310IQj.LIZ();
        }
        c1805240x4s.LJIIIZ.LJ();
        super.onDestroy();
        DataChannelGlobal.LLILZ.zQ2(this);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        if (LiveWalletLoadingIndicatorSetting.INSTANCE.getValue()) {
            L0();
            this.LLLFZ = null;
        }
        super.onDestroyView();
        qS().onDestroy();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = null;
        this.LLJJI = null;
        this.LLJJIII = null;
        this.LLJJIJI = null;
        this.LLJJIJIIJIL = null;
        this.LLJJIJIL = null;
        this.LLJJJ = null;
        this.LLJJJIL = null;
        this.LLJJJJ = null;
        this.LLJJJJJIL = null;
        this.LLJJJJLIIL = null;
        this.LLJJL = null;
        this.LLJL = null;
        this.LLJJLIIIJLLLLLLLZ = null;
        VR().LIZLLL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        if (C1803550x29.LIZ) {
            C1803550x29.LJIILJJIL = true;
            C1803540x28.LJ();
        }
        super.onStop();
    }

    public final RechargeViewModel qS() {
        return (RechargeViewModel) this.LLJLIL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void wS() {
        C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
        DataChannel dataChannel = this.LLJZ;
        int iFR2 = qS().fR2();
        int i = qS().LLLFFI;
        C1803830x2b c1803830x2b = this.LLJLLL;
        if (c1803830x2b == null) {
            c1803830x2b = null;
        }
        Map<String, String> map = c1803830x2b.LIZJ;
        Integer numValueOf = Integer.valueOf(qS().YQ2());
        c1803800x2Y.getClass();
        boolean zLJIIZILJ = C500260Jjc.LJIIZILJ(dataChannel);
        ExchangeDisplayInfo exchangeDisplayInfoKL2 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().kL2();
        int iLJIJI = zLJIIZILJ;
        iLJIJI = zLJIIZILJ;
        if (dataChannel == null && map != null) {
            iLJIJI = zLJIIZILJ;
            if (map.containsKey("is_anchor")) {
                iLJIJI = u.LJIJI(map.get("is_anchor"), "1", false);
            }
        }
        if (iFR2 != 0) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_exchange_entrance_show");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII("live_detail", "request_page");
            c474500IjALIZ.LJJII(iFR2 == -1 ? "ug_exchange" : "anchor_income", "charge_reason");
            c474500IjALIZ.LJJII(Integer.valueOf(i == 2 ? 1 : 0), "could_exchange");
            c474500IjALIZ.LJJII(Integer.valueOf(iLJIJI), "is_anchor");
            c474500IjALIZ.LJJII(C1803800x2Y.LJIILJJIL(), "is_first_recharge");
            c474500IjALIZ.LJJII(C1803800x2Y.LJIIL(numValueOf), "strategy_task_type");
            c474500IjALIZ.LJJII("package", "first_recharge_exchange_entrance_page");
            c474500IjALIZ.LJJII(Integer.valueOf(!exchangeDisplayInfoKL2.isFirstExchange ? 1 : 0), "is_exchange_before");
            c474500IjALIZ.LJJII(Integer.valueOf(exchangeDisplayInfoKL2.LIZ() ? 1 : 0), "is_tax_info_finished");
            c474500IjALIZ.LIZ();
        }
        if (qS().fR2() != 0) {
            qS().nR2();
        }
    }

    public final void yS() {
        int i;
        C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
        C1803830x2b c1803830x2b = this.LLJLLL;
        if (c1803830x2b == null) {
            c1803830x2b = null;
        }
        DataChannel dataChannel = this.LLJZ;
        Diamond diamond = qS().LLLLIIL;
        boolean zFQ2 = qS().FQ2();
        RechargeViewModel rechargeViewModelQS = qS();
        boolean z = rechargeViewModelQS.fR2() == -2 || rechargeViewModelQS.fR2() == -1;
        C1806860x7U c1806860x7UAR2 = qS().aR2();
        Diamond value = qS().LLLLIILL.getValue();
        Map<String, String> mapLIZIZ = c1806860x7UAR2.LIZIZ(value != null && value.LIZIZ(), true, false);
        TrackingEventV3Data trackingEventV3DataOg1 = qS().og1(false);
        Map<String, String> mapLIZ = trackingEventV3DataOg1 != null ? trackingEventV3DataOg1.LIZ() : null;
        int iZQ2 = qS().ZQ2();
        List<Diamond> listVQ2 = qS().VQ2();
        if ((listVQ2 instanceof Collection) && listVQ2.isEmpty()) {
            i = 0;
        } else {
            Iterator<Diamond> it2 = listVQ2.iterator();
            while (it2.hasNext()) {
                if (!r2.iR2(C1804850x4F.LJFF(it2.next()))) {
                    i = 1;
                    break;
                }
            }
            i = 0;
        }
        c1803800x2Y.getClass();
        C1803800x2Y.LJJJJ(c1803830x2b, dataChannel, diamond, zFQ2, z, mapLIZIZ, mapLIZ, iZQ2, i);
    }

    public RechargeDialogNew() {
        C1126800fQc.LIZ.GN();
        C1123320fL0 c1123320fL0LIZIZ = C1121450fHz.LIZIZ(EnumC1121470fI1.RECHARGE_BANNER_TP.getType());
        this.LLLIILIL = c1123320fL0LIZIZ != null ? (RechargeBannerMetaData) c1123320fL0LIZIZ.LIZLLL : null;
        this.LLLIL = this;
        this.LLLILZ = this;
        this.LLLILZJ = new C1805180x4m(this);
    }

    public final void BS() {
        FragmentManager supportFragmentManager;
        C19EG activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        try {
            IWalletService iWalletService = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
            Context context = this.LLJLL;
            InterfaceC1806230x6T interfaceC1806230x6T = this.LLJLLIL;
            Bundle arguments = getArguments();
            C1803830x2b c1803830x2b = this.LLJLLL;
            if (c1803830x2b == null) {
                c1803830x2b = null;
            }
            DialogFragment dialogFragmentCreateRechargeDialogFragment = iWalletService.createRechargeDialogFragment(context, interfaceC1806230x6T, arguments, c1803830x2b);
            if (dialogFragmentCreateRechargeDialogFragment != null) {
                dialogFragmentCreateRechargeDialogFragment.showNow(supportFragmentManager, "SwitchFromLandscape");
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
    }

    @Override // X.InterfaceC1803460x20
    public final void LJ() {
        C749790Tb7 c749790Tb7;
        View view = getView();
        if (view == null || (c749790Tb7 = (C749790Tb7) view.findViewById(R.id.w28)) == null) {
            return;
        }
        c749790Tb7.LIZLLL();
    }

    @Override // X.InterfaceC1803460x20
    public final void LJIIL() {
        C749790Tb7 c749790Tb7;
        View view = getView();
        if (view != null && (c749790Tb7 = (C749790Tb7) view.findViewById(R.id.w28)) != null) {
            c749790Tb7.LIZ();
        }
        if (C1806160x6M.LIZ()) {
            View view2 = getView();
            C500260Jjc.LJIILIIL(view2 != null ? view2.findViewById(R.id.w28) : null);
        }
    }

    public final void NR() {
        String hash;
        if (qS().jR2()) {
            InterfaceC1805160x4k interfaceC1805160x4k = this.LLJZIJLIL;
            if (interfaceC1805160x4k == null) {
                interfaceC1805160x4k = null;
            }
            interfaceC1805160x4k.dismissAllowingStateLoss();
            if (!C1797270ws1.LIZLLL().LIZ(getActivity(), getArguments(), null)) {
                C1797270ws1.LIZLLL().LJ(this.LLJLL, getArguments());
            }
            C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
            String strXQ2 = qS().XQ2();
            String strER2 = qS().eR2();
            C1804110x33 c1804110x33 = EnumC1804100x32.Companion;
            Integer numValueOf = Integer.valueOf(qS().YQ2());
            boolean zCanRedirectRechargeV3 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).canRedirectRechargeV3();
            boolean zIsV3Phase2 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).isV3Phase2(qS().YQ2());
            c1804110x33.getClass();
            EnumC1804100x32 enumC1804100x32LIZ = C1804110x33.LIZ(zCanRedirectRechargeV3, numValueOf, zIsV3Phase2);
            c1803800x2Y.getClass();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_iap_recharge_go_back_click");
            c474500IjALIZ.LJJII(strXQ2, "charge_reason");
            c474500IjALIZ.LJJII(strER2, "request_page");
            if (enumC1804100x32LIZ != null && (hash = enumC1804100x32LIZ.getHash()) != null) {
                c474500IjALIZ.LJJII(hash, "charge_from");
            }
            c474500IjALIZ.LIZ();
        }
    }

    public final int OR() {
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        View viewFindViewById4;
        View viewFindViewById5;
        View viewFindViewById6;
        View viewFindViewById7;
        View viewFindViewById8;
        View view;
        View viewFindViewById9;
        View viewFindViewById10;
        if (!qS().lR2()) {
            View view2 = getView();
            if (view2 == null || (viewFindViewById = view2.findViewById(R.id.t0q)) == null) {
                return 0;
            }
            return viewFindViewById.getHeight();
        }
        int iLIZIZ = (int) C497740JfY.LIZIZ(488.0f);
        View view3 = getView();
        int height = ((view3 == null || (viewFindViewById10 = view3.findViewById(R.id.y08)) == null) ? 0 : viewFindViewById10.getHeight()) + ((!LiveRechargePanelHeaderRefactorSetting.INSTANCE.getValue() || (view = getView()) == null || (viewFindViewById9 = view.findViewById(R.id.sw6)) == null) ? 0 : viewFindViewById9.getHeight());
        View view4 = getView();
        int height2 = height + ((view4 == null || (viewFindViewById8 = view4.findViewById(R.id.ika)) == null) ? 0 : viewFindViewById8.getHeight());
        View view5 = getView();
        int iLIZIZ2 = height2 + ((view5 == null || (viewFindViewById7 = view5.findViewById(R.id.ika)) == null || viewFindViewById7.getHeight() != 0) ? (int) C497740JfY.LIZIZ(28.0f) : 0);
        View view6 = getView();
        int height3 = iLIZIZ2 + ((view6 == null || (viewFindViewById6 = view6.findViewById(R.id.i0i)) == null) ? 0 : viewFindViewById6.getHeight());
        View view7 = getView();
        int iLIZIZ3 = height3 + (C500260Jjc.LJJJJIZL(view7 != null ? view7.findViewById(R.id.i0i) : null) ? (int) C497740JfY.LIZIZ(17.0f) : 0);
        View view8 = getView();
        int height4 = iLIZIZ3 + ((view8 == null || (viewFindViewById5 = view8.findViewById(R.id.fou)) == null) ? 0 : viewFindViewById5.getHeight());
        View view9 = getView();
        int height5 = height4 + ((view9 == null || (viewFindViewById4 = view9.findViewById(R.id.z8x)) == null) ? 0 : viewFindViewById4.getHeight());
        View view10 = getView();
        int iLIZIZ4 = height5 + (C500260Jjc.LJJJJIZL(view10 != null ? view10.findViewById(R.id.z8x) : null) ? (int) C497740JfY.LIZIZ(16.0f) : 0);
        View view11 = getView();
        int height6 = iLIZIZ4 + ((view11 == null || (viewFindViewById3 = view11.findViewById(R.id.amq)) == null) ? 0 : viewFindViewById3.getHeight());
        View view12 = getView();
        int height7 = height6 + ((view12 == null || (viewFindViewById2 = view12.findViewById(R.id.dol)) == null) ? 0 : viewFindViewById2.getHeight());
        View view13 = getView();
        return iLIZIZ - ((height7 + (C500260Jjc.LJJJJIZL(view13 != null ? view13.findViewById(R.id.dol) : null) ? (int) C497740JfY.LIZIZ(32.0f) : 0)) + ((int) C497740JfY.LIZIZ(16.0f)));
    }

    public final void PR() {
        if (C1806160x6M.LIZ()) {
            return;
        }
        if (qS().wR2()) {
            ACListenerS161S0100000_27 aCListenerS161S0100000_27 = new ACListenerS161S0100000_27(this, 26);
            C500260Jjc.LJLJLJ(oS(), true);
            View viewFindViewById = this.LLJJJJJIL;
            if (viewFindViewById == null) {
                View view = getView();
                viewFindViewById = view != null ? view.findViewById(R.id.lgg) : null;
                this.LLJJJJJIL = (TuxIconView) viewFindViewById;
            }
            C500260Jjc.LJLJLJ(viewFindViewById, true);
            C786410Ut5.h9(oS(), aCListenerS161S0100000_27);
        } else {
            C500260Jjc.LJLJLJ(oS(), false);
            View viewFindViewById2 = this.LLJJJJJIL;
            if (viewFindViewById2 == null) {
                View view2 = getView();
                viewFindViewById2 = view2 != null ? view2.findViewById(R.id.lgg) : null;
                this.LLJJJJJIL = (TuxIconView) viewFindViewById2;
            }
            C500260Jjc.LJLJLJ(viewFindViewById2, false);
        }
        InterfaceC1805160x4k interfaceC1805160x4k = this.LLJZIJLIL;
        (interfaceC1805160x4k != null ? interfaceC1805160x4k : null).qK(qS().wR2(), this.LLLIIIIL);
    }

    public final void UR() {
        C21578619ce c21578619ceKS = kS();
        if (c21578619ceKS != null) {
            C12ES.LJIILL(0, c21578619ceKS);
        }
        LinearLayout linearLayoutDS = dS();
        if (linearLayoutDS != null) {
            C439101nJ.LJI(linearLayoutDS);
        }
        qS().HQ2(null, EnumC1803160x1W.NON_USE, BaseRechargeViewModel.LLJJJ, 0);
    }

    @Override // com.bytedance.android.live.walletclean.presentation.assem.body.view.RechargePanelBodyDialogAbility
    public final Integer UX1() {
        View view = getView();
        if (view != null) {
            return Integer.valueOf(view.getHeight());
        }
        return null;
    }

    @Override // com.bytedance.android.live.walletclean.presentation.assem.body.view.RechargePanelBodyDialogAbility
    public final void iP2() {
        qS().LLLJL = true;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1803550x29.LJIIIZ = C158B.LIZ();
        if (LiveWalletNewRechargeLatencyTrackingEnabledSetting.INSTANCE.getValue()) {
            C1803550x29.LJIIJ = C158B.LIZ();
        }
    }

    public final void rS() {
        LifecycleOwner lifecycleOwner;
        Context context;
        C1805840x5q c1805840x5qVR = VR();
        View viewFindViewById = this.LLJJLIIIJLLLLLLLZ;
        ComponentCallbacks2 componentCallbacks2LIZ = null;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.bsk) : null;
            this.LLJJLIIIJLLLLLLLZ = (ViewStub) viewFindViewById;
        }
        ViewStub viewStub = (ViewStub) viewFindViewById;
        synchronized (c1805840x5qVR) {
            try {
                if (c1805840x5qVR.LIZIZ || viewStub == null) {
                    return;
                }
                c1805840x5qVR.LIZIZ = true;
                View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
                ViewGroup viewGroup = viewLJLLLL instanceof ViewGroup ? (ViewGroup) viewLJLLLL : null;
                c1805840x5qVR.LIZJ = viewGroup;
                if (viewGroup != null && (context = viewGroup.getContext()) != null) {
                    componentCallbacks2LIZ = C1388190mED.LIZ(context);
                }
                if ((componentCallbacks2LIZ instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) componentCallbacks2LIZ) != null) {
                    ((RechargeBannerViewModel) c1805840x5qVR.LJ.getValue()).LL.observe(lifecycleOwner, new AObserverS229S0100000_27(c1805840x5qVR, 40));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void sS() {
        if (qS().WQ2() == 3) {
            C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
            DataChannel dataChannel = this.LLJZ;
            C1803830x2b c1803830x2b = this.LLJLLL;
            if (c1803830x2b == null) {
                c1803830x2b = null;
            }
            Map<String, String> map = c1803830x2b.LIZJ;
            c1803800x2Y.getClass();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_kyc_incentive_banner_show");
            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
            c474500IjALIZ.LJJII("recharge_incentive", "page_type");
            c474500IjALIZ.LJJII("room_recharge", "popup_entrance");
            c474500IjALIZ.LJJIIZI(map);
            c474500IjALIZ.LJIJJLI(dataChannel);
            c474500IjALIZ.LIZ();
        }
    }

    public final void uS() {
        GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV2 firstRechargeCampaignV2;
        Long lValueOf;
        qS().getClass();
        C01GW<InterfaceC1133710fbl> c01gw = C1805240x4s.LJIIJ;
        if (C1804990x4T.LIZIZ()) {
            C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
            DataChannel dataChannel = this.LLJZ;
            C1803830x2b c1803830x2b = this.LLJLLL;
            Integer numValueOf = null;
            if (c1803830x2b == null) {
                c1803830x2b = null;
            }
            Map<String, String> map = c1803830x2b.LIZJ;
            c1803800x2Y.getClass();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_frozen_coin_banner_show");
            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
            IRevenueStrategyService iRevenueStrategyServiceLIZIZ = C1126800fQc.LIZIZ();
            if (iRevenueStrategyServiceLIZIZ != null && iRevenueStrategyServiceLIZIZ.M92() != null && (firstRechargeCampaignV2 = C1134860fdc.LIZJ) != null && (lValueOf = Long.valueOf(firstRechargeCampaignV2.expireTime)) != null) {
                numValueOf = Integer.valueOf((int) ((lValueOf.longValue() - (C158B.LIZ() / ((long) LSPassThroughRecordSizeConfig.DEFAULT))) / ((long) 86400)));
            }
            c474500IjALIZ.LJJII(numValueOf, "countdown_time");
            c474500IjALIZ.LJJIIZI(map);
            c474500IjALIZ.LJIJJLI(dataChannel);
            c474500IjALIZ.LIZ();
        }
    }

    @Override // com.bytedance.android.live.walletclean.presentation.assem.body.view.RechargePanelBodyDialogAbility
    public final void zK2() {
        if (C497740JfY.LJIL()) {
            return;
        }
        Vc();
    }

    @Override // com.bytedance.android.live.walletclean.presentation.assem.body.view.RechargePanelBodyDialogAbility
    public final void c20() {
        BS();
    }

    @Override // com.bytedance.android.live.walletclean.presentation.assem.body.view.RechargePanelBodyDialogAbility
    public final void D41(Diamond diamond) {
        if (diamond == null) {
            return;
        }
        qS().LLLLIIL = diamond;
    }

    @Override // X.InterfaceC1803460x20
    public final void Ep(List<NoticesResult.Notice> list) {
        Boolean boolValueOf;
        if (list != null && !list.isEmpty()) {
            if (!VR().LIZIZ) {
                rS();
            }
            RechargeBannerViewModel rechargeBannerViewModel = (RechargeBannerViewModel) VR().LJ.getValue();
            rechargeBannerViewModel.getClass();
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<NoticesResult.Notice> it2 = list.iterator();
                while (true) {
                    AbstractC1568580qvA c1568560qv8 = null;
                    if (!it2.hasNext()) {
                        break;
                    }
                    NoticesResult.Notice next = it2.next();
                    int i = next.type;
                    if (i != 9) {
                        if (i != 11) {
                            boolValueOf = null;
                            if (!Intrinsics.LJFF(boolValueOf, Boolean.TRUE) && c1568560qv8 != null) {
                                arrayList.add(c1568560qv8);
                            }
                        } else {
                            c1568560qv8 = new C1567220qsy(next);
                        }
                    } else {
                        c1568560qv8 = new C1568560qv8(next);
                    }
                    boolValueOf = Boolean.valueOf(c1568560qv8.LIZIZ());
                    if (!Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                    }
                }
                Iterator it3 = arrayList.iterator();
                if (it3.hasNext()) {
                    Object next2 = it3.next();
                    if (it3.hasNext()) {
                        int priority = ((AbstractC1568580qvA) next2).LIZ().getPriority();
                        do {
                            Object next3 = it3.next();
                            int priority2 = ((AbstractC1568580qvA) next3).LIZ().getPriority();
                            if (priority < priority2) {
                                next2 = next3;
                                priority = priority2;
                            }
                        } while (it3.hasNext());
                    }
                    if (next2 != null) {
                        rechargeBannerViewModel.LL.postValue((AbstractC1568580qvA) next2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object FS(X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C1354305Rt
            if (r0 == 0) goto L27
            r5 = r7
            X.05Rt r5 = (X.C1354305Rt) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L2d
            if (r0 == r3) goto L51
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L27:
            X.05Rt r5 = new X.05Rt
            r5.<init>(r6, r7)
            goto L12
        L2d:
            X.C155000ia.LIZIZ(r1)
            com.bytedance.android.livesdk.livesetting.wallet.LiveWalletLoadingIndicatorSetting r0 = com.bytedance.android.livesdk.livesetting.wallet.LiveWalletLoadingIndicatorSetting.INSTANCE
            boolean r0 = r0.getValue()
            if (r0 == 0) goto L5a
            com.bytedance.android.live.walletnew.RechargeViewModel r0 = r6.qS()
            X.1DDr r2 = r0.LLJJIJIL
            Y.AgS307S0100000_27 r1 = new Y.AgS307S0100000_27
            r0 = 9
            r1.<init>(r6, r0)
            r5.LLILLL = r3
            r2.getClass()
            java.lang.Object r0 = X.C2252331DDr.LJIIJ(r2, r1, r5)
            if (r0 != r4) goto L54
            return r4
        L51:
            X.C155000ia.LIZIZ(r1)
        L54:
            X.08jB r0 = new X.08jB
            r0.<init>()
            throw r0
        L5a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.walletnew.RechargeDialogNew.FS(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean GS(boolean r15) {
        /*
            Method dump skipped, instruction units count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.walletnew.RechargeDialogNew.GS(boolean):boolean");
    }

    @Override // com.bytedance.android.live.walletclean.presentation.assem.header.view.RechargePanelHeaderDialogAbility
    public final void Rk2(List<NoticesResult.Notice> list) {
        if (list.isEmpty()) {
            return;
        }
        qS().LQ2(list);
        Ep(list);
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{WalletRechargePanelScope.class});
        c0qsjLIZIZ.unbindAbility(this.LLLIL, RechargePanelBodyDialogAbility.class);
        c0qsjLIZIZ.unbindAbility(this.LLLILZ, RechargePanelHeaderDialogAbility.class);
    }

    @Override // X.InterfaceC1803460x20
    public final void c6(String str) {
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.LLJLL, str);
    }

    @Override // com.bytedance.android.live.walletclean.presentation.assem.body.view.RechargePanelBodyDialogAbility
    public final void fk2(List<IapListResult.VoucherItem> list) {
        qS().aR2().LJI(list, true);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 1) {
            if (qS().LLLLILI) {
                qS().sR2(this.LLJLL);
                qS().LLLLILI = false;
            } else {
                C1805720x5e c1805720x5e = this.LLLIIL;
                if (c1805720x5e != null) {
                    AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(this, 133);
                    String str = c1805720x5e.LIZJ;
                    if (str != null) {
                        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(C1388190mED.LIZ(c1805720x5e.LIZ.getContext()), str);
                        c1805720x5e.LIZJ = null;
                        awS571S0100000_27.invoke();
                    }
                }
                C1805810x5n c1805810x5n = this.LLLIIIL;
                if (c1805810x5n != null) {
                    AwS571S0100000_27 awS571S0100000_272 = new AwS571S0100000_27(this, 134);
                    String str2 = c1805810x5n.LIZJ;
                    if (str2 != null) {
                        SmartRouter.buildRoute(c1805810x5n.LIZ.getContext(), str2).open();
                        c1805810x5n.LIZJ = null;
                        awS571S0100000_272.invoke();
                    }
                }
            }
            VaultRechargeUnlockGiftViewModel vaultRechargeUnlockGiftViewModel = qS().LLLIL;
            if (vaultRechargeUnlockGiftViewModel != null) {
                AwS571S0100000_27 awS571S0100000_273 = new AwS571S0100000_27(this, 135);
                if (configuration.orientation == 1 && vaultRechargeUnlockGiftViewModel.LLILZIL) {
                    vaultRechargeUnlockGiftViewModel.LLILLL.LJIIIIZZ(vaultRechargeUnlockGiftViewModel.LLILLJJLI);
                    vaultRechargeUnlockGiftViewModel.LLILZIL = false;
                    awS571S0100000_273.invoke();
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C687700QyG.LJI(this);
        ((InterfaceC1806410x6l) this.LLJLILLLLZIIL.getValue()).LIZIZ();
    }

    public final void onEvent(C1806610x75 c1806610x75) {
        if (c1806610x75 != null && c1806610x75.LIZIZ) {
            Diamond diamond = new Diamond();
            diamond.count = c1806610x75.LIZ;
            zS(diamond, null, false, true);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return super.onGetLayoutInflater(bundle);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{WalletRechargePanelScope.class});
        c0qsjLIZIZ.bindAbility(this.LLLIL, RechargePanelBodyDialogAbility.class);
        c0qsjLIZIZ.bindAbility(this.LLLILZ, RechargePanelHeaderDialogAbility.class);
    }

    @Override // X.InterfaceC1803460x20
    public final void ww(C1777440wM2 c1777440wM2) {
        Context context;
        View view = getView();
        if (view != null && view.getContext() != null) {
            IWalletService iWalletService = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
            View view2 = getView();
            Long lValueOf = null;
            if (view2 != null) {
                context = view2.getContext();
            } else {
                context = null;
            }
            Diamond diamond = c1777440wM2.LIZ;
            C1126800fQc.LIZ.py();
            int iLIZIZ = C1134860fdc.LIZ.LIZIZ(c1777440wM2.LIZIZ, 0);
            String str = c1777440wM2.LIZJ;
            String str2 = c1777440wM2.LIZLLL;
            int i = c1777440wM2.LIZIZ;
            C1776960wLG c1776960wLG = c1777440wM2.LJFF;
            if (c1776960wLG != null) {
                lValueOf = Long.valueOf(c1776960wLG.LIZIZ);
            }
            iWalletService.openCashierV3(context, diamond, iLIZIZ, str, str2, i, lValueOf, ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).isSupportPreloadReuseCashier(c1777440wM2.LIZIZ, false), true, c1777440wM2.LJ, new AwS571S0100000_27(this, 136));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0078, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    @Override // X.InterfaceC1803460x20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yA(com.bytedance.android.livesdk.wallet.NoticesResult.Notice r13) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.walletnew.RechargeDialogNew.yA(com.bytedance.android.livesdk.wallet.NoticesResult$Notice):void");
    }

    @Override // com.bytedance.android.live.walletclean.presentation.assem.body.view.RechargePanelBodyDialogAbility
    public final void yH(Throwable th) {
        BaseRechargeViewModel.IQ2(qS(), th);
    }

    @Override // com.bytedance.android.live.walletclean.presentation.assem.body.view.RechargePanelBodyDialogAbility
    public final void EY1(C1804840x4E c1804840x4E, C1797200wru c1797200wru) {
        View viewFindViewById;
        int i;
        Boolean boolValueOf;
        int i2;
        if (c1804840x4E != null) {
            L0();
            qS().OQ2(c1804840x4E);
            qS().LLLIIL = System.currentTimeMillis();
            View view = getView();
            C1803830x2b c1803830x2b = null;
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.cd4);
            } else {
                viewFindViewById = null;
            }
            if (c1797200wru != null) {
                if (viewFindViewById != null) {
                    C439101nJ.LJI(viewFindViewById);
                }
            } else {
                if (viewFindViewById != null) {
                    C12ES.LJIILL(0, viewFindViewById);
                }
                InterfaceC1806230x6T interfaceC1806230x6T = this.LLJLLIL;
                if (interfaceC1806230x6T != null) {
                    interfaceC1806230x6T.LIZIZ(2, 0, "api success");
                }
            }
            C1797270ws1.LIZJ().LJIIJJI(c1804840x4E.LJ());
            PR();
            RR(c1804840x4E.LJII(), c1804840x4E.LJIJI());
            C21578619ce c21578619ceKS = kS();
            if (c21578619ceKS != null) {
                C439101nJ.LJI(c21578619ceKS);
            }
            LinearLayout linearLayoutDS = dS();
            if (linearLayoutDS != null) {
                C12ES.LJIILL(0, linearLayoutDS);
            }
            if (!c1804840x4E.LJIIZILJ()) {
                C500260Jjc.LLFFF(WR());
                qS().LLLLIILL.observe(getViewLifecycleOwner(), new AObserverS187S0200000_27(c1804840x4E, this, 0));
            } else {
                C500260Jjc.LJIILIIL(WR());
            }
            if (!LiveRechargePanelRefactorSetting.INSTANCE.getValue()) {
                qS().Em1(c1804840x4E.LJIIIIZZ(), false, qS().LLLLIILL.getValue(), false, new AwS393S0200000_27(this, c1804840x4E, 22));
            }
            View view2 = getView();
            if (view2 != null) {
                HandlerHook.viewPost(view2, new ARunnableS35S0400000_27(this, c1797200wru, c1804840x4E, 1));
            }
            if (c1797200wru == null) {
                C1806690x7D value = qS().LLLLJ.getValue();
                if (value != null) {
                    boolValueOf = Boolean.valueOf(value.LIZ);
                } else {
                    boolValueOf = null;
                }
                if (C500260Jjc.LJJIJIIJIL(boolValueOf)) {
                    wS();
                    sS();
                    uS();
                    C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
                    Diamond value2 = qS().LLLLIILL.getValue();
                    if (value2 != null) {
                        i2 = value2.count;
                    } else {
                        i2 = 0;
                    }
                    DataChannel dataChannel = this.LLJZ;
                    Integer numValueOf = Integer.valueOf(qS().YQ2());
                    c1803800x2Y.getClass();
                    C1803800x2Y.LJJJJI(i2, dataChannel, numValueOf);
                    C1803540x28.LJI(null, null, null);
                }
                if (qS().LLJZ > 0) {
                    C1803800x2Y c1803800x2Y2 = C1803800x2Y.LIZ;
                    C1803830x2b c1803830x2b2 = this.LLJLLL;
                    if (c1803830x2b2 == null) {
                        c1803830x2b2 = null;
                    }
                    c1803800x2Y2.getClass();
                    C1803800x2Y.LJJIFFI(c1803830x2b2, "retry", true, null);
                }
            }
            if (this.LLJLL != null) {
                C1805240x4s c1805240x4s = this.LLLIIII;
                Diamond value3 = qS().LLLLIILL.getValue();
                if (value3 != null) {
                    i = value3.count;
                } else {
                    i = 0;
                }
                c1805240x4s.LIZ(i);
            }
            if (c1797200wru != null) {
                InterfaceC1806230x6T interfaceC1806230x6T2 = this.LLJLLIL;
                if (interfaceC1806230x6T2 != null) {
                    int errorCode = c1797200wru.getErrorCode();
                    String message = c1797200wru.getMessage();
                    if (message == null) {
                        message = "api exception";
                    }
                    interfaceC1806230x6T2.LIZIZ(0, errorCode, message);
                }
                View view3 = getView();
                if (view3 != null) {
                    HandlerHook.viewPost(view3, new ARunnableS96S0200000_27(this, 1));
                }
                sS();
                uS();
                if (qS().LLJZ > 1) {
                    C1803800x2Y c1803800x2Y3 = C1803800x2Y.LIZ;
                    C1803830x2b c1803830x2b3 = this.LLJLLL;
                    if (c1803830x2b3 == null) {
                        c1803830x2b3 = null;
                    }
                    Exception exception = c1797200wru.getException();
                    c1803800x2Y3.getClass();
                    C1803800x2Y.LJJIFFI(c1803830x2b3, "retry", false, exception);
                }
            }
            IWalletService iWalletService = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
            C1803830x2b c1803830x2b4 = this.LLJLLL;
            if (c1803830x2b4 != null) {
                c1803830x2b = c1803830x2b4;
            }
            if (iWalletService.isSupportPreloadReuseCashier(c1803830x2b.LJ, false)) {
                qS().tR2(false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void HS(android.view.View r13, java.lang.Long r14) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.walletnew.RechargeDialogNew.HS(android.view.View, java.lang.Long):void");
    }

    @Override // X.InterfaceC1803460x20
    public final void L6(C1804840x4E c1804840x4E, C1807890x99 c1807890x99) {
        Boolean boolValueOf;
        int i;
        int i2;
        qS().LLLIIL = System.currentTimeMillis();
        InterfaceC1806230x6T interfaceC1806230x6T = this.LLJLLIL;
        if (interfaceC1806230x6T != null) {
            interfaceC1806230x6T.LIZIZ(2, 0, "api success");
        }
        if (c1804840x4E.LJIIZILJ() && !LiveRechargePanelRefactorSetting.INSTANCE.getValue()) {
            ey(0, 0, 0, "1-10-10-00", "Empty Product Detail from google", new Exception("rechargeList is empty"), c1807890x99, null);
            return;
        }
        C1797270ws1.LIZJ().LJIIJJI(c1804840x4E.LJ());
        PR();
        RR(c1804840x4E.LJII(), c1804840x4E.LJIJI());
        C21578619ce c21578619ceKS = kS();
        if (c21578619ceKS != null) {
            C439101nJ.LJI(c21578619ceKS);
        }
        LinearLayout linearLayoutDS = dS();
        if (linearLayoutDS != null) {
            C12ES.LJIILL(0, linearLayoutDS);
        }
        if (!c1804840x4E.LJIIZILJ()) {
            C500260Jjc.LLFFF(WR());
            qS().LLLLIILL.observe(getViewLifecycleOwner(), new AObserverS187S0200000_27(c1804840x4E, this, 0));
        } else {
            C500260Jjc.LJIILIIL(WR());
        }
        if (!LiveRechargePanelRefactorSetting.INSTANCE.getValue()) {
            qS().Em1(c1804840x4E.LJIIIIZZ(), false, qS().LLLLIILL.getValue(), false, new AwS393S0200000_27(this, c1804840x4E, 21));
        }
        View view = getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS60S0300000_27(this, c1804840x4E, c1807890x99, 0));
        }
        C1806690x7D value = qS().LLLLJ.getValue();
        C1803830x2b c1803830x2b = null;
        if (value != null) {
            boolValueOf = Boolean.valueOf(value.LIZ);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIJIIJIL(boolValueOf)) {
            wS();
            sS();
            uS();
            C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
            Diamond value2 = qS().LLLLIILL.getValue();
            if (value2 != null) {
                i2 = value2.count;
            } else {
                i2 = 0;
            }
            DataChannel dataChannel = this.LLJZ;
            Integer numValueOf = Integer.valueOf(qS().YQ2());
            c1803800x2Y.getClass();
            C1803800x2Y.LJJJJI(i2, dataChannel, numValueOf);
            C1803540x28.LJI(null, null, null);
        }
        if (qS().LLJZ > 0) {
            C1803800x2Y c1803800x2Y2 = C1803800x2Y.LIZ;
            C1803830x2b c1803830x2b2 = this.LLJLLL;
            if (c1803830x2b2 == null) {
                c1803830x2b2 = null;
            }
            c1803800x2Y2.getClass();
            C1803800x2Y.LJJIFFI(c1803830x2b2, "retry", true, null);
        }
        if (this.LLJLL != null) {
            C1805240x4s c1805240x4s = this.LLLIIII;
            Diamond value3 = qS().LLLLIILL.getValue();
            if (value3 != null) {
                i = value3.count;
            } else {
                i = 0;
            }
            c1805240x4s.LIZ(i);
        }
        IWalletService iWalletService = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
        C1803830x2b c1803830x2b3 = this.LLJLLL;
        if (c1803830x2b3 != null) {
            c1803830x2b = c1803830x2b3;
        }
        if (iWalletService.isSupportPreloadReuseCashier(c1803830x2b.LJ, false)) {
            qS().tR2(false);
        }
    }

    public final void RR(IapListResult.ListResultExtra listResultExtra, boolean z) {
        IapListResult.QuickChargeConfig quickChargeConfig;
        IapListResult.QuickChargeConfig quickChargeConfig2;
        String str = null;
        Map<String, String> mapLIZ = null;
        str = null;
        if (LiveRechargePanelHeaderRefactorSetting.INSTANCE.getValue()) {
            RechargePanelHeaderAssemAbility rechargePanelHeaderAssemAbilityCS = cS();
            if (rechargePanelHeaderAssemAbilityCS != null) {
                rechargePanelHeaderAssemAbilityCS.cu1(listResultExtra);
            }
            RechargePanelHeaderAssemAbility rechargePanelHeaderAssemAbilityCS2 = cS();
            if (rechargePanelHeaderAssemAbilityCS2 != null) {
                TrackingEventV3Data trackingEventV3DataOg1 = qS().og1(false);
                if (trackingEventV3DataOg1 != null) {
                    mapLIZ = trackingEventV3DataOg1.LIZ();
                }
                rechargePanelHeaderAssemAbilityCS2.EO0(mapLIZ, z);
                return;
            }
            return;
        }
        if (qS().ZQ2() >= 0) {
            C500260Jjc.LLFFF(hS());
            RechargeViewModel rechargeViewModelQS = qS();
            Context context = this.LLJLL;
            if (context == null) {
                rechargeViewModelQS.getClass();
            } else {
                IapListResult.ListResultExtra listResultExtraVx1 = rechargeViewModelQS.vx1();
                if (listResultExtraVx1 != null && (quickChargeConfig2 = listResultExtraVx1.quickChargeConfig) != null) {
                    str = quickChargeConfig2.redDotDedupId;
                }
                InterfaceC1870830ymf interfaceC1870830ymfLIZ = C1323690kYB.LIZ(context);
                Object[] objArr = new Object[1];
                if (str == null) {
                    str = "";
                }
                objArr[0] = str;
                boolean z2 = !Intrinsics.LJFF(interfaceC1870830ymfLIZ.LIZ(C786410Ut5.j4("live_wallet_quick_charge_notification_%s", Arrays.copyOf(objArr, 1))), Boolean.TRUE);
                IapListResult.ListResultExtra listResultExtraVx12 = rechargeViewModelQS.vx1();
                if (listResultExtraVx12 != null && (quickChargeConfig = listResultExtraVx12.quickChargeConfig) != null && quickChargeConfig.showRedDot && z2) {
                    C500260Jjc.LLFFF(iS());
                }
            }
            TuxIconView tuxIconViewHS = hS();
            if (tuxIconViewHS != null) {
                C786410Ut5.I7(new AbS703S0100000_24(this, 2), tuxIconViewHS);
            }
            C1803800x2Y.LIZ.getClass();
            C1803800x2Y.LJJIJ("button");
            return;
        }
        C500260Jjc.LJIILIIL(hS());
        C500260Jjc.LJIILIIL(iS());
    }

    @Override // X.InterfaceC1803460x20
    public final void cE(int i, long j) {
        Resources resources;
        DelayLoadingDialog delayLoadingDialog;
        Activity activityLIZ;
        Context context = this.LLJLL;
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null && activityLIZ.isFinishing()) {
            return;
        }
        String string = null;
        if (this.LLLFZ == null) {
            Context context2 = this.LLJLL;
            if (context2 != null) {
                delayLoadingDialog = new DelayLoadingDialog(context2);
            } else {
                delayLoadingDialog = null;
            }
            this.LLLFZ = delayLoadingDialog;
        }
        DelayLoadingDialog delayLoadingDialog2 = this.LLLFZ;
        if (delayLoadingDialog2 != null) {
            if (i == 0) {
                string = "";
            } else {
                Context context3 = this.LLJLL;
                if (context3 != null && (resources = context3.getResources()) != null) {
                    string = resources.getString(i);
                }
            }
            DialogC780480UjW dialogC780480UjW = delayLoadingDialog2.LIZ;
            dialogC780480UjW.LLIZLLLIL = string;
            C419090Gbz c419090Gbz = dialogC780480UjW.LLJ;
            if (c419090Gbz != null) {
                c419090Gbz.setMessage(string);
            }
        }
        DelayLoadingDialog delayLoadingDialog3 = this.LLLFZ;
        if (delayLoadingDialog3 != null) {
            delayLoadingDialog3.LIZ(j);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x0368, code lost:
    
        if (r15 != 5) goto L163;
     */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02f3 A[PHI: r1
      0x02f3: PHI (r1v91 android.view.View) = (r1v90 android.view.View), (r1v94 android.view.View) binds: [B:143:0x02dd, B:148:0x02f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x078e  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r27, android.os.Bundle r28) {
        /*
            Method dump skipped, instruction units count: 2766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.walletnew.RechargeDialogNew.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.bytedance.android.live.walletclean.presentation.assem.body.view.RechargePanelBodyDialogAbility
    public final void pR1(Diamond diamond, boolean z) {
        if (diamond == null) {
            return;
        }
        if (!z) {
            qS().LLLIIIIL = true;
        }
        qS().rR2(diamond, true);
    }

    @Override // X.InterfaceC1803460x20
    public final void A7(int i, C1806600x74 c1806600x74, InterfaceC1807440x8Q interfaceC1807440x8Q) {
        C1807180x80 c1807180x80 = this.LLL;
        if (c1807180x80 != null) {
            if (i < ((ArrayList) c1807180x80.LJFF).size()) {
                ListProtector.remove(c1807180x80.LJFF, i);
                ListProtector.add(c1807180x80.LJFF, i, c1806600x74);
            }
            c1807180x80.LIZJ().notifyItemChanged(i, interfaceC1807440x8Q);
        }
    }

    @Override // X.InterfaceC1803460x20
    public final void TI(Diamond diamond, C1796560wqs c1796560wqs, boolean z) {
        zS(diamond, c1796560wqs, true, z);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        boolean zLJI = MethodIDManager.LJI(202266);
        if (qS().lR2()) {
            i = R.layout.ga3;
        } else {
            i = R.layout.ga2;
        }
        View viewTd = C786410Ut5.Td(layoutInflater, i, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return viewTd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0a0c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0370  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v2, types: [X.0x4k] */
    /* JADX WARN: Type inference failed for: r10v4, types: [X.0x4k] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r13v1, types: [X.0x7U] */
    /* JADX WARN: Type inference failed for: r5v18, types: [X.0x2b] */
    /* JADX WARN: Type inference failed for: r5v311 */
    /* JADX WARN: Type inference failed for: r5v312 */
    /* JADX WARN: Type inference failed for: r5v313 */
    /* JADX WARN: Type inference failed for: r5v314 */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v67, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r5v70 */
    /* JADX WARN: Type inference failed for: r5v71, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r5v73 */
    /* JADX WARN: Type inference failed for: r5v74, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r5v98 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [tikcast.api.wallet.tiktok.QueryOrderResult$KYCIncentive] */
    /* JADX WARN: Type inference failed for: r6v20, types: [com.bytedance.android.live.wallet.viewmodel.recharge.component.banner.VaultRechargeUnlockGiftViewModel] */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [X.0x4k] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zS(com.bytedance.android.livesdk.wallet.Diamond r30, X.C1796560wqs r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 2612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.walletnew.RechargeDialogNew.zS(com.bytedance.android.livesdk.wallet.Diamond, X.0wqs, boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    @Override // X.InterfaceC1803460x20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zz(int r30, int r31, int r32, java.lang.String r33, java.lang.String r34, X.C1797250wrz r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.walletnew.RechargeDialogNew.zz(int, int, int, java.lang.String, java.lang.String, X.0wrz, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0261 A[PHI: r6
      0x0261: PHI (r6v30 android.view.View) = (r6v29 android.view.View), (r6v33 android.view.View) binds: [B:115:0x024b, B:120:0x025f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1803460x20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ey(int r34, int r35, int r36, java.lang.String r37, java.lang.String r38, java.lang.Exception r39, X.InterfaceC1804390x3V r40, webcast.api.profit.IapListResult.ListResultExtra r41) {
        /*
            Method dump skipped, instruction units count: 1053
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.walletnew.RechargeDialogNew.ey(int, int, int, java.lang.String, java.lang.String, java.lang.Exception, X.0x3V, webcast.api.profit.IapListResult$ListResultExtra):void");
    }
}
