package X;

import Y.AgS78S1200000_14;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseActionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YxK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.actions.AlertTonesActionKt$updateEnableState$1", f = "AlertTonesAction.kt", l = {81}, m = "invokeSuspend")
public final class C890960YxK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC893080Z1u LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ BaseActionViewModel<?> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C890960YxK(InterfaceC893080Z1u interfaceC893080Z1u, String str, boolean z, BaseActionViewModel<?> baseActionViewModel, InterfaceC1364105Vn<? super C890960YxK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC893080Z1u;
        this.LLILLL = str;
        this.LLILZ = z;
        this.LLILZIL = baseActionViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C890960YxK(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AlertTonesActionKt@ca19.updateEnableState$1");
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
            C013C c013c = new C013C();
            final C2252331DDr c2252331DDrLIZIZ = this.LLILLJJLI.LJJJ().LIZIZ();
            final String str = this.LLILLL;
            final boolean z = this.LLILZ;
            InterfaceC346201Wa interfaceC346201WaLJIILL = C09IC.LJIILL(new InterfaceC346201Wa<Boolean>() { // from class: X.0YxL
                @Override // X.InterfaceC346201Wa
                public final Object collect(InterfaceC346701Wf<? super Boolean> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                    Object objCollect = c2252331DDrLIZIZ.collect(new C891010YxP(interfaceC346701Wf, str, z), interfaceC1364105Vn);
                    if (objCollect == C099R.LJFF()) {
                        return objCollect;
                    }
                    return Unit.LIZ;
                }
            });
            AgS78S1200000_14 agS78S1200000_14 = new AgS78S1200000_14(this.LLILLL, this.LLILZIL, c013c, 1);
            this.LL = 1;
            if (interfaceC346201WaLJIILL.collect(agS78S1200000_14, this) == objLJFF) {
                C1C7U.LIZIZ("AlertTonesActionKt@ca19.updateEnableState$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AlertTonesActionKt@ca19.updateEnableState$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
