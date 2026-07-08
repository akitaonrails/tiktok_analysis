package X;

import android.content.Context;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.viewmodel.ManageGroupViewModel;
import com.ss.android.ugc.aweme.network.model.GetAccessCriteriaResponseBody;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hqi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.viewmodel.ManageGroupViewModel$openWhoCanJoinPanel$2", f = "ManageGroupViewModel.kt", l = {534, 537, 542}, m = "invokeSuspend")
public final class C1219860hqi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public GetAccessCriteriaResponseBody LL;
    public int LLILLJJLI;
    public final /* synthetic */ Long LLILLL;
    public final /* synthetic */ ManageGroupViewModel LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ C1222520hv0 LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1219860hqi(Long l, ManageGroupViewModel manageGroupViewModel, Context context, C1222520hv0 c1222520hv0, InterfaceC1364105Vn<? super C1219860hqi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = l;
        this.LLILZ = manageGroupViewModel;
        this.LLILZIL = context;
        this.LLILZLL = c1222520hv0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1219860hqi(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d7  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1219860hqi.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
