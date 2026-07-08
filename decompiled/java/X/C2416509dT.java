package X;

import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.account.otl.LoginSyncService;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09dT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.otl.LoginSyncService$onStartCommand$1", f = "LoginSyncService.kt", l = {DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE}, m = "invokeSuspend")
public final class C2416509dT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ LoginSyncService LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2416509dT(long j, LoginSyncService loginSyncService, InterfaceC1364105Vn<? super C2416509dT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = loginSyncService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2416509dT(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LoginSyncService@b975.onStartCommand$1");
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
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("LoginSyncService@b975.onStartCommand$1");
                return objLJFF;
            }
        }
        LoginSyncService loginSyncService = this.LLILLL;
        Context applicationContext = this.LLILLL.getApplicationContext();
        if (C2409809cO.LIZIZ && applicationContext == null) {
            applicationContext = C2409809cO.LIZ;
        }
        loginSyncService.stopService(new Intent(applicationContext, (Class<?>) LoginSyncService.class));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LoginSyncService@b975.onStartCommand$1");
        return unit;
    }
}
