package com.bytedance.android.live.liveinteract.multihost.biz.view;

import X.C019F;
import X.C0IYA;
import X.C0QSJ;
import X.C1091250eVH;
import X.C1143680frq;
import X.C1155220gAS;
import X.C1324720kZq;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C15F4;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C497740JfY;
import X.C673150Qan;
import X.C687700QyG;
import X.C723590SZx;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C915980Zwa;
import X.EnumC964170bCJ;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.match.business.event.BattleAdjustTitleViewTopEvent;
import com.bytedance.android.live.liveinteract.multihost.biz.helper.InteractTitleScope;
import com.bytedance.android.live.liveinteract.multihost.biz.viewmodel.InteractionTitleViewModel;
import com.bytedance.android.live.liveinteract.multihost.core.model.NewLayoutWindowStateChangeMessage;
import com.bytedance.android.live.liveinteract.multimatch.ui.IPKCountDownTitleAbility;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchInvalidateGovernanceSettings;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS680S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class InteractionTitleLayout extends UISlotAssem implements IInteractTitleAbility, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final AssemVMLazy LLJJI;
    public final C1559260qg8 LLJJIII;
    public C1091250eVH LLJJIJI;
    public FrameLayout LLJJIJIIJIL;
    public ConstraintLayout LLJJIJIL;
    public LinearLayout LLJJJ;
    public ConstraintLayout LLJJJIL;
    public C1324720kZq LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(InteractionTitleLayout.class, "titleContainerVM", "getTitleContainerVM()Lcom/bytedance/android/live/liveinteract/multihost/biz/viewmodel/InteractionTitleViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public InteractionTitleLayout() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InteractionTitleViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 39), AFwS276S0000000_31.get$arr$(19), null, true);
        this.LLJJIII = new C1559260qg8(new C723590SZx(this, C1155220gAS.class, null), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.h09;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{InteractTitleScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(InteractTitleScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(InteractTitleScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -569553815) {
            return null;
        }
        return this;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.view.IInteractTitleAbility
    public final void R0() {
        IPKCountDownTitleAbility iPKCountDownTitleAbility;
        C20441214yg.LIZIZ("InteractionTitleLayout", "onMatchEnd");
        vc2();
        ConstraintLayout constraintLayout = this.LLJJIJIL;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        C786410Ut5.LL(8, constraintLayout);
        LinearLayout linearLayout = this.LLJJJ;
        if (linearLayout == null) {
            linearLayout = null;
        }
        C786410Ut5.LJZL(8, linearLayout);
        InteractionTitleViewModel.vQ2(ip(), C15F4.LIZ);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = fragmentLJI != null ? C1558360qeg.LJFF(fragmentLJI, null) : C1558520qew.LJIIL(this);
        if (interfaceC665370Q7zLJFF == null || (iPKCountDownTitleAbility = (IPKCountDownTitleAbility) C1558520qew.LIZ(interfaceC665370Q7zLJFF, IPKCountDownTitleAbility.class, null)) == null) {
            return;
        }
        iPKCountDownTitleAbility.R0();
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.view.IInteractTitleAbility
    public final void e5() {
        IPKCountDownTitleAbility iPKCountDownTitleAbility;
        C20441214yg.LIZIZ("InteractionTitleLayout", "onMatchStart");
        InteractionTitleViewModel.vQ2(ip(), C15F4.LIZ);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558360qeg.LJFF(fragmentLJI, null);
            return;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        if (interfaceC665370Q7zLJIIL == null || (iPKCountDownTitleAbility = (IPKCountDownTitleAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, IPKCountDownTitleAbility.class, null)) == null) {
            return;
        }
        iPKCountDownTitleAbility.e5();
    }

    public final InteractionTitleViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (InteractionTitleViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C20441214yg.LIZIZ("InteractionTitleLayout", "onDestroy");
        ConstraintLayout constraintLayout = this.LLJJIJIL;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        C786410Ut5.LL(8, constraintLayout);
        LinearLayout linearLayout = this.LLJJJ;
        C786410Ut5.LJZL(8, linearLayout != null ? linearLayout : null);
        DataChannel dataChannel = ((C1155220gAS) this.LLJJIII.getValue()).LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        super.onDestroy();
    }

    public final void hp() {
        C1324720kZq c1324720kZq;
        int i = (!Intrinsics.LJFF(ip().getState().LLILLJJLI, C15F4.LIZ) || C915980Zwa.LJII().L6()) ? 8 : 0;
        C1324720kZq c1324720kZq2 = this.LLJJJJ;
        if ((c1324720kZq2 == null || c1324720kZq2.getVisibility() != i) && (c1324720kZq = this.LLJJJJ) != null) {
            C786410Ut5.LLJJIII(c1324720kZq, i);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        C1558520qew.LJII(fragmentLJI != null ? C1558360qeg.LJFF(fragmentLJI, null) : C1558520qew.LJIIL(this), this, IInteractTitleAbility.class, null, this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        C1558520qew.LJII(fragmentLJI != null ? C1558360qeg.LJFF(fragmentLJI, null) : C1558520qew.LJIIL(this), this, IInteractTitleAbility.class, null, this);
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.view.IInteractTitleAbility
    public final void vc2() {
        boolean z = (C915980Zwa.LJFF().RY(false) == EnumC964170bCJ.MATCH_START || C915980Zwa.LJFF().RY(false) == EnumC964170bCJ.PUNISH_START) && !C915980Zwa.LJII().L6();
        int size = C915980Zwa.LJII().LLILZLL(true).size();
        FrameLayout frameLayout = this.LLJJIJIIJIL;
        if (frameLayout == null) {
            frameLayout = null;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("adjustTitleViewTop,linkedNum = ");
        sbLIZ.append(size);
        sbLIZ.append(", adjustDown=");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("InteractionTitleLayout", C2188811AlT.LIZIZ(sbLIZ));
        if (size == 2) {
            layoutParams.topMargin = z ? (int) C497740JfY.LIZIZ(16.0f) : 0;
        } else {
            layoutParams.topMargin = 0;
        }
        FrameLayout frameLayout2 = this.LLJJIJIIJIL;
        C786410Ut5.a6(frameLayout2 != null ? frameLayout2 : null, layoutParams);
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.view.IInteractTitleAbility
    public final void v31() {
        vc2();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        super.onViewCreated(view);
        this.LLJJIJI = (C1091250eVH) view;
        this.LLJJIJIIJIL = (FrameLayout) view.findViewById(R.id.m_n);
        this.LLJJJJ = (C1324720kZq) view.findViewById(R.id.llg);
        this.LLJJJIL = (ConstraintLayout) view.findViewById(R.id.mc2);
        this.LLJJIJIL = (ConstraintLayout) view.findViewById(R.id.m8x);
        this.LLJJJ = (LinearLayout) view.findViewById(R.id.m8y);
        DataChannel dataChannel = ((C1155220gAS) this.LLJJIII.getValue()).LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.CQ2(BattleAdjustTitleViewTopEvent.class, this, new AwS610S0100000_31(this, 71));
            dataChannel.CQ2(NewLayoutWindowStateChangeMessage.class, this, new AwS610S0100000_31(this, 72));
        }
        C723850SaN.LIZLLL(this, new AwS581S0100000_2(this, 59));
        if (LiveMatchInvalidateGovernanceSettings.INSTANCE.isEnabled()) {
            str = "ttlive_icon_in_multi_co_host_8fps.webp";
        } else {
            str = "ttlive_icon_in_multi_co_host.webp";
        }
        C1143680frq.LJFF(this.LLJJJJ, "tiktok_live_interaction_normal_1", str, ImageView.ScaleType.CENTER_CROP, new C0IYA() { // from class: X.0b2c
            @Override // X.C0IYA, X.InterfaceC1142670fqD
            public final void LIZLLL(String str2, Exception exc) {
            }

            @Override // X.C0IYA, X.InterfaceC1142670fqD
            public final void LIZJ(int i, int i2, String str2) {
                Map<String, Boolean> map = C958110b2X.LIZ;
                C958110b2X.LJIILL(EnumC958120b2Y.CO_HOST_TITLE_BAR);
                C958110b2X.LJIILL(EnumC958120b2Y.CO_HOST_BACKGROUND);
            }
        });
        C1091250eVH c1091250eVH = this.LLJJIJI;
        LinearLayout linearLayout = null;
        if (c1091250eVH == null) {
            c1091250eVH = null;
        }
        c1091250eVH.setEnableSizeChange(true);
        C1091250eVH c1091250eVH2 = this.LLJJIJI;
        if (c1091250eVH2 == null) {
            c1091250eVH2 = null;
        }
        c1091250eVH2.setEnableFixedSize(true);
        FrameLayout frameLayout = this.LLJJIJIIJIL;
        if (frameLayout == null) {
            frameLayout = null;
        }
        C786410Ut5.LJZ(0, frameLayout);
        hp();
        ConstraintLayout constraintLayout = this.LLJJIJIL;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        C786410Ut5.LL(8, constraintLayout);
        LinearLayout linearLayout2 = this.LLJJJ;
        if (linearLayout2 != null) {
            linearLayout = linearLayout2;
        }
        C786410Ut5.LJZL(8, linearLayout);
        C736680Sv4.LJIIIZ(this, ip(), new C2217381BqS() { // from class: X.15F8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C15F9) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.15FC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C15F9) obj).LLILLL;
            }
        }, null, new AwS680S0100000_31(this, 1), 12);
    }
}
