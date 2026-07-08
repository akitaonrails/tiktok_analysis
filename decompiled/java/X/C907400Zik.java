package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Zik, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.data.searchcontent.GroupMemberSearchContentSyncEngine$fullUpdate$1", f = "GroupMemberSearchContentSyncEngine.kt", l = {88, 103}, m = "invokeSuspend")
public final class C907400Zik extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public long LLILLJJLI;
    public C907790ZjN LLILLL;
    public C907410Zil LLILZ;
    public int LLILZIL;
    public final /* synthetic */ C907410Zil LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C907400Zik(C907410Zil c907410Zil, InterfaceC1364105Vn<? super C907400Zik> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c907410Zil;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C907400Zik(this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ea  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C907400Zik.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
