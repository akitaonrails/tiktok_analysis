package X;

/* JADX INFO: renamed from: X.0m4r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sharepanel.impl.relations.data.core.loader.FollowLoader", f = "FollowLoader.kt", l = {38, 47}, m = "loadInternal")
public final class C1382390m4r extends AbstractC23140094w {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1382380m4q LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1382390m4r(C1382380m4q c1382380m4q, InterfaceC1364105Vn<? super C1382390m4r> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1382380m4q;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FollowLoader@e66b.loadInternal$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJ = this.LLILLL.LJ(this);
        C1C7U.LIZIZ("FollowLoader@e66b.loadInternal$1");
        return objLJ;
    }
}
