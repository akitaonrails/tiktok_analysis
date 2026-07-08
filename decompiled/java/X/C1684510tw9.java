package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tw9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1684510tw9 {
    public final EnumC1684470tw5 LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1684510tw9)) {
            return false;
        }
        C1684510tw9 c1684510tw9 = (C1684510tw9) obj;
        return this.LIZ == c1684510tw9.LIZ && Intrinsics.LJFF(this.LIZIZ, c1684510tw9.LIZIZ);
    }

    public C1684510tw9(EnumC1684470tw5 enumC1684470tw5, String str) {
        this.LIZ = enumC1684470tw5;
        this.LIZIZ = str;
    }

    public static C1684510tw9 LIZ(C1684510tw9 c1684510tw9, EnumC1684470tw5 enumC1684470tw5, String str, int i) {
        if ((i & 1) != 0) {
            enumC1684470tw5 = c1684510tw9.LIZ;
        }
        if ((i & 2) != 0) {
            str = c1684510tw9.LIZIZ;
        }
        c1684510tw9.getClass();
        return new C1684510tw9(enumC1684470tw5, str);
    }
}
