package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.model.TiktokV1StoryGetSocialProofResponse;
import com.ss.android.ugc.aweme.story.reveal.IStoryRevealService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS53S0100100_22;
import njp.a;

/* JADX INFO: renamed from: X.0mjj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.record.biz.reveal.socialproof.RevealSocialProofComponent$fetchSocialProof$1", f = "RevealSocialProofComponent.kt", l = {74}, m = "invokeSuspend")
public final class C1407730mjj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1408180mkS LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1407730mjj(C1408180mkS c1408180mkS, InterfaceC1364105Vn<? super C1407730mjj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1408180mkS;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1407730mjj(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        TiktokV1StoryGetSocialProofResponse tiktokV1StoryGetSocialProofResponse;
        List<? extends User> listLJJJJLI;
        C1C7U.LIZ("RevealSocialProofComponent@3b14.fetchSocialProof$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                IStoryRevealService iStoryRevealService = (IStoryRevealService) PluggableExtentionKt.pluggableSpi$default(IStoryRevealService.class, false, false, false, 14, null);
                if (iStoryRevealService != null) {
                    this.LL = 1;
                    obj = iStoryRevealService.getSocialProof(1, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("RevealSocialProofComponent@3b14.fetchSocialProof$1");
                        return objLJFF;
                    }
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("RevealSocialProofComponent@3b14.fetchSocialProof$1");
                return unit;
            }
            tiktokV1StoryGetSocialProofResponse = (TiktokV1StoryGetSocialProofResponse) obj;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (tiktokV1StoryGetSocialProofResponse != null) {
            List<User> list = tiktokV1StoryGetSocialProofResponse.relevantUsers;
            if (list != null) {
                listLJJJJLI = C13LP.LJJJJLI(list);
            } else {
                listLJJJJLI = null;
            }
            if (listLJJJJLI == null) {
                listLJJJJLI = C13BV.INSTANCE;
            }
            long j = tiktokV1StoryGetSocialProofResponse.totalCount;
            if (listLJJJJLI.size() >= 2) {
                C1408180mkS c1408180mkS = this.LLILLJJLI;
                c1408180mkS.LLJJI = listLJJJJLI;
                c1408180mkS.LLJJIII = j;
                c1408180mkS.i3(new AwS53S0100100_22(listLJJJJLI, (List<? extends User>) j, 0));
                C1408180mkS c1408180mkS2 = this.LLILLJJLI;
                if (c1408180mkS2.LLJJIJIIJIL) {
                    c1408180mkS2.P4();
                }
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("RevealSocialProofComponent@3b14.fetchSocialProof$1");
            return unit2;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("RevealSocialProofComponent@3b14.fetchSocialProof$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
