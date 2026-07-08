package X;

import Y.AgS297S0100000_16;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cKA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.dmrisky.EditableTagsView$6", f = "EditableTagsView.kt", l = {146}, m = "invokeSuspend")
public final class C1007480cKA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1007520cKE LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1007480cKA(C1007520cKE c1007520cKE, InterfaceC1364105Vn<? super C1007480cKA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1007520cKE;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1007480cKA(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditableTagsView@4773.<init>$6");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1007520cKE c1007520cKE = this.LLILLJJLI;
            C2252321DDq c2252321DDq = c1007520cKE.LLJILJILJ;
            AgS297S0100000_16 agS297S0100000_16 = new AgS297S0100000_16(c1007520cKE, 16);
            this.LL = 1;
            if (c2252321DDq.collect(agS297S0100000_16, this) == objLJFF) {
                C1C7U.LIZIZ("EditableTagsView@4773.<init>$6");
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
