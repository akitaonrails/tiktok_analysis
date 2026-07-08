package X;

import com.ss.android.ugc.aweme.mix.mixdetail.MixVideosDialog;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.uiwidget.PoiReviewHelpfulAssem;
import com.ss.android.ugc.aweme.poi.uiwidget.PoiReviewHelpfulVM;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiReviewGalleryAbility;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.reviews.PoiReviewHelpfulBtnAssem;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.reviews.PoiReviewsGalleryData;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: renamed from: X.0hZ8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1208960hZ8 implements InterfaceC849390XTt {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ void LIZIZ$0(C1208960hZ8 c1208960hZ8) {
    }

    public static final void LIZIZ$1(C1208960hZ8 c1208960hZ8) {
    }

    public static final void LIZIZ$2(C1208960hZ8 c1208960hZ8) {
    }

    public static final void LIZIZ$3(C1208960hZ8 c1208960hZ8) {
    }

    @Override // X.InterfaceC849390XTt
    public final void LIZ() {
        switch (this.$t) {
            case 0:
                LIZ$0(this);
                break;
            case 1:
                LIZ$1(this);
                break;
            case 2:
                LIZ$2(this);
                break;
            case 3:
                LIZ$3(this);
                break;
        }
    }

    @Override // X.InterfaceC849390XTt
    public final /* synthetic */ void LIZIZ() {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this);
                break;
            case 1:
                LIZIZ$1(this);
                break;
            case 2:
                LIZIZ$2(this);
                break;
            case 3:
                LIZIZ$3(this);
                break;
        }
    }

    public static final void LIZ$0(C1208960hZ8 c1208960hZ8) {
        ((MixVideosDialog) c1208960hZ8.l0).oD2();
    }

    public static final void LIZ$1(C1208960hZ8 c1208960hZ8) {
        PoiReviewHelpfulVM poiReviewHelpfulVMHo = ((PoiReviewHelpfulAssem) c1208960hZ8.l0).Ho();
        PoiReviewHelpfulAssem poiReviewHelpfulAssem = (PoiReviewHelpfulAssem) c1208960hZ8.l0;
        poiReviewHelpfulAssem.getClass();
        PoiReviewsApi.PoiReviewModel poiReviewModelEq = null;
        PoiReviewGalleryAbility poiReviewGalleryAbility = (PoiReviewGalleryAbility) C1558520qew.LIZ(C1558520qew.LJIIL(poiReviewHelpfulAssem), PoiReviewGalleryAbility.class, null);
        if (poiReviewGalleryAbility != null) {
            poiReviewModelEq = poiReviewGalleryAbility.eq();
        }
        poiReviewHelpfulVMHo.vQ2(poiReviewModelEq, new AwS597S0100000_18((PoiReviewHelpfulAssem) c1208960hZ8.l0, 524));
    }

    public static final void LIZ$2(C1208960hZ8 c1208960hZ8) {
        com.ss.android.ugc.aweme.poi.uiwidget.gallery.reviews.PoiReviewHelpfulVM poiReviewHelpfulVMHo = ((PoiReviewHelpfulBtnAssem) c1208960hZ8.l0).Ho();
        PoiReviewHelpfulBtnAssem poiReviewHelpfulBtnAssem = (PoiReviewHelpfulBtnAssem) c1208960hZ8.l0;
        poiReviewHelpfulBtnAssem.getClass();
        PoiReviewsGalleryData poiReviewsGalleryDataEq = null;
        com.ss.android.ugc.aweme.poi.uiwidget.gallery.reviews.PoiReviewGalleryAbility poiReviewGalleryAbility = (com.ss.android.ugc.aweme.poi.uiwidget.gallery.reviews.PoiReviewGalleryAbility) C1558520qew.LIZ(C1558520qew.LJIIL(poiReviewHelpfulBtnAssem), com.ss.android.ugc.aweme.poi.uiwidget.gallery.reviews.PoiReviewGalleryAbility.class, null);
        if (poiReviewGalleryAbility != null) {
            poiReviewsGalleryDataEq = poiReviewGalleryAbility.eq();
        }
        poiReviewHelpfulVMHo.vQ2(poiReviewsGalleryDataEq, new AwS597S0100000_18((PoiReviewHelpfulBtnAssem) c1208960hZ8.l0, 528));
    }

    public static final void LIZ$3(C1208960hZ8 c1208960hZ8) {
    }

    public C1208960hZ8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
