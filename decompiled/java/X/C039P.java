package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.usexpress.summary.USHalfPageOrderSummaryFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.039P, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C039P extends AbstractC2172971A2l<C714302qb, C039N> {
    public C755502xF LLILLJJLI;
    public List<C714302qb> LLILLL;
    public boolean LLILZ;
    public String LLILZIL;
    public final /* synthetic */ USHalfPageOrderSummaryFragment LLILZLL;

    @Override // X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        C7969039j.LIZ.getClass();
        ((LinkedHashMap) C7969039j.LIZIZ).clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x026b  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r28, int r29) {
        /*
            Method dump skipped, instruction units count: 623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C039P.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C039N c039n = new C039N(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.amw, viewGroup, false));
        try {
            View view = c039n.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c039n.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c039n.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C039N.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c039n.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c039n.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C039N.class.getName();
        return c039n;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C039P(USHalfPageOrderSummaryFragment uSHalfPageOrderSummaryFragment, C755502xF c755502xF, List<C714302qb> list) {
        super(new AbstractC339510DSr<C714302qb>() { // from class: X.039V
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(C714302qb c714302qb, C714302qb c714302qb2) {
                return Intrinsics.LJFF(c714302qb, c714302qb2);
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(C714302qb c714302qb, C714302qb c714302qb2) {
                return Intrinsics.LJFF(C714302qb.class, C714302qb.class);
            }
        });
        this.LLILZLL = uSHalfPageOrderSummaryFragment;
        this.LLILLJJLI = c755502xF;
        this.LLILLL = list;
        this.LLILZIL = "";
    }
}
