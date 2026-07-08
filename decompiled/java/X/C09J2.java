package X;

import com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09J2, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl$clearTaskSafely$1", f = "CreationAsyncTaskManagerImpl.kt", l = {199, 214}, m = "invokeSuspend")
public final class C09J2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public InterfaceC542770LQl LLILZ;
    public int LLILZIL;
    public final /* synthetic */ CreationAsyncTaskManagerImpl LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09J2(CreationAsyncTaskManagerImpl creationAsyncTaskManagerImpl, Function0<Unit> function0, String str, InterfaceC1364105Vn<? super C09J2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = creationAsyncTaskManagerImpl;
        this.LLIZ = function0;
        this.LLIZLLLIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09J2(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c3 A[LOOP:2: B:25:0x00bd->B:27:0x00c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0063 -> B:20:0x007a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00f6 -> B:32:0x0106). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09J2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
