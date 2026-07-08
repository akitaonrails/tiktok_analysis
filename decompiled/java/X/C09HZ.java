package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09HZ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.data.DraftLoader$updateDraftDataWithAsyncTask$1", f = "DraftLoader.kt", l = {}, m = "invokeSuspend")
public final class C09HZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0M03 LL;
    public final /* synthetic */ C539070LCf LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09HZ(C0M03 c0m03, C539070LCf c539070LCf, boolean z, InterfaceC1364105Vn<? super C09HZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0m03;
        this.LLILLJJLI = c539070LCf;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09HZ(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftLoader@8d42.updateDraftDataWithAsyncTask$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC2345609Ha interfaceC2345609Ha = this.LL.LIZJ;
        if (interfaceC2345609Ha != null) {
            interfaceC2345609Ha.m7(this.LLILLJJLI, this.LLILLL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftLoader@8d42.updateDraftDataWithAsyncTask$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
