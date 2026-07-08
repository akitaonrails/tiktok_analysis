package X;

import Y.ACListenerS91S0300000_27;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS641S0100000_27;

/* JADX INFO: renamed from: X.0yGs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1851120yGs extends AbstractC21673619ry<C1851130yGt> {
    public final Function2<C1851140yGu, Integer, Unit> LL;
    public final Function1<String, Unit> LLILLJJLI;
    public final List<C1851140yGu> LLILLL = new ArrayList();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLL).size();
    }

    public C1851120yGs(AFwS269S0000000_27 aFwS269S0000000_27, AwS641S0100000_27 awS641S0100000_27) {
        this.LL = awS641S0100000_27;
        this.LLILLJJLI = aFwS269S0000000_27;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1851130yGt c1851130yGt = (C1851130yGt) viewHolder;
        C1851140yGu c1851140yGu = (C1851140yGu) ListProtector.get(this.LLILLL, i);
        TuxTextView tuxTextView = c1851130yGt.LL;
        String strValueOf = c1851140yGu.LIZJ;
        if (strValueOf.length() <= 0) {
            strValueOf = String.valueOf(i + 1);
        }
        tuxTextView.setText(strValueOf);
        c1851130yGt.LLILLJJLI.setText(c1851140yGu.LIZ);
        String str = c1851140yGu.LIZLLL;
        if (str != null) {
            c1851130yGt.LLILLL.setText(str);
            C786410Ut5.LLZLLIL(c1851130yGt.LLILLL, 0);
        } else {
            C786410Ut5.LLZLLIL(c1851130yGt.LLILLL, 8);
        }
        c1851130yGt.LLILZ.setText("Render");
        C786410Ut5.U8(c1851130yGt.LLILZ, new ACListenerS91S0300000_27(c1851130yGt, this, c1851140yGu, 0));
        c1851130yGt.itemView.setOnLongClickListener(new ViewOnLongClickListenerC1864620yce(this, c1851140yGu, 1));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1851130yGt c1851130yGt = new C1851130yGt(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cwu, viewGroup, false));
        try {
            View view = c1851130yGt.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1851130yGt.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1851130yGt.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1851130yGt.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1851130yGt.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1851130yGt.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1851130yGt.class.getName();
        return c1851130yGt;
    }
}
