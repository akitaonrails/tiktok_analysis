package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nLt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1431390nLt {
    public final EnumC1434810nRP LIZ;
    public final EnumC1436980nUu LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1431390nLt)) {
            return false;
        }
        C1431390nLt c1431390nLt = (C1431390nLt) obj;
        return this.LIZ == c1431390nLt.LIZ && this.LIZIZ == c1431390nLt.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1431390nLt.LIZJ);
    }

    public C1431390nLt(EnumC1434810nRP enumC1434810nRP, EnumC1436980nUu enumC1436980nUu, String str) {
        this.LIZ = enumC1434810nRP;
        this.LIZIZ = enumC1436980nUu;
        this.LIZJ = str;
    }
}
