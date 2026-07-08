package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;

/* JADX INFO: renamed from: X.0LVZ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.EditI2VServerTask", f = "EditI2VServerTask.kt", l = {275, 284, 293, 299, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 307}, m = "handleServerTaskDetail")
public final class C0LVZ extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0LVQ LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LVZ(C0LVQ c0lvq, InterfaceC1364105Vn<? super C0LVZ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0lvq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditI2VServerTask@cf5c.handleServerTaskDetail$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJJLL = this.LLILLJJLI.LJJJJLL(null, this);
        C1C7U.LIZIZ("EditI2VServerTask@cf5c.handleServerTaskDetail$1");
        return objLJJJJLL;
    }
}
