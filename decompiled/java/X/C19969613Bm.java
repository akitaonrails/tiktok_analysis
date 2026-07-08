package X;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Bm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19969613Bm implements Comparable<C19969613Bm> {
    public static final C19969713Bn LLILLJJLI;
    public final byte LL;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.13Bn] */
    static {
        final DefaultConstructorMarker defaultConstructorMarker = null;
        LLILLJJLI = new Object(defaultConstructorMarker) { // from class: X.13Bn
        };
    }

    public final int hashCode() {
        return this.LL;
    }

    public final String toString() {
        return LIZJ(this.LL);
    }

    public static String LIZJ(byte b) {
        return String.valueOf(b & 255);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(C19969613Bm c19969613Bm) {
        return Intrinsics.LJI(this.LL & 255, c19969613Bm.LL & 255);
    }

    public final boolean equals(Object obj) {
        byte b = this.LL;
        if (!(obj instanceof C19969613Bm) || b != ((C19969613Bm) obj).LL) {
            return false;
        }
        return true;
    }
}
