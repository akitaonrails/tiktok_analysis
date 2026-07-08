package X;

import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import com.bytedance.android.livesdk.livesetting.watchlive.FirstScreenDebounceClickEnabledSetting;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.PinMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0ezb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1110050ezb extends C755410TkB {
    public final InterfaceC1110040eza LLIZLLLIL;
    public final InterfaceC1110040eza LLJ;

    @Override // X.C755410TkB, X.AbstractC1098790ehR
    public final void LIZIZ(View view) {
        InterfaceC1110040eza interfaceC1110040eza = this.LLJ;
        if (interfaceC1110040eza != null) {
            interfaceC1110040eza.LIZIZ();
        }
        InterfaceC1110040eza interfaceC1110040eza2 = this.LLIZLLLIL;
        if (interfaceC1110040eza2 != null) {
            interfaceC1110040eza2.LIZIZ();
            return;
        }
        Object tag = view.getTag(R.id.yuz);
        if (tag instanceof AbstractC1110800f0o) {
            AbstractC1110800f0o<? extends AbstractC1136060ffY> abstractC1110800f0o = (AbstractC1110800f0o) tag;
            if (abstractC1110800f0o.LJIILIIL != null && abstractC1110800f0o.LLIILII()) {
                C1111350f1h c1111350f1h = new C1111350f1h();
                c1111350f1h.LJFF = "comment";
                c1111350f1h.LIZ = "report_message";
                c1111350f1h.LIZIZ = "click";
                abstractC1110800f0o.LJIILIIL.LJII(abstractC1110800f0o, c1111350f1h);
                return;
            }
        }
        super.LIZIZ(view);
    }

    @Override // X.C755410TkB
    public final void LIZJ(View view, C1110530f0N c1110530f0N, ISendCommentEvent.Sender sender) {
        Object obj;
        Text text;
        PinMessage pinMessage;
        Map<String, String> logArgs = sender.getLogArgs();
        Object tag = view.getTag(R.id.yuz);
        if (tag instanceof AbstractC1110800f0o) {
            AbstractC1110800f0o abstractC1110800f0o = (AbstractC1110800f0o) tag;
            if (abstractC1110800f0o.LJIIZILJ.LIZIZ) {
                logArgs.put("reply_method", "pin");
                C1109020exw c1109020exw = abstractC1110800f0o.LJIIZILJ.LIZJ;
                if (c1109020exw != null && (pinMessage = c1109020exw.LJI) != null) {
                    logArgs.put("pin_msg_id", String.valueOf(pinMessage.getMessageId()));
                    logArgs.put("pin_id", String.valueOf(pinMessage.pinId));
                }
            } else if (abstractC1110800f0o.LLIILZL()) {
                logArgs.put("reply_method", "anchor");
            } else {
                logArgs.put("reply_method", "viewer");
            }
            c1110530f0N.LJIIL = abstractC1110800f0o.LJIL.getMessageId();
            c1110530f0N.LJIILIIL = abstractC1110800f0o.LJIJ.LIZ;
            obj = abstractC1110800f0o.LJIL;
            logArgs.put("reply_event_page", "click_msg");
        } else {
            obj = null;
        }
        if ((obj instanceof MemberMessage) && (text = ((MemberMessage) obj).anchorDisplayText) != null && "pm_mt_guidance_interaction".equals(text.key)) {
            HashMap map = new HashMap();
            map.put("event_type", "click");
            map.put("click_module", "message");
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_interact_notice");
            c474500IjALIZ.LJJIIZI(map);
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LIZ();
            c1110530f0N.LJII = "interact_guide";
        }
    }

    public C1110050ezb(User user, InterfaceC1110040eza interfaceC1110040eza, InterfaceC1110040eza interfaceC1110040eza2, boolean z) {
        boolean z2;
        super(user);
        if (!FirstScreenDebounceClickEnabledSetting.INSTANCE.getValue() && !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.LLILLL = z2;
        this.LLIZLLLIL = interfaceC1110040eza;
        this.LLJ = interfaceC1110040eza2;
    }

    public C1110050ezb(User user, int i, InterfaceC1110040eza interfaceC1110040eza, InterfaceC1110040eza interfaceC1110040eza2, boolean z) {
        boolean z2;
        super(i, user);
        if (!FirstScreenDebounceClickEnabledSetting.INSTANCE.getValue() && !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.LLILLL = z2;
        this.LLIZLLLIL = interfaceC1110040eza;
        this.LLJ = interfaceC1110040eza2;
    }
}
