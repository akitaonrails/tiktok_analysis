package Y;

import X.C013C;
import X.C01GW;
import X.C0GY9;
import X.C1619980sG4;
import X.C19EG;
import X.C2286608xc;
import X.C259800zU;
import X.C426750GoL;
import X.C437560HDu;
import X.C439110HJt;
import X.C439120HJu;
import X.C455920HuI;
import X.C457640Hx4;
import X.C459110HzR;
import X.C461190I6r;
import X.C786410Ut5;
import X.InterfaceC1364105Vn;
import X.InterfaceC2217461Bqa;
import X.InterfaceC346701Wf;
import X.InterfaceC439080HJq;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewFlipper;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.ability.ScrollToMessageViewModel;
import com.ss.android.ugc.aweme.model.IMSocialAvatarStatus;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public class AgS73S0400000_6 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            case 2:
                return emit$2(this, obj, interfaceC1364105Vn);
            case 3:
                return emit$3(this, obj, interfaceC1364105Vn);
            case 4:
                return emit$4(this, obj, interfaceC1364105Vn);
            case 5:
                return emit$5(this, obj, interfaceC1364105Vn);
            case 6:
                return emit$6(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public static final Object emit$0(AgS73S0400000_6 agS73S0400000_6, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objInvoke = ((Function0) agS73S0400000_6.l0).invoke();
        if (objInvoke != null && Intrinsics.LJFF(obj, objInvoke)) {
            C461190I6r c461190I6r = (C461190I6r) agS73S0400000_6.l1;
            List list = (List) agS73S0400000_6.l2;
            AnimatorSet animatorSet = new AnimatorSet();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 1.08f);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS255S0100000_5(list, 31));
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.08f, 1.0f);
            valueAnimatorOfFloat2.addUpdateListener(new AUListenerS255S0100000_5(list, 32));
            valueAnimatorOfFloat2.setDuration(300L);
            valueAnimatorOfFloat2.setInterpolator(C0GY9.LIZIZ(0.25f, 0.0f, 0.8f, 1.88f));
            animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2);
            animatorSet.setStartDelay(200L);
            ScrollToMessageViewModel scrollToMessageViewModel = (ScrollToMessageViewModel) agS73S0400000_6.l3;
            C013C c013c = new C013C();
            animatorSet.addListener(new AAListenerS317S0100000_6(c013c, 48));
            animatorSet.addListener(new AAListenerS261S0200000_6(c013c, scrollToMessageViewModel, 18));
            animatorSet.start();
            c461190I6r.LIZJ = animatorSet;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, X.0HDu] */
    public static final Object emit$1(AgS73S0400000_6 agS73S0400000_6, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ?? r4 = (C437560HDu) obj;
        ((C259800zU) agS73S0400000_6.l0).element = r4;
        ((C439110HJt) agS73S0400000_6.l1).LIZJ(r4, (InterfaceC439080HJq) ((C259800zU) agS73S0400000_6.l2).element, (C439120HJu) ((C259800zU) agS73S0400000_6.l3).element);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, X.0HJq] */
    public static final Object emit$2(AgS73S0400000_6 agS73S0400000_6, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ?? r4 = (InterfaceC439080HJq) obj;
        ((C259800zU) agS73S0400000_6.l0).element = r4;
        ((C439110HJt) agS73S0400000_6.l1).LIZJ((C437560HDu) ((C259800zU) agS73S0400000_6.l2).element, r4, (C439120HJu) ((C259800zU) agS73S0400000_6.l3).element);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, X.0HJu] */
    public static final Object emit$3(AgS73S0400000_6 agS73S0400000_6, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ?? r4 = (C439120HJu) obj;
        ((C259800zU) agS73S0400000_6.l0).element = r4;
        ((C439110HJt) agS73S0400000_6.l1).LIZJ((C437560HDu) ((C259800zU) agS73S0400000_6.l2).element, (InterfaceC439080HJq) ((C259800zU) agS73S0400000_6.l3).element, r4);
        return Unit.LIZ;
    }

    public static final Object emit$4(AgS73S0400000_6 agS73S0400000_6, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((C455920HuI) agS73S0400000_6.l0).LJFF((IMSocialAvatarStatus) obj, (RecyclerView) agS73S0400000_6.l1, (ViewFlipper) agS73S0400000_6.l2, (C19EG) agS73S0400000_6.l3);
        return Unit.LIZ;
    }

    public static final Object emit$5(AgS73S0400000_6 agS73S0400000_6, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        if (!((Boolean) obj).booleanValue()) {
            if (((C013C) agS73S0400000_6.l0).element) {
                ViewGroup viewGroup = (ViewGroup) agS73S0400000_6.l1;
                C01GW c01gw = (C01GW) agS73S0400000_6.l2;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C459110HzR.LLILZIL;
                C786410Ut5.LJJJLZIJ((View) c01gw.getValue(), viewGroup);
            }
        } else {
            ViewGroup viewGroup2 = (ViewGroup) agS73S0400000_6.l1;
            C01GW c01gw2 = (C01GW) agS73S0400000_6.l2;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C459110HzR.LLILZIL;
            viewGroup2.addView((View) c01gw2.getValue());
            View view = (View) ((C01GW) agS73S0400000_6.l2).getValue();
            AssemVMLazy assemVMLazy = (AssemVMLazy) agS73S0400000_6.l3;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr3 = C459110HzR.LLILZIL;
            C426750GoL.LJIIIZ(view, null, null, null, C2286608xc.LJ(((C457640Hx4) assemVMLazy.getValue().getState()).LL), false, 23);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2 A[PHI: r8
      0x00a2: PHI (r8v4 java.lang.String) = (r8v1 java.lang.String), (r8v5 java.lang.String) binds: [B:36:0x00a0, B:34:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca A[PHI: r8
      0x00ca: PHI (r8v2 java.lang.String) = (r8v1 java.lang.String), (r8v4 java.lang.String) binds: [B:36:0x00a0, B:38:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$6(Y.AgS73S0400000_6 r15, java.lang.Object r16, X.InterfaceC1364105Vn r17) {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS73S0400000_6.emit$6(Y.AgS73S0400000_6, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AgS73S0400000_6(Object obj, Function0<Long> function0, C461190I6r c461190I6r, List<? extends View> list, ScrollToMessageViewModel scrollToMessageViewModel) {
        this.$t = scrollToMessageViewModel;
        this.l0 = obj;
        this.l1 = function0;
        this.l2 = c461190I6r;
        this.l3 = list;
    }
}
