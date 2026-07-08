package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NFG, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.utils.IntelligentPopupHelper$processPopupByIntelligence$3", f = "IntelligentPopupHelper.kt", l = {91, 101, 106}, m = "invokeSuspend")
public final class C0NFG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1917290zzb LLILLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0NFG(C1917290zzb c1917290zzb, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C0NFG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1917290zzb;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NFG(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00da, code lost:
    
        if (r5 < 2) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00b0 -> B:19:0x00bb). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NFG.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
