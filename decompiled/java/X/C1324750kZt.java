package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0kZt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1324750kZt {
    public static void LJIILL(C1325700kbQ c1325700kbQ) {
        if (C2281551ESb.LIZIZ.LJIJJ()) {
            c1325700kbQ.LJI = EnumC1325560kbC.CUSTOM;
            c1325700kbQ.LJIJI = "tools_default";
        }
    }

    public static boolean LJIIZILJ(Uri uri) {
        if (uri == null) {
            return false;
        }
        return C1328130kfL.LJIILIIL().LJIILL().LJII(C1324810kZz.LJI().LIZ(C1325710kbR.LIZ(uri), null));
    }

    public static void LJIJI(String str) {
        if (str == null || str.isEmpty() || LJIIZILJ(UriProtector.parse(str))) {
            return;
        }
        C1328130kfL.LJIILIIL().LJIIL().LJIJ(C1325710kbR.LIZIZ(str), null);
    }

    public static void LJIJJ(String str) {
        if (!str.isEmpty()) {
            final C1325710kbR c1325710kbRLIZ = C1322540kWK.LIZ(UriProtector.parse(str), null);
            if (c1325710kbRLIZ != null) {
                C1324810kZz c1324810kZzLJI = C1324810kZz.LJI();
                c1324810kZzLJI.getClass();
                if (C1328130kfL.LJIILIIL().LJIILL().LJII(c1324810kZzLJI.LJ(c1325710kbRLIZ.LIZIZ))) {
                    return;
                }
            }
            if (!C1324730kZr.LIZ.add(C1324730kZr.LIZ(c1325710kbRLIZ))) {
                return;
            }
            C1328130kfL.LJIILIIL().LJIIL().LJIIZILJ(c1325710kbRLIZ, null).LIZJ(new C0HWE<Void>() { // from class: X.0kZs
                @Override // X.C0HWE
                public final void LJ(InterfaceC1320200kSY<Void> interfaceC1320200kSY) {
                    C1324730kZr.LIZIZ(c1325710kbRLIZ);
                }

                @Override // X.C0HWE
                public final void LJFF(InterfaceC1320200kSY<Void> interfaceC1320200kSY) {
                    C1324730kZr.LIZIZ(c1325710kbRLIZ);
                }
            }, C822690WPb.LIZ());
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [REQUEST, X.0kbR] */
    /* JADX WARN: Type inference failed for: r0v3, types: [REQUEST, X.0kbR] */
    public static void LIZ(RemoteImageView remoteImageView, Uri uri) {
        if (remoteImageView != null && uri != null) {
            ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
            imageDecodeOptionsBuilder.LJFF = true;
            C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uri);
            c1325700kbQLIZLLL.LJFF = new C1329360khK(imageDecodeOptionsBuilder);
            C1325700kbQ c1325700kbQLIZLLL2 = C1325700kbQ.LIZLLL(uri);
            C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
            c1320810kTXLIZJ.LJIILJJIL = remoteImageView.getController();
            c1320810kTXLIZJ.LJ = c1325700kbQLIZLLL.LIZ();
            c1320810kTXLIZJ.LIZLLL = c1325700kbQLIZLLL2.LIZ();
            c1320810kTXLIZJ.LJIIJJI = true;
            remoteImageView.setController(c1320810kTXLIZJ.LIZ());
        }
    }

    public static void LIZIZ(C1322110kVd c1322110kVd, int i) {
        if (c1322110kVd == null) {
            return;
        }
        c1322110kVd.setImageURI(C1325700kbQ.LIZJ(i).LIZ().LIZIZ);
    }

    public static void LJFF(C1322110kVd c1322110kVd, UrlModel urlModel) {
        LJI(c1322110kVd, urlModel, -1, -1);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [REQUEST, X.0kbR] */
    public static void LIZJ(C1322110kVd c1322110kVd, String str, int i, int i2) {
        C1324630kZh c1324630kZh;
        if (c1322110kVd != null && !TextUtils.isEmpty(str)) {
            if (i > 0 && i2 > 0) {
                c1324630kZh = new C1324630kZh(i, i2);
            } else {
                c1324630kZh = null;
            }
            C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str));
            if (c1324630kZh != null) {
                c1325700kbQLIZLLL.LIZJ = c1324630kZh;
            }
            ?? LIZ = c1325700kbQLIZLLL.LIZ();
            C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
            c1320810kTXLIZJ.LJIILJJIL = c1322110kVd.getController();
            c1320810kTXLIZJ.LIZLLL = LIZ;
            c1320810kTXLIZJ.LJIIJJI = true;
            c1322110kVd.setController(c1320810kTXLIZJ.LIZ());
        }
    }

    public static void LIZLLL(C1322110kVd c1322110kVd, Uri uri, int i, int i2) {
        LJ(c1322110kVd, uri, i, i2, null, Bitmap.Config.RGB_565, null, null);
    }

    public static void LJI(C1322110kVd c1322110kVd, UrlModel urlModel, int i, int i2) {
        C1324630kZh c1324630kZh;
        if (i > 0 && i2 > 0) {
            c1324630kZh = new C1324630kZh(i, i2);
        } else {
            c1324630kZh = null;
        }
        LJIIIIZZ(c1322110kVd, urlModel, c1324630kZh, null);
    }

    public static void LJIIIIZZ(C1322110kVd c1322110kVd, UrlModel urlModel, C1324630kZh c1324630kZh, C1320700kTM c1320700kTM) {
        C1325710kbR[] c1325710kbRArrLJIILLIIL;
        if (c1322110kVd != null && urlModel != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0 && (c1325710kbRArrLJIILLIIL = LJIILLIIL(urlModel, c1324630kZh, EnumC1331380kka.MEDIUM, Bitmap.Config.RGB_565)) != null && c1325710kbRArrLJIILLIIL.length != 0) {
            C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
            c1320810kTXLIZJ.LJIILJJIL = c1322110kVd.getController();
            c1320810kTXLIZJ.LJFF(c1325710kbRArrLJIILLIIL, true);
            if (c1320700kTM != null) {
                c1320810kTXLIZJ.LJIIIIZZ = c1320700kTM;
            }
            c1322110kVd.setController(c1320810kTXLIZJ.LIZ());
        }
    }

    public static void LJIIIZ(C1322110kVd c1322110kVd, String str, int i, int i2) {
        LJIIJ(c1322110kVd, str, i, i2, Bitmap.Config.ARGB_8888);
    }

    public static C1325710kbR[] LJIILLIIL(UrlModel urlModel, C1324630kZh c1324630kZh, EnumC1331380kka enumC1331380kka, Bitmap.Config config) {
        if (urlModel != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
            ArrayList arrayList = new ArrayList();
            for (String str : urlModel.getUrlList()) {
                if (!TextUtils.isEmpty(str)) {
                    ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                    imageDecodeOptionsBuilder.setBitmapConfig(config);
                    imageDecodeOptionsBuilder.LIZIZ(1);
                    imageDecodeOptionsBuilder.LJ = false;
                    C1329360khK c1329360khK = new C1329360khK(imageDecodeOptionsBuilder);
                    C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str));
                    c1325700kbQLIZLLL.LJIIL = enumC1331380kka;
                    c1325700kbQLIZLLL.LJFF = c1329360khK;
                    if (c1324630kZh != null) {
                        c1325700kbQLIZLLL.LIZJ = c1324630kZh;
                    }
                    LJIILL(c1325700kbQLIZLLL);
                    arrayList.add(c1325700kbQLIZLLL.LIZ());
                }
            }
            if (arrayList.size() == 0) {
                return new C1325710kbR[0];
            }
            return (C1325710kbR[]) arrayList.toArray(new C1325710kbR[arrayList.size()]);
        }
        return new C1325710kbR[0];
    }

    public static void LJIJ(UrlModel urlModel, int i, int i2, final C092O<Bitmap> c092o) {
        C1324630kZh c1324630kZh;
        C1325540kbA c1325540kbALJIIL = C1328130kfL.LJIILIIL().LJIIL();
        if (i > 0 && i2 > 0) {
            c1324630kZh = new C1324630kZh(i, i2);
        } else {
            c1324630kZh = null;
        }
        C1325710kbR[] c1325710kbRArrLJIILLIIL = LJIILLIIL(urlModel, c1324630kZh, EnumC1331380kka.MEDIUM, Bitmap.Config.RGB_565);
        if (c1325710kbRArrLJIILLIIL.length == 0) {
            return;
        }
        final InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSYLJI = c1325540kbALJIIL.LJI(c1325710kbRArrLJIILLIIL[0], null);
        ((AbstractC1321260kUG) interfaceC1320200kSYLJI).LIZJ(new AbstractC447090Hg3() { // from class: X.0kZu
            @Override // X.C0HWE
            public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                if (interfaceC1320200kSY != null) {
                    interfaceC1320200kSY.close();
                }
                c092o.accept(null);
            }

            @Override // X.AbstractC447090Hg3
            public final void LJI(Bitmap bitmap) {
                if (interfaceC1320200kSYLJI.LIZ() && bitmap != null) {
                    c092o.accept(Bitmap.createBitmap(bitmap));
                    interfaceC1320200kSYLJI.close();
                    return;
                }
                c092o.accept(null);
            }
        }, C822700WPc.LL);
    }

    public static void LJII(C1322110kVd c1322110kVd, UrlModel urlModel, Bitmap.Config config, boolean z, InterfaceC1320650kTH<InterfaceC1330440kj4> interfaceC1320650kTH) {
        C1325710kbR[] c1325710kbRArrLJIILLIIL;
        if (c1322110kVd != null && urlModel != null && c1322110kVd.getContext() != null && (c1325710kbRArrLJIILLIIL = LJIILLIIL(urlModel, null, EnumC1331380kka.MEDIUM, config)) != null && c1325710kbRArrLJIILLIIL.length > 0) {
            c1322110kVd.getContext();
            C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
            c1320810kTXLIZJ.LJIILJJIL = c1322110kVd.getController();
            c1320810kTXLIZJ.LJFF(c1325710kbRArrLJIILLIIL, true);
            c1320810kTXLIZJ.LJIIJJI = z;
            c1320810kTXLIZJ.LJIIIIZZ = new C1320670kTJ(null, interfaceC1320650kTH);
            c1322110kVd.setController(c1320810kTXLIZJ.LIZ());
        }
    }

    public static void LJIIJ(C1322110kVd c1322110kVd, String str, int i, int i2, Bitmap.Config config) {
        LJIIJJI(c1322110kVd, str, i, i2, config, null, null, null);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [REQUEST, X.0kbR] */
    public static void LJ(C1322110kVd c1322110kVd, Uri uri, int i, int i2, AbstractC1291220jho abstractC1291220jho, Bitmap.Config config, C1320700kTM c1320700kTM, InterfaceC1325670kbN interfaceC1325670kbN) {
        if (c1322110kVd != null && uri != null) {
            C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uri);
            if (i > 0 && i2 > 0) {
                c1325700kbQLIZLLL.LIZJ = new C1324630kZh(i, i2);
            }
            if (config != null) {
                ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                imageDecodeOptionsBuilder.setBitmapConfig(config);
                c1325700kbQLIZLLL.LJFF = new C1329360khK(imageDecodeOptionsBuilder);
            }
            if (abstractC1291220jho != null) {
                c1325700kbQLIZLLL.LJIILIIL = abstractC1291220jho;
            }
            if (interfaceC1325670kbN != null) {
                c1325700kbQLIZLLL.LJIIZILJ = interfaceC1325670kbN;
            }
            LJIILL(c1325700kbQLIZLLL);
            ?? LIZ = c1325700kbQLIZLLL.LIZ();
            C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
            c1320810kTXLIZJ.LJIILJJIL = c1322110kVd.getController();
            c1320810kTXLIZJ.LIZLLL = LIZ;
            if (c1320700kTM != null) {
                c1320810kTXLIZJ.LJIIIIZZ = c1320700kTM;
            }
            c1322110kVd.setController(c1320810kTXLIZJ.LIZ());
        }
    }

    public static void LJIIJJI(C1322110kVd c1322110kVd, String str, int i, int i2, Bitmap.Config config, InterfaceC1325670kbN interfaceC1325670kbN, C1320700kTM c1320700kTM, Object obj) {
        LJIIL(c1322110kVd, str, i, i2, config, null, interfaceC1325670kbN, c1320700kTM, obj);
    }

    public static void LJIILJJIL(C1324800kZy c1324800kZy, List list, int i, int i2, Bitmap.Config config, InterfaceC1325670kbN interfaceC1325670kbN, C1320700kTM c1320700kTM, Object obj) {
        LJIILIIL(c1324800kZy, list, i, i2, config, null, interfaceC1325670kbN, c1320700kTM, obj);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [REQUEST, X.0kbR] */
    public static void LJIIL(C1322110kVd c1322110kVd, String str, int i, int i2, Bitmap.Config config, AbstractC1291220jho abstractC1291220jho, InterfaceC1325670kbN interfaceC1325670kbN, C1320700kTM c1320700kTM, Object obj) {
        C1324630kZh c1324630kZh;
        if (c1322110kVd == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            LIZIZ(c1322110kVd, R.drawable.dhr);
            return;
        }
        if (i > 0 && i2 > 0) {
            c1324630kZh = new C1324630kZh(i, i2);
        } else {
            c1324630kZh = null;
        }
        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str));
        if (c1324630kZh != null) {
            c1325700kbQLIZLLL.LIZJ = c1324630kZh;
        }
        if (config != null) {
            ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
            imageDecodeOptionsBuilder.setBitmapConfig(config);
            c1325700kbQLIZLLL.LJFF = new C1329360khK(imageDecodeOptionsBuilder);
        }
        if (abstractC1291220jho != null) {
            c1325700kbQLIZLLL.LJIILIIL = abstractC1291220jho;
        }
        if (interfaceC1325670kbN != null) {
            c1325700kbQLIZLLL.LJIIZILJ = interfaceC1325670kbN;
        }
        LJIILL(c1325700kbQLIZLLL);
        ?? LIZ = c1325700kbQLIZLLL.LIZ();
        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
        c1320810kTXLIZJ.LJIILJJIL = c1322110kVd.getController();
        c1320810kTXLIZJ.LJIIIIZZ = c1320700kTM;
        c1320810kTXLIZJ.LIZJ = obj;
        c1320810kTXLIZJ.LIZLLL = LIZ;
        c1322110kVd.setController(c1320810kTXLIZJ.LIZ());
    }

    public static void LJIILIIL(C1322110kVd c1322110kVd, List list, int i, int i2, Bitmap.Config config, AbstractC1291220jho abstractC1291220jho, InterfaceC1325670kbN interfaceC1325670kbN, C1320700kTM c1320700kTM, Object obj) {
        C1324630kZh c1324630kZh;
        if (c1322110kVd == null) {
            return;
        }
        if (list != null && !list.isEmpty()) {
            if (i > 0 && i2 > 0) {
                c1324630kZh = new C1324630kZh(i, i2);
            } else {
                c1324630kZh = null;
            }
            C1325710kbR[] c1325710kbRArr = new C1325710kbR[list.size()];
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse((String) it2.next()));
                if (c1324630kZh != null) {
                    c1325700kbQLIZLLL.LIZJ = c1324630kZh;
                }
                if (config != null) {
                    ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                    imageDecodeOptionsBuilder.setBitmapConfig(config);
                    c1325700kbQLIZLLL.LJFF = new C1329360khK(imageDecodeOptionsBuilder);
                }
                if (abstractC1291220jho != null) {
                    c1325700kbQLIZLLL.LJIILIIL = abstractC1291220jho;
                }
                if (interfaceC1325670kbN != null) {
                    c1325700kbQLIZLLL.LJIIZILJ = interfaceC1325670kbN;
                }
                LJIILL(c1325700kbQLIZLLL);
                arrayList.add(c1325700kbQLIZLLL.LIZ());
            }
            Object[] array = arrayList.toArray(c1325710kbRArr);
            C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
            c1320810kTXLIZJ.LJIILJJIL = c1322110kVd.getController();
            c1320810kTXLIZJ.LJIIIIZZ = c1320700kTM;
            c1320810kTXLIZJ.LIZJ = obj;
            c1320810kTXLIZJ.LJIIJJI = true;
            c1320810kTXLIZJ.LJFF(array, true);
            c1322110kVd.setController(c1320810kTXLIZJ.LIZ());
            return;
        }
        LIZIZ(c1322110kVd, R.drawable.dhr);
    }
}
