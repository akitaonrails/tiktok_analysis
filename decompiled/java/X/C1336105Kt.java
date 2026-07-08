package X;

import com.ss.android.ugc.aweme.affinity.model.SocialAffinityItem;
import com.ss.android.ugc.aweme.affinity.service.ISocialAffinityService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.mixsearch.MixSearchServiceImpl;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Kt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mixsearch.MixSearchServiceImpl$updateMutualFriendAndAffinityMap$1", f = "MixSearchServiceImpl.kt", l = {164, 174}, m = "invokeSuspend")
public final class C1336105Kt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MixSearchServiceImpl LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1336105Kt(MixSearchServiceImpl mixSearchServiceImpl, InterfaceC1364105Vn<? super C1336105Kt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mixSearchServiceImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1336105Kt(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Map<String, SocialAffinityItem> mapLIZIZ;
        C1C7U.LIZ("MixSearchServiceImpl@ff6.updateMutualFriendAndAffinityMap$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MixSearchServiceImpl@ff6.updateMutualFriendAndAffinityMap$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            List<IMUser> allFriends = C1336205Ku.LIZ(false).getImUserService().getAllFriends();
            MixSearchServiceImpl mixSearchServiceImpl = this.LLILLJJLI;
            C2232408os c2232408os = mixSearchServiceImpl.LIZJ;
            C1335905Kr c1335905Kr = new C1335905Kr(mixSearchServiceImpl, allFriends, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c2232408os, c1335905Kr) == objLJFF) {
                C1C7U.LIZIZ("MixSearchServiceImpl@ff6.updateMutualFriendAndAffinityMap$1");
                return objLJFF;
            }
        }
        ISocialAffinityService iSocialAffinityService = (ISocialAffinityService) PluggableExtentionKt.pluggableSpi$default(ISocialAffinityService.class, false, false, false, 14, null);
        if (iSocialAffinityService != null && (mapLIZIZ = iSocialAffinityService.LIZIZ("default")) != null) {
            MixSearchServiceImpl mixSearchServiceImpl2 = this.LLILLJJLI;
            C2232408os c2232408os2 = mixSearchServiceImpl2.LIZJ;
            C1336005Ks c1336005Ks = new C1336005Ks(mixSearchServiceImpl2, mapLIZIZ, null);
            this.LL = 2;
            if (C23250099c.LJI(this, c2232408os2, c1336005Ks) == objLJFF) {
                C1C7U.LIZIZ("MixSearchServiceImpl@ff6.updateMutualFriendAndAffinityMap$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MixSearchServiceImpl@ff6.updateMutualFriendAndAffinityMap$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
