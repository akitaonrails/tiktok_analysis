package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS7S0501000_19;
import kotlin.jvm.internal.AwS93S0500000_25;

/* JADX INFO: renamed from: X.0iSO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1243220iSO {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x028a  */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0tpg, X.13ZC] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r33v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.DialogC1389620mGW r34, kotlin.jvm.functions.Function0<kotlin.Unit> r35, X.InterfaceC1631620sYq<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> r36, com.ss.android.ugc.aweme.account.org.permissions.InvitePageViewModel r37, X.InterfaceC1680500tpg r38, int r39, int r40) {
        /*
            Method dump skipped, instruction units count: 1071
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1243220iSO.LIZ(X.0mGW, kotlin.jvm.functions.Function0, X.0sYq, com.ss.android.ugc.aweme.account.org.permissions.InvitePageViewModel, X.0tpg, int, int):void");
    }

    public static final void LIZIZ(Integer num, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1371247534);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(num)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function02)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJII(function03)) {
                i4 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJII(function04)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((i2 & 9363) == 9362 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1672790tdF.LIZIZ(null, false, false, false, false, false, null, 0L, null, function04, false, 0L, 0L, null, C13Z4.LIZJ(-1762286558, new AwS93S0500000_25((Function0) function0, function02, (Function0<Unit>) num, (Integer) function03, function04, (Function0<Unit>) 0), c13zcLJIIJ), c13zcLJIIJ, (i2 << 15) & 1879048192, 24576, 15871);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS7S0501000_19(num, (Integer) function0, function02, function03, function04, (Function0<Unit>) i, 1);
        }
    }
}
