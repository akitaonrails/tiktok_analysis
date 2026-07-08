package X;

import android.graphics.Bitmap;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h6t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1191450h6t<T> implements InterfaceC442640HXi {
    public final /* synthetic */ C1749280vcc LIZ;
    public final /* synthetic */ C19HL LIZIZ;
    public final /* synthetic */ C1191440h6s LIZJ;
    public final /* synthetic */ int LIZLLL;
    public final /* synthetic */ Uri LJ;

    public C1191450h6t(int i, Uri uri, C1749280vcc c1749280vcc, C19HL c19hl, C1191440h6s c1191440h6s) {
        this.LIZ = c1749280vcc;
        this.LIZIZ = c19hl;
        this.LIZJ = c1191440h6s;
        this.LIZLLL = i;
        this.LJ = uri;
    }

    @Override // X.InterfaceC442640HXi
    public final void onResult(Object obj) {
        String str;
        String str2;
        C1191500h6y c1191500h6y;
        C1191500h6y c1191500h6y2;
        if (!((Boolean) obj).booleanValue()) {
            C786410Ut5.LLLZLZ(this.LIZ, 0);
            this.LIZ.LJ();
            C786410Ut5.LLFZ(8, this.LIZIZ);
            List<C1191500h6y> list = this.LIZJ.LLILZLL;
            if (list != null && (c1191500h6y2 = (C1191500h6y) C13LP.LJJJLZIJ(this.LIZLLL, list)) != null) {
                str = c1191500h6y2.cropUrl;
            } else {
                str = null;
            }
            List<C1191500h6y> list2 = this.LIZJ.LLILZLL;
            if (list2 != null && (c1191500h6y = (C1191500h6y) C13LP.LJJJLZIJ(this.LIZLLL, list2)) != null) {
                str2 = c1191500h6y.originUrl;
            } else {
                str2 = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("is_same: ");
            sbLIZ.append(Intrinsics.LJFF(str2, this.LJ.toString()));
            C2188811AlT.LIZIZ(sbLIZ);
            if (C123100dR.LIZ(str) && Intrinsics.LJFF(str2, this.LJ.toString()) && !this.LIZJ.LLJJ && ((Number) C102100a3.LIZ.getValue()).intValue() == 1) {
                C1180600gpO c1180600gpO = new C1180600gpO("poi_gallery", "poi_gallery_crop_image", null);
                String str3 = this.LIZJ.LLIZ;
                if (C123100dR.LIZ(str3) && str3 != null) {
                    c1180600gpO.LIZLLL = new C1202680hP0(null, null, null, str3, null, 23);
                }
                C1189360h3W c1189360h3WLIZIZ = c1180600gpO.LIZIZ(str);
                c1189360h3WLIZIZ.LIZ.LJJIJL(this.LIZJ.LLILLJJLI);
                final C1191440h6s c1191440h6s = this.LIZJ;
                final int i = this.LIZLLL;
                final C1749280vcc c1749280vcc = this.LIZ;
                final C19HL c19hl = this.LIZIZ;
                final Uri uri = this.LJ;
                c1189360h3WLIZIZ.LJ(new AbstractC468201s0() { // from class: X.0h6u
                    @Override // X.InterfaceC1331910klR
                    public final void LIZ(Bitmap bitmap) {
                        C1191440h6s c1191440h6s2 = c1191440h6s;
                        if (c1191440h6s2.LLIZLLLIL) {
                            c1191440h6s2.LLJJI.add(Integer.valueOf(i));
                        }
                        C786410Ut5.LLLZLZ(c1749280vcc, 8);
                        C786410Ut5.LLFZ(0, c19hl);
                        c19hl.setImageBitmap(bitmap);
                        c1191440h6s.LJJIJIL(c19hl, i, c1749280vcc, true, null);
                    }

                    @Override // X.InterfaceC1331910klR
                    public final void onFailed(Throwable th) {
                        c1191440h6s.LJJIJIL(c19hl, i, c1749280vcc, false, uri);
                    }
                });
            }
        } else {
            C786410Ut5.LLLZLZ(this.LIZ, 8);
            C786410Ut5.LLFZ(0, this.LIZIZ);
        }
        final C1191440h6s c1191440h6s2 = this.LIZJ;
        final Uri uri2 = this.LJ;
        final int i2 = this.LIZLLL;
        final C19HL c19hl2 = this.LIZIZ;
        final C1749280vcc c1749280vcc2 = this.LIZ;
        c1191440h6s2.getClass();
        C1180600gpO c1180600gpO2 = new C1180600gpO("poi_gallery", "poi_gallery_image", null);
        c1180600gpO2.LJFF = uri2;
        C1189360h3W c1189360h3WLIZJ = c1180600gpO2.LIZJ(C1331660kl2.LJI(uri2));
        c1189360h3WLIZJ.LIZ.LJJIJL(c1191440h6s2.LLILLJJLI);
        c1189360h3WLIZJ.LJ(new AbstractC468201s0() { // from class: X.0h6v
            @Override // X.InterfaceC1331910klR
            public final void LIZ(Bitmap bitmap) {
                c19hl2.setImageBitmap(bitmap);
                C1191440h6s c1191440h6s3 = c1191440h6s2;
                c1191440h6s3.LLJJ = true;
                c1191440h6s3.LJJIJIL(c19hl2, i2, c1749280vcc2, true, null);
            }

            @Override // X.InterfaceC1331910klR
            public final void onFailed(Throwable th) {
                c1191440h6s2.LJJIJIL(c19hl2, i2, c1749280vcc2, false, uri2);
            }
        });
    }
}
