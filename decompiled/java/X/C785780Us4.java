package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.aisummary.AISummaryApi;
import com.bytedance.android.livesdk.adminsetting.LiveAISummaryFragment;
import com.bytedance.android.livesdk.broadcast.aisummary.LiveAISummaryDialogFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragment;
import com.bytedance.android.livesdk.livesetting.roomfunction.GpppaGiftBanHelpCenterUrlSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function0;
import tikcast.api.anchor_tool.SubmitLLMTitleFeedbackReq;

/* JADX INFO: renamed from: X.0Us4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C785780Us4 extends ClickableSpan {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void updateDrawState$0(C785780Us4 c785780Us4, TextPaint textPaint) {
    }

    public static final void updateDrawState$1(C785780Us4 c785780Us4, TextPaint textPaint) {
    }

    public static final void updateDrawState$2(C785780Us4 c785780Us4, TextPaint textPaint) {
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
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
            case 7:
                onClick$7(this, view);
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
            case 4:
                updateDrawState$4(this, textPaint);
                break;
            case 5:
                updateDrawState$5(this, textPaint);
                break;
            case 6:
                textPaint.setUnderlineText(false);
                break;
            case 7:
                textPaint.setUnderlineText(false);
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public static final void onClick$0(C785780Us4 c785780Us4, View view) {
        long jLJJLIIIJ;
        String str;
        SubmitLLMTitleFeedbackReq submitLLMTitleFeedbackReq = new SubmitLLMTitleFeedbackReq();
        LiveAISummaryFragment liveAISummaryFragment = (LiveAISummaryFragment) c785780Us4.l0;
        List list = (List) c785780Us4.l1;
        DataChannel dataChannelLJ = C475510Ikn.LJ(liveAISummaryFragment);
        if (dataChannelLJ != null) {
            jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannelLJ);
        } else {
            jLJJLIIIJ = 0;
        }
        submitLLMTitleFeedbackReq.roomId = jLJJLIIIJ;
        if (list != null && list.size() > 1) {
            if (list == null || (str = (String) ListProtector.get(list, 1)) == null) {
                str = "";
            }
            submitLLMTitleFeedbackReq.resultKey = str;
            submitLLMTitleFeedbackReq.like = 2;
            C480460Ism.LIZ().getClass();
            ((AISummaryApi) C480460Ism.LIZLLL(AISummaryApi.class)).aiSummaryFeedback(submitLLMTitleFeedbackReq).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJ();
            C0U4R c0u4r = new C0U4R();
            c0u4r.LJII = C475510Ikn.LJ((LiveAISummaryFragment) c785780Us4.l0);
            c0u4r.LIZJ = "ttlive_AIsummary_toastReported";
            c0u4r.LIZLLL = 2131851027;
            c0u4r.LJFF = true;
            C766270U4b.LJIIJ(c0u4r);
        }
    }

    public static final void onClick$1(C785780Us4 c785780Us4, View view) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_appeal_click");
        c474500IjALIZ.LJIJJLI((DataChannel) c785780Us4.l0);
        c474500IjALIZ.LJJII("age", "appeal_type");
        c474500IjALIZ.LJJII("inapp", "source");
        c474500IjALIZ.LJJII("live", "enter_from");
        c474500IjALIZ.LIZ();
        C771830UPl c771830UPl = C771830UPl.LIZ;
        Context context = (Context) c785780Us4.l1;
        c771830UPl.getClass();
        String strLIZ = C771830UPl.LIZ();
        IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
        if (iActionHandlerService != null) {
            iActionHandlerService.handle(context, strLIZ);
        }
    }

    public static final void onClick$2(C785780Us4 c785780Us4, View view) {
        long jLJJLIIIJ;
        String str;
        SubmitLLMTitleFeedbackReq submitLLMTitleFeedbackReq = new SubmitLLMTitleFeedbackReq();
        LiveAISummaryDialogFragment liveAISummaryDialogFragment = (LiveAISummaryDialogFragment) c785780Us4.l0;
        List list = (List) c785780Us4.l1;
        DataChannel dataChannelLJ = C475510Ikn.LJ(liveAISummaryDialogFragment);
        if (dataChannelLJ != null) {
            jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannelLJ);
        } else {
            jLJJLIIIJ = 0;
        }
        submitLLMTitleFeedbackReq.roomId = jLJJLIIIJ;
        if (list != null && list.size() > 1) {
            if (list == null || (str = (String) ListProtector.get(list, 1)) == null) {
                str = "";
            }
            submitLLMTitleFeedbackReq.resultKey = str;
            submitLLMTitleFeedbackReq.like = 2;
            C480460Ism.LIZ().getClass();
            ((AISummaryApi) C480460Ism.LIZLLL(AISummaryApi.class)).aiSummaryFeedback(submitLLMTitleFeedbackReq).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJ();
            C0U4R c0u4r = new C0U4R();
            c0u4r.LJII = C475510Ikn.LJ((LiveAISummaryDialogFragment) c785780Us4.l0);
            c0u4r.LIZJ = "ttlive_AIsummary_toastReported";
            c0u4r.LIZLLL = 2131851027;
            c0u4r.LJFF = true;
            C766270U4b.LJIIJ(c0u4r);
        }
    }

    public static final void onClick$3(C785780Us4 c785780Us4, View view) {
        ((Function0) c785780Us4.l0).invoke();
    }

    public static final void onClick$4(C785780Us4 c785780Us4, View view) {
        ((C0TWI) c785780Us4.l0).LJIIL((Context) c785780Us4.l1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$5(C785780Us4 c785780Us4, View view) {
        C19GI c19gi = (C19GI) ((C259800zU) c785780Us4.l0).element;
        if (c19gi != null) {
            c19gi.dismiss();
            C785410UrT.LIZ(c19gi);
        }
        String value = GpppaGiftBanHelpCenterUrlSetting.INSTANCE.getValue();
        if (!TextUtils.isEmpty(value)) {
            try {
                Uri.Builder builderBuildUpon = UriProtector.parse(value).buildUpon();
                builderBuildUpon.appendQueryParameter("enter_from", "gift_appeal");
                value = builderBuildUpon.build().toString();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C501540Jlg.LIZJ(((BasePreviewSettingMainFragment) c785780Us4.l1).getContext(), e);
            }
            C781270Ukn.LIZ().handle(((BasePreviewSettingMainFragment) c785780Us4.l1).getContext(), value);
        }
        ((BasePreviewSettingMainFragment) c785780Us4.l1).iS("view_policy");
    }

    public static final void onClick$6(C785780Us4 c785780Us4, View view) {
        C746350TPl.LIZ.LJII().LJ(Boolean.TRUE);
        C786410Ut5.LJLLLLLL(8, (View) c785780Us4.l0);
        SmartRouter.buildRoute((Context) c785780Us4.l1, "aweme://privacy/setting").open();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("previous_page", "personal_favourite_page");
        C20684815ws.LJIILLIIL("enter_privacy_setting", c2344009Gk.LIZ);
    }

    public static final void onClick$7(C785780Us4 c785780Us4, View view) {
        C746350TPl.LIZ.LJII().LJ(Boolean.TRUE);
        C786410Ut5.LJLLLLLL(8, (View) c785780Us4.l0);
        SmartRouter.buildRoute((Context) c785780Us4.l1, "aweme://privacy/setting").open();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("previous_page", "personal_favourite_page");
        C20684815ws.LJIILLIIL("enter_privacy_setting", c2344009Gk.LIZ);
    }

    public static final void updateDrawState$3(C785780Us4 c785780Us4, TextPaint textPaint) {
        int color;
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        Integer num = (Integer) c785780Us4.l1;
        if (num != null) {
            color = num.intValue();
        } else {
            color = textPaint.getColor();
        }
        textPaint.setColor(color);
    }

    public static final void updateDrawState$4(C785780Us4 c785780Us4, TextPaint textPaint) {
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, (Context) c785780Us4.l1);
        if (numLIZJ != null) {
            textPaint.setColor(numLIZJ.intValue());
        }
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$5(C785780Us4 c785780Us4, TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(C497740JfY.LJFF(R.color.da));
    }

    public C785780Us4(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
