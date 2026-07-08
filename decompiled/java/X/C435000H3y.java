package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H3y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C435000H3y extends AbstractC21673619ry<C0H40> {
    public final List<C435010H3z> LL = new ArrayList();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LL).size();
    }

    public final void LLLFZ(String str, String str2) {
        Iterator it2 = ((ArrayList) this.LL).iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(((C435010H3z) it2.next()).LIZ, str)) {
                if (i >= 0) {
                    List<C435010H3z> list = this.LL;
                    C435010H3z c435010H3z = (C435010H3z) ListProtector.get(list, i);
                    ListProtector.set(list, i, new C435010H3z(c435010H3z.LIZ, c435010H3z.LIZIZ, str2));
                    notifyItemChanged(i);
                    return;
                }
                return;
            }
            i++;
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C0H40 c0h40 = (C0H40) viewHolder;
        C435010H3z c435010H3z = (C435010H3z) ListProtector.get(this.LL, i);
        boolean z = true;
        int i2 = 0;
        if (i != ((ArrayList) this.LL).size() - 1) {
            z = false;
        }
        c0h40.LL.setText(c435010H3z.LIZIZ);
        TuxTextView tuxTextView = c0h40.LLILLJJLI;
        String str = c435010H3z.LIZJ;
        if (str == null) {
            str = "xxx";
        }
        tuxTextView.setText(str);
        View view = c0h40.LLILLL;
        if (z) {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, view);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0H40 c0h40 = new C0H40(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cwy, viewGroup, false));
        try {
            View view = c0h40.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0h40.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0h40.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0H40.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0h40.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0h40.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0H40.class.getName();
        return c0h40;
    }
}
