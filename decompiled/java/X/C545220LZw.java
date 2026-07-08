package X;

import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: renamed from: X.0LZw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.aigc.workflow.wrapper.I2VEffectWorkflowManagerAdapter", f = "I2VEffectWorkflowManagerAdapter.kt", l = {101, 119}, m = "observeWorkflowState")
public final class C545220LZw extends AbstractC23140094w {
    public Object LL;
    public LifecycleOwner LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C545090LZj LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C545220LZw(C545090LZj c545090LZj, InterfaceC1364105Vn<? super C545220LZw> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c545090LZj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("I2VEffectWorkflowManagerAdapter@87e2.observeWorkflowState$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJIIIIZZ = this.LLILZ.LJIIIIZZ(null, null, this);
        C1C7U.LIZIZ("I2VEffectWorkflowManagerAdapter@87e2.observeWorkflowState$1");
        return objLJIIIIZZ;
    }
}
