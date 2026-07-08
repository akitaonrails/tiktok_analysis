package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.aigc.AigcLabelH5Url;
import com.ss.android.ugc.aweme.aigc.aiinfopanel.AIInfoPanelFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SyI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C738680SyI extends ClickableSpan {
    public final int $t;
    public Object l0;

    public static final void updateDrawState$1(C738680SyI c738680SyI, TextPaint textPaint) {
    }

    public static final void updateDrawState$2(C738680SyI c738680SyI, TextPaint textPaint) {
    }

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
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public C738680SyI(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(C738680SyI c738680SyI, View view) {
        C720800SPe c720800SPe;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        AigcLabelH5Url aigcLabelH5Url = C0SRR.LIZ;
        AigcLabelH5Url aigcLabelH5Url2 = (AigcLabelH5Url) settingsManagerLIZLLL.LJIIIIZZ("aigc_label_h5_url_config", AigcLabelH5Url.class, aigcLabelH5Url);
        if (aigcLabelH5Url2 != null) {
            aigcLabelH5Url = aigcLabelH5Url2;
        }
        String str = aigcLabelH5Url.introducePageUrl;
        if (str == null) {
            str = "";
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((AIInfoPanelFragment) c738680SyI.l0).getContext(), "aweme://webview");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("?hide_nav_bar=1&enter_from=learn_more");
        smartRouteBuildRoute.withParam("url", C2188811AlT.LIZIZ(sbLIZ));
        smartRouteBuildRoute.withParam("use_spark", true);
        smartRouteBuildRoute.open();
        C720820SPg c720820SPg = C720820SPg.LIZ;
        C0SRP c0srp = ((AIInfoPanelFragment) c738680SyI.l0).LLJJ;
        if (c0srp != null) {
            c720800SPe = c0srp.LJ;
        } else {
            c720800SPe = null;
        }
        c720820SPg.getClass();
        C720820SPg.LIZIZ(c720800SPe, 0);
    }

    public static final void onClick$1(C738680SyI c738680SyI, View view) {
        Function0<Unit> function0 = ((C698160Ra2) c738680SyI.l0).LJI;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onClick$2(C738680SyI c738680SyI, View view) {
        Function0<Unit> function0 = ((C698160Ra2) c738680SyI.l0).LJI;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void updateDrawState$0(C738680SyI c738680SyI, TextPaint textPaint) {
        Context context;
        Integer numLIZJ;
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        if (((AIInfoPanelFragment) c738680SyI.l0).getContext() != null && (context = ((AIInfoPanelFragment) c738680SyI.l0).getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context)) != null) {
            textPaint.setColor(numLIZJ.intValue());
        }
    }
}
