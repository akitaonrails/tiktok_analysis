package X;

import Y.AfS179S0100000_10;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.background.CropImageWindowViewModel;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.ProductCard;
import kotlin.Pair;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: renamed from: X.0Qfm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C676240Qfm {
    public static final /* synthetic */ int LJIIJJI = 0;
    public final View LIZ;
    public final CropImageWindowViewModel LIZIZ;
    public final PhotoSearchBaseVM LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public int LJFF;
    public ProductCard LJII;
    public final C01GW LJIIJ;
    public String LJI = "";
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 183));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 182));

    public final C1322110kVd LIZIZ() {
        return (C1322110kVd) this.LJIIIIZZ.getValue();
    }

    public final void LIZ(final String str) {
        final PhotoSearchEnterParams photoSearchEnterParams;
        this.LJI = str;
        C786410Ut5.LLZZLLIL((C1322110kVd) this.LJIIIZ.getValue(), 8);
        final CropImageWindowViewModel cropImageWindowViewModel = this.LIZIZ;
        if (cropImageWindowViewModel != null) {
            PhotoSearchBaseVM photoSearchBaseVM = this.LIZJ;
            if (photoSearchBaseVM != null) {
                photoSearchEnterParams = photoSearchBaseVM.LLILLL;
            } else {
                photoSearchEnterParams = null;
            }
            final Context context = this.LIZ.getContext();
            final int iLIZJ = (int) C12ES.LIZJ(40.0f, this.LIZ.getContext());
            C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0Qga
                @Override // X.InterfaceC1478005qU
                public final void subscribe(C09AJ<Pair<Bitmap, Bitmap>> c09aj) {
                    Uri localPathUri;
                    C1C7U.LIZ("CropImageWindowViewModel@3ce1.getCropBitmapFromImage$1");
                    C1115750f8n c1115750f8n = new C1115750f8n(cropImageWindowViewModel, str, iLIZJ, context, (C19482611Ke) c09aj);
                    PhotoSearchEnterParams photoSearchEnterParams2 = photoSearchEnterParams;
                    if (photoSearchEnterParams2 != null) {
                        localPathUri = photoSearchEnterParams2.getLocalPathUri();
                    } else {
                        localPathUri = null;
                    }
                    c1115750f8n.invoke(C1325290kal.LJFF(localPathUri));
                    C1C7U.LIZIZ("CropImageWindowViewModel@3ce1.getCropBitmapFromImage$1");
                }
            }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS179S0100000_10(this, 1), new AfS179S0100000_10(this, 2));
        }
    }

    public C676240Qfm(View view, CropImageWindowViewModel cropImageWindowViewModel, PhotoSearchBaseVM photoSearchBaseVM) {
        this.LIZ = view;
        this.LIZIZ = cropImageWindowViewModel;
        this.LIZJ = photoSearchBaseVM;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 181));
        this.LJIIJ = c01gwLIZIZ;
        ((C385360F9a) c01gwLIZIZ.getValue()).setColor(-1);
    }
}
