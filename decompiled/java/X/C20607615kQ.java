package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15kQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20607615kQ {
    public static final C20607615kQ LIZJ = new C20607615kQ(new C20608215kW(EnumC323450Cm7.Refresh), new C20606915kJ());
    public final AbstractC20607715kR LIZ;
    public final C20606915kJ LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20607615kQ)) {
            return false;
        }
        C20607615kQ c20607615kQ = (C20607615kQ) obj;
        return Intrinsics.LJFF(this.LIZ, c20607615kQ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c20607615kQ.LIZIZ);
    }

    public C20607615kQ(AbstractC20607715kR abstractC20607715kR, C20606915kJ c20606915kJ) {
        this.LIZ = abstractC20607715kR;
        this.LIZIZ = c20606915kJ;
    }
}
