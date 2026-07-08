package X;

import defpackage.w2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS283S0000000_35;

/* JADX INFO: renamed from: X.1E8R, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1E8R {
    public final Function1<w2, Unit> LIZ;
    public final Function1<w2, Unit> LIZIZ;

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public C1E8R() {
        this(AFwS283S0000000_35.get$arr$(172), AFwS283S0000000_35.get$arr$(173));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1E8R(Function1<? super w2, Unit> function1, Function1<? super w2, Unit> function12) {
        this.LIZ = function1;
        this.LIZIZ = function12;
    }
}
