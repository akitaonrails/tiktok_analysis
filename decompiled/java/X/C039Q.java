package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.summary.USOrderSummaryCell;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.039Q, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C039Q extends AbstractC2172971A2l<C714302qb, C039O> {
    public C755502xF LLILLJJLI;
    public List<C714302qb> LLILLL;
    public boolean LLILZ;
    public String LLILZIL;
    public final /* synthetic */ USOrderSummaryCell LLILZLL;

    @Override // X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        C7969039j.LIZ.getClass();
        ((LinkedHashMap) C7969039j.LIZIZ).clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ba  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r26, int r27) {
        /*
            Method dump skipped, instruction units count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C039Q.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C039O c039o = new C039O(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.amw, viewGroup, false));
        try {
            View view = c039o.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c039o.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c039o.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C039O.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c039o.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c039o.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C039O.class.getName();
        return c039o;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C039Q(USOrderSummaryCell uSOrderSummaryCell, C755502xF c755502xF, List<C714302qb> list) {
        super(new AbstractC339510DSr<C714302qb>() { // from class: X.039U
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(C714302qb c714302qb, C714302qb c714302qb2) {
                return Intrinsics.LJFF(c714302qb, c714302qb2);
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(C714302qb c714302qb, C714302qb c714302qb2) {
                C714302qb c714302qb3 = c714302qb;
                C714302qb c714302qb4 = c714302qb2;
                if (Intrinsics.LJFF(c714302qb3.LJIIIIZZ, c714302qb4.LJIIIIZZ) && Intrinsics.LJFF(c714302qb3.LIZ, c714302qb4.LIZ) && Intrinsics.LJFF(c714302qb3.LIZIZ, c714302qb4.LIZIZ)) {
                    return true;
                }
                return false;
            }
        });
        this.LLILZLL = uSOrderSummaryCell;
        this.LLILLJJLI = c755502xF;
        this.LLILLL = list;
        this.LLILZIL = "";
    }
}
