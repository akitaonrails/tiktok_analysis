package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPollViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OCm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPollViewModel$pollVote$1", f = "BulletinPollViewModel.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "invokeSuspend")
public final class C615580OCm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BulletinPollViewModel LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ C0OJU LLJ;
    public final /* synthetic */ C618680OOk LLJI;
    public final /* synthetic */ C618680OOk LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C615580OCm(BulletinPollViewModel bulletinPollViewModel, int i, long j, long j2, long j3, long j4, int i2, C0OJU c0oju, C618680OOk c618680OOk, C618680OOk c618680OOk2, InterfaceC1364105Vn<? super C615580OCm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bulletinPollViewModel;
        this.LLILLL = i;
        this.LLILZ = j;
        this.LLILZIL = j2;
        this.LLILZLL = j3;
        this.LLIZ = j4;
        this.LLIZLLLIL = i2;
        this.LLJ = c0oju;
        this.LLJI = c618680OOk;
        this.LLJIJIL = c618680OOk2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C615580OCm(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJ;
        Object objPollVote = obj;
        C1C7U.LIZ("BulletinPollViewModel@e5c0.pollVote$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objPollVote);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objPollVote);
            C0OKS c0oks = (C0OKS) this.LLILLJJLI.LL.getValue().getOperator();
            int i2 = this.LLILLL;
            long j = this.LLILZ;
            long j2 = this.LLILZIL;
            long j3 = this.LLILZLL;
            long j4 = this.LLIZ;
            int i3 = this.LLIZLLLIL;
            this.LL = 1;
            objPollVote = c0oks.pollVote(i2, j, j2, j3, j4, i3, this);
            if (objPollVote == objLJFF) {
                C1C7U.LIZIZ("BulletinPollViewModel@e5c0.pollVote$1");
                return objLJFF;
            }
        }
        BaseResponse baseResponse = (BaseResponse) objPollVote;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("poll vote response status code = ");
        if (baseResponse != null) {
            numLJ = C2286608xc.LJ(baseResponse.status_code);
        } else {
            numLJ = null;
        }
        sbLIZ.append(numLJ);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        if (baseResponse != null && baseResponse.status_code == 0) {
            C0OJU c0oju = this.LLJ;
            if (c0oju != null) {
                C618680OOk c618680OOk = this.LLJI;
                C0OKA c0oka = C0OKA.UPDATE;
                c0oju.jZ1(c618680OOk, C618680OOk.LLIIIL(c618680OOk, null, false, false, false, false, 0, 0, c0oka.ordinal(), null, 917503), c0oka);
            }
        } else {
            C0OJU c0oju2 = this.LLJ;
            if (c0oju2 != null) {
                c0oju2.jZ1(this.LLJI, this.LLJIJIL, C0OKA.UPDATE);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinPollViewModel@e5c0.pollVote$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
