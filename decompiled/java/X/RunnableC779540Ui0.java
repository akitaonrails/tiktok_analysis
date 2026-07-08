package X;

import com.bytedance.android.livesdk.broadcast.utils.LiveAudioDevicesDetector;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0Ui0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class RunnableC779540Ui0 implements Runnable {
    public static final RunnableC779540Ui0 LL = new RunnableC779540Ui0();

    public static void LIZ() {
        boolean z;
        boolean z2 = true;
        if (LiveAudioDevicesDetector.LJ) {
            LiveAudioDevicesDetector.LIZ.getClass();
            Iterator<Map.Entry<Integer, Integer>> it2 = LiveAudioDevicesDetector.LJIIL.entrySet().iterator();
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            while (it2.hasNext()) {
                int iIntValue = it2.next().getKey().intValue();
                if (iIntValue != 3 && iIntValue != 4) {
                    if (iIntValue != 7) {
                        if (iIntValue == 8) {
                            z5 = true;
                        } else if (iIntValue != 22) {
                            if (iIntValue == 23 || iIntValue == 26) {
                            }
                        }
                    }
                    z4 = true;
                }
                z3 = true;
            }
            if (z3 != LiveAudioDevicesDetector.LJFF) {
                LiveAudioDevicesDetector.LJFF = z3;
                z = true;
            } else {
                z = false;
            }
            if (z4 != LiveAudioDevicesDetector.LJI) {
                LiveAudioDevicesDetector.LJI = z4;
                z = true;
            }
            if (z5 != LiveAudioDevicesDetector.LJII) {
                LiveAudioDevicesDetector.LJII = z5;
            } else {
                if (z) {
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateEchoDataStatus, hasWiredHeadset: ");
                sbLIZ.append(z3);
                sbLIZ.append(", hasBluetoothHeadset: ");
                sbLIZ.append(z4);
                sbLIZ.append(", hasBluetoothA2dp: ");
                sbLIZ.append(z5);
                C20441214yg.LIZIZ("BroadcastAudioDevicesDetector", C2188811AlT.LIZIZ(sbLIZ));
            }
            C768620UDc c768620UDc = C768620UDc.LIZ;
            c768620UDc.getClass();
            if (!z3 || z4 || z5 || !c768620UDc.LJI()) {
                c768620UDc.LJII(false, false, false);
            } else {
                c768620UDc.LJII(true, false, false);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateEchoDataStatus, hasWiredHeadset: ");
            sbLIZ2.append(z3);
            sbLIZ2.append(", hasBluetoothHeadset: ");
            sbLIZ2.append(z4);
            sbLIZ2.append(", hasBluetoothA2dp: ");
            sbLIZ2.append(z5);
            C20441214yg.LIZIZ("BroadcastAudioDevicesDetector", C2188811AlT.LIZIZ(sbLIZ2));
        }
        LiveAudioDevicesDetector.LIZ.getClass();
        Iterator<Map.Entry<Integer, Integer>> it3 = LiveAudioDevicesDetector.LJIIL.entrySet().iterator();
        boolean z6 = false;
        boolean z7 = false;
        while (it3.hasNext()) {
            int iIntValue2 = it3.next().getKey().intValue();
            if (iIntValue2 != 3 && iIntValue2 != 4) {
                if (iIntValue2 != 7 && iIntValue2 != 8) {
                    if (iIntValue2 != 22) {
                        if (iIntValue2 == 23 || iIntValue2 == 26) {
                        }
                    }
                }
                z7 = true;
            }
            z6 = true;
        }
        if (LiveAudioDevicesDetector.LIZIZ != z6) {
            LiveAudioDevicesDetector.LIZIZ = z6;
            Iterator<InterfaceC779560Ui2> it4 = LiveAudioDevicesDetector.LJIIIIZZ.iterator();
            while (it4.hasNext()) {
                it4.next().LJFF(z6);
            }
        }
        if (LiveAudioDevicesDetector.LIZJ != z7) {
            LiveAudioDevicesDetector.LIZJ = z7;
            Iterator<InterfaceC779560Ui2> it5 = LiveAudioDevicesDetector.LJIIIIZZ.iterator();
            while (it5.hasNext()) {
                it5.next().LJIIIZ();
            }
        }
        LiveAudioDevicesDetector.LIZ.getClass();
        boolean z8 = LiveAudioDevicesDetector.LIZLLL;
        if (!LiveAudioDevicesDetector.LIZIZ && !LiveAudioDevicesDetector.LIZJ) {
            z2 = false;
        }
        LiveAudioDevicesDetector.LIZLLL = z2;
        if (z2) {
            if (z8) {
                return;
            }
            Iterator<InterfaceC779560Ui2> it6 = LiveAudioDevicesDetector.LJIIIIZZ.iterator();
            while (it6.hasNext()) {
                it6.next().LJIIIIZZ();
            }
            return;
        }
        if (z8) {
            Iterator<InterfaceC779560Ui2> it7 = LiveAudioDevicesDetector.LJIIIIZZ.iterator();
            while (it7.hasNext()) {
                it7.next().LIZJ();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LiveAudioDevicesDetector@431e.onDevicesChanged$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveAudioDevicesDetector@431e.onDevicesChanged$1");
    }
}
