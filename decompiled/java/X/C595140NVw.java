package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0NVw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "androidx.compose.foundation.CombinedClickableNode$clickPointerInput$4", f = "Clickable.kt", l = {770}, m = "invokeSuspend")
public final class C595140NVw extends C09AX implements InterfaceC1631620sYq<InterfaceC595070NVp, C1378605aS, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ InterfaceC595070NVp LLILLJJLI;
    public /* synthetic */ long LLILLL;
    public final /* synthetic */ C20073913gX LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C595140NVw(C20073913gX c20073913gX, InterfaceC1364105Vn<? super C595140NVw> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILZ = c20073913gX;
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
            C20073913gX c20073913gX = this.LLILZ;
            if (c20073913gX.LLJJJ) {
                this.LL = 1;
                InterfaceC595010NVj interfaceC595010NVj = c20073913gX.LLJJIII;
                if (interfaceC595010NVj == null || (objLJ = C2296808zG.LJ(new C595090NVr(interfaceC595070NVp, j, interfaceC595010NVj, c20073913gX, null), this)) != C099R.LJFF()) {
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
        C595140NVw c595140NVw = new C595140NVw(this.LLILZ, interfaceC1364105Vn);
        c595140NVw.LLILLJJLI = interfaceC595070NVp;
        c595140NVw.LLILLL = j;
        return c595140NVw.invokeSuspend(Unit.LIZ);
    }
}
