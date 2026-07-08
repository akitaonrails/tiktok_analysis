package X;

import Y.ACListenerS112S0200000_8;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.ab.CCDiversionEntConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0L0H, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L0H extends LinearLayout {
    public EnumC380250EvX LL;
    public Function0<? extends ArrayList<Uri>> LLILLJJLI;

    public final void LIZLLL() {
        String str;
        try {
            CCDiversionEntConfig.LIZ.getClass();
            CCDiversionEntConfig.CapCutButtonBean capCutButtonBean = CCDiversionEntConfig.LIZ().capcutButton;
            if (capCutButtonBean != null && (str = capCutButtonBean.title) != null && str.length() > 0) {
                Resources resources = getResources();
                CCDiversionEntConfig.CapCutButtonBean capCutButtonBean2 = CCDiversionEntConfig.LIZ().capcutButton;
                int iN3 = C786410Ut5.n3(resources, capCutButtonBean2 != null ? capCutButtonBean2.title : null, "string", getContext().getPackageName());
                TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.cvr);
                if (tuxTextView != null) {
                    tuxTextView.setText(tuxTextView.getContext().getString(iN3));
                    C21382118m3.LIZIZ(tuxTextView, 10, 16, 1, 1);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
        LIZJ("show");
    }

    public final void LIZ() {
        String str;
        String str2;
        CCDiversionEntConfig.LIZ.getClass();
        CCDiversionEntConfig.CapCutButtonBean capCutButtonBean = CCDiversionEntConfig.LIZ().capcutButton;
        if (capCutButtonBean == null || (str = capCutButtonBean.onelink) == null || a0.LJJJIL(str)) {
            return;
        }
        Context context = getContext();
        Intent intent = new Intent();
        CCDiversionEntConfig.CapCutButtonBean capCutButtonBean2 = CCDiversionEntConfig.LIZ().capcutButton;
        intent.setData((capCutButtonBean2 == null || (str2 = capCutButtonBean2.onelink) == null) ? null : UriProtector.parse(str2));
        intent.setAction("android.intent.action.VIEW");
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhkdTRjIENBfvs0uapPXwL7TDZBBoShiQcr7lWXzFGC9HKl4Vu", null));
    }

    public final void LIZIZ() {
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
    }

    public final void LIZJ(String str) {
        String lowerCase;
        String strName;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("action", str);
        EnumC380250EvX enumC380250EvX = this.LL;
        if (enumC380250EvX != null && (strName = enumC380250EvX.name()) != null) {
            lowerCase = strName.toLowerCase(Locale.ROOT);
        } else {
            lowerCase = null;
        }
        pairArr[1] = new Pair("page_name", lowerCase);
        C20684815ws.LJIILLIIL("tt_album_capcut_edit_button", C2097608Jq.LJIIIIZZ(pairArr));
    }

    public final void setBtnBackground(Drawable drawable) {
        View viewFindViewById = findViewById(R.id.bdo);
        if (viewFindViewById != null) {
            viewFindViewById.setBackground(drawable);
        }
    }

    public final void setTextColor(int i) {
        TextView textView = (TextView) findViewById(R.id.cvr);
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public C0L0H(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.I7(new ACListenerS112S0200000_8(this, context, 18), C786410Ut5.Sd(R.layout.ou, C786410Ut5.ne(context), this));
    }
}
