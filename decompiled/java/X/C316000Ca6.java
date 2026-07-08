package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ca6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C316000Ca6 {
    public final int LIZ;
    public final Function0<Unit> LIZIZ;

    public C316000Ca6() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C316000Ca6)) {
            return false;
        }
        C316000Ca6 c316000Ca6 = (C316000Ca6) obj;
        return this.LIZ == c316000Ca6.LIZ && Intrinsics.LJFF(this.LIZIZ, c316000Ca6.LIZIZ);
    }

    public /* synthetic */ C316000Ca6(int i) {
        this(2131821176, AFwS190S0000000_4.get$arr$(3948));
    }

    public C316000Ca6(int i, Function0<Unit> function0) {
        this.LIZ = i;
        this.LIZIZ = function0;
    }
}
