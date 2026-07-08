package X;

import com.ss.android.ugc.aweme.im.feature.animation.AnimationQueueManagerAssem;

/* JADX INFO: renamed from: X.05ct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.feature.animation.AnimationQueueManagerAssem", f = "AnimationQueueManagerAssem.kt", l = {356}, m = "processQueue")
public final class C1393705ct extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AnimationQueueManagerAssem LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1393705ct(AnimationQueueManagerAssem animationQueueManagerAssem, InterfaceC1364105Vn<? super C1393705ct> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = animationQueueManagerAssem;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AnimationQueueManagerAssem@5e87.processQueue$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objProcessQueue = this.LLILLJJLI.processQueue(this);
        C1C7U.LIZIZ("AnimationQueueManagerAssem@5e87.processQueue$1");
        return objProcessQueue;
    }
}
