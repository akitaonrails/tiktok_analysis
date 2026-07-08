package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS370S0200000_4;

/* JADX INFO: renamed from: X.0DGF, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public abstract class C0DGF extends AbstractC21673619ry<C0DGH> {
    public List<C0D5D> LL;
    public final Function1<C0D5D, Unit> LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ = -1;

    public abstract int LLLFZ();

    public void LLLI(C0DGH c0dgh, boolean z) {
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public C0DGF(List list, AwS370S0200000_4 awS370S0200000_4) {
        this.LL = list;
        this.LLILLJJLI = awS370S0200000_4;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        C0DGH c0dgh = (C0DGH) viewHolder;
        C0D5D c0d5d = (C0D5D) ListProtector.get(this.LL, i);
        if (i == this.LLILZ) {
            z = true;
        } else {
            z = false;
        }
        int i2 = C0DGH.LLIZ;
        c0dgh.I5(c0d5d, z, C13BV.INSTANCE);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0DGH c0dgh = new C0DGH(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), LLLFZ(), viewGroup, false));
        try {
            View view = c0dgh.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0dgh.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0dgh.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0DGH.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0dgh.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0dgh.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0DGH.class.getName();
        return c0dgh;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        Iterable iterable;
        C0DGH c0dgh = (C0DGH) viewHolder;
        C0D5D c0d5d = (C0D5D) ListProtector.get(this.LL, i);
        boolean z = true;
        if (list.isEmpty()) {
            if (i != this.LLILZ) {
                z = false;
            }
            int i2 = C0DGH.LLIZ;
            c0dgh.I5(c0d5d, z, C13BV.INSTANCE);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!(obj instanceof List) || (iterable = (Iterable) obj) == null) {
                iterable = C13BV.INSTANCE;
            }
            C19719612Di.LJJI(iterable, arrayList);
        }
        if (i != this.LLILZ) {
            z = false;
        }
        c0dgh.I5(c0d5d, z, arrayList);
    }
}
