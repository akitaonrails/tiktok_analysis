package com.bytedance.android.live.liveinteract.competition.launcher;

import X.C098200Yq;
import X.C1143680frq;
import X.C1324720kZq;
import X.C1685300txQ;
import X.C16F5;
import X.C16FS;
import X.C1776540wKa;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20337914i1;
import X.C20441214yg;
import X.C2188811AlT;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C917430Zyv;
import X.C918130a03;
import X.C948770anT;
import X.C972470bPh;
import X.C973690bRf;
import X.C973890bRz;
import X.C973930bS3;
import X.C974490bSx;
import X.C975140bU0;
import X.C978720bZm;
import X.C978750bZp;
import X.C978980baC;
import X.EnumC919170a1j;
import X.EnumC962960bAM;
import X.EnumC979710bbN;
import X.InterfaceC1106030et7;
import X.InterfaceC1631630sYr;
import X.InterfaceC21506019Ek;
import X.InterfaceC960800b6s;
import X.InterfaceC963450bB9;
import X.InterfaceC973730bRj;
import X.InterfaceC978780bZs;
import Y.ACListenerS150S0100000_15;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.liveinteract.api.HostWithGuestsModeChangeEvent;
import com.bytedance.android.live.liveinteract.competition.takestage.event.TakeStageSelectedDurationChangeEvent;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.base.settingview.UpRightIconViewModel;
import com.bytedance.android.live.liveinteract.multimatch.event.MatchPermissionData;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostMatchAutoSelectedSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostTakeTheStageDurationSelectionEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveMatchTakeStageOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchBeansSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTeamPairSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LivePlazaPanelSimplifiedInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.tag.TuxTag;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS129S1100000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class CompetitionModeChooseFragment extends CompetitionModeChooseContract$View implements InterfaceC21506019Ek {
    public static final int LLL = (int) (((double) C497740JfY.LJJI(C497740JfY.LJIILLIIL())) * 0.7d);
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4Zyw8JTUpHELIOSPSYnISoiZyMyPSsvISohZgYjJD82PCw4ICA9BSooLAw7Jyo/LAkhKSIhLCEn";
    public InterfaceC1631630sYr<? super EnumC919170a1j, ? super Boolean, ? super String, ? super Boolean, Unit> LLILZ;
    public Function0<Unit> LLILZIL;
    public Function0<Unit> LLILZLL;
    public WeakReference<InterfaceC978780bZs> LLIZ;
    public DataChannel LLIZLLLIL;
    public C16F5 LLJI;
    public ConstraintLayout LLJIJIL;
    public ConstraintLayout LLJILJIL;
    public ConstraintLayout LLJILJILJ;
    public ConstraintLayout LLJILLL;
    public C16F5 LLJJ;
    public C1324720kZq LLJJI;
    public C1324720kZq LLJJIII;
    public C1324720kZq LLJJIJI;
    public C1324720kZq LLJJIJIIJIL;
    public TuxTag LLJJIJIL;
    public TuxTag LLJJJ;
    public TuxTag LLJJJIL;
    public TuxTag LLJJJJ;
    public C978720bZm LLJJJJJIL;
    public ConstraintLayout LLJJJJLIIL;
    public View LLJJL;
    public LinearLayout LLJJLIIIJLLLLLLLZ;
    public C16FS LLJL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public String LLJZ;
    public EnumC962960bAM LLJZIJLIL;
    public C978750bZp LLJ = new C978750bZp(this);
    public EnumC919170a1j LLJLIL = EnumC919170a1j.UNKNOWN;

    @Override // com.bytedance.android.live.liveinteract.competition.launcher.CompetitionModeChooseContract$View
    public final void RR(int i) {
    }

    @Override // com.bytedance.android.live.liveinteract.competition.launcher.CompetitionModeChooseContract$View
    public final void SR(int i) {
    }

    @Override // com.bytedance.android.live.liveinteract.competition.launcher.CompetitionModeChooseContract$View
    public final void UR() {
    }

    @Override // com.bytedance.android.live.liveinteract.competition.launcher.CompetitionModeChooseContract$View
    public final void VR(int i, int i2, boolean z) {
    }

    @Override // X.InterfaceC21506019Ek
    public final /* synthetic */ void onBackStackChangeCancelled() {
    }

    @Override // X.InterfaceC21506019Ek
    public final /* synthetic */ void onBackStackChangeCommitted(Fragment fragment, boolean z) {
    }

    @Override // X.InterfaceC21506019Ek
    public final /* synthetic */ void onBackStackChangeProgressed(C1776540wKa c1776540wKa) {
    }

    @Override // X.InterfaceC21506019Ek
    public final /* synthetic */ void onBackStackChangeStarted(Fragment fragment, boolean z) {
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C978980baC OR() {
        C978980baC c978980baC = new C978980baC();
        c978980baC.LIZ = SpannableString.valueOf(C975140bU0.LIZLLL(this.LLJZIJLIL, this.LLJZ) ? C497740JfY.LJIJI(2131854925) : C915980Zwa.LJFF().k31() ? C497740JfY.LJIJI(2131846592) : C497740JfY.LJIJI(2131851794));
        c978980baC.LJIILIIL = false;
        c978980baC.LJIIIIZZ = true;
        c978980baC.LJII = this.LLJ.LIZIZ(this.LLIZLLLIL, false, this.LL, C975140bU0.LIZJ(this.LLJZIJLIL, this.LLJZ));
        c978980baC.LJIIJ = new AwS559S0100000_15(this, 110);
        c978980baC.LJIIJJI = new AwS559S0100000_15(this, 111);
        c978980baC.LIZIZ();
        return c978980baC;
    }

    public final boolean WR() {
        if (LiveMatchTakeStageOptSetting.INSTANCE.isEnableOptMatchButton()) {
            DataChannel dataChannel = this.LLIZLLLIL;
            if (!C500260Jjc.LJJJI(dataChannel != null ? (Boolean) dataChannel.gg0(MatchPermissionData.class) : null) || !this.LLJLLIL) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC21506019Ek
    public final void onBackStackChanged() {
        View rootView;
        Text text;
        if (isVisible()) {
            C978750bZp c978750bZp = new C978750bZp(this);
            this.LLJ = c978750bZp;
            c978750bZp.LIZJ(false);
            InterfaceC963450bB9 interfaceC963450bB9 = this.LL;
            if (interfaceC963450bB9 == null || (rootView = interfaceC963450bB9.getRootView()) == null) {
                return;
            }
            this.LLJ.LIZ(rootView, this.LL, new AwS559S0100000_15(this, 572));
            C978750bZp c978750bZp2 = this.LLJ;
            MultiMatchPrepareResponse multiMatchPrepareResponse = C973890bRz.LJIIJJI;
            if (multiMatchPrepareResponse == null || (text = multiMatchPrepareResponse.giftEventDesc) == null) {
                text = new Text();
                text.defaultPattern = "";
            }
            c978750bZp2.LJFF(false, text, true);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        InterfaceC978780bZs interfaceC978780bZs;
        super.onDestroyView();
        getChildFragmentManager().LLD(this);
        WeakReference<InterfaceC978780bZs> weakReference = this.LLIZ;
        if (weakReference == null || (interfaceC978780bZs = weakReference.get()) == null) {
            return;
        }
        interfaceC978780bZs.LIZIZ(this.LLJLLL);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        getChildFragmentManager().LLD(this);
        this.LL.Ja(this);
    }

    public static void aS(CompetitionModeChooseFragment competitionModeChooseFragment, boolean z) {
        competitionModeChooseFragment.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateButtonDisabled: disabled ");
        sbLIZ.append(z);
        sbLIZ.append(", allowClickWhenDisabled ");
        sbLIZ.append(true);
        C20441214yg.LJIIIZ("CompetitionModeChooseFragment", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            C16FS c16fs = competitionModeChooseFragment.LLJL;
            if (c16fs != null) {
                c16fs.setEnabled(false);
                c16fs.setAllowClickWhenDisabledCompat(true);
                c16fs.j0(R.style.a7g);
                return;
            }
            return;
        }
        C16FS c16fs2 = competitionModeChooseFragment.LLJL;
        if (c16fs2 == null) {
            return;
        }
        c16fs2.setEnabled(true);
    }

    @Override // com.bytedance.android.live.liveinteract.competition.launcher.CompetitionModeChooseContract$View
    public final void PR(Integer num, String str) {
        C978750bZp c978750bZp = this.LLJ;
        UpRightIconViewModel upRightIconViewModel = c978750bZp.LJIJJLI;
        if (upRightIconViewModel == null) {
            c978750bZp.LJIL = str;
            c978750bZp.LJJ = num;
        } else {
            upRightIconViewModel.yQ2(EnumC979710bbN.FAQ, new AwS129S1100000_15(str, num, 8));
        }
    }

    public final void ZR(EnumC919170a1j enumC919170a1j, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onItemSelected: matchType ");
        sbLIZ.append(enumC919170a1j);
        sbLIZ.append(", defaultSelected ");
        sbLIZ.append(z);
        C20441214yg.LJIIIZ("CompetitionModeChooseFragment", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJLILLLLZIIL = z;
        if (this.LLJLIL == enumC919170a1j && !z) {
            return;
        }
        this.LLJLIL = enumC919170a1j;
        if (!LiveCoHostMatchAutoSelectedSetting.INSTANCE.isEnable()) {
            C20441214yg.LJ("CompetitionModeChooseFragment", "recordChooseItemSelected return for switch is disable.");
        } else if (enumC919170a1j != EnumC919170a1j.UNKNOWN && !z) {
            if (C975140bU0.LIZLLL(this.LLJZIJLIL, this.LLJZ)) {
                InterfaceC960800b6s.LLJLLL.LJFF(Integer.valueOf(enumC919170a1j.getType()));
            }
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("recordChooseItemSelected return, matchType:");
            sbLIZ2.append(enumC919170a1j);
            sbLIZ2.append(" defaultSelected:");
            sbLIZ2.append(z);
            C20441214yg.LJ("CompetitionModeChooseFragment", C2188811AlT.LIZIZ(sbLIZ2));
        }
        aS(this, C975140bU0.LIZIZ(enumC919170a1j, null));
        boolean z2 = true;
        switch (C917430Zyv.LIZ[enumC919170a1j.ordinal()]) {
            case 1:
                ConstraintLayout constraintLayout = this.LLJIJIL;
                if (constraintLayout != null) {
                    constraintLayout.setSelected(true);
                }
                ConstraintLayout constraintLayout2 = this.LLJILJIL;
                if (constraintLayout2 != null) {
                    constraintLayout2.setSelected(false);
                }
                ConstraintLayout constraintLayout3 = this.LLJILJILJ;
                if (constraintLayout3 != null) {
                    constraintLayout3.setSelected(false);
                }
                ConstraintLayout constraintLayout4 = this.LLJILLL;
                if (constraintLayout4 != null) {
                    constraintLayout4.setSelected(false);
                }
                C16FS c16fs = this.LLJL;
                if (c16fs != null) {
                    c16fs.setText(C497740JfY.LJIJI(2131851792));
                }
                LinearLayout linearLayout = this.LLJJLIIIJLLLLLLLZ;
                if (linearLayout != null) {
                    C500260Jjc.LJIILIIL(linearLayout);
                }
                ConstraintLayout constraintLayout5 = this.LLJJJJLIIL;
                if (constraintLayout5 != null) {
                    C500260Jjc.LLFFF(constraintLayout5);
                }
                View view = this.LLJJL;
                if (view != null) {
                    C500260Jjc.LJIILIIL(view);
                }
                break;
            case 2:
                ConstraintLayout constraintLayout6 = this.LLJIJIL;
                if (constraintLayout6 != null) {
                    constraintLayout6.setSelected(true);
                }
                ConstraintLayout constraintLayout7 = this.LLJILJIL;
                if (constraintLayout7 != null) {
                    constraintLayout7.setSelected(false);
                }
                ConstraintLayout constraintLayout8 = this.LLJILJILJ;
                if (constraintLayout8 != null) {
                    constraintLayout8.setSelected(false);
                }
                ConstraintLayout constraintLayout9 = this.LLJILLL;
                if (constraintLayout9 != null) {
                    constraintLayout9.setSelected(false);
                }
                C16FS c16fs2 = this.LLJL;
                if (c16fs2 != null) {
                    c16fs2.setText(C497740JfY.LJIJI(2131853336));
                }
                LinearLayout linearLayout2 = this.LLJJLIIIJLLLLLLLZ;
                if (linearLayout2 != null) {
                    C500260Jjc.LJIILIIL(linearLayout2);
                }
                ConstraintLayout constraintLayout10 = this.LLJJJJLIIL;
                if (constraintLayout10 != null) {
                    C500260Jjc.LLFFF(constraintLayout10);
                }
                View view2 = this.LLJJL;
                if (view2 != null) {
                    C500260Jjc.LJIILIIL(view2);
                }
                break;
            case 3:
            case 4:
                ConstraintLayout constraintLayout11 = this.LLJIJIL;
                if (constraintLayout11 != null) {
                    constraintLayout11.setSelected(false);
                }
                ConstraintLayout constraintLayout12 = this.LLJILJIL;
                if (constraintLayout12 != null) {
                    constraintLayout12.setSelected(true);
                }
                ConstraintLayout constraintLayout13 = this.LLJILJILJ;
                if (constraintLayout13 != null) {
                    constraintLayout13.setSelected(false);
                }
                ConstraintLayout constraintLayout14 = this.LLJILLL;
                if (constraintLayout14 != null) {
                    constraintLayout14.setSelected(false);
                }
                if (C915980Zwa.LJII().LLILZLL(true).size() == 3) {
                    C16FS c16fs3 = this.LLJL;
                    if (c16fs3 != null) {
                        c16fs3.setText(C497740JfY.LJIJI(2131853334));
                    }
                    ConstraintLayout constraintLayout15 = this.LLJJJJLIIL;
                    if (constraintLayout15 != null) {
                        C786410Ut5.LL(0, constraintLayout15);
                    }
                    LinearLayout linearLayout3 = this.LLJJLIIIJLLLLLLLZ;
                    if (linearLayout3 != null) {
                        C500260Jjc.LJIILIIL(linearLayout3);
                    }
                } else {
                    C16FS c16fs4 = this.LLJL;
                    if (c16fs4 != null) {
                        c16fs4.setText(C497740JfY.LJIJI(2131853334));
                    }
                    LinearLayout linearLayout4 = this.LLJJLIIIJLLLLLLLZ;
                    if (linearLayout4 != null) {
                        C500260Jjc.LJIILIIL(linearLayout4);
                    }
                    ConstraintLayout constraintLayout16 = this.LLJJJJLIIL;
                    if (constraintLayout16 != null) {
                        C500260Jjc.LLFFF(constraintLayout16);
                    }
                }
                View view3 = this.LLJJL;
                if (view3 != null) {
                    C500260Jjc.LJIILIIL(view3);
                }
                break;
            case 5:
                ConstraintLayout constraintLayout17 = this.LLJIJIL;
                if (constraintLayout17 != null) {
                    constraintLayout17.setSelected(false);
                }
                ConstraintLayout constraintLayout18 = this.LLJILJIL;
                if (constraintLayout18 != null) {
                    constraintLayout18.setSelected(false);
                }
                ConstraintLayout constraintLayout19 = this.LLJILJILJ;
                if (constraintLayout19 != null) {
                    constraintLayout19.setSelected(true);
                }
                ConstraintLayout constraintLayout20 = this.LLJILLL;
                if (constraintLayout20 != null) {
                    constraintLayout20.setSelected(false);
                }
                C16FS c16fs5 = this.LLJL;
                if (c16fs5 != null) {
                    c16fs5.setText(C497740JfY.LJIJI(2131854921));
                }
                LinearLayout linearLayout5 = this.LLJJLIIIJLLLLLLLZ;
                if (linearLayout5 != null) {
                    C500260Jjc.LJIILIIL(linearLayout5);
                }
                ConstraintLayout constraintLayout21 = this.LLJJJJLIIL;
                if (constraintLayout21 != null) {
                    C500260Jjc.LJIILIIL(constraintLayout21);
                }
                View view4 = this.LLJJL;
                if (view4 != null) {
                    C500260Jjc.LJIILIIL(view4);
                }
                break;
            case 6:
                ConstraintLayout constraintLayout22 = this.LLJIJIL;
                if (constraintLayout22 != null) {
                    constraintLayout22.setSelected(false);
                }
                ConstraintLayout constraintLayout23 = this.LLJILJIL;
                if (constraintLayout23 != null) {
                    constraintLayout23.setSelected(false);
                }
                ConstraintLayout constraintLayout24 = this.LLJILJILJ;
                if (constraintLayout24 != null) {
                    constraintLayout24.setSelected(false);
                }
                ConstraintLayout constraintLayout25 = this.LLJILLL;
                if (constraintLayout25 != null) {
                    constraintLayout25.setSelected(true);
                }
                if (LivePlazaPanelSimplifiedInfo.INSTANCE.isEnable()) {
                    C16FS c16fs6 = this.LLJL;
                    if (c16fs6 != null) {
                        c16fs6.setText(C497740JfY.LJIJI(2131854921));
                    }
                } else {
                    C16FS c16fs7 = this.LLJL;
                    if (c16fs7 != null) {
                        c16fs7.setText(C497740JfY.LJIJI(2131851792));
                    }
                }
                LinearLayout linearLayout6 = this.LLJJLIIIJLLLLLLLZ;
                if (linearLayout6 != null) {
                    C500260Jjc.LJIILIIL(linearLayout6);
                }
                ConstraintLayout constraintLayout26 = this.LLJJJJLIIL;
                if (constraintLayout26 != null) {
                    C500260Jjc.LJIILIIL(constraintLayout26);
                }
                View view5 = this.LLJJL;
                if (view5 != null) {
                    C500260Jjc.LJIILIIL(view5);
                }
                break;
        }
        if (LiveMatchTeamPairSetting.INSTANCE.isEnable()) {
            View view6 = this.LLJJL;
            if (view6 != null) {
                C500260Jjc.LJIILIIL(view6);
            }
            ConstraintLayout constraintLayout27 = this.LLJJJJLIIL;
            if (constraintLayout27 != null) {
                C500260Jjc.LJIILIIL(constraintLayout27);
            }
        }
        C978720bZm c978720bZm = this.LLJJJJJIL;
        if (c978720bZm != null) {
            if (enumC919170a1j != EnumC919170a1j.MATCH_TYPE_TAKE_THE_STAGE) {
                z2 = false;
            }
            c978720bZm.i0(z2);
        }
        new C974490bSx().LJJII(enumC919170a1j, z);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Text text;
        InterfaceC978780bZs interfaceC978780bZs;
        super.onViewCreated(view, bundle);
        this.LLJI = (C16F5) view.findViewById(R.id.miu);
        this.LLJIJIL = (ConstraintLayout) view.findViewById(R.id.vor);
        this.LLJILJIL = (ConstraintLayout) view.findViewById(R.id.xfx);
        this.LLJILJILJ = (ConstraintLayout) view.findViewById(R.id.x37);
        this.LLJILLL = (ConstraintLayout) view.findViewById(R.id.di3);
        this.LLJJ = (C16F5) view.findViewById(R.id.tv_take_the_stage_subtitle_rule);
        this.LLJJI = (C1324720kZq) view.findViewById(R.id.lv9);
        this.LLJJIII = (C1324720kZq) view.findViewById(R.id.lxb);
        this.LLJJIJI = (C1324720kZq) view.findViewById(R.id.lwy);
        this.LLJJIJIIJIL = (C1324720kZq) view.findViewById(R.id.lb1);
        this.LLJJIJIL = (TuxTag) view.findViewById(R.id.lpu);
        this.LLJJJ = (TuxTag) view.findViewById(R.id.lpr);
        this.LLJJJIL = (TuxTag) view.findViewById(R.id.lpt);
        this.LLJJJJ = (TuxTag) view.findViewById(R.id.lps);
        C978720bZm c978720bZm = (C978720bZm) view.findViewById(R.id.cps);
        if (c978720bZm != null) {
            c978720bZm.setOnClick(new AwS416S0200000_15(this, c978720bZm, 56));
        } else {
            c978720bZm = null;
        }
        this.LLJJJJJIL = c978720bZm;
        boolean z = true;
        C915980Zwa.LJII().LLILZLL(true).size();
        C20337914i1<Integer> c20337914i1 = InterfaceC960800b6s.LLLIIII;
        if (c20337914i1.LIZIZ().intValue() < 3) {
            c20337914i1.LJFF(Integer.valueOf(c20337914i1.LIZIZ().intValue() + 1));
            TuxTag tuxTag = this.LLJJIJIL;
            if (tuxTag != null) {
                C500260Jjc.LLFFF(tuxTag);
            }
            TuxTag tuxTag2 = this.LLJJIJIL;
            if (tuxTag2 != null) {
                tuxTag2.setText(C497740JfY.LJIJI(2131854924));
            }
        } else {
            TuxTag tuxTag3 = this.LLJJIJIL;
            if (tuxTag3 != null) {
                C500260Jjc.LJIILIIL(tuxTag3);
            }
        }
        TuxTag tuxTag4 = this.LLJJJ;
        if (tuxTag4 != null) {
            C500260Jjc.LJIILIIL(tuxTag4);
        }
        TuxTag tuxTag5 = this.LLJJJIL;
        if (tuxTag5 != null) {
            C500260Jjc.LJIILIIL(tuxTag5);
        }
        TuxTag tuxTag6 = this.LLJJJJ;
        if (tuxTag6 != null) {
            C500260Jjc.LJIILIIL(tuxTag6);
        }
        LiveCoHostTakeTheStageDurationSelectionEnableSetting liveCoHostTakeTheStageDurationSelectionEnableSetting = LiveCoHostTakeTheStageDurationSelectionEnableSetting.INSTANCE;
        if (liveCoHostTakeTheStageDurationSelectionEnableSetting.isEnabled()) {
            C973930bS3.LJIIIIZZ("show");
            C978720bZm c978720bZm2 = this.LLJJJJJIL;
            if (c978720bZm2 != null) {
                C972470bPh.LIZLLL();
                c978720bZm2.e0(InterfaceC1106030et7.o9.LIZIZ().longValue());
                C500260Jjc.LLFFF(c978720bZm2);
            }
            C500260Jjc.LJIILIIL(this.LLJJIJIL);
        } else {
            C500260Jjc.LJIILIIL(this.LLJJJJJIL);
        }
        this.LLJJJJLIIL = (ConstraintLayout) view.findViewById(R.id.iyt);
        this.LLJJL = view.findViewById(R.id.znp);
        this.LLJJLIIIJLLLLLLLZ = (LinearLayout) view.findViewById(R.id.nkc);
        this.LLJL = (C16FS) view.findViewById(R.id.cp0);
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null) {
            interfaceC973730bRjYf2.LJJLJ(null);
        }
        C973890bRz.LIZ.LJJLJ(null);
        C973890bRz.LJII = 0L;
        this.LLJ.LIZ(view, this.LL, new AwS559S0100000_15(this, 573));
        C978750bZp c978750bZp = this.LLJ;
        MultiMatchPrepareResponse multiMatchPrepareResponse = C973890bRz.LJIIJJI;
        if (multiMatchPrepareResponse == null || (text = multiMatchPrepareResponse.giftEventDesc) == null) {
            text = new Text();
            text.defaultPattern = "";
        }
        c978750bZp.LJFF(false, text, true);
        ConstraintLayout constraintLayout = this.LLJIJIL;
        if (constraintLayout != null) {
            C786410Ut5.Y7(constraintLayout, new ACListenerS150S0100000_15(this, 176));
        }
        ConstraintLayout constraintLayout2 = this.LLJILJIL;
        if (constraintLayout2 != null) {
            C786410Ut5.Y7(constraintLayout2, new ACListenerS150S0100000_15(this, 177));
        }
        ConstraintLayout constraintLayout3 = this.LLJILJILJ;
        if (constraintLayout3 != null) {
            C786410Ut5.Y7(constraintLayout3, new ACListenerS150S0100000_15(this, 178));
        }
        ConstraintLayout constraintLayout4 = this.LLJILLL;
        if (constraintLayout4 != null) {
            C786410Ut5.Y7(constraintLayout4, new ACListenerS150S0100000_15(this, 179));
        }
        C16FS c16fs = this.LLJL;
        if (c16fs != null) {
            C786410Ut5.h8(c16fs, new ACListenerS150S0100000_15(this, 180));
        }
        C1143680frq.LJ(this.LLJJI, "tiktok_live_interaction_normal_2", "ttlive_icon_competition_choose_mode_solo.png", ImageView.ScaleType.FIT_XY);
        C1143680frq.LJ(this.LLJJIII, "tiktok_live_interaction_normal_2", "ttlive_icon_competition_choose_mode_team.png", ImageView.ScaleType.FIT_XY);
        C1143680frq.LJ(this.LLJJIJI, "tiktok_live_interaction_normal_2", "ttlive_icon_competition_choose_mode_take_stage_v2.png", ImageView.ScaleType.FIT_XY);
        C1143680frq.LJ(this.LLJJIJIIJIL, "tiktok_live_interaction_demand_10", "ttlive_icon_competition_choose_mode_catch_beans.png", ImageView.ScaleType.FIT_XY);
        if (!C975140bU0.LIZLLL(this.LLJZIJLIL, this.LLJZ) && C915980Zwa.LJFF().k31()) {
            C500260Jjc.LLFFF(this.LLJI);
        } else {
            C500260Jjc.LJIILIIL(this.LLJI);
        }
        if (!WR()) {
            C500260Jjc.LJIILIIL(this.LLJIJIL);
            C500260Jjc.LJIILIIL(this.LLJILJIL);
            C500260Jjc.LJIILIIL(this.LLJILLL);
        }
        int size = C915980Zwa.LJII().LLILZLL(true).size();
        if (size <= 2) {
            C500260Jjc.LJIILIIL(this.LLJILJIL);
        } else if (WR()) {
            C500260Jjc.LLFFF(this.LLJILJIL);
        }
        C500260Jjc.LLFFF(this.LLJILJILJ);
        if (LiveMatchBeansSettings.INSTANCE.isAnchorEnabled() && size == 2) {
            C500260Jjc.LLFFF(this.LLJILLL);
        } else {
            C500260Jjc.LJIILIIL(this.LLJILLL);
        }
        if (C975140bU0.LIZJ(this.LLJZIJLIL, this.LLJZ)) {
            C500260Jjc.LJIILIIL(this.LLJILJILJ);
            C500260Jjc.LJIILIIL(this.LLJILLL);
        } else if (C975140bU0.LIZLLL(this.LLJZIJLIL, this.LLJZ)) {
            C500260Jjc.LJIILIIL(this.LLJIJIL);
            C500260Jjc.LJIILIIL(this.LLJILJIL);
            ConstraintLayout constraintLayout5 = this.LLJJJJLIIL;
            if (constraintLayout5 != null) {
                C500260Jjc.LJIILIIL(constraintLayout5);
            }
            View view2 = this.LLJJL;
            if (view2 != null) {
                C500260Jjc.LJIILIIL(view2);
            }
        }
        EnumC919170a1j enumC919170a1j = this.LLJLIL;
        EnumC919170a1j enumC919170a1j2 = EnumC919170a1j.UNKNOWN;
        if (enumC919170a1j == enumC919170a1j2) {
            if (C975140bU0.LIZJ(this.LLJZIJLIL, this.LLJZ)) {
                if (C915980Zwa.LJII().LLILZLL(true).size() == 2) {
                    this.LLJLIL = EnumC919170a1j.MATCH_TYPE_1V1;
                } else {
                    this.LLJLIL = EnumC919170a1j.MATCH_TYPE_INDIVIDUAL;
                }
            } else if (LiveCoHostMatchAutoSelectedSetting.INSTANCE.isEnable()) {
                int size2 = C915980Zwa.LJII().LLILZLL(true).size();
                EnumC919170a1j enumC919170a1jLIZ = C918130a03.LIZ(InterfaceC960800b6s.LLJLLL.LIZIZ());
                if (size2 == 2) {
                    if (enumC919170a1jLIZ == enumC919170a1j2) {
                        enumC919170a1jLIZ = EnumC919170a1j.MATCH_TYPE_CATCH_BEANS;
                    }
                } else {
                    enumC919170a1jLIZ = EnumC919170a1j.MATCH_TYPE_TAKE_THE_STAGE;
                }
                this.LLJLIL = enumC919170a1jLIZ;
            } else {
                this.LLJLIL = EnumC919170a1j.MATCH_TYPE_TAKE_THE_STAGE;
            }
        }
        if (!WR()) {
            if (!C975140bU0.LIZJ(this.LLJZIJLIL, this.LLJZ)) {
                this.LLJLIL = EnumC919170a1j.MATCH_TYPE_TAKE_THE_STAGE;
            }
        }
        ZR(this.LLJLIL, true);
        if (liveCoHostTakeTheStageDurationSelectionEnableSetting.isEnabled()) {
            C16F5 c16f5 = this.LLJJ;
            if (c16f5 != null) {
                c16f5.setText(C497740JfY.LJIJI(2131856849));
            }
        } else {
            C16F5 c16f52 = this.LLJJ;
            if (c16f52 != null) {
                c16f52.setText(C497740JfY.LJIJI(2131854923));
            }
        }
        if (C948770anT.LJ()) {
            DataChannelGlobal.LLILZ.BQ2(this, this, HostWithGuestsModeChangeEvent.class, new AwS594S0100000_15(this, 605));
        }
        DataChannelGlobal.LLILZ.BQ2(this, this, TakeStageSelectedDurationChangeEvent.class, new AwS594S0100000_15(this, 604));
        WeakReference<InterfaceC978780bZs> weakReference = this.LLIZ;
        if (weakReference != null && (interfaceC978780bZs = weakReference.get()) != null) {
            interfaceC978780bZs.LIZ();
        }
        EnumC919170a1j enumC919170a1j3 = this.LLJLIL;
        String str = this.LLJZ;
        C16FS c16fs2 = this.LLJL;
        if (c16fs2 == null || !c16fs2.isEnabled()) {
            z = false;
        }
        C973690bRf.LJJIIZ(enumC919170a1j3, str, z);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.LLJ.LIZJ(false);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        this.LLIZLLLIL = dataChannelLJ;
        if (dataChannelLJ != null) {
            dataChannelLJ.gg0(RoomChannel.class);
        }
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.g58, viewGroup, false);
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
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
