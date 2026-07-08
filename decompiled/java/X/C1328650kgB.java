package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0kgB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1328650kgB implements InterfaceC1330200kig {
    @Override // X.InterfaceC1330200kig
    public final AbstractC1327750kej decode(C1328480kfu c1328480kfu, int i, InterfaceC529960KqQ interfaceC529960KqQ, C1329360khK c1329360khK) {
        C1323050kX9<Bitmap> c1323050kX9DecodeFromEncodedImageWithColorSpace = ((AbstractC1328490kfv) C1328130kfL.LJIILIIL().LJIIZILJ()).decodeFromEncodedImageWithColorSpace(c1328480kfu, c1329360khK.LJII, null, c1329360khK.LJI);
        try {
            C1328060kfE c1328060kfE = C1328060kfE.LIZLLL;
            c1328480kfu.LJIJJLI();
            int i2 = c1328480kfu.LLILZ;
            c1328480kfu.LJIJJLI();
            C1325120kaU c1325120kaU = new C1325120kaU(c1323050kX9DecodeFromEncodedImageWithColorSpace, c1328060kfE, i2, c1328480kfu.LLILZIL);
            c1323050kX9DecodeFromEncodedImageWithColorSpace.close();
            return c1325120kaU;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1323050kX9DecodeFromEncodedImageWithColorSpace.close();
            throw th;
        }
    }
}
