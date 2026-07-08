package X;

import androidx.compose.ui.graphics.BlockGraphicsLayerElement;
import androidx.compose.ui.graphics.GraphicsLayerElement;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0toK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1679660toK {
    public static final InterfaceC1685750ty9 LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, Function1<? super InterfaceC1679550to9, Unit> function1) {
        return interfaceC1685750ty9.LIZ(new BlockGraphicsLayerElement(function1));
    }

    public static InterfaceC1685750ty9 LIZIZ(InterfaceC1685750ty9 interfaceC1685750ty9, float f, float f2, float f3, float f4, float f5, long j, InterfaceC1680710tq1 interfaceC1680710tq1, boolean z, int i, int i2) {
        float f6;
        long j2;
        boolean z2 = z;
        InterfaceC1680710tq1 interfaceC1680710tq12 = interfaceC1680710tq1;
        float f7 = f5;
        long j3 = j;
        float f8 = f4;
        float f9 = f3;
        float f10 = f2;
        float f11 = f;
        if ((i2 & 1) != 0) {
            f11 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f10 = 1.0f;
        }
        if ((i2 & 4) != 0) {
            f9 = 1.0f;
        }
        if ((i2 & 128) != 0) {
            f8 = 0.0f;
        }
        if ((i2 & 256) != 0) {
            f7 = 0.0f;
        }
        if ((i2 & 512) != 0) {
            f6 = 8.0f;
        } else {
            f6 = 0.0f;
        }
        if ((i2 & 1024) != 0) {
            j3 = C1676680tjW.LIZIZ;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            interfaceC1680710tq12 = C1669430tXp.LIZ;
        }
        int i3 = 0;
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z2 = false;
        }
        long j4 = 0;
        if ((i2 & 16384) != 0) {
            j2 = C1679650toJ.LIZ;
        } else {
            j2 = 0;
        }
        if ((32768 & i2) != 0) {
            j4 = C1679650toJ.LIZ;
        }
        if ((i2 & 65536) == 0) {
            i3 = i;
        }
        return interfaceC1685750ty9.LIZ(new GraphicsLayerElement(f11, f10, f9, 0.0f, 0.0f, 0.0f, 0.0f, f8, f7, f6, j3, interfaceC1680710tq12, z2, null, j2, j4, i3));
    }
}
