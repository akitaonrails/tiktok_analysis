package X;

import Y.ACListenerS116S0200000_12;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0TM9, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TM9 extends AbstractC21673619ry<C0TMA> {
    public final List<C1727970v4F> LL;
    public final boolean LLILLJJLI;
    public Function1<? super C1727970v4F, Unit> LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public C0TM9(List<C1727970v4F> list, boolean z) {
        this.LL = list;
        this.LLILLJJLI = z;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C0TMA c0tma = (C0TMA) viewHolder;
        C1727970v4F c1727970v4F = (C1727970v4F) ListProtector.get(this.LL, i);
        int i2 = 0;
        if (i != 0 && TextUtils.equals(((C1727970v4F) ListProtector.get(this.LL, i - 1)).LIZIZ, c1727970v4F.LIZIZ)) {
            C786410Ut5.LLLLZLL(c0tma.LL, 8);
        } else {
            C786410Ut5.LLLLZLL(c0tma.LL, 0);
            c0tma.LL.setText(c1727970v4F.LIZIZ);
        }
        c0tma.LLILLJJLI.setText(c1727970v4F.LIZ);
        TuxTextView tuxTextView = c0tma.LLILLL;
        if (!this.LLILLJJLI) {
            i2 = 4;
        }
        C786410Ut5.LLLLZLL(tuxTextView, i2);
        c0tma.LLILLL.setText(c1727970v4F.LIZLLL);
        C786410Ut5.I7(new ACListenerS116S0200000_12(this, c1727970v4F, 69), c0tma.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewSd = C786410Ut5.Sd(R.layout.hfs, C786410Ut5.ne(viewGroup.getContext()), null);
        viewGroup.getContext();
        C0TMA c0tma = new C0TMA(viewSd);
        try {
            View view = c0tma.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0tma.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0tma.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0TMA.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0tma.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0tma.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0TMA.class.getName();
        return c0tma;
    }
}
