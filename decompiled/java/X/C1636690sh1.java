package X;

import X.C1636260sgK;
import android.util.SparseArray;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0sh1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1636690sh1<T, VH extends C1636260sgK<T>> {
    public int LIZ;
    public final SparseArray<Function1<ViewGroup, VH>> LIZIZ = new SparseArray<>();
    public final List<C1636730sh5<VH>> LIZJ;

    public C1636690sh1() {
        this.LIZ = 11513600;
        AFwS266S0000000_25 aFwS266S0000000_25 = AFwS266S0000000_25.get$arr$(553);
        AFwS266S0000000_25 aFwS266S0000000_252 = AFwS266S0000000_25.get$arr$(554);
        int i = this.LIZ;
        this.LIZ = i + 1;
        this.LIZJ = C1697810uHb.LJIILJJIL(new C1636730sh5(i, aFwS266S0000000_25, aFwS266S0000000_252));
    }

    public final void LIZ(Function1<? super Integer, Boolean> function1, Function1<? super ViewGroup, ? extends VH> function12) {
        int size = this.LIZJ.size();
        int i = this.LIZ;
        this.LIZ = i + 1;
        ListProtector.add(this.LIZJ, size - 1, new C1636730sh5(i, function12, function1));
    }

    public final void LIZIZ(AFwS189S0000000_3 aFwS189S0000000_3, AwS604S0100000_25 awS604S0100000_25, AwS604S0100000_25 awS604S0100000_252) {
        int iIntValue;
        int size = this.LIZJ.size();
        if (aFwS189S0000000_3 != null) {
            Integer num = 1;
            iIntValue = num.intValue();
        } else {
            iIntValue = this.LIZ;
            this.LIZ = iIntValue + 1;
        }
        ListProtector.add(this.LIZJ, size - 1, new C1636730sh5(iIntValue, awS604S0100000_252, awS604S0100000_25));
    }
}
