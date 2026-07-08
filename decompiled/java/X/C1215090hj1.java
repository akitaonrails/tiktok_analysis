package X;

import Y.ACListenerS154S0100000_19;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS257S0000000_19;

/* JADX INFO: renamed from: X.0hj1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1215090hj1 extends FrameLayout {
    public LinearLayout LL;
    public C038I LLILLJJLI;
    public C038I LLILLL;
    public Function1<? super EnumC1216680hla, Unit> LLILZ;
    public final TuxIconView LLILZIL;

    public final C038I getCreatorTabFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f9m);
            this.LLILLJJLI = (C038I) callbackFindViewById;
        }
        return (C038I) callbackFindViewById;
    }

    public final C038I getShopTabFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.v8_);
            this.LLILLL = (C038I) callbackFindViewById;
        }
        return (C038I) callbackFindViewById;
    }

    public final LinearLayout getSwitchContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wtx);
            this.LL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final Function1<EnumC1216680hla, Unit> getOnSelectTabListener() {
        return this.LLILZ;
    }

    public final void setBackBtnClick(Function0<Unit> function0) {
        C786410Ut5.I7(new ACListenerS154S0100000_19(function0, 105), this.LLILZIL);
    }

    public final void setCreatorTabFromXml(C038I c038i) {
        this.LLILLJJLI = c038i;
    }

    public final void setOnSelectTabListener(Function1<? super EnumC1216680hla, Unit> function1) {
        this.LLILZ = function1;
    }

    public final void setShopTabFromXml(C038I c038i) {
        this.LLILLL = c038i;
    }

    public final void setSwitchContainerFromXml(LinearLayout linearLayout) {
        this.LL = linearLayout;
    }

    public C1215090hj1(Context context, AttributeSet attributeSet) {
        FrameLayout.LayoutParams layoutParams;
        super(context, attributeSet, 0);
        this.LLILZ = AFwS257S0000000_19.get$arr$(786);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ao9, this, true);
        ViewGroup.LayoutParams layoutParams2 = getSwitchContainerFromXml().getLayoutParams();
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            layoutParams.gravity = 17;
        }
        LinearLayout switchContainerFromXml = getSwitchContainerFromXml();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        switchContainerFromXml.setBackground(c384050F3z.LIZ(context));
        getCreatorTabFromXml().setText(context.getString(2131857241));
        getShopTabFromXml().setText(context.getString(2131857242));
        C786410Ut5.N9(getCreatorTabFromXml(), new ACListenerS154S0100000_19(this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
        C786410Ut5.N9(getShopTabFromXml(), new ACListenerS154S0100000_19(this, 301));
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        this.LLILZIL = tuxIconView;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_chevron_left_offset_ltr;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        tuxIconView.setTuxIcon(c419910GdJ);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), 8388627);
        layoutParams3.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        addView(tuxIconView, 0, layoutParams3);
    }
}
