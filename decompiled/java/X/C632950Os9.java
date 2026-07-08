package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Os9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C632950Os9 {
    public final C632880Os2 LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C632950Os9)) {
            return false;
        }
        C632950Os9 c632950Os9 = (C632950Os9) obj;
        return Intrinsics.LJFF(this.LIZ, c632950Os9.LIZ) && this.LIZIZ == c632950Os9.LIZIZ;
    }

    public C632950Os9(C632880Os2 c632880Os2, boolean z) {
        this.LIZ = c632880Os2;
        this.LIZIZ = z;
    }
}
