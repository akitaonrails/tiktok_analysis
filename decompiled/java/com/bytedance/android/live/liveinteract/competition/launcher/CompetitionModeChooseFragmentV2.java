package com.bytedance.android.live.liveinteract.competition.launcher;

import X.AbstractC21673719rz;
import X.AbstractC21674919sB;
import X.AbstractC979780bbU;
import X.C01HZ;
import X.C098200Yq;
import X.C0J8P;
import X.C0R9K;
import X.C1117360fBO;
import X.C1161920gLG;
import X.C163000js;
import X.C1685300txQ;
import X.C176600m4;
import X.C1776540wKa;
import X.C1844500y6C;
import X.C1845100y7A;
import X.C1845110y7B;
import X.C1845120y7C;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20337914i1;
import X.C20399014rs;
import X.C497740JfY;
import X.C786410Ut5;
import X.C790810V0l;
import X.C915900ZwS;
import X.C915980Zwa;
import X.C948770anT;
import X.C973890bRz;
import X.C975140bU0;
import X.C978700bZk;
import X.C978730bZn;
import X.C978750bZp;
import X.C978770bZr;
import X.C978790bZt;
import X.C978800bZu;
import X.C978820bZw;
import X.C978880ba2;
import X.C978980baC;
import X.C979040baI;
import X.C979070baL;
import X.C979570bb9;
import X.C979690bbL;
import X.C979730bbP;
import X.C979810bbX;
import X.C979860bbc;
import X.C979930bbj;
import X.C980050bbv;
import X.C980060bbw;
import X.C980350bcP;
import X.C985960blS;
import X.C986010blX;
import X.EnumC499801x6;
import X.EnumC919170a1j;
import X.EnumC962960bAM;
import X.EnumC979710bbN;
import X.InterfaceC1106030et7;
import X.InterfaceC1631630sYr;
import X.InterfaceC1844530y6F;
import X.InterfaceC21506019Ek;
import X.InterfaceC975870bVB;
import X.InterfaceC978780bZs;
import X.RunnableC781530UlD;
import Y.ACListenerS150S0100000_15;
import Y.ARunnableS84S0200000_15;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.api.HostWithGuestsModeChangeEvent;
import com.bytedance.android.live.liveinteract.competition.takestage.event.TakeStageCustomSettingsPanelSendInvitationEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.biz.PlaybookBizDataChanged;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.base.settingview.UpRightIconViewModel;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS129S1100000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class CompetitionModeChooseFragmentV2 extends CompetitionModeChooseContract$View implements InterfaceC21506019Ek {
    public static final int LLJJIJI = (int) (((double) C497740JfY.LJJI(C497740JfY.LJIILLIIL())) * 0.7d);
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4Zyw8JTUpPSHELIOSYnISoiZyMyPSsvISohZgYjJD82PCw4ICA9BSooLAw7Jyo/LAkhKSIhLCEnHnc=";
    public InterfaceC1631630sYr<? super EnumC919170a1j, ? super Boolean, ? super String, ? super Boolean, Unit> LLILZ;
    public Function0<Unit> LLILZIL;
    public Function0<Unit> LLILZLL;
    public C979690bbL LLIZ;
    public boolean LLIZLLLIL;
    public String LLJ;
    public EnumC962960bAM LLJI;
    public DataChannel LLJIJIL;
    public RunnableC781530UlD LLJILJIL;
    public C979570bb9 LLJILLL;
    public TuxPanel LLJJ;
    public int LLJJI;
    public final C1117360fBO LLJILJILJ = new C1117360fBO();
    public final long LLJJIII = System.currentTimeMillis();

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
        c978980baC.LIZ = SpannableString.valueOf(C975140bU0.LIZLLL(this.LLJI, this.LLJ) ? C497740JfY.LJIJI(2131854925) : C915980Zwa.LJFF().k31() ? C497740JfY.LJIJI(2131846592) : C497740JfY.LJIJI(2131851794));
        c978980baC.LJIILIIL = false;
        c978980baC.LJIIIIZZ = true;
        C979570bb9 c979570bb9 = this.LLJILLL;
        c978980baC.LJII = c979570bb9 != null ? c979570bb9.LJ.LIZIZ(c979570bb9.LIZLLL, false, c979570bb9.LIZIZ, C975140bU0.LIZJ(this.LLJI, this.LLJ)) : null;
        c978980baC.LJIIJ = new AwS559S0100000_15(this, 112);
        c978980baC.LJIIJJI = new AwS559S0100000_15(this, 113);
        c978980baC.LJIJI = 0;
        c978980baC.LIZ();
        c978980baC.LIZIZ();
        return c978980baC;
    }

    @Override // com.bytedance.android.live.liveinteract.competition.launcher.CompetitionModeChooseContract$View
    public final void UR() {
        C1117360fBO c1117360fBO = this.LLJILJILJ;
        c1117360fBO.LL = ((AbstractC979780bbU) this.LLILLL).LLILLJJLI;
        c1117360fBO.notifyDataSetChanged();
        DataChannel dataChannel = this.LLJIJIL;
        if (dataChannel != null) {
            dataChannel.FQ2(PlaybookBizDataChanged.class);
        }
    }

    @Override // X.InterfaceC21506019Ek
    public final void onBackStackChanged() {
        View view;
        Text text;
        if (isVisible()) {
            C979570bb9 c979570bb9 = this.LLJILLL;
            if (c979570bb9 != null) {
                C978750bZp c978750bZp = new C978750bZp(c979570bb9.LIZJ);
                c979570bb9.LJ = c978750bZp;
                c978750bZp.LIZJ(false);
                C979730bbP c979730bbP = c979570bb9.LJFF;
                if (c979730bbP != null && (view = c979730bbP.LLILZ) != null) {
                    c979570bb9.LJ.LIZ(view, c979570bb9.LIZIZ, new AwS559S0100000_15(c979570bb9, 634));
                    C978750bZp c978750bZp2 = c979570bb9.LJ;
                    MultiMatchPrepareResponse multiMatchPrepareResponse = C973890bRz.LJIIJJI;
                    if (multiMatchPrepareResponse == null || (text = multiMatchPrepareResponse.giftEventDesc) == null) {
                        text = new Text();
                        text.defaultPattern = "";
                    }
                    c978750bZp2.LJFF(false, text, true);
                }
            }
            RR(this.LLJJI);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        TuxPanel tuxPanel = this.LLJJ;
        if (tuxPanel != null) {
            tuxPanel.dismiss();
        }
        C01HZ c01hzKi1 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ki1();
        if (c01hzKi1 != null) {
            c01hzKi1.LIZ(EnumC499801x6.PLAYBOOK, C915900ZwS.LIZIZ("match_panel"));
        }
        C01HZ c01hzKi12 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ki1();
        if (c01hzKi12 != null) {
            c01hzKi12.LIZ(EnumC499801x6.PLAYBOOK, C915900ZwS.LIZIZ("match_icon"));
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        WeakReference<InterfaceC978780bZs> weakReference;
        InterfaceC978780bZs interfaceC978780bZs;
        InterfaceC975870bVB interfaceC975870bVBLJFF;
        InterfaceC975870bVB interfaceC975870bVBLJFF2;
        super.onDestroyView();
        getChildFragmentManager().LLD(this);
        if (this.LLIZ != null && (interfaceC975870bVBLJFF2 = C915980Zwa.LJI().LJFF()) != null) {
            interfaceC975870bVBLJFF2.LIZ();
        }
        if (this.LLIZLLLIL && (interfaceC975870bVBLJFF = C915980Zwa.LJI().LJFF()) != null) {
            interfaceC975870bVBLJFF.LIZIZ(false);
        }
        C979690bbL c979690bbL = this.LLIZ;
        if (c979690bbL == null || (weakReference = c979690bbL.LIZ) == null || (interfaceC978780bZs = weakReference.get()) == null) {
            return;
        }
        interfaceC978780bZs.LIZIZ(this.LLIZLLLIL);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        getChildFragmentManager().LLD(this);
        this.LL.Ja(this);
    }

    @Override // com.bytedance.android.live.liveinteract.competition.launcher.CompetitionModeChooseContract$View
    public final void RR(int i) {
        this.LL.uC(this.LLJJI, i);
        this.LLJJI = i;
    }

    @Override // com.bytedance.android.live.liveinteract.competition.launcher.CompetitionModeChooseContract$View
    public final void SR(int i) {
        this.LLJILJILJ.notifyItemChanged(i);
    }

    @Override // com.bytedance.android.live.liveinteract.competition.launcher.CompetitionModeChooseContract$View
    public final void PR(Integer num, String str) {
        C979570bb9 c979570bb9 = this.LLJILLL;
        if (c979570bb9 != null) {
            C978750bZp c978750bZp = c979570bb9.LJ;
            UpRightIconViewModel upRightIconViewModel = c978750bZp.LJIJJLI;
            if (upRightIconViewModel == null) {
                c978750bZp.LJIL = str;
                c978750bZp.LJJ = num;
            } else {
                upRightIconViewModel.yQ2(EnumC979710bbN.FAQ, new AwS129S1100000_15(str, num, 8));
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC21673719rz itemAnimator;
        C19EG activity;
        FragmentManager supportFragmentManager;
        Context context;
        Boolean boolValueOf;
        String str;
        AbstractC21673719rz itemAnimator2;
        AbstractC21674919sB abstractC21674919sB;
        super.onViewCreated(view, bundle);
        InterfaceC975870bVB interfaceC975870bVBLJFF = C915980Zwa.LJI().LJFF();
        if (interfaceC975870bVBLJFF != null) {
            interfaceC975870bVBLJFF.LJIIIZ("1000");
        }
        RunnableC781530UlD runnableC781530UlD = (RunnableC781530UlD) view.findViewById(R.id.tx0);
        this.LLJILJIL = runnableC781530UlD;
        if (runnableC781530UlD != null) {
            runnableC781530UlD.setAdapter(this.LLJILJILJ);
        }
        RunnableC781530UlD runnableC781530UlD2 = this.LLJILJIL;
        if (runnableC781530UlD2 != null) {
            runnableC781530UlD2.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        RunnableC781530UlD runnableC781530UlD3 = this.LLJILJIL;
        if (runnableC781530UlD3 != null) {
            itemAnimator = runnableC781530UlD3.getItemAnimator();
        } else {
            itemAnimator = null;
        }
        if (itemAnimator instanceof AbstractC21674919sB) {
            RunnableC781530UlD runnableC781530UlD4 = this.LLJILJIL;
            if (runnableC781530UlD4 != null) {
                itemAnimator2 = runnableC781530UlD4.getItemAnimator();
            } else {
                itemAnimator2 = null;
            }
            if ((itemAnimator2 instanceof AbstractC21674919sB) && (abstractC21674919sB = (AbstractC21674919sB) itemAnimator2) != null) {
                abstractC21674919sB.LLIZ = false;
            }
        }
        RunnableC781530UlD runnableC781530UlD5 = this.LLJILJIL;
        if (runnableC781530UlD5 != null) {
            DataChannel dataChannel = this.LLJIJIL;
            C979690bbL c979690bbL = this.LLIZ;
            if (c979690bbL != null) {
                boolValueOf = Boolean.valueOf(c979690bbL.LIZJ);
            } else {
                boolValueOf = null;
            }
            if (C176600m4.LIZIZ(boolValueOf)) {
                str = "room_banner";
            } else {
                str = "match_icon";
            }
            C985960blS.LIZ(runnableC781530UlD5, this, dataChannel, new C986010blX("match_panel", LSPassThroughRecordSizeConfig.DEFAULT, "match_panel", str));
        }
        this.LLJILJILJ.LLLI(C978880ba2.class, new C0J8P<C978880ba2, C980050bbv>() { // from class: X.0bbg
            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                final View viewTd = C786410Ut5.Td(layoutInflater, R.layout.h7q, viewGroup, false);
                return new RecyclerView.ViewHolder(viewTd) { // from class: X.0bbv
                };
            }

            @Override // X.C0J8P
            public final /* bridge */ /* synthetic */ void LIZJ(RecyclerView.ViewHolder viewHolder, C978880ba2 c978880ba2) {
            }
        });
        this.LLJILJILJ.LLLI(C978700bZk.class, new C0J8P<C978700bZk, C978730bZn>() { // from class: X.0bZl
            @Override // X.C0J8P
            public final void LIZJ(RecyclerView.ViewHolder viewHolder, C978700bZk c978700bZk) {
                String str2;
                C978730bZn c978730bZn = (C978730bZn) viewHolder;
                C978700bZk c978700bZk2 = c978700bZk;
                c978730bZn.LLILLJJLI.setText(c978700bZk2.LIZ);
                c978730bZn.LLILZ.setText(c978700bZk2.LIZIZ);
                if (c978700bZk2.LJ == EnumC919170a1j.MATCH_TYPE_CATCH_BEANS) {
                    str2 = "tiktok_live_interaction_demand_10";
                } else {
                    str2 = "tiktok_live_interaction_normal_2";
                }
                C1143680frq.LJ(c978730bZn.LLILZIL, str2, c978700bZk2.LIZJ, ImageView.ScaleType.FIT_XY);
                c978730bZn.LLILLL.setText(c978700bZk2.LIZLLL);
                if (c978700bZk2.LJI) {
                    C500260Jjc.LLFFF(c978730bZn.LLILLL);
                } else {
                    C500260Jjc.LJIILIIL(c978730bZn.LLILLL);
                }
                c978730bZn.LLILZLL.setOnClick(new AwS559S0100000_15(c978700bZk2, 635));
                if (c978700bZk2.LJII) {
                    C500260Jjc.LLFFF(c978730bZn.LLILZLL);
                    if (c978700bZk2.LJIIIIZZ) {
                        c978730bZn.LLILZLL.h0();
                    } else {
                        c978730bZn.LLILZLL.e0(c978700bZk2.LJIIJ);
                    }
                    c978730bZn.LLILZLL.i0(c978700bZk2.LJIIIZ);
                } else {
                    C500260Jjc.LJIILIIL(c978730bZn.LLILZLL);
                }
                if (c978700bZk2.LJFF) {
                    c978730bZn.LL.setBackgroundResource(R.drawable.doo);
                } else {
                    c978730bZn.LL.setBackgroundResource(R.drawable.doq);
                }
                C786410Ut5.I7(new ACListenerS150S0100000_15(c978700bZk2, 211), c978730bZn.itemView);
            }

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new C978730bZn(C786410Ut5.Td(layoutInflater, R.layout.h7r, viewGroup, false));
            }
        });
        C979570bb9 c979570bb9 = new C979570bb9(this.LL, this, this.LLJIJIL);
        this.LLJILLL = c979570bb9;
        this.LLJILJILJ.LLLI(C978790bZt.class, c979570bb9);
        this.LLJILJILJ.LLLI(C978800bZu.class, new C0J8P<C978800bZu, C979810bbX>() { // from class: X.0bbJ
            @Override // X.C0J8P
            public final void LIZJ(RecyclerView.ViewHolder viewHolder, C978800bZu c978800bZu) {
                C979810bbX c979810bbX = (C979810bbX) viewHolder;
                c979810bbX.getClass();
                if (c978800bZu.LIZ == 1) {
                    C786410Ut5.LLJJJJ(c979810bbX.LLILLL, 0);
                    C786410Ut5.LLJJIJIL(c979810bbX.LLILLJJLI, 0);
                    C786410Ut5.LJZL(0, c979810bbX.LL);
                } else {
                    C786410Ut5.LLJJJJ(c979810bbX.LLILLL, 8);
                    C786410Ut5.LLJJIJIL(c979810bbX.LLILLJJLI, 8);
                    C786410Ut5.LJZL(8, c979810bbX.LL);
                }
            }

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new C979810bbX(C786410Ut5.Td(layoutInflater, R.layout.h7s, viewGroup, false));
            }
        });
        this.LLJILJILJ.LLLI(C790810V0l.class, new C0J8P<C790810V0l, C979930bbj>() { // from class: X.0bbI
            @Override // X.C0J8P
            public final void LIZJ(RecyclerView.ViewHolder viewHolder, C790810V0l c790810V0l) {
                int i;
                C979930bbj c979930bbj = (C979930bbj) viewHolder;
                c979930bbj.LL.setText(C497740JfY.LJIJI(2131853727));
                C16F5 c16f5 = c979930bbj.LL;
                if (c790810V0l.LIZ == 1) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LLJJJJ(c16f5, i);
            }

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new C979930bbj(C786410Ut5.Td(layoutInflater, R.layout.h7p, viewGroup, false));
            }
        });
        this.LLJILJILJ.LLLI(C978770bZr.class, new C0J8P<C978770bZr, C978820bZw>() { // from class: X.0bZv
            @Override // X.C0J8P
            public final void LIZJ(RecyclerView.ViewHolder viewHolder, C978770bZr c978770bZr) {
                C978820bZw c978820bZw = (C978820bZw) viewHolder;
                C978770bZr c978770bZr2 = c978770bZr;
                c978820bZw.LL.setText(c978770bZr2.LIZIZ);
                if (c978770bZr2.LIZ) {
                    c978820bZw.LL.setEnabled(true);
                } else {
                    c978820bZw.LL.setEnabled(false);
                    c978820bZw.LL.setAllowClickWhenDisabledCompat(c978770bZr2.LIZJ);
                    c978820bZw.LL.j0(R.style.a7g);
                }
                C786410Ut5.h8(c978820bZw.LL, new ACListenerS150S0100000_15(c978770bZr2, 210));
            }

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new C978820bZw(C786410Ut5.Td(layoutInflater, R.layout.h7n, viewGroup, false));
            }
        });
        this.LLJILJILJ.LLLI(C979040baI.class, new C1844500y6C((InterfaceC1844530y6F) this.LLILLL));
        C1117360fBO c1117360fBO = this.LLJILJILJ;
        DataChannel dataChannel2 = this.LLJIJIL;
        c1117360fBO.LLLI(C980060bbw.class, new C20399014rs(dataChannel2, C979070baL.LIZJ(dataChannel2, this.LLJILJILJ, new C979860bbc(this), false, null, 24), new C980350bcP(Integer.valueOf(R.attr.exe))));
        if (C948770anT.LJ()) {
            DataChannelGlobal.LLILZ.BQ2(this, this, HostWithGuestsModeChangeEvent.class, new AwS594S0100000_15(this, 598));
        }
        ((AbstractC979780bbU) this.LLILLL).LJIIJ();
        C0R9K.LIZ(view, new ARunnableS84S0200000_15(this, view, 10));
        C01HZ c01hzKi1 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ki1();
        if (c01hzKi1 != null) {
            c01hzKi1.LIZIZ(EnumC499801x6.PLAYBOOK, C915900ZwS.LIZIZ("match_panel"), null);
        }
        if (C975140bU0.LIZJ(this.LLJI, this.LLJ) && C163000js.LIZ()) {
            C20337914i1<Integer> c20337914i1 = InterfaceC1106030et7.N4;
            if (c20337914i1.LIZIZ().intValue() < 1 && (activity = getActivity()) != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && (context = getContext()) != null) {
                this.LLJJ = C1845100y7A.LIZIZ(context, supportFragmentManager, new C1845110y7B(C497740JfY.LJIJI(2131853714), new C1845120y7C(C497740JfY.LJIJI(2131853721), new AwS629S0100000_15(this, 57), true), new C1845120y7C(C497740JfY.LJIJI(2131853668), new AwS629S0100000_15(this, 58), true), "pk_icon", this.LLJIJIL, "show_turn_on_button", false, "turn_on", "close", false));
                c20337914i1.LJFF(Integer.valueOf(c20337914i1.LIZIZ().intValue() + 1));
            }
        }
        DataChannel dataChannel3 = this.LLJIJIL;
        if (dataChannel3 != null) {
            dataChannel3.BQ2(this, TakeStageCustomSettingsPanelSendInvitationEvent.class, new AwS594S0100000_15(this, 606));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.competition.launcher.CompetitionModeChooseContract$View
    public final void VR(int i, int i2, boolean z) {
        C1117360fBO c1117360fBO = this.LLJILJILJ;
        c1117360fBO.LL = ((AbstractC979780bbU) this.LLILLL).LLILLJJLI;
        if (z) {
            c1117360fBO.notifyItemRangeInserted(i, i2);
        } else {
            c1117360fBO.notifyItemRangeRemoved(i, i2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.g59, viewGroup, false);
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
