package com.bytedance.android.live.walletclean.presentation.assem.header.view;

import X.C019F;
import X.C01DW;
import X.C09R3;
import X.C0W0P;
import X.C127G;
import X.C13LE;
import X.C1559260qg8;
import X.C1566250qrP;
import X.C1570060qxY;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C687700QyG;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1567140qsq;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import Y.AObjectS77S0000000_27;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.walletclean.presentation.assem.WalletRechargePanelScope;
import com.bytedance.android.live.walletclean.presentation.assem.header.view.RechargePanelTitleBarAssem;
import com.bytedance.android.live.walletclean.presentation.assem.header.viewmodel.RechargePanelHeaderViewModel;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeFeedbackUrlSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletChatbotSchemaSetting;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS638S0100000_24;
import webcast.api.profit.IapListResult;

/* JADX INFO: loaded from: classes25.dex */
public final class RechargePanelTitleBarAssem extends UISlotAssem implements RechargePanelHeaderAssemAbility, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public final RechargePanelTitleBarAssem LLJJI = this;
    public final C1559260qg8 LLJJIII = new C1559260qg8(new C723580SZw(this, C1566250qrP.class, "wallet_recharge_panel_header_params"), checkSupervisorPrepared());
    public final AssemVMLazy LLJJIJI;
    public View LLJJIJIIJIL;
    public TuxTextView LLJJIJIL;
    public TuxIconView LLJJJ;
    public TuxIconView LLJJJIL;
    public View LLJJJJ;
    public IapListResult.QuickChargeConfig LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public Map<String, String> LLJJL;
    public volatile C1570060qxY LLJJLIIIJLLLLLLLZ;
    public volatile C0W0P LLJL;
    public C127G LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RechargePanelTitleBarAssem.class, "tracking", "getTracking()Lcom/bytedance/android/live/walletclean/presentation/tracking/IRechargePanelHeaderTracking;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(RechargePanelTitleBarAssem.class, "walletLynxRouter", "getWalletLynxRouter()Lcom/bytedance/android/live/walletclean/presentation/router/IWalletRouter;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(RechargePanelTitleBarAssem.class, "vm", "getVm()Lcom/bytedance/android/live/walletclean/presentation/assem/header/viewmodel/RechargePanelHeaderViewModel;", 0);
        c09r3.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public RechargePanelTitleBarAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RechargePanelHeaderViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), C019F.LIZ, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 45), AFwS264S0000000_24.get$arr$(16), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.h4b;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{WalletRechargePanelScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(WalletRechargePanelScope.class);
        return arrayList;
    }

    public final InterfaceC1567140qsq hp() {
        C1570060qxY c1570060qxY = this.LLJJLIIIJLLLLLLLZ;
        if (c1570060qxY == null) {
            synchronized (this) {
                c1570060qxY = this.LLJJLIIIJLLLLLLLZ;
                if (c1570060qxY == null) {
                    C1570060qxY c1570060qxY2 = new C1570060qxY();
                    this.LLJJLIIIJLLLLLLLZ = c1570060qxY2;
                    return c1570060qxY2;
                }
            }
        }
        return c1570060qxY;
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJLIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJLIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{RechargePanelHeaderViewModel.class, new AObjectS77S0000000_27(this, 3)}, defaultViewModelProviderFactory);
                    this.LLJLIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{WalletRechargePanelScope.class}).unbindAbility(this.LLJJI, RechargePanelHeaderAssemAbility.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.android.live.walletclean.presentation.assem.header.view.RechargePanelHeaderAssemAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void cu1(webcast.api.profit.IapListResult.ListResultExtra r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L5f
            webcast.api.profit.IapListResult$QuickChargeConfig r5 = r8.quickChargeConfig
        L4:
            r7.LLJJJJJIL = r5
            r4 = 0
            r6 = 1
            if (r5 == 0) goto L5c
            r3 = 1
            android.view.View r0 = r7.LJJIJL()
            android.content.Context r0 = r0.getContext()
            if (r0 == 0) goto L5d
            X.0ymf r2 = X.C1323690kYB.LIZ(r0)
            java.lang.String r1 = r5.redDotDedupId
            java.lang.Object[] r0 = new java.lang.Object[r6]
            if (r1 != 0) goto L21
            java.lang.String r1 = ""
        L21:
            r0[r4] = r1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r6)
            java.lang.String r0 = "live_wallet_quick_charge_notification_%s"
            java.lang.String r0 = X.C786410Ut5.j4(r0, r1)
            java.lang.Object r1 = r2.LIZ(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r1 = r0 ^ 1
            boolean r0 = r5.showRedDot
            if (r0 == 0) goto L5d
            if (r1 == 0) goto L5d
            r1 = 1
        L40:
            com.bytedance.tux.icon.TuxIconView r0 = r7.LLJJJIL
            if (r0 == 0) goto L47
            X.C500260Jjc.LJLJLJ(r0, r3)
        L47:
            android.view.View r0 = r7.LLJJJJ
            if (r0 == 0) goto L53
            if (r3 == 0) goto L50
            if (r1 == 0) goto L50
            r4 = 1
        L50:
            X.C500260Jjc.LJLJLJ(r0, r4)
        L53:
            if (r3 == 0) goto L5b
            r7.hp()
            X.C1570060qxY.LJFF()
        L5b:
            return
        L5c:
            r3 = 0
        L5d:
            r1 = 0
            goto L40
        L5f:
            r5 = 0
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.walletclean.presentation.assem.header.view.RechargePanelTitleBarAssem.cu1(webcast.api.profit.IapListResult$ListResultExtra):void");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIJIIJIL = view.findViewById(R.id.swk);
        this.LLJJIJIL = (TuxTextView) view.findViewById(R.id.swl);
        this.LLJJJ = (TuxIconView) view.findViewById(R.id.swh);
        this.LLJJJIL = (TuxIconView) view.findViewById(R.id.swi);
        this.LLJJJJ = view.findViewById(R.id.swj);
        TuxIconView tuxIconView = this.LLJJJ;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new C01DW() { // from class: X.0qxV
                @Override // X.C01DW
                public final void LIZ(View view2) {
                    this.LLILLL.hp();
                    C1566250qrP c1566250qrP = (C1566250qrP) this.LLILLL.LLJJIII.getValue();
                    DataChannel dataChannel = null;
                    if (c1566250qrP != null) {
                        dataChannel = c1566250qrP.LLIZLLLIL;
                    }
                    C1570060qxY.LIZIZ(dataChannel, this.LLILLL.LLJJL);
                    RechargePanelTitleBarAssem rechargePanelTitleBarAssem = this.LLILLL;
                    if (rechargePanelTitleBarAssem.LLJL == null) {
                        synchronized (rechargePanelTitleBarAssem) {
                            if (rechargePanelTitleBarAssem.LLJL == null) {
                                rechargePanelTitleBarAssem.LLJL = new C0W0P();
                            }
                        }
                    }
                    Context context = this.LLILLL.getContext();
                    boolean z = this.LLILLL.LLJJJJLIIL;
                    if (context != null) {
                        if (z) {
                            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, LiveWalletChatbotSchemaSetting.INSTANCE.getValue().rechargePageFaqV3);
                            return;
                        }
                        String strOB = ((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).oB();
                        if (!C500260Jjc.LJJIIZ(strOB) || strOB == null) {
                            strOB = LiveRechargeFeedbackUrlSetting.INSTANCE.getValue();
                        }
                        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, UriProtector.parse(strOB));
                    }
                }
            });
        }
        TuxIconView tuxIconView2 = this.LLJJJIL;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new C01DW() { // from class: X.0qxU
                @Override // X.C01DW
                public final void LIZ(View view2) {
                    String str;
                    this.LLILLL.hp();
                    C1570060qxY.LJ();
                    View view3 = this.LLILLL.LLJJJJ;
                    if (view3 != null) {
                        C786410Ut5.LJLLLLLL(8, view3);
                    }
                    RechargePanelTitleBarAssem rechargePanelTitleBarAssem = this.LLILLL;
                    if (rechargePanelTitleBarAssem.LLJL == null) {
                        synchronized (rechargePanelTitleBarAssem) {
                            if (rechargePanelTitleBarAssem.LLJL == null) {
                                rechargePanelTitleBarAssem.LLJL = new C0W0P();
                            }
                        }
                    }
                    Context context = this.LLILLL.getContext();
                    IapListResult.QuickChargeConfig quickChargeConfig = this.LLILLL.LLJJJJJIL;
                    String str2 = null;
                    if (quickChargeConfig != null) {
                        str = quickChargeConfig.jumpUrl;
                        str2 = quickChargeConfig.redDotDedupId;
                    } else {
                        str = null;
                    }
                    Object[] objArr = new Object[1];
                    if (str2 == null) {
                        str2 = "";
                    }
                    objArr[0] = str2;
                    String strJ4 = C786410Ut5.j4("live_wallet_quick_charge_notification_%s", Arrays.copyOf(objArr, 1));
                    if (context != null && str != null) {
                        if (str.length() > 0) {
                            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, UriProtector.parse(str));
                        }
                        C1323690kYB.LIZ(context).LJIIIIZZ(Boolean.TRUE, strJ4);
                    }
                }
            });
        }
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLILLLLZIIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0qkm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1556790qc9) obj).LL;
            }
        }, null, new AwS638S0100000_24(this, 208), 6);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{WalletRechargePanelScope.class}).bindAbility(this.LLJJI, RechargePanelHeaderAssemAbility.class);
    }

    @Override // com.bytedance.android.live.walletclean.presentation.assem.header.view.RechargePanelHeaderAssemAbility
    public final void EO0(Map map, boolean z) {
        this.LLJJJJLIIL = z;
        this.LLJJL = map;
    }
}
