package Y;

import X.AnonymousClass0956;
import X.C0H1Q;
import X.C0PEM;
import X.C1260120ite;
import X.C1507930pLL;
import X.C1744700vVE;
import X.C1C7U;
import X.C418440Gaw;
import X.C424040Gjy;
import X.C7727030b;
import X.C948503nH;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.MediaItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.ReviewPageControlColor;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.UsHeaderVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselInnerIndicatorAssem;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;

/* JADX INFO: loaded from: classes7.dex */
public class ARunnableS0S0203000_6 implements Runnable {
    public final int $t;
    public int i2;
    public int i3;
    public int i4;
    public Object l0;
    public Object l1;

    public final void LIZ$0() {
        Aweme awemeLIZ;
        Video video;
        float fLIZIZ = C418440Gaw.LIZIZ(3);
        float left = (((UsHeaderVH) this.l0).z6().getLeft() + ((ImageView) this.l1).getX()) - fLIZIZ;
        float top = (((UsHeaderVH) this.l0).z6().getTop() + ((ImageView) this.l1).getY()) - fLIZIZ;
        float f = 2 * fLIZIZ;
        float width = ((ImageView) this.l1).getWidth() + left + f;
        float height = ((ImageView) this.l1).getHeight() + top + f;
        MediaItem mediaItem = (MediaItem) C7727030b.LIZ(this.i2, ((UsHeaderVH) this.l0).X5().LLJ);
        Integer num = null;
        num = null;
        if (mediaItem != null) {
            Integer numValueOf = Integer.valueOf(mediaItem.type);
            if (numValueOf != null) {
                if (numValueOf.intValue() == 1) {
                    LIZIZ$1((UsHeaderVH) this.l0, left, this.i3, top, this.i4, width, height, this.i2, mediaItem.image);
                    return;
                }
                if (numValueOf.intValue() != 2) {
                    if (numValueOf.intValue() == 4) {
                        boolean zLJ = C1744700vVE.LJ(((UsHeaderVH) this.l0).itemView.getContext(), null);
                        ReviewPageControlColor reviewPageControlColor = mediaItem.reviewPageControlColor;
                        if (zLJ) {
                            if (reviewPageControlColor != null) {
                                num = reviewPageControlColor.darkModeColor;
                            }
                        } else if (reviewPageControlColor != null) {
                            num = reviewPageControlColor.lightModeColor;
                        }
                        ((UsHeaderVH) this.l0).z6().LJIIJ(this.i2, num != null && num.intValue() == 0);
                        return;
                    }
                    return;
                }
                int i = this.i2;
                if (i != 0) {
                    C1260120ite.LIZIZ(new ARunnableS17S0101000_6(i, (UsHeaderVH) this.l0, 19));
                    return;
                }
                com.ss.android.ugc.aweme.ecommerce.base.common.model.Video video2 = mediaItem.video;
                if (video2 == null || (awemeLIZ = video2.LIZ()) == null || (video = awemeLIZ.getVideo()) == null) {
                    return;
                }
                UsHeaderVH usHeaderVH = (UsHeaderVH) this.l0;
                int i2 = this.i3;
                int i3 = this.i4;
                int i4 = this.i2;
                UrlModel cover = video.getCover();
                LIZIZ$1(usHeaderVH, left, i2, top, i3, width, height, i4, cover != null ? new Image(Integer.valueOf(cover.getWidth()), Integer.valueOf(cover.getHeight()), "", cover.getUri(), cover.getUrlList(), cover.getUri(), cover.getUrlList(), null, null, null, null, null, null) : null);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS0S0203000_6 aRunnableS0S0203000_6) {
        boolean zLIZ;
        C1C7U.LIZ("UsHeaderVH@175a.updateIndicatorStyleOpt$1$1$1");
        try {
            aRunnableS0S0203000_6.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UsHeaderVH@175a.updateIndicatorStyleOpt$1$1$1");
    }

    public static final void run$1(ARunnableS0S0203000_6 aRunnableS0S0203000_6) {
        boolean zLIZ;
        ImageView selectedView;
        C1C7U.LIZ("PdpCarouselInnerIndicatorAssem@ce2b.updateIndicatorStyleOpt$1");
        try {
            if (((C424040Gjy) aRunnableS0S0203000_6.l0).getParent() != null && (selectedView = ((C424040Gjy) aRunnableS0S0203000_6.l0).getSelectedView()) != null) {
                HandlerHook.viewPost(selectedView, new ARunnableS0S0303000_6(selectedView, (C424040Gjy) aRunnableS0S0203000_6.l0, (PdpCarouselInnerIndicatorAssem) aRunnableS0S0203000_6.l1, aRunnableS0S0203000_6.i2, aRunnableS0S0203000_6.i3, aRunnableS0S0203000_6.i4, 1));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PdpCarouselInnerIndicatorAssem@ce2b.updateIndicatorStyleOpt$1");
    }

    public ARunnableS0S0203000_6(Object obj, Object obj2, int i, int i2, int i3, int i4) {
        this.$t = i4;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
        this.i3 = i2;
        this.i4 = i3;
    }

    public static final void LIZIZ$1(UsHeaderVH usHeaderVH, float f, int i, float f2, int i2, float f3, float f4, int i3, Image image) {
        AnonymousClass0956 anonymousClass0956;
        if (image != null) {
            if (C1507930pLL.LIZIZ && (anonymousClass0956 = usHeaderVH.LLLIIIIL) != null) {
                anonymousClass0956.LIZIZ(null);
            }
            usHeaderVH.LLLIIIIL = C948503nH.LJ(usHeaderVH, C0PEM.LIZJ, new C0H1Q(usHeaderVH, image, f, i, f2, i2, f3, f4, i3, null));
        }
    }
}
