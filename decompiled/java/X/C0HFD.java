package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HFD, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HFD {
    public final C0HFS LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0HFD) && Intrinsics.LJFF(this.LIZ, ((C0HFD) obj).LIZ);
    }

    public C0HFD(C0HFS c0hfs) {
        this.LIZ = c0hfs;
    }
}
