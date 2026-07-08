package X;

import Y.ACListenerS49S0101000_5;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0EJX, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EJX extends AbstractC21673619ry<C0EJW> {
    public AwS584S0100000_5 LL;
    public C383480F1u LLILLJJLI;
    public final int LLILLL = -1;
    public final Integer LLILZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<Integer> list;
        C383480F1u c383480F1u = this.LLILLJJLI;
        if (c383480F1u == null || (list = c383480F1u.LIZ) == null) {
            return 0;
        }
        return list.size();
    }

    public C0EJX(Context context) {
        this.LLILZ = C1308910kAL.LIZJ(R.attr.a01, new C1361400lX0(context, R.style.y0));
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        List<Integer> list;
        C0EJW c0ejw = (C0EJW) viewHolder;
        C383480F1u c383480F1u = this.LLILLJJLI;
        if (c383480F1u != null && (list = c383480F1u.LIZ) != null) {
            int i2 = c383480F1u.LIZIZ;
            Integer num = (Integer) C13LP.LJJJLZIJ(i, list);
            if (num != null) {
                int iIntValue = num.intValue();
                C0EJV c0ejv = c0ejw.LL;
                int i3 = this.LLILLL;
                Integer num2 = this.LLILZ;
                c0ejv.LL = Integer.valueOf(iIntValue);
                c0ejv.LLILLL = Integer.valueOf(i3);
                c0ejv.LLILLJJLI = num2;
                c0ejv.invalidate();
                boolean z = true;
                if (i != list.size() - 1) {
                    C426750GoL.LJIIIZ(c0ejw.itemView, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, false, 27);
                }
                C0EJV c0ejv2 = c0ejw.LL;
                if (i2 != iIntValue) {
                    z = false;
                }
                c0ejv2.setSelect(z);
                C786410Ut5.I7(new ACListenerS49S0101000_5(this, iIntValue, 7), c0ejw.itemView);
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0EJW c0ejw = new C0EJW(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.c4e, viewGroup, false));
        try {
            View view = c0ejw.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0ejw.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0ejw.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0EJW.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0ejw.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0ejw.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0EJW.class.getName();
        return c0ejw;
    }
}
