package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0FJb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C387970FJb extends AbstractC21673619ry<AbstractC388060FJk> {
    public final List<C388080FJm> LL;
    public final InterfaceC388110FJp LLILLJJLI;
    public final boolean LLILLL;
    public final LifecycleOwner LLILZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return ((C388080FJm) ListProtector.get(this.LL, i)).LIZ();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ((AbstractC388060FJk) viewHolder).I5((C388080FJm) ListProtector.get(this.LL, i));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c388070FJl;
        if (i == 2) {
            FrameLayout frameLayout = (FrameLayout) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cyp, viewGroup, false);
            if (C387980FJc.LIZ(viewGroup.getContext())) {
                frameLayout.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
            }
            c388070FJl = new C388050FJj(frameLayout, this.LLILLL, this.LLILLJJLI);
        } else {
            FrameLayout frameLayout2 = (FrameLayout) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cyq, viewGroup, false);
            if (C387980FJc.LIZ(viewGroup.getContext())) {
                frameLayout2.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
            }
            c388070FJl = new C388070FJl(frameLayout2, this.LLILLL, this.LLILLJJLI, this.LLILZ);
        }
        try {
            View view = c388070FJl.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c388070FJl.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c388070FJl.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c388070FJl.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c388070FJl.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c388070FJl.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c388070FJl.getClass().getName();
        return c388070FJl;
    }

    public C387970FJb(List list, C387960FJa c387960FJa, boolean z, LifecycleOwner lifecycleOwner) {
        this.LL = list;
        this.LLILLJJLI = c387960FJa;
        this.LLILLL = z;
        this.LLILZ = lifecycleOwner;
    }
}
