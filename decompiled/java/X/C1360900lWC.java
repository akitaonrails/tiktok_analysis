package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.friendstab.model.NewContentResponse;
import com.ss.android.ugc.aweme.friendstab.model.RepostUserNewContent;
import com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3RepostEntranceVM;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS600S0100000_21;
import njp.a;

/* JADX INFO: renamed from: X.0lWC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3RepostEntranceVM$request$1", f = "FriendsV3RepostEntranceVM.kt", l = {41}, m = "invokeSuspend")
public final class C1360900lWC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ FriendsV3RepostEntranceVM LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1360900lWC(long j, FriendsV3RepostEntranceVM friendsV3RepostEntranceVM, InterfaceC1364105Vn<? super C1360900lWC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = j;
        this.LLILZ = friendsV3RepostEntranceVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1360900lWC c1360900lWC = new C1360900lWC(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1360900lWC.LLILLJJLI = obj;
        return c1360900lWC;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        NewContentResponse.RepostFeedRedDotResponse repostFeedResponse;
        C1C7U.LIZ("FriendsV3RepostEntranceVM@83b8.request$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                ISocial2TabRedDotService iSocial2TabRedDotServiceLIZIZ = C1595430rcT.LIZIZ.LIZIZ();
                EnumC1586970rOp enumC1586970rOp = EnumC1586970rOp.COLD_START;
                EnumC586680Mzi enumC586680Mzi = EnumC586680Mzi.REPOST_IN_FRIENDS_WATERFALL;
                this.LL = 1;
                obj = iSocial2TabRedDotServiceLIZIZ.requestAnyway(enumC1586970rOp, enumC586680Mzi, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("FriendsV3RepostEntranceVM@83b8.request$1");
                    return objLJFF;
                }
            }
            c098200Yq = (NewContentResponse) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        long j = this.LLILLL;
        FriendsV3RepostEntranceVM friendsV3RepostEntranceVM = this.LLILZ;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            NewContentResponse newContentResponse = (NewContentResponse) c098200Yq;
            C0W17.LIZJ("repostVM", "request repostEntrance response");
            Integer numLJ = null;
            if (newContentResponse != null) {
                repostFeedResponse = newContentResponse.getRepostFeedResponse();
            } else {
                repostFeedResponse = null;
            }
            if (repostFeedResponse != null) {
                ArrayList<RepostUserNewContent> avatarList = repostFeedResponse.getAvatarList();
                if (avatarList != null && !avatarList.isEmpty()) {
                    z = false;
                }
                if (!z) {
                    StringBuilder sb = new StringBuilder("request repostEntrance response, userSize=");
                    ArrayList<RepostUserNewContent> avatarList2 = repostFeedResponse.getAvatarList();
                    if (avatarList2 != null) {
                        numLJ = C2286608xc.LJ(avatarList2.size());
                    }
                    sb.append(numLJ);
                    C0W17.LIZJ("repostVM", sb.toString());
                    friendsV3RepostEntranceVM.setState(new AwS600S0100000_21(new C1361350lWv(j, repostFeedResponse, -1, -1), 127));
                }
            }
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C0W17.LIZIZ("repostVM", thM5exceptionOrNullimpl);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FriendsV3RepostEntranceVM@83b8.request$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
