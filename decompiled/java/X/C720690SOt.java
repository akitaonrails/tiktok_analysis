package X;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.ExploreDetailVisualWeakeningExperiment;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: renamed from: X.0SOt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C720690SOt implements InterfaceC724530SbT {
    public final C0SRL LL;
    public final Function0<Unit> LLILLJJLI;
    public ViewTreeObserver.OnGlobalLayoutListener LLILLL;
    public C21368918jv LLILZ;
    public final C0SBA LLILZIL;
    public Pair<? extends View, ? extends Runnable> LLILZLL;
    public final View LLIZ;
    public final ViewGroup LLIZLLLIL;
    public View LLJ;
    public List<? extends TextExtraStruct> LLJI;
    public final C01GW LLJIJIL;
    public final int LLJILJIL;

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public final C21368918jv LIZJ() {
        View view = this.LLJ;
        if (view != null) {
            return (C21368918jv) view.findViewById(R.id.rkk);
        }
        return null;
    }

    public final void LJI() {
        C21368918jv c21368918jv;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.LLILLL;
        if (onGlobalLayoutListener != null && (c21368918jv = this.LLILZ) != null && (viewTreeObserver = c21368918jv.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            C2187701Ajg.LIZIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        this.LLILLL = null;
        this.LLILZ = null;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LL.LJIIL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL() {
        C0SP0 c0sp0;
        if (C304280BwI.LIZLLL() || C304280BwI.LIZJ()) {
            LJI();
            C21368918jv c21368918jvLIZJ = LIZJ();
            if (c21368918jvLIZJ != null) {
                c21368918jvLIZJ.setOnSpanClickListener(null);
            }
        }
        C0SX4 c0sx4 = (C0SX4) this.LLJIJIL.getValue();
        if (c0sx4 != null) {
            List<WeakReference<C0SX4>> list = C0SX4.LJJJJIZL;
            synchronized (list) {
                try {
                    C19719612Di.LJJIIJ(list, new AwS590S0100000_11(c0sx4, 515), true);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            c0sx4.LJIILIIL.removeCallbacks(c0sx4.LJIILJJIL);
            c0sx4.LJIIIIZZ();
            c0sx4.LJIJ();
            c0sx4.LJII = null;
            for (TextView textView : (ArrayList) c0sx4.LJIIJJI) {
                textView.setOnTouchListener(null);
                textView.setCustomSelectionActionModeCallback(null);
                textView.setCustomInsertionActionModeCallback(null);
                if ((textView instanceof C0SP0) && (c0sp0 = (C0SP0) textView) != null) {
                    c0sp0.setShouldBlockSystemSelectionActionMode(false);
                }
            }
            ((ArrayList) c0sx4.LJIIJJI).clear();
        }
        Pair<? extends View, ? extends Runnable> pair = this.LLILZLL;
        if (pair != null) {
            HandlerHook.viewRemoveCallbacks(pair.getFirst(), pair.getSecond());
            this.LLILZLL = null;
        }
    }

    public final int LIZIZ(Context context) {
        String str;
        int i;
        Integer numLIZJ;
        ExploreDetailVisualWeakeningExperiment exploreDetailVisualWeakeningExperiment = ExploreDetailVisualWeakeningExperiment.INSTANCE;
        PostModeDetailParams postModeDetailParams = this.LL.LJII;
        if (postModeDetailParams != null) {
            str = postModeDetailParams.eventType;
        } else {
            str = null;
        }
        if (exploreDetailVisualWeakeningExperiment.enableLinkWeakening(str)) {
            i = R.attr.a1k;
        } else {
            i = R.attr.bb;
        }
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(i, context)) != null) {
            return numLIZJ.intValue();
        }
        return Color.rgb(64, 141, 159);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0153 A[PHI: r5
      0x0153: PHI (r5v2 X.0SJF) = (r5v1 X.0SJF), (r5v5 X.0SJF) binds: [B:65:0x00f1, B:73:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(X.C0S5R r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C720690SOt.LJII(X.0S5R):void");
    }

    public C720690SOt(C0SRL c0srl, Function0<Unit> function0) throws Throwable {
        C05YD<C0S5R> c05ydLIZIZ;
        this.LL = c0srl;
        this.LLILLJJLI = function0;
        C0SBA c0sbaDk = c0srl.LJIIL.Dk();
        this.LLILZIL = c0sbaDk;
        LifecycleCoroutineScope lifecycleCoroutineScopeLJIILJJIL = c0srl.LJIILJJIL();
        C0S5R value = null;
        View viewLIZIZ = C21146717pB.LIZIZ(c0srl.LIZLLL(), R.layout.e_r, null, false);
        this.LLIZ = viewLIZIZ;
        ViewGroup viewGroupLJIIIIZZ = c0srl.LJIIIIZZ();
        this.LLIZLLLIL = viewGroupLJIIIIZZ;
        this.LLJIJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1566));
        if (viewGroupLJIIIIZZ != null) {
            viewGroupLJIIIIZZ.addView(viewLIZIZ);
        }
        if (c0sbaDk != null) {
            if (c0sbaDk.LIZIZ() != null) {
                C23250099c.LIZLLL(lifecycleCoroutineScopeLJIILJJIL, null, null, new C720610SOl(this, null), 3);
            } else {
                if (c0sbaDk != null && (c05ydLIZIZ = c0sbaDk.LIZIZ()) != null) {
                    value = c05ydLIZIZ.getValue();
                }
                LJII(value);
            }
        } else {
            LJII(value);
        }
        this.LLJILJIL = -1;
    }

    public static C0SJF LIZ(C0SJF c0sjf, String str) {
        new ArrayList();
        return new C0SJF(C13LP.LJLIL(C0SFB.LIZ(c0sjf), Collections.singletonList(new C0SJM(0, 0, str))));
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.ss.android.ugc.aweme.model.TextExtraStruct r25, java.lang.String r26) {
        /*
            Method dump skipped, instruction units count: 1302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C720690SOt.LJ(com.ss.android.ugc.aweme.model.TextExtraStruct, java.lang.String):void");
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
