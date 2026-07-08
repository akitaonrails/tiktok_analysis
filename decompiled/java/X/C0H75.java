package X;

import X.C0H76;
import Y.ARunnableS106S0100000_6;
import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS250S0300000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H75, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public abstract class C0H75<D, VH extends C0H76> extends AbstractC21673619ry<VH> {
    public List<? extends D> LL = C13BV.INSTANCE;
    public final HashMap<D, Integer> LLILLJJLI = new HashMap<>();
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(535));

    public final void LLLI(Function0<Unit> function0) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            function0.invoke();
        } else {
            C786410Ut5.LJJZZIII((Handler) this.LLILLL.getValue(), new ARunnableS106S0100000_6((Function0) function0, 267));
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        ((Handler) this.LLILLL.getValue()).removeCallbacksAndMessages(null);
    }

    public static void LLLII(C0H75 c0h75, List list) {
        c0h75.getClass();
        c0h75.LLLI(new AwS250S0300000_6(c0h75, (C0H75<Object, C0H76>) list, (List<Object>) null, (Function1<Object, Integer>) 18));
    }

    @Override // X.AbstractC21673619ry
    /* JADX INFO: renamed from: LLLFZ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(VH vh, int i, List<Object> list) {
        if (i >= this.LL.size()) {
            return;
        }
        Integer num = this.LLILLJJLI.get(ListProtector.get(this.LL, i));
        if (num != null) {
            vh.I5(num.intValue());
        }
        if (!list.contains(1)) {
            super.onBindViewHolder(vh, i, list);
        }
    }
}
