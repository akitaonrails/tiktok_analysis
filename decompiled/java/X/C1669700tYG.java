package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS199S1100000_25;
import kotlin.jvm.internal.AwS8S2201000_25;

/* JADX INFO: renamed from: X.0tYG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1669700tYG {
    public static final void LIZ(String str, String str2, Function0<Unit> function0, Function0<Unit> function02, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1036157653);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJII(function02)) {
                i3 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) == 1170 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1668330tW3.LJI(function02, false, null, false, null, null, str, null, null, C13Z4.LIZJ(-73714304, new AwS199S1100000_25(str2, (String) function0, (Function0<Unit>) 1), c13zcLJIIJ), null, c13zcLJIIJ, ((i2 << 18) & 3670016) | ((i2 >> 9) & 14) | 805309440, 0, 1462);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS8S2201000_25(str, str2, (String) function0, function02, (Function0<Unit>) i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(X.DialogC1389620mGW r59, java.lang.String r60, kotlin.jvm.functions.Function0<kotlin.Unit> r61, kotlin.jvm.functions.Function0<kotlin.Unit> r62, com.ss.android.ugc.aweme.account.passwordless.leaked.NoPasskeyPageViewModel r63, X.InterfaceC1680500tpg r64, int r65, int r66) {
        /*
            Method dump skipped, instruction units count: 1660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1669700tYG.LIZIZ(X.0mGW, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, com.ss.android.ugc.aweme.account.passwordless.leaked.NoPasskeyPageViewModel, X.0tpg, int, int):void");
    }
}
