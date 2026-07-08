package X;

import android.content.Context;
import com.ss.android.ugc.airemix.api.service.AIRemixLaunchParam;
import com.ss.android.ugc.airemix.api.service.AIRemixRouterInterceptor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0M6z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.airemix.api.service.AIRemixRouterInterceptor$onInterceptRoute$1", f = "AIRemixRouterInterceptor.kt", l = {90, 93, 107, 110, 124}, m = "invokeSuspend")
public final class C563190M6z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AIRemixRouterInterceptor LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ AIRemixLaunchParam LLILZ;
    public final /* synthetic */ Context LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C563190M6z(AIRemixRouterInterceptor aIRemixRouterInterceptor, String str, AIRemixLaunchParam aIRemixLaunchParam, Context context, InterfaceC1364105Vn<? super C563190M6z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aIRemixRouterInterceptor;
        this.LLILLL = str;
        this.LLILZ = aIRemixLaunchParam;
        this.LLILZIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C563190M6z(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e7  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C563190M6z.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
