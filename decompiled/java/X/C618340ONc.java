package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ONc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C618340ONc {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C618340ONc)) {
            return false;
        }
        C618340ONc c618340ONc = (C618340ONc) obj;
        return Intrinsics.LJFF(this.LIZ, c618340ONc.LIZ) && Intrinsics.LJFF(this.LIZIZ, c618340ONc.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c618340ONc.LIZJ);
    }

    public C618340ONc(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
