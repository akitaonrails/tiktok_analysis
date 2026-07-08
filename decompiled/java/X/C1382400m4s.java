package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* JADX INFO: renamed from: X.0m4s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sharepanel.impl.relations.data.core.loader.FollowLoader", f = "FollowLoader.kt", l = {BaseNotice.CREATOR}, m = "loadMoreInternal")
public final class C1382400m4s extends AbstractC23140094w {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1382380m4q LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1382400m4s(C1382380m4q c1382380m4q, InterfaceC1364105Vn<? super C1382400m4s> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1382380m4q;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FollowLoader@e66b.loadMoreInternal$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJI = this.LLILLL.LJI(this);
        C1C7U.LIZIZ("FollowLoader@e66b.loadMoreInternal$1");
        return objLJI;
    }
}
