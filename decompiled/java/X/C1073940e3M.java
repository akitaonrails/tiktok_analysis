package X;

import com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService;
import com.ss.android.ugc.aweme.relation.usercard.spi.RelationUserCardInternalService;

/* JADX INFO: renamed from: X.0e3M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1073940e3M {
    public static final /* synthetic */ C1073940e3M LIZ = new C1073940e3M();

    public static IRelationUserCardInternalService LIZ() {
        Object objLIZ = C04TD.LIZ(IRelationUserCardInternalService.class, false);
        if (objLIZ != null) {
            return (IRelationUserCardInternalService) objLIZ;
        }
        if (C04TD.E3 == null) {
            synchronized (IRelationUserCardInternalService.class) {
                if (C04TD.E3 == null) {
                    C04TD.E3 = new RelationUserCardInternalService();
                }
            }
        }
        return C04TD.E3;
    }
}
