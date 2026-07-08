package X;

import Y.ARunnableS37S0101000_26;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import g1c.AjS44S0200000_26;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS617S0100000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vUk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1744400vUk<T> extends AbstractC2172971A2l<T, C1744440vUo> {
    public final Function2<? super Integer, ? super T, Unit> LLILLJJLI;
    public final boolean LLILLL;
    public final BPEAHandler LLILZ;
    public int LLILZIL;
    public RecyclerView LLILZLL;

    public AbstractC1744400vUk() {
        this((AwS617S0100000_3) null, 3);
    }

    @Override // X.AbstractC21673619ry
    public long getItemId(int i) {
        return i;
    }

    public final void LLLIILIL(int i) {
        int i2 = this.LLILZIL;
        if (i2 != i) {
            if (i2 >= 0) {
                notifyItemChanged(i2);
            }
            this.LLILZIL = i;
            notifyItemChanged(i);
        }
        if (i >= 0) {
            C786410Ut5.LJJZZIII(this.LLILZ, new ARunnableS37S0101000_26(this, i, 7));
        }
    }

    @Override // X.AbstractC21673619ry
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        if (Intrinsics.LJFF(this.LLILZLL, recyclerView)) {
            this.LLILZLL = null;
        }
    }

    public AbstractC1744400vUk(Function2<? super Integer, ? super T, Unit> function2, boolean z) {
        super(new AbstractC339510DSr<T>() { // from class: X.0DKk
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(T t, T t2) {
                return true;
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(T t, T t2) {
                return Intrinsics.LJFF(t, t2);
            }
        });
        this.LLILLJJLI = function2;
        this.LLILLL = z;
        this.LLILZ = new BPEAHandler(Looper.getMainLooper());
        this.LLILZIL = -1;
    }

    @Override // X.AbstractC21673619ry
    /* JADX INFO: renamed from: LLLIIIIL, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C1744440vUo c1744440vUo, int i) {
        boolean z;
        View view = c1744440vUo.itemView;
        if (i == this.LLILZIL) {
            z = true;
        } else {
            z = false;
        }
        view.setSelected(z);
        C786410Ut5.I7(new AjS44S0200000_26(c1744440vUo, this, 37), c1744440vUo.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        final View viewLIZJ = C0H1U.LIZJ(i, viewGroup, false);
        RecyclerView.ViewHolder viewHolder = new RecyclerView.ViewHolder(viewLIZJ) { // from class: X.0vUo
        };
        try {
            View view = viewHolder.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        viewHolder.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1744440vUo.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolder.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1744440vUo.class.getName();
        return viewHolder;
    }

    public /* synthetic */ AbstractC1744400vUk(AwS617S0100000_3 awS617S0100000_3, int i) {
        this((Function2) ((i & 1) != 0 ? null : awS617S0100000_3), false);
    }
}
