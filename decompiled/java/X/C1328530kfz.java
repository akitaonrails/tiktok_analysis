package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0kfz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1328530kfz implements InterfaceC1330200kig {
    public final /* synthetic */ C1328520kfy LIZ;

    public C1328530kfz(C1328520kfy c1328520kfy) {
        this.LIZ = c1328520kfy;
    }

    @Override // X.InterfaceC1330200kig
    public final AbstractC1327750kej decode(C1328480kfu c1328480kfu, int i, InterfaceC529960KqQ interfaceC529960KqQ, C1329360khK c1329360khK) throws Throwable {
        String string;
        InterfaceC1330200kig interfaceC1330200kig;
        C1329360khK c1329360khKLIZIZ = C1328520kfy.LIZIZ(c1328480kfu, c1329360khK);
        c1328480kfu.LJIJJLI();
        C1330000kiM c1330000kiM = c1328480kfu.LLILLL;
        if (c1330000kiM == C1328580kg4.LIZ) {
            C1328520kfy c1328520kfy = this.LIZ;
            c1328520kfy.getClass();
            Rect rect = c1328480kfu.LLJILJILJ;
            if (rect == null || !c1329360khKLIZIZ.LJIIL) {
                rect = c1329360khKLIZIZ.LJIILIIL;
            }
            C1323050kX9<Bitmap> c1323050kX9DecodeJPEGFromEncodedImageWithColorSpace = c1328520kfy.LJ.decodeJPEGFromEncodedImageWithColorSpace(c1328480kfu, c1329360khKLIZIZ.LJII, rect, i, c1329360khKLIZIZ.LJI);
            try {
                c1328480kfu.LJIJJLI();
                int i2 = c1328480kfu.LLILZ;
                c1328480kfu.LJIJJLI();
                int i3 = c1328480kfu.LLILZIL;
                Rect rect2 = c1328480kfu.LLJILJILJ;
                int i4 = c1328480kfu.LLIZLLLIL;
                c1328480kfu.LJIJJLI();
                C1325120kaU c1325120kaU = new C1325120kaU(c1323050kX9DecodeJPEGFromEncodedImageWithColorSpace, interfaceC529960KqQ, i2, i3, rect, rect2, i4, c1328480kfu.LLILLL);
                c1323050kX9DecodeJPEGFromEncodedImageWithColorSpace.close();
                return c1325120kaU;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c1323050kX9DecodeJPEGFromEncodedImageWithColorSpace.close();
                throw th;
            }
        }
        if (c1330000kiM == C1328580kg4.LIZJ) {
            C1328520kfy c1328520kfy2 = this.LIZ;
            c1328520kfy2.getClass();
            if (!c1329360khKLIZIZ.LJFF && (interfaceC1330200kig = c1328520kfy2.LIZ) != null) {
                return interfaceC1330200kig.decode(c1328480kfu, i, interfaceC529960KqQ, c1329360khKLIZIZ);
            }
            return c1328520kfy2.LIZ(c1328480kfu, c1329360khKLIZIZ);
        }
        if (c1330000kiM == C1328580kg4.LJIIIZ) {
            return this.LIZ.LIZIZ.decode(c1328480kfu, i, interfaceC529960KqQ, c1329360khKLIZIZ);
        }
        if (c1330000kiM == C1328540kg0.LIZJ()) {
            return this.LIZ.LIZJ.decode(c1328480kfu, i, interfaceC529960KqQ, c1329360khK);
        }
        if (c1330000kiM == C1330000kiM.LIZJ) {
            try {
                byte[] bArr = new byte[22];
                C842030X1l.LIZIZ(c1328480kfu.LJII(), bArr, 22);
                StringBuilder sb = new StringBuilder(44);
                int i5 = 0;
                do {
                    String hexString = Integer.toHexString(bArr[i5] & 255);
                    if (hexString.length() < 2) {
                        sb.append('0');
                    }
                    sb.append(hexString.toLowerCase());
                    i5++;
                } while (i5 < 22);
                string = sb.toString();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                string = "unknow";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("unknown image format, errorHead: ");
            sbLIZ.append(string);
            throw new C1329280khC(C2188811AlT.LIZIZ(sbLIZ), c1328480kfu);
        }
        return this.LIZ.LIZ(c1328480kfu, c1329360khKLIZIZ);
    }
}
