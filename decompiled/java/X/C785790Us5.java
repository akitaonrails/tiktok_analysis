package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.broadcast.model.CreateInfoPerceptionMessage;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.roomfunction.GpppaGiftBanHelpCenterUrlSetting;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.experiments.DigitalWellbeingEntranceSettings;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0Us5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C785790Us5 extends ClickableSpan {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    public static final void updateDrawState$0(C785790Us5 c785790Us5, TextPaint textPaint) {
    }

    public static final void updateDrawState$1(C785790Us5 c785790Us5, TextPaint textPaint) {
    }

    public static final void updateDrawState$2(C785790Us5 c785790Us5, TextPaint textPaint) {
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
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public static final void onClick$0(C785790Us5 c785790Us5, View view) {
        Context context = (Context) c785790Us5.l0;
        String str = ((C771740UPc) c785790Us5.l1).LIZJ;
        if (C500260Jjc.LJJIIZ(str)) {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, str);
        }
        DataChannel dataChannel = (DataChannel) c785790Us5.l2;
        if (dataChannel != null) {
            C771740UPc c771740UPc = (C771740UPc) c785790Us5.l1;
            C0UQX.LJIJI(dataChannel, c771740UPc.LIZLLL, c771740UPc.LJ, c771740UPc.LJFF, c771740UPc.LJI);
        }
    }

    public static final void onClick$1(C785790Us5 c785790Us5, View view) {
        Context context = (Context) c785790Us5.l0;
        String str = ((CreateInfoPerceptionMessage) c785790Us5.l1).detailUrl;
        if (C500260Jjc.LJJIIZ(str)) {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, str);
        }
        PunishEventInfo punishEventInfo = ((CreateInfoPerceptionMessage) c785790Us5.l1).punishInfo;
        if (punishEventInfo != null) {
            C0UQX.LJIJI((DataChannel) c785790Us5.l2, punishEventInfo.punishId, punishEventInfo.punishType, punishEventInfo.punishReason, Long.valueOf(punishEventInfo.violationUid));
        }
    }

    public static final void onClick$2(C785790Us5 c785790Us5, View view) {
        String str;
        Context context = (Context) c785790Us5.l0;
        DataChannel dataChannel = (DataChannel) c785790Us5.l1;
        C0UOK c0uok = (C0UOK) c785790Us5.l2;
        RoomCreateInfo roomCreateInfo = (RoomCreateInfo) dataChannel.gg0(RoomCreateInfoChannel.class);
        if (roomCreateInfo != null) {
            str = roomCreateInfo.blockDetailUrl;
        } else {
            str = null;
        }
        AwS591S0100000_12 awS591S0100000_12 = new AwS591S0100000_12(context, 28);
        c0uok.getClass();
        C0UX0.LIZ(c0uok.LIZIZ, context, str, "toast", new AwS378S0200000_12(c0uok, awS591S0100000_12, 72));
        DataChannel dataChannel2 = (DataChannel) c785790Us5.l1;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_appeal_click");
        c474500IjALIZ.LJIJJLI(dataChannel2);
        c474500IjALIZ.LJJII("toast", "enter_from");
        c474500IjALIZ.LJJII("general", "appeal_type");
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$3(C785790Us5 c785790Us5, View view) {
        C19GI c19gi = (C19GI) ((C259800zU) c785790Us5.l1).element;
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
                C501540Jlg.LIZJ((Context) c785790Us5.l0, e);
            }
            C781270Ukn.LIZ().handle((Context) c785790Us5.l0, value);
        }
        ((BasePreviewSettingMainFragmentSheetInitializer) c785790Us5.l2).LJJIJIL("view_policy");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$4(C785790Us5 c785790Us5, View view) {
        ((C20515215Pi) ((C259800zU) c785790Us5.l0).element).LIZIZ();
        SmartRouter.buildRoute((C19EG) c785790Us5.l1, new C0XI4(DigitalWellbeingEntranceSettings.LIZ("aweme://lynxview_popup/?channel=fe_tns_content_safety_lynx&bundle=audience_control_profile_popup/template.js&dynamic=1&hide_nav_bar=false&should_full_screen=0&dynamic=1&use_spark=1&self_adaptive_height=1&transition_animation=bottom&wait_gecko_update=1&mask_bg_color=00000080&show_mask=1")).LJFF()).open();
    }

    public static final void updateDrawState$3(C785790Us5 c785790Us5, TextPaint textPaint) {
        Integer numLIZJ;
        textPaint.setUnderlineText(false);
        Context context = (Context) c785790Us5.l0;
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.ewy, context)) != null) {
            textPaint.setColor(numLIZJ.intValue());
        }
    }

    public static final void updateDrawState$4(C785790Us5 c785790Us5, TextPaint textPaint) {
        Integer numLIZJ;
        C19EG c19egLIZIZ = ((C688120Qyw) c785790Us5.l2).LIZIZ();
        if (c19egLIZIZ != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.ob, c19egLIZIZ)) != null) {
            textPaint.setColor(numLIZJ.intValue());
        }
    }

    public C785790Us5(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
