package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.ui.EcSearchNoCartFypBottomButtonAssem;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.vm.EcSearchNoCartFeedVideoGuideVM;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feedbar.EcSearchFeedBarAbility;
import com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wAR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.videoguide.ui.EcSearchNoCartFypBottomButtonAssem$startWaitInterest$1", f = "EcSearchNoCartFypBottomButtonAssem.kt", l = {1094}, m = "invokeSuspend")
public final class C1770250wAR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EcSearchNoCartFypBottomButtonAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1770250wAR(EcSearchNoCartFypBottomButtonAssem ecSearchNoCartFypBottomButtonAssem, InterfaceC1364105Vn<? super C1770250wAR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = ecSearchNoCartFypBottomButtonAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1770250wAR(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String bcmChainStandardStringByFinder;
        C21244318Bt c21244318Bt;
        String str;
        Object objLJIJ = obj;
        C1C7U.LIZ("EcSearchNoCartFypBottomButtonAssem@4979.startWaitInterest$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJIJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJIJ);
            EcSearchNoCartFypBottomButtonAssem ecSearchNoCartFypBottomButtonAssem = this.LLILLJJLI;
            this.LL = 1;
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            ecSearchNoCartFypBottomButtonAssem.LLLII = c2252611DEt;
            objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("EcSearchNoCartFypBottomButtonAssem@4979.startWaitInterest$1");
                return objLJFF;
            }
        }
        EcSearchNoCartFypBottomButtonAssem ecSearchNoCartFypBottomButtonAssem2 = this.LLILLJJLI;
        C1770380wAe c1770380wAe = (C1770380wAe) objLJIJ;
        C1770180wAK c1770180wAK = C1770180wAK.LIZ;
        Fragment fragmentLJI = C724240Sb0.LJI(ecSearchNoCartFypBottomButtonAssem2);
        c1770180wAK.getClass();
        C1740600vOc c1740600vOcLJFF = C1770180wAK.LJFF(fragmentLJI);
        Object obj2 = null;
        if (c1740600vOcLJFF != null && (c21244318Bt = c1740600vOcLJFF.LIZ) != null && (str = c21244318Bt.LIZ) != null) {
            bcmChainStandardStringByFinder = BtmSDK.INSTANCE.getBcmChainStandardStringByFinder(str, PageFinder.via(C724240Sb0.LJI(ecSearchNoCartFypBottomButtonAssem2)), null);
        } else {
            bcmChainStandardStringByFinder = null;
        }
        List listLJI = C1770180wAK.LJI(((VideoItemParams) C631370Opb.LIZ(ecSearchNoCartFypBottomButtonAssem2)).getAweme(), (FeedBarSearchAbility) C1558520qew.LIZ(C1558520qew.LJIIL(ecSearchNoCartFypBottomButtonAssem2), FeedBarSearchAbility.class, null), (EcSearchFeedBarAbility) C1558520qew.LIZ(C1558520qew.LJIIL(ecSearchNoCartFypBottomButtonAssem2), EcSearchFeedBarAbility.class, null));
        EcSearchNoCartFeedVideoGuideVM ecSearchNoCartFeedVideoGuideVMIp = ecSearchNoCartFypBottomButtonAssem2.Ip();
        C724270Sb3 c724270Sb3 = ecSearchNoCartFypBottomButtonAssem2.LLJI;
        if (c724270Sb3 != null) {
            obj2 = c724270Sb3.LL;
        }
        ecSearchNoCartFeedVideoGuideVMIp.vQ2(((VideoItemParams) obj2).getAweme(), bcmChainStandardStringByFinder, c1770380wAe, listLJI, ecSearchNoCartFypBottomButtonAssem2.LLLJIL, 1, ecSearchNoCartFypBottomButtonAssem2.Ep(), ecSearchNoCartFypBottomButtonAssem2.Fp(), ecSearchNoCartFypBottomButtonAssem2.Bp());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcSearchNoCartFypBottomButtonAssem@4979.startWaitInterest$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
