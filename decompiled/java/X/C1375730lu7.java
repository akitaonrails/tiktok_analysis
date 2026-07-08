package X;

import android.app.Activity;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.service.IPhotoDownloadService;
import com.ss.android.ugc.aweme.service.PhotoDownloadServiceImpl;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;

/* JADX INFO: renamed from: X.0lu7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1375730lu7 implements IPhotoDownloadService {
    public static final C1375730lu7 LIZIZ = new C1375730lu7();
    public final /* synthetic */ IPhotoDownloadService LIZ;

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final void LIZIZ(Activity activity, Integer num, Aweme aweme, C1374880lsk c1374880lsk, C1374320lrq c1374320lrq, String str) {
        this.LIZ.LIZIZ(activity, num, aweme, c1374880lsk, c1374320lrq, str);
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final boolean LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final void LIZLLL(int i) {
        this.LIZ.LIZLLL(i);
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final void LJ() {
        this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final void LJFF(SharePackage sharePackage) {
        this.LIZ.LJFF(sharePackage);
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final int LJI() {
        return this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final void LJII() {
        this.LIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final Observer<Aweme> LJIIIIZZ() {
        return this.LIZ.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final boolean LJIIIZ() {
        return this.LIZ.LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final InterfaceC1370310llN LJIIJ(Activity activity, Aweme aweme, String str, String str2, String str3, String str4, String str5, Integer num) {
        return this.LIZ.LJIIJ(activity, aweme, str, str2, str3, str4, str5, num);
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoDownloadService
    public final void LJIIJJI() {
        this.LIZ.LJIIJJI();
    }

    public C1375730lu7() {
        IPhotoDownloadService iPhotoDownloadService;
        Object objLIZ = C04TD.LIZ(IPhotoDownloadService.class, false);
        if (objLIZ != null) {
            iPhotoDownloadService = (IPhotoDownloadService) objLIZ;
        } else {
            if (C04TD.f4 == null) {
                synchronized (IPhotoDownloadService.class) {
                    if (C04TD.f4 == null) {
                        C04TD.f4 = new PhotoDownloadServiceImpl();
                    }
                }
            }
            iPhotoDownloadService = C04TD.f4;
        }
        this.LIZ = iPhotoDownloadService;
    }
}
