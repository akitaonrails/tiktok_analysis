package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0z32, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1880980z32 extends C09AY implements Function0<C1882060z4m> {
    public final /* synthetic */ C1880920z2w LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1880980z32(C1880920z2w c1880920z2w) {
        super(0);
        this.LL = c1880920z2w;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1882060z4m invoke() {
        C1882060z4m c1882060z4m = new C1882060z4m(this.LL);
        c1882060z4m.LLILLL = C13LQ.LJLIIL(new String[]{"game_info", "reward_list"});
        return c1882060z4m;
    }
}
