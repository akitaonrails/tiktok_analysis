package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0f4e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1113180f4e extends C2217421BqW implements Function2<Integer, Integer, Unit> {
    public C1113180f4e(Object obj) {
        super(2, obj, C1113120f4Y.class, "onModelRangeRemoved", "onModelRangeRemoved(II)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, Integer num2) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        C1111720f2I c1111720f2I = ((C1113120f4Y) this.receiver).LLJI;
        if (c1111720f2I != null) {
            c1111720f2I.notifyItemRangeRemoved(iIntValue, iIntValue2);
        }
        return Unit.LIZ;
    }
}
