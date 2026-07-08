package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.bytedance.fly_main_color.FlyMainColor;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.template.assem.TemplateBannerAssem;
import com.ss.android.ugc.profile.business.ur.longpress.LongPressAwemeFragment;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ID4, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0ID4 extends AbstractC468201s0 {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onFailed$1(C0ID4 c0id4, Throwable th) {
    }

    public static final void onFailed$6(C0ID4 c0id4, Throwable th) {
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
            default:
                super.onFailed(th);
                break;
        }
    }

    public static final void LIZ$0(C0ID4 c0id4, Bitmap bitmap) {
        if (bitmap != null) {
            C0H90 c0h90 = (C0H90) c0id4.l1;
            Function1 function1 = (Function1) c0id4.l0;
            C427660Gpo authorAvatarFromXml = c0h90.getAuthorAvatarFromXml();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            canvas.drawCircle(bitmap.getWidth() / 2.0f, bitmap.getWidth() / 2.0f, bitmap.getWidth() / 2.0f, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            authorAvatarFromXml.setImageBitmap(bitmapCreateBitmap);
            function1.invoke(Boolean.TRUE);
            return;
        }
        ((Function1) c0id4.l0).invoke(Boolean.FALSE);
    }

    public static final void LIZ$1(C0ID4 c0id4, Bitmap bitmap) {
        if (bitmap != null) {
            C426300Gnc c426300Gnc = (C426300Gnc) c0id4.l0;
            c426300Gnc.LLILLJJLI.put(((C426310Gnd) c0id4.l1).LIZ, bitmap);
            c426300Gnc.postInvalidate();
        }
    }

    public static final void LIZ$2(C0ID4 c0id4, Bitmap bitmap) {
        if (bitmap != null) {
            C426020GnA c426020GnA = (C426020GnA) c0id4.l0;
            int i = c426020GnA.LLJILJIL;
            c426020GnA.getClass();
            int i2 = i * 2;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth() + i2, bitmap.getHeight() + i2, Bitmap.Config.ARGB_8888);
            float f = i;
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, f, f, (Paint) null);
            C426020GnA c426020GnA2 = (C426020GnA) c0id4.l0;
            c426020GnA2.LLJ = C1319770kRr.LIZ(c426020GnA2.LLJILJIL, bitmapCreateBitmap);
            C786410Ut5.LJJJJ(bitmapCreateBitmap);
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        C786410Ut5.h3((C1331670kl3) c0id4.l1);
    }

    public static final void LIZ$3(C0ID4 c0id4, Bitmap bitmap) {
        if (bitmap != null && bitmap.getWidth() != 0 && bitmap.getHeight() != 0) {
            int height = ((RadiusLayout) c0id4.l0).getHeight();
            if (bitmap.getWidth() > bitmap.getHeight()) {
                ImageView imageView = (ImageView) c0id4.l1;
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = (int) ((height * bitmap.getHeight()) / bitmap.getWidth());
                    C786410Ut5.W5(imageView, layoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            } else {
                ImageView imageView2 = (ImageView) c0id4.l1;
                ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = height;
                    C786410Ut5.W5(imageView2, layoutParams2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            ((ImageView) c0id4.l1).setImageBitmap(bitmap);
        }
    }

    public static final void LIZ$4(C0ID4 c0id4, Bitmap bitmap) {
        if (bitmap != null) {
            Function1 function1 = (Function1) c0id4.l0;
            C443530HaJ c443530HaJ = new C443530HaJ(((Context) c0id4.l1).getResources(), bitmap);
            c443530HaJ.LIZIZ();
            c443530HaJ.LIZLLL.setAntiAlias(true);
            c443530HaJ.invalidateSelf();
            function1.invoke(c443530HaJ);
            return;
        }
        ((Function1) c0id4.l0).invoke(null);
    }

    public static final void LIZ$5(C0ID4 c0id4, Bitmap bitmap) {
        ((LongPressAwemeFragment) c0id4.l0).getClass();
        Integer numLIZIZ = null;
        if (bitmap != null) {
            C204674156y c204674156yLIZ = FlyMainColor.LIZ.LIZ(new C2439109h7(bitmap, null));
            c204674156yLIZ.LJFF(0.0f);
            c204674156yLIZ.LJI(0.0f);
            c204674156yLIZ.LJ(0.012f, 0.32f, 0.4f, 0.62f, 0.4f);
            numLIZIZ = c204674156yLIZ.LIZIZ();
        }
        ((Function1) c0id4.l1).invoke(numLIZIZ);
    }

    public static final void LIZ$6(C0ID4 c0id4, final Bitmap bitmap) {
        if (bitmap != null && bitmap.getHeight() != 0) {
            final float width = bitmap.getWidth() / bitmap.getHeight();
            ViewTreeObserver viewTreeObserver = ((SmartImageView) c0id4.l0).getViewTreeObserver();
            final SmartImageView smartImageView = (SmartImageView) c0id4.l0;
            final TemplateBannerAssem templateBannerAssem = (TemplateBannerAssem) c0id4.l1;
            C786410Ut5.x3(viewTreeObserver, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0GoI
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_template_bugfix_banner_bitmap_exception", true, true)) {
                        C786410Ut5.C3(smartImageView.getViewTreeObserver(), this);
                        int width2 = smartImageView.getWidth();
                        int i = (int) (width2 / width);
                        SmartImageView smartImageView2 = smartImageView;
                        ViewGroup.LayoutParams layoutParams = smartImageView2.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                        layoutParams.height = i;
                        C786410Ut5.W5(smartImageView2, layoutParams);
                        smartImageView.setImageBitmap(Bitmap.createScaledBitmap(bitmap, width2, i, true));
                        return;
                    }
                    int width3 = smartImageView.getWidth();
                    if (width3 <= 0) {
                        TemplateBannerAssem templateBannerAssem2 = templateBannerAssem;
                        Context context = smartImageView.getContext();
                        templateBannerAssem2.getClass();
                        width3 = C11VU.LJ(context) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                        if (width3 <= 0) {
                            return;
                        }
                    }
                    int i2 = (int) (width3 / width);
                    if (i2 < 1) {
                        i2 = 1;
                    }
                    SmartImageView smartImageView3 = smartImageView;
                    ViewGroup.LayoutParams layoutParams2 = smartImageView3.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams2.height = i2;
                    C786410Ut5.W5(smartImageView3, layoutParams2);
                    smartImageView.setImageBitmap(Bitmap.createScaledBitmap(bitmap, width3, i2, true));
                    C786410Ut5.C3(smartImageView.getViewTreeObserver(), this);
                }
            });
        }
    }

    public static final void onFailed$0(C0ID4 c0id4, Throwable th) {
        ((Function1) c0id4.l0).invoke(Boolean.FALSE);
    }

    public static final void onFailed$2(C0ID4 c0id4, Throwable th) {
        C786410Ut5.h3((C1331670kl3) c0id4.l1);
    }

    public static final void onFailed$3(C0ID4 c0id4, Throwable th) {
        ((ImageView) c0id4.l1).setImageBitmap(null);
    }

    public static final void onFailed$4(C0ID4 c0id4, Throwable th) {
        ((Function1) c0id4.l0).invoke(null);
    }

    public static final void onFailed$5(C0ID4 c0id4, Throwable th) {
        ((Function1) c0id4.l1).invoke(null);
    }

    public C0ID4(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
