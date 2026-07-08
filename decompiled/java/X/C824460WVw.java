package X;

import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.account.otl.LoginSyncLocalServer;
import com.ss.android.ugc.aweme.account.otl.LoginSyncService;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0WVw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.otl.LoginSyncLocalServer$createLocalHostWithPort$1$serve$response$1", f = "LoginSyncLocalServer.kt", l = {212}, m = "invokeSuspend")
public final class C824460WVw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ WeakReference<Context> LLILLJJLI;
    public final /* synthetic */ LoginSyncLocalServer LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C824460WVw(WeakReference<Context> weakReference, LoginSyncLocalServer loginSyncLocalServer, InterfaceC1364105Vn<? super C824460WVw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = weakReference;
        this.LLILLL = loginSyncLocalServer;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C824460WVw(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LoginSyncLocalServer@31de.createLocalHostWithPort$1$serve$response$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(2000L, this) == objLJFF) {
                C1C7U.LIZIZ("LoginSyncLocalServer@31de.createLocalHostWithPort$1$serve$response$1");
                return objLJFF;
            }
        }
        Context context = this.LLILLJJLI.get();
        if (context != null) {
            Boolean.valueOf(context.stopService(new Intent(this.LLILLL.LIZ, (Class<?>) LoginSyncService.class)));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LoginSyncLocalServer@31de.createLocalHostWithPort$1$serve$response$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
