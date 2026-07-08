package X;

import Y.ALAdapterS2S0100000_5;
import Y.ALAdapterS2S0200000_5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0EJ9, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EJ9 extends AbstractC1664490tPr<C0EJ5, C0EH2> {
    public RecyclerView LLJJJIL;
    public RecyclerView LLJJJJ;
    public View LLJJJJJIL;
    public View LLJJJJLIIL;
    public View LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public TuxIconView LLJLIL;
    public View LLJLILLLLZIIL;
    public ViewPropertyAnimator LLJLL;
    public ViewPropertyAnimator LLJLLIL;
    public ViewPropertyAnimator LLJLLL;
    public ViewPropertyAnimator LLJZ;
    public boolean LLJZIJLIL;
    public C370320EfW LLL;
    public C370320EfW LLLF;
    public C0EHQ LLLFF;
    public C0EHQ LLLFFI;
    public InterfaceC361900EGu LLLFZ;
    public final MutableLiveData<Boolean> LLLI;
    public final C01GW LLLII;
    public boolean LLLIIII;
    public final C0EH8 LLLIIIIL;

    public final int LLLLLJLJLL() {
        return ((Number) this.LLLII.getValue()).intValue();
    }

    public C0EJ9() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(Boolean.FALSE);
        this.LLLI = mutableLiveData;
        this.LLLII = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(230));
        this.LLLIIII = true;
        this.LLLIIIIL = new C0EH8(this);
    }

    public static int LLLLLL(Context context) {
        int iIntValue;
        Integer numLIZJ = C0EJA.LIZJ(C390810FTz.LIZJ(context));
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EJ8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0EJ5) obj).LJIIIIZZ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 703));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0EJL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0EJ5) obj).LJIIIZ;
            }
        }, new AwS584S0100000_5(this, 704));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EJ6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0EJ5) obj).LJIILIIL;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 705));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0EJM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0EJ5) obj).LJIIJ;
            }
        }, new AwS584S0100000_5(this, 706));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0EJN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0EJ5) obj).LJIIJJI;
            }
        }, new AwS584S0100000_5(this, 697));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0EJH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0EJ5) obj).LJIIL;
            }
        }, new AwS584S0100000_5(this, 698));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0EJI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0EJ5) obj).LIZJ;
            }
        }, new AwS584S0100000_5(this, 699));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0EJJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0EJ5) obj).LIZLLL;
            }
        }, new AwS584S0100000_5(this, OppoPermissionPopupMaskDelayExp.DEFAULT));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EJF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0EJ5) obj).LIZ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 701));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0EJK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0EJ5) obj).LJ;
            }
        }, new AwS584S0100000_5(this, 702));
    }

    public static void LLLLLLJ(RecyclerView recyclerView, Function0 function0) {
        if (recyclerView != null && recyclerView.isComputingLayout()) {
            C354270Duj.LIZJ(0L, new AwS549S0100000_5(function0, (Function0<Unit>) 791));
        } else {
            function0.invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04da  */
    @Override // com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r15, android.os.Bundle r16) {
        /*
            Method dump skipped, instruction units count: 1309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EJ9.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.byl, viewGroup, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLJIL(androidx.recyclerview.widget.RecyclerView r18, androidx.recyclerview.widget.RecyclerView.ViewHolder r19, java.util.List r20, java.lang.Boolean r21) {
        /*
            Method dump skipped, instruction units count: 922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EJ9.LLLLLJIL(androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$ViewHolder, java.util.List, java.lang.Boolean):void");
    }

    public final void LLLLLLIL(View view, View view2, Function0 function0, boolean z) {
        C786410Ut5.LJLLLLLL(0, view);
        C786410Ut5.LJLLLLLL(0, view2);
        if (z) {
            C786410Ut5.ed(view, 0.0f);
            C786410Ut5.ed(view2, C390810FTz.LIZ(82.0f));
            ViewPropertyAnimator viewPropertyAnimator = this.LLJLL;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            viewPropertyAnimatorAnimate.setInterpolator(C1619980sG4.LJ());
            viewPropertyAnimatorAnimate.translationYBy(C390810FTz.LIZ(82.0f));
            viewPropertyAnimatorAnimate.alpha(0.0f);
            viewPropertyAnimatorAnimate.setDuration(200L);
            viewPropertyAnimatorAnimate.setListener(new ALAdapterS2S0100000_5(this, 8));
            viewPropertyAnimatorAnimate.start();
            this.LLJLL = viewPropertyAnimatorAnimate;
            ViewPropertyAnimator viewPropertyAnimator2 = this.LLJLLL;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view2.animate();
            viewPropertyAnimatorAnimate2.setInterpolator(C1619980sG4.LJ());
            viewPropertyAnimatorAnimate2.translationYBy(C390810FTz.LIZ(-82.0f));
            viewPropertyAnimatorAnimate2.alpha(1.0f);
            viewPropertyAnimatorAnimate2.setDuration(200L);
            viewPropertyAnimatorAnimate2.setListener(new ALAdapterS2S0200000_5(this, function0, 4));
            viewPropertyAnimatorAnimate2.start();
            this.LLJLLL = viewPropertyAnimatorAnimate2;
        } else {
            C786410Ut5.ed(view, C390810FTz.LIZ(82.0f));
            C786410Ut5.ed(view2, 0.0f);
            ViewPropertyAnimator viewPropertyAnimator3 = this.LLJLLIL;
            if (viewPropertyAnimator3 != null) {
                viewPropertyAnimator3.cancel();
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view.animate();
            viewPropertyAnimatorAnimate3.setInterpolator(C1619980sG4.LJ());
            viewPropertyAnimatorAnimate3.translationYBy(C390810FTz.LIZ(-82.0f));
            viewPropertyAnimatorAnimate3.alpha(1.0f);
            viewPropertyAnimatorAnimate3.setDuration(200L);
            viewPropertyAnimatorAnimate3.setListener(new ALAdapterS2S0200000_5(this, function0, 3));
            viewPropertyAnimatorAnimate3.start();
            this.LLJLLIL = viewPropertyAnimatorAnimate3;
            ViewPropertyAnimator viewPropertyAnimator4 = this.LLJZ;
            if (viewPropertyAnimator4 != null) {
                viewPropertyAnimator4.cancel();
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate4 = view2.animate();
            viewPropertyAnimatorAnimate4.setInterpolator(C1619980sG4.LJ());
            viewPropertyAnimatorAnimate4.translationYBy(C390810FTz.LIZ(82.0f));
            viewPropertyAnimatorAnimate4.alpha(0.0f);
            viewPropertyAnimatorAnimate4.setDuration(200L);
            viewPropertyAnimatorAnimate4.setListener(new ALAdapterS2S0100000_5(this, 9));
            viewPropertyAnimatorAnimate4.start();
            this.LLJZ = viewPropertyAnimatorAnimate4;
        }
        LLLLIL().LJII.invoke();
    }
}
