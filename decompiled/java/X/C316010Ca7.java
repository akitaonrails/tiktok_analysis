package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ca7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C316010Ca7 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public C316010Ca7() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C316010Ca7)) {
            return false;
        }
        C316010Ca7 c316010Ca7 = (C316010Ca7) obj;
        return Intrinsics.LJFF(this.LIZ, c316010Ca7.LIZ) && Intrinsics.LJFF(this.LIZIZ, c316010Ca7.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c316010Ca7.LIZJ);
    }

    public /* synthetic */ C316010Ca7(int i) {
        this("", "", "");
    }

    public C316010Ca7(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
