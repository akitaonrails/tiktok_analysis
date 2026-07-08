package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YTj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.im.core.send.MessageTaskQueue$enqueue$1", f = "MessageTaskQueue.kt", l = {BaseNotice.CREATOR, 66, 68}, m = "invokeSuspend")
public final class C874770YTj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC874870YTt LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ InterfaceC874870YTt LLILZ;
    public final /* synthetic */ C874740YTg LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C874770YTj(InterfaceC874870YTt interfaceC874870YTt, C874740YTg c874740YTg, InterfaceC1364105Vn<? super C874770YTj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = interfaceC874870YTt;
        this.LLILZIL = c874740YTg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C874770YTj(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0  */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0YTp] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C874770YTj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
