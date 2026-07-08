package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.WorkBenchNoticeResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Odk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.workbench.WorkBenchDataManager$storeWorkbenchData$1", f = "WorkBenchDataManager.kt", l = {}, m = "invokeSuspend")
public final class C624020Odk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ WorkBenchNoticeResponse LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C624020Odk(WorkBenchNoticeResponse workBenchNoticeResponse, boolean z, InterfaceC1364105Vn<? super C624020Odk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = workBenchNoticeResponse;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C624020Odk(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("WorkBenchDataManager@2241.storeWorkbenchData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C624110Odt.LIZ.getClass();
        C624110Odt.LIZIZ = C624100Ods.LIZ(C624110Odt.LIZ(), this.LL, this.LLILLJJLI, 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("WorkBenchDataManager@2241.storeWorkbenchData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
