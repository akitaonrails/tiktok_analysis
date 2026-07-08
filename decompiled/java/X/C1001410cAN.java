package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ad.feed.idelpreload.ICommerceIDLEPreloadService;
import com.ss.android.ugc.aweme.api.component.idlepreload.CommerceIDLEPreloadServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: renamed from: X.0cAN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1001410cAN implements ICommerceIDLEPreloadService {
    public static final C1001410cAN LIZIZ = new C1001410cAN();
    public final /* synthetic */ ICommerceIDLEPreloadService LIZ;

    @Override // com.ss.android.ugc.aweme.ad.feed.idelpreload.ICommerceIDLEPreloadService
    public final boolean LIZ(EnumC1001380cAK enumC1001380cAK) {
        return this.LIZ.LIZ(enumC1001380cAK);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.idelpreload.ICommerceIDLEPreloadService
    public final boolean LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.idelpreload.ICommerceIDLEPreloadService
    public final void LIZJ(Aweme aweme, String str) {
        this.LIZ.LIZJ(aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.idelpreload.ICommerceIDLEPreloadService
    public final void LIZLLL(EnumC599900Nfw enumC599900Nfw) {
        this.LIZ.LIZLLL(enumC599900Nfw);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.idelpreload.ICommerceIDLEPreloadService
    public final void LJ(Context context, Aweme aweme, String str) {
        this.LIZ.LJ(context, aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.idelpreload.ICommerceIDLEPreloadService
    public final boolean LJFF(String str, EnumC1001380cAK enumC1001380cAK, EnumC599900Nfw enumC599900Nfw) {
        return this.LIZ.LJFF(str, enumC1001380cAK, enumC599900Nfw);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.idelpreload.ICommerceIDLEPreloadService
    public final void LJI(C1001420cAO c1001420cAO) {
        this.LIZ.LJI(c1001420cAO);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.idelpreload.ICommerceIDLEPreloadService
    public final void LJII(Context context, EnumC599900Nfw enumC599900Nfw, int i, List<? extends Aweme> list, EnumC1001380cAK enumC1001380cAK) {
        this.LIZ.LJII(context, enumC599900Nfw, i, list, enumC1001380cAK);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.idelpreload.ICommerceIDLEPreloadService
    public final C1001420cAO LJIIIIZZ(String str, EnumC1001380cAK enumC1001380cAK, EnumC599900Nfw enumC599900Nfw) {
        return this.LIZ.LJIIIIZZ(str, enumC1001380cAK, enumC599900Nfw);
    }

    public C1001410cAN() {
        ICommerceIDLEPreloadService iCommerceIDLEPreloadService;
        Object objLIZ = C04TD.LIZ(ICommerceIDLEPreloadService.class, false);
        if (objLIZ != null) {
            iCommerceIDLEPreloadService = (ICommerceIDLEPreloadService) objLIZ;
        } else {
            if (C04TD.LLFZ == null) {
                synchronized (ICommerceIDLEPreloadService.class) {
                    if (C04TD.LLFZ == null) {
                        C04TD.LLFZ = new CommerceIDLEPreloadServiceImpl();
                    }
                }
            }
            iCommerceIDLEPreloadService = C04TD.LLFZ;
        }
        this.LIZ = iCommerceIDLEPreloadService;
    }
}
