package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.medialoader.MediaEngine;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS119S1200000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tb6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1671460tb6 {
    public static final C05V6 LIZ;

    static {
        C05V6 c05v6 = new C05V6("AlbumPreview");
        c05v6.LIZ = false;
        LIZ = c05v6;
    }

    public static final boolean LJ(C259800zU<C1677480tko<Float, C1677280tkU>> c259800zU) {
        if (c259800zU.element.LIZLLL().floatValue() > 1.0f) {
            return true;
        }
        return false;
    }

    public static void LIZLLL(InterfaceC497601wk interfaceC497601wk, C259800zU c259800zU, C259800zU c259800zU2, float f, long j) {
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1356705Sr(c259800zU, f, c259800zU2, j, AFwS214S0000000_25.get$arr$(188), null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIIIZZ(androidx.activity.OnBackPressedDispatcher r16, com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel r17, X.AbstractC1690640u62 r18, X.InterfaceC1680500tpg r19, int r20) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1671460tb6.LJIIIIZZ(androidx.activity.OnBackPressedDispatcher, com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel, X.0u62, X.0tpg, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel r13, X.AbstractC1690640u62 r14, X.InterfaceC1685750ty9 r15, X.InterfaceC1680500tpg r16, int r17, int r18) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1671460tb6.LIZ(com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel, X.0u62, X.0ty9, X.0tpg, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel r15, int r16, X.C1683130ttv r17, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r18, X.InterfaceC1680500tpg r19, int r20) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1671460tb6.LIZIZ(com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel, int, X.0ttv, kotlin.jvm.functions.Function1, X.0tpg, int):void");
    }

    public static final void LJFF(InterfaceC497601wk interfaceC497601wk, C1362605Uy c1362605Uy, SocMediaResource socMediaResource, boolean z, C259800zU c259800zU, C259800zU c259800zU2, C259800zU c259800zU3, long j) {
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C05UV(c1362605Uy, socMediaResource, z, j, c259800zU, c259800zU2, c259800zU3, null), 3);
    }

    public static final void LJII(SocMediaResource socMediaResource, Function1<? super EnumC1360305Ub, Unit> function1, Function1<? super String, Unit> function12, Function1<? super Float, Unit> function13, C1683130ttv c1683130ttv, boolean z, MediaEngine mediaEngine, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1912785443);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(socMediaResource)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function12)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i2 |= i7;
        }
        if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJII(function13)) {
                i6 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1683130ttv)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i2 |= i4;
        }
        if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(mediaEngine)) {
                i3 = 1048576;
            } else {
                i3 = 524288;
            }
            i2 |= i3;
        }
        if ((599187 & i2) == 599186 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            LIZJ(socMediaResource, function1, function12, function13, z, c1683130ttv, mediaEngine, true, c13zcLJIIJ, (i2 & 14) | 12582912 | (i2 & 112) | (i2 & 896) | (i2 & 7168) | ((i2 >> 3) & 57344) | (458752 & (i2 << 3)) | (i2 & 3670016), 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1671470tb7(socMediaResource, function1, function12, function13, c1683130ttv, z, mediaEngine, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0373  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource r35, kotlin.jvm.functions.Function1<? super X.EnumC1360305Ub, kotlin.Unit> r36, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r37, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r38, boolean r39, X.C1683130ttv r40, com.ss.android.ugc.aweme.social.creation.mediapicker.ui.medialoader.MediaEngine r41, boolean r42, X.InterfaceC1680500tpg r43, int r44, int r45) {
        /*
            Method dump skipped, instruction units count: 1057
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1671460tb6.LIZJ(com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean, X.0ttv, com.ss.android.ugc.aweme.social.creation.mediapicker.ui.medialoader.MediaEngine, boolean, X.0tpg, int, int):void");
    }

    public static final void LJI(C1362605Uy c1362605Uy, SocMediaResource socMediaResource, boolean z, C1683130ttv c1683130ttv, InterfaceC497601wk interfaceC497601wk, C05P0<Boolean> c05p0, C1677480tko<C1683130ttv, C1677390tkf> c1677480tko, C259800zU<C1677480tko<Float, C1677280tkU>> c259800zU, Function1<? super String, Unit> function1, C259800zU<C1677480tko<Float, C1677280tkU>> c259800zU2, C259800zU<C1677480tko<C1378605aS, C1677270tkT>> c259800zU3, String str) {
        C1683130ttv c1683130ttv2;
        float fMax;
        C05V6 c05v6 = LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Will dismiss ");
        sbLIZ.append(str);
        c05v6.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if ((!Intrinsics.LJFF(c1362605Uy.LIZJ, C1683130ttv.LJ)) && (c1683130ttv2 = c1362605Uy.LIZJ) != null) {
            C1683130ttv c1683130ttvLIZIZ = C1671590tbJ.LIZIZ(socMediaResource.LIZIZ(), c1683130ttv2, z);
            float fMin = (c1683130ttv.LIZJ - c1683130ttv.LIZ) / Math.min(c1683130ttvLIZIZ.LIZJ - c1683130ttvLIZIZ.LIZ, c1683130ttvLIZIZ.LIZLLL - c1683130ttvLIZIZ.LIZIZ);
            C1683130ttv c1683130ttvLIZIZ2 = C1671590tbJ.LIZIZ((((long) Float.floatToRawIntBits(1.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(1.0f)) << 32), C1671590tbJ.LIZIZ(socMediaResource.LIZIZ(), c1683130ttv2, z), true);
            Float fValueOf = Float.valueOf(fMin);
            float f = (c1683130ttv.LIZJ - c1683130ttv.LIZ) / (c1683130ttv2.LIZJ - c1683130ttv2.LIZ);
            float f2 = (c1683130ttv.LIZLLL - c1683130ttv.LIZIZ) / (c1683130ttv2.LIZLLL - c1683130ttv2.LIZIZ);
            if (fValueOf != null) {
                fMax = fValueOf.floatValue();
            } else {
                fMax = Math.max(f, f2);
            }
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(c1683130ttv2.LIZIZ)) & 4294967295L) | (((long) Float.floatToRawIntBits(c1683130ttv2.LIZ)) << 32);
            float f3 = c1683130ttv2.LIZJ;
            float f4 = c1683130ttv2.LIZ;
            float f5 = (c1683130ttv2.LIZLLL - c1683130ttv2.LIZIZ) * fMax;
            float f6 = c1683130ttv.LIZ;
            int i = (int) (jFloatToRawIntBits >> 32);
            float fIntBitsToFloat = (f6 + (((c1683130ttv.LIZJ - f6) - ((f3 - f4) * fMax)) / 2.0f)) - (((f4 * fMax) - (Float.intBitsToFloat(i) * fMax)) + Float.intBitsToFloat(i));
            float f7 = c1683130ttv.LIZIZ;
            int i2 = (int) (jFloatToRawIntBits & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits((f7 + (((c1683130ttv.LIZLLL - f7) - f5) / 2.0f)) - (((c1683130ttv2.LIZIZ * fMax) - (Float.intBitsToFloat(i2) * fMax)) + Float.intBitsToFloat(i2)))) & 4294967295L);
            c05p0.setValue(Boolean.TRUE);
            C23250099c.LIZLLL(interfaceC497601wk, null, null, new C05UH(c1677480tko, c259800zU, c1683130ttvLIZIZ2, c1683130ttv2, null), 3);
            C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1356705Sr(c259800zU2, fMin, c259800zU3, jFloatToRawIntBits2, new AwS119S1200000_2(c05p0, str, function1, 9), null), 3);
        }
    }
}
