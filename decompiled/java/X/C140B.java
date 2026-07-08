package X;

import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.140B, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.C2PAAIGCManager$generateC2PAInfo$6", f = "C2PAAIGCManager.kt", l = {367, 369}, m = "invokeSuspend")
public final class C140B extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ AIGCInfo LLILZ;
    public final /* synthetic */ MediaModel LLILZIL;
    public final /* synthetic */ C15464063q LLILZLL;
    public final /* synthetic */ long LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C140B(long j, C15464063q c15464063q, AIGCInfo aIGCInfo, MediaModel mediaModel, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = aIGCInfo;
        this.LLILZIL = mediaModel;
        this.LLILZLL = c15464063q;
        this.LLIZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        AIGCInfo aIGCInfo = this.LLILZ;
        MediaModel mediaModel = this.LLILZIL;
        return new C140B(this.LLIZ, this.LLILZLL, aIGCInfo, mediaModel, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0165 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140B.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
