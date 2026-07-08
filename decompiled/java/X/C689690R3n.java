package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.locale.LocalServiceImpl;
import com.ss.android.ugc.aweme.search.pages.result.common.statusview.ui.SearchStatusViewAssem;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.core.assem.SearchPageStatusAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0R3n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C689690R3n extends ClickableSpan {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            default:
                super.onClick(view);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.$t) {
            case 0:
                updateDrawState$0(this, textPaint);
                break;
            case 1:
                updateDrawState$1(this, textPaint);
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public static final void onClick$0(C689690R3n c689690R3n, View view) {
        String useScenario;
        Unit unit;
        String imprId;
        C2344009Gk c2344009Gk = new C2344009Gk();
        GlobalDoodleConfig globalDoodleConfig = ((C0Q9U) c689690R3n.l0).LIZIZ.globalDoodleConfig;
        String str = "";
        if (globalDoodleConfig == null || (useScenario = globalDoodleConfig.getUseScenario()) == null) {
            useScenario = "";
        }
        c2344009Gk.LJIIIIZZ("use_scenario", useScenario);
        LogPbBean logPbBean = ((C0Q9U) c689690R3n.l0).LIZIZ.logPb;
        if (logPbBean != null && (imprId = logPbBean.getImprId()) != null) {
            str = imprId;
        }
        c2344009Gk.LJIIIIZZ("search_id", str);
        c2344009Gk.LJIIIIZZ("search_type", C644560PPy.LJIILIIL(c689690R3n.i2));
        C20684815ws.LJIILLIIL("tns_click_community_link", c2344009Gk.LIZ);
        try {
            C19EG c19egLIZ = C724240Sb0.LIZ((SearchPageStatusAssem) c689690R3n.l1);
            if (c19egLIZ != null) {
                C0XI4 c0xi4 = new C0XI4("https://www.tiktok.com/community-guidelines");
                c0xi4.LJ("lang", LocalServiceImpl.LIZIZ().LIZ(c19egLIZ));
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19egLIZ, "//webview");
                smartRouteBuildRoute.withParam("url", c0xi4.LJFF());
                smartRouteBuildRoute.withParam("title", c19egLIZ.getString(2131829397));
                smartRouteBuildRoute.open();
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static final void onClick$1(C689690R3n c689690R3n, View view) {
        String useScenario;
        C0LAB c0lab = new C0LAB();
        GlobalDoodleConfig globalDoodleConfig = ((SearchApiResult) c689690R3n.l0).globalDoodleConfig;
        Unit unit = null;
        if (globalDoodleConfig != null) {
            useScenario = globalDoodleConfig.getUseScenario();
        } else {
            useScenario = null;
        }
        c0lab.LJ("use_scenario", useScenario);
        c0lab.LJ("search_id", ((SearchApiResult) c689690R3n.l0).logPb.getImprId());
        c0lab.LJ("search_type", C644560PPy.LJIILIIL(c689690R3n.i2));
        C20684815ws.LJIILLIIL("tns_click_community_link", c0lab.LIZ);
        try {
            C19EG c19egLIZ = C724240Sb0.LIZ((SearchStatusViewAssem) c689690R3n.l1);
            if (c19egLIZ != null) {
                C0XI4 c0xi4 = new C0XI4("https://www.tiktok.com/community-guidelines");
                c0xi4.LJ("lang", LocalServiceImpl.LIZIZ().LIZ(c19egLIZ));
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19egLIZ, "//webview");
                smartRouteBuildRoute.withParam("url", c0xi4.LJFF());
                smartRouteBuildRoute.withParam("title", c19egLIZ.getString(2131829397));
                smartRouteBuildRoute.open();
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static final void updateDrawState$0(C689690R3n c689690R3n, TextPaint textPaint) {
        int iIntValue;
        Integer numLIZJ;
        Context context = ((SearchPageStatusAssem) c689690R3n.l1).getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a04, context)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        textPaint.setColor(iIntValue);
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$1(C689690R3n c689690R3n, TextPaint textPaint) {
        int iIntValue;
        Integer numLIZJ;
        Context context = ((SearchStatusViewAssem) c689690R3n.l1).getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a04, context)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        textPaint.setColor(iIntValue);
        textPaint.setUnderlineText(false);
    }

    public C689690R3n(Object obj, int i, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i2 = i;
        this.l1 = obj2;
    }
}
