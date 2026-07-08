package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fhu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1137520fhu extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1135920ffK LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ InterfaceC1136020ffU LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1137520fhu(C1135920ffK c1135920ffK, boolean z, InterfaceC1136020ffU interfaceC1136020ffU, boolean z2) {
        super(0);
        this.LL = c1135920ffK;
        this.LLILLJJLI = z;
        this.LLILLL = interfaceC1136020ffU;
        this.LLILZ = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1135920ffK c1135920ffK = this.LL;
        c1135920ffK.LJIIL = false;
        if (!this.LLILLJJLI) {
            c1135920ffK.LJJIIZI(this.LLILLL, this.LLILZ);
        }
        return Unit.LIZ;
    }
}
