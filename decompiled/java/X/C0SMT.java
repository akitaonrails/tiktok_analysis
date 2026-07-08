package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizOptExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.MultiImageUrlInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.model.ImagePreviewModel;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0SMT, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SMT {
    public static final C0SMT LIZ = new C0SMT();
    public static final ConcurrentHashMap<String, Set<Integer>> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Integer> LIZJ = new ConcurrentHashMap<>();

    public static boolean LJ() {
        return ((Number) C04RS.LIZ.getValue()).intValue() == 1 && Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper());
    }

    public static void LIZJ(final String str, final Aweme aweme, final int i, final Function2 function2, final boolean z) {
        UrlModel urlModel;
        Bitmap.Config config;
        if (LJ()) {
            C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0SMd
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PreloadCommon@c2b6.preloadToBitmapByIndex$1");
                    try {
                        C0SMT c0smt = C0SMT.LIZ;
                        String str2 = str;
                        Aweme aweme2 = aweme;
                        int i2 = i;
                        Function2<Bitmap, Throwable, Unit> function22 = function2;
                        boolean z2 = z;
                        c0smt.getClass();
                        C0SMT.LIZJ(str2, aweme2, i2, function22, z2);
                    } finally {
                        try {
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                    }
                    C1C7U.LIZIZ("PreloadCommon@c2b6.preloadToBitmapByIndex$1");
                }
            });
            return;
        }
        PhotoModeImage photoModeImageLJIILIIL = C720360SNm.LJIILIIL(aweme, i, false);
        if (photoModeImageLJIILIIL != null && (urlModel = photoModeImageLJIILIIL.urlModel) != null) {
            if (!C720360SNm.LJI(aweme) && !AwemeExtKt.isAdTraffic(aweme)) {
                if (AwemeBizOptExtKt.getAwemeCacheType(aweme) == 1) {
                    config = Bitmap.Config.RGB_565;
                } else {
                    config = (Bitmap.Config) C2176121AEo.LIZ(urlModel).getFirst();
                }
            } else {
                config = Bitmap.Config.ARGB_8888;
            }
            if (C0SNG.LIZ().enable && C0SNG.LIZ().fypPreloadPriority && !AwemeExtKt.isAdTraffic(aweme)) {
                C720400SNq c720400SNq = C720400SNq.LIZ;
                String str2 = (String) C13LP.LJJJLL(urlModel.getUrlList());
                if (str2 == null) {
                    return;
                }
                c720400SNq.getClass();
                C720400SNq.LIZIZ(str2);
            }
            C738980Sym c738980Sym = new C738980Sym(function2, 0);
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(urlModel.getUrlList()));
            c1331670kl3LJIIJ.LJIL = config;
            c1331670kl3LJIIJ.LIZLLL("photomode-preload");
            c1331670kl3LJIIJ.LJJIII = EnumC1334360kpO.HIGH;
            C01GW c01gw = C04WC.LIZ;
            if (((Number) c01gw.getValue()).intValue() == 1 || ((Number) c01gw.getValue()).intValue() == 3) {
                c1331670kl3LJIIJ.LJJLIIIJJIZ = true;
            }
            if (C1335190kqj.LIZIZ() && (AwemeBizOptExtKt.getAwemeCacheType(aweme) == 1 || C256700yz.LIZ(str))) {
                c1331670kl3LJIIJ.LJJIIZ = EnumC714850S2h.CUSTOM;
                c1331670kl3LJIIJ.LJJJJJ = "photomode_image_cache_v2";
            }
            if (z) {
                c1331670kl3LJIIJ.LJJIIJ(c738980Sym);
            } else {
                c1331670kl3LJIIJ.LJJII(c738980Sym);
            }
        }
    }

    public static void LIZLLL(final int i, final int i2, final long j, final String str, final Throwable th) {
        C20684815ws.LJFF().execute(new Runnable() { // from class: X.01Su
            public final void LIZ() {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZJ(i, "success");
                c2344009Gk.LIZJ(i2, "index");
                c2344009Gk.LJIIIIZZ("preload_url", str);
                c2344009Gk.LIZLLL(j, "duration");
                Throwable th2 = th;
                c2344009Gk.LJIIIIZZ("error_msg", th2 != null ? th2.getMessage() : null);
                C20684815ws.LJIILLIIL("photo_mode_preload_status", c2344009Gk.LIZ);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PreloadCommon@c2b6.reportPreloadStatus$runnable$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PreloadCommon@c2b6.reportPreloadStatus$runnable$1");
            }
        });
    }

    public static void LIZ(final String str, final Context context, final Aweme aweme, final int i, final EnumC1334360kpO enumC1334360kpO, final Function1 function1, final Function2 function2, final boolean z, final boolean z2) {
        final PhotoModeImageUrlModel photoModeImageUrlModel;
        String data;
        String data2;
        UrlModel urlModel;
        String str2;
        UrlModel urlModel2;
        List<String> urlList;
        final String str3;
        float fFloatValue;
        UrlModel urlModel3;
        ImagePreviewModel previewModel;
        UrlModel urlModel4;
        ImagePreviewModel previewModel2;
        String data3;
        ImagePreviewModel previewModel3;
        ImagePreviewModel previewModel4;
        List<String> urlList2;
        ImagePreviewModel previewModel5;
        ImagePreviewModel previewModel6;
        List<PhotoModeImageUrlModel> imageList;
        List<MultiImageUrlInfo> list;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList2;
        PhotoModeImageUrlModel photoModeImageUrlModel2;
        List<PhotoModeImageUrlModel> imageList3;
        PhotoModeImageUrlModel photoModeImageUrlModel3;
        if (LJ()) {
            C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0SMX
                public final void LIZ() {
                    try {
                        C0SMT c0smt = C0SMT.LIZ;
                        String str4 = str;
                        Context context2 = context;
                        Aweme aweme2 = aweme;
                        int i2 = i;
                        EnumC1334360kpO enumC1334360kpO2 = enumC1334360kpO;
                        Function1<InterfaceC469401sC, Unit> function12 = function1;
                        Function2<File, Throwable, Unit> function22 = function2;
                        boolean z3 = z;
                        boolean z4 = z2;
                        c0smt.getClass();
                        C0SMT.LIZ(str4, context2, aweme2, i2, enumC1334360kpO2, function12, function22, z3, z4);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1AF0.LJFF(th, "preload_async_dispatch");
                        Function2<File, Throwable, Unit> function23 = function2;
                        if (function23 != null) {
                            function23.invoke(null, th);
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PreloadCommon@c2b6.preloadByIndex$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PreloadCommon@c2b6.preloadByIndex$1");
                }
            });
            return;
        }
        if (C2280911EPp.LIZ()) {
            C0ST8.LIZLLL(aweme, EnumC720100SMm.PRELOAD, i);
        }
        String data4 = null;
        if (C281370B1b.LIZ()) {
            PhotoModeImageInfo photoModeImageInfo2 = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo2 != null && (imageList3 = photoModeImageInfo2.getImageList()) != null && (photoModeImageUrlModel3 = (PhotoModeImageUrlModel) C13LP.LJJJLL(imageList3)) != null) {
                list = photoModeImageUrlModel3.bitrateImages;
            } else {
                list = null;
            }
            if (C866950Xzh.LIZIZ(list) && ((photoModeImageInfo = aweme.getPhotoModeImageInfo()) == null || (imageList2 = photoModeImageInfo.getImageList()) == null || (photoModeImageUrlModel2 = (PhotoModeImageUrlModel) C13LP.LJJJLL(imageList2)) == null || photoModeImageUrlModel2.targetMultiRateImageUrl == null)) {
                C0ST8.LIZIZ(aweme);
            }
        }
        PhotoModeImageInfo photoModeImageInfo3 = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo3 != null && (imageList = photoModeImageInfo3.getImageList()) != null) {
            photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(i, imageList);
        } else {
            photoModeImageUrlModel = null;
        }
        C2344809Gs.LIZLLL(4, "PhotoModeBitrate", "aweme photo at init single true");
        PhotoModeImage photoModeImageLJIILIIL = C720360SNm.LJIILIIL(aweme, i, true);
        if (photoModeImageLJIILIIL != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start preload photo ");
            sbLIZ.append(i);
            sbLIZ.append(", blur: ");
            UrlModel urlModel5 = photoModeImageLJIILIIL.urlModel;
            if (urlModel5 != null && (previewModel6 = urlModel5.getPreviewModel()) != null) {
                data = previewModel6.getData();
            } else {
                data = null;
            }
            sbLIZ.append(data);
            C2344809Gs.LIZLLL(3, "BasePreloadHelper", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("start preload photo ");
            sbLIZ2.append(i);
            sbLIZ2.append(", blurhash: ");
            UrlModel urlModel6 = photoModeImageLJIILIIL.urlModel;
            if (urlModel6 != null && (previewModel5 = urlModel6.getPreviewModel()) != null) {
                data2 = previewModel5.getData();
            } else {
                data2 = null;
            }
            sbLIZ2.append(data2);
            C2188811AlT.LIZIZ(sbLIZ2);
            boolean zLJIIIZ = C0SQQ.LIZ.LJIIIZ(i, aweme, null);
            if (zLJIIIZ) {
                urlModel = photoModeImageLJIILIIL.translatedUrlModel;
            } else {
                urlModel = photoModeImageLJIILIIL.urlModel;
            }
            String str4 = "";
            if (urlModel == null || (urlList2 = urlModel.getUrlList()) == null || (str2 = (String) C13LP.LJJJLL(urlList2)) == null) {
                str2 = "";
            }
            if (!z2) {
                if (photoModeImageUrlModel == null || (urlModel3 = photoModeImageUrlModel.displayImageNoWatermark) == null || (previewModel = urlModel3.getPreviewModel()) == null || Integer.valueOf(previewModel.getPreviewType()) == null || ((urlModel4 = photoModeImageUrlModel.displayImageNoWatermark) != null && (previewModel4 = urlModel4.getPreviewModel()) != null && previewModel4.getPreviewType() == 0)) {
                    WeakReference<InterfaceC1336190ksL> weakReferenceLIZ = C720190SMv.LIZ(UriProtector.parse(str2));
                    if (weakReferenceLIZ == null || weakReferenceLIZ.get() == null) {
                        Uri uri = UriProtector.parse(str2);
                        WeakReference weakReference = new WeakReference(new InterfaceC1336190ksL() { // from class: X.0SN5
                            @Override // X.InterfaceC1336190ksL
                            public final void LIZIZ(String str5, C1318160kPG c1318160kPG) {
                                PhotoModeImageUrlModel photoModeImageUrlModel4 = photoModeImageUrlModel;
                                if (photoModeImageUrlModel4 != null) {
                                    if (str5 == null) {
                                        str5 = "";
                                    }
                                    photoModeImageUrlModel4.setBlurHashCode(str5);
                                }
                            }
                        });
                        synchronized (C720190SMv.class) {
                            if (uri != null) {
                                ((HashMap) C720190SMv.LIZ).put(uri.toString(), weakReference);
                            }
                        }
                    }
                } else {
                    UrlModel urlModel7 = photoModeImageUrlModel.displayImageNoWatermark;
                    if (urlModel7 != null && (previewModel3 = urlModel7.getPreviewModel()) != null) {
                        data4 = previewModel3.getData();
                    }
                    if (C123100dR.LIZ(data4)) {
                        UrlModel urlModel8 = photoModeImageUrlModel.displayImageNoWatermark;
                        if (urlModel8 != null && (previewModel2 = urlModel8.getPreviewModel()) != null && (data3 = previewModel2.getData()) != null) {
                            str4 = data3;
                        }
                        photoModeImageUrlModel.setBlurHashCode(str4);
                    }
                }
            }
            C0SMT c0smt = LIZ;
            C721640SSk.LIZ.getClass();
            boolean zLJIILLIIL = C721640SSk.LJIILLIIL(aweme);
            boolean zLJIILL = C721640SSk.LJIILL(aweme);
            c0smt.getClass();
            if (zLJIIIZ) {
                urlModel2 = photoModeImageLJIILIIL.translatedUrlModel;
            } else {
                urlModel2 = photoModeImageLJIILIIL.urlModel;
            }
            if (urlModel2 != null && (urlList = urlModel2.getUrlList()) != null && (str3 = (String) C13LP.LJJJLL(urlList)) != null) {
                if (z2 && C0SNG.LIZ().enable && C0SNG.LIZ().coldBootPriority && !AwemeExtKt.isAdTraffic(aweme)) {
                    C720400SNq.LIZ.getClass();
                    C720400SNq.LIZIZ(str3);
                }
                if (str != null && u.LJIJI(str, "homepage_hot", true) && C0SNG.LIZ().enable && C0SNG.LIZ().fypPreloadPriority && !AwemeExtKt.isAdTraffic(aweme)) {
                    C720400SNq.LIZ.getClass();
                    C720400SNq.LIZIZ(str3);
                }
                if (!z2) {
                    C720190SMv.LIZIZ = zLJIILL;
                }
                C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(urlModel2.getUrlList()));
                if (!z2) {
                    c1331670kl3LJIIJ.LJII = zLJIILLIIL;
                    c1331670kl3LJIIJ.LJI = zLJIILLIIL;
                    float f = 20;
                    Float f2 = photoModeImageLJIILIIL.aspectRatio;
                    if (f2 != null) {
                        fFloatValue = f2.floatValue();
                    } else {
                        fFloatValue = 1.0f;
                    }
                    c1331670kl3LJIIJ.LJJJLIIL = 20;
                    c1331670kl3LJIIJ.LJJJLL = (int) (f / fFloatValue);
                }
                c1331670kl3LJIIJ.LJJIIJZLJL = C823050WQl.LIZLLL();
                c1331670kl3LJIIJ.LJJIJL(context);
                c1331670kl3LJIIJ.LJJIII = enumC1334360kpO;
                C01GW c01gw = C04WC.LIZ;
                if (((Number) c01gw.getValue()).intValue() == 1 || ((Number) c01gw.getValue()).intValue() == 3) {
                    c1331670kl3LJIIJ.LJJLIIIJJIZ = true;
                }
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                InterfaceC605070NoH interfaceC605070NoH = new InterfaceC605070NoH() { // from class: X.0SMu
                    @Override // X.InterfaceC605070NoH
                    public final void onCanceled() {
                        Function2<File, Throwable, Unit> function22 = function2;
                        if (function22 != null) {
                            function22.invoke(null, null);
                        }
                        if (!z2) {
                            C720190SMv.LIZIZ(UriProtector.parse(str3));
                        }
                        C2344809Gs.LIZLLL(3, "BasePreloadHelper", "download cancel");
                        C0SMT c0smt2 = C0SMT.LIZ;
                        String str5 = str3;
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        int i2 = i;
                        c0smt2.getClass();
                        C0SMT.LIZLLL(2, i2, jElapsedRealtime2, str5, null);
                    }

                    @Override // X.InterfaceC605070NoH
                    public final void LIZ(File file) {
                        Function2<File, Throwable, Unit> function22 = function2;
                        if (function22 != null) {
                            function22.invoke(file, null);
                        }
                        if (!z2) {
                            C720190SMv.LIZIZ(UriProtector.parse(str3));
                        }
                        C2344809Gs.LIZLLL(3, "BasePreloadHelper", "download success");
                        C0SMT c0smt2 = C0SMT.LIZ;
                        String str5 = str3;
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        int i2 = i;
                        c0smt2.getClass();
                        C0SMT.LIZLLL(1, i2, jElapsedRealtime2, str5, null);
                    }

                    @Override // X.InterfaceC605070NoH
                    public final void onFailed(Throwable th) {
                        Function2<File, Throwable, Unit> function22 = function2;
                        if (function22 != null) {
                            function22.invoke(null, th);
                        }
                        C720190SMv.LIZIZ(UriProtector.parse(str3));
                        C2344809Gs.LIZLLL(3, "BasePreloadHelper", "download fail");
                        C0SMT c0smt2 = C0SMT.LIZ;
                        String str5 = str3;
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        int i2 = i;
                        c0smt2.getClass();
                        C0SMT.LIZLLL(0, i2, jElapsedRealtime2, str5, th);
                    }
                };
                InterfaceC1331910klR interfaceC1331910klR = new InterfaceC1331910klR() { // from class: X.0SMt
                    @Override // X.InterfaceC1331910klR
                    public final void onProgress(float f3) {
                    }

                    @Override // X.InterfaceC1331910klR
                    public final void onCanceled() {
                        if (!z2) {
                            C720190SMv.LIZIZ(UriProtector.parse(str3));
                        }
                        C0SMT c0smt2 = C0SMT.LIZ;
                        String str5 = str3;
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        int i2 = i;
                        c0smt2.getClass();
                        C0SMT.LIZLLL(2, i2, jElapsedRealtime2, str5, null);
                    }

                    @Override // X.InterfaceC1331910klR
                    public final void LIZ(Bitmap bitmap) {
                        if (!z2) {
                            C720190SMv.LIZIZ(UriProtector.parse(str3));
                        }
                        C0SMT c0smt2 = C0SMT.LIZ;
                        String str5 = str3;
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        int i2 = i;
                        c0smt2.getClass();
                        C0SMT.LIZLLL(1, i2, jElapsedRealtime2, str5, null);
                    }

                    @Override // X.InterfaceC1331910klR
                    public final void onFailed(Throwable th) {
                        C720190SMv.LIZIZ(UriProtector.parse(str3));
                        C0SMT c0smt2 = C0SMT.LIZ;
                        String str5 = str3;
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        int i2 = i;
                        c0smt2.getClass();
                        C0SMT.LIZLLL(0, i2, jElapsedRealtime2, str5, th);
                    }
                };
                c1331670kl3LJIIJ.LJJJIL = new InterfaceC658750Psf() { // from class: X.0SMs
                    @Override // X.InterfaceC658750Psf
                    public final /* synthetic */ void Ck(JSONObject jSONObject) {
                    }

                    @Override // X.InterfaceC658750Psf
                    public final void onImageLoaded(boolean z3, String str5, JSONObject jSONObject) {
                        String strOptString = jSONObject.optString("uri");
                        int iOptInt = jSONObject.optInt("file_size");
                        if (C123100dR.LIZ(strOptString)) {
                            C0SMT.LIZJ.put(strOptString, Integer.valueOf(iOptInt));
                        }
                    }
                };
                if (Intrinsics.LJFF(str, "general_search") && ((Number) C296160BjC.LIZ.getValue()).intValue() == 2) {
                    c1331670kl3LJIIJ.LJJIIZ = EnumC714850S2h.CUSTOM;
                    c1331670kl3LJIIJ.LJJJJJ = "search_cache";
                } else if (C1335190kqj.LIZIZ() && (AwemeBizOptExtKt.getAwemeCacheType(aweme) == 1 || z2 || C256700yz.LIZ(str))) {
                    c1331670kl3LJIIJ.LJJIIZ = EnumC714850S2h.CUSTOM;
                    c1331670kl3LJIIJ.LJJJJJ = "photomode_image_cache_v2";
                }
                if (Intrinsics.LJFF(str, "homepage_explore")) {
                    if (z) {
                        c1331670kl3LJIIJ.LJJIIJ(interfaceC1331910klR);
                    } else {
                        c1331670kl3LJIIJ.LJJII(interfaceC1331910klR);
                    }
                } else if (z) {
                    c1331670kl3LJIIJ.LJIILLIIL(interfaceC605070NoH);
                } else {
                    c1331670kl3LJIIJ.LJIILJJIL(interfaceC605070NoH);
                }
                String aid = aweme.getAid();
                if (C123100dR.LIZ(aid)) {
                    ConcurrentHashMap<String, Set<Integer>> concurrentHashMap = LIZIZ;
                    Set<Integer> setNewSetFromMap = concurrentHashMap.get(aid);
                    if (setNewSetFromMap == null) {
                        setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                        concurrentHashMap.put(aid, setNewSetFromMap);
                        if (setNewSetFromMap == null) {
                            return;
                        }
                    }
                    setNewSetFromMap.add(Integer.valueOf(i));
                    return;
                }
                return;
            }
            C2344809Gs.LIZLLL(3, "BasePreloadHelper", "Url null");
        }
    }
}
