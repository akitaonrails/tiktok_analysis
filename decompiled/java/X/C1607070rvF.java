package X;

import com.ss.android.ugc.aweme.story.avatar.IStoryDistributionService;
import com.ss.android.ugc.aweme.story.service.StoryDistributionService;

/* JADX INFO: renamed from: X.0rvF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1607070rvF implements IStoryDistributionService {
    public static final C1607070rvF LIZIZ = new C1607070rvF();
    public final /* synthetic */ IStoryDistributionService LIZ;

    @Override // com.ss.android.ugc.aweme.story.avatar.IStoryDistributionService
    public final AbstractC1608810ry3<AbstractC427610Gpj, C1606300ru0> LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.story.avatar.IStoryDistributionService
    public final AbstractC1608810ry3<C735590StJ, C735620StM> LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.story.avatar.IStoryDistributionService
    public final boolean LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.story.avatar.IStoryDistributionService
    public final AbstractC1608810ry3<AbstractC1607170rvP, C1606270rtx> LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.story.avatar.IStoryDistributionService
    public final AbstractC1608810ry3<AbstractC994080byY, C1606330ru3> LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.story.avatar.IStoryDistributionService
    public final AbstractC1608810ry3<AbstractC1606860ruu, C1606750ruj> LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.story.avatar.IStoryDistributionService
    public final InterfaceC1605730rt5 LJI() {
        return this.LIZ.LJI();
    }

    public C1607070rvF() {
        IStoryDistributionService iStoryDistributionService;
        Object objLIZ = C04TD.LIZ(IStoryDistributionService.class, false);
        if (objLIZ != null) {
            iStoryDistributionService = (IStoryDistributionService) objLIZ;
        } else {
            if (C04TD.z5 == null) {
                synchronized (IStoryDistributionService.class) {
                    if (C04TD.z5 == null) {
                        C04TD.z5 = new StoryDistributionService();
                    }
                }
            }
            iStoryDistributionService = C04TD.z5;
        }
        this.LIZ = iStoryDistributionService;
    }
}
