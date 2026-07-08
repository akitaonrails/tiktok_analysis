package X;

import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0sqY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1642600sqY extends AbstractC1640090smV<C1642670sqf> {
    public ContextWrapper LLILLJJLI;
    public final /* synthetic */ C1642630sqb LLILLL;

    public C1642600sqY(C1642630sqb c1642630sqb) {
        this.LLILLL = c1642630sqb;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1642620sqa c1642620sqa;
        if ((viewHolder instanceof C1642620sqa) && (c1642620sqa = (C1642620sqa) viewHolder) != null) {
            c1642620sqa.I5(LJJLIIIJJI(i));
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (this.LLILLJJLI == null) {
            this.LLILLJJLI = this.LLILLL.getFilterBoxViewConfigure().LIZ.LJ.invoke(viewGroup.getContext());
        }
        C1642620sqa c1642620sqa = new C1642620sqa(this, (LinearLayout) C786410Ut5.Td(C786410Ut5.ne(this.LLILLJJLI), R.layout.tu, viewGroup, false));
        try {
            View view = c1642620sqa.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1642620sqa.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1642620sqa.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1642620sqa.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1642620sqa.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1642620sqa.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1642620sqa.class.getName();
        return c1642620sqa;
    }
}
