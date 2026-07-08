package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BannerCountdown;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CountdownUiTypeConfig;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03ni, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C951203ni extends FrameLayout implements InterfaceC10331042f {
    public C10332042g LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public final C10332042g LLILZ;
    public final TuxTextView LLILZIL;
    public final TuxTextView LLILZLL;
    public BannerCountdown LLIZ;
    public CountdownUiTypeConfig LLIZLLLIL;
    public String LLJ;

    public C951203ni(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final C10332042g getCountdownPrefixTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f0s);
            this.LL = (C10332042g) callbackFindViewById;
        }
        return (C10332042g) callbackFindViewById;
    }

    public final TuxTextView getCountdownPrefixTextV2FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f0t);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getCountdownTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f10);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0108  */
    @Override // X.InterfaceC10331042f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V2(long r11) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C951203ni.V2(long):void");
    }

    public final void setCountdownPrefixTextFromXml(C10332042g c10332042g) {
        this.LL = c10332042g;
    }

    public final void setCountdownPrefixTextV2FromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setCountdownTextFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void LIZ(BannerCountdown bannerCountdown, String str) {
        String color;
        this.LLIZ = bannerCountdown;
        this.LLJ = str;
        TuxTextView tuxTextView = this.LLILZLL;
        CommonColor commonColor = bannerCountdown.countdownColor;
        if (commonColor != null) {
            if (C1744700vVE.LJ(getContext(), null)) {
                color = commonColor.getDarkColor();
            } else {
                color = commonColor.getColor();
            }
            if (color != null) {
                try {
                    if (color.length() != 0 && color.charAt(0) != '#') {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append('#');
                        sbLIZ.append(color);
                        color = C2188811AlT.LIZIZ(sbLIZ);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            Integer numValueOf = Integer.valueOf(Color.parseColor(color));
            if (numValueOf != null) {
                tuxTextView.setTextColor(numValueOf.intValue());
            }
        }
        this.LLILZLL.setTypeface(Typeface.defaultFromStyle(bannerCountdown.countdownIsBold ? 1 : 0));
    }

    public C951203ni(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LLJ = "";
        C954703oH.LIZ(context, R.layout.au7, this, true);
        this.LLILZ = getCountdownPrefixTextFromXml();
        this.LLILZIL = getCountdownPrefixTextV2FromXml();
        this.LLILZLL = getCountdownTextFromXml();
    }
}
