package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QOg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C669600QOg {
    public final EnumC669630QOj LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C669600QOg)) {
            return false;
        }
        C669600QOg c669600QOg = (C669600QOg) obj;
        return this.LIZ == c669600QOg.LIZ && Intrinsics.LJFF(this.LIZIZ, c669600QOg.LIZIZ);
    }

    public C669600QOg(EnumC669630QOj enumC669630QOj, String str) {
        this.LIZ = enumC669630QOj;
        this.LIZIZ = str;
    }
}
