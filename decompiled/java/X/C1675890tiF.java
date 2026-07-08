package X;

import androidx.compose.foundation.BorderModifierNodeElement;

/* JADX INFO: renamed from: X.0tiF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1675890tiF {
    public static final long LIZJ(float f, long j) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    public static final InterfaceC1685750ty9 LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, float f, long j, InterfaceC1680710tq1 interfaceC1680710tq1) {
        return LIZIZ(f, interfaceC1685750ty9, new C1680950tqP(j), interfaceC1680710tq1);
    }

    public static final InterfaceC1685750ty9 LIZIZ(float f, InterfaceC1685750ty9 interfaceC1685750ty9, AbstractC1668700tWe abstractC1668700tWe, InterfaceC1680710tq1 interfaceC1680710tq1) {
        return interfaceC1685750ty9.LIZ(new BorderModifierNodeElement(f, abstractC1668700tWe, interfaceC1680710tq1));
    }
}
