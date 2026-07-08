package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.poi.albummix.feed.PoiPhotoTextRootAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.p008new.IHeaderGalleryAbility;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.p008new.PoiHeaderGalleryCell;
import com.ss.android.ugc.aweme.poi.detail.gallery.PoiGalleryCell;

/* JADX INFO: renamed from: X.0hYY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1208600hYY extends AbstractC1335900krs {
    public final int $t;
    public Object l0;

    public static final void Ad$2(C1208600hYY c1208600hYY, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
    }

    public static final void Ad$3(C1208600hYY c1208600hYY, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
    }

    public static final void cm$0(C1208600hYY c1208600hYY, Uri uri, View view, Throwable th) {
    }

    @Override // X.InterfaceC427850Gq7
    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        switch (this.$t) {
            case 0:
                Ad$0(this, uri, view, c428600GrK, animatable);
                break;
            case 1:
                Ad$1(this, uri, view, c428600GrK, animatable);
                break;
            case 2:
                Ad$2(this, uri, view, c428600GrK, animatable);
                break;
            case 3:
                Ad$3(this, uri, view, c428600GrK, animatable);
                break;
            case 4:
                Ad$4(this, uri, view, c428600GrK, animatable);
                break;
            default:
                super.Ad(uri, view, c428600GrK, animatable);
                break;
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void cm(Uri uri, View view, Throwable th) {
        switch (this.$t) {
            case 0:
                cm$0(this, uri, view, th);
                break;
            case 1:
                cm$1(this, uri, view, th);
                break;
            case 2:
                cm$2(this, uri, view, th);
                break;
            case 3:
                cm$3(this, uri, view, th);
                break;
            case 4:
                cm$4(this, uri, view, th);
                break;
            default:
                super.cm(uri, view, th);
                break;
        }
    }

    public C1208600hYY(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void cm$1(C1208600hYY c1208600hYY, Uri uri, View view, Throwable th) {
        ((C1180550gpJ) c1208600hYY.l0).LJ = false;
    }

    public static final void cm$2(C1208600hYY c1208600hYY, Uri uri, View view, Throwable th) {
        SmartImageView smartImageView = ((PoiGalleryCell) c1208600hYY.l0).LLIZ;
        if (smartImageView != null) {
            C786410Ut5.LLFF(8, smartImageView);
        }
    }

    public static final void cm$3(C1208600hYY c1208600hYY, Uri uri, View view, Throwable th) {
        SmartImageView smartImageView = ((PoiPhotoTextRootAssem) c1208600hYY.l0).LLJLIL;
        if (smartImageView != null) {
            C786410Ut5.LLFF(8, smartImageView);
        }
    }

    public static final void cm$4(C1208600hYY c1208600hYY, Uri uri, View view, Throwable th) {
        if (C296700Bk4.LIZ()) {
            C339190DRl.LIZLLL((C421260GfU) c1208600hYY.l0);
        } else {
            C339190DRl.LIZIZ((C421260GfU) c1208600hYY.l0);
        }
    }

    public static final void Ad$0(C1208600hYY c1208600hYY, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        IHeaderGalleryAbility iHeaderGalleryAbility;
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ((PoiHeaderGalleryCell) c1208600hYY.l0);
        if (fragmentLJIIJ != null && (iHeaderGalleryAbility = (IHeaderGalleryAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), IHeaderGalleryAbility.class, null)) != null) {
            iHeaderGalleryAbility.vO(((PoiHeaderGalleryCell) c1208600hYY.l0).getLayoutPosition());
        }
    }

    public static final void Ad$1(C1208600hYY c1208600hYY, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        ((C1180550gpJ) c1208600hYY.l0).LJ = true;
    }

    public static final void Ad$4(C1208600hYY c1208600hYY, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        C339190DRl.LIZLLL((C421260GfU) c1208600hYY.l0);
    }
}
