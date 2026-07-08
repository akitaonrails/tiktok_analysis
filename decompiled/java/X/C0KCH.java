package X;

import com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetailWithTemplateInfo;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0KCH, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KCH {
    public final Map<String, List<PGCSubscriptionProductDetailWithTemplateInfo>> LIZ;
    public final String LIZIZ;
    public final C0KCP LIZJ;
    public final C0KCK LIZLLL;

    public final boolean LIZIZ() {
        C0KCP c0kcp;
        C0KCK c0kck = this.LIZLLL;
        Integer numValueOf = c0kck != null ? Integer.valueOf(c0kck.LIZJ) : null;
        return (numValueOf != null && (numValueOf.intValue() == 5 || numValueOf.intValue() == 6)) || ((c0kcp = this.LIZJ) != null && c0kcp.LIZIZ == 4025009);
    }

    public final boolean LIZJ() {
        C0KCK c0kck;
        EnumC514050KDz enumC514050KDz;
        if (this.LIZ.isEmpty()) {
            return false;
        }
        C0KCP c0kcp = this.LIZJ;
        return (c0kcp == null || c0kcp.LIZIZ == 4025009 || LIZ()) && ((c0kck = this.LIZLLL) == null || (enumC514050KDz = c0kck.LJ) == null || enumC514050KDz == EnumC514050KDz.PRE_CHECK_STATUS_ELIGIBLE) && !LIZIZ();
    }

    public final boolean LIZ() {
        C0KCK c0kck;
        EnumC514050KDz enumC514050KDz;
        return LIZIZ() || !((c0kck = this.LIZLLL) == null || (enumC514050KDz = c0kck.LJ) == null || enumC514050KDz == EnumC514050KDz.PRE_CHECK_STATUS_ELIGIBLE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0KCH(Map<String, ? extends List<PGCSubscriptionProductDetailWithTemplateInfo>> map, String str, C0KCP c0kcp, C0KCK c0kck) {
        this.LIZ = map;
        this.LIZIZ = str;
        this.LIZJ = c0kcp;
        this.LIZLLL = c0kck;
    }
}
