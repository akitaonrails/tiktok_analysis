package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: X.0kfy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1328520kfy implements InterfaceC1330200kig {
    public static boolean LJII = true;
    public final InterfaceC1330200kig LIZ;
    public final InterfaceC1330200kig LIZIZ;
    public final InterfaceC1330200kig LIZJ;
    public final InterfaceC1330200kig LIZLLL;
    public final InterfaceC1328910kgb LJ;
    public final C1328530kfz LJFF = new C1328530kfz(this);
    public final Map<C1330000kiM, InterfaceC1330200kig> LJI;

    public static String LIZJ(C1328480kfu c1328480kfu) throws Throwable {
        InputStream inputStreamLJII = c1328480kfu.LJII();
        byte[] bArr = new byte[64];
        try {
            try {
                inputStreamLJII.read(bArr);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                try {
                    C1323080kXC.LIZ(inputStreamLJII);
                    throw th;
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw th;
                }
            }
        } catch (IOException e2) {
            TryCatchGuardChecker.doCheck(e2);
            Object[] objArr = new Object[0];
            if (C1328570kg3.LIZ.LIZIZ(5)) {
                C1328570kg3.LIZ.w("DefaultImageDecoder", C786410Ut5.k4(null, "read encode Image 64 byte", objArr), e2);
            }
        }
        try {
            C1323080kXC.LIZ(inputStreamLJII);
        } catch (IOException e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        StringBuilder sb = new StringBuilder("ImageFormat:");
        c1328480kfu.LJIJJLI();
        sb.append(c1328480kfu.LLILLL.LIZIZ);
        sb.append(":");
        sb.append(Arrays.toString(bArr));
        return sb.toString();
    }

    public static C1329360khK LIZIZ(C1328480kfu c1328480kfu, C1329360khK c1329360khK) throws Throwable {
        Bitmap.Config configLIZ;
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder.LIZ(c1329360khK);
        String str = c1328480kfu.LLJJJJLIIL;
        int i = c1328480kfu.LLJJL;
        int i2 = c1328480kfu.LLJJLIIIJLLLLLLLZ;
        c1328480kfu.LJIJJLI();
        int i3 = c1328480kfu.LLILZLL;
        c1328480kfu.LJIJJLI();
        int i4 = c1328480kfu.LLIZ;
        boolean z = c1328480kfu.LLJIJIL;
        c1328480kfu.LJIJJLI();
        C1330000kiM c1330000kiM = c1328480kfu.LLILLL;
        if (c1329360khK.LJIIJJI) {
            configLIZ = c1329360khK.LJII;
        } else {
            configLIZ = AbstractC1326410kcZ.LIZJ.LIZ(str, i, i2, i3, i4, z, c1330000kiM);
        }
        imageDecodeOptionsBuilder.setBitmapConfig(configLIZ);
        return new C1329360khK(imageDecodeOptionsBuilder);
    }

    public final C1325120kaU LIZ(C1328480kfu c1328480kfu, C1329360khK c1329360khK) {
        Rect rect = c1328480kfu.LLJILJILJ;
        if (rect == null || !c1329360khK.LJIIL) {
            rect = c1329360khK.LJIILIIL;
        }
        C1323050kX9<Bitmap> c1323050kX9DecodeFromEncodedImageWithColorSpace = this.LJ.decodeFromEncodedImageWithColorSpace(c1328480kfu, c1329360khK.LJII, rect, c1329360khK.LJI);
        try {
            C1328060kfE c1328060kfE = C1328060kfE.LIZLLL;
            c1328480kfu.LJIJJLI();
            int i = c1328480kfu.LLILZ;
            c1328480kfu.LJIJJLI();
            int i2 = c1328480kfu.LLILZIL;
            Rect rect2 = c1328480kfu.LLJILJILJ;
            int i3 = c1328480kfu.LLIZLLLIL;
            c1328480kfu.LJIJJLI();
            C1325120kaU c1325120kaU = new C1325120kaU(c1323050kX9DecodeFromEncodedImageWithColorSpace, c1328060kfE, i, i2, rect, rect2, i3, c1328480kfu.LLILLL);
            c1323050kX9DecodeFromEncodedImageWithColorSpace.close();
            return c1325120kaU;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1323050kX9DecodeFromEncodedImageWithColorSpace.close();
            throw th;
        }
    }

    @Override // X.InterfaceC1330200kig
    public final AbstractC1327750kej decode(C1328480kfu c1328480kfu, int i, InterfaceC529960KqQ interfaceC529960KqQ, C1329360khK c1329360khK) throws Throwable {
        InterfaceC1330200kig interfaceC1330200kig;
        InterfaceC1330200kig interfaceC1330200kig2 = c1329360khK.LJIIIZ;
        if (interfaceC1330200kig2 != null) {
            return interfaceC1330200kig2.decode(c1328480kfu, i, interfaceC529960KqQ, c1329360khK);
        }
        c1328480kfu.LJIJJLI();
        C1330000kiM c1330000kiMLIZIZ = c1328480kfu.LLILLL;
        if (c1330000kiMLIZIZ == null || c1330000kiMLIZIZ == C1330000kiM.LIZJ) {
            c1330000kiMLIZIZ = C1328620kg8.LIZIZ(c1328480kfu.LJII());
            c1328480kfu.LLILLL = c1330000kiMLIZIZ;
        }
        Map<C1330000kiM, InterfaceC1330200kig> map = this.LJI;
        if (map != null && (interfaceC1330200kig = map.get(c1330000kiMLIZIZ)) != null) {
            if (LJII) {
                return interfaceC1330200kig.decode(c1328480kfu, i, interfaceC529960KqQ, LIZIZ(c1328480kfu, c1329360khK));
            }
            return interfaceC1330200kig.decode(c1328480kfu, i, interfaceC529960KqQ, c1329360khK);
        }
        return this.LJFF.decode(c1328480kfu, i, interfaceC529960KqQ, c1329360khK);
    }

    public C1328520kfy(InterfaceC1330200kig interfaceC1330200kig, InterfaceC1330200kig interfaceC1330200kig2, InterfaceC1330200kig interfaceC1330200kig3, InterfaceC1330200kig interfaceC1330200kig4, InterfaceC1328910kgb interfaceC1328910kgb, Map<C1330000kiM, InterfaceC1330200kig> map) {
        this.LIZ = interfaceC1330200kig;
        this.LIZIZ = interfaceC1330200kig2;
        this.LIZJ = interfaceC1330200kig3;
        this.LIZLLL = interfaceC1330200kig4;
        this.LJ = interfaceC1328910kgb;
        this.LJI = map;
    }
}
