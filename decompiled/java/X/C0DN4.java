package X;

import com.ss.android.ugc.ur.school.service.UserCampusService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DN4, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.modifyschool.SchoolFlowRouter$open$1$1", f = "SchoolFlowRouter.kt", l = {66}, m = "invokeSuspend")
public final class C0DN4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ UserCampusService LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DN4(UserCampusService userCampusService, String str, InterfaceC1364105Vn<? super C0DN4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = userCampusService;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DN4(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.String r3 = "SchoolFlowRouter@5051.open$1$1"
            X.C1C7U.LIZ(r3)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LL
            r1 = 1
            if (r0 == 0) goto L26
            if (r0 != r1) goto L3b
            X.C155000ia.LIZIZ(r5)
        L13:
            X.0DMw r5 = (X.C338000DMw) r5
        L15:
            com.ss.android.ugc.ur.school.service.UserCampusService r2 = r4.LLILLJJLI
            if (r2 == 0) goto L20
            java.lang.String r1 = r4.LLILLL
            X.0DN8 r0 = X.C0DN8.INTO_ALL
            r2.LIZLLL(r1, r5, r0)
        L20:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r3)
            return r0
        L26:
            X.C155000ia.LIZIZ(r5)
            com.ss.android.ugc.ur.school.service.UserCampusService r0 = r4.LLILLJJLI
            if (r0 == 0) goto L39
            r4.LL = r1
            java.lang.Object r5 = r0.LIZ(r4)
            if (r5 != r2) goto L13
            X.C1C7U.LIZIZ(r3)
            return r2
        L39:
            r5 = 0
            goto L15
        L3b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DN4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
