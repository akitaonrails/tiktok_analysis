package X;

import Y.ACListenerS113S0200000_9;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinEmojiAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinInteractionAbility;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0OOw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C618800OOw extends LinearLayout {
    public final TuxIconView LL;
    public String LLILLJJLI;
    public BulletinCommonAbility LLILLL;
    public BulletinInteractionAbility LLILZ;
    public BulletinEmojiAbility LLILZIL;
    public long LLILZLL;

    public C618800OOw(Context context) {
        super(context);
        this.LLILLJJLI = "";
        setOrientation(0);
        setGravity(17);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)));
        marginLayoutParams.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(marginLayoutParams);
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setId(R.id.gzg);
        tuxIconView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), 0);
        tuxIconView.setImportantForAccessibility(2);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_emoji_plus;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        tuxIconView.setTuxIcon(c419910GdJ);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 16;
        C786410Ut5.M6(tuxIconView, layoutParams);
        this.LL = tuxIconView;
        addView(tuxIconView);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(14));
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        c384050F3z.LJ = C1308910kAL.LIZJ(R.attr.a03, context);
        setBackground(c384050F3z.LIZ(context));
        C786410Ut5.a9(tuxIconView, new ACListenerS113S0200000_9(this, context, 39));
    }

    public final void LIZ(String str, BulletinCommonAbility bulletinCommonAbility, BulletinInteractionAbility bulletinInteractionAbility, BulletinEmojiAbility bulletinEmojiAbility) {
        this.LLILLL = bulletinCommonAbility;
        this.LLILZ = bulletinInteractionAbility;
        this.LLILZIL = bulletinEmojiAbility;
        this.LLILLJJLI = str;
        if (this.LL.getDrawable() != null) {
            TuxIconView tuxIconView = this.LL;
            tuxIconView.setImageDrawable(tuxIconView.getDrawable());
            return;
        }
        TuxIconView tuxIconView2 = this.LL;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_emoji_plus;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        tuxIconView2.setTuxIcon(c419910GdJ);
    }
}
