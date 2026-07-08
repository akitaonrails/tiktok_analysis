package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0dbT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1056650dbT extends RecyclerView.ViewHolder implements InterfaceC1508640pMU {
    public static final /* synthetic */ int LL = 0;

    @Override // X.InterfaceC1508640pMU
    public final String T() {
        return "ParentInboxBannerViewHolder";
    }

    public C1056650dbT(View view) {
        super(view);
    }

    public final void I5(String str) {
        Object c098200Yq;
        Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(str));
        intent.addFlags(268435456);
        intent.addCategory("android.intent.category.BROWSABLE");
        try {
            Context context = this.itemView.getContext();
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, context);
            C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbo/C1TNahjga4ycgRyXuKk15L/fOUKS5zNZpMENuGoFcd7spGYE58eTMVCaxdbtkZNcH7Q==", null));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }
}
