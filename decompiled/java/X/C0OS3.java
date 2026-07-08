package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommentAbility;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleTextModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS691S0100000_9;

/* JADX INFO: renamed from: X.0OS3, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OS3 extends LinearLayout {
    public final TuxIconView LL;
    public final TuxTextView LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public Boolean LLILZIL;
    public final C01GW LLILZLL;
    public BulletinCommentAbility LLIZ;

    private final Integer getDarkLightUIText3Color() {
        return (Integer) this.LLILZLL.getValue();
    }

    public final BulletinCommentAbility getCommentAbility() {
        return this.LLIZ;
    }

    public C0OS3(Context context) {
        super(context);
        this.LLILZLL = C452501pT.LIZIZ(new AwS553S0100000_9(context, 1735));
        setOrientation(0);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        setGravity(16);
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        C786410Ut5.M6(tuxIconView, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))));
        this.LL = tuxIconView;
        addView(tuxIconView);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
        C786410Ut5.R6(tuxTextView, layoutParams2);
        tuxTextView.setMaxLines(1);
        tuxTextView.setTuxFont(61);
        tuxTextView.setText(2131827939);
        this.LLILLJJLI = tuxTextView;
        addView(tuxTextView);
        C786410Ut5.I7(new AbS691S0100000_9(this, 48), this);
    }

    public final void setCommentAbility(BulletinCommentAbility bulletinCommentAbility) {
        this.LLIZ = bulletinCommentAbility;
    }

    public final void LIZ(C619580ORw c619580ORw, BulletinCommentAbility bulletinCommentAbility, boolean z) {
        String str;
        int i;
        this.LLIZ = bulletinCommentAbility;
        BulletinStyleTextModel bulletinStyleTextModel = c619580ORw.LLILLL;
        if (bulletinStyleTextModel != null) {
            str = bulletinStyleTextModel.color;
        } else {
            str = null;
        }
        String str2 = c619580ORw.LLILLJJLI;
        if (Intrinsics.LJFF(str, this.LLILLL) && Intrinsics.LJFF(str2, this.LLILZ) && Intrinsics.LJFF(Boolean.valueOf(z), this.LLILZIL)) {
            return;
        }
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = Boolean.valueOf(z);
        if (str != null) {
            Integer darkLightUIText3Color = getDarkLightUIText3Color();
            if (darkLightUIText3Color != null) {
                int iIntValue = darkLightUIText3Color.intValue();
                TuxIconView tuxIconView = this.LL;
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                c419910GdJ.LIZ = R.raw.icon_bubble_ellipsis_right;
                c419910GdJ.LIZLLL = Integer.valueOf(iIntValue);
                tuxIconView.setTuxIcon(c419910GdJ);
                this.LLILLJJLI.setTextColor(iIntValue);
                return;
            }
            return;
        }
        if (z && Intrinsics.LJFF(str2, "text")) {
            i = R.attr.zl;
        } else {
            i = R.attr.a1k;
        }
        TuxIconView tuxIconView2 = this.LL;
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ2.LIZ = R.raw.icon_bubble_ellipsis_right;
        c419910GdJ2.LJ = Integer.valueOf(i);
        tuxIconView2.setTuxIcon(c419910GdJ2);
        this.LLILLJJLI.setTextColorRes(i);
    }
}
