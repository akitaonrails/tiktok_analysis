package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.aigc.AigcLabelH5Url;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SyG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C738660SyG extends ClickableSpan {
    public final int $t;
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
            default:
                super.updateDrawState(textPaint);
                break;
            case 2:
                updateDrawState$1(this, textPaint);
                break;
            case 3:
                updateDrawState$2(this, textPaint);
                break;
        }
    }

    public static final void onClick$0(C738660SyG c738660SyG, View view) {
        ((Function0) c738660SyG.l1).invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$1(X.C738660SyG r7, android.view.View r8) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C738660SyG.onClick$1(X.0SyG, android.view.View):void");
    }

    public static final void onClick$2(C738660SyG c738660SyG, View view) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((C19EG) c738660SyG.l0, ((C722090SUd) c738660SyG.l1).LLILLJJLI.LIZLLL);
        smartRouteBuildRoute.withParam("use_spark", true);
        smartRouteBuildRoute.open();
    }

    public static final void onClick$3(C738660SyG c738660SyG, View view) {
        C0SUF c0suf = (C0SUF) c738660SyG.l0;
        Context context = (Context) c738660SyG.l1;
        c0suf.getClass();
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
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://webview");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("?hide_nav_bar=1&enter_from=learn_more");
        smartRouteBuildRoute.withParam("url", C2188811AlT.LIZIZ(sbLIZ));
        smartRouteBuildRoute.withParam("use_spark", true);
        smartRouteBuildRoute.open();
        C720820SPg.LIZ.getClass();
        C720820SPg.LIZIZ(null, 0);
    }

    public static final void updateDrawState$0(C738660SyG c738660SyG, TextPaint textPaint) {
        int color;
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        Integer num = ((C718810SHn) c738660SyG.l0).LIZLLL;
        if (num != null) {
            color = num.intValue();
        } else {
            color = textPaint.getColor();
        }
        textPaint.setColor(color);
    }

    public static final void updateDrawState$1(C738660SyG c738660SyG, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, (C19EG) c738660SyG.l0);
        if (numLIZJ != null) {
            textPaint.setColor(numLIZJ.intValue());
        }
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$2(C738660SyG c738660SyG, TextPaint textPaint) {
        int iIntValue;
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1n, (Context) c738660SyG.l1);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -16776961;
        }
        textPaint.setColor(iIntValue);
    }

    public C738660SyG(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
