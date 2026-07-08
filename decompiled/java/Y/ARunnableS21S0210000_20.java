package Y;

import X.C1269300j8S;
import X.C1270500jAO;
import X.C1273190jEj;
import X.C1273200jEk;
import X.C1277540jLk;
import X.C1277690jLz;
import X.C1321640kUs;
import X.C1C7U;
import X.C2188811AlT;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttvecamera.TECameraCapture;
import com.ss.android.ttvecamera.b0;
import com.ss.ttlivestreamer.core.engine.Transport;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.tts.oecverify.BdTuring;
import org.json.JSONException;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS21S0210000_20 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (!this.z2) {
            C1270500jAO c1270500jAO = (C1270500jAO) this.l1;
            c1270500jAO.LLJJL.add((Transport.c) this.l0);
        } else {
            C1270500jAO c1270500jAO2 = (C1270500jAO) this.l1;
            while (!c1270500jAO2.LLJJL.isEmpty()) {
                c1270500jAO2.LJIIIZ((Transport.c) ListProtector.remove(c1270500jAO2.LLJJL, 0));
            }
            ((C1270500jAO) this.l1).LJIIIZ((Transport.c) this.l0);
        }
    }

    public static final void run$0(ARunnableS21S0210000_20 aRunnableS21S0210000_20) {
        int iEnableCalculateAudioLoudness;
        C1277540jLk c1277540jLk = (C1277540jLk) aRunnableS21S0210000_20.l0;
        int[] iArr = (int[]) aRunnableS21S0210000_20.l1;
        boolean z = aRunnableS21S0210000_20.z2;
        c1277540jLk.getClass();
        C1C7U.LIZ("VeLivePusherWrapper@9eaa.enableCalculateAudioLoudness$1L");
        if (c1277540jLk.LIZ != null) {
            iEnableCalculateAudioLoudness = c1277540jLk.LIZ.enableCalculateAudioLoudness(z);
        } else {
            iEnableCalculateAudioLoudness = 0;
        }
        iArr[0] = iEnableCalculateAudioLoudness;
        C1C7U.LIZIZ("VeLivePusherWrapper@9eaa.enableCalculateAudioLoudness$1L");
    }

    public static final void run$1(ARunnableS21S0210000_20 aRunnableS21S0210000_20) throws JSONException {
        String strLIZIZ;
        String strLIZIZ2;
        String name;
        C1277540jLk c1277540jLk = (C1277540jLk) aRunnableS21S0210000_20.l0;
        C1277690jLz c1277690jLz = (C1277690jLz) aRunnableS21S0210000_20.l1;
        boolean z = aRunnableS21S0210000_20.z2;
        c1277540jLk.getClass();
        C1C7U.LIZ("VeLivePusherWrapper@9eaa.createLivePusher$1L");
        synchronized (c1277540jLk) {
            try {
                c1277540jLk.LIZ = c1277540jLk.LIZ(c1277540jLk.LJ, c1277690jLz, z);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[VeLivePusherWrapper#createLivePusher] replay wrapper=");
        if (c1277540jLk.LJIIZILJ == null) {
            strLIZIZ = "null";
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c1277540jLk.LJIIZILJ.getClass().getName());
            sbLIZ2.append(e3.g);
            sbLIZ2.append(System.identityHashCode(c1277540jLk.LJIIZILJ));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        sbLIZ.append(strLIZIZ);
        sbLIZ.append(", pusher=");
        if (c1277540jLk.LIZ == null) {
            strLIZIZ2 = "null";
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(c1277540jLk.LIZ.getClass().getName());
            sbLIZ3.append(e3.g);
            sbLIZ3.append(System.identityHashCode(c1277540jLk.LIZ));
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
        }
        sbLIZ.append(strLIZIZ2);
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("createLivePusher replay wrapper=");
        sbLIZ4.append(c1277540jLk.LJIIZILJ);
        sbLIZ4.append(", pusher=");
        if (c1277540jLk.LIZ == null) {
            name = "null";
        } else {
            name = c1277540jLk.LIZ.getClass().getName();
        }
        sbLIZ4.append(name);
        C2188811AlT.LIZIZ(sbLIZ4);
        if (c1277540jLk.LIZ != null && c1277540jLk.LJIIZILJ != null) {
            c1277540jLk.LIZ.setVideoSource(c1277540jLk.LJIIZILJ);
        }
        C1269300j8S c1269300j8S = c1277540jLk.LJIILIIL;
        if (c1269300j8S != null) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("createLivePusher end, pusher-->");
            sbLIZ5.append(c1277540jLk.LIZ);
            sbLIZ5.append(", isNoRoomUrlCheckFail-->");
            sbLIZ5.append(z);
            c1269300j8S.LIZ("pusher_api_call", "createLivePusher", "", C2188811AlT.LIZIZ(sbLIZ5));
        }
        C1C7U.LIZIZ("VeLivePusherWrapper@9eaa.createLivePusher$1L");
    }

    public static final void run$2(ARunnableS21S0210000_20 aRunnableS21S0210000_20) {
        C1277540jLk c1277540jLk = (C1277540jLk) aRunnableS21S0210000_20.l0;
        String[] strArr = (String[]) aRunnableS21S0210000_20.l1;
        boolean z = aRunnableS21S0210000_20.z2;
        c1277540jLk.getClass();
        C1C7U.LIZ("VeLivePusherWrapper@9eaa.startPush$2L");
        synchronized (c1277540jLk) {
            try {
                c1277540jLk.LJII(z, strArr);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1C7U.LIZIZ("VeLivePusherWrapper@9eaa.startPush$2L");
    }

    public static final void run$3(ARunnableS21S0210000_20 aRunnableS21S0210000_20) {
        boolean zLIZ;
        C1C7U.LIZ("TECameraServer@d252.setAutoFocusLock$1");
        try {
            ((b0) aRunnableS21S0210000_20.l1).setAutoFocusLock((TECameraCapture) aRunnableS21S0210000_20.l0, aRunnableS21S0210000_20.z2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TECameraServer@d252.setAutoFocusLock$1");
    }

    public static final void run$4(ARunnableS21S0210000_20 aRunnableS21S0210000_20) {
        boolean zLIZ;
        C1C7U.LIZ("TECameraServer@d252.stop$1");
        try {
            C1321640kUs.LIZ("TECameraServer-post-stop");
            ((b0) aRunnableS21S0210000_20.l1).stop((TECameraCapture) aRunnableS21S0210000_20.l0, aRunnableS21S0210000_20.z2);
            if (aRunnableS21S0210000_20.z2) {
                ((b0) aRunnableS21S0210000_20.l1).mCameraClientCondition.open();
            }
            C1321640kUs.LIZIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TECameraServer@d252.stop$1");
    }

    public static final void run$5(ARunnableS21S0210000_20 aRunnableS21S0210000_20) {
        boolean zLIZ;
        C1C7U.LIZ("TECameraServer@d252.toggleTorch$1");
        try {
            ((b0) aRunnableS21S0210000_20.l1).toggleTorch((TECameraCapture) aRunnableS21S0210000_20.l0, aRunnableS21S0210000_20.z2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TECameraServer@d252.toggleTorch$1");
    }

    public static final void run$6(ARunnableS21S0210000_20 aRunnableS21S0210000_20) {
        boolean zLIZ;
        C1C7U.LIZ("TECameraServer@d252.enableMulticamZoom$1");
        try {
            ((b0) aRunnableS21S0210000_20.l1).enableMulticamZoom((TECameraCapture) aRunnableS21S0210000_20.l0, aRunnableS21S0210000_20.z2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TECameraServer@d252.enableMulticamZoom$1");
    }

    public static final void run$7(ARunnableS21S0210000_20 aRunnableS21S0210000_20) {
        boolean zLIZ;
        C1C7U.LIZ("TECameraServer@d252.setAutoExposureLock$1");
        try {
            ((b0) aRunnableS21S0210000_20.l1).setAutoExposureLock((TECameraCapture) aRunnableS21S0210000_20.l0, aRunnableS21S0210000_20.z2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TECameraServer@d252.setAutoExposureLock$1");
    }

    public static final void run$8(ARunnableS21S0210000_20 aRunnableS21S0210000_20) {
        boolean zLIZ;
        C1C7U.LIZ("RecorderManager@dfee.receiverPacket$1");
        try {
            aRunnableS21S0210000_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RecorderManager@dfee.receiverPacket$1");
    }

    public static final void run$9(ARunnableS21S0210000_20 aRunnableS21S0210000_20) {
        boolean z = aRunnableS21S0210000_20.z2;
        C1273200jEk c1273200jEk = (C1273200jEk) aRunnableS21S0210000_20.l0;
        C1273190jEj c1273190jEj = (C1273190jEj) aRunnableS21S0210000_20.l1;
        C1C7U.LIZ("InteractMixManager@3e6d.forceEffectMix$1L");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("forceEffectMix() called with: boolean = ");
        sbLIZ.append(z);
        sbLIZ.append(", params = ");
        sbLIZ.append(c1273200jEk);
        AVLog.logKibana(4, "InteractMixManager", C2188811AlT.LIZIZ(sbLIZ), null);
        c1273190jEj.LLJILJIL = z;
        c1273190jEj.LLJILJILJ = c1273200jEk;
        C1C7U.LIZIZ("InteractMixManager@3e6d.forceEffectMix$1L");
    }

    public ARunnableS21S0210000_20(Object obj, Object obj2, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.z2 = z;
    }
}
