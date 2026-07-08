package X;

import com.ss.android.ugc.aweme.relation.storage.IRelationStorageService;
import com.ss.android.ugc.aweme.relation.storage.RelationStorageServiceImpl;

/* JADX INFO: renamed from: X.0iyv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1263390iyv implements IRelationStorageService {
    public static final C1263390iyv LIZIZ = new C1263390iyv();
    public final /* synthetic */ IRelationStorageService LIZ;

    @Override // com.ss.android.ugc.aweme.relation.storage.IRelationStorageService
    public final InterfaceC2193008iW LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.relation.storage.IRelationStorageService
    public final C0CCZ LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.relation.storage.IRelationStorageService
    public final InterfaceC2448809ig LIZJ() {
        return this.LIZ.LIZJ();
    }

    public C1263390iyv() {
        IRelationStorageService iRelationStorageService;
        Object objLIZ = C04TD.LIZ(IRelationStorageService.class, false);
        if (objLIZ != null) {
            iRelationStorageService = (IRelationStorageService) objLIZ;
        } else {
            if (C04TD.D3 == null) {
                synchronized (IRelationStorageService.class) {
                    if (C04TD.D3 == null) {
                        C04TD.D3 = new RelationStorageServiceImpl();
                    }
                }
            }
            iRelationStorageService = C04TD.D3;
        }
        this.LIZ = iRelationStorageService;
    }
}
