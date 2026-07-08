package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Process;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.lynx.animax.loader.AnimaXLoaderRequest;
import com.lynx.animax.util.AnimaXLog;

/* JADX INFO: renamed from: X.0jfH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1289650jfH {
    public static boolean LIZ(InterfaceC1285790jZ3 interfaceC1285790jZ3, InterfaceC1285780jZ2 interfaceC1285780jZ2) {
        Uri uri;
        boolean zIs64Bit;
        AnimaXLoaderRequest animaXLoaderRequest = (AnimaXLoaderRequest) interfaceC1285790jZ3;
        C1288960jeA c1288960jeALIZ = animaXLoaderRequest.LIZ();
        if (c1288960jeALIZ == null) {
            return false;
        }
        String strLIZIZ = animaXLoaderRequest.LIZIZ();
        if (strLIZIZ == null) {
            uri = null;
        } else {
            uri = UriProtector.parse(strLIZIZ);
        }
        int iIntValue = ((Integer) c1288960jeALIZ.LIZ).intValue();
        int iIntValue2 = ((Integer) c1288960jeALIZ.LIZIZ).intValue();
        final C1288550jdV c1288550jdV = new C1288550jdV(interfaceC1285780jZ2);
        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uri);
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.ARGB_8888);
        imageDecodeOptionsBuilder.LJFF = true;
        c1325700kbQLIZLLL.LJFF = new C1329360khK(imageDecodeOptionsBuilder);
        c1325700kbQLIZLLL.LJIIL = EnumC1331380kka.HIGH;
        String str = C1285850jZ9.LIZ;
        if (iIntValue >= 32 && iIntValue2 >= 32) {
            if (!C1285850jZ9.LIZLLL) {
                try {
                    zIs64Bit = Process.is64Bit();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    zIs64Bit = true;
                }
                C1285850jZ9.LJ = !zIs64Bit;
                C1285850jZ9.LIZLLL = true;
            }
            if (C1285850jZ9.LJ || C1285850jZ9.LJI) {
                c1325700kbQLIZLLL.LIZJ = new C1324630kZh(iIntValue / 2, iIntValue2 / 2);
            }
        }
        final InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSYLJI = C1322200kVm.LIZ().LJI(c1325700kbQLIZLLL.LIZ(), "FrescoUtil");
        ((AbstractC1321260kUG) interfaceC1320200kSYLJI).LIZJ(new AbstractC1290140jg4() { // from class: X.0jfF
            @Override // X.C0HWE
            public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                String strLIZIZ2 = "Fresco failed to load bitmap.";
                if (interfaceC1320200kSY.LIZLLL() != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Fresco failed to load bitmap.");
                    sbLIZ.append("reason: ");
                    sbLIZ.append(interfaceC1320200kSY.LIZLLL().getMessage());
                    strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                }
                ((C1288550jdV) c1288550jdV).LIZ(null, strLIZIZ2);
                interfaceC1320200kSY.close();
            }

            @Override // X.AbstractC1290140jg4
            public final void LJI(final C1323050kX9<Bitmap> c1323050kX9) {
                Bitmap bitmap;
                boolean z;
                if (c1323050kX9 != null && (bitmap = c1323050kX9.get()) != null) {
                    if (bitmap.getWidth() * bitmap.getHeight() * 4 == bitmap.getByteCount()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        ((C1288550jdV) c1288550jdV).LIZ(new InterfaceC1288580jdY(c1323050kX9) { // from class: X.0jfG
                            public final C1323050kX9<Bitmap> LIZ;

                            @Override // X.InterfaceC1288580jdY
                            public final void close() {
                                this.LIZ.close();
                            }

                            @Override // X.InterfaceC1288580jdY
                            public final Bitmap get() {
                                if (this.LIZ.LJIILLIIL()) {
                                    return this.LIZ.get();
                                }
                                return null;
                            }

                            @Override // X.InterfaceC1288580jdY
                            public final boolean isValid() {
                                return this.LIZ.LJIILLIIL();
                            }

                            {
                                this.LIZ = c1323050kX9.clone();
                            }
                        }, "");
                    } else {
                        AnimaXLog.LIZIZ("FrescoUtil", "Fresco returned a bitmap with an invalid format. Attempting to convert it to ARGB_8888.");
                        Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, false);
                        if (bitmapCopy != null && bitmapCopy.getWidth() * bitmapCopy.getHeight() * 4 == bitmapCopy.getByteCount()) {
                            ((C1288550jdV) c1288550jdV).LIZ(new C1288540jdU(bitmapCopy), "");
                        } else {
                            ((C1288550jdV) c1288550jdV).LIZ(null, "Fresco returned unknown bitmap format which cannot be converted to RGBA8888.");
                        }
                    }
                } else {
                    ((C1288550jdV) c1288550jdV).LIZ(null, "Fresco returned a null bitmap on success.");
                }
                interfaceC1320200kSYLJI.close();
            }
        }, C822700WPc.LL);
        return true;
    }
}
