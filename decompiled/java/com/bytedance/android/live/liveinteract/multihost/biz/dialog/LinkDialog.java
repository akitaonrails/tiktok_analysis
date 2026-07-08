package com.bytedance.android.live.liveinteract.multihost.biz.dialog;

import X.AbstractC934930aR9;
import X.C01GW;
import X.C0U56;
import X.C1935407i4;
import X.C19EH;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C786410Ut5;
import X.C978980baC;
import X.C980080bby;
import X.EnumC977660bY4;
import X.InterfaceC21506019Ek;
import X.InterfaceC957770b1z;
import X.InterfaceC963450bB9;
import X.InterfaceC980100bc0;
import X.InterfaceC980360bcQ;
import Y.ACListenerS150S0100000_15;
import Y.AUListenerS222S0200000_15;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestMemoryLeakOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchFixJumpSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class LinkDialog extends LiveDialogFragment implements InterfaceC980360bcQ, InterfaceC957770b1z, InterfaceC963450bB9 {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohHELIOSKSY4ZyImJDElISAgPGsuIDV9LCwtJSA0ZgklJyQXISQgJig=";
    public final LifecycleOwner LL;
    public View LLILLL;
    public EnumC977660bY4 LLILZIL;
    public AbstractC934930aR9 LLILZLL;
    public AnimatorSet LLIZ;
    public AnimatorSet LLIZLLLIL;
    public C980080bby LLJ;
    public final C01GW LLILLJJLI = C1935407i4.LIZ(new AwS559S0100000_15(this, 391));
    public C978980baC LLILZ = new C978980baC();

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean adaptEdgeToEdge() {
        return true;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final InterfaceC980100bc0 OR() {
        return (InterfaceC980100bc0) this.LLILLJJLI.getValue();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.git);
        c500980Jkm.LIZJ = LiveMatchFixJumpSetting.INSTANCE.getValue() ? R.style.ajj : R.style.aji;
        c500980Jkm.LJIIJ = -1;
        c500980Jkm.LJI = 0.0f;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean onBackPressed() {
        Function0<Boolean> function0 = this.LLILZ.LJFF;
        if (function0 != null && function0.invoke().booleanValue()) {
            return true;
        }
        C978980baC c978980baC = this.LLILZ;
        if (c978980baC.LIZLLL || c978980baC.LJ) {
            NR();
            return true;
        }
        if (!c978980baC.LJIIIIZZ) {
            return true;
        }
        Function0<Unit> function02 = c978980baC.LJIIJ;
        if (function02 != null) {
            function02.invoke();
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean requireE2EAdaption() {
        return LiveMatchFixJumpSetting.INSTANCE.getValue();
    }

    public final void NR() {
        if (OR().LIZ()) {
            try {
                getChildFragmentManager().LJLLILLLL();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        Function0<Unit> function0 = this.LLILZ.LJIIJ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // X.InterfaceC963450bB9
    public final Window getWindow() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog.getWindow();
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        OR().LIZJ();
        if (MultiGuestMemoryLeakOptSetting.isEnable()) {
            C980080bby c980080bby = this.LLJ;
            if (c980080bby != null) {
                getChildFragmentManager().LLD(c980080bby);
            }
            this.LLJ = null;
        }
    }

    @Override // X.InterfaceC980360bcQ
    public final DataChannel Ue() {
        return this.dataChannel;
    }

    @Override // X.InterfaceC963450bB9
    public final LifecycleOwner getLifecycleOwner() {
        return this.LL;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C0U56 getPanelType() {
        return C0U56.PANEL_LINK;
    }

    @Override // X.InterfaceC963450bB9
    public final View getRootView() {
        return this.LLILLL;
    }

    public LinkDialog(LifecycleOwner lifecycleOwner) {
        this.LL = lifecycleOwner;
    }

    @Override // X.InterfaceC963450bB9
    public final void Ja(InterfaceC21506019Ek interfaceC21506019Ek) {
        if (interfaceC21506019Ek != null) {
            getChildFragmentManager().LJFF(interfaceC21506019Ek);
        }
    }

    public final void MR(boolean z) {
        Context context;
        Dialog dialog;
        View currentFocus;
        int i = 0;
        if (this.isViewValid && (context = getContext()) != null && (dialog = getDialog()) != null && (currentFocus = dialog.getCurrentFocus()) != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) C786410Ut5.H2(context, "input_method");
            if (inputMethodManager.isActive()) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        }
        InteractDialogFragmentBaseContract$AbsView<?> interactDialogFragmentBaseContract$AbsViewLIZLLL = OR().LIZLLL();
        if (interactDialogFragmentBaseContract$AbsViewLIZLLL == null) {
            return;
        }
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        if (!z) {
            i = R.anim.f479h0;
        }
        c19ehLJIIJ.LJIJJLI(R.anim.gz, i, R.anim.gz, i);
        c19ehLJIIJ.LJII(null);
        c19ehLJIIJ.LIZIZ(R.id.iiv, interactDialogFragmentBaseContract$AbsViewLIZLLL);
        c19ehLJIIJ.LJIIIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0366  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void PR(X.C978980baC r15) {
        /*
            Method dump skipped, instruction units count: 1248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog.PR(X.0baC):void");
    }

    @Override // X.InterfaceC963450bB9
    public final void Vh(C978980baC c978980baC) {
        if (c978980baC != null) {
            PR(c978980baC);
            return;
        }
        try {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void onDialogCreated(Dialog dialog) {
        Window window;
        super.onDialogCreated(dialog);
        dialog.setCanceledOnTouchOutside(this.LLILZ.LJIIIIZZ);
        if (LiveMatchFixJumpSetting.INSTANCE.getValue() && (window = dialog.getWindow()) != null) {
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
        }
    }

    @Override // X.InterfaceC963450bB9
    public final void vd(int i) {
        View viewFindViewById;
        View view = this.LLILLL;
        if (view != null && (viewFindViewById = view.findViewById(R.id.y15)) != null) {
            C500260Jjc.LJJLJ(i, viewFindViewById);
        }
    }

    public static final void RR(View view, LinkDialog linkDialog) {
        ViewGroup viewGroup;
        View view2 = linkDialog.LLILLL;
        if (view2 != null && (viewGroup = (ViewGroup) view2.findViewById(R.id.mbt)) != null) {
            C786410Ut5.LJJJJI(viewGroup);
            if (view != null) {
                C786410Ut5.LJLZ(0, viewGroup);
                viewGroup.addView(view);
            } else {
                C786410Ut5.LJLZ(8, viewGroup);
            }
        }
    }

    @Override // X.InterfaceC963450bB9
    public final void Rn(EnumC977660bY4 enumC977660bY4, AbstractC934930aR9 abstractC934930aR9) {
        boolean z;
        if (OR().LIZIZ(enumC977660bY4, abstractC934930aR9)) {
            if (enumC977660bY4 != EnumC977660bY4.TYPE_MATCH_GIFT_SELECT && enumC977660bY4 != EnumC977660bY4.MATCH_AI_HISTORY) {
                z = false;
            } else {
                z = true;
            }
            MR(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.0bby, X.19Ek] */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLILLL = view;
        if (MultiGuestMemoryLeakOptSetting.isEnable()) {
            ?? r1 = new InterfaceC21506019Ek() { // from class: X.0bby
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

                @Override // X.InterfaceC21506019Ek
                public final void onBackStackChanged() {
                    InteractDialogFragmentBaseContract$AbsView<?> interactDialogFragmentBaseContract$AbsViewLIZLLL = this.OR().LIZLLL();
                    if (interactDialogFragmentBaseContract$AbsViewLIZLLL != null) {
                        LinkDialog linkDialog = this;
                        View view2 = view;
                        if (interactDialogFragmentBaseContract$AbsViewLIZLLL.mStatusViewValid && linkDialog.getDialog() != null) {
                            linkDialog.PR(interactDialogFragmentBaseContract$AbsViewLIZLLL.OR());
                            if (linkDialog.LLILZ.LJIIL) {
                                View viewFindViewById = view2.findViewById(R.id.mr3);
                                if (viewFindViewById != null) {
                                    C786410Ut5.LJLLLLLL(0, viewFindViewById);
                                }
                            } else {
                                View viewFindViewById2 = view2.findViewById(R.id.mr3);
                                if (viewFindViewById2 != null) {
                                    C786410Ut5.LJLLLLLL(8, viewFindViewById2);
                                }
                                View viewFindViewById3 = view2.findViewById(R.id.iiv);
                                if (viewFindViewById3 != null) {
                                    viewFindViewById3.setBackgroundResource(R.drawable.duy);
                                }
                            }
                        }
                    }
                    InteractDialogFragmentBaseContract$AbsView<?> interactDialogFragmentBaseContract$AbsViewLIZLLL2 = this.OR().LIZLLL();
                    C500260Jjc.LLFFF(interactDialogFragmentBaseContract$AbsViewLIZLLL2 != null ? interactDialogFragmentBaseContract$AbsViewLIZLLL2.getView() : null);
                    InteractDialogFragmentBaseContract$AbsView<?> interactDialogFragmentBaseContract$AbsViewLJ = this.OR().LJ();
                    C500260Jjc.LJIILIIL(interactDialogFragmentBaseContract$AbsViewLJ != null ? interactDialogFragmentBaseContract$AbsViewLJ.getView() : null);
                }
            };
            this.LLJ = r1;
            getChildFragmentManager().LJFF(r1);
        } else {
            getChildFragmentManager().LJFF(new InterfaceC21506019Ek() { // from class: X.0bbz
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

                @Override // X.InterfaceC21506019Ek
                public final void onBackStackChanged() {
                    InteractDialogFragmentBaseContract$AbsView<?> interactDialogFragmentBaseContract$AbsViewLIZLLL = this.OR().LIZLLL();
                    if (interactDialogFragmentBaseContract$AbsViewLIZLLL != null) {
                        LinkDialog linkDialog = this;
                        View view2 = view;
                        if (interactDialogFragmentBaseContract$AbsViewLIZLLL.mStatusViewValid && linkDialog.getDialog() != null) {
                            linkDialog.PR(interactDialogFragmentBaseContract$AbsViewLIZLLL.OR());
                            if (linkDialog.LLILZ.LJIIL) {
                                View viewFindViewById = view2.findViewById(R.id.mr3);
                                if (viewFindViewById != null) {
                                    C786410Ut5.LJLLLLLL(0, viewFindViewById);
                                }
                            } else {
                                View viewFindViewById2 = view2.findViewById(R.id.mr3);
                                if (viewFindViewById2 != null) {
                                    C786410Ut5.LJLLLLLL(8, viewFindViewById2);
                                }
                                View viewFindViewById3 = view2.findViewById(R.id.iiv);
                                if (viewFindViewById3 != null) {
                                    viewFindViewById3.setBackgroundResource(R.drawable.duy);
                                }
                            }
                        }
                    }
                    InteractDialogFragmentBaseContract$AbsView<?> interactDialogFragmentBaseContract$AbsViewLIZLLL2 = this.OR().LIZLLL();
                    C500260Jjc.LLFFF(interactDialogFragmentBaseContract$AbsViewLIZLLL2 != null ? interactDialogFragmentBaseContract$AbsViewLIZLLL2.getView() : null);
                    InteractDialogFragmentBaseContract$AbsView<?> interactDialogFragmentBaseContract$AbsViewLJ = this.OR().LJ();
                    C500260Jjc.LJIILIIL(interactDialogFragmentBaseContract$AbsViewLJ != null ? interactDialogFragmentBaseContract$AbsViewLJ.getView() : null);
                }
            });
        }
        C786410Ut5.I7(new ACListenerS150S0100000_15(this, 155), view.findViewById(R.id.pwd));
        InterfaceC980100bc0 interfaceC980100bc0OR = OR();
        EnumC977660bY4 enumC977660bY4 = this.LLILZIL;
        if (enumC977660bY4 == null) {
            enumC977660bY4 = null;
        }
        interfaceC980100bc0OR.LIZIZ(enumC977660bY4, this.LLILZLL);
        MR(false);
    }

    @Override // X.InterfaceC963450bB9
    public final void uC(int i, int i2) {
        ViewGroup viewGroup;
        if (i >= 0 && i2 >= 0) {
            View view = this.LLILLL;
            ViewGroup.LayoutParams layoutParams = null;
            if (view != null) {
                viewGroup = (ViewGroup) view.findViewById(R.id.iiv);
                if (viewGroup != null) {
                    layoutParams = viewGroup.getLayoutParams();
                }
            } else {
                viewGroup = null;
            }
            if (i != 0) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt((int) C497740JfY.LIZIZ(i), (int) C497740JfY.LIZIZ(i2));
                valueAnimatorOfInt.addUpdateListener(new AUListenerS222S0200000_15(layoutParams, viewGroup, 1));
                valueAnimatorOfInt.setDuration(300L);
                valueAnimatorOfInt.start();
                return;
            }
            if (layoutParams != null) {
                layoutParams.height = (int) C497740JfY.LIZIZ(i2);
            }
            if (viewGroup == null) {
                return;
            }
            C786410Ut5.X5(layoutParams, viewGroup);
        }
    }
}
