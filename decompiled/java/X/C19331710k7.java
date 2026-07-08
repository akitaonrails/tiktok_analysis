package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment;
import com.ss.android.ugc.aweme.lemon.Lemon8ProfileContentSyncConfig;
import com.ss.android.ugc.aweme.lemon.profile.Lemon8PopupForContentSyncFragmentV2;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.privacy.ui.PublishDefaultPermissionFragment;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.10k7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19331710k7 extends ClickableSpan {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    public static final void updateDrawState$3(C19331710k7 c19331710k7, TextPaint textPaint) {
    }

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

    public static final void onClick$0(C19331710k7 c19331710k7, View view) {
        ((TTKRegistrationBaseFragment) c19331710k7.l0).nS().setHighlightColor(0);
        ((TTKRegistrationBaseFragment) c19331710k7.l0).fT((Bundle) c19331710k7.l1, true);
    }

    public static final void onClick$1(C19331710k7 c19331710k7, View view) {
        ((TTKRegistrationBaseFragment) c19331710k7.l0).nS().setHighlightColor(0);
        ((TTKRegistrationBaseFragment) c19331710k7.l0).fT((Bundle) c19331710k7.l1, false);
    }

    public static final void onClick$2(C19331710k7 c19331710k7, View view) {
        C10G1 c10g1 = C10G1.LIZ;
        Lemon8ProfileContentSyncConfig lemon8ProfileContentSyncConfig = ((Lemon8PopupForContentSyncFragmentV2) c19331710k7.l0).LLILLJJLI;
        c10g1.getClass();
        C10G1.LIZJ(lemon8ProfileContentSyncConfig, "click", "learn_more");
        SmartRouter.buildRoute((Context) c19331710k7.l1, ((C10GH) c19331710k7.l2).LIZJ).open();
    }

    public static final void onClick$3(C19331710k7 c19331710k7, View view) {
        String creationId;
        PrivacySettingsRestrictionOption privacySettingsRestrictionOption = (PrivacySettingsRestrictionOption) c19331710k7.l0;
        if (privacySettingsRestrictionOption != null && privacySettingsRestrictionOption.showType == 1) {
            return;
        }
        ((PublishDefaultPermissionFragment) c19331710k7.l1).oS();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((Context) c19331710k7.l2, "//privacy/setting/friends_list");
        smartRouteBuildRoute.withParam("enter_from", "publish");
        VideoPublishEditModel videoPublishEditModel = ((PublishDefaultPermissionFragment) c19331710k7.l1).aS().getVideoPublishEditModel();
        if (videoPublishEditModel != null) {
            creationId = videoPublishEditModel.getCreationId();
        } else {
            creationId = null;
        }
        smartRouteBuildRoute.withParam("creation_id", creationId);
        smartRouteBuildRoute.open();
    }

    public static final void updateDrawState$0(C19331710k7 c19331710k7, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(43);
        textPaint.setUnderlineText(false);
        Integer num = (Integer) c19331710k7.l2;
        if (num != null) {
            num.intValue();
            textPaint.setColor(num.intValue());
        }
        textPaint.setTypeface(c444890HcV.getTypeface());
    }

    public static final void updateDrawState$1(C19331710k7 c19331710k7, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(43);
        Integer num = (Integer) c19331710k7.l2;
        if (num != null) {
            num.intValue();
            textPaint.setColor(num.intValue());
        }
        textPaint.setUnderlineText(false);
        textPaint.setTypeface(c444890HcV.getTypeface());
    }

    public static final void updateDrawState$2(C19331710k7 c19331710k7, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1n, (Context) c19331710k7.l1);
        if (numLIZJ != null) {
            textPaint.setColor(numLIZJ.intValue());
        }
        textPaint.setUnderlineText(false);
    }

    public C19331710k7(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
