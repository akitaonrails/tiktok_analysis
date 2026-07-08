package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0KUo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C518360KUo extends AbstractC21673619ry<C518380KUq> {
    public List<C238100vz> LL;
    public InterfaceC518400KUs LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<C238100vz> list = this.LL;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r7, int r8) {
        /*
            r6 = this;
            X.0KUq r7 = (X.C518380KUq) r7
            java.util.List<X.00vz> r0 = r6.LL
            r5 = 0
            if (r0 == 0) goto L4b
            java.lang.Object r4 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r8)
            X.00vz r4 = (X.C238100vz) r4
        Ld:
            X.0KUn r3 = new X.0KUn
            r3.<init>()
            r2 = 0
            if (r4 == 0) goto L43
            r7.getClass()
            boolean r1 = r4.LIZ
            r0 = 1
            if (r1 != r0) goto L43
            android.view.View r0 = r7.LL
            X.C786410Ut5.LJLLLLLL(r2, r0)
        L22:
            X.16F5 r1 = r7.LLILLL
            if (r4 == 0) goto L41
            java.lang.String r0 = r4.LIZJ
        L28:
            r1.setText(r0)
            X.0GZa r0 = r7.LLILLJJLI
            if (r4 == 0) goto L31
            com.bytedance.android.live.base.model.ImageModel r5 = r4.LIZIZ
        L31:
            X.C0JSS.LJII(r0, r5)
            android.view.View r2 = r7.itemView
            Y.ACListenerS111S0200000_7 r1 = new Y.ACListenerS111S0200000_7
            r0 = 17
            r1.<init>(r3, r4, r0)
            X.C786410Ut5.I7(r1, r2)
            return
        L41:
            r0 = r5
            goto L28
        L43:
            android.view.View r1 = r7.LL
            r0 = 8
            X.C786410Ut5.LJLLLLLL(r0, r1)
            goto L22
        L4b:
            r4 = r5
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C518360KUo.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C518380KUq c518380KUq = new C518380KUq(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.h0g, viewGroup, false));
        try {
            View view = c518380KUq.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c518380KUq.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c518380KUq.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C518380KUq.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c518380KUq.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c518380KUq.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C518380KUq.class.getName();
        return c518380KUq;
    }
}
