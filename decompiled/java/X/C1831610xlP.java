package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.layout.imageselector.picturechunk.SceneryPictureViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.zoom.SceneryCropPictureAssem;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xlP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1831610xlP extends C09AY implements Function2<UIAssem, C291001Au<? extends Bitmap>, Unit> {
    public final /* synthetic */ SceneryCropPictureAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1831610xlP(SceneryCropPictureAssem sceneryCropPictureAssem) {
        super(2);
        this.LL = sceneryCropPictureAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends Bitmap> c291001Au) {
        Resources resources;
        BitmapDrawable bitmapDrawable;
        final SceneryCropPictureAssem sceneryCropPictureAssem = this.LL;
        Bitmap bitmap = (Bitmap) c291001Au.LIZ;
        sceneryCropPictureAssem.LLJJJJLIIL = bitmap;
        sceneryCropPictureAssem.LLJJL = bitmap;
        float fIntValue = (((Number) sceneryCropPictureAssem.LLJLL.getValue()).intValue() / 2.0f) - (sceneryCropPictureAssem.kp() / 2);
        final C817403Hg c817403Hg = new C817403Hg();
        if (bitmap != null && sceneryCropPictureAssem.kp() > 0) {
            int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
            int iMax = Math.max(bitmap.getWidth(), bitmap.getHeight());
            if (iMin > 0) {
                c817403Hg.element = (((iMax * sceneryCropPictureAssem.kp()) / iMin) - sceneryCropPictureAssem.getScreenWidth()) / 2.0f;
            }
        }
        Context context = sceneryCropPictureAssem.getContext();
        if (context != null && (resources = context.getResources()) != null) {
            C21513519Hh c21513519HhLp = sceneryCropPictureAssem.lp();
            Bitmap bitmap2 = sceneryCropPictureAssem.LLJJJJLIIL;
            if (bitmap2 != null) {
                bitmapDrawable = new BitmapDrawable(resources, bitmap2);
            } else {
                bitmapDrawable = null;
            }
            c21513519HhLp.setImageDrawable(bitmapDrawable);
        }
        int i = C1782740wUa.LIZ[((C1819060xRA) sceneryCropPictureAssem.LLJJJJJIL.getValue()).LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (bitmap != null && bitmap.getHeight() < bitmap.getWidth() && sceneryCropPictureAssem.kp() > 0) {
                        sceneryCropPictureAssem.lp().LJIIIZ(new PointF(500.0f, 1000.0f), 1.0E-4f, 600.0f, new PointF(200.0f, 500.0f));
                        sceneryCropPictureAssem.lp().LJIIJJI(1L);
                        HandlerHook.viewPostDelay(sceneryCropPictureAssem.lp(), new Runnable() { // from class: X.0xlW
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("SceneryCropPictureAssem@68eb.setBitmap$3");
                                try {
                                    sceneryCropPictureAssem.lp().LJIIL(-c817403Hg.element, 0.0f);
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("SceneryCropPictureAssem@68eb.setBitmap$3");
                            }
                        }, 50L);
                    } else {
                        sceneryCropPictureAssem.lp().LJIIIZ(new PointF(0.0f, fIntValue), 1.0f, 1.0f, new PointF(0.0f, 0.0f));
                        sceneryCropPictureAssem.lp().LJIIJJI(null);
                    }
                }
            } else {
                sceneryCropPictureAssem.lp().LJIIIZ(new PointF(500.0f, 1000.0f), 1.0E-4f, 600.0f, new PointF(200.0f, 500.0f));
                sceneryCropPictureAssem.lp().LJIIJJI(1L);
            }
        } else {
            HandlerHook.viewPost(sceneryCropPictureAssem.lp(), new Runnable() { // from class: X.0xlQ
                public final void LIZ() {
                    float f;
                    float f2;
                    int screenWidth;
                    Drawable drawable = sceneryCropPictureAssem.lp().getDrawable();
                    if (drawable == null) {
                        return;
                    }
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    int intrinsicHeight = drawable.getIntrinsicHeight();
                    int width = sceneryCropPictureAssem.lp().getWidth();
                    int height = sceneryCropPictureAssem.lp().getHeight();
                    if (intrinsicWidth <= 0 || intrinsicHeight <= 0 || width <= 0 || height <= 0) {
                        return;
                    }
                    SceneryCropPictureAssem sceneryCropPictureAssem2 = sceneryCropPictureAssem;
                    Rect rect = sceneryCropPictureAssem2.LLJJJ;
                    if (rect != null) {
                        f = rect.left;
                        f2 = rect.top;
                        screenWidth = rect.width();
                    } else {
                        f = 0.0f;
                        f2 = 0.0f;
                        screenWidth = sceneryCropPictureAssem2.getScreenWidth();
                    }
                    float f3 = screenWidth;
                    float fHeight = sceneryCropPictureAssem.LLJJJ != null ? r0.height() : r1.getScreenWidth() / 2.0f;
                    float f4 = intrinsicWidth;
                    float f5 = intrinsicHeight;
                    float fMin = Math.min(width / f4, height / f5);
                    float fMax = fMin > 0.0f ? Math.max(f3 / f4, fHeight / f5) / fMin : 1.0f;
                    float f6 = f + (f3 / 2.0f);
                    PointF pointF = new PointF(f6, (fHeight / 2.0f) + f2);
                    sceneryCropPictureAssem.lp().LJIIIZ(pointF, fMax, 1.0f, pointF);
                    sceneryCropPictureAssem.lp().LJIIIZ(pointF, 1.0f, 1.0f, new PointF(f6, f2));
                    sceneryCropPictureAssem.lp().LJIIJJI(null);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SceneryCropPictureAssem@68eb.setBitmap$2");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SceneryCropPictureAssem@68eb.setBitmap$2");
                }
            });
        }
        HandlerHook.viewPostDelay(sceneryCropPictureAssem.lp(), new Runnable() { // from class: X.0xlT
            public final void LIZ() {
                if (sceneryCropPictureAssem.lp() == null) {
                    return;
                }
                SceneryCropPictureAssem sceneryCropPictureAssem2 = sceneryCropPictureAssem;
                sceneryCropPictureAssem2.LLJJLIIIJLLLLLLLZ = sceneryCropPictureAssem2.hp(sceneryCropPictureAssem2.lp(), sceneryCropPictureAssem.LLJJJJLIIL);
                SceneryCropPictureAssem sceneryCropPictureAssem3 = sceneryCropPictureAssem;
                sceneryCropPictureAssem3.LLJJL = sceneryCropPictureAssem3.ip(sceneryCropPictureAssem3.LLJJLIIIJLLLLLLLZ, null);
                SceneryCropPictureAssem sceneryCropPictureAssem4 = sceneryCropPictureAssem;
                Bitmap bitmap3 = sceneryCropPictureAssem4.LLJJL;
                if (bitmap3 != null) {
                    AssemVMLazy assemVMLazy = sceneryCropPictureAssem4.LLJLLIL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SceneryCropPictureAssem.LLJZIJLIL;
                    ((SceneryPictureViewModel) assemVMLazy.getValue()).xQ2(bitmap3);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SceneryCropPictureAssem@68eb.setBitmap$4");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SceneryCropPictureAssem@68eb.setBitmap$4");
            }
        }, 100L);
        return Unit.LIZ;
    }
}
