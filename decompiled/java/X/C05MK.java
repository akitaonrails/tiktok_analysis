package X;

import Y.AgS283S0100000_2;
import com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.assem.EditShareTopOptionAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05MK, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.assem.EditShareTopOptionAssem$subscribeToSaveToLocalState$1", f = "EditShareTopOptionAssem.kt", l = {267}, m = "invokeSuspend")
public final class C05MK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EditShareTopOptionAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05MK(EditShareTopOptionAssem editShareTopOptionAssem, InterfaceC1364105Vn<? super C05MK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = editShareTopOptionAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05MK(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditShareTopOptionAssem@27b8.subscribeToSaveToLocalState$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C01S9 c01s9 = (C01S9) this.LLILLJJLI.LLJJIII.getValue();
            AgS283S0100000_2 agS283S0100000_2 = new AgS283S0100000_2(this.LLILLJJLI, 32);
            this.LL = 1;
            if (c01s9.collect(agS283S0100000_2, this) == objLJFF) {
                C1C7U.LIZIZ("EditShareTopOptionAssem@27b8.subscribeToSaveToLocalState$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
