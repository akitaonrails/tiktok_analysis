package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05VJ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoInputAssemKt$TakoAIVideoChatListBox$3$1", f = "TakoAIVideoInputAssem.kt", l = {689}, m = "invokeSuspend")
public final class C05VJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05VF LLILLJJLI;
    public final /* synthetic */ C05P1<C1687320u0g> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05VJ(C05VF c05vf, C05P1<C1687320u0g> c05p1, InterfaceC1364105Vn<? super C05VJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05vf;
        this.LLILLL = c05p1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05VJ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoAIVideoInputAssemKt@20a7.TakoAIVideoChatListBox$3$1");
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
            C05VF c05vf = this.LLILLJJLI;
            InterfaceC1664360tPe<InterfaceC1672680td4> interfaceC1664360tPe = this.LLILLL.getValue().LL;
            this.LL = 1;
            if (c05vf.LJI(interfaceC1664360tPe, this) == objLJFF) {
                C1C7U.LIZIZ("TakoAIVideoInputAssemKt@20a7.TakoAIVideoChatListBox$3$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoAIVideoInputAssemKt@20a7.TakoAIVideoChatListBox$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
