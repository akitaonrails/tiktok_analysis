package X;

import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.ui.EcSearchNoCartFeedVideoGuideAssem;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.vm.EcSearchNoCartFeedVideoGuideVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feedbar.EcSearchFeedBarAbility;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0wAQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.videoguide.ui.EcSearchNoCartFeedVideoGuideAssem$initSubscriber$2$1", f = "EcSearchNoCartFeedVideoGuideAssem.kt", l = {302}, m = "invokeSuspend")
public final class C1770240wAQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EcSearchNoCartFeedVideoGuideAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1770240wAQ(EcSearchNoCartFeedVideoGuideAssem ecSearchNoCartFeedVideoGuideAssem, InterfaceC1364105Vn<? super C1770240wAQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = ecSearchNoCartFeedVideoGuideAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1770240wAQ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        String bcmChainStandardStringByFinder;
        Object obj4;
        C21244318Bt c21244318Bt;
        String str;
        Object objLJIJ = obj;
        C1C7U.LIZ("EcSearchNoCartFeedVideoGuideAssem@a3d6.initSubscriber$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Object obj5 = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJIJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJIJ);
            this.LLILLJJLI.LLLLIIL.put(Scene.SCENE_SERVICE, C2286608xc.LJ(2));
            EcSearchNoCartFeedVideoGuideAssem ecSearchNoCartFeedVideoGuideAssem = this.LLILLJJLI;
            Map<String, Object> map = ecSearchNoCartFeedVideoGuideAssem.LLLLIIL;
            C724270Sb3 c724270Sb3 = ecSearchNoCartFeedVideoGuideAssem.LLJI;
            if (c724270Sb3 != null) {
                obj2 = c724270Sb3.LL;
            } else {
                obj2 = null;
            }
            String aid = ((VideoItemParams) obj2).getAweme().getAid();
            if (aid == null) {
                aid = "";
            }
            map.put("aweme_id", aid);
            EcSearchNoCartFeedVideoGuideAssem ecSearchNoCartFeedVideoGuideAssem2 = this.LLILLJJLI;
            Map<String, Object> map2 = ecSearchNoCartFeedVideoGuideAssem2.LLLLIIL;
            C724270Sb3 c724270Sb32 = ecSearchNoCartFeedVideoGuideAssem2.LLJI;
            if (c724270Sb32 != null) {
                obj3 = c724270Sb32.LL;
            } else {
                obj3 = null;
            }
            map2.put("relation_type", C2286608xc.LJ(((VideoItemParams) obj3).getAweme().getProductRecallType()));
            EcSearchNoCartFeedVideoGuideAssem ecSearchNoCartFeedVideoGuideAssem3 = this.LLILLJJLI;
            Aweme aweme = ((VideoItemParams) C631370Opb.LIZ(ecSearchNoCartFeedVideoGuideAssem3)).getAweme();
            this.LL = 1;
            if (Intrinsics.LJFF(AwemeExtKt.getAuthorUid(aweme), C461720I8s.LIZIZ())) {
                objLJIJ = null;
            } else {
                C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
                c2252611DEt.LJIJJ();
                ecSearchNoCartFeedVideoGuideAssem3.LLLIILIL = c2252611DEt;
                objLJIJ = c2252611DEt.LJIJ();
                if (objLJIJ == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
            }
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("EcSearchNoCartFeedVideoGuideAssem@a3d6.initSubscriber$2$1");
                return objLJFF;
            }
        }
        C1770380wAe c1770380wAe = (C1770380wAe) objLJIJ;
        if (c1770380wAe != null) {
            EcSearchNoCartFeedVideoGuideAssem ecSearchNoCartFeedVideoGuideAssem4 = this.LLILLJJLI;
            ecSearchNoCartFeedVideoGuideAssem4.LLLLIIL.put("interest_type", C2286608xc.LJ(c1770380wAe.LIZIZ));
            ecSearchNoCartFeedVideoGuideAssem4.LLLLIIL.put("play_duration", C2286608xc.LJ(ecSearchNoCartFeedVideoGuideAssem4.Ip()));
            C1740600vOc c1740600vOcLJIJI = ((IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class)).LJIJI(C724240Sb0.LJI(ecSearchNoCartFeedVideoGuideAssem4));
            if (c1740600vOcLJIJI != null && (c21244318Bt = c1740600vOcLJIJI.LIZ) != null && (str = c21244318Bt.LIZ) != null) {
                bcmChainStandardStringByFinder = BtmSDK.INSTANCE.getBcmChainStandardStringByFinder(str, PageFinder.via(C724240Sb0.LJI(ecSearchNoCartFeedVideoGuideAssem4)), null);
            } else {
                bcmChainStandardStringByFinder = null;
            }
            C1770180wAK c1770180wAK = C1770180wAK.LIZ;
            C724270Sb3 c724270Sb33 = ecSearchNoCartFeedVideoGuideAssem4.LLJI;
            if (c724270Sb33 != null) {
                obj4 = c724270Sb33.LL;
            } else {
                obj4 = null;
            }
            Aweme aweme2 = ((VideoItemParams) obj4).getAweme();
            FeedBarSearchAbility feedBarSearchAbility = (FeedBarSearchAbility) C1558520qew.LIZ(C1558520qew.LJIIL(ecSearchNoCartFeedVideoGuideAssem4), FeedBarSearchAbility.class, null);
            EcSearchFeedBarAbility ecSearchFeedBarAbility = (EcSearchFeedBarAbility) C1558520qew.LIZ(C1558520qew.LJIIL(ecSearchNoCartFeedVideoGuideAssem4), EcSearchFeedBarAbility.class, null);
            c1770180wAK.getClass();
            List listLJI = C1770180wAK.LJI(aweme2, feedBarSearchAbility, ecSearchFeedBarAbility);
            EcSearchNoCartFeedVideoGuideVM ecSearchNoCartFeedVideoGuideVMJp = ecSearchNoCartFeedVideoGuideAssem4.Jp();
            C724270Sb3 c724270Sb34 = ecSearchNoCartFeedVideoGuideAssem4.LLJI;
            if (c724270Sb34 != null) {
                obj5 = c724270Sb34.LL;
            }
            ecSearchNoCartFeedVideoGuideVMJp.vQ2(((VideoItemParams) obj5).getAweme(), bcmChainStandardStringByFinder, c1770380wAe, listLJI, ecSearchNoCartFeedVideoGuideAssem4.LLLLIIL, 0, 0, 0.0f, null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcSearchNoCartFeedVideoGuideAssem@a3d6.initSubscriber$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
