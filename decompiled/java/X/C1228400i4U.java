package X;

import com.ss.android.ugc.aweme.selector.choosegroup.FanGroupChooseGroupViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0i4U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.selector.choosegroup.FanGroupChooseGroupViewModel$refresh$1", f = "FanGroupChooseGroupViewModel.kt", l = {99}, m = "invokeSuspend")
public final class C1228400i4U extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FanGroupChooseGroupViewModel LLILLJJLI;
    public final /* synthetic */ C1228410i4V LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1228400i4U(FanGroupChooseGroupViewModel fanGroupChooseGroupViewModel, C1228410i4V c1228410i4V, InterfaceC1364105Vn<? super C1228400i4U> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = fanGroupChooseGroupViewModel;
        this.LLILLL = c1228410i4V;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1228400i4U(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0072 A[Catch: all -> 0x00ab, TryCatch #0 {all -> 0x00ab, blocks: (B:17:0x005f, B:18:0x0062, B:21:0x0068, B:23:0x006c, B:25:0x0072, B:26:0x0074, B:27:0x007a, B:31:0x0092, B:33:0x00a1, B:11:0x003c, B:13:0x004b), top: B:40:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1228400i4U.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
