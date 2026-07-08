package X;

import Y.ACListenerS50S0101000_6;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0H3j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C434850H3j extends AbstractC21673619ry<C434860H3k> {
    public final InterfaceC434870H3l LL;
    public List<C1376750lvl> LLILLJJLI = C13BV.INSTANCE;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    public C434850H3j(InterfaceC434870H3l interfaceC434870H3l) {
        this.LL = interfaceC434870H3l;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C434860H3k c434860H3k = (C434860H3k) viewHolder;
        c434860H3k.LLILLJJLI.setText(((C1376750lvl) ListProtector.get(this.LLILLJJLI, i)).LIZ.LIZIZ);
        C426750GoL.LJIIIZ(c434860H3k.LLILLJJLI, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(17))), null, null, false, 29);
        if (i != this.LLILLJJLI.size() - 1) {
            C786410Ut5.LJLLLLLL(0, c434860H3k.LLILLL);
            C426750GoL.LJIIIZ(c434860H3k.LLILLL, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, null, false, 29);
        } else {
            C786410Ut5.LJLLLLLL(4, c434860H3k.LLILLL);
            C426750GoL.LJIIIZ(c434860H3k.LLILLL, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), null, null, false, 29);
        }
        c434860H3k.LLILLJJLI.setTuxFont(42);
        C786410Ut5.I7(new ACListenerS50S0101000_6(this, i, 1), c434860H3k.LL);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C434860H3k c434860H3k = new C434860H3k(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.d3c, viewGroup, false));
        try {
            View view = c434860H3k.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c434860H3k.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c434860H3k.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C434860H3k.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c434860H3k.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c434860H3k.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C434860H3k.class.getName();
        return c434860H3k;
    }
}
