package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleStruct;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0OaR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.core.service.BulletinBoardDataServiceImplInternal$getBulletinBoardStyleStructList$2", f = "BulletinBoardDataServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C621970OaR extends C09AX implements Function1<InterfaceC1364105Vn<? super List<? extends BulletinStyleStruct>>, Object> {
    public final /* synthetic */ List<String> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C621970OaR(List<String> list, InterfaceC1364105Vn<? super C621970OaR> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C621970OaR(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super List<? extends BulletinStyleStruct>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0027 A[SYNTHETIC] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C621970OaR.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
