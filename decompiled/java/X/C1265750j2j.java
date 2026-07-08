package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.BackToPreviousPageEvent;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeSheetFragment;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.profile.business.pns.business.ProfileHeaderTopTipsMemorialisedAccountProtocol;
import com.ss.android.ugc.profile.business.pns.business.ProfileInfoMemorialisedAccountProtocol;
import com.ss.android.ugc.profile.business.pns.data.MemorialisedAcountData;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: renamed from: X.0j2j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1265750j2j extends ClickableSpan {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            default:
                super.onClick(view);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.$t) {
            case 0:
                updateDrawState$0(this, textPaint);
                break;
            case 1:
                updateDrawState$1(this, textPaint);
                break;
            case 2:
                updateDrawState$2(this, textPaint);
                break;
            case 3:
                updateDrawState$3(this, textPaint);
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public static final void onClick$0(C1265750j2j c1265750j2j, View view) {
        C1242870iRp c1242870iRp = (C1242870iRp) c1265750j2j.l0;
        C19EG c19eg = (C19EG) c1265750j2j.l1;
        c1242870iRp.getClass();
        C1254250ikB.LIZ.getClass();
        C1254250ikB.LIZ().storeBoolean("key_dismiss_forever", true);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c2344009Gk.LJIIIIZZ("platform", "lemon8");
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        C20684815ws.LJIILLIIL("click_social_account_bind", c2344009Gk.LIZ);
        C1254160ik2 c1254160ik2 = C1254160ik2.LIZIZ;
        if (c1254160ik2.LIZIZ(c19eg)) {
            if (c1254160ik2.LJIILL(c19eg)) {
                c1254160ik2.LJIIL(c19eg, "tiktok_selfhomepage_banner", new AwS598S0100000_19(c19eg, 20), new AwS591S0100000_12(c19eg, 34));
                return;
            } else {
                c1242870iRp.LJIIL(c19eg, false);
                return;
            }
        }
        c1242870iRp.LJIIL(c19eg, true);
    }

    public static final void onClick$1(C1265750j2j c1265750j2j, View view) {
        String str;
        String str2;
        BackToPreviousPageEvent backToPreviousPageEvent = new BackToPreviousPageEvent();
        if (((InputCodeSheetFragment) c1265750j2j.l0).GT()) {
            str = "phone_binding_show";
        } else {
            str = "email_binding_show";
        }
        backToPreviousPageEvent.LJI(str, "current_page");
        if (((InputCodeSheetFragment) c1265750j2j.l0).GT()) {
            str2 = "sms_verification";
        } else {
            str2 = "email_verification";
        }
        backToPreviousPageEvent.LJI(str2, "pre_page");
        backToPreviousPageEvent.LJI(((InputCodeSheetFragment) c1265750j2j.l0).getEnterFrom(), "enter_from");
        backToPreviousPageEvent.LJI("click_modify", "enter_method");
        backToPreviousPageEvent.LJI(((InputCodeSheetFragment) c1265750j2j.l0).RR(), "page");
        backToPreviousPageEvent.LJIIIIZZ();
        String str3 = TuxSheet._pnsPageId;
        C1391190mJ3.LJIILJJIL((InputCodeSheetFragment) c1265750j2j.l0);
    }

    public static final void onClick$2(C1265750j2j c1265750j2j, View view) {
        MemorialisedAcountData memorialisedAcountData;
        Context context = ((ProfileHeaderTopTipsMemorialisedAccountProtocol) c1265750j2j.l0).getContext();
        T t = ((ProfileHeaderTopTipsMemorialisedAccountProtocol) c1265750j2j.l0).LLJILJIL;
        String learnMoreUrl = null;
        if ((t instanceof MemorialisedAcountData) && (memorialisedAcountData = (MemorialisedAcountData) t) != null) {
            learnMoreUrl = memorialisedAcountData.getLearnMoreUrl();
        }
        SmartRouter.buildRoute(context, learnMoreUrl).open();
    }

    public static final void onClick$3(C1265750j2j c1265750j2j, View view) {
        MemorialisedAcountData memorialisedAcountData;
        Context context = ((ProfileInfoMemorialisedAccountProtocol) c1265750j2j.l0).getContext();
        T t = ((ProfileInfoMemorialisedAccountProtocol) c1265750j2j.l0).LLJILJIL;
        String learnMoreUrl = null;
        if ((t instanceof MemorialisedAcountData) && (memorialisedAcountData = (MemorialisedAcountData) t) != null) {
            learnMoreUrl = memorialisedAcountData.getLearnMoreUrl();
        }
        SmartRouter.buildRoute(context, learnMoreUrl).open();
    }

    public static final void updateDrawState$0(C1265750j2j c1265750j2j, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, (C19EG) c1265750j2j.l1);
        if (numLIZJ != null) {
            textPaint.setColor(numLIZJ.intValue());
        }
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$1(C1265750j2j c1265750j2j, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, (Context) c1265750j2j.l1);
        if (numLIZJ != null) {
            textPaint.setColor(numLIZJ.intValue());
        }
    }

    public static final void updateDrawState$2(C1265750j2j c1265750j2j, TextPaint textPaint) {
        Integer num = (Integer) c1265750j2j.l1;
        if (num != null) {
            textPaint.setColor(num.intValue());
        }
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$3(C1265750j2j c1265750j2j, TextPaint textPaint) {
        Integer num = (Integer) c1265750j2j.l1;
        if (num != null) {
            textPaint.setColor(num.intValue());
        }
        textPaint.setUnderlineText(false);
    }

    public C1265750j2j(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
