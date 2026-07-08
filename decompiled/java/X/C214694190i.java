package X;

import com.ss.android.ugc.aweme.internal.AVCollabServiceImpl;
import com.ss.android.ugc.aweme.internal.IAVCollabService;
import java.util.List;

/* JADX INFO: renamed from: X.190i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214694190i implements IAVCollabService {
    public static final C214694190i LIZIZ = new C214694190i();
    public final /* synthetic */ IAVCollabService LIZ;

    @Override // com.ss.android.ugc.aweme.internal.IAVCollabService
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVCollabService
    public final void LIZIZ() {
        this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVCollabService
    public final void LIZJ(C19EG c19eg, C21524119Lj c21524119Lj) {
        this.LIZ.LIZJ(c19eg, c21524119Lj);
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVCollabService
    public final long LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVCollabService
    public final void LJ() {
        this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVCollabService
    public final void LJFF(int i) {
        this.LIZ.LJFF(i);
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVCollabService
    public final long LJI() {
        return this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVCollabService
    public final void LJII(int i) {
        this.LIZ.LJII(i);
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVCollabService
    public final void LJIIIIZZ(C19EG c19eg, List list, C21524119Lj c21524119Lj) {
        this.LIZ.LJIIIIZZ(c19eg, list, c21524119Lj);
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVCollabService
    public final boolean LJIIIZ() {
        return this.LIZ.LJIIIZ();
    }

    public C214694190i() {
        IAVCollabService iAVCollabService;
        Object objLIZ = C04TD.LIZ(IAVCollabService.class, false);
        if (objLIZ != null) {
            iAVCollabService = (IAVCollabService) objLIZ;
        } else {
            if (C04TD.u1 == null) {
                synchronized (IAVCollabService.class) {
                    if (C04TD.u1 == null) {
                        C04TD.u1 = new AVCollabServiceImpl();
                    }
                }
            }
            iAVCollabService = C04TD.u1;
        }
        this.LIZ = iAVCollabService;
    }
}
