package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0WRx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C823430WRx implements C0WS2 {
    public final String LIZ;
    public final Function1<C0WSC, Unit> LIZIZ;

    @Override // X.C0WS2
    public final String getName() {
        return this.LIZ;
    }

    @Override // X.C0WS2
    public final void LIZ(C0WS7 c0ws7) {
        this.LIZIZ.invoke(c0ws7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C823430WRx(String str, Function1<? super C0WSC, Unit> function1) {
        this.LIZ = str;
        this.LIZIZ = function1;
    }
}
