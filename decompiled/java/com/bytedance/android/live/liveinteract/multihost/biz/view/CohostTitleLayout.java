package com.bytedance.android.live.liveinteract.multihost.biz.view;

import X.C019F;
import X.C0IYA;
import X.C0ZP4;
import X.C1091250eVH;
import X.C1143680frq;
import X.C1155220gAS;
import X.C1324720kZq;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C15F4;
import X.C15F9;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C915980Zwa;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.multihost.biz.viewmodel.InteractionTitleViewModel;
import com.bytedance.android.live.liveinteract.multihost.core.model.NewLayoutWindowStateChangeMessage;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchInvalidateGovernanceSettings;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS645S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class CohostTitleLayout extends UISlotAssem implements ICoHostTitleAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final AssemVMLazy LLJJI;
    public C0ZP4 LLJJIII;
    public final C1559260qg8 LLJJIJI;
    public C1091250eVH LLJJIJIIJIL;
    public FrameLayout LLJJIJIL;
    public ConstraintLayout LLJJJ;
    public C1324720kZq LLJJJIL;
    public DataChannel LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CohostTitleLayout.class, "titleContainerVM", "getTitleContainerVM()Lcom/bytedance/android/live/liveinteract/multihost/biz/viewmodel/InteractionTitleViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CohostTitleLayout() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InteractionTitleViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 38), AFwS276S0000000_31.get$arr$(18), null, true);
        this.LLJJIJI = new C1559260qg8(new C723590SZx(this, C1155220gAS.class, null), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.gyg;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final void hp() {
        C1324720kZq c1324720kZq;
        boolean zL6 = C915980Zwa.LJII().L6();
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        int i = (!Intrinsics.LJFF(((C15F9) assemVMLazy.getValue().getState()).LLILLJJLI, C15F4.LIZ) || zL6) ? 8 : 0;
        C1324720kZq c1324720kZq2 = this.LLJJJIL;
        if ((c1324720kZq2 == null || c1324720kZq2.getVisibility() != i) && (c1324720kZq = this.LLJJJIL) != null) {
            C786410Ut5.LLJJIII(c1324720kZq, i);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C0ZP4 c0zp4;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        C1558520qew.LJIIJJI(fragmentLJI != null ? C1558360qeg.LJFF(fragmentLJI, null) : C1558520qew.LJIIL(this), ICoHostTitleAbility.class, null);
        C0ZP4 c0zp42 = this.LLJJIII;
        if (c0zp42 != null && !c0zp42.isDisposed() && (c0zp4 = this.LLJJIII) != null) {
            c0zp4.dispose();
        }
        DataChannel dataChannel = this.LLJJJJ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        super.onDestroy();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        C1558520qew.LJII(fragmentLJI != null ? C1558360qeg.LJFF(fragmentLJI, null) : C1558520qew.LJIIL(this), this, ICoHostTitleAbility.class, null, this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        super.onViewCreated(view);
        this.LLJJJJ = ((C1155220gAS) this.LLJJIJI.getValue()).LLILLJJLI;
        this.LLJJIJIIJIL = (C1091250eVH) view;
        this.LLJJIJIL = (FrameLayout) view.findViewById(R.id.m_n);
        this.LLJJJIL = (C1324720kZq) view.findViewById(R.id.llg);
        this.LLJJJ = (ConstraintLayout) view.findViewById(R.id.mc2);
        if (LiveMatchInvalidateGovernanceSettings.INSTANCE.isEnabled()) {
            str = "ttlive_icon_in_multi_co_host_8fps.webp";
        } else {
            str = "ttlive_icon_in_multi_co_host.webp";
        }
        C1143680frq.LJFF(this.LLJJJIL, "tiktok_live_interaction_normal_1", str, ImageView.ScaleType.CENTER_CROP, new C0IYA() { // from class: X.0b2b
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
        C1091250eVH c1091250eVH = this.LLJJIJIIJIL;
        if (c1091250eVH != null) {
            c1091250eVH.setEnableSizeChange(true);
        }
        C1091250eVH c1091250eVH2 = this.LLJJIJIIJIL;
        if (c1091250eVH2 != null) {
            c1091250eVH2.setEnableFixedSize(true);
        }
        FrameLayout frameLayout = this.LLJJIJIL;
        if (frameLayout != null) {
            C786410Ut5.LJZ(0, frameLayout);
        }
        hp();
        DataChannel dataChannel = ((C1155220gAS) this.LLJJIJI.getValue()).LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.CQ2(NewLayoutWindowStateChangeMessage.class, this, new AwS610S0100000_31(this, 70));
        }
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        this.LLJJIII = C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.15F3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C15F9) obj).LLILLJJLI;
            }
        }, null, new AwS645S0100000_31(this, 14), 6);
    }
}
