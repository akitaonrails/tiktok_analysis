package X;

import android.util.SparseArray;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0UBG, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public class C0UBG {
    public final Function1<? super Integer, C21683719tb> LIZ;

    public C0UBG(AwS591S0100000_12 awS591S0100000_12) {
        this.LIZ = awS591S0100000_12;
        new SparseArray();
    }

    public final C21683719tb LIZ(int i) {
        C21683719tb c21683719tbInvoke;
        Function1<? super Integer, C21683719tb> function1 = this.LIZ;
        if (function1 == null || (c21683719tbInvoke = function1.invoke(Integer.valueOf(i))) == null) {
            return new C21683719tb(1, 1);
        }
        return c21683719tbInvoke;
    }
}
