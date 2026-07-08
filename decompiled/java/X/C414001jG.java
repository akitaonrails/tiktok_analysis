package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.01jG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2$1", f = "Zip.kt", l = {333}, m = "invokeSuspend")
public final class C414001jG extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<Object>, Object[], InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ InterfaceC346701Wf LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ InterfaceC1631630sYr LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C414001jG(InterfaceC1364105Vn interfaceC1364105Vn, InterfaceC1631630sYr interfaceC1631630sYr) {
        super(3, interfaceC1364105Vn);
        this.LLILZ = interfaceC1631630sYr;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<Object> interfaceC346701Wf, Object[] objArr, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C414001jG c414001jG = new C414001jG(interfaceC1364105Vn, this.LLILZ);
        c414001jG.LLILLJJLI = interfaceC346701Wf;
        c414001jG.LLILLL = objArr;
        return c414001jG.invokeSuspend(Unit.LIZ);
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
            InterfaceC1631630sYr interfaceC1631630sYr = this.LLILZ;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            this.LL = 1;
            if (interfaceC1631630sYr.invoke(interfaceC346701Wf, obj2, obj3, this) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }
}
