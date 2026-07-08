package X;

import Y.ACListenerS108S0200000_4;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: renamed from: X.0DUC, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DUC extends AbstractC21673619ry<C0DUD> {
    public final int LL;
    public final Function1<C1175004ii, Unit> LLILLJJLI;
    public final List<C1175004ii> LLILLL = new ArrayList();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLL).size();
    }

    public C0DUC(int i, AwS583S0100000_4 awS583S0100000_4) {
        this.LL = i;
        this.LLILLJJLI = awS583S0100000_4;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C0DUD c0dud = (C0DUD) viewHolder;
        C1175004ii c1175004ii = (C1175004ii) C13LP.LJJJLZIJ(i, this.LLILLL);
        if (c1175004ii != null) {
            c0dud.LL.setText(c1175004ii.LIZ);
            C786410Ut5.I7(new ACListenerS108S0200000_4(c1175004ii, this, 12), c0dud.itemView);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int iLIZIZ = C814420VxA.LIZIZ(viewGroup.getContext().getResources().getDisplayMetrics().density * 4.0f);
        int i2 = this.LL;
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(i2, i2);
        layoutParams.setMargins(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
        AppCompatTextView appCompatTextView = new AppCompatTextView(viewGroup.getContext(), null);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(appCompatTextView);
        appCompatTextView.setLayoutParams(layoutParams);
        appCompatTextView.setGravity(17);
        appCompatTextView.setTextSize(24.0f);
        C0DUD c0dud = new C0DUD(appCompatTextView);
        try {
            View view = c0dud.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0dud.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0dud.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0DUD.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0dud.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0dud.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0DUD.class.getName();
        return c0dud;
    }
}
