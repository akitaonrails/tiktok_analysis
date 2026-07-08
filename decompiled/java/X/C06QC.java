package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06QC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.saas.host.impl.streak.SingleChatPostStreakToStoryHandler$postToStory$1", f = "SingleChatPostStreakToStoryHandler.kt", l = {92}, m = "invokeSuspend")
public final class C06QC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C06QD LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06QC(C06QD c06qd, boolean z, InterfaceC1364105Vn<? super C06QC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c06qd;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06QC(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        User userLJII;
        C1C7U.LIZ("SingleChatPostStreakToStoryHandler@3957.postToStory$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LLILLJJLI.LIZLLL.LIZIZ();
            C06QD c06qd = this.LLILLJJLI;
            if (c06qd.LJI == -1) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                c06qd.LJI = (int) C0YNY.LIZ(InterfaceC874680YTa.LIZ).LJJIJIIJI(c06qd.LIZ.getConversationId(), new int[]{1, 15}, null);
                C1231704rr c1231704rr = c06qd.LIZLLL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fetch msg count ");
                sbLIZ.append(c06qd.LJI);
                sbLIZ.append(", duration ");
                sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
                C2188811AlT.LIZIZ(sbLIZ);
                c1231704rr.LIZIZ();
            }
            c06qd.LJI = c06qd.LJI;
            IMUser singleChatFromUser = this.LLILLJJLI.LIZ.getSingleChatFromUser();
            if (singleChatFromUser != null) {
                IMUser.Companion.getClass();
                userLJII = C2201941BFw.LJII(singleChatFromUser);
            } else {
                userLJII = null;
            }
            C1231704rr c1231704rr2 = this.LLILLJJLI.LIZLLL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("start postToStory streakLevel=");
            sbLIZ2.append(this.LLILLJJLI.LIZIZ);
            sbLIZ2.append(" messageCount=");
            sbLIZ2.append(this.LLILLJJLI.LJI);
            C2188811AlT.LIZIZ(sbLIZ2);
            c1231704rr2.LIZIZ();
            C06QD c06qd2 = this.LLILLJJLI;
            C1598406Nq c1598406Nq = c06qd2.LJII;
            if (c1598406Nq == null) {
                synchronized (c06qd2) {
                    c1598406Nq = c06qd2.LJII;
                    if (c1598406Nq == null) {
                        c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                        c06qd2.LJII = c1598406Nq;
                    }
                }
            }
            AbstractC2252651DEx abstractC2252651DEx = c1598406Nq.LIZIZ;
            C06QB c06qb = new C06QB(this.LLILLJJLI, userLJII, this.LLILLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2252651DEx, c06qb) == objLJFF) {
                C1C7U.LIZIZ("SingleChatPostStreakToStoryHandler@3957.postToStory$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SingleChatPostStreakToStoryHandler@3957.postToStory$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
