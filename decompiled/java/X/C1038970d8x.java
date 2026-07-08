package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0d8x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1038970d8x extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC1036110d4L LL;
    public final /* synthetic */ C259800zU<String> LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1038970d8x(C1040740dBo c1040740dBo, C259800zU c259800zU, C013C c013c, boolean z, boolean z2) {
        super(0);
        this.LL = c1040740dBo;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = c013c;
        this.LLILZ = z;
        this.LLILZIL = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1029270ctJ c1029270ctJ = C1029270ctJ.LIZ;
        InterfaceC1036110d4L interfaceC1036110d4L = this.LL;
        String str = this.LLILLJJLI.element;
        if (str == null) {
            str = "";
        }
        boolean z = this.LLILLL.element;
        boolean z2 = this.LLILZ;
        c1029270ctJ.getClass();
        int iLIZ = C1029270ctJ.LIZ(true, z2);
        boolean z3 = this.LLILZIL;
        Boolean bool = Boolean.FALSE;
        c1029270ctJ.getClass();
        C1029270ctJ.LIZIZ(interfaceC1036110d4L, str, z, iLIZ, bool, z3);
        return Unit.LIZ;
    }
}
