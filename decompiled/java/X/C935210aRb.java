package X;

import Y.ACListenerS118S0200000_15;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS629S0100000_15;

/* JADX INFO: renamed from: X.0aRb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C935210aRb extends AbstractC21673619ry<C935230aRd> {
    public final List<C935220aRc> LL;
    public int LLILLJJLI;
    public final Function2<Integer, Integer, Unit> LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        C935230aRd c935230aRd = (C935230aRd) viewHolder;
        C935220aRc c935220aRc = (C935220aRc) ListProtector.get(this.LL, i);
        if (c935220aRc.LIZIZ == this.LLILLJJLI) {
            z = true;
        } else {
            z = false;
        }
        c935230aRd.LL.setText(c935220aRc.LIZ);
        String str = c935220aRc.LIZJ;
        if (str != null && str.length() != 0) {
            C786410Ut5.LLIL(c935230aRd.LLILLJJLI, 0);
            c935230aRd.LLILLJJLI.setText(str);
        } else {
            C786410Ut5.LLIL(c935230aRd.LLILLJJLI, 8);
        }
        c935230aRd.LLILLL.setChecked(z);
        ACListenerS118S0200000_15 aCListenerS118S0200000_15 = new ACListenerS118S0200000_15(this, c935220aRc, 23);
        C786410Ut5.I7(aCListenerS118S0200000_15, c935230aRd.itemView);
        C786410Ut5.e9(c935230aRd.LLILLL, aCListenerS118S0200000_15);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C935230aRd c935230aRd = new C935230aRd(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.g9s, viewGroup, false));
        try {
            View view = c935230aRd.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c935230aRd.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c935230aRd.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C935230aRd.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c935230aRd.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c935230aRd.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C935230aRd.class.getName();
        return c935230aRd;
    }

    public C935210aRb(List list, int i, AwS629S0100000_15 awS629S0100000_15) {
        this.LL = list;
        this.LLILLJJLI = i;
        this.LLILLL = awS629S0100000_15;
    }
}
