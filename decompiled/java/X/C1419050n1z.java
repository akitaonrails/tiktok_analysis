package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0n1z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1419050n1z extends AbstractC21673619ry<C1419030n1x> {
    public final ArrayList<C1412800mru> LL = new ArrayList<>();
    public InterfaceC1419090n23 LLILLJJLI;

    static {
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public final C1412800mru LLLFZ(int i) {
        if (i >= 0 && i < this.LL.size()) {
            return (C1412800mru) ListProtector.get(this.LL, i);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0286  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r12, int r13) {
        /*
            Method dump skipped, instruction units count: 981
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1419050n1z.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1419030n1x c1419030n1x = new C1419030n1x(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cwz, viewGroup, false));
        try {
            View view = c1419030n1x.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1419030n1x.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1419030n1x.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1419030n1x.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1419030n1x.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1419030n1x.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1419030n1x.class.getName();
        return c1419030n1x;
    }
}
