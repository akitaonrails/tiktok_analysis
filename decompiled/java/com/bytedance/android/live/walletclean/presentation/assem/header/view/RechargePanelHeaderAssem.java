package com.bytedance.android.live.walletclean.presentation.assem.header.view;

import X.C019F;
import X.C09R3;
import X.C0QSJ;
import X.C127G;
import X.C13LE;
import X.C1559260qg8;
import X.C1566220qrM;
import X.C1566250qrP;
import X.C1567110qsn;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C687700QyG;
import X.C723580SZw;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.AObjectS77S0000000_27;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.walletclean.presentation.assem.WalletRechargePanelScope;
import com.bytedance.android.live.walletclean.presentation.assem.header.viewmodel.RechargePanelHeaderViewModel;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class RechargePanelHeaderAssem extends UIContentAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public boolean LLJI;
    public volatile RechargePanelHeaderDialogAbility LLJIJIL;
    public C127G LLJILJIL;
    public InterfaceC665370Q7z LLJILJILJ;
    public C0QSJ LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RechargePanelHeaderAssem.class, "headerAbility", "getHeaderAbility()Lcom/bytedance/android/live/walletclean/presentation/assem/header/view/RechargePanelHeaderDialogAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(RechargePanelHeaderAssem.class, "vm", "getVm()Lcom/bytedance/android/live/walletclean/presentation/assem/header/viewmodel/RechargePanelHeaderViewModel;", 0);
        c09r3.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public RechargePanelHeaderAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RechargePanelHeaderViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), C019F.LIZ, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 43), AFwS229S0000000_2.get$arr$(55), null, true);
        this.LLJ = new C1559260qg8(new C723580SZw(this, C1566250qrP.class, "wallet_recharge_panel_header_params"), checkSupervisorPrepared());
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

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJILJIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJILJIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{RechargePanelHeaderViewModel.class, new AObjectS77S0000000_27(this, 1)}, defaultViewModelProviderFactory);
                    this.LLJILJIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.h4_, viewGroup, true);
        C723850SaN.LIZLLL(this, new AwS581S0100000_2(this, 61));
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.06Ln
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1556790qc9) obj).LLILLL;
            }
        }, null, new AwS616S0100000_2(this, 11), 6);
        C736680Sv4.LJIIIIZZ(this, this.LLIZLLLIL.getValue(), new C2217381BqS() { // from class: X.06Lo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1556790qc9) obj).LLILLJJLI;
            }
        }, null, new AwS616S0100000_2(this, 12), 6);
        RechargePanelHeaderViewModel rechargePanelHeaderViewModel = (RechargePanelHeaderViewModel) this.LLIZLLLIL.getValue();
        C1566250qrP c1566250qrP = (C1566250qrP) this.LLJ.getValue();
        if (c1566250qrP != null) {
            C23250099c.LIZLLL(rechargePanelHeaderViewModel.getAssemVMScope(), null, null, new C1566220qrM(rechargePanelHeaderViewModel, c1566250qrP, null), 3);
            C23250099c.LIZLLL(rechargePanelHeaderViewModel.getAssemVMScope(), null, null, new C1567110qsn(rechargePanelHeaderViewModel, c1566250qrP, null), 3);
        }
    }
}
