package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SuN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C736250SuN extends C09AY implements Function0<Float> {
    public final /* synthetic */ ViewOnTouchListenerC736230SuL LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C736250SuN(ViewOnTouchListenerC736230SuL viewOnTouchListenerC736230SuL) {
        super(0);
        this.LL = viewOnTouchListenerC736230SuL;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(C0FV2.LIZ(this.LL.LL.getContext()) - C339190DRl.LIZ(30));
    }
}
