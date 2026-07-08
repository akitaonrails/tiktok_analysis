package X;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mF2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1388700mF2<VH extends RecyclerView.ViewHolder, T> extends AbstractC683590Qrd<T> {
    public final C2045207zm<T> LL;

    public int LLLI() {
        return 0;
    }

    public final List<T> LLLFZ() {
        List<? extends T> list = this.LL.LIZJ;
        return list == null ? Collections.emptyList() : list;
    }

    @Override // X.AbstractC683510QrV, X.AbstractC438050HFr, X.AbstractC21673619ry
    public final int getItemCount() {
        List<? extends T> list = this.LL.LIZJ;
        return (list != null ? list.size() : 0) + LLLI();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.0mF5] */
    public AbstractC1388700mF2(Object obj) {
        C1388710mF3 c1388710mF3 = new C1388710mF3(new AbstractC339510DSr<T>() { // from class: X.0DKn
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(T t, T t2) {
                return Intrinsics.LJFF(t, t2);
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(T t, T t2) {
                return Intrinsics.LJFF(t, t2);
            }
        });
        if (c1388710mF3.LIZ == null) {
            synchronized (C1388710mF3.LIZIZ) {
                try {
                    if (C1388710mF3.LIZJ == null) {
                        C1388710mF3.LIZJ = C786410Ut5.d4(2);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            c1388710mF3.LIZ = C1388710mF3.LIZJ;
        }
        C2045307zn c2045307zn = new C2045307zn(c1388710mF3.LIZ, null);
        super(false);
        final AwS600S0100000_21 awS600S0100000_21 = new AwS600S0100000_21(this, (AbstractC1388700mF2<RecyclerView.ViewHolder, Object>) 301);
        this.LL = new C2045207zm<>(new InterfaceC1388720mF4(this, awS600S0100000_21) { // from class: X.0mF5
            public final T LL;
            public final Function1<Integer, Integer> LLILLJJLI;

            @Override // X.InterfaceC1388720mF4
            public final void notifyDataSetChanged() {
                this.LL.notifyDataSetChanged();
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LL = this;
                this.LLILLJJLI = awS600S0100000_21;
            }

            @Override // X.InterfaceC1891370zJn
            public final void LJZL(int i, int i2) {
                if (i2 == 0) {
                    return;
                }
                this.LL.notifyItemRangeInserted(this.LLILLJJLI.invoke(Integer.valueOf(i)).intValue(), i2);
            }

            @Override // X.InterfaceC1891370zJn
            public final void LLI(int i, int i2) {
                this.LL.notifyItemMoved(this.LLILLJJLI.invoke(Integer.valueOf(i)).intValue(), this.LLILLJJLI.invoke(Integer.valueOf(i2)).intValue());
            }

            @Override // X.InterfaceC1891370zJn
            public final void LLIZLLLIL(int i, int i2) {
                if (i2 == 0) {
                    return;
                }
                if (i == 0 && i2 == this.LL.getItemCount()) {
                    this.LL.notifyDataSetChanged();
                }
                this.LL.notifyItemRangeRemoved(this.LLILLJJLI.invoke(Integer.valueOf(i)).intValue(), i2);
            }

            @Override // X.InterfaceC1891370zJn
            public final void LLJJJJJIL(int i, int i2, Object obj2) {
                this.LL.notifyItemRangeChanged(this.LLILLJJLI.invoke(Integer.valueOf(i)).intValue(), i2, obj2);
            }
        }, c2045307zn);
        this.mShowFooter = false;
    }

    public final T LLLII(int i) {
        if (i >= LLLI() && i < getItemCount()) {
            C2045207zm<T> c2045207zm = this.LL;
            int iLLLI = i - LLLI();
            List<? extends T> list = c2045207zm.LIZJ;
            if (list != null && iLLLI < list.size() && iLLLI >= 0) {
                return (T) ListProtector.get(list, iLLLI);
            }
            return null;
        }
        return null;
    }

    public final void LLLIIIIL(List<? extends T> list) {
        C2045207zm<T> c2045207zm = this.LL;
        c2045207zm.LIZJ = list;
        c2045207zm.LIZ.notifyDataSetChanged();
    }
}
