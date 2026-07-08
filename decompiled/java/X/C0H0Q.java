package X;

import android.animation.ValueAnimator;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0H0Q, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H0Q extends C09AY implements Function0<Unit> {
    public final /* synthetic */ ArrayList<ValueAnimator> LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H0Q(ArrayList<ValueAnimator> arrayList, int i) {
        super(0);
        this.LL = arrayList;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ValueAnimator valueAnimator = (ValueAnimator) C13LP.LJJJLZIJ(this.LLILLJJLI + 1, this.LL);
        if (valueAnimator != null) {
            valueAnimator.start();
        }
        return Unit.LIZ;
    }
}
