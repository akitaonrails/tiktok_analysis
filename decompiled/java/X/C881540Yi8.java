package X;

import Y.AgS203S0200000_14;
import com.ss.android.ugc.aweme.story.friendanniversary.StoryFriendAnniversaryService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Yi8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.updater.story.ChatListStoryFriendAnniversaryUpdater$bindPage$1", f = "ChatListStoryFriendAnniversaryUpdater.kt", l = {79}, m = "invokeSuspend")
public final class C881540Yi8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C881530Yi7 LLILLJJLI;
    public final /* synthetic */ InterfaceC879010Ye3 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C881540Yi8(C881530Yi7 c881530Yi7, InterfaceC879010Ye3 interfaceC879010Ye3, InterfaceC1364105Vn<? super C881540Yi8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c881530Yi7;
        this.LLILLL = interfaceC879010Ye3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C881540Yi8(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C902380Zae c902380ZaeLIZ;
        InterfaceC332260D0u interfaceC332260D0uLJFF;
        C1C7U.LIZ("ChatListStoryFriendAnniversaryUpdater@a757.bindPage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            StoryFriendAnniversaryService.LIZ.getClass();
            StoryFriendAnniversaryService storyFriendAnniversaryServiceLIZ = C902340Zaa.LIZ();
            if (storyFriendAnniversaryServiceLIZ != null && (c902380ZaeLIZ = storyFriendAnniversaryServiceLIZ.LIZ(C461720I8s.LIZIZ())) != null && (interfaceC332260D0uLJFF = c902380ZaeLIZ.LJFF()) != null) {
                AgS203S0200000_14 agS203S0200000_14 = new AgS203S0200000_14(this.LLILLJJLI, this.LLILLL, 7);
                this.LL = 1;
                if (interfaceC332260D0uLJFF.collect(agS203S0200000_14, this) == objLJFF) {
                    C1C7U.LIZIZ("ChatListStoryFriendAnniversaryUpdater@a757.bindPage$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("ChatListStoryFriendAnniversaryUpdater@a757.bindPage$1");
                return unit;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
