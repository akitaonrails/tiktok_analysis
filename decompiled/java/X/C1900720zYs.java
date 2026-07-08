package X;

import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel;
import com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationCreatorResultViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zYs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationCreatorResultViewModel$requestNotice$1", f = "NotificationCreatorResultViewModel.kt", l = {181}, m = "invokeSuspend")
public final class C1900720zYs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public NoticeTabModel LL;
    public int LLILLJJLI;
    public final /* synthetic */ NotificationCreatorResultViewModel LLILLL;
    public final /* synthetic */ EnumC1900710zYr LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1900720zYs(NotificationCreatorResultViewModel notificationCreatorResultViewModel, EnumC1900710zYr enumC1900710zYr, InterfaceC1364105Vn<? super C1900720zYs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = notificationCreatorResultViewModel;
        this.LLILZ = enumC1900710zYr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1900720zYs(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008d A[Catch: Exception -> 0x0114, TryCatch #0 {Exception -> 0x0114, blocks: (B:39:0x00cb, B:40:0x00ce, B:42:0x00d4, B:44:0x00dd, B:46:0x010c, B:12:0x002f, B:14:0x0061, B:16:0x0069, B:17:0x0072, B:20:0x007c, B:28:0x0096, B:35:0x00a9, B:23:0x008d), top: B:51:0x0010 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1900720zYs.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
