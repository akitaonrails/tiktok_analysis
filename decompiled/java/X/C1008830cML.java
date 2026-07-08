package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commerce.model.UnderWaterInfo;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.component.underwaterbottombanner.AnoleJumpData;
import com.ss.android.ugc.aweme.component.underwaterbottombanner.AnoleUnderWaterModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cML, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1008830cML extends AbstractC1014240cV4 {
    public String LLJLIL;
    public final AnoleUnderWaterModel LLJLILLLLZIIL;
    public TuxTextView LLJLL;

    public final String LJJ() {
        Aweme aweme;
        Object obj = this.LLILLJJLI.LIZJ;
        if (!(obj instanceof Aweme) || (aweme = (Aweme) obj) == null) {
            return null;
        }
        return aweme.getAid();
    }

    public final String LJJI() {
        Aweme aweme;
        AwemeCommerceStruct commerceVideoAuthInfo;
        UnderWaterInfo underWaterInfo;
        Object obj = this.LLILLJJLI.LIZJ;
        if (!(obj instanceof Aweme) || (aweme = (Aweme) obj) == null || (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null || (underWaterInfo = commerceVideoAuthInfo.getUnderWaterInfo()) == null) {
            return null;
        }
        return underWaterInfo.getUnderWater();
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        return new C1014500cVU(true, "");
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LJ() {
        super.LJ();
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LIZ() {
        super.LIZ();
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LIZJ() {
        super.LIZJ();
    }

    @Override // X.AbstractC1014240cV4
    public final void LJII(AnoleComponentAppearModel anoleComponentAppearModel) {
        super.LJII(anoleComponentAppearModel);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("under_water_status", LJJI());
            jSONObject.put("item_id", LJJ());
            C20684815ws.LJIJ("under_water_bottom_banner_show", jSONObject);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        LJJII(true);
    }

    @Override // X.AbstractC1014240cV4
    public final void LJIIIIZZ(String str) {
        super.LJIIIIZZ(str);
        LJJII(false);
    }

    public final void LJJIFFI(String str) {
        Map<String, String> map;
        boolean z;
        AnoleJumpData anoleJumpData;
        final String schema;
        TuxTextView tuxTextView = this.LLJLL;
        if (tuxTextView == null) {
            return;
        }
        AnoleUnderWaterModel anoleUnderWaterModel = this.LLJLILLLLZIIL;
        if (anoleUnderWaterModel != null) {
            map = anoleUnderWaterModel.underWaterStatus;
        } else {
            map = null;
        }
        if (map != null && !map.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
            return;
        }
        if (str == null) {
            str = LJJI();
        }
        this.LLJLIL = str;
        if (str != null && str.length() != 0) {
            String str2 = map.get(str);
            if (str2 != null && str2.length() != 0) {
                View view = this.LLJJIJIL;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(0, view);
                }
                tuxTextView.setText(str2);
                C786410Ut5.LLLLZLL(tuxTextView, 0);
                AnoleUnderWaterModel anoleUnderWaterModel2 = this.LLJLILLLLZIIL;
                if (anoleUnderWaterModel2 != null && (anoleJumpData = anoleUnderWaterModel2.jumpData) != null && (schema = anoleJumpData.getSchema()) != null && schema.length() != 0) {
                    TuxTextView tuxTextView2 = this.LLJLL;
                    if (tuxTextView2 != null) {
                        C786410Ut5.h9(tuxTextView2, new View.OnClickListener() { // from class: X.0cMM
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                Aweme aweme;
                                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LL.LLILZ, schema);
                                if (smartRouteBuildRoute != null) {
                                    smartRouteBuildRoute.open();
                                }
                                C1008830cML c1008830cML = this.LL;
                                c1008830cML.getClass();
                                JSONObject jSONObject = new JSONObject();
                                Object obj = c1008830cML.LLILLJJLI.LIZJ;
                                AwemeCommerceStruct commerceVideoAuthInfo = null;
                                if ((obj instanceof Aweme) && (aweme = (Aweme) obj) != null) {
                                    commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
                                }
                                C1008850cMN c1008850cMN = C1008850cMN.LIZ;
                                AnoleComponentModel anoleComponentModel = c1008830cML.LL;
                                c1008850cMN.getClass();
                                try {
                                    C1008850cMN.LIZ(commerceVideoAuthInfo, anoleComponentModel, jSONObject);
                                    C20684815ws.LJIJ("user_traffic_other_click", jSONObject);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                                C1008830cML c1008830cML2 = this.LL;
                                c1008830cML2.getClass();
                                try {
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("under_water_status", c1008830cML2.LJJI());
                                    jSONObject2.put("item_id", c1008830cML2.LJJ());
                                    C20684815ws.LJIJ("under_water_bottom_banner_click", jSONObject2);
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                }
                            }
                        });
                    }
                    if (!EventBus.LIZLLL().LJIIJ(this)) {
                        EventBus.LIZLLL().LJIJJ(this);
                        return;
                    }
                    return;
                }
                TuxTextView tuxTextView3 = this.LLJLL;
                if (tuxTextView3 != null) {
                    C786410Ut5.h9(tuxTextView3, null);
                    return;
                }
                return;
            }
            View view2 = this.LLJJIJIL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
                return;
            }
            return;
        }
        View view3 = this.LLJJIJIL;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(8, view3);
        }
    }

    public final void LJJII(boolean z) {
        Aweme aweme;
        JSONObject jSONObject = new JSONObject();
        Object obj = this.LLILLJJLI.LIZJ;
        AwemeCommerceStruct commerceVideoAuthInfo = null;
        if ((obj instanceof Aweme) && (aweme = (Aweme) obj) != null) {
            commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
        }
        if (z) {
            C1008850cMN c1008850cMN = C1008850cMN.LIZ;
            AnoleComponentModel anoleComponentModel = this.LL;
            c1008850cMN.getClass();
            try {
                C1008850cMN.LIZ(commerceVideoAuthInfo, anoleComponentModel, jSONObject);
                C20684815ws.LJIJ("user_traffic_other_show", jSONObject);
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return;
            }
        }
        C1008850cMN c1008850cMN2 = C1008850cMN.LIZ;
        AnoleComponentModel anoleComponentModel2 = this.LL;
        c1008850cMN2.getClass();
        try {
            C1008850cMN.LIZ(commerceVideoAuthInfo, anoleComponentModel2, jSONObject);
            C20684815ws.LJIJ("user_traffic_other_show_fail", jSONObject);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @C14EU
    public final void onEvent(C584900Mwq c584900Mwq) {
        Aweme aweme;
        AwemeCommerceStruct commerceVideoAuthInfo;
        UnderWaterInfo underWaterInfo;
        if (!Intrinsics.LJFF(c584900Mwq.LIZ, LJJ())) {
            return;
        }
        String str = c584900Mwq.LIZIZ;
        if (Intrinsics.LJFF(str, this.LLJLIL)) {
            return;
        }
        Object obj = this.LLILLJJLI.LIZJ;
        if ((obj instanceof Aweme) && (aweme = (Aweme) obj) != null && (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null && (underWaterInfo = commerceVideoAuthInfo.getUnderWaterInfo()) != null) {
            underWaterInfo.setUnderWater(str);
        }
        LJJIFFI(str);
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Fk(ViewGroup viewGroup, InterfaceC1014340cVE interfaceC1014340cVE) {
        TuxTextView tuxTextView;
        super.Fk(viewGroup, interfaceC1014340cVE);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LLILZ), R.layout.qu, viewGroup, false);
        if (viewTd != null) {
            tuxTextView = (TuxTextView) viewTd.findViewById(R.id.under_water_tips);
        } else {
            tuxTextView = null;
        }
        this.LLJLL = tuxTextView;
        this.LLJJIJIL = viewTd;
        LJJIFFI(null);
    }

    public C1008830cML(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context) {
        Object c098200Yq;
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            Map<String, ? extends Object> map = anoleComponentModel.data;
            c1227904rF.getClass();
            c098200Yq = (AnoleUnderWaterModel) C1227904rF.LIZIZ(C1227904rF.LJI(map), AnoleUnderWaterModel.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            this.LLJLILLLLZIIL = (AnoleUnderWaterModel) c098200Yq;
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            this.LLJLILLLLZIIL = null;
        }
    }
}
