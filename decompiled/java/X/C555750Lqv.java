package X;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lqv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.persistence.PersistenceWorkflowCenter$getWorkflowsByCreationIds$2$1", f = "PersistenceWorkflowCenter.kt", l = {185, 189, 189}, m = "invokeSuspend")
public final class C555750Lqv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Map<String, ? extends List<? extends C552940LmO>>>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ List<String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C555750Lqv(List<String> list, InterfaceC1364105Vn<? super C555750Lqv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C555750Lqv(this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x006c -> B:9:0x0025). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x007a -> B:8:0x0023). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C555750Lqv.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Map<String, ? extends List<? extends C552940LmO>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
