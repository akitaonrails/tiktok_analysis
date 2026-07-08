package X;

import android.graphics.Bitmap;
import com.bytedance.mt.protector.impl.UriProtector;

/* JADX INFO: renamed from: X.0KyW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C534980KyW<T> implements InterfaceC1478005qU {
    public final /* synthetic */ String LIZ;

    public C534980KyW(String str) {
        this.LIZ = str;
    }

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ<Bitmap> c09aj) {
        C1C7U.LIZ("ImagePreloadUtil@6566.getLoadedImage$1");
        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(this.LIZ));
        c1325700kbQLIZLLL.LJIIJ = true;
        final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
        ((AbstractC1321260kUG) C1322200kVm.LIZ().LJI(c1325700kbQLIZLLL.LIZ(), null)).LIZJ(new C0HWE<C1323050kX9<AbstractC1327750kej>>() { // from class: X.0kbf
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
        C1C7U.LIZIZ("ImagePreloadUtil@6566.getLoadedImage$1");
    }
}
