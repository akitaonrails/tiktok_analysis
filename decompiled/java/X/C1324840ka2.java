package X;

import Y.ARunnableS3S1000000_6;
import Y.ARunnableS78S0200000_9;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.ss.android.ugc.aweme.api.ICommonLogger;
import com.ss.android.ugc.aweme.api.IDebugConfig;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0ka2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1324840ka2 {
    public static void LJIILIIL(String str) {
        IDebugConfig iDebugConfig = (IDebugConfig) PluggableExtentionKt.pluggableSpi(IDebugConfig.class);
        if (iDebugConfig != null && iDebugConfig.isOpen() && Looper.getMainLooper() == Looper.myLooper()) {
            ICommonLogger iCommonLoggerLIZ = C1110304Vx.LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(".   Any question please contact @weixin.gary");
            iCommonLoggerLIZ.LIZIZ(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)));
        }
    }

    public static String LJIILL(String str) {
        File file;
        LJIILIIL("getImageFilePath may cause ANR,use getImageFilePathAsync or you should call it in Non-UI Thread");
        if (str != null && !str.isEmpty()) {
            Uri uri = UriProtector.parse(str);
            if (LJIIZILJ(uri)) {
                InterfaceC1317730kOZ interfaceC1317730kOZLJIIJ = C1328130kfL.LJIILIIL().LJIILL().LJIIJ(C1324810kZz.LJI().LIZ(C1325710kbR.LIZ(uri), null));
                if (interfaceC1317730kOZLJIIJ != null && (file = ((C1335740krc) interfaceC1317730kOZLJIIJ).LIZ) != null) {
                    return file.getAbsolutePath();
                }
                return "";
            }
            return "";
        }
        return "";
    }

    public static String LJIILLIIL(UrlModel urlModel) {
        List<String> urlList;
        LJIILIIL("getImageUrl may cause ANR,use getImageUrlAsync or you should call it in Non-UI Thread");
        if (urlModel != null) {
            try {
                if (C786410Ut5.X3().equals("mounted") && (urlList = urlModel.getUrlList()) != null && !urlList.isEmpty()) {
                    int size = urlList.size();
                    for (int i = 0; i < size; i++) {
                        if (LJIIZILJ(UriProtector.parse((String) ListProtector.get(urlList, i)))) {
                            return (String) ListProtector.get(urlList, i);
                        }
                    }
                }
                return "";
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return "";
    }

    public static boolean LJIIZILJ(Uri uri) {
        LJIILIIL("isDownloaded may cause ANR,use isDownloadedAsync or you should call it in Non-UI Thread");
        if (uri == null) {
            return false;
        }
        return C1328130kfL.LJIILIIL().LJIILL().LJII(C1324810kZz.LJI().LIZ(C1325710kbR.LIZ(uri), null));
    }

    public static void LJIJJ(String str) {
        if (str != null && !str.isEmpty()) {
            ARunnableS3S1000000_6 aRunnableS3S1000000_6 = new ARunnableS3S1000000_6(str, 1);
            Uri uri = UriProtector.parse(str);
            C0NAX c0nax = new C0NAX(aRunnableS3S1000000_6);
            if (uri != null) {
                C823050WQl.LIZLLL().execute(new ARunnableS78S0200000_9(uri, c0nax, 99));
            }
        }
    }

    public static void LIZ(RemoteImageView remoteImageView, int i) {
        if (remoteImageView == null) {
            return;
        }
        remoteImageView.setImageURI(C1325700kbQ.LIZJ(i).LIZ().LIZIZ);
    }

    public static void LJFF(RemoteImageView remoteImageView, UrlModel urlModel) {
        LJI(remoteImageView, urlModel, -1, -1, null);
    }

    public static void LJIIIZ(RemoteImageView remoteImageView, String str) {
        LJIIJ(remoteImageView, str, -1, -1);
    }

    public static void LJIIL(RemoteImageView remoteImageView, C997540c48 c997540c48) {
        int iIntValue;
        int i = C997560c4A.LIZ[c997540c48.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    LJIIJ(remoteImageView, (String) c997540c48.LIZIZ, -1, -1);
                    return;
                }
                return;
            }
            LJFF(remoteImageView, (UrlModel) c997540c48.LIZIZ);
            return;
        }
        Object obj = c997540c48.LIZIZ;
        if (obj == null) {
            iIntValue = 0;
        } else {
            iIntValue = ((Integer) obj).intValue();
        }
        LIZ(remoteImageView, iIntValue);
    }

    public static void LJIJI(UrlModel urlModel, final InterfaceC1324870ka5 interfaceC1324870ka5) {
        final C1325710kbR[] c1325710kbRArrLJIILJJIL = LJIILJJIL(urlModel, null, EnumC1331380kka.MEDIUM, null, Bitmap.Config.RGB_565, false);
        final C1325540kbA c1325540kbALIZ = C1322200kVm.LIZ();
        C0HWE<C1323050kX9<AbstractC1327750kej>> c0hwe = new C0HWE<C1323050kX9<AbstractC1327750kej>>() { // from class: X.0ka3
            public int LIZ = 1;

            @Override // X.C0HWE
            public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                Throwable thLIZLLL = interfaceC1320200kSY.LIZLLL();
                C1325540kbA c1325540kbA = c1325540kbALIZ;
                C1325710kbR[] c1325710kbRArr = c1325710kbRArrLJIILJJIL;
                int i = this.LIZ;
                this.LIZ = i + 1;
                if (i >= c1325710kbRArr.length) {
                    interfaceC1324870ka5.onFailure(new RuntimeException(thLIZLLL));
                } else {
                    c1325540kbA.LJI(c1325710kbRArr[i], null).LIZJ(this, C822690WPb.LIZ());
                }
            }

            @Override // X.C0HWE
            public final void LJFF(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                interfaceC1324870ka5.onSuccess();
            }
        };
        if (c1325710kbRArrLJIILJJIL.length > 0) {
            c1325540kbALIZ.LJI(c1325710kbRArrLJIILJJIL[0], null).LIZJ(c0hwe, C822690WPb.LIZ());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZJ(ImageView imageView, String str, AbstractC1320320kSk abstractC1320320kSk) {
        Object obj;
        C1320770kTT c1320770kTT;
        InterfaceC1320850kTb interfaceC1320850kTb;
        if (imageView != null && str != null) {
            Object tag = imageView.getTag();
            if (!(tag instanceof C1324860ka4) || (obj = ((HashMap) tag).get("DraweeHolder")) == null) {
                obj = null;
            }
            if (obj instanceof C1320770kTT) {
                c1320770kTT = (C1320770kTT) obj;
            } else {
                c1320770kTT = null;
            }
            UrlModel urlModel = new UrlModel();
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            urlModel.setUrlList(arrayList);
            C1325710kbR[] c1325710kbRArrLJIILJJIL = LJIILJJIL(urlModel, null, EnumC1331380kka.MEDIUM, null, Bitmap.Config.RGB_565, false);
            if (c1320770kTT != null) {
                interfaceC1320850kTb = c1320770kTT.LLILZIL;
            } else {
                interfaceC1320850kTb = null;
            }
            C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
            c1320810kTXLIZJ.LJIILJJIL = interfaceC1320850kTb;
            c1320810kTXLIZJ.LIZLLL = c1325710kbRArrLJIILJJIL[0];
            AbstractC1320710kTN abstractC1320710kTNLIZ = c1320810kTXLIZJ.LIZ();
            if (c1320770kTT == null) {
                imageView.getContext();
                C1320770kTT c1320770kTT2 = new C1320770kTT(null);
                C1331090kk7 c1331090kk7 = new C1331090kk7(imageView.getResources());
                c1331090kk7.LJIIL = abstractC1320320kSk;
                c1320770kTT2.LJIIIZ(c1331090kk7.LIZ());
                c1320770kTT2.LJIIIIZZ(abstractC1320710kTNLIZ);
                ViewOnAttachStateChangeListenerC1324880ka6 viewOnAttachStateChangeListenerC1324880ka6 = new ViewOnAttachStateChangeListenerC1324880ka6(c1320770kTT2);
                if (imageView.isAttachedToWindow()) {
                    viewOnAttachStateChangeListenerC1324880ka6.onViewAttachedToWindow(imageView);
                }
                imageView.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1324880ka6);
                imageView.setOnTouchListener(viewOnAttachStateChangeListenerC1324880ka6);
                Object tag2 = imageView.getTag();
                if (tag2 instanceof C1324860ka4) {
                    ((HashMap) tag2).put("DraweeHolder", c1320770kTT2);
                } else {
                    imageView.setTag(new C1324860ka4(c1320770kTT2));
                }
                imageView.setImageDrawable(c1320770kTT2.LIZLLL());
                return;
            }
            c1320770kTT.LJI();
            C1331090kk7 c1331090kk72 = new C1331090kk7(imageView.getResources());
            c1331090kk72.LJIIL = InterfaceC1320380kSq.LIZJ;
            c1320770kTT.LJIIIZ(c1331090kk72.LIZ());
            c1320770kTT.LJIIIIZZ(abstractC1320710kTNLIZ);
            c1320770kTT.LJFF();
            imageView.setImageDrawable(c1320770kTT.LIZLLL());
        }
    }

    public static void LJIIIIZZ(RemoteImageView remoteImageView, UrlModel urlModel, InterfaceC1320650kTH<InterfaceC1330440kj4> interfaceC1320650kTH) {
        EnumC1331380kka enumC1331380kka = EnumC1331380kka.MEDIUM;
        if (remoteImageView != null && urlModel != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
            if (remoteImageView.getContext() != null) {
                C786410Ut5.N3(remoteImageView.getContext());
            }
            C1325710kbR[] c1325710kbRArrLJIILJJIL = LJIILJJIL(urlModel, null, enumC1331380kka, null, Bitmap.Config.RGB_565, false);
            if (c1325710kbRArrLJIILJJIL != null && c1325710kbRArrLJIILJJIL.length != 0) {
                C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                c1320810kTXLIZJ.LJIILJJIL = remoteImageView.getController();
                c1320810kTXLIZJ.LJFF(c1325710kbRArrLJIILJJIL, true);
                c1320810kTXLIZJ.LJIIIIZZ = new C1320640kTG(interfaceC1320650kTH);
                remoteImageView.setController(c1320810kTXLIZJ.LIZ());
            }
        }
    }

    public static void LJIIJ(RemoteImageView remoteImageView, String str, int i, int i2) {
        LJIIJJI(remoteImageView, str, i, i2, Bitmap.Config.ARGB_8888, null);
    }

    public static void LJIJ(UrlModel urlModel, int i, int i2, final InterfaceC447230HgH<Bitmap> interfaceC447230HgH) {
        C1324630kZh c1324630kZh;
        C1325540kbA c1325540kbALJIIL = C1328130kfL.LJIILIIL().LJIIL();
        if (i > 0 && i2 > 0) {
            c1324630kZh = new C1324630kZh(i, i2);
        } else {
            c1324630kZh = null;
        }
        C1325710kbR[] c1325710kbRArrLJIILJJIL = LJIILJJIL(urlModel, c1324630kZh, EnumC1331380kka.MEDIUM, null, Bitmap.Config.RGB_565, false);
        if (c1325710kbRArrLJIILJJIL.length == 0) {
            return;
        }
        final InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSYLJI = c1325540kbALJIIL.LJI(c1325710kbRArrLJIILJJIL[0], null);
        ((AbstractC1321260kUG) interfaceC1320200kSYLJI).LIZJ(new AbstractC447090Hg3() { // from class: X.0HgG
            @Override // X.C0HWE
            public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                if (interfaceC1320200kSY != null) {
                    interfaceC1320200kSY.close();
                }
                interfaceC447230HgH.accept(null);
            }

            @Override // X.AbstractC447090Hg3
            public final void LJI(Bitmap bitmap) {
                if (interfaceC1320200kSYLJI.LIZ() && bitmap != null) {
                    interfaceC447230HgH.accept(Bitmap.createBitmap(bitmap));
                    interfaceC1320200kSYLJI.close();
                    return;
                }
                interfaceC447230HgH.accept(null);
            }
        }, C822700WPc.LL);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [REQUEST, X.0kbR] */
    public static void LIZIZ(RemoteImageView remoteImageView, String str, int i, int i2, boolean z) {
        C1324630kZh c1324630kZh;
        if (remoteImageView == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            LIZ(remoteImageView, 2130971789);
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
        ?? LIZ = c1325700kbQLIZLLL.LIZ();
        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
        c1320810kTXLIZJ.LJIILJJIL = remoteImageView.getController();
        c1320810kTXLIZJ.LIZLLL = LIZ;
        c1320810kTXLIZJ.LJIIJJI = z;
        remoteImageView.setController(c1320810kTXLIZJ.LIZ());
    }

    public static void LJI(RemoteImageView remoteImageView, UrlModel urlModel, int i, int i2, InterfaceC1291910jiv interfaceC1291910jiv) {
        C1324630kZh c1324630kZh;
        if (i > 0 && i2 > 0) {
            c1324630kZh = new C1324630kZh(i, i2);
        } else {
            c1324630kZh = null;
        }
        LJII(remoteImageView, urlModel, c1324630kZh, interfaceC1291910jiv, null);
    }

    public static void LJII(RemoteImageView remoteImageView, UrlModel urlModel, C1324630kZh c1324630kZh, InterfaceC1291910jiv interfaceC1291910jiv, Object obj) {
        C1325710kbR[] c1325710kbRArrLJIILJJIL;
        if (remoteImageView != null && urlModel != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0 && (c1325710kbRArrLJIILJJIL = LJIILJJIL(urlModel, c1324630kZh, EnumC1331380kka.MEDIUM, interfaceC1291910jiv, Bitmap.Config.RGB_565, false)) != null && c1325710kbRArrLJIILJJIL.length != 0) {
            C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
            c1320810kTXLIZJ.LJIILJJIL = remoteImageView.getController();
            c1320810kTXLIZJ.LIZJ = obj;
            c1320810kTXLIZJ.LJFF(c1325710kbRArrLJIILJJIL, true);
            remoteImageView.setController(c1320810kTXLIZJ.LIZ());
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [REQUEST, X.0kbR] */
    public static void LJIIJJI(RemoteImageView remoteImageView, String str, int i, int i2, Bitmap.Config config, C1324890ka7 c1324890ka7) {
        C1324630kZh c1324630kZh;
        if (remoteImageView == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            LIZ(remoteImageView, 2130971789);
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
        ?? LIZ = c1325700kbQLIZLLL.LIZ();
        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
        c1320810kTXLIZJ.LJIILJJIL = remoteImageView.getController();
        c1320810kTXLIZJ.LIZJ = null;
        c1320810kTXLIZJ.LIZLLL = LIZ;
        if (c1324890ka7 != null) {
            c1320810kTXLIZJ.LJIIIIZZ = c1324890ka7;
        }
        remoteImageView.setController(c1320810kTXLIZJ.LIZ());
    }

    public static C1325710kbR[] LJIILJJIL(UrlModel urlModel, C1324630kZh c1324630kZh, EnumC1331380kka enumC1331380kka, InterfaceC1291910jiv interfaceC1291910jiv, Bitmap.Config config, boolean z) {
        if (urlModel != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
            ArrayList arrayList = new ArrayList();
            for (String str : urlModel.getUrlList()) {
                if (!C2093608Ic.LJ(str)) {
                    ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                    imageDecodeOptionsBuilder.setBitmapConfig(config);
                    imageDecodeOptionsBuilder.LIZIZ(1);
                    imageDecodeOptionsBuilder.LJ = false;
                    C1329360khK c1329360khK = new C1329360khK(imageDecodeOptionsBuilder);
                    C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str));
                    c1325700kbQLIZLLL.LJIIL = enumC1331380kka;
                    c1325700kbQLIZLLL.LJFF = c1329360khK;
                    if (interfaceC1291910jiv != null) {
                        c1325700kbQLIZLLL.LJIILIIL = interfaceC1291910jiv;
                    }
                    if (c1324630kZh != null) {
                        c1325700kbQLIZLLL.LIZJ = c1324630kZh;
                    }
                    if (z) {
                        HashMap map = new HashMap();
                        map.put("__NO_COOKIE", "1");
                        c1325700kbQLIZLLL.LJFF(map);
                    }
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

    /* JADX WARN: Type inference failed for: r2v1, types: [REQUEST, X.0kbR] */
    public static void LIZLLL(SmartImageView smartImageView, UrlModel urlModel, int i, int i2, Bitmap.Config config, Object obj, EnumC1325560kbC enumC1325560kbC, String str) {
        Uri uri;
        if (smartImageView == null) {
            return;
        }
        C1324630kZh c1324630kZh = null;
        if (i > 0 && i2 > 0) {
            c1324630kZh = new C1324630kZh(i, i2);
        }
        if (urlModel.getUrlList() != null && urlModel.getUrlList().size() > 0 && (uri = UriProtector.parse((String) ListProtector.get(urlModel.getUrlList(), 0))) != null) {
            C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uri);
            if (c1324630kZh != null) {
                c1325700kbQLIZLLL.LIZJ = c1324630kZh;
            }
            if (enumC1325560kbC != null) {
                c1325700kbQLIZLLL.LJI = enumC1325560kbC;
            }
            if (str != null) {
                c1325700kbQLIZLLL.LJIJI = str;
            }
            if (config != null) {
                ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                imageDecodeOptionsBuilder.setBitmapConfig(config);
                c1325700kbQLIZLLL.LJFF = new C1329360khK(imageDecodeOptionsBuilder);
            }
            ?? LIZ = c1325700kbQLIZLLL.LIZ();
            C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
            c1320810kTXLIZJ.LJIILJJIL = smartImageView.getController();
            c1320810kTXLIZJ.LIZJ = obj;
            c1320810kTXLIZJ.LIZLLL = LIZ;
            smartImageView.setController(c1320810kTXLIZJ.LIZ());
        }
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [REQUEST, X.0kbR] */
    public static void LJ(C1322110kVd c1322110kVd, UrlModel urlModel, int i, int i2, InterfaceC1291910jiv interfaceC1291910jiv, InterfaceC1320650kTH<InterfaceC1330440kj4> interfaceC1320650kTH, boolean z, UrlModel urlModel2, boolean z2) {
        C1324630kZh c1324630kZh;
        if (c1322110kVd != null && urlModel != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
            if (i > 0 && i2 > 0) {
                c1324630kZh = new C1324630kZh(i, i2);
            } else {
                c1324630kZh = null;
            }
            if (c1322110kVd.getContext() != null) {
                C786410Ut5.N3(c1322110kVd.getContext());
            }
            C1325710kbR[] c1325710kbRArrLJIILJJIL = LJIILJJIL(urlModel, c1324630kZh, EnumC1331380kka.MEDIUM, interfaceC1291910jiv, Bitmap.Config.RGB_565, z2);
            if (c1325710kbRArrLJIILJJIL != null && c1325710kbRArrLJIILJJIL.length != 0) {
                C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                c1320810kTXLIZJ.LJIILJJIL = c1322110kVd.getController();
                c1320810kTXLIZJ.LJFF(c1325710kbRArrLJIILJJIL, z);
                if (urlModel2 != null && urlModel2.getUrlList() != null && !urlModel2.getUrlList().isEmpty()) {
                    String str = (String) ListProtector.get(urlModel2.getUrlList(), 0);
                    if (!TextUtils.isEmpty(str)) {
                        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                        imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
                        imageDecodeOptionsBuilder.LJ = false;
                        C1329360khK c1329360khK = new C1329360khK(imageDecodeOptionsBuilder);
                        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str));
                        c1325700kbQLIZLLL.LJFF = c1329360khK;
                        c1325700kbQLIZLLL.LIZJ = c1324630kZh;
                        c1320810kTXLIZJ.LJ = c1325700kbQLIZLLL.LIZ();
                    }
                }
                c1320810kTXLIZJ.LJIIIIZZ = new C1320640kTG(interfaceC1320650kTH);
                c1322110kVd.setController(c1320810kTXLIZJ.LIZ());
            }
        }
    }
}
