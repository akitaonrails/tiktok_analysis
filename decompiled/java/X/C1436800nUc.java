package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nUc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1436800nUc {
    public final String LIZ;
    public String LIZIZ;
    public boolean LIZJ = false;
    public final boolean LIZLLL = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1436800nUc)) {
            return false;
        }
        C1436800nUc c1436800nUc = (C1436800nUc) obj;
        return Intrinsics.LJFF(this.LIZ, c1436800nUc.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1436800nUc.LIZIZ) && this.LIZJ == c1436800nUc.LIZJ && this.LIZLLL == c1436800nUc.LIZLLL;
    }

    public C1436800nUc(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
