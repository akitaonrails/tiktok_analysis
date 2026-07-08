package X;

import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PDq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel$updateActiveStatusData$2$1$1", f = "SkylightListViewModel.kt", l = {1061, 449}, m = "invokeSuspend")
public final class C641360PDq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public SkylightListViewModel LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ SkylightListViewModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C641360PDq(SkylightListViewModel skylightListViewModel, InterfaceC1364105Vn<? super C641360PDq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = skylightListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C641360PDq c641360PDq = new C641360PDq(this.LLILZIL, interfaceC1364105Vn);
        c641360PDq.LLILZ = obj;
        return c641360PDq;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(1:(1:(9:6|43|18|19|(1:24)(1:23)|(1:26)(2:27|(1:31))|32|37|38)(2:7|8))(1:9))(2:10|(2:12|13))|45|14|(2:16|17)|19|(4:21|24|(0)(0)|32)(0)|37|38|(2:(1:48)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b8, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073 A[Catch: all -> 0x00b6, TryCatch #0 {all -> 0x00b6, blocks: (B:18:0x005e, B:19:0x0061, B:21:0x0069, B:26:0x0073, B:32:0x00b0, B:27:0x00a3, B:29:0x00a7, B:31:0x00ad), top: B:43:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3 A[Catch: all -> 0x00b6, TryCatch #0 {all -> 0x00b6, blocks: (B:18:0x005e, B:19:0x0061, B:21:0x0069, B:26:0x0073, B:32:0x00b0, B:27:0x00a3, B:29:0x00a7, B:31:0x00ad), top: B:43:0x005e }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C641360PDq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
