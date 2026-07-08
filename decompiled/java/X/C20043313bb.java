package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.AwS124S0201000_25;

/* JADX INFO: renamed from: X.13bb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20043313bb {
    public static final void LIZ(InterfaceC1690480u5m interfaceC1690480u5m, Object obj, int i, Object obj2, InterfaceC1680500tpg interfaceC1680500tpg, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1439843069);
        if ((i2 & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1690480u5m)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(obj)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & 384) == 0) {
            if (c13zcLJIIJ.LJIJI(i)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i2 & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(obj2)) {
                i4 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (c13zcLJIIJ.LJIJJLI(i3 & 1, z)) {
            ((InterfaceC20043013bY) obj).LIZLLL(obj2, C13Z4.LIZJ(980966366, new AwS124S0201000_25(i, interfaceC1690480u5m, obj2, 96), c13zcLJIIJ), c13zcLJIIJ, 48);
        } else {
            c13zcLJIIJ.LIZJ();
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C20043413bc(interfaceC1690480u5m, obj, i, obj2, i2);
        }
    }
}
