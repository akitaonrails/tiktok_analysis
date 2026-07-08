package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0z34, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1881000z34 extends C09AY implements Function0<C1882050z4l> {
    public final /* synthetic */ C1880920z2w LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1881000z34(C1880920z2w c1880920z2w) {
        super(0);
        this.LL = c1880920z2w;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1882050z4l invoke() {
        C1882050z4l c1882050z4l = new C1882050z4l(this.LL);
        c1882050z4l.LLILZ = C13LQ.LJLIIL(new String[]{"game_info", "reward_list"});
        return c1882050z4l;
    }
}
