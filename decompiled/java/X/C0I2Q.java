package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: renamed from: X.0I2Q, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I2Q {
    public static final C0I2Q LIZ = new C0I2Q();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe  */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0I2S] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(android.graphics.Bitmap r15, X.InterfaceC1364105Vn<? super java.lang.String> r16) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0I2Q.LIZIZ(android.graphics.Bitmap, X.05Vn):java.lang.Object");
    }

    public static Object LIZ(Context context, Uri uri, InterfaceC1364105Vn interfaceC1364105Vn) {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        if (uri == null) {
            C189200o6.m2constructorimpl(null);
            c2252611DEt.resumeWith(null);
        } else {
            InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSYLJI = C1322200kVm.LIZ().LJI(C1325700kbQ.LIZLLL(uri).LIZ(), context);
            ((AbstractC1321260kUG) interfaceC1320200kSYLJI).LIZJ(new C0HWE<C1323050kX9<AbstractC1327750kej>>() { // from class: X.0He0
                @Override // X.C0HWE
                public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                    Throwable runtimeException;
                    InterfaceC20236714Gf<Bitmap> interfaceC20236714Gf = c2252611DEt;
                    if (interfaceC1320200kSY == null || (runtimeException = interfaceC1320200kSY.LIZLLL()) == null) {
                        runtimeException = new RuntimeException("Unknown Fresco failure");
                    }
                    C098200Yq c098200Yq = new C098200Yq(runtimeException);
                    C189200o6.m2constructorimpl(c098200Yq);
                    interfaceC20236714Gf.resumeWith(c098200Yq);
                }

                @Override // X.C0HWE
                public final void LJFF(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                    AbstractC1327750kej abstractC1327750kej;
                    if (interfaceC1320200kSY != null && interfaceC1320200kSY.LIZ()) {
                        C1323050kX9<AbstractC1327750kej> result = interfaceC1320200kSY.getResult();
                        Bitmap bitmapCopy = null;
                        if (result != null) {
                            abstractC1327750kej = result.get();
                        } else {
                            abstractC1327750kej = null;
                        }
                        if (abstractC1327750kej instanceof AbstractC1325130kaV) {
                            Bitmap underlyingBitmap = ((AbstractC1325130kaV) abstractC1327750kej).getUnderlyingBitmap();
                            if (underlyingBitmap != null) {
                                Bitmap.Config config = underlyingBitmap.getConfig();
                                if (config == null) {
                                    config = Bitmap.Config.ARGB_8888;
                                }
                                bitmapCopy = underlyingBitmap.copy(config, false);
                            }
                            InterfaceC20236714Gf<Bitmap> interfaceC20236714Gf = c2252611DEt;
                            C189200o6.m2constructorimpl(bitmapCopy);
                            interfaceC20236714Gf.resumeWith(bitmapCopy);
                        } else {
                            InterfaceC20236714Gf<Bitmap> interfaceC20236714Gf2 = c2252611DEt;
                            C189200o6.m2constructorimpl(null);
                            interfaceC20236714Gf2.resumeWith(null);
                        }
                        if (result != null) {
                            result.close();
                        }
                    }
                }
            }, C822700WPc.LL);
            c2252611DEt.LJJII(new AwS585S0100000_6(interfaceC1320200kSYLJI, (InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>>) 280));
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }
}
