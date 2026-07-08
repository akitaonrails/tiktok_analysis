package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0euM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1106800euM {
    public final Function1<Object, Unit> LIZ;
    public final Function1<Throwable, Unit> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1106800euM)) {
            return false;
        }
        C1106800euM c1106800euM = (C1106800euM) obj;
        return Intrinsics.LJFF(this.LIZ, c1106800euM.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1106800euM.LIZIZ);
    }

    public C1106800euM(C1106770euJ c1106770euJ, C1106790euL c1106790euL) {
        this.LIZ = c1106770euJ;
        this.LIZIZ = c1106790euL;
    }
}
