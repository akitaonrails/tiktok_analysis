package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0tl7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.foundation.gestures.UpdatableAnimationState", f = "UpdatableAnimationState.kt", l = {102, 153}, m = "animateToZero")
public final class C1677670tl7 extends AbstractC23140094w {
    public C1677660tl6 LL;
    public InterfaceC1451105m9 LLILLJJLI;
    public Function0 LLILLL;
    public float LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C1677660tl6 LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1677670tl7(C1677660tl6 c1677660tl6, InterfaceC1364105Vn<? super C1677670tl7> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c1677660tl6;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        return this.LLILZLL.LIZ(this, null, null);
    }
}
