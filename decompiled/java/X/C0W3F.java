package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0W3F, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.record.util.FlowUtilKt$combine$$inlined$combine$1$3", f = "FlowUtil.kt", l = {333, 238}, m = "invokeSuspend")
public final class C0W3F extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<Object>, Object[], InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ InterfaceC346701Wf LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ InterfaceC2280181EMu LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0W3F(InterfaceC1364105Vn interfaceC1364105Vn, InterfaceC2280181EMu interfaceC2280181EMu) {
        super(3, interfaceC1364105Vn);
        this.LLILZ = interfaceC2280181EMu;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<Object> interfaceC346701Wf, Object[] objArr, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C0W3F c0w3f = new C0W3F(interfaceC1364105Vn, this.LLILZ);
        c0w3f.LLILLJJLI = interfaceC346701Wf;
        c0w3f.LLILLL = objArr;
        return c0w3f.invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346701Wf interfaceC346701Wf;
        Object objDN = obj;
        C1C7U.LIZ("FlowUtilKt@b963.combine$$inlined$combine$1$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objDN);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("FlowUtilKt@b963.combine$$inlined$combine$1$3");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC346701Wf = this.LLILLJJLI;
            C155000ia.LIZIZ(objDN);
        } else {
            C155000ia.LIZIZ(objDN);
            interfaceC346701Wf = this.LLILLJJLI;
            Object[] objArr = (Object[]) this.LLILLL;
            InterfaceC2280181EMu interfaceC2280181EMu = this.LLILZ;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            Object obj7 = objArr[5];
            Object obj8 = objArr[6];
            this.LLILLJJLI = interfaceC346701Wf;
            this.LL = 1;
            objDN = interfaceC2280181EMu.dN(obj2, obj3, obj4, obj5, obj6, obj7, obj8, this);
            if (objDN == objLJFF) {
                C1C7U.LIZIZ("FlowUtilKt@b963.combine$$inlined$combine$1$3");
                return objLJFF;
            }
        }
        this.LLILLJJLI = null;
        this.LL = 2;
        if (interfaceC346701Wf.emit(objDN, this) == objLJFF) {
            C1C7U.LIZIZ("FlowUtilKt@b963.combine$$inlined$combine$1$3");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("FlowUtilKt@b963.combine$$inlined$combine$1$3");
        return unit2;
    }
}
