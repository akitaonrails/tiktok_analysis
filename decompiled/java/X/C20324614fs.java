package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.14fs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20324614fs implements InterfaceC2182181Aam {
    public final String LIZ;
    public final Function2<Long, C2182171Aal, Unit> LIZIZ;
    public final long LIZJ = System.currentTimeMillis();

    @Override // X.InterfaceC2182261Aau
    public final String LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC2182261Aau
    public final long getTaskId() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC2182181Aam
    public final void LIZJ(C2182171Aal c2182171Aal) {
        this.LIZIZ.invoke(Long.valueOf(this.LIZJ), c2182171Aal);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C20324614fs(String str, Function2<? super Long, ? super C2182171Aal, Unit> function2) {
        this.LIZ = str;
        this.LIZIZ = function2;
    }
}
