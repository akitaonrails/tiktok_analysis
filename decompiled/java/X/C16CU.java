package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.ss.android.ugc.aweme.ecommerce.base.selector.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.16CU, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.selector.tryon.PreviewImageScene$showAnimateAsync$1$1", f = "PreviewImageScene.kt", l = {}, m = "invokeSuspend")
public final class C16CU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C16CV LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16CU(C16CV c16cv, InterfaceC1364105Vn<? super C16CU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c16cv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C16CU(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [REQUEST, X.0kbR] */
    /* JADX WARN: Type inference failed for: r0v17, types: [REQUEST, X.0kbR] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C16CX c16cx;
        String strLJFF;
        String str;
        C1324630kZh c1324630kZh;
        InterfaceC1320850kTb controller;
        View viewLIZJ;
        final View viewLIZJ2;
        C16CX c16cx2;
        Rect rect;
        int i;
        int i2;
        C1C7U.LIZ("PreviewImageScene@55e6.showAnimateAsync$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.mViewDestroyed) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PreviewImageScene@55e6.showAnimateAsync$1$1");
            return unit;
        }
        C16CV c16cv = this.LL;
        KeyEvent.Callback callback = c16cv.LLJJJIL;
        if (callback instanceof C16CX) {
            c16cx = (C16CX) callback;
        } else {
            c16cx = null;
        }
        if (c16cx != null) {
            TikTokMediaModel tikTokMediaModel = c16cv.LLJJIJIL;
            if (tikTokMediaModel != null) {
                i = tikTokMediaModel.width;
                i2 = tikTokMediaModel.height;
            } else {
                i = 0;
                i2 = 0;
            }
            c16cx.setVideoSize(i, i2);
        }
        C16CV c16cv2 = this.LL;
        TikTokMediaModel tikTokMediaModel2 = c16cv2.LLJJIJIL;
        if (tikTokMediaModel2 != null) {
            strLJFF = tikTokMediaModel2.LJFF();
        } else {
            strLJFF = null;
        }
        C1322110kVd c1322110kVd = c16cv2.LLJJJ;
        if (c1322110kVd != null) {
            C786410Ut5.LLZZLLIL(c1322110kVd, 8);
        }
        ImageView imageView = c16cv2.LLJJJJ;
        if (imageView != null) {
            C786410Ut5.LJZI(8, imageView);
        }
        if (!C531320Ksc.LIZIZ(strLJFF, true)) {
            ImageView imageView2 = c16cv2.LLJJJJ;
            if (imageView2 != null) {
                C786410Ut5.LJZI(0, imageView2);
            }
        } else {
            C1322110kVd c1322110kVd2 = c16cv2.LLJJJ;
            if (c1322110kVd2 != null) {
                C786410Ut5.LLZZLLIL(c1322110kVd2, 0);
            }
            int screenWidth = ScreenUtils.getScreenWidth(c16cv2.mActivity);
            int screenHeight = ScreenUtils.getScreenHeight(c16cv2.mActivity);
            Bitmap.Config config = Bitmap.Config.RGB_565;
            C1322110kVd c1322110kVd3 = c16cv2.LLJJJ;
            if (c1322110kVd3 != null) {
                C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                Uri uriLJIILIIL = C2471909mP.LJIILIIL(strLJFF);
                TikTokMediaModel tikTokMediaModel3 = c16cv2.LLJJIJIL;
                if (tikTokMediaModel3 != null) {
                    str = tikTokMediaModel3.mimeType;
                } else {
                    str = null;
                }
                boolean zLJFF = Intrinsics.LJFF(str, "image/heic");
                C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uriLJIILIIL);
                ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
                c1325700kbQLIZLLL.LJFF = new C1329360khK(imageDecodeOptionsBuilder);
                InterfaceC20735516Cb interfaceC20735516Cb = c16cv2.LLJJIJIIJIL;
                if (interfaceC20735516Cb != null && (viewLIZJ = interfaceC20735516Cb.LIZJ()) != null) {
                    View viewFindViewById = viewLIZJ.findViewById(R.id.o5h);
                    if (viewFindViewById != null) {
                        c1324630kZh = new C1324630kZh(viewFindViewById.getWidth(), viewFindViewById.getHeight());
                    } else {
                        c1324630kZh = new C1324630kZh(viewLIZJ.getWidth(), viewLIZJ.getHeight());
                    }
                } else {
                    c1324630kZh = null;
                }
                c1325700kbQLIZLLL.LIZJ = c1324630kZh;
                if (zLJFF) {
                    c1325700kbQLIZLLL.LJIILJJIL = false;
                    c1325700kbQLIZLLL.LJIILLIIL = false;
                }
                c1320810kTXLIZJ.LJ = c1325700kbQLIZLLL.LIZ();
                C1325700kbQ c1325700kbQLIZLLL2 = C1325700kbQ.LIZLLL(uriLJIILIIL);
                ImageDecodeOptionsBuilder imageDecodeOptionsBuilder2 = new ImageDecodeOptionsBuilder();
                imageDecodeOptionsBuilder2.setBitmapConfig(config);
                c1325700kbQLIZLLL2.LJFF = new C1329360khK(imageDecodeOptionsBuilder2);
                if (screenWidth > 0 && screenHeight > 0) {
                    c1325700kbQLIZLLL2.LIZJ = new C1324630kZh(screenWidth, screenHeight);
                }
                c1320810kTXLIZJ.LIZLLL = c1325700kbQLIZLLL2.LIZ();
                C1322110kVd c1322110kVd4 = c16cv2.LLJJJ;
                if (c1322110kVd4 != null) {
                    controller = c1322110kVd4.getController();
                } else {
                    controller = null;
                }
                c1320810kTXLIZJ.LJIILJJIL = controller;
                c1322110kVd3.setController(c1320810kTXLIZJ.LIZ());
            }
        }
        InterfaceC20735516Cb interfaceC20735516Cb2 = this.LL.LLJJIJIIJIL;
        if (interfaceC20735516Cb2 != null && interfaceC20735516Cb2.LJJI()) {
            InterfaceC20735516Cb interfaceC20735516Cb3 = this.LL.LLJJIJIIJIL;
            if (interfaceC20735516Cb3 != null) {
                interfaceC20735516Cb3.LJII();
            }
            C16CV c16cv3 = this.LL;
            InterfaceC20735516Cb interfaceC20735516Cb4 = c16cv3.LLJJIJIIJIL;
            if (interfaceC20735516Cb4 != null && (viewLIZJ2 = interfaceC20735516Cb4.LIZJ()) != null) {
                C16CW c16cw = new C16CW() { // from class: X.16Cd
                    @Override // X.C16CW
                    public final View LIZ() {
                        return viewLIZJ2;
                    }
                };
                KeyEvent.Callback callback2 = c16cv3.LLJJJIL;
                if ((callback2 instanceof C16CX) && (c16cx2 = (C16CX) callback2) != null) {
                    Rect rectLIZIZ = c16cw.LIZIZ();
                    View viewLIZ = c16cw.LIZ();
                    if (viewLIZ != null && viewLIZ.isAttachedToWindow()) {
                        rect = new Rect();
                        viewLIZ.getGlobalVisibleRect(rect);
                    } else {
                        rect = null;
                    }
                    c16cx2.LIZ(rectLIZIZ, rect, new C417900Ga4(), C16CV.LLLLIILL());
                }
            }
        } else {
            this.LL.getClass();
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PreviewImageScene@55e6.showAnimateAsync$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
