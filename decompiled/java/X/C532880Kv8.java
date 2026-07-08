package X;

import com.ss.android.ugc.effectmanager.EffectManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kv8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.cktemplate.resource.handlers.MaterialHandler$downLoadResourceBatch$2", f = "MaterialHandler.kt", l = {140}, m = "invokeSuspend")
public final class C532880Kv8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ List<String> LLILZIL;
    public final /* synthetic */ C532910KvB LLILZLL;
    public final /* synthetic */ InterfaceC531800KtO LLIZ;
    public final /* synthetic */ EffectManager LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C532880Kv8(List<String> list, C532910KvB c532910KvB, InterfaceC531800KtO interfaceC531800KtO, EffectManager effectManager, InterfaceC1364105Vn<? super C532880Kv8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = list;
        this.LLILZLL = c532910KvB;
        this.LLIZ = interfaceC531800KtO;
        this.LLIZLLLIL = effectManager;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C532880Kv8 c532880Kv8 = new C532880Kv8(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c532880Kv8.LLILZ = obj;
        return c532880Kv8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02bb  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C532880Kv8.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
