package X;

import android.app.Activity;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentTypeComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.reply.MessageReplyVM;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.LongPressViewModel;
import com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS223S0300000_14;
import kotlin.jvm.internal.AwS380S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.AwS628S0100000_14;
import kotlin.jvm.internal.AwS98S1200000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZKu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C898020ZKu implements C0ZQI {
    public final SessionInfo LIZ;
    public final MessageReplyVM LIZIZ;
    public final Function1<C869590Y9l, Unit> LIZJ;
    public final Function2<C869590Y9l, SessionInfo, Unit> LIZLLL;
    public final Function2<C869590Y9l, Activity, Unit> LJ;
    public final LongPressViewModel LJFF;
    public final PanelStateViewModel LJI;
    public final Function2<C0ZL0, Function0<Unit>, Unit> LJII;
    public final Function0<Unit> LJIIIIZZ;
    public final Function1<C869590Y9l, Map<String, String>> LJIIIZ;

    @Override // X.C0ZQI
    public final C1562980qm8<C0ZL0> LIZ(C869590Y9l c869590Y9l) {
        return C1558650qf9.LIZIZ("Forward", C0ZL0.FORWARD, Integer.valueOf(R.raw.icon_arrow_turn_up_right), 2131835808, false, new AwS380S0200000_14(c869590Y9l, this, 108), 48);
    }

    @Override // X.C0ZQI
    public final boolean LIZJ(C869590Y9l c869590Y9l) {
        AttachmentTypeComponent attachmentTypeComponent;
        if (!C0ZDX.LJIILLIIL(c869590Y9l) && !C0ZDX.LJIILL(c869590Y9l)) {
            return true;
        }
        if (!C896070ZDh.LIZJ(c869590Y9l, EnumC898050ZKx.FORWARD)) {
            return false;
        }
        BaseContent orParseJsonContent = BaseContentParserKt.getOrParseJsonContent(c869590Y9l, BaseContent.class);
        if (orParseJsonContent != null) {
            Integer referenceScene = orParseJsonContent.getReferenceScene();
            int iOrdinal = BaseContent.ReferenceSceneType.QUOTED_PREVIEW.ordinal();
            if (referenceScene == null || referenceScene.intValue() != iOrdinal) {
                Integer referenceScene2 = orParseJsonContent.getReferenceScene();
                int iOrdinal2 = BaseContent.ReferenceSceneType.SHARE_COMMENT.ordinal();
                if (referenceScene2 == null || referenceScene2.intValue() != iOrdinal2) {
                    return false;
                }
            }
            return true;
        }
        BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
        if (baseTemplateLIZ != null) {
            AttachmentComponent attachmentComponentHs = baseTemplateLIZ.Hs();
            if (attachmentComponentHs != null) {
                attachmentTypeComponent = attachmentComponentHs.type;
            } else {
                attachmentTypeComponent = null;
            }
            if (attachmentTypeComponent != AttachmentTypeComponent.ATTACHMENT_TYPE_SHARE_COMMENT_MENTION) {
                baseTemplateLIZ.Hs();
                return false;
            }
        }
        return false;
    }

    @Override // X.C0ZQI
    public final boolean LJFF(C869590Y9l c869590Y9l) {
        if (C0ZDX.LJJJJIZL(c869590Y9l)) {
            if (c869590Y9l.getMsgType() == EnumC868450Y5b.MsgTypeTemplateDynamicCard.getValue()) {
                if (!Intrinsics.LJFF(c869590Y9l.getScene(), "ci_share_feed_summary") && !Intrinsics.LJFF(c869590Y9l.getScene(), "ci_share_feed_group_summary")) {
                    return false;
                }
            } else {
                return false;
            }
        }
        if (this.LJFF.getState().LL == C0ZL4.FULL && C896070ZDh.LIZJ(c869590Y9l, EnumC898050ZKx.REPORT)) {
            return true;
        }
        return false;
    }

    @Override // X.C0ZQI
    public final boolean LJI(C869590Y9l c869590Y9l) {
        int msgStatus;
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(this.LIZ.getConversationId());
        if (c0y8tLIZ != null && C882340YjQ.LJI(c0y8tLIZ)) {
            return false;
        }
        try {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LJ("im_message_reply_enable", 1) == 2) {
                return c869590Y9l.isSuccessStatus();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (C896070ZDh.LIZJ(c869590Y9l, EnumC898050ZKx.REPLY) && (msgStatus = c869590Y9l.getMsgStatus()) != 0 && msgStatus != 1 && msgStatus != 3) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    @Override // X.C0ZQI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C1562980qm8<X.C0ZL0>> LJIIIIZZ(X.C869590Y9l r14) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C898020ZKu.LJIIIIZZ(X.0Y9l):java.util.List");
    }

    @Override // X.C0ZQI
    public final C1562980qm8<C0ZL0> LJIIIZ(C869590Y9l c869590Y9l) {
        C0I0B.LJFF.LIZIZ();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, "long_press_message");
        C20684815ws.LJIILLIIL("tns_report_entrance_show", c2344009Gk.LIZ);
        return C1558650qf9.LIZJ("Report", C0ZL0.REPORT, R.raw.icon_flag, R.string.s65, new AwS380S0200000_14(c869590Y9l, this, 107));
    }

    @Override // X.C0ZQI
    public final boolean LJIIJ(C869590Y9l c869590Y9l) {
        return C896070ZDh.LIZJ(c869590Y9l, EnumC898050ZKx.DELETE);
    }

    @Override // X.C0ZQI
    public final boolean LJIIJJI(C869590Y9l c869590Y9l) {
        String conversationId = c869590Y9l.getConversationId();
        if (conversationId == null) {
            conversationId = "";
        }
        if (!C898030ZKv.LIZ()) {
            return false;
        }
        IMAIServiceAPI.LIZ.getClass();
        if (!AnonymousClass0629.LIZ().LIZ().LJIL(conversationId) && C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_im_normal_chatroom_select_text", true) != 1) {
            return false;
        }
        return true;
    }

    @Override // X.C0ZQI
    public final C1562980qm8<C0ZL0> LJIIL(C869590Y9l c869590Y9l) {
        return C1558650qf9.LIZIZ("Reply", C0ZL0.REPLY, Integer.valueOf(R.raw.icon_arrow_turn_up_left), 2131835778, false, new AwS380S0200000_14(c869590Y9l, this, 106), 48);
    }

    @Override // X.C0ZQI
    public final List<C1562980qm8<C0ZL0>> LIZIZ(C869590Y9l c869590Y9l, boolean z) {
        String str;
        int i;
        String str2;
        int i2;
        ArrayList arrayList = new ArrayList();
        if (LJI(c869590Y9l)) {
            arrayList.add(LJIIL(c869590Y9l));
        }
        if (LIZJ(c869590Y9l) && z) {
            arrayList.add(LIZ(c869590Y9l));
        }
        if (LJIIJ(c869590Y9l)) {
            arrayList.addAll(LJIIIIZZ(c869590Y9l));
        }
        if (LJFF(c869590Y9l)) {
            arrayList.add(LJIIIZ(c869590Y9l));
        }
        IMAIServiceAPI.LIZ.getClass();
        if (AnonymousClass0629.LIZ().LIZ().LJIJ(c869590Y9l)) {
            boolean zLJ = AnonymousClass0629.LIZ().LIZ().LJ(c869590Y9l);
            if (zLJ) {
                str = "ai_positive_reverse";
            } else {
                str = "ai_positive";
            }
            C0ZL0 c0zl0 = C0ZL0.LIKE;
            if (zLJ) {
                i = R.raw.icon_thumbs_up_fill;
            } else {
                i = R.raw.icon_thumbs_up;
            }
            arrayList.add(C1558650qf9.LIZIZ(str, c0zl0, Integer.valueOf(i), 2131846303, false, new AwS98S1200000_14(c869590Y9l, this, str, 17), 48));
            boolean zLJI = AnonymousClass0629.LIZ().LIZ().LJI(c869590Y9l);
            if (zLJI) {
                str2 = "ai_negative_reverse";
            } else {
                str2 = "ai_negative";
            }
            C0ZL0 c0zl02 = C0ZL0.DISLIKE;
            if (zLJI) {
                i2 = R.raw.icon_thumbs_down_fill;
            } else {
                i2 = R.raw.icon_thumbs_down;
            }
            arrayList.add(C1558650qf9.LIZIZ(str2, c0zl02, Integer.valueOf(i2), 2131846302, true, new AwS98S1200000_14(c869590Y9l, this, str2, 16), 16));
        }
        return arrayList;
    }

    @Override // X.C0ZQI
    public final C1562980qm8<C0ZL0> LIZLLL(C869590Y9l c869590Y9l, Function0<Unit> function0) {
        if (LJIIJJI(c869590Y9l)) {
            return C1558650qf9.LIZIZ("Select text", C0ZL0.SELECT_TEXT, Integer.valueOf(R.raw.icon_select_text), 2131848529, false, new AwS223S0300000_14(c869590Y9l, (C869590Y9l) this, (C898020ZKu) function0, (Function0<Unit>) 23), 48);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Select text is disabled for conversation ");
        sbLIZ.append(c869590Y9l.getConversationId());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }

    @Override // X.C0ZQI
    public final void LJ(C0ZL0 c0zl0, Function0<Unit> function0) {
        this.LJII.invoke(c0zl0, function0);
    }

    @Override // X.C0ZQI
    public final void LJII(C869590Y9l c869590Y9l, String str) {
        boolean z;
        String str2;
        Map mapLIZJ;
        String strLJIIIIZZ;
        if (this.LIZ.getChatType() == 3) {
            z = true;
        } else {
            z = false;
        }
        Map<String, String> mapInvoke = this.LJIIIZ.invoke(c869590Y9l);
        if (!C461220I6u.LIZIZ(c869590Y9l)) {
            mapLIZJ = C2097608Jq.LJ();
        } else {
            if (C461220I6u.LIZIZ(c869590Y9l) && (C901130ZWt.LIZIZ.LJIILIIL(c869590Y9l.getUuid()) instanceof C0ZLV)) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            mapLIZJ = C2097908Jt.LIZJ(new Pair("text_translated", str2));
        }
        Map mapLJIIL = C2097608Jq.LJIIL(mapInvoke, mapLIZJ);
        IIMMessageAnalytics iIMMessageAnalytics = (IIMMessageAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMMessageAnalytics.class);
        if (iIMMessageAnalytics != null) {
            strLJIIIIZZ = iIMMessageAnalytics.LJIIIIZZ(c869590Y9l);
        } else {
            strLJIIIIZZ = null;
        }
        C893570Z3r.LIZIZ(c869590Y9l, z, str, mapLJIIL, strLJIIIIZZ);
    }

    public C898020ZKu(SessionInfo sessionInfo, MessageReplyVM messageReplyVM, AwS593S0100000_14 awS593S0100000_14, AwS628S0100000_14 awS628S0100000_14, AwS616S0100000_2 awS616S0100000_2, LongPressViewModel longPressViewModel, PanelStateViewModel panelStateViewModel, AwS628S0100000_14 awS628S0100000_142, AwS558S0100000_14 awS558S0100000_14, C889260Yua c889260Yua) {
        this.LIZ = sessionInfo;
        this.LIZIZ = messageReplyVM;
        this.LIZJ = awS593S0100000_14;
        this.LIZLLL = awS628S0100000_14;
        this.LJ = awS616S0100000_2;
        this.LJFF = longPressViewModel;
        this.LJI = panelStateViewModel;
        this.LJII = awS628S0100000_142;
        this.LJIIIIZZ = awS558S0100000_14;
        this.LJIIIZ = c889260Yua;
    }
}
