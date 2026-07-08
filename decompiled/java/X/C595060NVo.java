package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0NVo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", l = {67}, m = "invokeSuspend")
public final class C595060NVo extends C09AX implements InterfaceC1631620sYq<InterfaceC595070NVp, C1378605aS, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ InterfaceC595070NVp LLILLJJLI;
    public /* synthetic */ long LLILLL;
    public final /* synthetic */ InterfaceC497601wk LLILZ;
    public final /* synthetic */ C05P0<C0NW2> LLILZIL;
    public final /* synthetic */ InterfaceC595010NVj LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C595060NVo(InterfaceC497601wk interfaceC497601wk, C05P0<C0NW2> c05p0, InterfaceC595010NVj interfaceC595010NVj, InterfaceC1364105Vn<? super C595060NVo> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILZ = interfaceC497601wk;
        this.LLILZIL = c05p0;
        this.LLILZLL = interfaceC595010NVj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
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
            C23250099c.LIZLLL(this.LLILZ, null, null, new C595050NVn(this.LLILZIL, this.LLILLL, this.LLILZLL, null), 3);
            this.LL = 1;
            obj = interfaceC595070NVp.LJJIJIIJIL(this);
            if (obj == objLJFF) {
                return objLJFF;
            }
        }
        C23250099c.LIZLLL(this.LLILZ, null, null, new C595020NVk(this.LLILZIL, ((Boolean) obj).booleanValue(), this.LLILZLL, null), 3);
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC595070NVp interfaceC595070NVp, C1378605aS c1378605aS, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        long j = c1378605aS.LIZ;
        C595060NVo c595060NVo = new C595060NVo(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c595060NVo.LLILLJJLI = interfaceC595070NVp;
        c595060NVo.LLILLL = j;
        return c595060NVo.invokeSuspend(Unit.LIZ);
    }
}
