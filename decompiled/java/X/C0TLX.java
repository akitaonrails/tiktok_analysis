package X;

import Y.ACListenerS147S0100000_12;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS152S0101000_12;

/* JADX INFO: renamed from: X.0TLX, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TLX extends AbstractC21673619ry<C0TLY> {
    public final List<C0TLZ> LL = new ArrayList();
    public boolean LLILLJJLI;
    public int LLILLL;
    public Function1<? super Integer, Unit> LLILZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LL).size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C0TLY c0tly = (C0TLY) viewHolder;
        if (((ArrayList) this.LL).size() > i) {
            C0TLZ c0tlz = (C0TLZ) ListProtector.get(this.LL, i);
            boolean z = this.LLILLJJLI;
            int i2 = this.LLILLL;
            AwS152S0101000_12 awS152S0101000_12 = new AwS152S0101000_12(this, i, 10);
            c0tly.LLILLJJLI.setText(c0tlz.LIZ);
            ViewGroup.LayoutParams layoutParams = c0tly.LLILLJJLI.getLayoutParams();
            if (layoutParams != null) {
                if (z) {
                    i2 = -2;
                }
                layoutParams.width = i2;
                C786410Ut5.R6(c0tly.LLILLJJLI, layoutParams);
                C786410Ut5.h9(c0tly.LLILLJJLI, new ACListenerS147S0100000_12(awS152S0101000_12, 274));
                if (c0tlz.LIZIZ) {
                    c0tly.LLILLJJLI.setTextColorRes(R.attr.a1h);
                } else {
                    c0tly.LLILLJJLI.setTextColorRes(R.attr.a1k);
                }
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0TLY c0tly = new C0TLY(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dld, viewGroup, false));
        try {
            View view = c0tly.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0tly.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0tly.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0TLY.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0tly.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0tly.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0TLY.class.getName();
        return c0tly;
    }
}
