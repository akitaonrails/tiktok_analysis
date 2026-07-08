package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.ies.sdk.widgets.LayerSpecImpl;
import com.bytedance.ies.sdk.widgets.MultiElementSpecImplKt;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0eGy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1082380eGy extends LayerSpecImpl {
    public static boolean LIZ() {
        ILiveMatchService iLiveMatchService = (ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class);
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        if (iLiveMatchService.xB0() != EnumC919170a1j.MATCH_TYPE_1V1) {
            return (iLiveMatchService.co0() && iInteractService.b70().size() == 2) ? false : true;
        }
        return false;
    }

    public C1082380eGy(AbstractC1080560eE2 abstractC1080560eE2) {
        super(abstractC1080560eE2);
        C1082620eHM c1082620eHM = new C1082620eHM(abstractC1080560eE2);
        C1082400eH0 c1082400eH0 = new C1082400eH0(abstractC1080560eE2, abstractC1080560eE2.getContext(), new C1082610eHL(c1082620eHM), new C1082570eHH(c1082620eHM), new C1082590eHJ(c1082620eHM), new C1082600eHK(c1082620eHM));
        c1082620eHM.LLJ = new C1082560eHG(c1082400eH0);
        MultiElementSpecImplKt.element(this, c1082620eHM);
        MultiElementSpecImplKt.element(this, c1082400eH0);
        C1082650eHP c1082650eHP = new C1082650eHP(abstractC1080560eE2);
        MultiElementSpecImplKt.element(this, c1082650eHP);
        MultiElementSpecImplKt.element(this, R.id.kwb);
        MultiElementSpecImplKt.element(this, new C1081400eFO(abstractC1080560eE2, new C1082580eHI(c1082650eHP)));
        MultiElementSpecImplKt.element(this, R.id.cci);
        MultiElementSpecImplKt.element(this, R.id.cch);
        registerElement(new C1082310eGr(abstractC1080560eE2, this));
    }
}
