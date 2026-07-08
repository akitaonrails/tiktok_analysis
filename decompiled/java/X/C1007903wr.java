package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import g1c.AjS0S1101000_1;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS615S0100000_1;

/* JADX INFO: renamed from: X.03wr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1007903wr extends AbstractC21673619ry<C1008003ws> {
    public static final int LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public final List<String> LL;
    public final Function2<Integer, String, Unit> LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public C1007903wr(List list, AwS615S0100000_1 awS615S0100000_1) {
        this.LL = list;
        this.LLILLJJLI = awS615S0100000_1;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1008003ws c1008003ws = (C1008003ws) viewHolder;
        String str = (String) ListProtector.get(this.LL, i);
        c1008003ws.LL.setText(str);
        TuxTextView tuxTextView = c1008003ws.LL;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_tick_fill_small;
        c419910GdJ.LJ = Integer.valueOf(R.attr.fy);
        int i2 = LLILLL;
        c419910GdJ.LIZIZ = i2;
        c419910GdJ.LIZJ = i2;
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(c1008003ws.itemView.getContext());
        tuxIconDrawableLIZ.setBounds(0, 0, tuxIconDrawableLIZ.LIZJ(), tuxIconDrawableLIZ.LIZIZ());
        tuxTextView.setCompoundDrawablesRelative(tuxIconDrawableLIZ, null, null, null);
        c1008003ws.LL.setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        C786410Ut5.I7(new AjS0S1101000_1(this, str, i, 1), c1008003ws.LL);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        TuxTextView tuxTextView = new TuxTextView(viewGroup.getContext(), null, 6, 0);
        tuxTextView.setHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        tuxTextView.setGravity(16);
        tuxTextView.setTuxFont(71);
        C1008003ws c1008003ws = new C1008003ws(tuxTextView, tuxTextView);
        try {
            View view = c1008003ws.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1008003ws.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1008003ws.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1008003ws.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1008003ws.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1008003ws.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1008003ws.class.getName();
        return c1008003ws;
    }
}
