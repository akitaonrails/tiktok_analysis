package X;

import Y.ARunnableS119S0100000_19;
import Y.ARunnableS12S1000000_20;
import Y.ARunnableS41S0300000_8;
import Y.ARunnableS53S0300000_20;
import Y.ARunnableS96S0000000_20;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0kax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1325410kax implements InterfaceC1325460kb2 {
    @Override // X.InterfaceC1325460kb2
    public final void LIZ() {
        LJIJ(new ARunnableS96S0000000_20(4));
    }

    @Override // X.InterfaceC1325460kb2
    public final void LJIILIIL() {
        LJIJ(new ARunnableS96S0000000_20(5));
    }

    public static void LJIILL(String str) {
        C1332160klq c1332160klqLJIIIZ = C1332160klq.LJIIIZ();
        if (c1332160klqLJIIIZ.LIZIZ.LJJIJIIJIL.LIZ() != null && ((Boolean) c1332160klqLJIIIZ.LIZIZ.LJJIJIIJIL.LIZ()).booleanValue() && Looper.getMainLooper() == Looper.myLooper()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(".   Any question please contact @weixin.gary");
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static C1325430kaz LJIILLIIL(C1325500kb6 c1325500kb6) {
        if (c1325500kb6 == null) {
            return null;
        }
        C1325430kaz c1325430kaz = new C1325430kaz();
        c1325430kaz.LIZIZ = c1325500kb6.LIZIZ;
        Iterator it2 = ((ArrayList) c1325500kb6.LIZ).iterator();
        while (it2.hasNext()) {
            ((ArrayList) c1325430kaz.LIZ).add(new C1325440kb0(((C1325510kb7) it2.next()).LIZIZ));
        }
        return c1325430kaz;
    }

    public static Bitmap LJIIZILJ(Uri uri) {
        C1323050kX9<AbstractC1327750kej> c1323050kX9;
        LJIILL("getCachedBitmapByUri may cause ANR,use getCachedBitmapByUriAsync or you should call it in Non-UI Thread");
        C1325710kbR c1325710kbRLIZ = C1325710kbR.LIZ(uri);
        if (c1325710kbRLIZ == null) {
            return null;
        }
        final Uri uri2 = UriProtector.parse(C1324810kZz.LJI().LIZJ(c1325710kbRLIZ, null).LIZ);
        final InterfaceC1324680kZm[] interfaceC1324680kZmArr = {null};
        InterfaceC1325100kaS<InterfaceC1324680kZm> interfaceC1325100kaS = new InterfaceC1325100kaS<InterfaceC1324680kZm>() { // from class: X.0kaw
            @Override // X.InterfaceC1325100kaS
            public final boolean apply(InterfaceC1324680kZm interfaceC1324680kZm) {
                InterfaceC1324680kZm interfaceC1324680kZm2 = interfaceC1324680kZm;
                if (interfaceC1324680kZm2.LIZIZ(uri2)) {
                    interfaceC1324680kZmArr[0] = interfaceC1324680kZm2;
                }
                return interfaceC1324680kZm2.LIZIZ(uri2);
            }
        };
        Class<?> cls = C1322200kVm.LIZ;
        C1328130kfL.LJIILIIL().LJII().LIZLLL(interfaceC1325100kaS);
        if (interfaceC1324680kZmArr[0] == null || (c1323050kX9 = C1328130kfL.LJIILIIL().LJII().get(interfaceC1324680kZmArr[0])) == null) {
            return null;
        }
        return ((AbstractC1325130kaV) c1323050kX9.get()).getUnderlyingBitmap();
    }

    public static void LJIJ(Runnable runnable) {
        C823050WQl.LIZLLL().execute(runnable);
    }

    @Override // X.InterfaceC1325460kb2
    public final Bitmap LIZIZ(C03IT c03it) {
        LJIILL("getCachedBitmapByModel may cause ANR,use getCachedBitmapByModelAsync or you should call it in Non-UI Thread");
        if (c03it != null && !c03it.LIZ()) {
            Iterator it2 = ((ArrayList) c03it.LIZ).iterator();
            while (it2.hasNext()) {
                Bitmap bitmapLJIIZILJ = LJIIZILJ(UriProtector.parse((String) it2.next()));
                if (bitmapLJIIZILJ != null) {
                    return bitmapLJIIZILJ;
                }
            }
        }
        return null;
    }

    @Override // X.InterfaceC1325460kb2
    public final File LIZLLL(Uri uri) {
        File file;
        C1333180knU c1333180knULJIIIZ;
        LJIILL("getCachedFile may cause ANR,use getCachedFileAsync or you should call it in Non-UI Thread");
        C592490NLr c592490NLrLIZ = C1324810kZz.LJI().LIZ(C1325710kbR.LIZ(uri), null);
        Class<?> cls = C1322200kVm.LIZ;
        InterfaceC1317730kOZ interfaceC1317730kOZLJIIJ = C1328130kfL.LJIILIIL().LJIILL().LJIIJ(c592490NLrLIZ);
        if (interfaceC1317730kOZLJIIJ == null && (interfaceC1317730kOZLJIIJ = C1328130kfL.LJIILIIL().LJIJJ().LJIIJ(c592490NLrLIZ)) == null && (c1333180knULJIIIZ = C1328130kfL.LJIILIIL().LJIIIZ()) != null) {
            Iterator it2 = c1333180knULJIIIZ.entrySet().iterator();
            while (it2.hasNext() && (interfaceC1317730kOZLJIIJ = ((InterfaceC1326920kdO) ((Map.Entry) it2.next()).getValue()).LJIIJ(c592490NLrLIZ)) == null) {
            }
        }
        if (!(interfaceC1317730kOZLJIIJ instanceof C1335740krc) || (file = ((C1335740krc) interfaceC1317730kOZLJIIJ).LIZ) == null || !file.exists()) {
            return null;
        }
        return file;
    }

    @Override // X.InterfaceC1325460kb2
    public final Bitmap LJ(Uri uri) {
        LJIILL("getCachedBitmap may cause ANR,use getCachedBitmapAsync or you should call it in Non-UI Thread");
        Class<?> cls = C1322200kVm.LIZ;
        C1323050kX9<AbstractC1327750kej> c1323050kX9 = C1328130kfL.LJIILIIL().LJII().get(new C1324660kZk(uri.toString(), null, C1324670kZl.LIZJ, C1329360khK.LJIIZILJ, null, null, null));
        if (c1323050kX9 == null) {
            return null;
        }
        return ((AbstractC1325130kaV) c1323050kX9.get()).getUnderlyingBitmap();
    }

    @Override // X.InterfaceC1325460kb2
    public final void LJFF(Uri uri) {
        LJIJ(new ARunnableS119S0100000_19(uri, 127));
    }

    @Override // X.InterfaceC1325460kb2
    public final C1325430kaz LJII(String str) {
        InterfaceC1326920kdO interfaceC1326920kdO;
        LJIILL("getCustomCacheDumpInfo may cause ANR,use getCustomCacheDumpInfoAsync or you should call it in Non-UI Thread");
        Class<?> cls = C1322200kVm.LIZ;
        C1333180knU c1333180knULJIIIZ = C1328130kfL.LJIILIIL().LJIIIZ();
        if (c1333180knULJIIIZ != null && (interfaceC1326920kdO = (InterfaceC1326920kdO) c1333180knULJIIIZ.get(str)) != null) {
            try {
                return LJIILLIIL(interfaceC1326920kdO.LIZ());
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    @Override // X.InterfaceC1325460kb2
    public final boolean LJIIIZ(Uri uri) {
        LJIILL("hasCachedFile may cause ANR,use hasCachedFileAsync or you should call it in Non-UI Thread");
        C592490NLr c592490NLrLIZ = C1324810kZz.LJI().LIZ(C1325710kbR.LIZ(uri), null);
        if (!C1328130kfL.LJIILIIL().LJIILL().LJII(c592490NLrLIZ) && !C1328130kfL.LJIILIIL().LJIJJ().LJII(c592490NLrLIZ)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1325460kb2
    public final Bitmap LJIIJJI(ImageUrlModel imageUrlModel) {
        LJIILL("getCachedBitmapByObject may cause ANR,use getCachedBitmapByObjectAsync or you should call it in Non-UI Thread");
        return LIZIZ(C1331660kl2.LIZLLL().LJI().LIZ().LIZ(imageUrlModel, new C1331670kl3(imageUrlModel)));
    }

    @Override // X.InterfaceC1325460kb2
    public final void LJIILJJIL(String str) {
        LJIJ(new ARunnableS12S1000000_20(str, 2));
    }

    @Override // X.InterfaceC1325460kb2
    public final void LIZJ(Uri uri, C0H9P c0h9p) {
        LJIJ(new ARunnableS53S0300000_20(this, uri, c0h9p, 23));
    }

    @Override // X.InterfaceC1325460kb2
    public final void LJI(Bitmap bitmap, Uri uri) {
        LJIJ(new ARunnableS41S0300000_8(this, uri, bitmap, 5));
    }

    @Override // X.InterfaceC1325460kb2
    public final void LJIIIIZZ(Uri uri, InterfaceC442640HXi<File> interfaceC442640HXi) {
        LJIJ(new ARunnableS53S0300000_20(this, uri, interfaceC442640HXi, 24));
    }

    @Override // X.InterfaceC1325460kb2
    public final void LJIIJ(C03IT c03it, C0H9O c0h9o) {
        LJIJ(new ARunnableS53S0300000_20(this, c03it, c0h9o, 21));
    }

    @Override // X.InterfaceC1325460kb2
    public final void LJIIL(Uri uri, InterfaceC442640HXi<Boolean> interfaceC442640HXi) {
        LJIJ(new ARunnableS53S0300000_20(this, uri, interfaceC442640HXi, 22));
    }
}
