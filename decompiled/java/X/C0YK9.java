package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;

/* JADX INFO: renamed from: X.0YK9, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.receivebuffer.SingleInboxMessageReceiveBuffer", f = "SingleInboxMessageReceiveBuffer.kt", l = {DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL}, m = "moveToProcessingStateFrom")
public final class C0YK9 extends AbstractC23140094w {
    public C0Y3I LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C872150YJh LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YK9(C872150YJh c872150YJh, InterfaceC1364105Vn<? super C0YK9> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c872150YJh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SingleInboxMessageReceiveBuffer@ad98.moveToProcessingStateFrom$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIIIIZZ = this.LLILLL.LJIIIIZZ(null, 0, this);
        C1C7U.LIZIZ("SingleInboxMessageReceiveBuffer@ad98.moveToProcessingStateFrom$1");
        return objLJIIIIZZ;
    }
}
