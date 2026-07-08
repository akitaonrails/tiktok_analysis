package X;

import Y.AAListenerS330S0100000_19;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.text.SpannableStringBuilder;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0hm9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1217030hm9 implements AnonymousClass1875 {
    public final TuxTextView LL;
    public Animator LLILLJJLI;

    @Override // X.AnonymousClass1875
    public final void LJL() {
        Animator animator = this.LLILLJJLI;
        if (animator != null) {
            animator.cancel();
        }
        this.LLILLJJLI = null;
    }

    @Override // X.AnonymousClass1875
    public final Animator V() {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SimpleExtendedAddTimeHelper.extendedAddTimeAnimation(), extendTimeAnimator: ");
        sbLIZ.append(this.LLILLJJLI);
        C1720106oR.LJI("UsBidCardView", C2188811AlT.LIZIZ(sbLIZ));
        return this.LLILLJJLI;
    }

    @Override // X.AnonymousClass1875
    public final void LLLLLZL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" SimpleExtendedAddTimeHelper.createExtendTimeAnimator(), extendAddTime: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", extendAddTimeText: ");
        TuxTextView tuxTextView = this.LL;
        sbLIZ.append((Object) (tuxTextView != null ? tuxTextView.getText() : null));
        C1720106oR.LJI("UsBidCardView", C2188811AlT.LIZIZ(sbLIZ));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.addListener(new AAListenerS330S0100000_19(this, 9));
        this.LLILLJJLI = valueAnimatorOfFloat;
    }

    public C1217030hm9(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    @Override // X.AnonymousClass1875
    public final void LJJLIIIJJIZ(boolean z) {
        int i;
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, tuxTextView);
        }
    }

    @Override // X.AnonymousClass1875
    public final void q(long j) {
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('+');
            sbLIZ.append(j);
            sbLIZ.append('s');
            tuxTextView.setText(new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ)));
        }
    }
}
