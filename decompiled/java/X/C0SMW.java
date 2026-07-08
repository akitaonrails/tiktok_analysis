package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.model.SlidesImageLoadParams;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0SMW, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SMW extends C0SMS {
    public final C0SNE LJJIIZI;
    public final boolean LJJIJ;
    public final C0SMU LJJIJIIJI;

    @Override // X.C0SMS
    public final void LIZJ() {
    }

    @Override // X.C0SMS
    public final void LJIIIIZZ() {
        super.LJIIIIZZ();
        this.LJFF.setSuppressVisibilityChange(false);
        C0STF c0stf = this.LJFF;
        if (c0stf != null) {
            c0stf.setImageDisplayListener(null);
        }
    }

    @Override // X.C0SMS
    public final void LJII(C1331670kl3 c1331670kl3) {
        Drawable drawable;
        this.LJI = false;
        this.LJJIIZI.LIZIZ(c1331670kl3);
        if (this.LJJIJ && C304280BwI.LIZLLL()) {
            this.LJFF.setSuppressVisibilityChange(true);
        }
        c1331670kl3.LJJ(this.LJFF);
        c1331670kl3.LJIILJJIL = 0;
        if (C0RR4.LIZ().enable && C0RR4.LIZ().enableImageLoaderAsync) {
            c1331670kl3.LJIIL(this.LJJIJIIJI);
        } else {
            c1331670kl3.LJIIJ(this.LJJIJIIJI);
        }
        if (this.LJJIJ && C304280BwI.LIZLLL() && (drawable = this.LJFF.getDrawable()) != null) {
            drawable.setVisible(true, false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0SMU] */
    public C0SMW(final C0SM7 c0sm7, InterfaceC719500SKe interfaceC719500SKe, View view, C0SNE c0sne, boolean z, boolean z2, C0SMC c0smc) {
        super(c0sm7, interfaceC719500SKe, view, z2, c0smc);
        this.LJJIIZI = c0sne;
        this.LJJIJ = z;
        this.LJJIJIIJI = new InterfaceC427850Gq7() { // from class: X.0SMU
            @Override // X.InterfaceC427850Gq7
            public final void e1(Uri uri) {
            }

            @Override // X.InterfaceC427850Gq7
            public final void lg(Uri uri, Throwable th) {
            }

            @Override // X.InterfaceC427850Gq7
            public final void A3(Uri uri, C428600GrK c428600GrK) {
                Integer numValueOf;
                TuxTextView tuxTextView;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PhotoMode Intermediate image set position: ");
                sbLIZ.append(this.LL.LJIIJ);
                sbLIZ.append(" uri: ");
                sbLIZ.append(uri);
                sbLIZ.append(" , imageInfo, ");
                Integer numValueOf2 = null;
                if (c428600GrK != null) {
                    numValueOf = Integer.valueOf(c428600GrK.LIZ);
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                sbLIZ.append(", ");
                if (c428600GrK != null) {
                    numValueOf2 = Integer.valueOf(c428600GrK.LIZIZ);
                }
                sbLIZ.append(numValueOf2);
                C2188811AlT.LIZIZ(sbLIZ);
                C0SMW c0smw = this.LL;
                UrlModel urlModel = c0smw.LJIIZILJ;
                if (urlModel != null) {
                    int width = urlModel.getWidth();
                    int height = urlModel.getHeight();
                    if (!c0smw.LJI) {
                        c0smw.LJI = true;
                        c0smw.LJJIIZI.LIZ(width, height);
                        C719890SLr c719890SLr = c0smw.LJJII;
                        c719890SLr.LIZJ();
                        C339190DRl.LIZIZ(c719890SLr.LJIIIZ);
                        if (C298560Bn4.LIZ() && (tuxTextView = c719890SLr.LJI) != null) {
                            C339190DRl.LIZIZ(tuxTextView);
                        }
                    }
                }
            }

            @Override // X.InterfaceC427850Gq7
            public final void Bh(Uri uri, View view2) {
                C0SMW c0smw = this.LL;
                System.currentTimeMillis();
                c0smw.getClass();
            }

            @Override // X.InterfaceC427850Gq7
            public final void cm(Uri uri, View view2, Throwable th) {
                boolean z3;
                int iLIZ;
                String message;
                C1494690ozz c1494690ozz;
                String str;
                C01GW c01gw = C18046074y.LIZ;
                if (((Number) c01gw.getValue()).intValue() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                C1494600ozq requestInfo = null;
                if (z3) {
                    if (((Number) c01gw.getValue()).intValue() == 1) {
                        VideoItemParams videoItemParamsD6 = c0sm7.d6();
                        if (videoItemParamsD6 == null) {
                            return;
                        }
                        VideoItemParams videoItemParams = this.LL.LJIIIZ;
                        if (videoItemParams != null) {
                            str = videoItemParams.mEventType;
                        } else {
                            str = null;
                        }
                        if (u.LJIJI(str, "homepage_hot", true) && videoItemParamsD6.currentPosition == 0 && this.LL.LJIIJ == 0) {
                            C1602200rnO.LIZ().LIZLLL(EnumC585000Mx0.FIRST_FEED_COMPLETED);
                        }
                    } else {
                        C1602200rnO.LIZ().LIZLLL(EnumC585000Mx0.FIRST_FEED_COMPLETED);
                    }
                }
                C0SMW c0smw = this.LL;
                if (th != null) {
                    iLIZ = C2177208fy.LIZ(th);
                    message = th.getMessage();
                } else {
                    iLIZ = -1;
                    message = null;
                }
                if ((th instanceof C1494690ozz) && (c1494690ozz = (C1494690ozz) th) != null) {
                    requestInfo = c1494690ozz.getRequestInfo();
                }
                c0smw.LJ(iLIZ, message, String.valueOf(requestInfo));
            }

            @Override // X.InterfaceC427850Gq7
            public final void Ad(Uri uri, View view2, C428600GrK c428600GrK, Animatable animatable) {
                Integer numValueOf;
                Integer numValueOf2;
                TuxTextView tuxTextView;
                Drawable drawable;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PhotoMode onComplete position: ");
                sbLIZ.append(this.LL.LJIIJ);
                sbLIZ.append(" uri: ");
                sbLIZ.append(uri);
                sbLIZ.append(" , imageInfo, ");
                if (c428600GrK != null) {
                    numValueOf = Integer.valueOf(c428600GrK.LIZ);
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                sbLIZ.append(", ");
                if (c428600GrK != null) {
                    numValueOf2 = Integer.valueOf(c428600GrK.LIZIZ);
                } else {
                    numValueOf2 = null;
                }
                sbLIZ.append(numValueOf2);
                C2188811AlT.LIZIZ(sbLIZ);
                int i = 1;
                if (this.LL.LJJIJ && C304280BwI.LIZLLL() && (drawable = this.LL.LJFF.getDrawable()) != null) {
                    drawable.setVisible(true, false);
                }
                C0X35.LJIIJJI("ui_to_video_photomode_image_load", false);
                C0SMW c0smw = this.LL;
                c0smw.LIZLLL(c0smw.LJIIJ, C0N3Y.DEFAULT);
                if (c428600GrK != null) {
                    C0SMW c0smw2 = this.LL;
                    c0smw2.getClass();
                    int i2 = c428600GrK.LIZ;
                    int i3 = c428600GrK.LIZIZ;
                    if (!c0smw2.LJI) {
                        c0smw2.LJI = true;
                        c0smw2.LJJIIZI.LIZ(i2, i3);
                        C719890SLr c719890SLr = c0smw2.LJJII;
                        c719890SLr.LIZJ();
                        C339190DRl.LIZIZ(c719890SLr.LJIIIZ);
                        if (C298560Bn4.LIZ() && (tuxTextView = c719890SLr.LJI) != null) {
                            C339190DRl.LIZIZ(tuxTextView);
                        }
                    }
                    int i4 = c428600GrK.LIZ;
                    int i5 = c428600GrK.LIZIZ;
                    C721640SSk c721640SSk = C721640SSk.LIZ;
                    Bitmap.Config config = c0smw2.LJJIIJ;
                    c721640SSk.getClass();
                    int i6 = i4 * i5;
                    if (config != null) {
                        int i7 = C723140SYe.LIZ[config.ordinal()];
                        if (i7 != 1) {
                            if (i7 != 2 && (i7 == 3 || i7 == 4)) {
                                i = 2;
                            }
                        } else {
                            i = 4;
                        }
                    }
                    c0smw2.LJIILLIIL = 0;
                    SlidesImageLoadParams slidesImageLoadParamsLIZ = c0smw2.LIZ(C0SAO.SUCCESS.getCode(), c0smw2.LJIIJJI);
                    StringBuilder sb = new StringBuilder();
                    sb.append(i4);
                    sb.append('*');
                    sb.append(i5);
                    SlidesImageLoadParams slidesImageLoadParamsLIZ2 = SlidesImageLoadParams.LIZ(slidesImageLoadParamsLIZ, 0L, sb.toString(), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6 * i), null, null, null, c0smw2.LJIJJLI, c0smw2.LJIL, c0smw2.LJJ, C0SAY.SUCCESS.getValue(), -1277953, 97);
                    slidesImageLoadParamsLIZ2.strategyExtra = c0smw2.LJJIIJZLJL;
                    c0smw2.LJJIFFI = slidesImageLoadParamsLIZ2;
                    InterfaceC719500SKe interfaceC719500SKe2 = c0smw2.LIZIZ;
                    if (interfaceC719500SKe2 != null) {
                        interfaceC719500SKe2.p2(slidesImageLoadParamsLIZ2);
                        return;
                    }
                    return;
                }
                this.LL.LJ(-2, null, null);
            }
        };
    }
}
