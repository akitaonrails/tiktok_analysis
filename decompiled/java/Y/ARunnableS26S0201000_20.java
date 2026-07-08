package Y;

import X.C1266350j3h;
import X.C1267030j4n;
import X.C1269160j8E;
import X.C1269780j9E;
import X.C1270500jAO;
import X.C1270610jAZ;
import X.C1270620jAa;
import X.C1271980jCm;
import X.C1272100jCy;
import X.C1288060jci;
import X.C1288070jcj;
import X.C1288150jcr;
import X.C1290750jh3;
import X.C1291190jhl;
import X.C1294230jmf;
import X.C1297860jsW;
import X.C1298340jtI;
import X.C1298370jtL;
import X.C1298700jts;
import X.C1298720jtu;
import X.C1311770kEx;
import X.C1316590kMj;
import X.C1317350kNx;
import X.C1317760kOc;
import X.C1317810kOh;
import X.C1317860kOm;
import X.C1317900kOq;
import X.C1C7U;
import X.C2188811AlT;
import X.EnumC1288160jcs;
import X.InterfaceC1272120jD0;
import X.InterfaceC1288110jcn;
import X.InterfaceC1288130jcp;
import X.InterfaceC1301080jxi;
import X.InterfaceC1309740kBg;
import X.InterfaceC1317880kOo;
import android.graphics.Typeface;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.sdui.serializedData.AbsSerializedData;
import com.bytedance.sdui.serializedData.common.EventRequest;
import com.lynx.animax.ability.BaseAbility;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.JavaOnlyMap;
import com.ss.android.ttvecamera.TECameraCapture;
import com.ss.android.ttvecamera.b0;
import com.ss.android.ugc.aweme.hybridkit.sdui.SDUIWsServiceImpl;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import com.ss.android.ugc.aweme.spark.SparkHostApiImpl;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.lyrax.video.AbsLyraxVideoPlatformWrapper;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture;
import com.tts.oecverify.BdTuring;
import j27.s;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS26S0201000_20 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                run$17(this);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                run$18(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C1294230jmf c1294230jmf = new C1294230jmf(this.i2, "intersection", (C1297860jsW) this.l0);
        if (((C1298370jtL) this.l1).LIZIZ.get().LLILLL != null) {
            ((C1298370jtL) this.l1).LIZIZ.get().LLILLL.LIZJ(c1294230jmf);
        }
    }

    public final void LIZ$1() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onVideoCaptureError: code ");
        sbLIZ.append(this.i2);
        sbLIZ.append(", message ");
        sbLIZ.append(((Exception) this.l0).toString());
        AVLog.ioe("LiveStream", C2188811AlT.LIZIZ(sbLIZ));
        C1266350j3h c1266350j3h = (C1266350j3h) this.l1;
        C1269160j8E c1269160j8E = c1266350j3h.LLILZLL;
        LiveStreamVideoCapture liveStreamVideoCapture = c1266350j3h.LLJJIJIL;
        int i = c1266350j3h.LLJZ.get();
        ((C1266350j3h) this.l1).LLJZ.set(8);
        int[] iArr = C1267030j4n.LIZ;
        if (liveStreamVideoCapture != null) {
            C1266350j3h c1266350j3h2 = (C1266350j3h) this.l1;
            int i2 = this.i2;
            c1266350j3h2.getClass();
            int i3 = 0;
            while (true) {
                if (iArr[i3] != i2) {
                    i3++;
                    if (i3 >= 4) {
                        break;
                    }
                } else if (liveStreamVideoCapture.LLJIJIL == 3) {
                    ((C1266350j3h) this.l1).LLJZ.set(i);
                }
            }
        } else if (c1269160j8E != null) {
            C1266350j3h c1266350j3h3 = (C1266350j3h) this.l1;
            int i4 = this.i2;
            c1266350j3h3.getClass();
            int i5 = 0;
            while (true) {
                if (iArr[i5] != i4) {
                    i5++;
                    if (i5 >= 4) {
                        break;
                    }
                } else if (c1269160j8E.LJJII() == 3) {
                    ((C1266350j3h) this.l1).LLJZ.set(i);
                }
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onVideoCaptureError in: code ");
        sbLIZ2.append(this.i2);
        sbLIZ2.append(" mStatus:");
        sbLIZ2.append(((C1266350j3h) this.l1).LLJZ.get());
        sbLIZ2.append(" mErrorListener：");
        sbLIZ2.append(((C1266350j3h) this.l1).LLJJIII);
        AVLog.logKibana(6, "LiveStream", C2188811AlT.LIZIZ(sbLIZ2), (Exception) this.l0);
        if (((C1266350j3h) this.l1).LLJJIII()) {
            Object obj = ((C1266350j3h) this.l1).LLJJJ;
            if (obj instanceof C1271980jCm) {
                ((AbsLyraxVideoPlatformWrapper) obj).applyErrorStrategy();
            }
        }
        ((C1266350j3h) this.l1).LLLIIL(2, this.i2, (Exception) this.l0);
        C1269780j9E c1269780j9E = ((C1266350j3h) this.l1).LLLILZLLLI;
        if (c1269780j9E != null) {
            c1269780j9E.LLIZLLLIL = this.i2;
        }
    }

    public final void LIZ$2() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAudioCaptureError: code ");
        sbLIZ.append(this.i2);
        sbLIZ.append(", message ");
        sbLIZ.append(((Exception) this.l0).toString());
        AVLog.ioe("LiveStream", C2188811AlT.LIZIZ(sbLIZ));
        ((C1266350j3h) this.l1).LLJZ.set(8);
        ((C1266350j3h) this.l1).LLLIIL(3, this.i2, (Exception) this.l0);
        C1269780j9E c1269780j9E = ((C1266350j3h) this.l1).LLLILZLLLI;
        if (c1269780j9E != null) {
            c1269780j9E.LLIZ = this.i2;
        }
    }

    public static final void run$0(ARunnableS26S0201000_20 aRunnableS26S0201000_20) {
        boolean zLIZ;
        C1C7U.LIZ("TECameraServer@d252.setISO$1");
        try {
            ((b0) aRunnableS26S0201000_20.l1).setISO((TECameraCapture) aRunnableS26S0201000_20.l0, aRunnableS26S0201000_20.i2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TECameraServer@d252.setISO$1");
    }

    public static final void run$1(ARunnableS26S0201000_20 aRunnableS26S0201000_20) {
        boolean zLIZ;
        C1C7U.LIZ("TECameraServer@d252.switchFlashMode$1");
        try {
            ((b0) aRunnableS26S0201000_20.l1).switchFlashMode((TECameraCapture) aRunnableS26S0201000_20.l0, aRunnableS26S0201000_20.i2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TECameraServer@d252.switchFlashMode$1");
    }

    public static final void run$10(ARunnableS26S0201000_20 aRunnableS26S0201000_20) {
        boolean zLIZ;
        C1298720jtu c1298720jtu;
        C1C7U.LIZ("LynxIntersectionObserverManager@1299.sendIntersectionObserverEvent$1");
        try {
            C1298700jts c1298700jts = new C1298700jts(aRunnableS26S0201000_20.i2, "intersection", (JavaOnlyMap) aRunnableS26S0201000_20.l0);
            s sVar = ((C1298340jtI) aRunnableS26S0201000_20.l1).LJIL.get();
            if (sVar != null && (c1298720jtu = sVar.LLIZ) != null) {
                c1298720jtu.LIZIZ(c1298700jts);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxIntersectionObserverManager@1299.sendIntersectionObserverEvent$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [X.0jcm] */
    /* JADX WARN: Type inference failed for: r2v8, types: [X.0jcl] */
    public static final void run$11(ARunnableS26S0201000_20 aRunnableS26S0201000_20) {
        InterfaceC1288130jcp interfaceC1288130jcp;
        BaseAbility baseAbility = (BaseAbility) aRunnableS26S0201000_20.l0;
        int i = aRunnableS26S0201000_20.i2;
        final Map map = (Map) aRunnableS26S0201000_20.l1;
        baseAbility.getClass();
        C1C7U.LIZ("BaseAbility@bf69.sendEventOnUI$1L");
        if (!((CopyOnWriteArrayList) baseAbility.LIZ).isEmpty()) {
            switch (C1288150jcr.LIZ[EnumC1288160jcs.values()[i].ordinal()]) {
                case 1:
                    C1288070jcj c1288070jcj = new C1288070jcj(map);
                    Iterator it2 = ((CopyOnWriteArrayList) baseAbility.LIZ).iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC1288110jcn) it2.next()).LJ(c1288070jcj);
                    }
                    break;
                case 2:
                    C1288070jcj c1288070jcj2 = new C1288070jcj(map);
                    Iterator it3 = ((CopyOnWriteArrayList) baseAbility.LIZ).iterator();
                    while (it3.hasNext()) {
                        ((InterfaceC1288110jcn) it3.next()).LJIIIZ(c1288070jcj2);
                    }
                    break;
                case 3:
                    C1288070jcj c1288070jcj3 = new C1288070jcj(map);
                    Iterator it4 = ((CopyOnWriteArrayList) baseAbility.LIZ).iterator();
                    while (it4.hasNext()) {
                        ((InterfaceC1288110jcn) it4.next()).LIZJ(c1288070jcj3);
                    }
                    break;
                case 4:
                    C1288070jcj c1288070jcj4 = new C1288070jcj(map);
                    Iterator it5 = ((CopyOnWriteArrayList) baseAbility.LIZ).iterator();
                    while (it5.hasNext()) {
                        ((InterfaceC1288110jcn) it5.next()).LJIIJ(c1288070jcj4);
                    }
                    break;
                case 5:
                    C1288070jcj c1288070jcj5 = new C1288070jcj(map);
                    Iterator it6 = ((CopyOnWriteArrayList) baseAbility.LIZ).iterator();
                    while (it6.hasNext()) {
                        ((InterfaceC1288110jcn) it6.next()).LJIIJJI(c1288070jcj5);
                    }
                    break;
                case 6:
                    C1288060jci c1288060jci = new C1288060jci(map);
                    Iterator it7 = ((CopyOnWriteArrayList) baseAbility.LIZ).iterator();
                    while (it7.hasNext()) {
                        ((InterfaceC1288110jcn) it7.next()).LJIIIIZZ(c1288060jci);
                    }
                    break;
                case 7:
                    C1288070jcj c1288070jcj6 = new C1288070jcj(map);
                    Iterator it8 = ((CopyOnWriteArrayList) baseAbility.LIZ).iterator();
                    while (it8.hasNext()) {
                        ((InterfaceC1288110jcn) it8.next()).LIZ(c1288070jcj6);
                    }
                    break;
                case 8:
                    ?? r2 = new C1288070jcj(map) { // from class: X.0jcl
                    };
                    Iterator it9 = ((CopyOnWriteArrayList) baseAbility.LIZ).iterator();
                    while (it9.hasNext()) {
                        ((InterfaceC1288110jcn) it9.next()).LJFF(r2);
                    }
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    C1288070jcj c1288070jcj7 = new C1288070jcj(map);
                    Iterator it10 = ((CopyOnWriteArrayList) baseAbility.LIZ).iterator();
                    while (it10.hasNext()) {
                        ((InterfaceC1288110jcn) it10.next()).LIZLLL(c1288070jcj7);
                    }
                    WeakReference<InterfaceC1288130jcp> weakReference = baseAbility.LIZIZ;
                    if (weakReference != null && (interfaceC1288130jcp = weakReference.get()) != null) {
                        interfaceC1288130jcp.LIZ();
                    }
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    ?? r22 = new C1288070jcj(map) { // from class: X.0jcm
                    };
                    Iterator it11 = ((CopyOnWriteArrayList) baseAbility.LIZ).iterator();
                    while (it11.hasNext()) {
                        ((InterfaceC1288110jcn) it11.next()).LJII(r22);
                    }
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    C1288070jcj c1288070jcj8 = new C1288070jcj(map);
                    if (baseAbility.LJFF) {
                        Iterator it12 = ((CopyOnWriteArrayList) baseAbility.LIZ).iterator();
                        while (it12.hasNext()) {
                            ((InterfaceC1288110jcn) it12.next()).LIZIZ(c1288070jcj8);
                        }
                    } else {
                        baseAbility.LJI = c1288070jcj8;
                    }
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    C1288060jci c1288060jci2 = new C1288060jci(map);
                    Iterator it13 = ((CopyOnWriteArrayList) baseAbility.LIZ).iterator();
                    while (it13.hasNext()) {
                        ((InterfaceC1288110jcn) it13.next()).LJI(c1288060jci2);
                    }
                    break;
            }
        }
        C1C7U.LIZIZ("BaseAbility@bf69.sendEventOnUI$1L");
    }

    public static final void run$12(ARunnableS26S0201000_20 aRunnableS26S0201000_20) {
        boolean zLIZ;
        C1C7U.LIZ("RecorderManager@dfee.onVideoCaptureError$1");
        try {
            ((C1270500jAO) aRunnableS26S0201000_20.l1).LLJJ.LIZIZ(aRunnableS26S0201000_20.i2, (Exception) aRunnableS26S0201000_20.l0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RecorderManager@dfee.onVideoCaptureError$1");
    }

    public static final void run$13(ARunnableS26S0201000_20 aRunnableS26S0201000_20) {
        boolean zLIZ;
        C1C7U.LIZ("SDUIIntersectionObserverManager@858.sendIntersectionObserverEvent$1");
        try {
            aRunnableS26S0201000_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SDUIIntersectionObserverManager@858.sendIntersectionObserverEvent$1");
    }

    public static final void run$14(ARunnableS26S0201000_20 aRunnableS26S0201000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LynxImageManager$ImageRequestHandle@b296.onFailure$1");
        try {
            ((C1316590kMj) aRunnableS26S0201000_20.l1).LIZ.LIZJ(aRunnableS26S0201000_20.i2, (Throwable) aRunnableS26S0201000_20.l0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxImageManager$ImageRequestHandle@b296.onFailure$1");
    }

    public static final void run$15(ARunnableS26S0201000_20 aRunnableS26S0201000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LiveStream@24e7.onVideoCaptureError$1");
        try {
            aRunnableS26S0201000_20.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveStream@24e7.onVideoCaptureError$1");
    }

    public static final void run$16(ARunnableS26S0201000_20 aRunnableS26S0201000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LiveStream@24e7.onAudioCaptureError$1");
        try {
            aRunnableS26S0201000_20.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveStream@24e7.onAudioCaptureError$1");
    }

    public static final void run$17(ARunnableS26S0201000_20 aRunnableS26S0201000_20) {
        boolean zLIZ;
        C1C7U.LIZ("CameraVideoCapturer@8f5e.onError$1");
        try {
            ((C1270610jAZ) aRunnableS26S0201000_20.l1).LLJJJJJIL(aRunnableS26S0201000_20.i2, (Exception) aRunnableS26S0201000_20.l0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CameraVideoCapturer@8f5e.onError$1");
    }

    public static final void run$18(ARunnableS26S0201000_20 aRunnableS26S0201000_20) {
        C1270620jAa c1270620jAa = (C1270620jAa) aRunnableS26S0201000_20.l0;
        int i = aRunnableS26S0201000_20.i2;
        Exception exc = (Exception) aRunnableS26S0201000_20.l1;
        C1C7U.LIZ("CameraCaptureManager@b43e.onError$1L");
        c1270620jAa.LJIIIIZZ(i, exc);
        C1C7U.LIZIZ("CameraCaptureManager@b43e.onError$1L");
    }

    public static final void run$2(ARunnableS26S0201000_20 aRunnableS26S0201000_20) {
        boolean zLIZ;
        C1C7U.LIZ("TECameraServer@d252.switchCameraMode$1");
        try {
            ((b0) aRunnableS26S0201000_20.l1).switchCameraMode((TECameraCapture) aRunnableS26S0201000_20.l0, aRunnableS26S0201000_20.i2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TECameraServer@d252.switchCameraMode$1");
    }

    public static final void run$3(ARunnableS26S0201000_20 aRunnableS26S0201000_20) {
        boolean zLIZ;
        C1C7U.LIZ("TECameraServer@d252.changeCurrentControlCam$1");
        try {
            ((b0) aRunnableS26S0201000_20.l1).changeCurrentControlCam((TECameraCapture) aRunnableS26S0201000_20.l0, aRunnableS26S0201000_20.i2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TECameraServer@d252.changeCurrentControlCam$1");
    }

    public static final void run$4(ARunnableS26S0201000_20 aRunnableS26S0201000_20) throws IOException {
        String str;
        EventRequest eventRequest;
        SparkHostApiImpl sparkHostApiImplLLIZ;
        C1317760kOc c1317760kOc = (C1317760kOc) aRunnableS26S0201000_20.l0;
        AbsSerializedData absSerializedData = (AbsSerializedData) aRunnableS26S0201000_20.l1;
        int i = aRunnableS26S0201000_20.i2;
        C1C7U.LIZ("SDUINetworkHandler@66f6.sendRequestInner$1L");
        C1317350kNx c1317350kNx = C1317350kNx.LIZIZ;
        ISparkHostApi iSparkHostApi = c1317350kNx.LIZ.LIZIZ.LIZIZ;
        if (iSparkHostApi == null || (sparkHostApiImplLLIZ = iSparkHostApi.LLIZ()) == null || !sparkHostApiImplLLIZ.LLLIIL()) {
            C1290750jh3.LIZJ(2000L, new ARunnableS26S0201000_20(new WeakReference(c1317760kOc.LIZIZ), i, absSerializedData, 5));
        }
        if ((absSerializedData instanceof EventRequest) && (eventRequest = (EventRequest) absSerializedData) != null) {
            eventRequest.LIZLLL = c1317760kOc.LJIIL;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean z = C1317810kOh.LJIIJJI;
        if (z) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            absSerializedData.LIZ(gZIPOutputStream);
            gZIPOutputStream.close();
        } else {
            absSerializedData.LIZ(byteArrayOutputStream);
            byteArrayOutputStream.close();
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        c1317760kOc.LJIIJJI.put(Long.valueOf(c1317760kOc.LJIIL), new C1317900kOq(System.currentTimeMillis(), byteArray.length, byteArray.length));
        c1317760kOc.LJIIL++;
        SDUIWsServiceImpl sDUIWsServiceImpl = c1317350kNx.LIZ;
        C1317860kOm c1317860kOm = new C1317860kOm();
        c1317860kOm.LIZ = byteArray;
        if (!z) {
            str = "pb";
        } else {
            str = "gzip";
        }
        c1317860kOm.LIZJ = str;
        c1317860kOm.LIZIZ = "pb";
        c1317860kOm.LJ = i;
        sDUIWsServiceImpl.LIZLLL(c1317860kOm);
        C1C7U.LIZIZ("SDUINetworkHandler@66f6.sendRequestInner$1L");
    }

    public static final void run$5(ARunnableS26S0201000_20 aRunnableS26S0201000_20) {
        boolean zLLLIIL;
        SparkHostApiImpl sparkHostApiImplLLIZ;
        WeakReference weakReference = (WeakReference) aRunnableS26S0201000_20.l0;
        int i = aRunnableS26S0201000_20.i2;
        AbsSerializedData absSerializedData = (AbsSerializedData) aRunnableS26S0201000_20.l1;
        C1C7U.LIZ("SDUINetworkHandler@66f6.sendRequestInner$lambda-15$1L");
        ISparkHostApi iSparkHostApi = C1317350kNx.LIZIZ.LIZ.LIZIZ.LIZIZ;
        if (iSparkHostApi != null && (sparkHostApiImplLLIZ = iSparkHostApi.LLIZ()) != null) {
            zLLLIIL = sparkHostApiImplLLIZ.LLLIIL();
        } else {
            zLLLIIL = false;
        }
        if (zLLLIIL) {
            InterfaceC1317880kOo interfaceC1317880kOo = (InterfaceC1317880kOo) weakReference.get();
            if (interfaceC1317880kOo != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("method: ");
                sbLIZ.append(i);
                sbLIZ.append(" not available, available:$ data: ");
                sbLIZ.append(absSerializedData);
                interfaceC1317880kOo.LIZJ(new C1291190jhl(302, C2188811AlT.LIZIZ(sbLIZ)));
            }
        } else {
            InterfaceC1317880kOo interfaceC1317880kOo2 = (InterfaceC1317880kOo) weakReference.get();
            if (interfaceC1317880kOo2 != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("method: ");
                sbLIZ2.append(i);
                sbLIZ2.append(" not available, available:$ data: ");
                sbLIZ2.append(absSerializedData);
                interfaceC1317880kOo2.LIZJ(new C1291190jhl(303, C2188811AlT.LIZIZ(sbLIZ2)));
            }
        }
        C1C7U.LIZIZ("SDUINetworkHandler@66f6.sendRequestInner$lambda-15$1L");
    }

    public static final void run$6(ARunnableS26S0201000_20 aRunnableS26S0201000_20) {
        C1272100jCy c1272100jCy = (C1272100jCy) aRunnableS26S0201000_20.l0;
        String[] strArr = (String[]) aRunnableS26S0201000_20.l1;
        int i = aRunnableS26S0201000_20.i2;
        C1C7U.LIZ("VideoEffectNode@5e69.composerRemoveNodes$1L");
        if (c1272100jCy.LJIILIIL()) {
            InterfaceC1272120jD0 interfaceC1272120jD0 = c1272100jCy.LLILZ;
            if (interfaceC1272120jD0 != null) {
                interfaceC1272120jD0.composerRemoveNodes(strArr, i);
            }
            if (c1272100jCy.LLILLL.LIZ.ttlhABSettingsConfigs.LJFF()) {
                c1272100jCy.LLJLLL = true;
            }
            c1272100jCy.LLJJJJJIL = "";
        }
        C1C7U.LIZIZ("VideoEffectNode@5e69.composerRemoveNodes$1L");
    }

    public static final void run$7(ARunnableS26S0201000_20 aRunnableS26S0201000_20) {
        boolean zLIZ;
        C1C7U.LIZ("FontFaceManager@c8f5.findOrLoadFontFace$1");
        try {
            LynxLog.i("Lynx", "load font success");
            ((InterfaceC1301080jxi) aRunnableS26S0201000_20.l0).LIZIZ((Typeface) aRunnableS26S0201000_20.l1, aRunnableS26S0201000_20.i2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FontFaceManager@c8f5.findOrLoadFontFace$1");
    }

    public static final void run$8(ARunnableS26S0201000_20 aRunnableS26S0201000_20) {
        boolean zLIZ;
        C1C7U.LIZ("FontFaceManager@c8f5.findOrLoadFontFace$2");
        try {
            LynxLog.i("Lynx", "load font success");
            ((InterfaceC1301080jxi) aRunnableS26S0201000_20.l0).LIZIZ((Typeface) aRunnableS26S0201000_20.l1, aRunnableS26S0201000_20.i2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FontFaceManager@c8f5.findOrLoadFontFace$2");
    }

    public static final void run$9(ARunnableS26S0201000_20 aRunnableS26S0201000_20) {
        s sVar = (s) aRunnableS26S0201000_20.l0;
        int i = aRunnableS26S0201000_20.i2;
        InterfaceC1309740kBg interfaceC1309740kBg = (InterfaceC1309740kBg) aRunnableS26S0201000_20.l1;
        sVar.getClass();
        C1C7U.LIZ("LynxContext@bef7.findShadowNodeAndRunTask$1L");
        C1311770kEx c1311770kEx = sVar.LLJJIJIL.get();
        if (c1311770kEx != null) {
            interfaceC1309740kBg.LIZ(c1311770kEx.LJI.LIZ(i));
        }
        C1C7U.LIZIZ("LynxContext@bef7.findShadowNodeAndRunTask$1L");
    }

    public ARunnableS26S0201000_20(Object obj, int i, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i2 = i;
        this.l1 = obj2;
    }
}
