package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* JADX INFO: renamed from: X.0izk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.repo.MaFUserRepository", f = "MaFUserRepository.kt", l = {BaseNotice.CREATOR}, m = "loadMaFUserList")
public final class C1263900izk extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1263860izg LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1263900izk(C1263860izg c1263860izg, InterfaceC1364105Vn<? super C1263900izk> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1263860izg;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MaFUserRepository@f903.loadMaFUserList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJII = this.LLILLJJLI.LJII(null, this);
        C1C7U.LIZIZ("MaFUserRepository@f903.loadMaFUserList$1");
        return objLJII;
    }
}
