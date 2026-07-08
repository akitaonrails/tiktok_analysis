package X;

import Y.AsS54S0100000_28;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zI3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1890290zI3 extends AbstractC2172971A2l<C1890270zI1, RecyclerView.ViewHolder> {
    public final InterfaceC1890280zI2 LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public final HashMap<C13IQ<? extends InterfaceC1891350zJl>, Integer> LLILZIL;

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        C1890270zI1 c1890270zI1 = (C1890270zI1) ListProtector.get(this.LL.LJFF, i);
        if (c1890270zI1 != null) {
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(c1890270zI1.LIZ.getClass());
            if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C1889660zH2.class))) {
                return 9999;
            }
            Integer numValueOf = this.LLILZIL.get(c19719912DlLIZ);
            if (numValueOf == null) {
                int i2 = this.LLILZ;
                this.LLILZ = i2 + 1;
                numValueOf = Integer.valueOf(i2);
                this.LLILZIL.put(c19719912DlLIZ, numValueOf);
            }
            return numValueOf.intValue();
        }
        return Integer.MAX_VALUE;
    }

    @Override // X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.LLILLJJLI.LJ(recyclerView);
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C1749280vcc c1749280vcc;
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof C1890300zI4) {
            C786410Ut5.LJLLLLLL(0, viewHolder.itemView);
            View view = viewHolder.itemView;
            if ((view instanceof C1749280vcc) && (c1749280vcc = (C1749280vcc) view) != null) {
                c1749280vcc.LJ();
            }
            if (!this.LLILLL) {
                this.LLILLL = true;
                this.LLILLJJLI.LIZIZ();
                return;
            }
            return;
        }
        this.LLILLJJLI.LJII(viewHolder);
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        C1890270zI1 c1890270zI1LLLFZ;
        super.onViewDetachedFromWindow(viewHolder);
        InterfaceC1891350zJl interfaceC1891350zJl = null;
        if (viewHolder instanceof C1890300zI4) {
            View view = viewHolder.itemView;
            if ((view instanceof C1749280vcc) && view != null) {
                C337180DJs.LIZ(view);
                return;
            }
            return;
        }
        Integer numValueOf = Integer.valueOf(viewHolder.getBindingAdapterPosition());
        if (numValueOf.intValue() != -1) {
            c1890270zI1LLLFZ = LLLFZ(numValueOf.intValue());
        } else {
            c1890270zI1LLLFZ = null;
        }
        InterfaceC1890280zI2 interfaceC1890280zI2 = this.LLILLJJLI;
        if (c1890270zI1LLLFZ != null) {
            interfaceC1891350zJl = c1890270zI1LLLFZ.LIZ;
        }
        interfaceC1890280zI2.LIZLLL(viewHolder, interfaceC1891350zJl);
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        super.onViewRecycled(viewHolder);
        if (viewHolder instanceof C1890300zI4) {
            viewHolder.getClass();
            int i = C2187451AjH.LIZ;
        } else {
            this.LLILLJJLI.LIZJ(viewHolder);
        }
    }

    public C1890290zI3(C1319210kQx c1319210kQx, C1889570zGt c1889570zGt) {
        super(new AbstractC339510DSr<C1890270zI1>() { // from class: X.0zI5
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(C1890270zI1 c1890270zI1, C1890270zI1 c1890270zI12) {
                C1890270zI1 c1890270zI13 = c1890270zI1;
                C1890270zI1 c1890270zI14 = c1890270zI12;
                if (c1890270zI14.LIZ.areContentsTheSame(c1890270zI13.LIZ) && c1890270zI14.LIZIZ == c1890270zI13.LIZIZ) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(C1890270zI1 c1890270zI1, C1890270zI1 c1890270zI12) {
                C1890270zI1 c1890270zI13 = c1890270zI1;
                C1890270zI1 c1890270zI14 = c1890270zI12;
                if (c1890270zI14.LIZ.areItemTheSame(c1890270zI13.LIZ) && c1890270zI14.LIZIZ == c1890270zI13.LIZIZ) {
                    return true;
                }
                return false;
            }
        });
        this.LLILLJJLI = c1889570zGt;
        c1319210kQx.addOnScrollListener(new AsS54S0100000_28(this, 2));
        this.LLILZIL = new HashMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Object c098200Yq;
        C1890270zI1 c1890270zI1 = (C1890270zI1) ListProtector.get(this.LL.LJFF, i);
        if (c1890270zI1 == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            ((C0Z37) viewHolder).LJZI(i, c1890270zI1.LIZ);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        this.LLILLJJLI.LJI(viewHolder, c1890270zI1.LIZ, i);
        C19252910Tv.LIZIZ.LIZLLL().LJIIL().LJIIIZ(viewHolder.itemView, c1890270zI1.LIZIZ);
        C1508630pMT.LIZ.getClass();
        C1508630pMT.LIZ(jCurrentTimeMillis, viewHolder);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c1890330zI7;
        if (i == 9999) {
            int i2 = C1890300zI4.LL;
            c1890330zI7 = new C1890300zI4(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a_t, viewGroup, false));
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            c1890330zI7 = null;
            for (Map.Entry<C13IQ<? extends InterfaceC1891350zJl>, Integer> entry : this.LLILZIL.entrySet()) {
                if (entry.getValue().intValue() == i) {
                    c1890330zI7 = this.LLILLJJLI.LJFF(viewGroup, entry.getKey());
                    entry.getKey().LJI();
                }
            }
            if (c1890330zI7 != null) {
                C1508630pMT.LIZ.getClass();
                C1508630pMT.LIZIZ(jCurrentTimeMillis, c1890330zI7);
            }
            if (c1890330zI7 == null) {
                int i3 = C1890330zI7.LL;
                c1890330zI7 = new C1890330zI7(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a_p, viewGroup, false));
            }
        }
        try {
            View view = c1890330zI7.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1890330zI7.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1890330zI7.itemView.getParent() != null) {
                boolean zLIZ = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    zLIZ = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (zLIZ) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook,");
                    stringBuffer.append(" holder ");
                    stringBuffer.append(c1890330zI7.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1890330zI7.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1890330zI7.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c1890330zI7.getClass().getName();
        return c1890330zI7;
    }
}
