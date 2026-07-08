package X;

import android.app.Activity;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.external.router.AIGCMiddlePageInterceptor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0M57, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.router.AIGCMiddlePageInterceptor$getAILivePhotoRouteContext$1", f = "AIGCMiddlePageInterceptor.kt", l = {118}, m = "invokeSuspend")
public final class C0M57 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0M59>, Object> {
    public C259800zU LL;
    public int LLILLJJLI;
    public final /* synthetic */ C259800zU<C0LSZ> LLILLL;
    public final /* synthetic */ AIGCMiddlePageInterceptor LLILZ;
    public final /* synthetic */ RouteIntent LLILZIL;
    public final /* synthetic */ Activity LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M57(C259800zU<C0LSZ> c259800zU, AIGCMiddlePageInterceptor aIGCMiddlePageInterceptor, RouteIntent routeIntent, Activity activity, InterfaceC1364105Vn<? super C0M57> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c259800zU;
        this.LLILZ = aIGCMiddlePageInterceptor;
        this.LLILZIL = routeIntent;
        this.LLILZLL = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0M57(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x028c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 939
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0M57.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0M59> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
