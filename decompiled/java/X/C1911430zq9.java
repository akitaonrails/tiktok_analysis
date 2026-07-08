package X;

import Y.ARunnableS61S0300000_28;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.journey.step.slogan.SloganAndConsentFragment;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS572S0100000_28;
import njp.a;

/* JADX INFO: renamed from: X.0zq9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.journey.step.slogan.SloganAndConsentFragment$showConsentButtonOrExit$1$1", f = "SloganAndConsentFragment.kt", l = {}, m = "invokeSuspend")
public final class C1911430zq9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SloganAndConsentFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1911430zq9(SloganAndConsentFragment sloganAndConsentFragment, InterfaceC1364105Vn<? super C1911430zq9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = sloganAndConsentFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1911430zq9(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        View viewLIZJ;
        FrameLayout frameLayout;
        final C1913640zti c1913640zti;
        TuxSheet tuxSheet;
        TuxSheet tuxSheet2;
        Dialog dialog;
        C1913640zti c1913640zti2;
        C1C7U.LIZ("SloganAndConsentFragment@cf5a.showConsentButtonOrExit$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        final SloganAndConsentFragment sloganAndConsentFragment = this.LL;
        sloganAndConsentFragment.hS();
        View view = null;
        if (SloganAndConsentFragment.gS() != EnumC1911450zqB.DEFAULT) {
            AnonymousClass0956 anonymousClass0956 = sloganAndConsentFragment.LLLIIIIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            sloganAndConsentFragment.LLLIIIIL = null;
            sloganAndConsentFragment.LLLI = false;
            Context context = sloganAndConsentFragment.getContext();
            if (context != null) {
                c1913640zti2 = new C1913640zti(context, new AwS572S0100000_28(sloganAndConsentFragment, OppoPermissionPopupMaskDelayExp.DEFAULT));
            } else {
                c1913640zti2 = null;
            }
            sloganAndConsentFragment.LLLFF = c1913640zti2;
            FrameLayout frameLayout2 = sloganAndConsentFragment.LLLF;
            if (frameLayout2 != null) {
                C786410Ut5.LJZ(8, frameLayout2);
            }
            FrameLayout frameLayout3 = sloganAndConsentFragment.LLLF;
            if (frameLayout3 != null) {
                C786410Ut5.LJJJJIZL(frameLayout3);
            }
            LinearLayout linearLayout = sloganAndConsentFragment.LLJLIL;
            if (linearLayout != null) {
                C786410Ut5.LJZL(0, linearLayout);
            }
            C1295960jpS c1295960jpS = sloganAndConsentFragment.LLJZ;
            if (c1295960jpS != null) {
                C786410Ut5.LLD(0, c1295960jpS);
            }
        } else {
            sloganAndConsentFragment.dS();
            ConstraintLayout constraintLayout = sloganAndConsentFragment.LLJL;
            if (constraintLayout != null) {
                C786410Ut5.LL(0, constraintLayout);
            }
            ConstraintLayout constraintLayout2 = sloganAndConsentFragment.LLJL;
            if (constraintLayout2 != null) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(constraintLayout2, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(200L);
                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                C786410Ut5.Pd(objectAnimatorOfFloat);
                C1848530yCh.LIZLLL(constraintLayout2, "page_slogan_consent", null);
            }
            C19249910Sr c19249910Sr = C19249910Sr.LIZIZ;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("ui_type", sloganAndConsentFragment.LLLIIL);
            c19249910Sr.LIZIZ(c2344009Gk, "show_consent_box");
        }
        if (SloganAndConsentFragment.gS() == EnumC1911450zqB.BOTTOM_SHEET) {
            if (sloganAndConsentFragment.isAdded() && (c1913640zti = sloganAndConsentFragment.LLLFF) != null) {
                TuxSheet tuxSheet3 = sloganAndConsentFragment.LLLFFI;
                if (((tuxSheet3 != null && (dialog = tuxSheet3.getDialog()) != null && dialog.isShowing()) || ((tuxSheet = sloganAndConsentFragment.LLLFFI) != null && tuxSheet.isAdded())) && (tuxSheet2 = sloganAndConsentFragment.LLLFFI) != null && tuxSheet2.getView() != null) {
                    TuxSheet tuxSheet4 = sloganAndConsentFragment.LLLFFI;
                    if (tuxSheet4 != null) {
                        view = tuxSheet4.getView();
                    }
                    sloganAndConsentFragment.nS(view, c1913640zti);
                } else {
                    Fragment fragmentLJJJJZI = sloganAndConsentFragment.getParentFragmentManager().LJJJJZI("journey_kr_consent_sheet");
                    if ((fragmentLJJJJZI instanceof TuxSheet) && fragmentLJJJJZI != null) {
                        try {
                            C19EH c19ehLJIIJ = sloganAndConsentFragment.getParentFragmentManager().LJIIJ();
                            c19ehLJIIJ.LJIIZILJ(fragmentLJJJJZI);
                            c19ehLJIIJ.LJIIL();
                            C0OM1 c0om1 = new C0OM1();
                            C1250250idj c1250250idj = new C1250250idj();
                            c1250250idj.LIZJ = sloganAndConsentFragment.getString(2131857915);
                            c0om1.LIZJ = c1250250idj;
                            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                            TuxSheet tuxSheet5 = c1390920mIc.LIZ;
                            tuxSheet5.LLJJIJIL = c0om1;
                            tuxSheet5.LLJJJ = null;
                            FrameLayout frameLayout4 = new FrameLayout(c1913640zti.LIZIZ.getContext());
                            C786410Ut5.a6(frameLayout4, new FrameLayout.LayoutParams(-1, -2));
                            View viewLIZJ2 = c1913640zti.LIZJ();
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                            layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
                            layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
                            layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
                            frameLayout4.addView(viewLIZJ2, layoutParams);
                            c1913640zti.LJIIL = frameLayout4;
                            c1390920mIc.LIZ.LLJJIII = frameLayout4;
                            c1390920mIc.LJIIIIZZ(0);
                            C1390920mIc.LJII(c1390920mIc, false);
                            final TuxSheet tuxSheet6 = c1390920mIc.LIZ;
                            tuxSheet6.LLILLL = false;
                            tuxSheet6.LLJLLIL = false;
                            tuxSheet6.LLJLLL = false;
                            tuxSheet6.getViewLifecycleOwnerLiveData().observe(sloganAndConsentFragment.getViewLifecycleOwner(), new Observer() { // from class: X.0zqA
                                @Override // androidx.lifecycle.Observer
                                public final void onChanged(Object obj2) {
                                    if (obj2 != null) {
                                        tuxSheet6.getViewLifecycleOwnerLiveData().removeObservers(sloganAndConsentFragment.getViewLifecycleOwner());
                                        View view2 = tuxSheet6.getView();
                                        if (view2 != null) {
                                            HandlerHook.viewPost(view2, new ARunnableS61S0300000_28(sloganAndConsentFragment, tuxSheet6, c1913640zti, 4));
                                        }
                                    }
                                }
                            });
                            tuxSheet6.show(sloganAndConsentFragment.getParentFragmentManager(), "journey_kr_consent_sheet");
                            sloganAndConsentFragment.LLLFFI = tuxSheet6;
                        } catch (IllegalStateException e) {
                            TryCatchGuardChecker.doCheck(e);
                            sloganAndConsentFragment.LLLFFI = null;
                        }
                    } else {
                        C0OM1 c0om12 = new C0OM1();
                        C1250250idj c1250250idj2 = new C1250250idj();
                        c1250250idj2.LIZJ = sloganAndConsentFragment.getString(2131857915);
                        c0om12.LIZJ = c1250250idj2;
                        C1390920mIc c1390920mIc2 = new C1390920mIc(false, 0);
                        TuxSheet tuxSheet52 = c1390920mIc2.LIZ;
                        tuxSheet52.LLJJIJIL = c0om12;
                        tuxSheet52.LLJJJ = null;
                        FrameLayout frameLayout42 = new FrameLayout(c1913640zti.LIZIZ.getContext());
                        C786410Ut5.a6(frameLayout42, new FrameLayout.LayoutParams(-1, -2));
                        View viewLIZJ22 = c1913640zti.LIZJ();
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                        layoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
                        layoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
                        layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin, layoutParams2.rightMargin, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
                        frameLayout42.addView(viewLIZJ22, layoutParams2);
                        c1913640zti.LJIIL = frameLayout42;
                        c1390920mIc2.LIZ.LLJJIII = frameLayout42;
                        c1390920mIc2.LJIIIIZZ(0);
                        C1390920mIc.LJII(c1390920mIc2, false);
                        final TuxSheet tuxSheet62 = c1390920mIc2.LIZ;
                        tuxSheet62.LLILLL = false;
                        tuxSheet62.LLJLLIL = false;
                        tuxSheet62.LLJLLL = false;
                        tuxSheet62.getViewLifecycleOwnerLiveData().observe(sloganAndConsentFragment.getViewLifecycleOwner(), new Observer() { // from class: X.0zqA
                            @Override // androidx.lifecycle.Observer
                            public final void onChanged(Object obj2) {
                                if (obj2 != null) {
                                    tuxSheet62.getViewLifecycleOwnerLiveData().removeObservers(sloganAndConsentFragment.getViewLifecycleOwner());
                                    View view2 = tuxSheet62.getView();
                                    if (view2 != null) {
                                        HandlerHook.viewPost(view2, new ARunnableS61S0300000_28(sloganAndConsentFragment, tuxSheet62, c1913640zti, 4));
                                    }
                                }
                            }
                        });
                        try {
                            tuxSheet62.show(sloganAndConsentFragment.getParentFragmentManager(), "journey_kr_consent_sheet");
                            sloganAndConsentFragment.LLLFFI = tuxSheet62;
                        } catch (IllegalStateException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            sloganAndConsentFragment.LLLFFI = null;
                        }
                    }
                }
            }
        } else if (SloganAndConsentFragment.gS() == EnumC1911450zqB.INLINE) {
            if (C1911400zq6.LIZ(sloganAndConsentFragment.getContext())) {
                C1295960jpS c1295960jpS2 = sloganAndConsentFragment.LLJZ;
                if (c1295960jpS2 != null) {
                    C786410Ut5.LLD(8, c1295960jpS2);
                }
            } else {
                C1295960jpS c1295960jpSKS = sloganAndConsentFragment.kS();
                if (c1295960jpSKS != null) {
                    c1295960jpSKS.setRepeatCount(9999);
                    c1295960jpSKS.playAnimation();
                }
            }
            FrameLayout frameLayout5 = sloganAndConsentFragment.LLLF;
            if (frameLayout5 != null) {
                C786410Ut5.LJZ(0, frameLayout5);
            }
            C1913640zti c1913640zti3 = sloganAndConsentFragment.LLLFF;
            if (c1913640zti3 != null && (viewLIZJ = c1913640zti3.LIZJ()) != null && (frameLayout = sloganAndConsentFragment.LLLF) != null) {
                frameLayout.addView(viewLIZJ);
            }
            sloganAndConsentFragment.nS(sloganAndConsentFragment.LLLF, sloganAndConsentFragment.LLLFF);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SloganAndConsentFragment@cf5a.showConsentButtonOrExit$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
