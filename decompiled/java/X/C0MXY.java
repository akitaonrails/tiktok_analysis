package X;

import Y.ACListenerS143S0100000_8;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import avg.f;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.b2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS585S0100000_6;
import mf.a;

/* JADX INFO: renamed from: X.0MXY, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MXY extends C389610FPj {
    public final boolean LL;
    public final LinearLayout LLILLJJLI;
    public final List<Function1<Object, Unit>> LLILLL;
    public C0MXX LLILZ;

    public C0MXY(Context context) {
        this(context, null, 6);
    }

    public C0MXY(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LIZIZ() {
        C786410Ut5.LJJJJJL(this.LLILLJJLI);
        ((ArrayList) this.LLILLL).clear();
        Function0<Unit> onClick$tools_ai_uikit_release = this.LLILZ.getOnClick$tools_ai_uikit_release();
        if (onClick$tools_ai_uikit_release != null) {
            View.OnClickListener aCListenerS143S0100000_8 = new ACListenerS143S0100000_8(onClick$tools_ai_uikit_release, 12);
            if (C1848410yCV.LIZ) {
                aCListenerS143S0100000_8 = new f(aCListenerS143S0100000_8);
            }
            a aVar = new a(aCListenerS143S0100000_8);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(this);
            }
            setOnClickListener(aVar);
        }
        int outlineWidthPx$tools_ai_uikit_release = this.LLILZ.getOutlineWidthPx$tools_ai_uikit_release();
        int avatarSizeDp$tools_ai_uikit_release = this.LLILZ.getAvatarSizeDp$tools_ai_uikit_release();
        Function0<View> hollowContentBuilder$tools_ai_uikit_release = this.LLILZ.getHollowContentBuilder$tools_ai_uikit_release();
        if (hollowContentBuilder$tools_ai_uikit_release == null) {
            hollowContentBuilder$tools_ai_uikit_release = new AwS552S0100000_8(this, 54);
        }
        int hollowContentSizePx$tools_ai_uikit_release = this.LLILZ.getHollowContentSizePx$tools_ai_uikit_release();
        Pair<Integer, Integer> hollowOffsetPx$tools_ai_uikit_release = this.LLILZ.getHollowOffsetPx$tools_ai_uikit_release();
        List<Object> avatars$tools_ai_uikit_release = this.LLILZ.getAvatars$tools_ai_uikit_release();
        C0MXZ extraViewType$tools_ai_uikit_release = this.LLILZ.getExtraViewType$tools_ai_uikit_release();
        int i = 0;
        if (extraViewType$tools_ai_uikit_release instanceof C569960MXa) {
            if (avatars$tools_ai_uikit_release.size() > this.LLILZ.getShowLimit$tools_ai_uikit_release()) {
                int size = avatars$tools_ai_uikit_release.size() - this.LLILZ.getShowLimit$tools_ai_uikit_release();
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(avatarSizeDp$tools_ai_uikit_release)));
                if (this.LLILZ.getExtraViewType$tools_ai_uikit_release() instanceof C569960MXa) {
                    FrameLayout frameLayout = new FrameLayout(getContext());
                    C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(iLIZIZ, iLIZIZ));
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZIZ = Integer.valueOf(R.attr.aes);
                    c384050F3z.LIZJ = Float.valueOf(iLIZIZ / 2.0f);
                    frameLayout.setBackground(c384050F3z.LIZ(frameLayout.getContext()));
                    TuxTextView tuxTextView = new TuxTextView(getContext(), null, 6, 0);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 17;
                    C786410Ut5.R6(tuxTextView, layoutParams);
                    tuxTextView.setTuxFont(this.LLILZ.getExtraViewType$tools_ai_uikit_release().LIZ);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('+');
                    sbLIZ.append(size);
                    tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
                    tuxTextView.setGravity(17);
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, tuxTextView.getContext());
                    tuxTextView.setTextColor(numLIZJ != null ? numLIZJ.intValue() : 0);
                    tuxTextView.setLayoutDirection(this.LL ? 1 : 0);
                    frameLayout.addView(tuxTextView);
                    this.LLILLJJLI.addView(frameLayout);
                }
            }
        } else if (!(extraViewType$tools_ai_uikit_release instanceof C569970MXb)) {
            if (extraViewType$tools_ai_uikit_release instanceof C569990MXd) {
                C0MXZ extraViewType$tools_ai_uikit_release2 = this.LLILZ.getExtraViewType$tools_ai_uikit_release();
                if ((extraViewType$tools_ai_uikit_release2 instanceof C569990MXd) && extraViewType$tools_ai_uikit_release2 != null) {
                    throw null;
                }
            } else if (!(extraViewType$tools_ai_uikit_release instanceof C0MXU)) {
                if (!(extraViewType$tools_ai_uikit_release instanceof C569980MXc)) {
                    throw new C1954807lC();
                }
                View b2Var = new b2(getContext());
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILZ.getAvatarSizeDp$tools_ai_uikit_release()))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILZ.getAvatarSizeDp$tools_ai_uikit_release()))));
                layoutParams2.gravity = 17;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(b2Var);
                b2Var.setLayoutParams(layoutParams2);
                this.LLILLJJLI.addView(b2Var);
            }
        }
        int iMin = Math.min(this.LLILZ.getShowLimit$tools_ai_uikit_release(), avatars$tools_ai_uikit_release.size());
        int i2 = 0;
        while (i2 < iMin) {
            List<Function1<Object, Unit>> list = this.LLILLL;
            View viewInvoke = hollowContentBuilder$tools_ai_uikit_release.invoke();
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            if (this.LLILLJJLI.getChildCount() > 0) {
                layoutParams3.setMarginStart(-((int) (this.LLILZ.getOverlapSizePx$tools_ai_uikit_release() + outlineWidthPx$tools_ai_uikit_release + 1)));
            }
            C786410Ut5.a6(frameLayout2, layoutParams3);
            C1847590yBB c1847590yBB = new C1847590yBB(getContext());
            int i3 = outlineWidthPx$tools_ai_uikit_release * 2;
            ViewGroup.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(avatarSizeDp$tools_ai_uikit_release))) + i3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(avatarSizeDp$tools_ai_uikit_release))) + i3);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1847590yBB);
            c1847590yBB.setLayoutParams(layoutParams4);
            float f = outlineWidthPx$tools_ai_uikit_release;
            c1847590yBB.setOutlineWidth(f);
            C427660Gpo c427660Gpo = new C427660Gpo(getContext(), null, 6, 0);
            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(avatarSizeDp$tools_ai_uikit_release))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(avatarSizeDp$tools_ai_uikit_release))));
            layoutParams5.gravity = 17;
            C786410Ut5.H6(c427660Gpo, layoutParams5);
            c427660Gpo.setSize(avatarSizeDp$tools_ai_uikit_release);
            c1847590yBB.addView(c427660Gpo);
            frameLayout2.addView(c1847590yBB);
            int size2 = this.LLILZ.getAvatars$tools_ai_uikit_release().size() - this.LLILZ.getShowLimit$tools_ai_uikit_release();
            if ((this.LLILLJJLI.getChildCount() == 1 && (this.LLILZ.getExtraViewType$tools_ai_uikit_release() instanceof C569980MXc) && size2 > 0) || (this.LLILLJJLI.getChildCount() == 0 && (this.LLILZ.getExtraViewType$tools_ai_uikit_release() instanceof C0MXU) && size2 > 0)) {
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(avatarSizeDp$tools_ai_uikit_release)));
                FrameLayout frameLayout3 = new FrameLayout(getContext());
                FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(iLIZIZ2, iLIZIZ2);
                layoutParams6.gravity = 17;
                C786410Ut5.a6(frameLayout3, layoutParams6);
                C384050F3z c384050F3z2 = new C384050F3z();
                c384050F3z2.LIZ = 1711276032;
                c384050F3z2.LIZJ = Float.valueOf(iLIZIZ2 / 2.0f);
                frameLayout3.setBackground(c384050F3z2.LIZ(frameLayout3.getContext()));
                TuxTextView tuxTextView2 = new TuxTextView(getContext(), null, 6, 0);
                FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams7.gravity = 17;
                C786410Ut5.R6(tuxTextView2, layoutParams7);
                tuxTextView2.setTuxFont(this.LLILZ.getExtraViewType$tools_ai_uikit_release().LIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append('+');
                sbLIZ2.append(size2);
                tuxTextView2.setText(C2188811AlT.LIZIZ(sbLIZ2));
                tuxTextView2.setGravity(17);
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ee, tuxTextView2.getContext());
                tuxTextView2.setTextColor(numLIZJ2 != null ? numLIZJ2.intValue() : 0);
                tuxTextView2.setLayoutDirection(this.LL ? 1 : 0);
                frameLayout3.addView(tuxTextView2);
                frameLayout2.addView(frameLayout3);
            }
            if (this.LLILZ.getShowHollowContent$tools_ai_uikit_release()) {
                C1847590yBB c1847590yBB2 = new C1847590yBB(getContext());
                int i4 = hollowContentSizePx$tools_ai_uikit_release + i3;
                FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(i4, i4);
                layoutParams8.gravity = 85;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1847590yBB2);
                c1847590yBB2.setLayoutParams(layoutParams8);
                c1847590yBB2.setOutlineWidth(f);
                FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(hollowContentSizePx$tools_ai_uikit_release, hollowContentSizePx$tools_ai_uikit_release);
                layoutParams9.gravity = 17;
                c1847590yBB2.addView(viewInvoke, layoutParams9);
                float fIntValue = hollowOffsetPx$tools_ai_uikit_release.getFirst().intValue();
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1847590yBB2);
                c1847590yBB2.setTranslationX(fIntValue);
                float fIntValue2 = hollowOffsetPx$tools_ai_uikit_release.getSecond().intValue();
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1847590yBB2);
                c1847590yBB2.setTranslationY(fIntValue2);
                frameLayout2.addView(c1847590yBB2);
            }
            this.LLILLJJLI.addView(frameLayout2);
            ListProtector.add(list, 0, new AwS585S0100000_6(c427660Gpo, 21));
            i2++;
            i = 0;
        }
        for (Object obj : (ArrayList) this.LLILLL) {
            int i5 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            ((Function1) obj).invoke(ListProtector.get(avatars$tools_ai_uikit_release, i));
            i = i5;
        }
    }

    public final C0MXX getConfig() {
        return this.LLILZ;
    }

    public final void LIZ(C0MXX c0mxx) {
        this.LLILZ = c0mxx;
        LIZIZ();
    }

    public final void setConfig(C0MXX c0mxx) {
        this.LLILZ = c0mxx;
    }

    public C0MXY(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        boolean zLIZLLL = C426750GoL.LIZLLL(context);
        this.LL = zLIZLLL;
        LinearLayout linearLayout = new LinearLayout(context);
        C786410Ut5.d6(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutDirection(!zLIZLLL ? 1 : 0);
        this.LLILLJJLI = linearLayout;
        this.LLILLL = new ArrayList();
        this.LLILZ = new C0MXX();
        addView(linearLayout);
    }
}
