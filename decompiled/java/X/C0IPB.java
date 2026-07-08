package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyListActivity;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0IPB, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IPB extends AbstractC21673619ry<ViewOnClickListenerC477420Ins> {
    public BaAutoReplyListActivity LL;
    public List<C475600Ikw> LLILLJJLI = C13BV.INSTANCE;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r5, int r6) {
        /*
            r4 = this;
            java.util.List<X.0Ikw> r0 = r4.LLILLJJLI
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r6)
            X.0Ikw r0 = (X.C475600Ikw) r0
            int r1 = r0.LIZIZ
            r5.getClass()
            r0 = 1
            if (r1 == r0) goto L6b
            r0 = 2
            if (r1 == r0) goto L67
            r0 = 3
            if (r1 == r0) goto L63
            r0 = 4
            if (r1 != r0) goto L6b
            r2 = 2131846637(0x7f1165ed, float:1.9326729E38)
        L1c:
            android.view.View r1 = r5.itemView
            r0 = 2131397862(0x7f0a8ce6, float:1.8416505E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r2)
            java.util.List<X.0Ikw> r0 = r4.LLILLJJLI
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r6)
            X.0Ikw r0 = (X.C475600Ikw) r0
            java.lang.String r3 = r0.LIZLLL
            java.lang.String r2 = ""
            if (r3 != 0) goto L39
            r3 = r2
        L39:
            android.view.View r1 = r5.itemView
            r0 = 2131396571(0x7f0a87db, float:1.8413887E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r3)
            java.util.List<X.0Ikw> r0 = r4.LLILLJJLI
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r6)
            X.0Ikw r0 = (X.C475600Ikw) r0
            java.lang.String r0 = r0.LIZJ
            if (r0 == 0) goto L54
            r2 = r0
        L54:
            android.view.View r1 = r5.itemView
            r0 = 2131397277(0x7f0a8a9d, float:1.8415318E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r2)
            return
        L63:
            r2 = 2131826622(0x7f1117be, float:1.9286134E38)
            goto L1c
        L67:
            r2 = 2131857726(0x7f11913e, float:1.934922E38)
            goto L1c
        L6b:
            r2 = 2131821574(0x7f110406, float:1.9275895E38)
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0IPB.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewOnClickListenerC477420Ins viewOnClickListenerC477420Ins = new ViewOnClickListenerC477420Ins(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.f72, viewGroup, false));
        try {
            View view = viewOnClickListenerC477420Ins.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        viewOnClickListenerC477420Ins.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewOnClickListenerC477420Ins.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(ViewOnClickListenerC477420Ins.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewOnClickListenerC477420Ins.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewOnClickListenerC477420Ins.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = ViewOnClickListenerC477420Ins.class.getName();
        return viewOnClickListenerC477420Ins;
    }
}
