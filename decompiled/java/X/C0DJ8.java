package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0DJ8, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DJ8 extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final Map<Class<?>, C0DJ9<?, ?>> LL = new LinkedHashMap();
    public final List<Class<?>> LLILLJJLI = new ArrayList();
    public List<? extends Object> LLILLL = C13BV.INSTANCE;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLL.size();
    }

    public final C0DJ9<?, ?> LLLFZ(Class<?> cls) {
        for (Map.Entry entry : ((LinkedHashMap) this.LL).entrySet()) {
            if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                return (C0DJ9) entry.getValue();
            }
        }
        return null;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        int i2 = 0;
        for (Class<?> cls : this.LLILLJJLI) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                if (cls.isAssignableFrom(ListProtector.get(this.LLILLL, i).getClass())) {
                    return i2;
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return -1;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C0DJ9<?, ?> c0dj9LLLFZ = LLLFZ(ListProtector.get(this.LLILLL, i).getClass());
        if ((c0dj9LLLFZ instanceof C0DJ9) && c0dj9LLLFZ != null) {
            Object obj = ListProtector.get(this.LLILLL, i);
            c0dj9LLLFZ.LIZ(viewHolder, obj);
            InterfaceC1631620sYq<? super Integer, ? super T, ? super VH, Unit> interfaceC1631620sYq = c0dj9LLLFZ.LIZ;
            if (interfaceC1631620sYq != 0) {
                interfaceC1631620sYq.invoke(Integer.valueOf(i), (Object) obj, viewHolder);
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolderLIZIZ;
        if (i >= 0 && i < ((ArrayList) this.LLILLJJLI).size()) {
            C0DJ9<?, ?> c0dj9LLLFZ = LLLFZ((Class) ListProtector.get(this.LLILLJJLI, i));
            if (c0dj9LLLFZ == null || (viewHolderLIZIZ = c0dj9LLLFZ.LIZIZ((RecyclerView) viewGroup)) == null) {
                final View view = new View(viewGroup.getContext());
                viewHolderLIZIZ = new RecyclerView.ViewHolder(view) { // from class: X.0DJB
                };
            }
        } else {
            final View view2 = new View(viewGroup.getContext());
            viewHolderLIZIZ = new RecyclerView.ViewHolder(view2) { // from class: X.0DJB
            };
        }
        try {
            View view3 = viewHolderLIZIZ.itemView;
            if (view3 != null) {
                view3.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        viewHolderLIZIZ.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolderLIZIZ.itemView.getParent() != null) {
                boolean zLIZ = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    zLIZ = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (zLIZ) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(viewHolderLIZIZ.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolderLIZIZ.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolderLIZIZ.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = viewHolderLIZIZ.getClass().getName();
        return viewHolderLIZIZ;
    }
}
