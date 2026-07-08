package X;

import Y.ACListenerS48S0201000_21;
import Y.ARunnableS90S0200000_21;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0mDs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1387980mDs extends AbstractC21673619ry<C1387960mDq> {
    public final int LLILLL;
    public final Function2<Integer, C1387990mDt, Unit> LLILZ;
    public final boolean LL = true;
    public final int LLILLJJLI = R.attr.a1h;
    public final List<C1387990mDt> LLILZIL = new ArrayList();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILZIL).size();
    }

    public C1387980mDs(int i, Function2 function2) {
        this.LLILLL = i;
        this.LLILZ = function2;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        C1387960mDq c1387960mDq = (C1387960mDq) viewHolder;
        C1387990mDt c1387990mDt = (C1387990mDt) ListProtector.get(this.LLILZIL, i);
        if (c1387960mDq.LLILZ.getWidth() != 0) {
            c1387960mDq.L5(c1387990mDt);
        } else {
            HandlerHook.viewPost(c1387960mDq.LLILZ, new ARunnableS90S0200000_21(c1387990mDt, c1387960mDq, 76));
        }
        c1387960mDq.LLILZIL.setText(c1387990mDt.LIZJ);
        TuxTextView tuxTextView = c1387960mDq.LLILZLL;
        String str = c1387990mDt.LIZ.discountedString;
        boolean z = true;
        if (str != null && str.length() != 0) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LLLLZLL(tuxTextView, i2);
        c1387960mDq.LLILZLL.setText(c1387990mDt.LIZ.discountedString);
        View view = c1387960mDq.itemView;
        if (!c1387990mDt.LIZIZ || !c1387960mDq.LLILLL) {
            z = false;
        }
        view.setSelected(z);
        C786410Ut5.I7(new ACListenerS48S0201000_21(i, c1387960mDq, c1387990mDt, 10), c1387960mDq.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1387960mDq c1387960mDq = new C1387960mDq(this.LLILLJJLI, this.LLILLL, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bhn, viewGroup, false), this.LLILZ, this.LL);
        try {
            View view = c1387960mDq.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1387960mDq.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1387960mDq.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1387960mDq.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1387960mDq.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1387960mDq.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1387960mDq.class.getName();
        return c1387960mDq;
    }
}
