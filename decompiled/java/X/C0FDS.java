package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* JADX INFO: renamed from: X.0FDS, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.sticker.core.text.resource.TextResourceRepository", f = "TextResourceRepository.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "fetchEffectList-BWLJW6A")
public final class C0FDS extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0FDM LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FDS(C0FDM c0fdm, InterfaceC1364105Vn<? super C0FDS> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0fdm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TextResourceRepository@b217.fetchEffectList$2");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJII = this.LLILLL.LJII(null, false, false, this);
        if (objLJII == C099R.LJFF()) {
            C1C7U.LIZIZ("TextResourceRepository@b217.fetchEffectList$2");
            return objLJII;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJII);
        C1C7U.LIZIZ("TextResourceRepository@b217.fetchEffectList$2");
        return c189200o6M1boximpl;
    }
}
