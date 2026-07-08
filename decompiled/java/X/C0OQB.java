package X;

import Y.ACListenerS144S0100000_9;
import Y.ARunnableS42S0300000_9;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import avg.f;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinEmojiDetailSheetFragment;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinEmojiAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinEmojiAnimationAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinInteractionAbility;
import com.zhiliaoapp.musically.R;
import mf.a;

/* JADX INFO: renamed from: X.0OQB, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OQB extends LinearLayout {
    public final TuxTextView LL;
    public C0OQ8 LLILLJJLI;
    public BulletinCommonAbility LLILLL;
    public BulletinInteractionAbility LLILZ;
    public BulletinEmojiAbility LLILZIL;
    public BulletinEmojiAnimationAbility LLILZLL;
    public long LLIZ;

    public C0OQB(Context context) {
        super(context);
        setOrientation(0);
        setGravity(16);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)));
        marginLayoutParams.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(marginLayoutParams);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setId(R.id.h02);
        tuxTextView.setTuxFont(72);
        tuxTextView.setMaxLines(1);
        tuxTextView.setSingleLine(true);
        tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0);
        tuxTextView.setGravity(17);
        tuxTextView.setTextColorRes(R.attr.a1h);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 16;
        C786410Ut5.R6(tuxTextView, layoutParams);
        this.LL = tuxTextView;
        addView(tuxTextView);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(14));
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        c384050F3z.LJ = C1308910kAL.LIZJ(R.attr.a03, context);
        setBackground(c384050F3z.LIZ(context));
        View.OnClickListener aCListenerS144S0100000_9 = new ACListenerS144S0100000_9(this, 112);
        View.OnClickListener aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS144S0100000_9) : aCListenerS144S0100000_9);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
        setOnLongClickListener(new C0P4N(this, 4));
    }

    public final void LIZIZ(boolean z) {
        boolean z2;
        int status;
        BulletinBaseItem bulletinBaseItemCK;
        View viewMH2;
        BulletinInteractionAbility bulletinInteractionAbility;
        int status2;
        C0OQ8 c0oq8 = this.LLILLJJLI;
        if (c0oq8 == null) {
            return;
        }
        BulletinCommonAbility bulletinCommonAbility = this.LLILLL;
        boolean z3 = true;
        if (bulletinCommonAbility != null && bulletinCommonAbility.To()) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str = "long_press_n_button";
        String str2 = "";
        if (z2) {
            LIZJ(c0oq8, bulletinCommonAbility);
            C0OPQ c0opq = C0OPQ.LIZ;
            String strValueOf = String.valueOf(bulletinCommonAbility.Og2());
            String str3 = c0oq8.LLILLL;
            if (str3 != null) {
                str2 = str3;
            }
            int iIE = bulletinCommonAbility.IE();
            if (!z) {
                str = "click_n_button";
            }
            int iQF = bulletinCommonAbility.qF();
            c0opq.getClass();
            C0OPQ.LJIJJLI(iIE, iQF, strValueOf, str2, str);
            return;
        }
        if (bulletinCommonAbility == null || !bulletinCommonAbility.Nl()) {
            z3 = false;
        }
        Long lValueOf = null;
        if (z3) {
            BulletinInteractionAbility bulletinInteractionAbility2 = this.LLILZ;
            if (bulletinInteractionAbility2 == null) {
                return;
            }
            String str4 = c0oq8.LLILLL;
            if (str4 != null) {
                str2 = str4;
            }
            bulletinInteractionAbility2.rE1(str2, "click_bulletin_message_emoji", null);
            return;
        }
        int iIE2 = -1;
        if (z) {
            LIZJ(c0oq8, bulletinCommonAbility);
            C0OPQ c0opq2 = C0OPQ.LIZ;
            if (bulletinCommonAbility != null) {
                lValueOf = Long.valueOf(bulletinCommonAbility.Og2());
            }
            String strValueOf2 = String.valueOf(lValueOf);
            String str5 = c0oq8.LLILLL;
            if (str5 != null) {
                str2 = str5;
            }
            if (bulletinCommonAbility != null) {
                iIE2 = bulletinCommonAbility.IE();
                status2 = bulletinCommonAbility.qF();
            } else {
                status2 = EnumC617010OHz.INVALID.getStatus();
            }
            c0opq2.getClass();
            C0OPQ.LJIJJLI(iIE2, status2, strValueOf2, str2, "long_press_n_button");
            return;
        }
        BulletinEmojiAbility bulletinEmojiAbility = this.LLILZIL;
        if (bulletinEmojiAbility != null && (bulletinBaseItemCK = bulletinEmojiAbility.cK()) != null && (viewMH2 = bulletinEmojiAbility.MH2()) != null && (bulletinInteractionAbility = this.LLILZ) != null) {
            bulletinInteractionAbility.Vh1(viewMH2, bulletinBaseItemCK, bulletinEmojiAbility);
        }
        C0OPQ c0opq3 = C0OPQ.LIZ;
        if (bulletinCommonAbility != null) {
            lValueOf = Long.valueOf(bulletinCommonAbility.Og2());
        }
        String strValueOf3 = String.valueOf(lValueOf);
        String str6 = c0oq8.LLILLL;
        if (str6 != null) {
            str2 = str6;
        }
        if (bulletinCommonAbility != null) {
            iIE2 = bulletinCommonAbility.IE();
            status = bulletinCommonAbility.qF();
        } else {
            status = EnumC617010OHz.INVALID.getStatus();
        }
        c0opq3.getClass();
        C0OPQ.LJIJJLI(iIE2, status, strValueOf3, str2, "click_n_button");
    }

    public final void LIZJ(C0OQ8 c0oq8, BulletinCommonAbility bulletinCommonAbility) {
        Long lLJIILIIL;
        BulletinEmojiAbility bulletinEmojiAbility;
        if (bulletinCommonAbility != null) {
            long jOg2 = bulletinCommonAbility.Og2();
            String str = c0oq8.LLILLL;
            if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
                long jLongValue = lLJIILIIL.longValue();
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "fix_7331381508_bb_emoji_remove_pass_ability", true, true)) {
                    bulletinEmojiAbility = this.LLILZIL;
                } else {
                    bulletinEmojiAbility = null;
                }
                String str2 = BulletinEmojiDetailSheetFragment._pnsPageId;
                Context context = getContext();
                FragmentManager parentFragmentManager = FragmentManager.LJJJJLL(this).getParentFragmentManager();
                Bundle bundle = new Bundle();
                bundle.putLong("bulletin_board_id", jOg2);
                bundle.putLong("bbItemId", jLongValue);
                C616780OHc.LIZ(context, parentFragmentManager, bundle, bulletinEmojiAbility, bulletinCommonAbility.isHalfScreen());
            }
        }
    }

    public final void LIZ(C0OQ8 c0oq8, BulletinCommonAbility bulletinCommonAbility, BulletinInteractionAbility bulletinInteractionAbility, BulletinEmojiAbility bulletinEmojiAbility, BulletinEmojiAnimationAbility bulletinEmojiAnimationAbility) {
        this.LLILLL = bulletinCommonAbility;
        this.LLILZ = bulletinInteractionAbility;
        this.LLILZIL = bulletinEmojiAbility;
        this.LLILZLL = bulletinEmojiAnimationAbility;
        this.LLILLJJLI = c0oq8;
        TuxTextView tuxTextView = this.LL;
        String strLIZIZ = c0oq8.LLILZLL;
        if (strLIZIZ.length() == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('+');
            sbLIZ.append(C498380Jga.LIZ.LIZ(c0oq8.LL - c0oq8.LLILLJJLI));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        tuxTextView.setText(strLIZIZ);
        if (c0oq8.LLILZ) {
            c0oq8.LLILZ = false;
            HandlerHook.viewPost(this, new ARunnableS42S0300000_9(bulletinEmojiAnimationAbility, c0oq8, this, 6));
        }
    }
}
