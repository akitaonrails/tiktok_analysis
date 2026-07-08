package X;

import com.ss.android.ugc.aweme.component.ca.OpenCANeedSyncViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uoj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.ca.OpenCANeedSyncViewModel$loopForResult$2", f = "OpenCANeedSyncViewModel.kt", l = {122, 130, 139}, m = "invokeSuspend")
public final class C1718350uoj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public final /* synthetic */ OpenCANeedSyncViewModel LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1718350uoj(OpenCANeedSyncViewModel openCANeedSyncViewModel, String str, boolean z, InterfaceC1364105Vn<? super C1718350uoj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = openCANeedSyncViewModel;
        this.LLILZ = str;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1718350uoj(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c3, code lost:
    
        r1 = r10.LLILLL;
        r1.LL = true;
        r1.LLILLJJLI = "query";
        r1.setState(kotlin.jvm.internal.AFwS268S0000000_26.get$arr$(586));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:42:0x00a4, B:28:0x006b], limit reached: 67 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043 A[Catch: Exception -> 0x00e5, TryCatch #0 {Exception -> 0x00e5, blocks: (B:17:0x003d, B:19:0x0043), top: B:62:0x003d }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x008f -> B:46:0x00c3). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1718350uoj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
