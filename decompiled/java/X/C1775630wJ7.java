package X;

import android.graphics.Bitmap;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.module.desc.SeaProductDescVideoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.desc.ProductDescVideoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.productdescription.SkuProductVideoCell;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0wJ7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1775630wJ7 extends AbstractC468201s0 {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onFailed$0(C1775630wJ7 c1775630wJ7, Throwable th) {
    }

    public static final void onFailed$1(C1775630wJ7 c1775630wJ7, Throwable th) {
    }

    public static final void onFailed$10(C1775630wJ7 c1775630wJ7, Throwable th) {
    }

    public static final void onFailed$11(C1775630wJ7 c1775630wJ7, Throwable th) {
    }

    public static final void onFailed$12(C1775630wJ7 c1775630wJ7, Throwable th) {
    }

    public static final void onFailed$2(C1775630wJ7 c1775630wJ7, Throwable th) {
    }

    public static final void onFailed$3(C1775630wJ7 c1775630wJ7, Throwable th) {
    }

    public static final void onFailed$4(C1775630wJ7 c1775630wJ7, Throwable th) {
    }

    public static final void onFailed$5(C1775630wJ7 c1775630wJ7, Throwable th) {
    }

    public static final void onFailed$6(C1775630wJ7 c1775630wJ7, Throwable th) {
    }

    public static final void onFailed$7(C1775630wJ7 c1775630wJ7, Throwable th) {
    }

    public static final void onFailed$8(C1775630wJ7 c1775630wJ7, Throwable th) {
    }

    public static final void onFailed$9(C1775630wJ7 c1775630wJ7, Throwable th) {
    }

    @Override // X.InterfaceC1331910klR
    public final void LIZ(Bitmap bitmap) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, bitmap);
                break;
            case 1:
                LIZ$1(this, bitmap);
                break;
            case 2:
                LIZ$2(this, bitmap);
                break;
            case 3:
                LIZ$3(this, bitmap);
                break;
            case 4:
                LIZ$4(this, bitmap);
                break;
            case 5:
                LIZ$5(this, bitmap);
                break;
            case 6:
                LIZ$6(this, bitmap);
                break;
            case 7:
                LIZ$7(this, bitmap);
                break;
            case 8:
                LIZ$8(this, bitmap);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, bitmap);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, bitmap);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, bitmap);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, bitmap);
                break;
            default:
                super.LIZ(bitmap);
                break;
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onFailed(Throwable th) {
        switch (this.$t) {
            case 0:
                onFailed$0(this, th);
                break;
            case 1:
                onFailed$1(this, th);
                break;
            case 2:
                onFailed$2(this, th);
                break;
            case 3:
                onFailed$3(this, th);
                break;
            case 4:
                onFailed$4(this, th);
                break;
            case 5:
                onFailed$5(this, th);
                break;
            case 6:
                onFailed$6(this, th);
                break;
            case 7:
                onFailed$7(this, th);
                break;
            case 8:
                onFailed$8(this, th);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onFailed$9(this, th);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onFailed$10(this, th);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onFailed$11(this, th);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onFailed$12(this, th);
                break;
            default:
                super.onFailed(th);
                break;
        }
    }

    public static final void LIZ$0(C1775630wJ7 c1775630wJ7, Bitmap bitmap) {
        C1752030vh3 c1752030vh3 = (C1752030vh3) c1775630wJ7.l0;
        c1752030vh3.LJFF = bitmap;
        ((C610310Nwj) c1775630wJ7.l1).LLILLJJLI.setParams(c1752030vh3);
    }

    public static final void LIZ$1(C1775630wJ7 c1775630wJ7, Bitmap bitmap) {
        C1752030vh3 c1752030vh3 = (C1752030vh3) c1775630wJ7.l0;
        c1752030vh3.LJFF = bitmap;
        C1752370vhb c1752370vhb = ((SeaProductDescVideoViewHolder) c1775630wJ7.l1).LLJJL;
        if (c1752370vhb != null) {
            c1752370vhb.setParams(c1752030vh3);
        }
    }

    public static final void LIZ$10(C1775630wJ7 c1775630wJ7, Bitmap bitmap) {
        if (bitmap != null) {
            ((SmartImageView) c1775630wJ7.l0).setImageBitmap(bitmap);
        }
        C1731280v9a c1731280v9a = (C1731280v9a) c1775630wJ7.l1;
        c1731280v9a.LJIIIIZZ = true;
        if (c1731280v9a.LJI && c1731280v9a.LJII && !c1731280v9a.LJIIIZ) {
            c1731280v9a.LJIIIZ = true;
            Function0<Unit> function0 = c1731280v9a.LJFF;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public static final void LIZ$11(C1775630wJ7 c1775630wJ7, Bitmap bitmap) {
        if (bitmap != null) {
            C443530HaJ c443530HaJ = new C443530HaJ(((SmartImageView) c1775630wJ7.l0).getResources(), bitmap);
            c443530HaJ.LIZJ(C341940Daq.LIZ(6.0d));
            ((SmartImageView) c1775630wJ7.l0).setImageDrawable(c443530HaJ);
        }
        C1731280v9a c1731280v9a = (C1731280v9a) c1775630wJ7.l1;
        c1731280v9a.LJII = true;
        if (c1731280v9a.LJI && c1731280v9a.LJIIIIZZ && !c1731280v9a.LJIIIZ) {
            c1731280v9a.LJIIIZ = true;
            Function0<Unit> function0 = c1731280v9a.LJFF;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public static final void LIZ$12(C1775630wJ7 c1775630wJ7, Bitmap bitmap) {
        if (bitmap != null) {
            ((SmartImageView) c1775630wJ7.l0).setImageBitmap(bitmap);
        }
        C1731240v9W c1731240v9W = (C1731240v9W) c1775630wJ7.l1;
        c1731240v9W.LJFF = true;
        if (c1731240v9W.LJ && !c1731240v9W.LJI) {
            c1731240v9W.LJI = true;
            Function0<Unit> function0 = c1731240v9W.LIZLLL;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public static final void LIZ$2(C1775630wJ7 c1775630wJ7, Bitmap bitmap) {
        C1752030vh3 c1752030vh3 = (C1752030vh3) c1775630wJ7.l0;
        c1752030vh3.LJFF = bitmap;
        C1765720w38 c1765720w38 = ((ProductDescVideoViewHolder) c1775630wJ7.l1).LLJJJJLIIL;
        if (c1765720w38 != null) {
            c1765720w38.setParams(c1752030vh3);
        }
    }

    public static final void LIZ$3(C1775630wJ7 c1775630wJ7, Bitmap bitmap) {
        C1752030vh3 c1752030vh3 = (C1752030vh3) c1775630wJ7.l0;
        c1752030vh3.LJFF = bitmap;
        C1765720w38 c1765720w38 = ((SkuProductVideoCell) c1775630wJ7.l1).LLILZIL;
        if (c1765720w38 != null) {
            c1765720w38.setParams(c1752030vh3);
        }
    }

    public static final void LIZ$4(C1775630wJ7 c1775630wJ7, Bitmap bitmap) {
        if (bitmap != null) {
            ((SmartImageView) c1775630wJ7.l0).setImageBitmap(bitmap);
        }
        C1731210v9T c1731210v9T = (C1731210v9T) c1775630wJ7.l1;
        if (!c1731210v9T.LJ) {
            c1731210v9T.LJ = true;
            Function0<Unit> function0 = c1731210v9T.LIZLLL;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public static final void LIZ$5(C1775630wJ7 c1775630wJ7, Bitmap bitmap) {
        if (bitmap != null) {
            ((SmartImageView) c1775630wJ7.l0).setImageBitmap(bitmap);
        }
        C1731270v9Z c1731270v9Z = (C1731270v9Z) c1775630wJ7.l1;
        c1731270v9Z.LJIIL = true;
        if (c1731270v9Z.LJIIJ && c1731270v9Z.LJIIJJI && !c1731270v9Z.LJIILIIL) {
            c1731270v9Z.LJIILIIL = true;
            Function0<Unit> function0 = c1731270v9Z.LJIIIZ;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public static final void LIZ$6(C1775630wJ7 c1775630wJ7, Bitmap bitmap) {
        if (bitmap != null) {
            C443530HaJ c443530HaJ = new C443530HaJ(((SmartImageView) c1775630wJ7.l0).getResources(), bitmap);
            c443530HaJ.LIZJ(C341940Daq.LIZ(6.0d));
            ((SmartImageView) c1775630wJ7.l0).setImageDrawable(c443530HaJ);
        }
        C1731270v9Z c1731270v9Z = (C1731270v9Z) c1775630wJ7.l1;
        c1731270v9Z.LJIIJJI = true;
        if (c1731270v9Z.LJIIJ && c1731270v9Z.LJIIL && !c1731270v9Z.LJIILIIL) {
            c1731270v9Z.LJIILIIL = true;
            Function0<Unit> function0 = c1731270v9Z.LJIIIZ;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public static final void LIZ$7(C1775630wJ7 c1775630wJ7, Bitmap bitmap) {
        if (bitmap != null) {
            ((SmartImageView) c1775630wJ7.l0).setImageBitmap(bitmap);
        }
        C1731260v9Y c1731260v9Y = (C1731260v9Y) c1775630wJ7.l1;
        c1731260v9Y.LJIIIZ = true;
        if (c1731260v9Y.LIZJ()) {
            C1731260v9Y c1731260v9Y2 = (C1731260v9Y) c1775630wJ7.l1;
            c1731260v9Y2.LJIIJJI = true;
            Function0<Unit> function0 = c1731260v9Y2.LJI;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public static final void LIZ$8(C1775630wJ7 c1775630wJ7, Bitmap bitmap) {
        if (bitmap != null) {
            ((SmartImageView) c1775630wJ7.l0).setImageBitmap(bitmap);
        }
        C1731260v9Y c1731260v9Y = (C1731260v9Y) c1775630wJ7.l1;
        c1731260v9Y.LJIIJ = true;
        if (c1731260v9Y.LIZJ()) {
            C1731260v9Y c1731260v9Y2 = (C1731260v9Y) c1775630wJ7.l1;
            c1731260v9Y2.LJIIJJI = true;
            Function0<Unit> function0 = c1731260v9Y2.LJI;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public static final void LIZ$9(C1775630wJ7 c1775630wJ7, Bitmap bitmap) {
        if (bitmap != null) {
            C443530HaJ c443530HaJ = new C443530HaJ(((SmartImageView) c1775630wJ7.l0).getResources(), bitmap);
            c443530HaJ.LIZJ(C341940Daq.LIZ(6.0d));
            ((SmartImageView) c1775630wJ7.l0).setImageDrawable(c443530HaJ);
        }
        C1731260v9Y c1731260v9Y = (C1731260v9Y) c1775630wJ7.l1;
        c1731260v9Y.LJIIIIZZ = true;
        if (c1731260v9Y.LIZJ()) {
            C1731260v9Y c1731260v9Y2 = (C1731260v9Y) c1775630wJ7.l1;
            c1731260v9Y2.LJIIJJI = true;
            Function0<Unit> function0 = c1731260v9Y2.LJI;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public C1775630wJ7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
