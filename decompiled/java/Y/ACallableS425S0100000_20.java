package Y;

import X.C0VSP;
import X.C1279640jP8;
import X.C1290500jge;
import X.C1291600jiQ;
import X.C1292000jj4;
import X.C1294720jnS;
import X.C1317360kNy;
import X.C1317750kOb;
import X.C1317800kOg;
import X.C1317850kOl;
import X.C1317870kOn;
import X.C1317940kOu;
import X.C1322710kWb;
import X.C1326950kdR;
import X.C1698860uJI;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C497740JfY;
import X.C786410Ut5;
import X.EnumC1309510kBJ;
import X.RunnableC1276220jJc;
import android.content.res.AssetManager;
import android.os.Handler;
import android.os.Process;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.performance.PerformanceManagerImpl;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.sdui.serializedData.common.operations.Glyph;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.pusher.core.engine.AdaptiveController;
import com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.tts.oecverify.BdTuring;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes21.dex */
public class ACallableS425S0100000_20 implements Callable {
    public final int $t;
    public Object l0;

    public static final Object call$7(ACallableS425S0100000_20 aCallableS425S0100000_20) {
        return AdaptiveController.LIZIZ((AdaptiveController) aCallableS425S0100000_20.l0);
    }

    public static final Object call$8(ACallableS425S0100000_20 aCallableS425S0100000_20) {
        return AdaptiveController.LIZ((AdaptiveController) aCallableS425S0100000_20.l0);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return call$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return call$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return call$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return call$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return call$13(this);
            case 14:
                return call$14(this);
            case 15:
                return call$15(this);
            case 16:
                return call$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return call$17(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS425S0100000_20 aCallableS425S0100000_20) {
        Function0 function0 = (Function0) aCallableS425S0100000_20.l0;
        C1C7U.LIZ("TTLivePlayer3@b013.executeWithThreadTimeOut$1L");
        Process.setThreadPriority(-20);
        function0.invoke();
        Boolean bool = Boolean.TRUE;
        C1C7U.LIZIZ("TTLivePlayer3@b013.executeWithThreadTimeOut$1L");
        return bool;
    }

    public static final Object call$1(ACallableS425S0100000_20 aCallableS425S0100000_20) {
        C1C7U.LIZ("ThreadUtils@6564.invokeAtFrontUninterruptibly$10");
        ((Runnable) aCallableS425S0100000_20.l0).run();
        C1C7U.LIZIZ("ThreadUtils@6564.invokeAtFrontUninterruptibly$10");
        return null;
    }

    public static final Object call$10(ACallableS425S0100000_20 aCallableS425S0100000_20) {
        SurfaceTextureHelper surfaceTextureHelper;
        C1C7U.LIZ("ShortVideoPushManager@612e.getSurface$1");
        try {
            final Handler handler = ((RunnableC1276220jJc) aCallableS425S0100000_20.l0).LLILLJJLI;
            surfaceTextureHelper = new SurfaceTextureHelper(handler) { // from class: X.0jJd
                @Override // com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper
                public final void handlerExit() {
                    AVLog.ioi("ShortVideoPushManager", "call handlerExit.");
                }
            };
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            AVLog.e("ShortVideoPushManager", "call:  create failure");
            surfaceTextureHelper = null;
        }
        C1C7U.LIZIZ("ShortVideoPushManager@612e.getSurface$1");
        return surfaceTextureHelper;
    }

    public static final Object call$11(ACallableS425S0100000_20 aCallableS425S0100000_20) {
        C1C7U.LIZ("ThreadUtils@eac9.invokeAtFrontUninterruptibly$10");
        ((Runnable) aCallableS425S0100000_20.l0).run();
        C1C7U.LIZIZ("ThreadUtils@eac9.invokeAtFrontUninterruptibly$10");
        return null;
    }

    public static final Object call$12(ACallableS425S0100000_20 aCallableS425S0100000_20) {
        C1279640jP8 c1279640jP8 = (C1279640jP8) aCallableS425S0100000_20.l0;
        c1279640jP8.getClass();
        C1C7U.LIZ("TTKLowLatencyPlayer@cd66.setSurfaceTexture$1L");
        Process.setThreadPriority(-2);
        c1279640jP8.LL.getClass();
        Boolean bool = Boolean.TRUE;
        C1C7U.LIZIZ("TTKLowLatencyPlayer@cd66.setSurfaceTexture$1L");
        return bool;
    }

    public static final Object call$13(ACallableS425S0100000_20 aCallableS425S0100000_20) {
        C1698860uJI c1698860uJI = (C1698860uJI) aCallableS425S0100000_20.l0;
        c1698860uJI.getClass();
        C1C7U.LIZ("TTKLivePlayer2@97f4.setSurfaceTexture$1L$1L");
        Process.setThreadPriority(-2);
        c1698860uJI.LJJLIIIIJ("setSurfaceTexture null");
        c1698860uJI.LLILZ.LLLLLLLLLL(null);
        Boolean bool = Boolean.TRUE;
        C1C7U.LIZIZ("TTKLivePlayer2@97f4.setSurfaceTexture$1L$1L");
        return bool;
    }

    public static final Object call$14(ACallableS425S0100000_20 aCallableS425S0100000_20) {
        Pair pair;
        boolean z;
        File file = (File) aCallableS425S0100000_20.l0;
        C1C7U.LIZ("FontMap@ec9e.<init>$1L");
        Pair pairCreate = null;
        if (!file.exists()) {
            file.mkdirs();
        } else {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                Arrays.sort(fileArrListFiles);
                ArrayList arrayList = new ArrayList();
                int length = 0;
                for (int length2 = fileArrListFiles.length - 1; length2 >= 0; length2--) {
                    File file2 = fileArrListFiles[length2];
                    length = (int) (((long) length) + file2.length());
                    if (length > 4194304) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("delete file ");
                        sbLIZ.append(file2.getName());
                        sbLIZ.append(", maximum cache size reached");
                        C2188811AlT.LIZIZ(sbLIZ);
                        if (C1317940kOu.LIZ.booleanValue()) {
                            int i = C1317360kNy.LIZ;
                        }
                        file2.delete();
                    } else {
                        arrayList.add(file2);
                    }
                }
                ExecutorService executorServiceD4 = C786410Ut5.d4(Runtime.getRuntime().availableProcessors());
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    FutureTask futureTask = new FutureTask(new ACallableS425S0100000_20((File) it2.next(), 15));
                    executorServiceD4.execute(futureTask);
                    arrayList2.add(futureTask);
                }
                HashMap map = new HashMap();
                LinkedList linkedList = new LinkedList();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    try {
                        pair = (Pair) ((FutureTask) it3.next()).get();
                    } catch (InterruptedException | ExecutionException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1317870kOn.LIZIZ();
                        pair = null;
                    }
                    if (pair != null) {
                        C1317800kOg c1317800kOg = (C1317800kOg) pair.first;
                        int i2 = c1317800kOg.LIZJ;
                        C1317800kOg c1317800kOg2 = (C1317800kOg) map.get(Integer.valueOf(i2));
                        if (c1317800kOg2 != null) {
                            int i3 = c1317800kOg.LIZ;
                            int i4 = c1317800kOg.LIZIZ;
                            int i5 = c1317800kOg.LIZJ;
                            if (c1317800kOg2.LIZ == i3 && c1317800kOg2.LIZIZ == i4 && c1317800kOg2.LIZJ == i5) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("merge failed, ");
                                sbLIZ2.append(c1317800kOg2);
                                sbLIZ2.append(" != ");
                                sbLIZ2.append(c1317800kOg);
                                C2188811AlT.LIZIZ(sbLIZ2);
                                C1317870kOn.LIZ();
                            } else {
                                SparseArray<C1317850kOl> sparseArray = c1317800kOg.LIZLLL;
                                for (int i6 = 0; i6 < sparseArray.size(); i6++) {
                                    int iKeyAt = sparseArray.keyAt(i6);
                                    c1317800kOg2.LIZLLL.put(iKeyAt, sparseArray.get(iKeyAt));
                                }
                            }
                        } else {
                            map.put(Integer.valueOf(i2), c1317800kOg);
                        }
                        linkedList.add(pair.second);
                    }
                }
                executorServiceD4.shutdown();
                pairCreate = Pair.create(map, linkedList);
            }
        }
        C1C7U.LIZIZ("FontMap@ec9e.<init>$1L");
        return pairCreate;
    }

    public static final Object call$15(ACallableS425S0100000_20 aCallableS425S0100000_20) {
        Pair pairCreate;
        File file = (File) aCallableS425S0100000_20.l0;
        C1C7U.LIZ("FontMap@ec9e.loadFonts$1L");
        String name = file.getName();
        int iIndexOf = name.indexOf(e3.d);
        if (iIndexOf < 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("delete file ");
            sbLIZ.append(name);
            sbLIZ.append(", no infix");
            C2188811AlT.LIZIZ(sbLIZ);
            C1317870kOn.LIZ();
            file.delete();
        } else {
            try {
                int i = CastIntegerProtector.parseInt(name.substring(iIndexOf + 1));
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new C0VSP(file));
                    try {
                        C1317800kOg c1317800kOg = new C1317800kOg(bufferedInputStream.read(), bufferedInputStream.read(), i);
                        Iterator<Glyph> it2 = C1317750kOb.LIZLLL(new C1322710kWb(bufferedInputStream)).LIZ.iterator();
                        while (it2.hasNext()) {
                            c1317800kOg.LIZ(it2.next());
                        }
                        pairCreate = Pair.create(c1317800kOg, file);
                        bufferedInputStream.close();
                    } finally {
                    }
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("delete file ");
                    sbLIZ2.append(name);
                    sbLIZ2.append(", load font failed");
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C1317870kOn.LIZIZ();
                    file.delete();
                }
            } catch (NumberFormatException e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("delete file ");
                sbLIZ3.append(name);
                sbLIZ3.append(", parse int error");
                C2188811AlT.LIZIZ(sbLIZ3);
                C1317870kOn.LIZIZ();
                file.delete();
            }
            C1C7U.LIZIZ("FontMap@ec9e.loadFonts$1L");
            return pairCreate;
        }
        pairCreate = null;
        C1C7U.LIZIZ("FontMap@ec9e.loadFonts$1L");
        return pairCreate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003f A[EXC_TOP_SPLITTER, PHI: r5
      0x003f: PHI (r5v1 X.0VSJ) = (r5v0 X.0VSJ), (r5v2 X.0VSJ) binds: [B:4:0x0026, B:6:0x003d] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$16(Y.ACallableS425S0100000_20 r9) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS425S0100000_20.call$16(Y.ACallableS425S0100000_20):java.lang.Object");
    }

    public static final Object call$17(ACallableS425S0100000_20 aCallableS425S0100000_20) {
        C1C7U.LIZ("BufferedDiskCache@f3ba.clearAll$1");
        ((C1326950kdR) aCallableS425S0100000_20.l0).LJFF.LIZ();
        ((C1326950kdR) aCallableS425S0100000_20.l0).LIZ.clearAll();
        C1C7U.LIZIZ("BufferedDiskCache@f3ba.clearAll$1");
        return null;
    }

    public static final Object call$2(ACallableS425S0100000_20 aCallableS425S0100000_20) {
        C1294720jnS c1294720jnS = (C1294720jnS) aCallableS425S0100000_20.l0;
        C1C7U.LIZ("LottieCompositionFactory@f22f.cache$1L");
        C1292000jj4 c1292000jj4 = new C1292000jj4(c1294720jnS);
        C1C7U.LIZIZ("LottieCompositionFactory@f22f.cache$1L");
        return c1292000jj4;
    }

    public static final Object call$3(ACallableS425S0100000_20 aCallableS425S0100000_20) {
        EnumC1309510kBJ enumC1309510kBJ = (EnumC1309510kBJ) aCallableS425S0100000_20.l0;
        enumC1309510kBJ.getClass();
        C1C7U.LIZ("LiveCameraResManager@5b6f.loadResources$2L");
        C20441214yg.LIZIZ("LiveCameraResManager", "start load resources");
        AssetManager assets = C497740JfY.LJII().getAssets();
        boolean z = true;
        for (String str : EnumC1309510kBJ.LLJILJILJ) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(EnumC1309510kBJ.LLJJ);
                sbLIZ.append(File.separator);
                sbLIZ.append(str);
                EnumC1309510kBJ.LIZJ(str, C2188811AlT.LIZIZ(sbLIZ), assets);
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                ((HashMap) enumC1309510kBJ.LL).put("copy_res_file_error", e.toString());
                C20441214yg.LJI("LiveCameraResManager", e);
                z = false;
            }
        }
        for (String str2 : EnumC1309510kBJ.LLJILLL) {
            try {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(EnumC1309510kBJ.LLJJ);
                sbLIZ2.append(File.separator);
                sbLIZ2.append(str2);
                EnumC1309510kBJ.LIZJ(str2, C2188811AlT.LIZIZ(sbLIZ2), assets);
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
                ((HashMap) enumC1309510kBJ.LL).put("copy_res_file_error", e2.toString());
                C20441214yg.LJI("LiveCameraResManager", e2);
                z = false;
            }
        }
        for (String str3 : EnumC1309510kBJ.LLJILJILJ) {
            try {
                EnumC1309510kBJ.LJFF(str3);
            } catch (IOException e3) {
                TryCatchGuardChecker.doCheck(e3);
                ((HashMap) enumC1309510kBJ.LL).put("unzip_res_file_error", e3.toString());
                C20441214yg.LJI("LiveCameraResManager", e3);
                z = false;
            }
        }
        C20441214yg.LIZIZ("LiveCameraResManager", "finish load resources");
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("LiveCameraResManager@5b6f.loadResources$2L");
        return boolValueOf;
    }

    public static final Object call$4(ACallableS425S0100000_20 aCallableS425S0100000_20) {
        C1C7U.LIZ("PerformanceManagerImpl@9c39.getPerformanceJsonObject$futureTask$1");
        ((PerformanceManagerImpl) aCallableS425S0100000_20.l0).LJIIIZ("live_pull_sdk_get_data_interval");
        JSONObject jSONObjectLJIJJ = ((PerformanceManagerImpl) aCallableS425S0100000_20.l0).LJIJJ();
        C1C7U.LIZIZ("PerformanceManagerImpl@9c39.getPerformanceJsonObject$futureTask$1");
        return jSONObjectLJIJJ;
    }

    public static final Object call$5(ACallableS425S0100000_20 aCallableS425S0100000_20) {
        C1C7U.LIZ("LottieCompositionFactory@fe8.cache$3");
        C1290500jge c1290500jge = new C1290500jge((C1291600jiQ) aCallableS425S0100000_20.l0);
        C1C7U.LIZIZ("LottieCompositionFactory@fe8.cache$3");
        return c1290500jge;
    }

    public static final Object call$6(ACallableS425S0100000_20 aCallableS425S0100000_20) {
        View viewCreateView;
        LynxUI lynxUI;
        C1C7U.LIZ("LynxUI@818d.createViewAsync$1");
        try {
            lynxUI = (LynxUI) aCallableS425S0100000_20.l0;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LynxLog.e("LynxUI", th.toString());
        }
        if (lynxUI.createView(lynxUI.mContext, lynxUI.mParam) == null) {
            LynxUI lynxUI2 = (LynxUI) aCallableS425S0100000_20.l0;
            viewCreateView = lynxUI2.createView(lynxUI2.mContext);
        } else {
            viewCreateView = null;
        }
        C1C7U.LIZIZ("LynxUI@818d.createViewAsync$1");
        return viewCreateView;
    }

    public static final Object call$9(ACallableS425S0100000_20 aCallableS425S0100000_20) {
        SurfaceTextureHelper surfaceTextureHelper;
        C1C7U.LIZ("SurfaceTextureHelper@14cc.create$1");
        try {
            surfaceTextureHelper = new SurfaceTextureHelper((Handler) aCallableS425S0100000_20.l0);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            surfaceTextureHelper = null;
        }
        C1C7U.LIZIZ("SurfaceTextureHelper@14cc.create$1");
        return surfaceTextureHelper;
    }

    public ACallableS425S0100000_20(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
