package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09JA, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl$cancelAndDeleteTasksByTaskIds$2", f = "CreationAsyncTaskManagerImpl.kt", l = {503, 512, 524, 524}, m = "invokeSuspend")
public final class C09JA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ List<String> LLILZ;
    public final /* synthetic */ List<InterfaceC542770LQl<C09JG, AbsTaskOutput>> LLILZIL;
    public final /* synthetic */ CreationAsyncTaskManagerImpl LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C09JA(List<String> list, List<? extends InterfaceC542770LQl<? super C09JG, ? extends AbsTaskOutput>> list2, CreationAsyncTaskManagerImpl creationAsyncTaskManagerImpl, InterfaceC1364105Vn<? super C09JA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = list;
        this.LLILZIL = list2;
        this.LLILZLL = creationAsyncTaskManagerImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09JA(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8 A[LOOP:3: B:34:0x00b2->B:36:0x00b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005c -> B:9:0x0026). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x006c -> B:9:0x0026). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x009b -> B:33:0x00ac). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09JA.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
