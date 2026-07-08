package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ca5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C315990Ca5 {
    public final int LIZ;
    public final Function0<Unit> LIZIZ;

    public C315990Ca5() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C315990Ca5)) {
            return false;
        }
        C315990Ca5 c315990Ca5 = (C315990Ca5) obj;
        return this.LIZ == c315990Ca5.LIZ && Intrinsics.LJFF(this.LIZIZ, c315990Ca5.LIZIZ);
    }

    public /* synthetic */ C315990Ca5(int i) {
        this(2131821178, AFwS190S0000000_4.get$arr$(3947));
    }

    public C315990Ca5(int i, Function0<Unit> function0) {
        this.LIZ = i;
        this.LIZIZ = function0;
    }
}
