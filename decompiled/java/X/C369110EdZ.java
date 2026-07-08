package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EdZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C369110EdZ {
    public final int LIZ;
    public final InterfaceC368720Ecw LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C369110EdZ)) {
            return false;
        }
        C369110EdZ c369110EdZ = (C369110EdZ) obj;
        return this.LIZ == c369110EdZ.LIZ && Intrinsics.LJFF(this.LIZIZ, c369110EdZ.LIZIZ);
    }

    public C369110EdZ(int i, InterfaceC368720Ecw interfaceC368720Ecw) {
        this.LIZ = i;
        this.LIZIZ = interfaceC368720Ecw;
    }
}
