package X;

import Y.ACListenerS161S0100000_27;
import Y.ACListenerS91S0300000_27;
import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.minis.api.revisitedu.IMinisRevisitMissionService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0wzp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1802110wzp {
    public final IMinisRevisitMissionService LIZ;
    public final C1791260wiK LIZIZ;
    public TuxSheet LIZJ;
    public View LIZLLL;
    public int LJ;

    public final void LIZ() {
        this.LJ++;
        View view = this.LIZLLL;
        if (view != null) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJ(view, C343970De7.LIZ);
        } else {
            TuxSheet tuxSheet = this.LIZJ;
            if (tuxSheet != null) {
                tuxSheet.dismissAllowingStateLoss();
            }
        }
        this.LIZLLL = null;
        this.LIZJ = null;
    }

    public C1802110wzp(IMinisRevisitMissionService iMinisRevisitMissionService) {
        this.LIZ = iMinisRevisitMissionService;
        this.LIZIZ = new C1791260wiK(iMinisRevisitMissionService, 2);
    }

    public final boolean LIZIZ(Activity activity, final String str, Function1<? super C07ZA, ? extends EnumC1799930wwJ> function1) {
        C19EG c19eg;
        IMinisRevisitMissionService iMinisRevisitMissionService;
        C1799850wwB c1799850wwBLIZIZ;
        final C07ZA c07za;
        final AbstractC1802140wzs abstractC1802140wzs;
        IMinisRevisitMissionService iMinisRevisitMissionService2;
        if (activity instanceof C19EG) {
            c19eg = (C19EG) activity;
        } else {
            c19eg = null;
        }
        if (c19eg == null || c19eg.isFinishing() || c19eg.isDestroyed() || c19eg.getSupportFragmentManager().LJLJJI() || (iMinisRevisitMissionService = this.LIZ) == null || (c1799850wwBLIZIZ = iMinisRevisitMissionService.LIZIZ(str)) == null || (c07za = c1799850wwBLIZIZ.LIZ) == null) {
            return false;
        }
        C1791260wiK c1791260wiK = this.LIZIZ;
        c1791260wiK.getClass();
        int i = C1799870wwD.LIZ[c07za.LIZ.ordinal()];
        if (i != 1) {
            String str2 = "";
            if (i != 2) {
                if (i == 3) {
                    String str3 = c1791260wiK.LIZIZ.invoke().LIZ;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    final C990170bsF c990170bsFLIZ = C990180bsG.LIZ(2131822358);
                    final C990170bsF c990170bsF = new C990170bsF(2131822357, str2);
                    final C990170bsF c990170bsFLIZ2 = C990180bsG.LIZ(2131822355);
                    final C990170bsF c990170bsFLIZ3 = C990180bsG.LIZ(2131822351);
                    final EnumC1781360wSM rewardTaskType = c07za.LIZ.getRewardTaskType();
                    final C990190bsH c990190bsH = new C990190bsH(C990180bsG.LIZ(2131822362), C990180bsG.LIZ(2131822373));
                    abstractC1802140wzs = new AbstractC1802140wzs(str, c07za, c990170bsFLIZ, c990170bsF, c990170bsFLIZ2, c990170bsFLIZ3, rewardTaskType, c990190bsH) { // from class: X.0wzt
                        {
                            C1556500qbg c1556500qbg = new C1556500qbg(R.raw.tux_lottie_common_infrastructure_minis_guide_feed_light, R.raw.tux_lottie_common_infrastructure_minis_guide_feed_dark);
                            EnumC1799980wwO enumC1799980wwO = EnumC1799980wwO.REVISIT_EDUCATION;
                            C1808350x9t c1808350x9t = AbstractC1802140wzs.LJIIL;
                        }
                    };
                } else {
                    throw new C1954807lC();
                }
            } else {
                String str4 = c1791260wiK.LIZIZ.invoke().LIZ;
                if (str4 != null) {
                    str2 = str4;
                }
                final C990170bsF c990170bsFLIZ4 = C990180bsG.LIZ(2131822358);
                final C990170bsF c990170bsF2 = new C990170bsF(2131822356, str2);
                final C990170bsF c990170bsFLIZ5 = C990180bsG.LIZ(2131822354);
                final C990170bsF c990170bsFLIZ6 = C990180bsG.LIZ(2131822351);
                final EnumC1781360wSM rewardTaskType2 = c07za.LIZ.getRewardTaskType();
                final C990190bsH c990190bsH2 = new C990190bsH(C990180bsG.LIZ(2131822362), C990180bsG.LIZ(2131822373));
                abstractC1802140wzs = new AbstractC1802140wzs(str, c07za, c990170bsFLIZ4, c990170bsF2, c990170bsFLIZ5, c990170bsFLIZ6, rewardTaskType2, c990190bsH2) { // from class: X.0wzu
                    {
                        C1556500qbg c1556500qbg = new C1556500qbg(R.raw.tux_lottie_common_infrastructure_minis_guide_profile_light, R.raw.tux_lottie_common_infrastructure_minis_guide_profile_dark);
                        EnumC1799980wwO enumC1799980wwO = EnumC1799980wwO.REVISIT_EDUCATION;
                        C1808350x9t c1808350x9t = AbstractC1802140wzs.LJIIJJI;
                    }
                };
            }
        } else {
            C1781340wSK c1781340wSKInvoke = c1791260wiK.LIZIZ.invoke();
            String str5 = c1781340wSKInvoke.LIZ;
            if (str5 == null) {
                str5 = "this game";
            }
            final C990170bsF c990170bsF3 = new C990170bsF(2131822363, str5);
            final String str6 = c1781340wSKInvoke.LIZIZ;
            final C990170bsF c990170bsFLIZ7 = C990180bsG.LIZ(2131822365);
            final C990190bsH c990190bsH3 = new C990190bsH(C990180bsG.LIZ(2131822362), C990180bsG.LIZ(2131822373));
            abstractC1802140wzs = new AbstractC1802140wzs(str, c07za, str6, c990170bsF3, c990170bsFLIZ7, c990190bsH3) { // from class: X.0wzr
                {
                    C1556480qbe c1556480qbe = new C1556480qbe(str6);
                    EnumC1781360wSM enumC1781360wSM = EnumC1781360wSM.ADD_TO_DESKTOP;
                    EnumC1799980wwO enumC1799980wwO = EnumC1799980wwO.ADD_TO_HOME_SCREEN;
                    C1808350x9t c1808350x9t = AbstractC1802140wzs.LJIILIIL;
                }
            };
        }
        LIZ();
        final View viewTd = C786410Ut5.Td(C786410Ut5.ne(c19eg), R.layout.dnn, null, false);
        View viewFindViewById = viewTd.findViewById(R.id.og1);
        if (viewFindViewById != null) {
            DisplayMetrics displayMetrics = viewTd.getContext().getResources().getDisplayMetrics();
            float f = displayMetrics.density;
            int i2 = displayMetrics.widthPixels - (((int) ((16 * f) + 0.5f)) * 2);
            if (i2 < 1) {
                i2 = 1;
            }
            int iMin = Math.min((int) ((358 * f) + 0.5f), i2);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(iMin, -2);
            ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams = layoutParams2;
            }
            layoutParams.width = iMin;
            C786410Ut5.W5(viewFindViewById, layoutParams);
        }
        this.LIZLLL = viewTd;
        final int i3 = this.LJ + 1;
        this.LJ = i3;
        Regex regex = C1808340x9s.LIZ;
        if ((abstractC1802140wzs instanceof C1802160wzu) || (abstractC1802140wzs instanceof C1802150wzt) || (abstractC1802140wzs instanceof C1802130wzr)) {
            C1808340x9s.LIZ(viewTd, abstractC1802140wzs);
            if (abstractC1802140wzs.LJII == null) {
                View viewFindViewById2 = viewTd.findViewById(R.id.oge);
                if (viewFindViewById2 != null) {
                    C786410Ut5.LJLLLLLL(8, viewFindViewById2);
                }
            } else {
                C1791260wiK c1791260wiK2 = this.LIZIZ;
                InterfaceC1799250wvD interfaceC1799250wvD = new InterfaceC1799250wvD() { // from class: X.0wzq
                    @Override // X.InterfaceC1799250wvD
                    public final void LIZ(C1781330wSJ c1781330wSJ) {
                        String str7;
                        int i4;
                        View viewFindViewById3;
                        int i5 = i3;
                        C1802110wzp c1802110wzp = this;
                        if (i5 == c1802110wzp.LJ) {
                            View view = c1802110wzp.LIZLLL;
                            View view2 = viewTd;
                            if (view == view2) {
                                if (c1781330wSJ == null) {
                                    if (abstractC1802140wzs.LJIIIZ == null) {
                                        Regex regex2 = C1808340x9s.LIZ;
                                        View viewFindViewById4 = view2.findViewById(R.id.oge);
                                        if (viewFindViewById4 != null) {
                                            C786410Ut5.LJLLLLLL(8, viewFindViewById4);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                Regex regex3 = C1808340x9s.LIZ;
                                EnumC1799980wwO enumC1799980wwO = abstractC1802140wzs.LJIIIIZZ;
                                String strLIZJ = C1808340x9s.LIZJ(c1781330wSJ.LIZIZ);
                                String strLIZJ2 = C1808340x9s.LIZJ(c1781330wSJ.LIZJ);
                                String strLIZJ3 = C1808340x9s.LIZJ(c1781330wSJ.LIZLLL);
                                String strTitle = enumC1799980wwO.title(view2, strLIZJ2);
                                String strSubtitle = enumC1799980wwO.subtitle(view2, strLIZJ2, strLIZJ3);
                                int i6 = 0;
                                if (strLIZJ == null && strTitle == null && strSubtitle == null) {
                                    if (abstractC1802140wzs.LJIIIZ == null && (viewFindViewById3 = viewTd.findViewById(R.id.oge)) != null) {
                                        C786410Ut5.LJLLLLLL(8, viewFindViewById3);
                                        return;
                                    }
                                    return;
                                }
                                View viewFindViewById5 = view2.findViewById(R.id.oge);
                                if (viewFindViewById5 != null) {
                                    C786410Ut5.LJLLLLLL(0, viewFindViewById5);
                                }
                                C1808340x9s.LIZIZ(view2, "MinisRevisitReward", strLIZJ);
                                TextView textView = (TextView) view2.findViewById(R.id.ogi);
                                String str8 = "";
                                if (textView != null) {
                                    if (strTitle == null) {
                                        str7 = "";
                                    } else {
                                        str7 = strTitle;
                                    }
                                    textView.setText(str7);
                                    if (strTitle == null) {
                                        i4 = 8;
                                    } else {
                                        i4 = 0;
                                    }
                                    C786410Ut5.LLIL(textView, i4);
                                }
                                TextView textView2 = (TextView) view2.findViewById(R.id.ogh);
                                if (textView2 != null) {
                                    if (strSubtitle != null) {
                                        str8 = strSubtitle;
                                    }
                                    textView2.setText(str8);
                                    if (strSubtitle == null) {
                                        i6 = 8;
                                    }
                                    C786410Ut5.LLIL(textView2, i6);
                                }
                            }
                        }
                    }
                };
                c1791260wiK2.getClass();
                EnumC1781360wSM enumC1781360wSM = abstractC1802140wzs.LJII;
                if (enumC1781360wSM != null && (iMinisRevisitMissionService2 = c1791260wiK2.LIZ) != null) {
                    iMinisRevisitMissionService2.LIZ(abstractC1802140wzs.LIZ, enumC1781360wSM, interfaceC1799250wvD);
                } else {
                    interfaceC1799250wvD.LIZ(null);
                }
            }
            View viewFindViewById3 = viewTd.findViewById(R.id.og4);
            if (viewFindViewById3 != null) {
                C786410Ut5.I7(new ACListenerS91S0300000_27(this, function1, abstractC1802140wzs, 9), viewFindViewById3);
            }
            View viewFindViewById4 = viewTd.findViewById(R.id.oga);
            if (viewFindViewById4 != null) {
                C786410Ut5.I7(new ACListenerS161S0100000_27(this, 139), viewFindViewById4);
            }
            View viewFindViewById5 = viewTd.findViewById(R.id.og2);
            if (viewFindViewById5 != null) {
                C786410Ut5.I7(new ACListenerS161S0100000_27(this, 140), viewFindViewById5);
            }
            View viewFindViewById6 = viewTd.findViewById(R.id.ogb);
            if (viewFindViewById6 != null) {
                C786410Ut5.I7(new ACListenerS161S0100000_27(this, 141), viewFindViewById6);
            }
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LIZ.LLJJIII = viewTd;
            c1390920mIc.LJIIIIZZ(0);
            c1390920mIc.LIZ(0.95f);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJIJIL = gradientDrawable;
            tuxSheet.LLJJIJIIJIL = true;
            tuxSheet.LLILLL = true;
            tuxSheet.LLJLLIL = true;
            tuxSheet.LLJLILLLLZIIL = true;
            tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC1864750ycr(this, 7);
            tuxSheet.show(c19eg.getSupportFragmentManager(), "MinisRevisitMissionPanel");
            this.LIZJ = tuxSheet;
            C2196701AyC c2196701AyC = C2196701AyC.LIZ;
            EnumC1799930wwJ enumC1799930wwJ = c07za.LIZ;
            c2196701AyC.getClass();
            EnumC1802000wze enumC1802000wzeLJJIIJ = C2196701AyC.LJJIIJ(enumC1799930wwJ);
            if (enumC1802000wzeLJJIIJ != null) {
                C2196701AyC.LJJIII(c2196701AyC, "tm_win_reward_pop_up_show", enumC1802000wzeLJJIIJ, null, true, 4);
            }
            return true;
        }
        throw new C1954807lC();
    }
}
