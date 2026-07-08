package X;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.poi.album.cell.PoiAlbumLargeImageCell;
import com.ss.android.ugc.aweme.poi.album.cell.PoiAlbumMediumImageCell;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.p008new.IHeaderGalleryAbility;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.p008new.PoiHeaderGalleryCell;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.cell.BasePoiHeaderTopVideosCardCell;

/* JADX INFO: renamed from: X.0hYX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1208590hYX extends AbstractC1335900krs {
    public final int $t;
    public Object l0;
    public Object l1;

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
            default:
                super.cm(uri, view, th);
                break;
        }
    }

    public C1208590hYX(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void cm$0(C1208590hYX c1208590hYX, Uri uri, View view, Throwable th) {
        SmartImageView smartImageView = ((PoiHeaderGalleryCell) c1208590hYX.l0).LL;
        if (smartImageView != null) {
            smartImageView.setBackground((LayerDrawable) c1208590hYX.l1);
        }
    }

    public static final void cm$1(C1208590hYX c1208590hYX, Uri uri, View view, Throwable th) {
        BasePoiHeaderTopVideosCardCell basePoiHeaderTopVideosCardCell = (BasePoiHeaderTopVideosCardCell) c1208590hYX.l0;
        basePoiHeaderTopVideosCardCell.LLILZIL = false;
        basePoiHeaderTopVideosCardCell.R5((C1183810guZ) c1208590hYX.l1);
    }

    public static final void cm$2(C1208590hYX c1208590hYX, Uri uri, View view, Throwable th) {
        ((PoiAlbumLargeImageCell) c1208590hYX.l0).I5().LLILLL.setBackground((LayerDrawable) c1208590hYX.l1);
    }

    public static final void cm$3(C1208590hYX c1208590hYX, Uri uri, View view, Throwable th) {
        ((PoiAlbumMediumImageCell) c1208590hYX.l0).I5().LLILLJJLI.setBackground((LayerDrawable) c1208590hYX.l1);
    }

    public static final void Ad$0(C1208590hYX c1208590hYX, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        IHeaderGalleryAbility iHeaderGalleryAbility;
        SmartImageView smartImageView = ((PoiHeaderGalleryCell) c1208590hYX.l0).LL;
        if (smartImageView != null) {
            smartImageView.setBackground(null);
        }
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ((PoiHeaderGalleryCell) c1208590hYX.l0);
        if (fragmentLJIIJ != null && (iHeaderGalleryAbility = (IHeaderGalleryAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), IHeaderGalleryAbility.class, null)) != null) {
            iHeaderGalleryAbility.vO(((PoiHeaderGalleryCell) c1208590hYX.l0).getLayoutPosition());
        }
    }

    public static final void Ad$1(C1208590hYX c1208590hYX, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        BasePoiHeaderTopVideosCardCell basePoiHeaderTopVideosCardCell = (BasePoiHeaderTopVideosCardCell) c1208590hYX.l0;
        basePoiHeaderTopVideosCardCell.LLILZIL = true;
        basePoiHeaderTopVideosCardCell.R5((C1183810guZ) c1208590hYX.l1);
    }

    public static final void Ad$2(C1208590hYX c1208590hYX, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        ((PoiAlbumLargeImageCell) c1208590hYX.l0).I5().LLILLL.setBackground(null);
    }

    public static final void Ad$3(C1208590hYX c1208590hYX, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        ((PoiAlbumMediumImageCell) c1208590hYX.l0).I5().LLILLJJLI.setBackground(null);
    }
}
