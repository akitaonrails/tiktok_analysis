package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.component.searchcomponent.appadscard.SearchAdAppAdsCardModel;
import java.util.Map;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0cGl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1005370cGl extends AbstractC1014240cV4 {
    public SearchAdAppAdsCardModel LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILIIL() {
        return false;
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        return new C1014500cVU(true, null);
    }

    @Override // X.AbstractC1014240cV4
    public final void LJII(AnoleComponentAppearModel anoleComponentAppearModel) {
        super.LJII(anoleComponentAppearModel);
        String tag = this.LL.getTag();
        if (tag == null) {
            tag = "result_ad";
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL(tag, "othershow", this.LLILLJJLI.LIZLLL);
        String refer = this.LL.getRefer();
        if (refer == null) {
            refer = "app_card";
        }
        c1022820ciuLIZLLL.LIZJ(refer, "refer");
        c1022820ciuLIZLLL.LIZIZ(this.LL.type, "component_type");
        c1022820ciuLIZLLL.LJII();
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0215 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Fk(android.view.ViewGroup r10, X.InterfaceC1014340cVE r11) {
        /*
            Method dump skipped, instruction units count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1005370cGl.Fk(android.view.ViewGroup, X.0cVE):void");
    }

    public C1005370cGl(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context, InterfaceC1003440cDe interfaceC1003440cDe) {
        Object c098200Yq;
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(533));
        this.LLJLILLLLZIIL = c01gwLIZIZ;
        this.LLJLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 990));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 982));
        this.LLJLLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 984));
        this.LLJZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 981));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 987));
        this.LLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 986));
        this.LLLF = C452501pT.LIZIZ(new AwS560S0100000_16(this, 989));
        this.LLLFF = C452501pT.LIZIZ(new AwS560S0100000_16(this, 988));
        this.LLLFFI = C452501pT.LIZIZ(new AwS560S0100000_16(this, 983));
        this.LLLFZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 985));
        try {
            C1227904rF c1227904rF = (C1227904rF) c01gwLIZIZ.getValue();
            C1227904rF c1227904rF2 = (C1227904rF) c01gwLIZIZ.getValue();
            Map<String, ? extends Object> map = anoleComponentModel.data;
            c1227904rF2.getClass();
            String strLJI = C1227904rF.LJI(map);
            c1227904rF.getClass();
            c098200Yq = (SearchAdAppAdsCardModel) C1227904rF.LIZIZ(strLJI, SearchAdAppAdsCardModel.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        this.LLJLIL = (SearchAdAppAdsCardModel) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }
}
