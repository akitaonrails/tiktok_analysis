package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YZl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.push.impl.innerpush.workflow.IMInnerPushLocalCompensationProcessor$tryReshowLatestUnreadConversationsAsInnerPush$1", f = "IMInnerPushLocalCompensationProcessor.kt", l = {175}, m = "invokeSuspend")
public final class C876350YZl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C876390YZp LLILLJJLI;
    public final /* synthetic */ List<C0Y8T> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C876350YZl(C876390YZp c876390YZp, List<C0Y8T> list, InterfaceC1364105Vn<? super C876350YZl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c876390YZp;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C876350YZl(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b3 A[EDGE_INSN: B:47:0x00b3->B:35:0x00b3 BREAK  A[LOOP:0: B:17:0x004a->B:48:0x004a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x004a A[SYNTHETIC] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C876350YZl.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
