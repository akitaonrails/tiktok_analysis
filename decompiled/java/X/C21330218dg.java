package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.myna.render.render.MynaElement;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS646S0100000_32;

/* JADX INFO: renamed from: X.18dg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21330218dg extends AbstractC21673619ry<C21330318dh> {
    public final C21325918cz LL;
    public final List<MynaElement> LLILLJJLI;
    public final Function2<Integer, C21327818dI, Unit> LLILLL;
    public List<C1556540qbk> LLILZ = C13BV.INSTANCE;
    public Map<String, ? extends Object> LLILZIL = C2097608Jq.LJ();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILZ.size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return ((C1556540qbk) ListProtector.get(this.LLILZ, i)).LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r7, int r8) {
        /*
            r6 = this;
            X.18dh r7 = (X.C21330318dh) r7
            java.util.List<X.0qbk> r0 = r6.LLILZ
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r8)
            X.0qbk r0 = (X.C1556540qbk) r0
            com.tiktok.myna.render.render.MynaElement r5 = r0.LIZIZ
            X.18dI r4 = r7.LL
            X.18cz r3 = r6.LL
            X.18eB<?> r0 = r4.LLJ
            if (r0 != 0) goto L24
            java.lang.String r2 = r5.getType()
            r1 = 1
            r0 = 0
            X.18eB r0 = r3.LIZIZ(r2, r1, r0)
            r0.LJJJJJ(r5)
            r4.setRootViewManager(r0)
        L24:
            X.18da r0 = r5.bindInfo
            if (r0 == 0) goto L36
            com.tiktok.myna.render.render.bindinfo.MynaBindForConfig r2 = r0.LJ
            if (r2 == 0) goto L36
            X.18dj r1 = r5.forConfigValue
            java.util.Map<java.lang.String, ? extends java.lang.Object> r0 = r6.LLILZIL
            java.util.Map r2 = X.C21330418di.LIZJ(r0, r2, r1)
            if (r2 != 0) goto L38
        L36:
            java.util.Map<java.lang.String, ? extends java.lang.Object> r2 = r6.LLILZIL
        L38:
            X.18dI r0 = r7.LL
            X.18eB<?> r1 = r0.LLJ
            if (r1 == 0) goto L46
            X.18db r0 = new X.18db
            r0.<init>()
            r1.LJIILJJIL(r2, r0)
        L46:
            kotlin.jvm.functions.Function2<java.lang.Integer, X.18dI, kotlin.Unit> r2 = r6.LLILLL
            if (r2 == 0) goto L53
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            X.18dI r0 = r7.LL
            r2.invoke(r1, r0)
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21330218dg.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C21330318dh c21330318dh = new C21330318dh(new C21327818dI(viewGroup.getContext()));
        try {
            View view = c21330318dh.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c21330318dh.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c21330318dh.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C21330318dh.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c21330318dh.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c21330318dh.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C21330318dh.class.getName();
        return c21330318dh;
    }

    public C21330218dg(C21325918cz c21325918cz, List list, AwS646S0100000_32 awS646S0100000_32) {
        this.LL = c21325918cz;
        this.LLILLJJLI = list;
        this.LLILLL = awS646S0100000_32;
    }
}
