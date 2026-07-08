package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tRo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1665700tRo {
    public final boolean LIZ;
    public final Function0<Unit> LIZIZ;
    public final Function0<Unit> LIZJ;
    public final String LIZLLL;

    public C1665700tRo() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1665700tRo)) {
            return false;
        }
        C1665700tRo c1665700tRo = (C1665700tRo) obj;
        return this.LIZ == c1665700tRo.LIZ && Intrinsics.LJFF(this.LIZIZ, c1665700tRo.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1665700tRo.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1665700tRo.LIZLLL);
    }

    public /* synthetic */ C1665700tRo(int i) {
        this(null, AFwS214S0000000_25.get$arr$(463), AFwS214S0000000_25.get$arr$(464), true);
    }

    public C1665700tRo(String str, Function0 function0, Function0 function02, boolean z) {
        this.LIZ = z;
        this.LIZIZ = function0;
        this.LIZJ = function02;
        this.LIZLLL = str;
    }
}
