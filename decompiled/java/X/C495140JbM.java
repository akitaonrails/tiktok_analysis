package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeApi;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.spotlight.SubscriptionSpotlightFragment;
import com.google.gson.h;
import com.google.gson.n;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS237S0000000_7;
import njp.a;
import webcast.api.sub.SpotlightResponse;
import webcast.api.sub.SpotlightUpdateItem;

/* JADX INFO: renamed from: X.0JbM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.business.perks.spotlight.SubscriptionSpotlightFragment$saveItems$1$response$1", f = "SubscriptionSpotlightFragment.kt", l = {679}, m = "invokeSuspend")
public final class C495140JbM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super SpotlightResponse.ResponseData>, Object> {
    public int LL;
    public final /* synthetic */ SubscriptionSpotlightFragment LLILLJJLI;
    public final /* synthetic */ List<SpotlightUpdateItem> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C495140JbM(SubscriptionSpotlightFragment subscriptionSpotlightFragment, List<SpotlightUpdateItem> list, InterfaceC1364105Vn<? super C495140JbM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = subscriptionSpotlightFragment;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C495140JbM(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ = obj;
        C1C7U.LIZ("SubscriptionSpotlightFragment@e756.saveItems$1$response$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            SubscriptionSpotlightFragment subscriptionSpotlightFragment = this.LLILLJJLI;
            List<SpotlightUpdateItem> list = this.LLILLL;
            this.LL = 1;
            subscriptionSpotlightFragment.getClass();
            h hVar = new h();
            for (SpotlightUpdateItem spotlightUpdateItem : list) {
                n nVar = new n();
                nVar.LJJIIJ("uri", spotlightUpdateItem.uri);
                long j = spotlightUpdateItem.id;
                if (j > 0) {
                    nVar.LJJIII(C2286608xc.LJFF(j), FollowStatusChangeMethod.PARAM_UID);
                }
                boolean z = spotlightUpdateItem.isPinned;
                if (z) {
                    nVar.LJJII(Boolean.valueOf(z), "is_pinned");
                }
                hVar.LJJIFFI(nVar);
            }
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            C480460Ism.LIZ().getClass();
            subscriptionSpotlightFragment.LLJJIJIIJIL.LIZ(C510380Jzw.LJIILJJIL(((SubscribeApi) C480460Ism.LIZLLL(SubscribeApi.class)).updateSpotlight(C2097908Jt.LIZJ(new Pair("spotlight_info", hVar))), EnumC510330Jzr.GENERAL, subscriptionSpotlightFragment.LLJ, "sub/privilege/spotlight/update", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353)).LJJLL(new C09JN() { // from class: X.0Cp1
                @Override // X.C09JN
                public final void accept(Object obj2) {
                    C1C7U.LIZ("SubscriptionSpotlightFragment@e756.updateSpotlight$3$1");
                    InterfaceC1364105Vn<SpotlightResponse.ResponseData> interfaceC1364105Vn = c23260099m;
                    T t = ((BaseResponse) obj2).data;
                    C189200o6.m2constructorimpl(t);
                    interfaceC1364105Vn.resumeWith(t);
                    C1C7U.LIZIZ("SubscriptionSpotlightFragment@e756.updateSpotlight$3$1");
                }
            }, new C09JN() { // from class: X.05XW
                @Override // X.C09JN
                public final void accept(Object obj2) {
                    C1C7U.LIZ("SubscriptionSpotlightFragment@e756.updateSpotlight$3$2");
                    InterfaceC1364105Vn<SpotlightResponse.ResponseData> interfaceC1364105Vn = c23260099m;
                    C098200Yq c098200Yq = new C098200Yq((Throwable) obj2);
                    C189200o6.m2constructorimpl(c098200Yq);
                    interfaceC1364105Vn.resumeWith(c098200Yq);
                    C1C7U.LIZIZ("SubscriptionSpotlightFragment@e756.updateSpotlight$3$2");
                }
            }));
            objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("SubscriptionSpotlightFragment@e756.saveItems$1$response$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SubscriptionSpotlightFragment@e756.saveItems$1$response$1");
        return objLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super SpotlightResponse.ResponseData> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
