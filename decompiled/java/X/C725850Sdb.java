package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Sdb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C725850Sdb extends FrameLayout {
    public final C418990Gbp LL;
    public final AvatarComponentView LLILLJJLI;
    public final TuxTextView LLILLL;
    public TuxIconView LLILZ;

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C725850Sdb(Context context) {
        Integer numLIZJ;
        super(context, null, 0);
        int iIntValue = 0;
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        C12P5 c12p5 = new C12P5();
        c12p5.LIZLLL = Integer.valueOf(R.attr.e1);
        c12p5.LJ = Float.valueOf(0.3f);
        c12p5.LJFF = Float.valueOf(0.0f);
        c12p5.LJI = C12KQ.VERTICAL;
        setBackground(c12p5.LIZ(context));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
        layoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        C786410Ut5.d6(linearLayout, layoutParams2);
        C418990Gbp c418990Gbp = new C418990Gbp(context, null, 6);
        c418990Gbp.setOrientation(0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams3.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        layoutParams3.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c418990Gbp);
        c418990Gbp.setLayoutParams(layoutParams3);
        this.LL = c418990Gbp;
        AvatarComponentView avatarComponentView = new AvatarComponentView(context, null, 14);
        avatarComponentView.setId(FrameLayout.generateViewId());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        layoutParams4.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        C786410Ut5.e7(avatarComponentView, layoutParams4);
        avatarComponentView.LJIILJJIL(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))), null);
        this.LLILLJJLI = avatarComponentView;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setId(FrameLayout.generateViewId());
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 17;
        C786410Ut5.R6(tuxTextView, layoutParams5);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setGravity(16);
        tuxTextView.setIncludeFontPadding(false);
        tuxTextView.setMaxLines(1);
        tuxTextView.setTuxFont(72);
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zi, context)) != null) {
            iIntValue = numLIZJ.intValue();
        }
        tuxTextView.setTextColor(iIntValue);
        tuxTextView.LJJJJI(12.0f);
        this.LLILLL = tuxTextView;
        linearLayout.addView(avatarComponentView);
        linearLayout.addView(c418990Gbp);
        c418990Gbp.addView(tuxTextView);
        if (C278580Avw.LIZ()) {
            TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams6.gravity = 17;
            layoutParams6.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
            C786410Ut5.M6(tuxIconView, layoutParams6);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_color_verified_badge;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            tuxIconView.setTuxIcon(c419910GdJ);
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            this.LLILZ = tuxIconView;
            c418990Gbp.addView(tuxIconView);
        }
        addView(linearLayout);
    }

    public final void setReservedEndWidth(int i) {
        LinearLayout.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = this.LL.getLayoutParams();
        if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
            if (i < iLIZIZ) {
                i = iLIZIZ;
            }
            layoutParams.setMarginEnd(i);
            C418990Gbp c418990Gbp = this.LL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c418990Gbp);
            c418990Gbp.setLayoutParams(layoutParams);
        }
    }

    public final void LIZ(LifecycleOwner lifecycleOwner, Aweme aweme) {
        String nickname;
        User author = aweme.getAuthor();
        if (author == null || (nickname = author.getNickname()) == null) {
            nickname = "";
        }
        String strLIZ = C0SE9.LIZ(author, nickname);
        if (author != null) {
            int i = 0;
            if (strLIZ != null && strLIZ.length() != 0) {
                C0S1B.LIZ(this.LLILLJJLI, AwemeExtKt.getAuthorUid(aweme), author, lifecycleOwner, false, null, 56);
                this.LLILLL.setText(strLIZ);
                AvatarComponentView avatarComponentView = this.LLILLJJLI;
                avatarComponentView.getConfig().LIZJ(new C1607280rva(new C1607310rvd(EnumC1606090rtf.FRIENDS_WATERFALL, null, false, false, null, 254)));
                avatarComponentView.LJFF(avatarComponentView.getConfig());
                if (C278580Avw.LIZ()) {
                    boolean zLIZLLL = C1908030zkf.LIZLLL(new UserVerify(null, author.getCustomVerify(), author.getEnterpriseVerifyReason(), -1));
                    TuxIconView tuxIconView = this.LLILZ;
                    if (tuxIconView != null) {
                        if (!zLIZLLL) {
                            i = 8;
                        }
                        C786410Ut5.LLLLLLZZ(tuxIconView, i);
                        return;
                    }
                    return;
                }
                TuxIconView tuxIconView2 = this.LLILZ;
                if (tuxIconView2 != null) {
                    C418990Gbp c418990Gbp = this.LL;
                    RemoveViewCausedNPEChecker.recordViewRemovedPoint(c418990Gbp, tuxIconView2);
                    c418990Gbp.removeView(tuxIconView2);
                    this.LLILZ = null;
                }
                if (!C1908030zkf.LIZLLL(new UserVerify(null, author.getCustomVerify(), author.getEnterpriseVerifyReason(), -1))) {
                    return;
                }
                TuxIconView tuxIconView3 = new TuxIconView(getContext(), null, 0, 6, null);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
                C786410Ut5.M6(tuxIconView3, layoutParams);
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_color_verified_badge;
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                tuxIconView3.setTuxIcon(c419910GdJ);
                this.LLILZ = tuxIconView3;
                this.LL.addView(tuxIconView3);
            }
        }
    }
}
