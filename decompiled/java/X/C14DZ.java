package X;

import android.content.Context;
import com.bytedance.router.RouteIntent;
import java.util.Iterator;

/* JADX INFO: renamed from: X.14DZ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14DZ implements C14DK {
    public final /* synthetic */ C14DU LIZ;
    public final /* synthetic */ Iterator<C0MVZ> LIZIZ;
    public final /* synthetic */ Context LIZJ;
    public final /* synthetic */ RouteIntent LIZLLL;
    public final /* synthetic */ C14DK LJ;

    @Override // X.C14DK
    public final void LIZIZ() {
        this.LIZ.LIZJ(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ);
    }

    @Override // X.C14DK
    public final void LIZ(AbstractC1897007bs abstractC1897007bs) {
        this.LJ.LIZ(abstractC1897007bs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C14DZ(C14DU c14du, Iterator<? extends C0MVZ> it2, Context context, RouteIntent routeIntent, C14DK c14dk) {
        this.LIZ = c14du;
        this.LIZIZ = it2;
        this.LIZJ = context;
        this.LIZLLL = routeIntent;
        this.LJ = c14dk;
    }
}
