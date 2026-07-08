package X;

import Y.ACListenerS79S0300000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushOffReason;
import com.ss.android.ugc.aweme.setting.serverpush.ui.PushOffReasonBottomSheetFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0TV8, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TV8 extends AbstractC21673619ry<C0TV9> {
    public final Context LL;
    public final List<PushOffReason> LLILLJJLI;
    public PushOffReasonBottomSheetFragment LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    public C0TV8(Context context, List<PushOffReason> list) {
        this.LL = context;
        this.LLILLJJLI = list;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C0TV9 c0tv9 = (C0TV9) viewHolder;
        PushOffReason pushOffReason = (PushOffReason) ListProtector.get(this.LLILLJJLI, i);
        c0tv9.LLILLJJLI.setText(pushOffReason.reason);
        C786410Ut5.I7(new ACListenerS79S0300000_12(c0tv9, this, pushOffReason, 12), c0tv9.LL);
        C786410Ut5.D7(c0tv9.LLILLL, new C785920UsI(this, pushOffReason, 2));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0TV9 c0tv9 = new C0TV9(C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.f7j, viewGroup, false));
        try {
            View view = c0tv9.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0tv9.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0tv9.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0TV9.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0tv9.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0tv9.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0TV9.class.getName();
        return c0tv9;
    }
}
