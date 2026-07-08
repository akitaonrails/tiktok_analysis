package X;

import Y.ACListenerS52S0101000_12;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0TQp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C746650TQp extends AbstractC21673619ry<C746660TQq> {
    public final InterfaceC746680TQs LL;
    public final List<C746670TQr> LLILLJJLI;
    public String LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C746660TQq c746660TQq = (C746660TQq) viewHolder;
        ((TextView) c746660TQq.LL.getValue()).setText(((C746670TQr) ListProtector.get(this.LLILLJJLI, i)).LIZIZ);
        ((C1841350y17) c746660TQq.LLILLJJLI.getValue()).setChecked(((C746670TQr) ListProtector.get(this.LLILLJJLI, i)).LIZ.equals(this.LLILLL));
        C786410Ut5.I7(new ACListenerS52S0101000_12(this, i, 8), c746660TQq.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C746660TQq c746660TQq = new C746660TQq(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.s4, viewGroup, false));
        try {
            View view = c746660TQq.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c746660TQq.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c746660TQq.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C746660TQq.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c746660TQq.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c746660TQq.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C746660TQq.class.getName();
        return c746660TQq;
    }

    public C746650TQp(InterfaceC746680TQs interfaceC746680TQs, List<C746670TQr> list, String str) {
        this.LL = interfaceC746680TQs;
        this.LLILLJJLI = list;
        this.LLILLL = str;
    }
}
