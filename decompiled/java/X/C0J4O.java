package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0J4O, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J4O extends C09AY implements Function0<Integer> {
    public final /* synthetic */ C0J4N LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0J4O(C0J4N c0j4n) {
        super(0);
        this.LL = c0j4n;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Integer invoke() {
        return Integer.valueOf(C786410Ut5.n3(this.LL.getContext().getResources(), "screen_simple", "layout", "android"));
    }
}
