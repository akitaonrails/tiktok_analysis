package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PY7, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PY7 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public C0PY7() {
        this(null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0PY7)) {
            return false;
        }
        C0PY7 c0py7 = (C0PY7) obj;
        return Intrinsics.LJFF(this.LIZ, c0py7.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0py7.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0py7.LIZJ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0PY7(String str, int i) {
        String str2;
        str = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            str2 = "";
        } else {
            str2 = null;
        }
        this(str, str2, (i & 4) == 0 ? null : "");
    }

    public C0PY7(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
