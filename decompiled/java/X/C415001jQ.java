package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.01jQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", f = "Zip.kt", l = {333, 262}, m = "invokeSuspend")
public final class C415001jQ extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<Object>, Object[], InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ InterfaceC346701Wf LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ InterfaceC1685420txc LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C415001jQ(InterfaceC1364105Vn interfaceC1364105Vn, InterfaceC1685420txc interfaceC1685420txc) {
        super(3, interfaceC1364105Vn);
        this.LLILZ = interfaceC1685420txc;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<Object> interfaceC346701Wf, Object[] objArr, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C415001jQ c415001jQ = new C415001jQ(interfaceC1364105Vn, this.LLILZ);
        c415001jQ.LLILLJJLI = interfaceC346701Wf;
        c415001jQ.LLILLL = objArr;
        return c415001jQ.invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346701Wf interfaceC346701Wf;
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    return Unit.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC346701Wf = this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC346701Wf = this.LLILLJJLI;
            Object[] objArr = (Object[]) this.LLILLL;
            InterfaceC1685420txc interfaceC1685420txc = this.LLILZ;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            this.LLILLJJLI = interfaceC346701Wf;
            this.LL = 1;
            obj = interfaceC1685420txc.invoke(obj2, obj3, obj4, obj5, this);
            if (obj == objLJFF) {
                return objLJFF;
            }
        }
        this.LLILLJJLI = null;
        this.LL = 2;
        if (interfaceC346701Wf.emit(obj, this) == objLJFF) {
            return objLJFF;
        }
        return Unit.LIZ;
    }
}
