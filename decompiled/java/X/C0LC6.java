package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0LC6, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LC6 extends C09AY implements Function0<C538980LBw> {
    public final /* synthetic */ C0LC5 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LC6(C0LC5 c0lc5) {
        super(0);
        this.LL = c0lc5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C538980LBw invoke() {
        return new C538980LBw(new C0LCB(this.LL), new C0LC7(this.LL), new C0LC9(this.LL), new C0LC8(this.LL));
    }
}
