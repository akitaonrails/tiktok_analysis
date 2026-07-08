package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.01jN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4$1", f = "Zip.kt", l = {333}, m = "invokeSuspend")
public final class C414701jN extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<Object>, Object[], InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ InterfaceC346701Wf LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ InterfaceC1685430txd LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C414701jN(InterfaceC1364105Vn interfaceC1364105Vn, InterfaceC1685430txd interfaceC1685430txd) {
        super(3, interfaceC1364105Vn);
        this.LLILZ = interfaceC1685430txd;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<Object> interfaceC346701Wf, Object[] objArr, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C414701jN c414701jN = new C414701jN(interfaceC1364105Vn, this.LLILZ);
        c414701jN.LLILLJJLI = interfaceC346701Wf;
        c414701jN.LLILLL = objArr;
        return c414701jN.invokeSuspend(Unit.LIZ);
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
            InterfaceC346701Wf interfaceC346701Wf = this.LLILLJJLI;
            Object[] objArr = (Object[]) this.LLILLL;
            InterfaceC1685430txd interfaceC1685430txd = this.LLILZ;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            this.LL = 1;
            if (interfaceC1685430txd.invoke(interfaceC346701Wf, obj2, obj3, obj4, obj5, this) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }
}
