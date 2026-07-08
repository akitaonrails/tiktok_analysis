package X;

import Y.ARunnableS24S0201000_18;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import com.ss.android.ugc.aweme.poi.detail.dishes.gallery.PoiRecommendDishesGalleryAssem;
import com.ss.android.ugc.aweme.poi.detail.gallery.PoiRecommendDishesGalleryAbility;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gsd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1182610gsd<T> implements InterfaceC442640HXi {
    public final /* synthetic */ PoiRecommendDishesGalleryAssem LIZ;
    public final /* synthetic */ Uri LIZIZ;
    public final /* synthetic */ int LIZJ;

    public C1182610gsd(int i, Uri uri, PoiRecommendDishesGalleryAssem poiRecommendDishesGalleryAssem) {
        this.LIZ = poiRecommendDishesGalleryAssem;
        this.LIZIZ = uri;
        this.LIZJ = i;
    }

    @Override // X.InterfaceC442640HXi
    public final void onResult(Object obj) {
        String strC21;
        PoiRecommendDishesGalleryAbility poiRecommendDishesGalleryAbility;
        if (!((Boolean) obj).booleanValue()) {
            C1749280vcc c1749280vcc = this.LIZ.LLJL;
            if (c1749280vcc != null) {
                C786410Ut5.LLLZLZ(c1749280vcc, 0);
            }
            C1749280vcc c1749280vcc2 = this.LIZ.LLJL;
            if (c1749280vcc2 != null) {
                c1749280vcc2.LJ();
            }
            C19HL c19hl = this.LIZ.LLJJLIIIJLLLLLLLZ;
            if (c19hl != null) {
                C786410Ut5.LLFZ(8, c19hl);
            }
        } else {
            C1749280vcc c1749280vcc3 = this.LIZ.LLJL;
            if (c1749280vcc3 != null) {
                C786410Ut5.LLLZLZ(c1749280vcc3, 8);
            }
            C19HL c19hl2 = this.LIZ.LLJJLIIIJLLLLLLLZ;
            if (c19hl2 != null) {
                C786410Ut5.LLFZ(0, c19hl2);
            }
        }
        final PoiRecommendDishesGalleryAssem poiRecommendDishesGalleryAssem = this.LIZ;
        final Uri uri = this.LIZIZ;
        final int i = this.LIZJ;
        final C19HL c19hl3 = poiRecommendDishesGalleryAssem.LLJJLIIIJLLLLLLLZ;
        if (c19hl3 != null) {
            final String string = uri.toString();
            if (Intrinsics.LJFF(c19hl3.getTag(), uri.toString()) && c19hl3.getDrawable() != null) {
                return;
            }
            c19hl3.setTag(string);
            View viewAp = poiRecommendDishesGalleryAssem.Ap();
            if (viewAp != null && (poiRecommendDishesGalleryAbility = (PoiRecommendDishesGalleryAbility) C1558520qew.LIZ(C1558360qeg.LJ(viewAp, null), PoiRecommendDishesGalleryAbility.class, null)) != null) {
                strC21 = poiRecommendDishesGalleryAbility.C21();
            } else {
                strC21 = null;
            }
            C1180600gpO c1180600gpO = new C1180600gpO("poi_gallery", "poi_gallery_image", null);
            c1180600gpO.LIZLLL = new C1202680hP0(strC21, null, null, null, null, 30);
            c1180600gpO.LJFF = uri;
            C1189360h3W c1189360h3WLIZJ = c1180600gpO.LIZJ(C1331660kl2.LJI(uri));
            c1189360h3WLIZJ.LIZ.LJJIJL(c19hl3.getContext());
            c1189360h3WLIZJ.LJ(new AbstractC468201s0() { // from class: X.0gse
                @Override // X.InterfaceC1331910klR
                public final void LIZ(Bitmap bitmap) {
                    if (!Intrinsics.LJFF(c19hl3.getTag(), string)) {
                        return;
                    }
                    c19hl3.setImageBitmap(bitmap);
                    PoiRecommendDishesGalleryAssem poiRecommendDishesGalleryAssem2 = poiRecommendDishesGalleryAssem;
                    int i2 = i;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PoiRecommendDishesGalleryAssem.LLLFF;
                    poiRecommendDishesGalleryAssem2.yp(i2, true, bitmap, null);
                }

                @Override // X.InterfaceC1331910klR
                public final void onFailed(Throwable th) {
                    if (!Intrinsics.LJFF(c19hl3.getTag(), string)) {
                        return;
                    }
                    poiRecommendDishesGalleryAssem.yp(i, false, null, uri);
                }
            });
            C786410Ut5.LJLIIL(500L, C0CAU.LIZ, new ARunnableS24S0201000_18(poiRecommendDishesGalleryAssem, c19hl3, i, 1));
        }
    }
}
