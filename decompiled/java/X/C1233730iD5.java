package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iD5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1233730iD5 {
    public final C1233790iDB LIZ;
    public final EnumC949940apM LIZIZ;

    public C1233730iD5() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1233730iD5)) {
            return false;
        }
        C1233730iD5 c1233730iD5 = (C1233730iD5) obj;
        return Intrinsics.LJFF(this.LIZ, c1233730iD5.LIZ) && this.LIZIZ == c1233730iD5.LIZIZ;
    }

    public C1233730iD5(C1233790iDB c1233790iDB, EnumC949940apM enumC949940apM) {
        this.LIZ = c1233790iDB;
        this.LIZIZ = enumC949940apM;
    }
}
