package X;

import com.ss.android.ugc.aweme.aigc.asynctask.net.TasksDetailResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0LVh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.EditorProR2VTask$requestProgress$2", f = "EditorProR2VTask.kt", l = {233, 236}, m = "invokeSuspend")
public final class C544030LVh extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TasksDetailResponse LLILLJJLI;
    public final /* synthetic */ C543980LVc LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C544030LVh(TasksDetailResponse tasksDetailResponse, C543980LVc c543980LVc, String str, InterfaceC1364105Vn<? super C544030LVh> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = tasksDetailResponse;
        this.LLILLL = c543980LVc;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C544030LVh(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "EditorProR2VTask@7046.requestProgress$2"
            X.C1C7U.LIZ(r9)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r10.LL
            r6 = 0
            r8 = 2
            r7 = 1
            if (r0 == 0) goto L1d
            if (r0 == r7) goto L91
            if (r0 != r8) goto L89
            X.C155000ia.LIZIZ(r11)
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L1d:
            X.C155000ia.LIZIZ(r11)
            com.ss.android.ugc.aweme.aigc.asynctask.net.TasksDetailResponse r0 = r10.LLILLJJLI
            java.util.List r0 = r0.getTaskStatuses()
            java.lang.String r3 = r10.LLILZ
            java.util.Iterator r2 = r0.iterator()
        L2c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.aigc.asynctask.net.TaskDetail r0 = (com.ss.android.ugc.aweme.aigc.asynctask.net.TaskDetail) r0
            java.lang.String r0 = r0.getTaskId()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
            if (r0 == 0) goto L2c
        L43:
            com.ss.android.ugc.aweme.aigc.asynctask.net.TaskDetail r1 = (com.ss.android.ugc.aweme.aigc.asynctask.net.TaskDetail) r1
            X.0C64 r5 = X.C0C64.LJIILLIIL()
            r3 = 0
            java.lang.String r2 = "studio_enable_ai_create_remove_task_id_check"
            r0 = 31744(0x7c00, float:4.4483E-41)
            boolean r0 = r5.LJIIIZ(r0, r2, r7, r3)
            if (r0 == 0) goto L62
            if (r1 != 0) goto L7b
            com.ss.android.ugc.aweme.aigc.asynctask.net.TasksDetailResponse r0 = r10.LLILLJJLI
            java.util.List r0 = r0.getTaskStatuses()
            java.lang.Object r1 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.aigc.asynctask.net.TaskDetail r1 = (com.ss.android.ugc.aweme.aigc.asynctask.net.TaskDetail) r1
        L62:
            if (r1 != 0) goto L7b
            X.0LVc r2 = r10.LLILLL
            r10.LL = r7
            X.0LuK r0 = X.C543980LVc.LJIILLIIL
            r1 = -47367(0xffffffffffff46f9, float:NaN)
            java.lang.String r0 = "task detail null"
            java.lang.Object r0 = r2.LJJJJZI(r1, r0, r6, r10)
            if (r0 != r4) goto L94
            X.C1C7U.LIZIZ(r9)
            return r4
        L79:
            r1 = r6
            goto L43
        L7b:
            X.0LVc r0 = r10.LLILLL
            r10.LL = r8
            java.lang.Object r0 = r0.LJJJJLI(r1, r10)
            if (r0 != r4) goto L17
            X.C1C7U.LIZIZ(r9)
            return r4
        L89:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L91:
            X.C155000ia.LIZIZ(r11)
        L94:
            X.C1C7U.LIZIZ(r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C544030LVh.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
