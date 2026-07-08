package X;

import X.InterfaceC613710O5h;
import X.InterfaceC613730O5j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0O70, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O70<DTO extends InterfaceC613710O5h, PO, Q extends InterfaceC613730O5j<DTO>> {
    public final C0O71<String, PO> LIZ;
    public final Function2<Q, PO, DTO> LIZIZ;
    public final Function1<DTO, PO> LIZJ;
    public final Class<DTO> LIZLLL;
    public final Class<PO> LJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C0O70(C0O71<String, PO> c0o71, Function2<? super Q, ? super PO, ? extends DTO> function2, Function1<? super DTO, ? extends PO> function1, Class<DTO> cls, Class<PO> cls2) {
        this.LIZ = c0o71;
        this.LIZIZ = function2;
        this.LIZJ = function1;
        this.LIZLLL = cls;
        this.LJ = cls2;
    }
}
