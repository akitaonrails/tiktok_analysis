package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.01jV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.autoplay.StatusManager$bindScope$1$invokeSuspend$lambda$4$$inlined$combine$1$3", f = "StatusManager.kt", l = {292}, m = "invokeSuspend")
public final class C415501jV extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super Boolean>, Boolean[], InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ InterfaceC346701Wf LLILLJJLI;
    public /* synthetic */ Object LLILLL;

    public C415501jV(InterfaceC1364105Vn interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super Boolean> interfaceC346701Wf, Boolean[] boolArr, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C415501jV c415501jV = new C415501jV(interfaceC1364105Vn);
        c415501jV.LLILLJJLI = interfaceC346701Wf;
        c415501jV.LLILLL = boolArr;
        return c415501jV.invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StatusManager@d0d1.bindScope$1$invokeSuspend$lambda$4$$inlined$combine$1$3");
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
            Boolean[] boolArr = (Boolean[]) ((Object[]) this.LLILLL);
            int length = boolArr.length;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    if (!boolArr[i2].booleanValue()) {
                        break;
                    }
                    i2++;
                } else {
                    z = true;
                    break;
                }
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            this.LL = 1;
            if (interfaceC346701Wf.emit(boolValueOf, this) == objLJFF) {
                C1C7U.LIZIZ("StatusManager@d0d1.bindScope$1$invokeSuspend$lambda$4$$inlined$combine$1$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StatusManager@d0d1.bindScope$1$invokeSuspend$lambda$4$$inlined$combine$1$3");
        return unit;
    }
}
