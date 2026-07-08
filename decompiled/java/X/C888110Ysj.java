package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import irm.AkS85S0100000_14;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS415S0200000_14;

/* JADX INFO: renamed from: X.0Ysj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C888110Ysj extends LinearLayout implements InterfaceC422160Ggw {
    public final EnumC880520YgU LL;
    public final Function0<Unit> LLILLJJLI;
    public final TuxTextView LLILLL;
    public boolean LLILZ;
    public ViewTreeObserverOnScrollChangedListenerC888050Ysd LLILZIL;

    public float getExposureRatioThreshold() {
        return 0.3f;
    }

    public final void LIZ() {
        Integer numLIZJ;
        this.LLILLL.setTextColorRes(this.LLILZ ? R.attr.j1 : R.attr.a1h);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(8));
        int iIntValue = 0;
        gradientDrawable.setShape(0);
        int i = this.LLILZ ? R.attr.j0 : R.attr.br;
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(i, context)) != null) {
            iIntValue = numLIZJ.intValue();
        }
        gradientDrawable.setColor(iIntValue);
        setBackground(gradientDrawable);
    }

    public final boolean getTabSelected() {
        return this.LLILZ;
    }

    public final EnumC880520YgU getTabType() {
        return this.LL;
    }

    public final void setTabSelected(boolean z) {
        if (this.LLILZ != z) {
            this.LLILZ = z;
            LIZ();
            if (z) {
                this.LLILLJJLI.invoke();
            }
        }
    }

    public C888110Ysj(Context context, EnumC880520YgU enumC880520YgU, AwS415S0200000_14 awS415S0200000_14) {
        super(context);
        this.LL = enumC880520YgU;
        this.LLILLJJLI = awS415S0200000_14;
        String strLJIIJ = null;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-2, -1));
        Set<EnumC880520YgU> set = C880690Ygl.LIZ;
        switch (C880630Ygf.LIZ[enumC880520YgU.ordinal()]) {
            case 1:
            case 2:
                strLJIIJ = C1383370m6R.LJIIJ(2131830212);
                break;
            case 3:
                strLJIIJ = C1383370m6R.LJIIJ(2131830309);
                break;
            case 4:
                strLJIIJ = C1383370m6R.LJIIJ(2131830307);
                break;
            case 5:
                strLJIIJ = C1383370m6R.LJIIJ(2131834818);
                break;
            case 6:
                strLJIIJ = C1383370m6R.LJIIJ(2131834819);
                break;
            case 7:
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                strLJIIJ = C1383370m6R.LIZ.getResources().getQuantityString(2131755315, 1, "1");
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                strLJIIJ = C1383370m6R.LJIIJ(2131850093);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                strLJIIJ = C1383370m6R.LJIIJ(2131834820);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                strLJIIJ = C1383370m6R.LJIIJ(2131846458);
                break;
            case 14:
                strLJIIJ = C1383370m6R.LJIIJ(2131848486);
                break;
            default:
                throw new C1954807lC();
        }
        tuxTextView.setText(strLJIIJ);
        tuxTextView.setTuxFont(62);
        tuxTextView.setGravity(16);
        tuxTextView.setMaxLines(1);
        this.LLILLL = tuxTextView;
        setOrientation(0);
        setGravity(17);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        C426750GoL.LJIIL(this, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 0, 16);
        addView(tuxTextView);
        C786410Ut5.I7(new AkS85S0100000_14(this, 0), this);
        LIZ();
    }
}
