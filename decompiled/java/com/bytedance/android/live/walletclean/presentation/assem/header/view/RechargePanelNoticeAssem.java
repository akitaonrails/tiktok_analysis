package com.bytedance.android.live.walletclean.presentation.assem.header.view;

import X.C019F;
import X.C01DW;
import X.C09R3;
import X.C0W0P;
import X.C127G;
import X.C13LE;
import X.C1559260qg8;
import X.C1566250qrP;
import X.C1567160qss;
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
import X.InterfaceC2217461Bqa;
import Y.AObjectS77S0000000_27;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.walletclean.presentation.assem.WalletRechargePanelScope;
import com.bytedance.android.live.walletclean.presentation.assem.header.view.RechargePanelNoticeAssem;
import com.bytedance.android.live.walletclean.presentation.assem.header.viewmodel.RechargePanelHeaderViewModel;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS175S0400000_24;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class RechargePanelNoticeAssem extends UISlotAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public final AssemVMLazy LLJJI;
    public final C1559260qg8 LLJJIII;
    public View LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public TuxTextView LLJJIJIL;
    public TuxTextView LLJJJ;
    public View LLJJJIL;
    public View LLJJJJ;
    public ImageView LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public C1567160qss LLJL;
    public volatile C1570060qxY LLJLIL;
    public volatile C0W0P LLJLILLLLZIIL;
    public C127G LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RechargePanelNoticeAssem.class, "vm", "getVm()Lcom/bytedance/android/live/walletclean/presentation/assem/header/viewmodel/RechargePanelHeaderViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(RechargePanelNoticeAssem.class, "tracking", "getTracking()Lcom/bytedance/android/live/walletclean/presentation/tracking/IRechargePanelHeaderTracking;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(RechargePanelNoticeAssem.class, "walletLynxRouter", "getWalletLynxRouter()Lcom/bytedance/android/live/walletclean/presentation/router/IWalletRouter;", 0);
        c09r3.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public RechargePanelNoticeAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RechargePanelHeaderViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), C019F.LIZ, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 44), AFwS264S0000000_24.get$arr$(15), null, true);
        this.LLJJIII = new C1559260qg8(new C723580SZw(this, C1566250qrP.class, "wallet_recharge_panel_header_params"), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.h4a;
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

    public final void hide() {
        this.LLJL = null;
        View viewLJJIJL = LJJIJL();
        ViewGroup viewGroup = viewLJJIJL instanceof ViewGroup ? (ViewGroup) viewLJJIJL : null;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(8, viewGroup);
        }
        View view = this.LLJJIJI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJLL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJLL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{RechargePanelHeaderViewModel.class, new AObjectS77S0000000_27(this, 2)}, defaultViewModelProviderFactory);
                    this.LLJLL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIJI = view;
        this.LLJJIJIIJIL = (TuxTextView) view.findViewById(R.id.swf);
        this.LLJJIJIL = (TuxTextView) view.findViewById(R.id.sw_);
        this.LLJJJ = (TuxTextView) view.findViewById(R.id.swe);
        this.LLJJJIL = view.findViewById(R.id.swc);
        this.LLJJJJ = view.findViewById(R.id.sw9);
        this.LLJJJJJIL = (ImageView) view.findViewById(R.id.swb);
        TuxTextView tuxTextView = this.LLJJJ;
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new C01DW() { // from class: X.0qxQ
                @Override // X.C01DW
                public final void LIZ(View view2) {
                    RechargePanelNoticeAssem rechargePanelNoticeAssem = this.LLILLL;
                    C0W0P c0w0p = rechargePanelNoticeAssem.LLJLILLLLZIIL;
                    if (c0w0p == null) {
                        synchronized (rechargePanelNoticeAssem) {
                            c0w0p = rechargePanelNoticeAssem.LLJLILLLLZIIL;
                            if (c0w0p == null) {
                                c0w0p = new C0W0P();
                                rechargePanelNoticeAssem.LLJLILLLLZIIL = c0w0p;
                            }
                        }
                    }
                    Context context = this.LLILLL.getContext();
                    RechargePanelNoticeAssem rechargePanelNoticeAssem2 = this.LLILLL;
                    C1567160qss c1567160qss = rechargePanelNoticeAssem2.LLJL;
                    AwS638S0100000_24 awS638S0100000_24 = new AwS638S0100000_24(rechargePanelNoticeAssem2, 207);
                    if (context != null && c1567160qss != null) {
                        C1567150qsr c1567150qsr = c1567160qss.LJII;
                        if (c1567150qsr != null) {
                            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).tryOpenAutoLogin(c1567150qsr.LIZ, c1567150qsr.LIZIZ, c1567150qsr.LIZJ, new AwS175S0400000_24(c0w0p, context, c1567150qsr, awS638S0100000_24, 0));
                            return;
                        }
                        if (c1567160qss.LJIIIIZZ) {
                            if (!C0W0P.LIZ(context, c1567160qss.LJ)) {
                                return;
                            }
                            awS638S0100000_24.invoke("external_browser", null);
                        } else {
                            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, c1567160qss.LJ);
                            awS638S0100000_24.invoke("in_app", null);
                        }
                    }
                }
            });
        }
        View view2 = this.LLJJJJ;
        if (view2 != null) {
            C786410Ut5.I7(new C01DW() { // from class: X.0qxP
                @Override // X.C01DW
                public final void LIZ(View view3) {
                    String str;
                    RechargePanelNoticeAssem rechargePanelNoticeAssem = this.LLILLL;
                    C1567160qss c1567160qss = rechargePanelNoticeAssem.LLJL;
                    if (c1567160qss != null) {
                        if (rechargePanelNoticeAssem.LLJLIL == null) {
                            synchronized (rechargePanelNoticeAssem) {
                                if (rechargePanelNoticeAssem.LLJLIL == null) {
                                    rechargePanelNoticeAssem.LLJLIL = new C1570060qxY();
                                }
                            }
                        }
                        C1566250qrP c1566250qrP = (C1566250qrP) rechargePanelNoticeAssem.LLJJIII.getValue();
                        if (c1566250qrP != null) {
                            str = c1566250qrP.LLILZLL;
                        } else {
                            str = null;
                        }
                        C1570060qxY.LIZLLL(str, c1567160qss.LIZ);
                        rechargePanelNoticeAssem.hide();
                    }
                }
            }, view2);
        }
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.06Lp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1556790qc9) obj).LLILLJJLI;
            }
        }, null, new AwS638S0100000_24(this, 206), 6);
    }

    public static void hp(TuxTextView tuxTextView, String str) {
        if (str != null && str.length() != 0) {
            if (tuxTextView != null) {
                tuxTextView.setText(str);
                C786410Ut5.LLLLZLL(tuxTextView, 0);
                return;
            }
            return;
        }
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
    }
}
