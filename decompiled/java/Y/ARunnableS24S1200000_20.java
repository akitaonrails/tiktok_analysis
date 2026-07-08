package Y;

import X.AbstractC1273900jFs;
import X.AbstractC1299960jvu;
import X.AbstractC1317090kNX;
import X.C098200Yq;
import X.C1168400gVi;
import X.C1271010jBD;
import X.C1272260jDE;
import X.C1273030jET;
import X.C1273190jEj;
import X.C1274810jHL;
import X.C1274850jHP;
import X.C1274910jHV;
import X.C1274940jHY;
import X.C1285920jZG;
import X.C1286530jaF;
import X.C1288370jdD;
import X.C1289440jew;
import X.C1289960jfm;
import X.C1290850jhD;
import X.C1292280jjW;
import X.C1292290jjX;
import X.C1298420jtQ;
import X.C1298720jtu;
import X.C1301280jy2;
import X.C1301290jy3;
import X.C1301310jy5;
import X.C1301320jy6;
import X.C1301430jyH;
import X.C1301600jyY;
import X.C1315700kLI;
import X.C1315860kLY;
import X.C1317100kNY;
import X.C189200o6;
import X.C1C7U;
import X.C2188811AlT;
import X.EnumC1299880jvm;
import X.InterfaceC1290540jgi;
import X.InterfaceC1301370jyB;
import X.InterfaceC1316540kMe;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.bytedance.android.livesdk.broadcast.interaction.widget.debug.MockImageVideoWidget;
import com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo;
import com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.lynx.tasm.base.TraceController;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.service.ILynxImageService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.StreamKey;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.tts.oecverify.BdTuring;
import j27.s;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import org.json.JSONObject;
import z76.o;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS24S1200000_20 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
            case 14:
                run$14(this);
                break;
            case 15:
                run$15(this);
                break;
            case 16:
                run$16(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        String strLJI = ((C1301280jy2) this.l2).LJI(this.s0);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Load Image with LynxImageService, url is: ");
        sbLIZ.append(C1301430jyH.LJFF(strLJI));
        C1288370jdD.LIZJ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ));
        C1301280jy2 c1301280jy2 = (C1301280jy2) this.l2;
        final InterfaceC1301370jyB interfaceC1301370jyB = (InterfaceC1301370jyB) this.l1;
        c1301280jy2.getClass();
        final String strLJFF = C1301430jyH.LJFF(strLJI);
        if (TraceController.isTracingStarted()) {
            HashMap map = new HashMap();
            map.put("url", strLJFF);
            TraceEvent.LIZJ("LYNX_KRYPTON_LOAD_WITH_IMAGE_SERVICE", map);
        }
        if (c1301280jy2.LIZJ == null) {
            c1301280jy2.LIZJ = (ILynxImageService) C1285920jZG.LIZJ().LIZ(ILynxImageService.class);
        }
        ILynxImageService iLynxImageService = c1301280jy2.LIZJ;
        if (iLynxImageService != null) {
            C1315860kLY c1315860kLY = new C1315860kLY();
            c1315860kLY.LIZ = strLJI;
            c1315860kLY.LJ = Bitmap.Config.ARGB_8888;
            c1315860kLY.LJIILIIL = true;
            c1315860kLY.LJIILJJIL = false;
            iLynxImageService.decodeImage(new C1315700kLI(c1315860kLY), new InterfaceC1316540kMe() { // from class: X.0jyQ
                @Override // X.InterfaceC1316540kMe
                public final void LIZIZ(JSONObject jSONObject) {
                }

                @Override // X.InterfaceC1316540kMe
                public final void LIZJ(int i, Throwable th) {
                    String message = th.getMessage();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("load image failed with url: ");
                    sbLIZ2.append(strLJFF);
                    sbLIZ2.append(" error message: ");
                    sbLIZ2.append(message);
                    C1288370jdD.LIZIZ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ2));
                    interfaceC1301370jyB.reject(message);
                }

                @Override // X.InterfaceC1316540kMe
                public final void LIZ(C1315930kLf c1315930kLf, C1315700kLI c1315700kLI, C1316350kML c1316350kML) {
                    Bitmap bitmapLIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("load image success callback triggered with url: ");
                    sbLIZ2.append(strLJFF);
                    C1288370jdD.LIZJ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ2));
                    if (c1315930kLf != null && (bitmapLIZ = c1315930kLf.LIZ()) != null) {
                        int width = bitmapLIZ.getWidth() * 4 * bitmapLIZ.getHeight();
                        if (width != bitmapLIZ.getByteCount()) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("The expected size of image is not correct, need convert the bitmap to RGBA8888, the url is : ");
                            sbLIZ3.append(strLJFF);
                            C1288370jdD.LIZIZ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ3));
                            boolean z = false;
                            Bitmap bitmapCopy = bitmapLIZ.copy(Bitmap.Config.ARGB_8888, false);
                            if (bitmapCopy != null) {
                                if (width == bitmapCopy.getByteCount()) {
                                    z = true;
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("load image success after converted to RGBA888 with url: ");
                                    sbLIZ4.append(strLJFF);
                                    C1288370jdD.LIZJ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ4));
                                    interfaceC1301370jyB.LIZ(bitmapCopy);
                                }
                                bitmapCopy.recycle();
                                BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCopy);
                                if (z) {
                                    return;
                                }
                            }
                            InterfaceC1301370jyB interfaceC1301370jyB2 = interfaceC1301370jyB;
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("Decode type of bitmap may not correct !!!, the url is: ");
                            sbLIZ5.append(strLJFF);
                            interfaceC1301370jyB2.reject(C2188811AlT.LIZIZ(sbLIZ5));
                            return;
                        }
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("load image success with url: ");
                        sbLIZ6.append(strLJFF);
                        C1288370jdD.LIZJ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ6));
                        interfaceC1301370jyB.LIZ(bitmapLIZ);
                        return;
                    }
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("load null image with url: ");
                    sbLIZ7.append(strLJFF);
                    C1288370jdD.LIZIZ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ7));
                    interfaceC1301370jyB.reject("Empty bitmap !!!");
                }
            });
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("load image failed with because LynxImageService is not existed, the url is :");
            sbLIZ2.append(strLJFF);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            C1288370jdD.LIZIZ("KryptonCanvasLoaderService", strLIZIZ);
            interfaceC1301370jyB.reject(strLIZIZ);
        }
        TraceEvent.LJII("LYNX_KRYPTON_LOAD_WITH_IMAGE_SERVICE");
    }

    public final void LIZ$2() {
        String strLJI = ((C1301290jy3) this.l2).LJI(this.s0);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Load Image with LynxImageService, url is: ");
        sbLIZ.append(C1301430jyH.LJFF(strLJI));
        C1288370jdD.LIZJ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
        C1301290jy3 c1301290jy3 = (C1301290jy3) this.l2;
        final InterfaceC1301370jyB interfaceC1301370jyB = (InterfaceC1301370jyB) this.l1;
        c1301290jy3.getClass();
        final String strLJFF = C1301430jyH.LJFF(strLJI);
        if (TraceController.isTracingStarted()) {
            HashMap map = new HashMap();
            map.put("url", strLJFF);
            TraceEvent.LIZJ("LYNX_KRYPTON_LOAD_WITH_IMAGE_SERVICE", map);
        }
        if (c1301290jy3.LIZIZ == null) {
            c1301290jy3.LIZIZ = (ILynxImageService) C1285920jZG.LIZJ().LIZ(ILynxImageService.class);
        }
        ILynxImageService iLynxImageService = c1301290jy3.LIZIZ;
        if (iLynxImageService != null) {
            C1315860kLY c1315860kLY = new C1315860kLY();
            c1315860kLY.LIZ = strLJI;
            c1315860kLY.LJ = Bitmap.Config.ARGB_8888;
            c1315860kLY.LJIILIIL = true;
            c1315860kLY.LJIILJJIL = false;
            iLynxImageService.decodeImage(new C1315700kLI(c1315860kLY), new InterfaceC1316540kMe() { // from class: X.0jyR
                @Override // X.InterfaceC1316540kMe
                public final void LIZIZ(JSONObject jSONObject) {
                }

                @Override // X.InterfaceC1316540kMe
                public final void LIZJ(int i, Throwable th) {
                    String message = th.getMessage();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("load image failed with url: ");
                    sbLIZ2.append(strLJFF);
                    sbLIZ2.append(" error message: ");
                    sbLIZ2.append(message);
                    C1288370jdD.LIZIZ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ2));
                    interfaceC1301370jyB.reject(message);
                }

                @Override // X.InterfaceC1316540kMe
                public final void LIZ(C1315930kLf c1315930kLf, C1315700kLI c1315700kLI, C1316350kML c1316350kML) {
                    Bitmap bitmapLIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("load image success callback triggered with url: ");
                    sbLIZ2.append(strLJFF);
                    C1288370jdD.LIZJ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ2));
                    if (c1315930kLf != null && (bitmapLIZ = c1315930kLf.LIZ()) != null) {
                        int width = bitmapLIZ.getWidth() * 4 * bitmapLIZ.getHeight();
                        if (width != bitmapLIZ.getByteCount()) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("The expected size of image is not correct, need convert the bitmap to RGBA8888, the url is : ");
                            sbLIZ3.append(strLJFF);
                            C1288370jdD.LIZIZ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ3));
                            boolean z = false;
                            Bitmap bitmapCopy = bitmapLIZ.copy(Bitmap.Config.ARGB_8888, false);
                            if (bitmapCopy != null) {
                                if (width == bitmapCopy.getByteCount()) {
                                    z = true;
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("load image success after converted to RGBA888 with url: ");
                                    sbLIZ4.append(strLJFF);
                                    C1288370jdD.LIZJ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ4));
                                    interfaceC1301370jyB.LIZ(bitmapCopy);
                                }
                                bitmapCopy.recycle();
                                BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCopy);
                                if (z) {
                                    return;
                                }
                            }
                            InterfaceC1301370jyB interfaceC1301370jyB2 = interfaceC1301370jyB;
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("Decode type of bitmap may not correct !!!, the url is: ");
                            sbLIZ5.append(strLJFF);
                            interfaceC1301370jyB2.reject(C2188811AlT.LIZIZ(sbLIZ5));
                            return;
                        }
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("load image success with url: ");
                        sbLIZ6.append(strLJFF);
                        C1288370jdD.LIZJ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ6));
                        interfaceC1301370jyB.LIZ(bitmapLIZ);
                        return;
                    }
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("load null image with url: ");
                    sbLIZ7.append(strLJFF);
                    C1288370jdD.LIZIZ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ7));
                    interfaceC1301370jyB.reject("Empty bitmap !!!");
                }
            });
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("load image failed with because LynxImageService is not existed, the url is :");
            sbLIZ2.append(strLJFF);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            C1288370jdD.LIZIZ("LynxKryptonLoaderServiceImpl", strLIZIZ);
            interfaceC1301370jyB.reject(strLIZIZ);
        }
        TraceEvent.LJII("LYNX_KRYPTON_LOAD_WITH_IMAGE_SERVICE");
    }

    public final void LIZ$3() {
        Object c098200Yq;
        C1292290jjX c1292290jjX = (C1292290jjX) this.l1;
        File file = (File) this.l2;
        try {
            c1292290jjX.getClass();
            C1292290jjX.LIZLLL(file);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        File file2 = (File) this.l2;
        String str = this.s0;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1168400gVi.LIZLLL(new C1292280jjW(file2, str, thM5exceptionOrNullimpl));
        }
    }

    public final void LIZ$4() {
        ((MockImageVideoWidget) this.l1).LLILZLL = GlUtil.generateTexture(3553);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, ((MockImageVideoWidget) this.l1).LLILZLL);
        GLES20.glTexImage2D(3553, 0, 6408, ((AbstractC1273900jFs) this.l2).LLD().LJJIIZI(), ((AbstractC1273900jFs) this.l2).LLD().LJJIIJ(), 0, 6408, 5121, null);
        GLES20.glBindTexture(3553, 0);
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(this.s0);
        if (bitmapDecodeFile != null && !bitmapDecodeFile.isRecycled()) {
            GLES20.glBindTexture(3553, ((MockImageVideoWidget) this.l1).LLILZLL);
            GLUtils.texImage2D(3553, 0, bitmapDecodeFile, 0);
            GLES20.glBindTexture(3553, 0);
            bitmapDecodeFile.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapDecodeFile);
        }
        C1273030jET.LIZ(((MockImageVideoWidget) this.l1).LLILZLL, ((AbstractC1273900jFs) this.l2).LLD().LJJIIZI(), ((AbstractC1273900jFs) this.l2).LLD().LJJIIJ(), false);
    }

    public final void LIZ$5() {
        C1274810jHL c1274810jHL = (C1274810jHL) this.l2;
        String str = this.s0;
        StreamIndex streamIndex = (StreamIndex) this.l1;
        synchronized (c1274810jHL.LJJJJZI) {
            try {
                if (c1274810jHL.LLIIL()) {
                    C1274940jHY c1274940jHY = c1274810jHL.LJJIIJZLJL;
                    int iValue = streamIndex.value();
                    c1274940jHY.getClass();
                    String strLJ = C1274940jHY.LJ(iValue, str);
                    StreamKey streamKey = new StreamKey(c1274810jHL.LJJLIIIJJI, str, streamIndex);
                    String strLJJII = c1274810jHL.LJJII(streamKey);
                    if (strLJJII == null || !((ConcurrentHashMap) c1274810jHL.LJJJJZI).containsKey(strLJJII)) {
                        c1274810jHL.LJJIJIIJIL(streamKey);
                        c1274810jHL.LJJ(streamKey);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("createAuxStreamVideoRender mUnifiedLyraxRendererCache size =");
                        sbLIZ.append(((ConcurrentHashMap) c1274810jHL.LJJJJZI).size());
                        AVLog.ioi("ClientImpl", C2188811AlT.LIZIZ(sbLIZ));
                        C1274910jHV c1274910jHV = c1274810jHL.LJIIIZ.LIZJ;
                        if (c1274910jHV != null) {
                            c1274910jHV.addUser(strLJ);
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZ$1() {
        AbstractC1299960jvu abstractC1299960jvu;
        if (TraceController.isTracingStarted()) {
            HashMap map = new HashMap();
            map.put("url", this.s0);
            TraceEvent.LIZJ("LYNX_KRYPTON_LOAD_WITH_GENERIC_FETCHER", map);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Load url : ");
        sbLIZ.append(this.s0);
        sbLIZ.append(" with LynxGenericFetcher.");
        C1288370jdD.LIZJ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
        if (C1301430jyH.LJIIIIZZ(this.s0)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("The request url is a local path: ,");
            sbLIZ2.append(this.s0);
            sbLIZ2.append(" handle local path.");
            C1288370jdD.LIZJ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ2));
            C1301290jy3 c1301290jy3 = (C1301290jy3) this.l2;
            String str = this.s0;
            C1301320jy6 c1301320jy6 = (C1301320jy6) this.l1;
            c1301290jy3.getClass();
            C1301290jy3.LJIIIZ(str, c1301320jy6);
            TraceEvent.LJII("LYNX_KRYPTON_LOAD_WITH_GENERIC_FETCHER");
            return;
        }
        C1301290jy3 c1301290jy32 = (C1301290jy3) this.l2;
        final String str2 = this.s0;
        final C1301320jy6 c1301320jy62 = (C1301320jy6) this.l1;
        c1301290jy32.getClass();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Load remote resource with LynxGenericFetcher, url: ");
        sbLIZ3.append(str2);
        C1288370jdD.LIZJ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ3));
        s sVar = c1301290jy32.LIZ.get();
        if (sVar == null || (abstractC1299960jvu = sVar.LLL) == null) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("No LynxGenericResourceFetcher existed. Load failed with url: ");
            sbLIZ4.append(str2);
            c1301320jy62.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
        } else {
            abstractC1299960jvu.LIZIZ(new C1301600jyY(str2, EnumC1299880jvm.LynxResourceTypeGeneric), new InterfaceC1290540jgi<byte[]>() { // from class: X.0jfP
                @Override // X.InterfaceC1290540jgi
                public final void LIZ(C1289590jfB<byte[]> c1289590jfB) {
                    boolean z;
                    String message;
                    if (c1289590jfB.LIZ == EnumC1288980jeC.SUCCESS) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("Load with LynxGenericFetcher success with the url is: ");
                        sbLIZ5.append(str2);
                        C1288370jdD.LIZJ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ5));
                        c1301320jy62.LIZIZ(c1289590jfB.LIZIZ);
                        return;
                    }
                    Throwable th = c1289590jfB.LIZJ;
                    if (th != null) {
                        message = th.getMessage();
                    } else {
                        message = "";
                    }
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("Load with LynxGenericFetcher error: ");
                    sbLIZ6.append(message);
                    sbLIZ6.append(" ,the url of resource is: ");
                    sbLIZ6.append(str2);
                    C1288370jdD.LIZIZ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ6));
                    c1301320jy62.LIZ(message);
                }
            });
        }
        TraceEvent.LJII("LYNX_KRYPTON_LOAD_WITH_GENERIC_FETCHER");
    }

    public static final void run$0(ARunnableS24S1200000_20 aRunnableS24S1200000_20) {
        boolean zLIZ;
        C1C7U.LIZ("CanvasLoaderService@ea14.loadNormalDataWithProperDownloaderAsync$1");
        try {
            ((C1301280jy2) aRunnableS24S1200000_20.l2).LJIILIIL(aRunnableS24S1200000_20.s0, (C1301310jy5) aRunnableS24S1200000_20.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CanvasLoaderService@ea14.loadNormalDataWithProperDownloaderAsync$1");
    }

    public static final void run$1(ARunnableS24S1200000_20 aRunnableS24S1200000_20) {
        boolean zLIZ;
        C1C7U.LIZ("CanvasLoaderService@ea14.handleImageWithLynxImageService$1");
        try {
            aRunnableS24S1200000_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CanvasLoaderService@ea14.handleImageWithLynxImageService$1");
    }

    public static final void run$10(ARunnableS24S1200000_20 aRunnableS24S1200000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LiveCoreKaraokFilterV2@ff9f.setTuningParams$1");
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setTuningParams: filePath: ");
            sbLIZ.append(aRunnableS24S1200000_20.s0);
            AVLog.logKibana(4, "LiveCoreKaraokFilterV2", C2188811AlT.LIZIZ(sbLIZ), null);
            ((AudioDeviceModule) aRunnableS24S1200000_20.l1).setTuningType(0, aRunnableS24S1200000_20.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveCoreKaraokFilterV2@ff9f.setTuningParams$1");
    }

    public static final void run$11(ARunnableS24S1200000_20 aRunnableS24S1200000_20) {
        C1298720jtu c1298720jtu;
        LynxBytedLottieView lynxBytedLottieView = (LynxBytedLottieView) aRunnableS24S1200000_20.l1;
        String str = aRunnableS24S1200000_20.s0;
        Map map = (Map) aRunnableS24S1200000_20.l2;
        C1C7U.LIZ("LynxBytedLottieView@7d8e.sendLottieEvent$1L");
        s sVar = lynxBytedLottieView.mContext;
        if (sVar != null && (c1298720jtu = sVar.LLIZ) != null) {
            c1298720jtu.LIZIZ(new C1289440jew(str, map, lynxBytedLottieView.getSign()));
        }
        C1C7U.LIZIZ("LynxBytedLottieView@7d8e.sendLottieEvent$1L");
    }

    public static final void run$12(ARunnableS24S1200000_20 aRunnableS24S1200000_20) {
        boolean zLIZ;
        C1C7U.LIZ("ClientImpl@5fd5.createAuxStreamVideoRender$1");
        try {
            aRunnableS24S1200000_20.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ClientImpl@5fd5.createAuxStreamVideoRender$1");
    }

    public static final void run$13(ARunnableS24S1200000_20 aRunnableS24S1200000_20) {
        boolean zLIZ;
        C1C7U.LIZ("InteractEngineImpl@b747.onLogReport$1");
        try {
            C1271010jBD c1271010jBD = ((C1274850jHP) aRunnableS24S1200000_20.l2).LJIILL;
            if (c1271010jBD != null) {
                c1271010jBD.LIZ(aRunnableS24S1200000_20.s0, (JSONObject) aRunnableS24S1200000_20.l1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InteractEngineImpl@b747.onLogReport$1");
    }

    public static final void run$14(ARunnableS24S1200000_20 aRunnableS24S1200000_20) {
        VideoFrame videoFrame = (VideoFrame) aRunnableS24S1200000_20.l1;
        String str = aRunnableS24S1200000_20.s0;
        C1273190jEj c1273190jEj = (C1273190jEj) aRunnableS24S1200000_20.l2;
        C1C7U.LIZ("InteractMixManager@3e6d.updateInteractTexture$1L");
        VideoFrame videoFrame2 = c1273190jEj.LLJ.get(str);
        if (c1273190jEj.LJIIJJI()) {
            if (videoFrame2 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SingleViewRender_");
                sbLIZ.append(c1273190jEj.LL);
                videoFrame2.release(C2188811AlT.LIZIZ(sbLIZ));
            }
        } else if (videoFrame2 != null) {
            videoFrame2.release();
        }
        c1273190jEj.LLJ.put(str, videoFrame);
        C1C7U.LIZIZ("InteractMixManager@3e6d.updateInteractTexture$1L");
    }

    public static final void run$15(ARunnableS24S1200000_20 aRunnableS24S1200000_20) {
        s sVar;
        C1298720jtu c1298720jtu;
        LynxAlphaVideo lynxAlphaVideo = (LynxAlphaVideo) aRunnableS24S1200000_20.l1;
        String str = aRunnableS24S1200000_20.s0;
        Map map = (Map) aRunnableS24S1200000_20.l2;
        int i = LynxAlphaVideo.LLJJIJI;
        C1C7U.LIZ("LynxAlphaVideo@e3ce.sendEventAsync$1L");
        Set<String> set = lynxAlphaVideo.LLILLJJLI;
        if (set != null && set.contains(str) && (sVar = lynxAlphaVideo.mContext) != null && (c1298720jtu = sVar.LLIZ) != null) {
            C1289960jfm c1289960jfm = new C1289960jfm(lynxAlphaVideo.getSign(), str);
            for (Map.Entry entry : map.entrySet()) {
                c1289960jfm.LIZIZ(entry.getValue(), (String) entry.getKey());
            }
            c1298720jtu.LIZIZ(c1289960jfm);
        }
        C1C7U.LIZIZ("LynxAlphaVideo@e3ce.sendEventAsync$1L");
    }

    public static final void run$16(ARunnableS24S1200000_20 aRunnableS24S1200000_20) {
        C1298420jtQ c1298420jtQ;
        C1290850jhD c1290850jhD = (C1290850jhD) aRunnableS24S1200000_20.l1;
        String str = aRunnableS24S1200000_20.s0;
        Map map = (Map) aRunnableS24S1200000_20.l2;
        C1C7U.LIZ("SDUIBytedLottieView@4d0c.sendLottieEvent$1L");
        AbstractC1317090kNX abstractC1317090kNX = c1290850jhD.LLILZ;
        if (abstractC1317090kNX != null && (c1298420jtQ = abstractC1317090kNX.LLILLL) != null) {
            c1298420jtQ.LIZJ(new o(map, str, c1290850jhD.LLJJ));
        }
        C1C7U.LIZIZ("SDUIBytedLottieView@4d0c.sendLottieEvent$1L");
    }

    public static final void run$2(ARunnableS24S1200000_20 aRunnableS24S1200000_20) {
        boolean zLIZ;
        C1C7U.LIZ("CanvasLoaderService@ea14.handleBase64ImageAsync$1");
        try {
            C1301280jy2.LJIIIZ(aRunnableS24S1200000_20.s0, (InterfaceC1301370jyB) aRunnableS24S1200000_20.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CanvasLoaderService@ea14.handleBase64ImageAsync$1");
    }

    public static final void run$3(ARunnableS24S1200000_20 aRunnableS24S1200000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LynxKryptonLoaderServiceImpl@6a62.handleNormalDataLoader$1");
        try {
            aRunnableS24S1200000_20.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxKryptonLoaderServiceImpl@6a62.handleNormalDataLoader$1");
    }

    public static final void run$4(ARunnableS24S1200000_20 aRunnableS24S1200000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LynxKryptonLoaderServiceImpl@6a62.handleImageWithLynxImageService$1");
        try {
            aRunnableS24S1200000_20.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxKryptonLoaderServiceImpl@6a62.handleImageWithLynxImageService$1");
    }

    public static final void run$5(ARunnableS24S1200000_20 aRunnableS24S1200000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LiveApplog@966f.onMonitorLog$1");
        try {
            ((C1286530jaF) aRunnableS24S1200000_20.l2).LIZ(aRunnableS24S1200000_20.s0, (JSONObject) aRunnableS24S1200000_20.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveApplog@966f.onMonitorLog$1");
    }

    public static final void run$6(ARunnableS24S1200000_20 aRunnableS24S1200000_20) {
        C1317100kNY c1317100kNY = (C1317100kNY) aRunnableS24S1200000_20.l1;
        String str = aRunnableS24S1200000_20.s0;
        JSONObject jSONObject = (JSONObject) aRunnableS24S1200000_20.l2;
        C1C7U.LIZ("SDUIMetricsImpl@adc.reportToMonitor$1L");
        c1317100kNY.LIZ.LLIZLLLIL.LIZ(str, jSONObject);
        C1C7U.LIZIZ("SDUIMetricsImpl@adc.reportToMonitor$1L");
    }

    public static final void run$7(ARunnableS24S1200000_20 aRunnableS24S1200000_20) {
        boolean zLIZ;
        C1C7U.LIZ("MynaLottieElementView@f3ae.cleanupPreparedArtifactsAsync$1");
        try {
            aRunnableS24S1200000_20.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MynaLottieElementView@f3ae.cleanupPreparedArtifactsAsync$1");
    }

    public static final void run$8(ARunnableS24S1200000_20 aRunnableS24S1200000_20) {
        boolean zLIZ;
        C1C7U.LIZ("MockImageVideoWidget@8b2f.startMockImage$1");
        try {
            aRunnableS24S1200000_20.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MockImageVideoWidget@8b2f.startMockImage$1");
    }

    public static final void run$9(ARunnableS24S1200000_20 aRunnableS24S1200000_20) {
        C1272260jDE c1272260jDE = (C1272260jDE) aRunnableS24S1200000_20.l1;
        JSONObject jSONObject = (JSONObject) aRunnableS24S1200000_20.l2;
        String str = aRunnableS24S1200000_20.s0;
        C1C7U.LIZ("EffectManager@a3e3.setABInfoToEffect$1L");
        if (c1272260jDE.isValid()) {
            c1272260jDE.LLIZLLLIL.setEffectABInfo(jSONObject, str);
        }
        C1C7U.LIZIZ("EffectManager@a3e3.setABInfoToEffect$1L");
    }

    public ARunnableS24S1200000_20(C1272260jDE c1272260jDE, JSONObject jSONObject, int i) {
        this.$t = i;
        this.l1 = c1272260jDE;
        this.l2 = jSONObject;
        this.s0 = "live";
    }

    public ARunnableS24S1200000_20(C1286530jaF c1286530jaF, JSONObject jSONObject, int i) {
        this.$t = i;
        this.l2 = c1286530jaF;
        this.l1 = jSONObject;
        this.s0 = "live_client_monitor_log";
    }

    public ARunnableS24S1200000_20(C1317100kNY c1317100kNY, JSONObject jSONObject, int i) {
        this.$t = i;
        this.l1 = c1317100kNY;
        this.s0 = "sdui_time_metrics";
        this.l2 = jSONObject;
    }

    public ARunnableS24S1200000_20(Object obj, String str, Object obj2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.l1 = obj2;
    }

    public ARunnableS24S1200000_20(VideoFrame videoFrame, String str, boolean z, C1273190jEj c1273190jEj, int i) {
        this.$t = i;
        this.l1 = videoFrame;
        this.s0 = str;
        this.l2 = c1273190jEj;
    }
}
