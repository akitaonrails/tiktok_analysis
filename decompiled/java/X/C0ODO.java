package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ODO, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.addyours.ui.provider.AddYoursDetailAwemeListProvider$vm$2$1$1$onFailed$1", f = "AddYoursDetailAwemeListProvider.kt", l = {}, m = "invokeSuspend")
public final class C0ODO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C616360OFm LL;
    public final /* synthetic */ C0OCM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ODO(C616360OFm c616360OFm, C0OCM c0ocm, InterfaceC1364105Vn<? super C0ODO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c616360OFm;
        this.LLILLJJLI = c0ocm;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ODO(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddYoursDetailAwemeListProvider@3621.vm$2$1$1$onFailed$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1440005kM.LIZ(new C0ODC(false, this.LL.getPresenter$addyours_release(), this.LLILLJJLI.LLJ.getTopicId()));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddYoursDetailAwemeListProvider@3621.vm$2$1$1$onFailed$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
