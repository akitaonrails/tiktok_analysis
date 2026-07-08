package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0NVv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "androidx.compose.foundation.ClickableNode$clickPointerInput$2", f = "Clickable.kt", l = {696}, m = "invokeSuspend")
public final class C595130NVv extends C09AX implements InterfaceC1631620sYq<InterfaceC595070NVp, C1378605aS, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ InterfaceC595070NVp LLILLJJLI;
    public /* synthetic */ long LLILLL;
    public final /* synthetic */ C0NW3 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C595130NVv(C0NW3 c0nw3, InterfaceC1364105Vn<? super C595130NVv> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILZ = c0nw3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJ;
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC595070NVp interfaceC595070NVp = this.LLILLJJLI;
            long j = this.LLILLL;
            C0NW3 c0nw3 = this.LLILZ;
            if (c0nw3.LLJJJ) {
                this.LL = 1;
                InterfaceC595010NVj interfaceC595010NVj = c0nw3.LLJJIII;
                if (interfaceC595010NVj == null || (objLJ = C2296808zG.LJ(new C595090NVr(interfaceC595070NVp, j, interfaceC595010NVj, c0nw3, null), this)) != C099R.LJFF()) {
                    objLJ = Unit.LIZ;
                }
                if (objLJ == objLJFF) {
                    return objLJFF;
                }
            }
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC595070NVp interfaceC595070NVp, C1378605aS c1378605aS, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        long j = c1378605aS.LIZ;
        C595130NVv c595130NVv = new C595130NVv(this.LLILZ, interfaceC1364105Vn);
        c595130NVv.LLILLJJLI = interfaceC595070NVp;
        c595130NVv.LLILLL = j;
        return c595130NVv.invokeSuspend(Unit.LIZ);
    }
}
