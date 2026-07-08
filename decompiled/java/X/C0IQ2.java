package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.subcription.subspaceeditor.SubSpaceEditorVM;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0IQ2, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IQ2 extends AbstractC21673619ry<C0IQ3> {
    public final ArrayList<User> LL;
    public final SubSpaceEditorVM LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public C0IQ2(ArrayList<User> arrayList, SubSpaceEditorVM subSpaceEditorVM) {
        this.LL = arrayList;
        this.LLILLJJLI = subSpaceEditorVM;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r6, final int r7) {
        /*
            r5 = this;
            X.0IQ3 r6 = (X.C0IQ3) r6
            android.widget.TextView r1 = r6.LL
            java.util.ArrayList<com.bytedance.android.live.base.model.user.User> r0 = r5.LL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r7)
            com.bytedance.android.live.base.model.user.User r0 = (com.bytedance.android.live.base.model.user.User) r0
            java.lang.String r0 = X.C0KVU.LIZ(r0)
            r1.setText(r0)
            android.widget.TextView r1 = r6.LLILLJJLI
            java.util.ArrayList<com.bytedance.android.live.base.model.user.User> r0 = r5.LL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r7)
            com.bytedance.android.live.base.model.user.User r0 = (com.bytedance.android.live.base.model.user.User) r0
            java.lang.String r0 = r0.getUsername()
            r1.setText(r0)
            java.util.ArrayList<com.bytedance.android.live.base.model.user.User> r0 = r5.LL
            java.lang.Object r2 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r7)
            X.1DgM r2 = (X.InterfaceC2262081DgM) r2
            X.0kZq r3 = r6.LLILLL
            r0 = 1109393408(0x42200000, float:40.0)
            float r0 = X.C497740JfY.LIZIZ(r0)
            int r4 = (int) r0
            r1 = 0
            if (r2 == 0) goto L8d
            com.bytedance.android.live.base.model.ImageModel r0 = r2.getAvatarMedium()
            if (r0 == 0) goto L42
            java.util.List r1 = r0.getUrls()
        L42:
            if (r1 == 0) goto L76
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L76
            com.bytedance.android.live.base.model.ImageModel r0 = r2.getAvatarMedium()
        L4e:
            if (r0 == 0) goto L8d
            X.0JBN r1 = X.C1819620xS4.LIZ()
            java.util.List r0 = r0.getUrls()
            X.0kZf r2 = r1.LIZJ(r0)
            r2.LJI = r4
            r2.LJII = r4
            X.0KdP r1 = new X.0KdP
            r0 = 1
            r1.<init>(r3, r0)
            r2.LJIIL = r1
            r2.LJJI(r3)
        L6b:
            android.view.View r1 = r6.itemView
            X.0IQS r0 = new X.0IQS
            r0.<init>()
            X.C786410Ut5.I7(r0, r1)
            return
        L76:
            com.bytedance.android.live.base.model.ImageModel r0 = r2.getAvatarThumb()
            if (r0 == 0) goto L8d
            java.util.List r0 = r0.getUrls()
            if (r0 == 0) goto L8d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L8d
            com.bytedance.android.live.base.model.ImageModel r0 = r2.getAvatarThumb()
            goto L4e
        L8d:
            r0 = 2130975365(0x7f041a85, float:1.755958E38)
            r3.setActualImageResource(r0)
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0IQ2.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0IQ3 c0iq3 = new C0IQ3(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.hpg, viewGroup, false));
        try {
            View view = c0iq3.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0iq3.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0iq3.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0IQ3.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0iq3.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0iq3.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0IQ3.class.getName();
        return c0iq3;
    }
}
