package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.aigc.AigcLabelH5Url;
import com.ss.android.ugc.aweme.aigc.aiinfopanel.AIInfoPanelFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0SyH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C738670SyH extends ClickableSpan {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
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
            case 2:
                updateDrawState$2(this, textPaint);
                break;
            case 3:
                updateDrawState$3(this, textPaint);
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public static final void onClick$0(C738670SyH c738670SyH, View view) {
        Activity activityLIZ = C1388190mED.LIZ((Context) c738670SyH.l1);
        if (activityLIZ != null) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activityLIZ, "aweme://webview");
            smartRouteBuildRoute.withParam(UriProtector.parse(c738670SyH.s0));
            smartRouteBuildRoute.open();
        }
    }

    public static final void onClick$1(C738670SyH c738670SyH, View view) {
        C720800SPe c720800SPe;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        AigcLabelH5Url aigcLabelH5Url = C0SRR.LIZ;
        AigcLabelH5Url aigcLabelH5Url2 = (AigcLabelH5Url) settingsManagerLIZLLL.LJIIIIZZ("aigc_label_h5_url_config", AigcLabelH5Url.class, aigcLabelH5Url);
        if (aigcLabelH5Url2 != null) {
            aigcLabelH5Url = aigcLabelH5Url2;
        }
        String str = aigcLabelH5Url.appealPageUrl;
        if (str == null) {
            str = "";
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((AIInfoPanelFragment) c738670SyH.l1).getContext(), "aweme://webview");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("?object_id=");
        sbLIZ.append(c738670SyH.s0);
        sbLIZ.append("&object_type=1050&enter_from=learn_more&hide_nav_bar=1&from_source=1&container_color_auto_dark=1&use_spark=1&should_full_screen=1");
        smartRouteBuildRoute.withParam("url", C2188811AlT.LIZIZ(sbLIZ));
        smartRouteBuildRoute.open();
        C720820SPg c720820SPg = C720820SPg.LIZ;
        C0SRP c0srp = ((AIInfoPanelFragment) c738670SyH.l1).LLJJ;
        if (c0srp != null) {
            c720800SPe = c0srp.LJ;
        } else {
            c720800SPe = null;
        }
        c720820SPg.getClass();
        C720820SPg.LIZIZ(c720800SPe, 1);
    }

    public static final void onClick$2(C738670SyH c738670SyH, View view) {
        Activity activityLIZ;
        Context context = (Context) c738670SyH.l1;
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            String str = c738670SyH.s0;
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activityLIZ, "aweme://webview");
            smartRouteBuildRoute.withParam(UriProtector.parse(str));
            smartRouteBuildRoute.open();
        }
    }

    public static final void onClick$3(C738670SyH c738670SyH, View view) {
        Activity activityLIZ;
        Context context = ((C1897280zTK) c738670SyH.l1).LJJI;
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            String str = c738670SyH.s0;
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activityLIZ, "aweme://webview");
            smartRouteBuildRoute.withParam(UriProtector.parse(str));
            smartRouteBuildRoute.open();
        }
    }

    public static final void updateDrawState$0(C738670SyH c738670SyH, TextPaint textPaint) {
        textPaint.setColor(C0SVC.LIZ(R.attr.jt, (Context) c738670SyH.l1));
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$1(C738670SyH c738670SyH, TextPaint textPaint) {
        Context context;
        Integer numLIZJ;
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        if (((AIInfoPanelFragment) c738670SyH.l1).getContext() != null && (context = ((AIInfoPanelFragment) c738670SyH.l1).getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context)) != null) {
            textPaint.setColor(numLIZJ.intValue());
        }
    }

    public static final void updateDrawState$2(C738670SyH c738670SyH, TextPaint textPaint) {
        int i;
        Context context = (Context) c738670SyH.l1;
        if (context != null) {
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
            if (abstractC1896090zRP != null && abstractC1896090zRP.LJJIIZI(context)) {
                i = R.attr.j8;
            } else {
                i = R.attr.jt;
            }
            textPaint.setColor(C0SVC.LIZ(i, context));
            textPaint.setUnderlineText(false);
        }
    }

    public static final void updateDrawState$3(C738670SyH c738670SyH, TextPaint textPaint) {
        int i;
        Context context = ((C1897280zTK) c738670SyH.l1).LJJI;
        if (context != null) {
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
            if (abstractC1896090zRP != null && abstractC1896090zRP.LJJIIZI(context)) {
                i = R.attr.j8;
            } else {
                i = R.attr.jt;
            }
            textPaint.setColor(C0SVC.LIZ(i, context));
            textPaint.setUnderlineText(false);
        }
    }

    public C738670SyH(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
