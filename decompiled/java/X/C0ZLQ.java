package X;

import Y.AAListenerS325S0100000_14;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.LongPressConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0ZLQ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZLQ implements InterfaceC912720ZrK {
    public final /* synthetic */ C0ZLP LIZ;
    public final /* synthetic */ LongPressConfig LIZIZ;
    public final /* synthetic */ View LIZJ;

    public final void LIZIZ() {
        C0ZL5 c0zl5 = this.LIZ.LIZLLL;
        if (c0zl5 != null) {
            c0zl5.onShow(false);
        }
    }

    @Override // X.InterfaceC912720ZrK
    public final void LIZJ() {
        C0ZLP c0zlp = this.LIZ;
        View view = this.LIZJ;
        LongPressConfig.MovingLongPressPanelConfig movingLongPressPanelConfig = this.LIZIZ.movingLongPressPanelConfig;
        View view2 = c0zlp.LJ;
        C912760ZrO c912760ZrO = view2 instanceof C912760ZrO ? (C912760ZrO) view2 : null;
        if (c912760ZrO != null) {
            Animator animator = c912760ZrO.LLJJLIIIJLLLLLLLZ;
            if (animator != null) {
                animator.cancel();
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", 0.0f);
            objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJIIIZ());
            objectAnimatorOfFloat.setDuration(200L);
            objectAnimatorOfFloat.addListener(new AAListenerS325S0100000_14(view, 6));
            C786410Ut5.Pd(objectAnimatorOfFloat);
            c912760ZrO.LLJJLIIIJLLLLLLLZ = objectAnimatorOfFloat;
        }
        List<Integer> list = movingLongPressPanelConfig.toHideMessageComponents;
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it2 = list.iterator();
        while (it2.hasNext()) {
            View viewFindViewById = view.findViewById(it2.next().intValue());
            if (viewFindViewById != null) {
                arrayList.add(viewFindViewById);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(it3.next(), "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat2.setDuration(200L);
            C786410Ut5.Pd(objectAnimatorOfFloat2);
        }
        c0zlp.LJFF.invoke(null);
        C0ZL5 c0zl5 = this.LIZ.LIZLLL;
        if (c0zl5 != null) {
            c0zl5.LIZJ();
        }
    }

    @Override // X.InterfaceC912720ZrK
    public final void LIZ(C0ZL0 c0zl0) {
        C0ZL5 c0zl5 = this.LIZ.LIZLLL;
        if (c0zl5 != null) {
            c0zl5.LIZ(c0zl0);
        }
    }

    public C0ZLQ(C0ZLP c0zlp, LongPressConfig longPressConfig, View view) {
        this.LIZ = c0zlp;
        this.LIZIZ = longPressConfig;
        this.LIZJ = view;
    }

    @Override // X.InterfaceC912720ZrK
    public final void LIZLLL(int i, int i2, List<String> list, List<String> list2) {
        C0ZLO c0zlo = this.LIZIZ.onLongPressPopupProvider;
        if (c0zlo != null) {
            c0zlo.LIZIZ(i, i2, C0ZLB.LIZ(this.LIZ), list, list2);
        }
    }
}
