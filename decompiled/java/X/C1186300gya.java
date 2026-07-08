package X;

import Y.ARunnableS118S0100000_18;
import Y.ARunnableS24S0201000_18;
import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.poi.detail.dishes.PoiInnerPageMobData;
import com.ss.android.ugc.aweme.poi.detail.gallery.PoiGalleryCell;
import com.ss.android.ugc.aweme.poi.detail.gallery.PoiPicture;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gya, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1186300gya<T> implements InterfaceC442640HXi {
    public final /* synthetic */ PoiGalleryCell LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ Uri LIZJ;
    public final /* synthetic */ int LIZLLL;

    public C1186300gya(int i, Uri uri, PoiGalleryCell poiGalleryCell, String str) {
        this.LIZ = poiGalleryCell;
        this.LIZIZ = str;
        this.LIZJ = uri;
        this.LIZLLL = i;
    }

    @Override // X.InterfaceC442640HXi
    public final void onResult(Object obj) {
        String str;
        int i;
        String str2;
        PoiPicture poiPicture;
        PoiInnerPageMobData poiInnerPageMobData;
        String str3;
        int i2;
        PoiInnerPageMobData poiInnerPageMobData2;
        String str4 = null;
        if (!((Boolean) obj).booleanValue()) {
            C1749280vcc c1749280vcc = this.LIZ.LLILLJJLI;
            if (c1749280vcc != null) {
                C786410Ut5.LLLZLZ(c1749280vcc, 0);
            }
            C1749280vcc c1749280vcc2 = this.LIZ.LLILLJJLI;
            if (c1749280vcc2 != null) {
                c1749280vcc2.LJ();
            }
            C19HL c19hl = this.LIZ.LL;
            if (c19hl != null) {
                C786410Ut5.LLFZ(8, c19hl);
            }
            String str5 = this.LIZIZ;
            if (str5 != null && str5.length() != 0) {
                final PoiGalleryCell poiGalleryCell = this.LIZ;
                String str6 = this.LIZIZ;
                Uri uri = this.LIZJ;
                final int i3 = this.LIZLLL;
                final C19HL c19hl2 = poiGalleryCell.LL;
                if (c19hl2 != null) {
                    final String string = uri.toString();
                    int i4 = PoiGalleryCell.LLJI;
                    C1186260gyW item = poiGalleryCell.getItem();
                    if (item != null && (poiInnerPageMobData2 = item.LLILZIL) != null) {
                        str3 = poiInnerPageMobData2.enterFrom;
                    } else {
                        str3 = null;
                    }
                    C1186260gyW item2 = poiGalleryCell.getItem();
                    if (item2 != null) {
                        i2 = item2.LLILZ;
                    } else {
                        i2 = 0;
                    }
                    C1189360h3W c1189360h3WLIZIZ = new C1180600gpO("poi_gallery", C1186330gyd.LIZ(i3, i2, str3, true), null).LIZIZ(str6);
                    c1189360h3WLIZIZ.LIZ.LJJIJL(c19hl2.getContext());
                    c1189360h3WLIZIZ.LJ(new AbstractC468201s0() { // from class: X.0gyc
                        @Override // X.InterfaceC1331910klR
                        public final void LIZ(Bitmap bitmap) {
                            if (Intrinsics.LJFF(c19hl2.getTag(), string) && !poiGalleryCell.LLILLL) {
                                poiGalleryCell.LLILZ = true;
                                c19hl2.setImageBitmap(bitmap);
                                poiGalleryCell.N5(i3, null, null, true);
                            }
                        }

                        @Override // X.InterfaceC1331910klR
                        public final void onFailed(Throwable th) {
                            Intrinsics.LJFF(c19hl2.getTag(), string);
                        }
                    });
                }
            }
        } else {
            C1749280vcc c1749280vcc3 = this.LIZ.LLILLJJLI;
            if (c1749280vcc3 != null) {
                C786410Ut5.LLLZLZ(c1749280vcc3, 8);
            }
            C19HL c19hl3 = this.LIZ.LL;
            if (c19hl3 != null) {
                C786410Ut5.LLFZ(8, c19hl3);
            }
        }
        final PoiGalleryCell poiGalleryCell2 = this.LIZ;
        final Uri uri2 = this.LIZJ;
        final int i5 = this.LIZLLL;
        final String str7 = this.LIZIZ;
        final C19HL c19hl4 = poiGalleryCell2.LL;
        if (c19hl4 != null) {
            final String string2 = uri2.toString();
            c19hl4.setTag(string2);
            int i6 = PoiGalleryCell.LLJI;
            C1186260gyW item3 = poiGalleryCell2.getItem();
            if (item3 != null && (poiInnerPageMobData = item3.LLILZIL) != null) {
                str = poiInnerPageMobData.enterFrom;
            } else {
                str = null;
            }
            C1186260gyW item4 = poiGalleryCell2.getItem();
            if (item4 != null) {
                i = item4.LLILZ;
            } else {
                i = 0;
            }
            C1180600gpO c1180600gpO = new C1180600gpO("poi_gallery", C1186330gyd.LIZ(i5, i, str, false), null);
            C1186260gyW item5 = poiGalleryCell2.getItem();
            if (item5 != null) {
                str2 = item5.LL;
            } else {
                str2 = null;
            }
            C1186260gyW item6 = poiGalleryCell2.getItem();
            if (item6 != null && (poiPicture = item6.LLILLL) != null) {
                str4 = poiPicture.source;
            }
            c1180600gpO.LIZLLL = new C1202680hP0(str2, str4, null, null, null, 28);
            c1180600gpO.LJFF = uri2;
            C1189360h3W c1189360h3WLIZJ = c1180600gpO.LIZJ(C1331660kl2.LJI(uri2));
            c1189360h3WLIZJ.LIZ.LJJIJL(c19hl4.getContext());
            c1189360h3WLIZJ.LJ(new AbstractC468201s0() { // from class: X.0gyb
                @Override // X.InterfaceC1331910klR
                public final void LIZ(Bitmap bitmap) {
                    if (!Intrinsics.LJFF(c19hl4.getTag(), string2)) {
                        return;
                    }
                    poiGalleryCell2.LLILLL = true;
                    c19hl4.setImageBitmap(bitmap);
                    poiGalleryCell2.N5(i5, null, null, true);
                    C1186260gyW item7 = poiGalleryCell2.getItem();
                    if (item7 != null && i5 == item7.LLILZ) {
                        HandlerHook.viewPostDelay(c19hl4, new ARunnableS118S0100000_18(poiGalleryCell2, 66), 300L);
                    } else {
                        HandlerHook.viewPost(c19hl4, new ARunnableS118S0100000_18(poiGalleryCell2, 67));
                    }
                }

                @Override // X.InterfaceC1331910klR
                public final void onFailed(Throwable th) {
                    if (!Intrinsics.LJFF(c19hl4.getTag(), string2)) {
                        return;
                    }
                    if (poiGalleryCell2.LLILZ) {
                        poiGalleryCell2.N5(i5, null, null, true);
                    } else {
                        poiGalleryCell2.N5(i5, uri2, str7, false);
                    }
                }
            });
            C786410Ut5.LJLIIL(500L, C0CAU.LIZ, new ARunnableS24S0201000_18(poiGalleryCell2, c19hl4, i5, 2));
        }
    }
}
