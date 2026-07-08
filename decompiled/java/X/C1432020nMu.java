package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;

/* JADX INFO: renamed from: X.0nMu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1432020nMu<T> implements InterfaceC1478005qU {
    public final /* synthetic */ SingleImageData LIZ;
    public final /* synthetic */ ImageAlbumData LIZIZ;
    public final /* synthetic */ CreativeModel LIZJ;
    public final /* synthetic */ C1432030nMv LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ InterfaceC1450050npz LJFF;
    public final /* synthetic */ String LJI;

    public C1432020nMu(SingleImageData singleImageData, ImageAlbumData imageAlbumData, CreativeModel creativeModel, C1432030nMv c1432030nMv, String str, InterfaceC1450050npz interfaceC1450050npz, String str2) {
        this.LIZ = singleImageData;
        this.LIZIZ = imageAlbumData;
        this.LIZJ = creativeModel;
        this.LIZLLL = c1432030nMv;
        this.LJ = str;
        this.LJFF = interfaceC1450050npz;
        this.LJI = str2;
    }

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ<InterfaceC1452170ntP> c09aj) {
        C1C7U.LIZ("ImageNLECompileUtils@ac6e.compileByRx$1");
        if (!c09aj.isDisposed()) {
            C1463670oBx c1463670oBxLIZIZ = C1449990npt.LIZ.LIZIZ(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI);
            if (c1463670oBxLIZIZ != null) {
                c09aj.onNext(c1463670oBxLIZIZ);
            } else {
                c09aj.onError(new NullPointerException("IASVEEditor is null"));
            }
            c09aj.onComplete();
        }
        C1C7U.LIZIZ("ImageNLECompileUtils@ac6e.compileByRx$1");
    }
}
