package com.bytedance.android.live.liveinteract.multimatch.ui.audience.v2.views;

import X.C019F;
import X.C0ZP4;
import X.C1155220gAS;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C15F4;
import X.C15FH;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20441214yg;
import X.C2217381BqS;
import X.C723590SZx;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.multihost.biz.viewmodel.InteractionTitleViewModel;
import com.bytedance.android.live.liveinteract.multimatch.ui.IPKCountDownTitleAbility;
import com.bytedance.android.live.liveinteract.multimatch.ui.MatchCountDownAssem;
import com.bytedance.android.live.liveinteract.multimatch.ui.MatchPunishCountDownAssem;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS645S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class MatchWidgetTitleLayout extends UISlotAssem implements IMatchWidgetTitleAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final AssemVMLazy LLJJI;
    public C0ZP4 LLJJIII;
    public ConstraintLayout LLJJIJI;
    public LinearLayout LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MatchWidgetTitleLayout.class, "titleContainerVM", "getTitleContainerVM()Lcom/bytedance/android/live/liveinteract/multihost/biz/viewmodel/InteractionTitleViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MatchWidgetTitleLayout() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InteractionTitleViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 41), AFwS276S0000000_31.get$arr$(28), null, true);
        checkSupervisorPrepared();
        new C723590SZx(this, C1155220gAS.class, null);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.h2s;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.ui.audience.v2.views.IMatchWidgetTitleAbility
    public final void R0() {
        C20441214yg.LIZIZ("MatchTitleLayout", "onMatchEnd");
        ConstraintLayout constraintLayout = this.LLJJIJI;
        if (constraintLayout != null) {
            C786410Ut5.LL(8, constraintLayout);
        }
        LinearLayout linearLayout = this.LLJJIJIIJIL;
        if (linearLayout != null) {
            C786410Ut5.LJZL(8, linearLayout);
        }
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        InteractionTitleViewModel.vQ2((InteractionTitleViewModel) assemVMLazy.getValue(), C15F4.LIZ);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        IPKCountDownTitleAbility iPKCountDownTitleAbility = (IPKCountDownTitleAbility) C1558520qew.LIZ(fragmentLJI != null ? C1558360qeg.LJFF(fragmentLJI, null) : C1558520qew.LJIIL(this), IPKCountDownTitleAbility.class, null);
        if (iPKCountDownTitleAbility != null) {
            iPKCountDownTitleAbility.R0();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.ui.audience.v2.views.IMatchWidgetTitleAbility
    public final void nr0() {
        C20441214yg.LIZIZ("MatchTitleLayout", "onPunishStart");
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        InteractionTitleViewModel.vQ2((InteractionTitleViewModel) assemVMLazy.getValue(), C15FH.LIZ);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C0ZP4 c0zp4;
        C20441214yg.LIZIZ("MatchTitleLayout", "onDestroy");
        super.onDestroy();
        C0ZP4 c0zp42 = this.LLJJIII;
        if (c0zp42 != null && !c0zp42.isDisposed() && (c0zp4 = this.LLJJIII) != null) {
            c0zp4.dispose();
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        C1558520qew.LJIIJJI(fragmentLJI != null ? C1558360qeg.LJFF(fragmentLJI, null) : C1558520qew.LJIIL(this), IMatchWidgetTitleAbility.class, null);
        C723850SaN.LJII(this, C13LE.LIZ(MatchCountDownAssem.class), null);
        C723850SaN.LJII(this, C13LE.LIZ(MatchPunishCountDownAssem.class), null);
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.ui.audience.v2.views.IMatchWidgetTitleAbility
    public final void e5() {
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558360qeg.LJFF(fragmentLJI, null);
            return;
        }
        IPKCountDownTitleAbility iPKCountDownTitleAbility = (IPKCountDownTitleAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IPKCountDownTitleAbility.class, null);
        if (iPKCountDownTitleAbility != null) {
            iPKCountDownTitleAbility.e5();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        C1558520qew.LJII(fragmentLJI != null ? C1558360qeg.LJFF(fragmentLJI, null) : C1558520qew.LJIIL(this), this, IMatchWidgetTitleAbility.class, null, this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIJI = (ConstraintLayout) view.findViewById(R.id.m8x);
        this.LLJJIJIIJIL = (LinearLayout) view.findViewById(R.id.m8y);
        C723850SaN.LIZLLL(this, new AwS581S0100000_2(this, 60));
        ConstraintLayout constraintLayout = this.LLJJIJI;
        if (constraintLayout != null) {
            C786410Ut5.LL(8, constraintLayout);
        }
        LinearLayout linearLayout = this.LLJJIJIIJIL;
        if (linearLayout != null) {
            C786410Ut5.LJZL(8, linearLayout);
        }
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        this.LLJJIII = C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.15F7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C15F9) obj).LLILLJJLI;
            }
        }, null, new AwS645S0100000_31(this, 92), 6);
    }
}
