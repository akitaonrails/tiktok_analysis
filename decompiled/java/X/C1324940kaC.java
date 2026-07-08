package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0kaC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1324940kaC {
    public static int LIZ;
    public static InterfaceC1322960kX0 sImpl;
    public static boolean sImplLoaded;

    public static InterfaceC1322960kX0 LIZ(AbstractC1301670jyf abstractC1301670jyf, InterfaceC1328030kfB interfaceC1328030kfB, C1329310khF<InterfaceC1324680kZm, AbstractC1327750kej> c1329310khF, C1325080kaQ<InterfaceC1324680kZm, Bitmap> c1325080kaQ) {
        if (!sImplLoaded) {
            try {
                sImpl = (InterfaceC1322960kX0) Class.forName("com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl").getConstructor(AbstractC1301670jyf.class, InterfaceC1328030kfB.class, C1329310khF.class, C1325080kaQ.class).newInstance(abstractC1301670jyf, interfaceC1328030kfB, c1329310khF, c1325080kaQ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (sImpl != null) {
                sImplLoaded = true;
            }
        }
        return sImpl;
    }
}
