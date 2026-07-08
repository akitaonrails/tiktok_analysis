package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fpo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.live.publicscreen.api.badge.UserBadgeCacheManager$ensureCleanupTaskStarted$1$1", f = "UserBadgeCacheManager.kt", l = {423}, m = "invokeSuspend")
public final class C1142420fpo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1142400fpm LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1142420fpo(C1142400fpm c1142400fpm, InterfaceC1364105Vn<? super C1142420fpo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1142400fpm;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1142420fpo c1142420fpo = new C1142420fpo(this.LLILLL, interfaceC1364105Vn);
        c1142420fpo.LLILLJJLI = obj;
        return c1142420fpo;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0153 -> B:6:0x0019). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1142420fpo.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
