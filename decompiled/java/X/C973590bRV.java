package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multimatch.widget.MultiMatchAnchorWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS664S0100000_15;

/* JADX INFO: renamed from: X.0bRV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973590bRV implements InterfaceC1102810env {
    public final LifecycleOwner LL;
    public DataChannel LLILLJJLI;
    public InterfaceC785120Ur0 LLILLL;
    public LiveIconView LLILZ;
    public boolean LLILZIL;
    public C20743416Fc LLILZLL;
    public MultiMatchAnchorWidget LLIZ;
    public C973600bRW LLIZLLLIL;
    public EnumC973650bRb LLJ = EnumC973650bRb.UNKNOWN;

    @Override // X.InterfaceC1102810env
    public final void J() {
    }

    @Override // X.InterfaceC1102810env
    public final Integer LIZJ() {
        return null;
    }

    @Override // X.InterfaceC1102810env
    public final Integer LJ() {
        return null;
    }

    @Override // X.InterfaceC1102810env
    public final void LLILLJJLI() {
    }

    @Override // X.InterfaceC1102810env
    public final void LLILZ() {
    }

    @Override // X.InterfaceC1102810env
    public final boolean f1() {
        return false;
    }

    @Override // X.InterfaceC1102810env
    public final long g0() {
        return 500L;
    }

    @Override // X.InterfaceC1102810env
    public final boolean x0(View view) {
        return false;
    }

    public final void LJIIIZ() {
        LiveIconView liveIconView = this.LLILZ;
        if (liveIconView != null) {
            liveIconView.setImageResource(R.drawable.ew4);
        }
        LJIIJ(EnumC919170a1j.UNKNOWN);
        LJIIIIZZ(EnumC973650bRb.NORMAL);
    }

    @Override // X.InterfaceC1102810env
    public final C0KX7 LIZ() {
        return C0KX7.FIXED;
    }

    public C973590bRV(LifecycleOwner lifecycleOwner) {
        this.LL = lifecycleOwner;
    }

    public final void LJIIIIZZ(EnumC973650bRb enumC973650bRb) {
        InterfaceC785120Ur0 interfaceC785120Ur0 = this.LLILLL;
        if (interfaceC785120Ur0 != null && interfaceC785120Ur0.getVisibility() == 0 && enumC973650bRb != this.LLJ) {
            this.LLJ = enumC973650bRb;
            C973660bRc.LIZ.LJLIIL("plaza_icon", true);
        }
    }

    public final void LJIIJ(EnumC919170a1j enumC919170a1j) {
        String strLJIJI;
        C20743416Fc c20743416Fc = this.LLILZLL;
        if (c20743416Fc != null) {
            int i = C972260bPM.LIZJ[enumC919170a1j.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    strLJIJI = C497740JfY.LJIJI(2131854925);
                } else {
                    strLJIJI = C497740JfY.LJIJI(2131851818);
                }
            } else {
                strLJIJI = C497740JfY.LJIJI(2131851529);
            }
            c20743416Fc.setText(strLJIJI);
        }
    }

    public final void LJIIJJI(int i) {
        InterfaceC785120Ur0 interfaceC785120Ur0 = this.LLILLL;
        if (interfaceC785120Ur0 != null) {
            interfaceC785120Ur0.setVisibility(i);
        }
        EnumC973650bRb enumC973650bRb = this.LLJ;
        if (enumC973650bRb == EnumC973650bRb.UNKNOWN) {
            enumC973650bRb = EnumC973650bRb.NORMAL;
        }
        LJIIIIZZ(enumC973650bRb);
    }

    @Override // X.InterfaceC1102810env
    public final void onClick(View view) {
        EnumC1120860fH2 enumC1120860fH2;
        if (C915980Zwa.LJII().LLLLJ() == EnumC955820ayq.COHOST_MODE_SCREEN_SHARE) {
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131851755));
            return;
        }
        MultiMatchAnchorWidget multiMatchAnchorWidget = this.LLIZ;
        if (multiMatchAnchorWidget != null) {
            C973660bRc c973660bRc = C973660bRc.LIZ;
            C973600bRW c973600bRW = this.LLIZLLLIL;
            if (c973600bRW != null) {
                enumC1120860fH2 = c973600bRW.LIZLLL;
            } else {
                enumC1120860fH2 = null;
            }
            String str = "plaza_icon";
            if (enumC1120860fH2 != null) {
                int i = C973610bRX.LIZ[enumC1120860fH2.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        str = "take_stage_guide_v2";
                    }
                } else {
                    str = "catch_bean_guide";
                }
            }
            multiMatchAnchorWidget.S1(str, null);
        }
        C973600bRW c973600bRW2 = this.LLIZLLLIL;
        if (c973600bRW2 != null) {
            c973600bRW2.LJ();
        }
    }

    @Override // X.InterfaceC1102810env
    public final void LIZIZ(C1099960ejK c1099960ejK, C945840aik c945840aik) {
        boolean zBooleanValue;
        View viewLJ;
        Boolean bool;
        DataChannel dataChannel = c1099960ejK.LIZJ;
        this.LLILLJJLI = dataChannel;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(C780690Ujr.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLILZIL = zBooleanValue;
        this.LLILLL = c945840aik;
        this.LLILZ = (LiveIconView) c945840aik.findViewById(R.id.y74);
        if (this.LLILZIL) {
            C20743416Fc c20743416Fc = (C20743416Fc) c945840aik.findViewById(R.id.y7s);
            this.LLILZLL = c20743416Fc;
            if (c20743416Fc != null) {
                c20743416Fc.setText(C497740JfY.LJIJI(2131854925));
            }
        }
        DataChannel dataChannel2 = this.LLILLJJLI;
        if (dataChannel2 != null) {
            C975230bU9.LJI(dataChannel2, this.LL, new AwS664S0100000_15(this, 22));
        }
        InterfaceC785120Ur0 interfaceC785120Ur0 = this.LLILLL;
        if (interfaceC785120Ur0 != null) {
            viewLJ = interfaceC785120Ur0.LJ();
        } else {
            viewLJ = null;
        }
        C973600bRW c973600bRW = new C973600bRW(viewLJ, this.LLILLJJLI, "plaza_icon");
        this.LLIZLLLIL = c973600bRW;
        c973600bRW.LJFF();
    }

    @Override // X.InterfaceC1102810env
    public final void LIZLLL(C1099960ejK c1099960ejK, InterfaceC785120Ur0 interfaceC785120Ur0) {
        this.LLIZ = null;
    }

    public final void LJI(EnumC964170bCJ enumC964170bCJ, boolean z) {
        C973600bRW c973600bRW;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleCatchBeansState: state ");
        sbLIZ.append(enumC964170bCJ);
        sbLIZ.append(", isRematch ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("ToolbarInteractivePlazaBehavior", C2188811AlT.LIZIZ(sbLIZ));
        if (enumC964170bCJ == null) {
            return;
        }
        EnumC964170bCJ enumC964170bCJ2 = EnumC964170bCJ.MATCH_START;
        if (enumC964170bCJ == enumC964170bCJ2 && (c973600bRW = this.LLIZLLLIL) != null) {
            c973600bRW.LIZ();
            InterfaceC1106030et7.R4.LJFF(1);
        }
        if (enumC964170bCJ.compareTo(EnumC964170bCJ.INVITED) >= 0 && enumC964170bCJ.compareTo(EnumC964170bCJ.ACCEPTED) <= 0) {
            LJIIIZ();
            return;
        }
        if ((enumC964170bCJ.compareTo(enumC964170bCJ2) < 0 || enumC964170bCJ.compareTo(EnumC964170bCJ.MATCH_END) >= 0) && !z) {
            LJIIIZ();
            return;
        }
        LiveIconView liveIconView = this.LLILZ;
        if (liveIconView != null) {
            liveIconView.setImageResource(R.drawable.etm);
        }
        LJIIJ(EnumC919170a1j.MATCH_TYPE_CATCH_BEANS);
        LJIIIIZZ(EnumC973650bRb.BEANS);
    }

    public final void LJII(EnumC964170bCJ enumC964170bCJ, boolean z) {
        C973600bRW c973600bRW;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleTakeTheStageState: state ");
        sbLIZ.append(enumC964170bCJ);
        sbLIZ.append(", isRematch ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("ToolbarInteractivePlazaBehavior", C2188811AlT.LIZIZ(sbLIZ));
        if (enumC964170bCJ == null) {
            return;
        }
        EnumC964170bCJ enumC964170bCJ2 = EnumC964170bCJ.MATCH_START;
        if (enumC964170bCJ == enumC964170bCJ2) {
            C973600bRW c973600bRW2 = this.LLIZLLLIL;
            if (c973600bRW2 != null) {
                c973600bRW2.LIZ();
                InterfaceC960800b6s.LLL.LJFF(1);
                C473410IhP.LIZ().removeCallbacks(c973600bRW2.LJFF);
                C786410Ut5.LJLIIL(10000L, C473410IhP.LIZ(), c973600bRW2.LJFF);
                Integer numLIZIZ = InterfaceC960800b6s.LLLF.LIZIZ();
                if (numLIZIZ != null && numLIZIZ.intValue() == 0) {
                    C473410IhP.LIZ().removeCallbacks(c973600bRW2.LJII);
                    C786410Ut5.LJLIIL(10000L, C473410IhP.LIZ(), c973600bRW2.LJII);
                }
            }
        } else if ((enumC964170bCJ == EnumC964170bCJ.MATCH_END || enumC964170bCJ == EnumC964170bCJ.NONE) && (c973600bRW = this.LLIZLLLIL) != null) {
            c973600bRW.LIZLLL(false);
            C473410IhP.LIZ().removeCallbacks(c973600bRW.LJFF);
        }
        if (enumC964170bCJ.compareTo(EnumC964170bCJ.INVITED) >= 0 && enumC964170bCJ.compareTo(EnumC964170bCJ.ACCEPTED) <= 0) {
            LJIIIZ();
            return;
        }
        if ((enumC964170bCJ.compareTo(enumC964170bCJ2) < 0 || enumC964170bCJ.compareTo(EnumC964170bCJ.MATCH_END) >= 0) && !z) {
            LJIIIZ();
            return;
        }
        LiveIconView liveIconView = this.LLILZ;
        if (liveIconView != null) {
            liveIconView.setImageResource(R.drawable.etv);
        }
        LJIIJ(EnumC919170a1j.MATCH_TYPE_TAKE_THE_STAGE);
        LJIIIIZZ(EnumC973650bRb.STAGE);
    }

    public static void LJFF(C973590bRV c973590bRV, EnumC964170bCJ enumC964170bCJ, boolean z, int i) {
        C973600bRW c973600bRW;
        if ((i & 4) != 0) {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleBattleState: state ");
        sbLIZ.append(enumC964170bCJ);
        sbLIZ.append(", source ");
        sbLIZ.append(0);
        sbLIZ.append(", isRematch ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("ToolbarInteractivePlazaBehavior", C2188811AlT.LIZIZ(sbLIZ));
        if (enumC964170bCJ != null) {
            if ((enumC964170bCJ == EnumC964170bCJ.MATCH_START || enumC964170bCJ == EnumC964170bCJ.INVITED || enumC964170bCJ == EnumC964170bCJ.RECEIVED) && (c973600bRW = c973590bRV.LLIZLLLIL) != null) {
                c973600bRW.LIZ();
            }
        }
    }
}
