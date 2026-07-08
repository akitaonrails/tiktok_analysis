package X;

import Y.AfS41S1100000_3;
import Y.AkS0S0020001_3;
import Y.AkS8S0010000_3;
import Y.AkS9S0010000_7;
import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestPreloadApplyImageSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0aQl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C934690aQl {
    public static final C934690aQl LIZ = new C934690aQl();
    public static final HashMap<String, Bitmap> LIZIZ = new HashMap<>();
    public static final String LIZJ = "lottie_";

    public final synchronized void LIZIZ() {
        LIZIZ.clear();
    }

    public static String LIZLLL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZJ);
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final synchronized boolean LIZJ(String str) {
        boolean z;
        Bitmap bitmap;
        HashMap<String, Bitmap> map = LIZIZ;
        z = false;
        if (map.containsKey(LIZLLL(str)) && (bitmap = map.get(LIZLLL(str))) != null) {
            if (!bitmap.isRecycled()) {
                z = true;
            }
        }
        return z;
    }

    public static Bitmap LIZ(String str, boolean z) {
        if (z) {
            Bitmap bitmap = LIZIZ.get(LIZLLL(str));
            if (bitmap != null) {
                return bitmap.copy(Bitmap.Config.ARGB_8888, false);
            }
            return null;
        }
        return LIZIZ.get(LIZLLL(str));
    }

    public static void LJ(String str, Bitmap bitmap) {
        C934690aQl c934690aQl = LIZ;
        synchronized (c934690aQl) {
            if (c934690aQl.LIZJ(str)) {
                return;
            }
            LIZIZ.put(LIZLLL(str), bitmap);
        }
    }

    public static void LJFF(ImageModel imageModel, String str, float f, boolean z, boolean z2, Function2 function2) {
        C11NZ c11nzLJJJ;
        List urls;
        final String str2 = null;
        if (LIZ.LIZJ(str)) {
            function2.invoke(Boolean.TRUE, null);
            return;
        }
        MultiGuestPreloadApplyImageSetting multiGuestPreloadApplyImageSetting = MultiGuestPreloadApplyImageSetting.INSTANCE;
        if (multiGuestPreloadApplyImageSetting.isEnable()) {
            if (imageModel != null && (urls = imageModel.getUrls()) != null) {
                str2 = (String) C930540aK4.LJIJ(0, urls);
            }
            C19484211Ku c19484211KuLJJLI = C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0kbc
                @Override // X.InterfaceC1478005qU
                public final void subscribe(C09AJ<Bitmap> c09aj) {
                    C1C7U.LIZ("ImagePreloadUtil@6566.getPreloadedImage$1");
                    C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str2));
                    c1325700kbQLIZLLL.LJIIJ = true;
                    C1325710kbR c1325710kbRLIZ = c1325700kbQLIZLLL.LIZ();
                    C1325540kbA c1325540kbALIZ = C1322200kVm.LIZ();
                    c1325540kbALIZ.getClass();
                    final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
                    ((AbstractC1321260kUG) c1325540kbALIZ.LJII(c1325710kbRLIZ, null, EnumC1320950kTl.BITMAP_MEMORY_CACHE, null)).LIZJ(new C0HWE<C1323050kX9<AbstractC1327750kej>>() { // from class: X.0kbe
                        @Override // X.C0HWE
                        public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                            C20441214yg.LJFF("ImagePreloadUtil", "cached image load failed,", interfaceC1320200kSY.LIZLLL());
                            Throwable thLIZLLL = interfaceC1320200kSY.LIZLLL();
                            if (thLIZLLL != null) {
                                c19482611Ke.onError(thLIZLLL);
                            }
                        }

                        @Override // X.C0HWE
                        public final void LJFF(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                            Bitmap underlyingBitmap;
                            if (!interfaceC1320200kSY.LIZ()) {
                                C20441214yg.LIZIZ("ImagePreloadUtil", "cached image load failed");
                                c19482611Ke.onError(new Throwable("dataSource.isFinished false"));
                                return;
                            }
                            C1323050kX9<AbstractC1327750kej> result = interfaceC1320200kSY.getResult();
                            if (result != null) {
                                try {
                                    AbstractC1327750kej abstractC1327750kej = result.get();
                                    if ((abstractC1327750kej instanceof AbstractC1325130kaV) && (underlyingBitmap = ((AbstractC1325130kaV) abstractC1327750kej).getUnderlyingBitmap()) != null) {
                                        C20441214yg.LIZIZ("ImagePreloadUtil", "cached image load succ");
                                        c19482611Ke.onNext(Bitmap.createBitmap(underlyingBitmap));
                                    }
                                } finally {
                                    try {
                                    } catch (Throwable th) {
                                    }
                                }
                                C1323050kX9.LJII(result);
                                c19482611Ke.onComplete();
                                C20441214yg.LIZIZ("ImagePreloadUtil", "cached image load complete");
                                return;
                            }
                            C20441214yg.LIZIZ("ImagePreloadUtil", "cached image load failed, imageReference null");
                            c19482611Ke.onError(new Throwable("imageReference null"));
                        }
                    }, C822700WPc.LL);
                    C1C7U.LIZIZ("ImagePreloadUtil@6566.getPreloadedImage$1");
                }
            }).LJJLI(C1121670fIL.LJ(imageModel));
            if (multiGuestPreloadApplyImageSetting.isEnable()) {
                c19484211KuLJJLI.LJIILIIL(new C0UO0());
            }
            c11nzLJJJ = c19484211KuLJJLI.LJJJ(new AkS9S0010000_7(z2, 0), false);
        } else {
            c11nzLJJJ = C1121670fIL.LJ(imageModel).LJJJ(new AkS0S0020001_3(f, z2, false, 0), false).LJJJ(new AkS8S0010000_3(true, 0), false).LJJJ(new AkS9S0010000_7(z, 1), false);
        }
        c11nzLJJJ.LJJLL(new AfS41S1100000_3(function2, str, 5), new C516201zk(function2, 189));
    }
}
