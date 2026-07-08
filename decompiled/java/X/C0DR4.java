package X;

import Y.ACListenerS48S0101000_4;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.model.AdDislikeReasonModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0DR4, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DR4 extends AbstractC21673619ry<C0DR5> {
    public final List<AdDislikeReasonModel> LL;
    public final InterfaceC1631620sYq<String, String, Integer, Unit> LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public C0DR4(List list, C1064930dop c1064930dop) {
        this.LL = list;
        this.LLILLJJLI = c1064930dop;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        TextView textView;
        View view = viewHolder.itemView;
        if ((view instanceof TextView) && (textView = (TextView) view) != null) {
            textView.setText(((AdDislikeReasonModel) ListProtector.get(this.LL, i)).reason);
            C786410Ut5.T7(textView, new ACListenerS48S0101000_4(this, i, 3));
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        final View viewFindViewById = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bme, viewGroup, false).findViewById(R.id.fxu);
        RecyclerView.ViewHolder viewHolder = new RecyclerView.ViewHolder(viewFindViewById) { // from class: X.0DR5
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
                    stringBuffer.append(C0DR5.class.getName());
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
        C20612085q.LIZ = C0DR5.class.getName();
        return viewHolder;
    }
}
