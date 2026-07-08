package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.service.IIMEncourageMufService;
import java.util.List;

/* JADX INFO: renamed from: X.1A1M, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A1M implements IIMEncourageMufService {
    public static final C1A1M LIZIZ = new C1A1M();
    public final /* synthetic */ IIMEncourageMufService LIZ;

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMEncourageMufService
    public final boolean LIZ(String str) {
        return this.LIZ.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMEncourageMufService
    public final void LIZIZ(String str) {
        this.LIZ.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMEncourageMufService
    public final void LIZJ(C1A1S c1a1s) {
        this.LIZ.LIZJ(c1a1s);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMEncourageMufService
    public final List<String> LIZLLL(int i) {
        return this.LIZ.LIZLLL(i);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMEncourageMufService
    public final boolean LJ(String str) {
        return this.LIZ.LJ(str);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMEncourageMufService
    public final boolean LJFF(C1A1S c1a1s) {
        return this.LIZ.LJFF(c1a1s);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMEncourageMufService
    public final void LJI(C1A1S c1a1s) {
        this.LIZ.LJI(c1a1s);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMEncourageMufService
    public final int LJII(String str) {
        return this.LIZ.LJII(str);
    }

    public C1A1M() {
        IIMEncourageMufService iIMEncourageMufService = (IIMEncourageMufService) PluggableExtentionKt.pluggableSpiForReal(IIMEncourageMufService.class);
        this.LIZ = iIMEncourageMufService == null ? new IIMEncourageMufService() { // from class: X.1A1N
            @Override // com.ss.android.ugc.aweme.im.service.service.IIMEncourageMufService
            public final boolean LIZ(String str) {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.im.service.service.IIMEncourageMufService
            public final void LIZIZ(String str) {
            }

            @Override // com.ss.android.ugc.aweme.im.service.service.IIMEncourageMufService
            public final void LIZJ(C1A1S c1a1s) {
            }

            @Override // com.ss.android.ugc.aweme.im.service.service.IIMEncourageMufService
            public final boolean LJ(String str) {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.im.service.service.IIMEncourageMufService
            public final boolean LJFF(C1A1S c1a1s) {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.im.service.service.IIMEncourageMufService
            public final void LJI(C1A1S c1a1s) {
            }

            @Override // com.ss.android.ugc.aweme.im.service.service.IIMEncourageMufService
            public final int LJII(String str) {
                return -1;
            }

            @Override // com.ss.android.ugc.aweme.im.service.service.IIMEncourageMufService
            public final List<String> LIZLLL(int i) {
                return C13BV.INSTANCE;
            }
        } : iIMEncourageMufService;
    }
}
