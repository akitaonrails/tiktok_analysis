package X;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import irm.AkS78S0100000_6;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0H5Z, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H5Z extends LinearLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;

    public C0H5Z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final C197039127h getCtaButton() {
        return (C197039127h) this.LLILZ.getValue();
    }

    private final TuxTextView getDescTv() {
        return (TuxTextView) this.LLILLL.getValue();
    }

    private final SmartImageView getIconView() {
        return (SmartImageView) this.LL.getValue();
    }

    private final ITakoContextAbility getTakoContextAbility() {
        return (ITakoContextAbility) this.LLILZIL.getValue();
    }

    private final TuxTextView getTitleTv() {
        return (TuxTextView) this.LLILLJJLI.getValue();
    }

    public final void LIZ(C435280H5a c435280H5a) {
        Map<String, String> mapLJ;
        SmartImageView iconView = getIconView();
        C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse(c435280H5a.LL));
        c1331670kl3LJI.LJJIJL(iconView.getContext());
        c1331670kl3LJI.LJJ(iconView);
        ITakoContextAbility takoContextAbility = getTakoContextAbility();
        if (takoContextAbility == null || (mapLJ = takoContextAbility.getCommonParams()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        c1331670kl3LJI.LJJJIL = new C1338340kvo(iconView, "TakoMarketItem", c435280H5a.LL, mapLJ);
        c1331670kl3LJI.LJIIJ(new C0ID0(1));
        TuxTextView titleTv = getTitleTv();
        titleTv.setText(c435280H5a.LLILLJJLI);
        titleTv.setTuxFont(c435280H5a.LLILZLL);
        getDescTv().setText(c435280H5a.LLILLL);
        C197039127h ctaButton = getCtaButton();
        ctaButton.setText(c435280H5a.LLILZ);
        ctaButton.LJJJJL(new AwS372S0200000_6(ctaButton, c435280H5a, 33));
        int i = c435280H5a.LLILZIL;
        float[] fArr = {0.0f, 0.0f, 0.25f};
        C2441009hQ.LIZIZ(Color.red(i), Color.green(i), Color.blue(i), fArr);
        ctaButton.setTextColor(C2441009hQ.LIZ(fArr));
        ctaButton.LJJLI(true);
        C786410Ut5.I7(new AkS78S0100000_6(c435280H5a, 12), ctaButton);
        Function1<C435280H5a, Unit> function1 = c435280H5a.LLJ;
        if (function1 != null) {
            function1.invoke(c435280H5a);
        }
        C786410Ut5.I7(new AkS78S0100000_6(c435280H5a, 11), this);
        setOnLongClickListener(new C0IDT(c435280H5a, 2));
        if (c435280H5a.LLIZ) {
            C427690Gpr.LJ(this, 0.0f);
        } else {
            setForeground(null);
        }
    }

    public C0H5Z(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.fl1, this, true);
        setAddStatesFromChildren(false);
        this.LL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 739));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 741));
        this.LLILLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 738));
        this.LLILZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 737));
        this.LLILZIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 740));
    }
}
