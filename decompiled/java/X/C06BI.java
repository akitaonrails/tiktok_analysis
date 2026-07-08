package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06BI, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.utils.idempotent.StreakIdempotentUtil$idempotentLogic$1", f = "StreakIdempotentUtil.kt", l = {56, LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C06BI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC383701eN LL;
    public C06BK LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ C06BK LLILZIL;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<? super Boolean>, Object> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C06BI(C06BK c06bk, Function1<? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function1, InterfaceC1364105Vn<? super C06BI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c06bk;
        this.LLILZLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06BI(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c3 A[Catch: all -> 0x0105, TryCatch #1 {all -> 0x0105, blocks: (B:28:0x00b8, B:29:0x00bb, B:31:0x00c3, B:32:0x00ec, B:37:0x0101), top: B:43:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ec A[Catch: all -> 0x0105, TRY_LEAVE, TryCatch #1 {all -> 0x0105, blocks: (B:28:0x00b8, B:29:0x00bb, B:31:0x00c3, B:32:0x00ec, B:37:0x0101), top: B:43:0x0010 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06BI.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
