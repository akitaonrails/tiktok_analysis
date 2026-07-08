package X;

import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: renamed from: X.0fRP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1127290fRP<T> implements InterfaceC1478005qU {
    public final /* synthetic */ ImageView LIZ;
    public final /* synthetic */ ImageModel LIZIZ;
    public final /* synthetic */ int LIZJ;
    public final /* synthetic */ int LIZLLL;
    public final /* synthetic */ boolean LJ;
    public final /* synthetic */ int LJFF;

    public C1127290fRP(ImageView imageView, ImageModel imageModel, int i, int i2, boolean z, int i3) {
        this.LIZ = imageView;
        this.LIZIZ = imageModel;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = z;
        this.LJFF = i3;
    }

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ<AbstractC1127100fR6> c09aj) {
        C1C7U.LIZ("GiftImageLoaderExperimentHelper@969a.loadImageRxJava$1");
        C1151780g4u c1151780g4u = new C1151780g4u((C19482611Ke) c09aj, 4);
        ImageView imageView = this.LIZ;
        ImageModel imageModel = this.LIZIZ;
        C0JSS.LIZJ(this.LIZJ, this.LIZLLL, this.LJFF, imageView, imageModel, c1151780g4u, this.LJ);
        C1C7U.LIZIZ("GiftImageLoaderExperimentHelper@969a.loadImageRxJava$1");
    }
}
