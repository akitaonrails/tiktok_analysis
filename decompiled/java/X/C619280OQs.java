package X;

import Y.ACListenerS144S0100000_9;
import Y.ARunnableS78S0200000_9;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import avg.f;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommentAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinTooltipAbility;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mf.a;

/* JADX INFO: renamed from: X.0OQs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C619280OQs extends LinearLayout {
    public final TuxIconView LL;
    public final TuxTextView LLILLJJLI;
    public final GradientDrawable LLILLL;
    public int LLILZ;
    public long LLILZIL;
    public BulletinCommentAbility LLILZLL;
    public BulletinCommonAbility LLIZ;
    public BulletinTooltipAbility LLIZLLLIL;
    public int LLJ;
    public Boolean LLJI;

    public C619280OQs(Context context) {
        int iIntValue;
        super(context);
        this.LLJ = -1;
        setOrientation(0);
        setGravity(16);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)));
        marginLayoutParams.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(marginLayoutParams);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        this.LLILZ = iIntValue;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(14));
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        c384050F3z.LJ = Integer.valueOf(this.LLILZ);
        GradientDrawable gradientDrawable = (GradientDrawable) c384050F3z.LIZ(context);
        this.LLILLL = gradientDrawable;
        setBackground(gradientDrawable);
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setImportantForAccessibility(2);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_bubble_ellipsis_right;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        tuxIconView.setTuxIcon(c419910GdJ);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        layoutParams.gravity = 16;
        C786410Ut5.M6(tuxIconView, layoutParams);
        this.LL = tuxIconView;
        addView(tuxIconView);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTuxFont(72);
        tuxTextView.setMaxLines(1);
        tuxTextView.setSingleLine(true);
        tuxTextView.setTextColorRes(R.attr.a1h);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        layoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        layoutParams2.gravity = 16;
        C786410Ut5.R6(tuxTextView, layoutParams2);
        this.LLILLJJLI = tuxTextView;
        addView(tuxTextView);
        View.OnClickListener aCListenerS144S0100000_9 = new ACListenerS144S0100000_9(this, 113);
        View.OnClickListener aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS144S0100000_9) : aCListenerS144S0100000_9);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }

    public final void LIZ(C0OQC c0oqc, BulletinCommentAbility bulletinCommentAbility, BulletinCommonAbility bulletinCommonAbility, BulletinTooltipAbility bulletinTooltipAbility) {
        this.LLILZLL = bulletinCommentAbility;
        this.LLIZ = bulletinCommonAbility;
        this.LLIZLLLIL = bulletinTooltipAbility;
        if (this.LL.getDrawable() != null) {
            TuxIconView tuxIconView = this.LL;
            tuxIconView.setImageDrawable(tuxIconView.getDrawable());
        } else {
            TuxIconView tuxIconView2 = this.LL;
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_bubble_ellipsis_right;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            tuxIconView2.setTuxIcon(c419910GdJ);
        }
        if (this.LLJ == c0oqc.LLILLJJLI && Intrinsics.LJFF(this.LLJI, Boolean.valueOf(c0oqc.LLILLL))) {
            return;
        }
        this.LLJ = c0oqc.LLILLJJLI;
        this.LLJI = Boolean.valueOf(c0oqc.LLILLL);
        TuxTextView tuxTextView = this.LLILLJJLI;
        String string = c0oqc.LLILZIL;
        if (string.length() == 0) {
            string = getContext().getString(2131827941);
        }
        tuxTextView.setText(string);
        BulletinTooltipAbility bulletinTooltipAbility2 = this.LLIZLLLIL;
        if (bulletinTooltipAbility2 != null) {
            BulletinCommonAbility bulletinCommonAbility2 = this.LLIZ;
            if (bulletinCommonAbility2 != null && bulletinCommonAbility2.q11() && c0oqc.LLILZ) {
                BulletinCommonAbility bulletinCommonAbility3 = this.LLIZ;
                if (bulletinCommonAbility3 != null && bulletinCommonAbility3.To()) {
                    bulletinTooltipAbility2.WK0(EnumC619900OTc.COMMENT_ENTRY_TOOLTIP);
                    return;
                } else {
                    bulletinTooltipAbility2.gA2(EnumC619900OTc.COMMENT_ENTRY_TOOLTIP, new InterfaceC619970OTj() { // from class: X.0OQx
                        @Override // X.InterfaceC619970OTj
                        public final boolean isAvailable() {
                            C0OP4.LIZ.getClass();
                            return !C0OP4.LIZ().getBoolean("has_show_comment_entry_tooltip", false);
                        }

                        @Override // X.InterfaceC619970OTj
                        public final void q0(Function0<Unit> function0) {
                            C619280OQs c619280OQs = this.LIZ;
                            HandlerHook.viewPostDelay(c619280OQs, new ARunnableS78S0200000_9(c619280OQs, function0, 60), 1000L);
                        }
                    });
                    return;
                }
            }
            bulletinTooltipAbility2.WK0(EnumC619900OTc.COMMENT_ENTRY_TOOLTIP);
        }
    }
}
