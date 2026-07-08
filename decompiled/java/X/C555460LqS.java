package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LqS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.data.DraftRemover$deleteAwemeDraft$2", f = "DraftRemover.kt", l = {}, m = "invokeSuspend")
public final class C555460LqS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C555490LqV LL;
    public final /* synthetic */ C0M0P LLILLJJLI;
    public final /* synthetic */ AwemeDraft LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C555460LqS(C555490LqV c555490LqV, C0M0P c0m0p, AwemeDraft awemeDraft, InterfaceC1364105Vn<? super C555460LqS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c555490LqV;
        this.LLILLJJLI = c0m0p;
        this.LLILLL = awemeDraft;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C555460LqS(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("DraftRemover@581a.deleteAwemeDraft$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC555450LqR interfaceC555450LqR = this.LL.LJ;
        if (interfaceC555450LqR != null) {
            interfaceC555450LqR.R4(this.LLILLL, this.LLILLJJLI);
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("DraftRemover@581a.deleteAwemeDraft$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
