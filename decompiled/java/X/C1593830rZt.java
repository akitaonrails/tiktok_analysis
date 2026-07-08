package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.service.IRecentGidsService;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0rZt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1593830rZt implements IRecentGidsService {
    public static final C1593830rZt LIZIZ = new C1593830rZt();
    public final /* synthetic */ IRecentGidsService LIZ = (IRecentGidsService) ServiceManager.get().getService(IRecentGidsService.class);

    @Override // com.ss.android.ugc.aweme.friendstab.service.IRecentGidsService
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IRecentGidsService
    public final List<C0VNS> LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IRecentGidsService
    public final List<C0VNS> LIZJ(Long l) {
        return this.LIZ.LIZJ(l);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IRecentGidsService
    public final C11NZ<List<C0VNS>> LIZLLL(int i) {
        return this.LIZ.LIZLLL(i);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IRecentGidsService
    public final void LJ(C0VNS c0vns) {
        this.LIZ.LJ(c0vns);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IRecentGidsService
    public final C11NZ<List<C0VNS>> LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IRecentGidsService
    public final List<C0VNS> LJI() {
        return this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IRecentGidsService
    public final C11NZ<Unit> LJII(List<C0VNS> list) {
        return this.LIZ.LJII(list);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IRecentGidsService
    public final void LJIIIIZZ(C0VNS c0vns, int i, int i2) {
        this.LIZ.LJIIIIZZ(c0vns, i, i2);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IRecentGidsService
    public final List<C0VNS> LJIIIZ(Long l) {
        return this.LIZ.LJIIIZ(l);
    }
}
