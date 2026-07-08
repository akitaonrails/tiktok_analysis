package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KeF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C522410KeF implements InterfaceC528460Ko0 {
    public final Function0<Boolean> LIZ;
    public final Function0<Boolean> LIZIZ;

    @Override // X.InterfaceC528460Ko0
    public final boolean LIZ() {
        return C533930Kwp.LIZJ() || this.LIZ.invoke().booleanValue() || this.LIZIZ.invoke().booleanValue();
    }

    @Override // X.InterfaceC528460Ko0
    public final boolean LIZIZ() {
        return C533930Kwp.LIZJ() || this.LIZ.invoke().booleanValue();
    }

    public C522410KeF(Function0<Boolean> function0, Function0<Boolean> function02) {
        this.LIZ = function0;
        this.LIZIZ = function02;
    }
}
