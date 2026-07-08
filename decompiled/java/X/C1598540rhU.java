package X;

import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0rhU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel$onCoordinatorBizRefresh$1", f = "SkylightListViewModel.kt", l = {491, 1061, 495, 497}, m = "invokeSuspend")
public final class C1598540rhU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC383701eN LL;
    public SkylightListViewModel LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ SkylightListViewModel LLILZIL;
    public final /* synthetic */ List<InterfaceC1891350zJl> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1598540rhU(SkylightListViewModel skylightListViewModel, List<? extends InterfaceC1891350zJl> list, InterfaceC1364105Vn<? super C1598540rhU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = skylightListViewModel;
        this.LLILZLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1598540rhU(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ca A[Catch: all -> 0x014b, TRY_LEAVE, TryCatch #1 {all -> 0x014b, blocks: (B:39:0x00c3, B:40:0x00c6, B:42:0x00ca, B:46:0x0147), top: B:52:0x0012 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1598540rhU.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
