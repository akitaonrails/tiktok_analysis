package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.sku.BaseSkuFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.039q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7976039q extends AbstractC2172971A2l<C714302qb, C7977039r> {
    public List<C714302qb> LLILLJJLI;
    public final View LLILLL;
    public final BaseSkuFragment<?> LLILZ;
    public boolean LLILZIL;
    public String LLILZLL;

    @Override // X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        C7969039j.LIZ.getClass();
        ((LinkedHashMap) C7969039j.LIZIZ).clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01c1  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r21, int r22) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7976039q.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7977039r c7977039r = new C7977039r(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.amw, viewGroup, false));
        try {
            View view = c7977039r.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c7977039r.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c7977039r.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C7977039r.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c7977039r.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c7977039r.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C7977039r.class.getName();
        return c7977039r;
    }

    public C7976039q(List list, View view, BaseSkuFragment baseSkuFragment) {
        super(new AbstractC339510DSr<C714302qb>() { // from class: X.039s
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(C714302qb c714302qb, C714302qb c714302qb2) {
                return Intrinsics.LJFF(c714302qb, c714302qb2);
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(C714302qb c714302qb, C714302qb c714302qb2) {
                if (c714302qb == c714302qb2) {
                    return true;
                }
                return false;
            }
        });
        this.LLILLJJLI = list;
        this.LLILLL = view;
        this.LLILZ = baseSkuFragment;
        this.LLILZLL = "";
    }
}
