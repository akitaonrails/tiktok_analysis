package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L01, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.AutoCut2MAETask$handleMusicPhaseCompleted$2", f = "AutoCut2MAETask.kt", l = {560}, m = "invokeSuspend")
public final class C0L01 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C541110LKb LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L01(C541110LKb c541110LKb, String str, InterfaceC1364105Vn<? super C0L01> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c541110LKb;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0L01 c0l01 = new C0L01(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c0l01.LLILLJJLI = obj;
        return c0l01;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0L01.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
