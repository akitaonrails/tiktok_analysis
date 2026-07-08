package X;

import com.ss.android.ugc.aweme.im.protocal.IMMessageProtocol;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* JADX INFO: renamed from: X.0iQS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.protocal.IMMessageProtocol", f = "IMMessageProtocol.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "getResultList")
public final class C1242020iQS extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ IMMessageProtocol LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1242020iQS(IMMessageProtocol iMMessageProtocol, InterfaceC1364105Vn<? super C1242020iQS> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = iMMessageProtocol;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMMessageProtocol@75b1.getResultList$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJI = this.LLILZ.LJI(0, null, null, null, this);
        C1C7U.LIZIZ("IMMessageProtocol@75b1.getResultList$1");
        return objLJI;
    }
}
