package X;

import Y.ACListenerS48S0101000_4;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DTb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C339610DTb extends AbstractC21673619ry<C339620DTc> {
    public final String LL;
    public final List<Integer> LLILLJJLI;
    public int LLILLL;
    public final Function1<Integer, Boolean> LLILZ;
    public final Function1<Integer, Boolean> LLILZIL;
    public final Function1<Integer, Unit> LLILZLL;
    public final Function0<Unit> LLIZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        C339620DTc c339620DTc = (C339620DTc) viewHolder;
        int iIntValue = ((Number) ListProtector.get(this.LLILLJJLI, i)).intValue();
        c339620DTc.LL.setText(String.valueOf(iIntValue));
        LiveIconView liveIconView = c339620DTc.LLILLJJLI;
        if (iIntValue == this.LLILLL) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LLJJIJIL(liveIconView, i2);
        C786410Ut5.I7(new ACListenerS48S0101000_4(this, iIntValue, 2), c339620DTc.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C339620DTc c339620DTc = new C339620DTc(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.hai, viewGroup, false));
        try {
            View view = c339620DTc.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c339620DTc.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c339620DTc.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C339620DTc.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c339620DTc.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c339620DTc.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C339620DTc.class.getName();
        return c339620DTc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C339610DTb(String str, List<Integer> list, int i, Function1<? super Integer, Boolean> function1, Function1<? super Integer, Boolean> function12, Function1<? super Integer, Unit> function13, Function0<Unit> function0) {
        this.LL = str;
        this.LLILLJJLI = list;
        this.LLILLL = i;
        this.LLILZ = function1;
        this.LLILZIL = function12;
        this.LLILZLL = function13;
        this.LLIZ = function0;
    }
}
