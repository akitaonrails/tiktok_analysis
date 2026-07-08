package X;

import android.text.TextPaint;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;

/* JADX INFO: renamed from: X.0TkB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C755410TkB extends AbstractC1098790ehR {
    public final int LLILZIL;
    public final User LLILZLL;
    public final boolean LLIZ;

    @Override // X.AbstractC431510Gw1
    public final void LIZ() {
    }

    public void LIZJ(View view, C1110530f0N c1110530f0N, ISendCommentEvent.Sender sender) {
        throw null;
    }

    public C755410TkB(User user) {
        this.LLILZLL = user;
        this.LLILZIL = -1;
        this.LLILLL = false;
    }

    @Override // X.AbstractC1098790ehR
    public void LIZIZ(View view) {
        User user = this.LLILZLL;
        if (user == null) {
            return;
        }
        C1110530f0N c1110530f0N = new C1110530f0N(1, C0KVU.LIZ(user), "positive_reply", false);
        c1110530f0N.LJIIIZ = "message";
        ISendCommentEvent.Sender sender = ISendCommentEvent.Sender.REPLY;
        sender.getLogArgs().clear();
        c1110530f0N.LJIIJ = sender;
        c1110530f0N.LIZLLL = this.LLILZLL;
        LIZJ(view, c1110530f0N, sender);
        C784440Upu.LIZ().LIZIZ(c1110530f0N);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        if (this.LLIZ) {
            textPaint.setColor(this.LLILZIL);
        }
    }

    public C755410TkB(int i, User user) {
        boolean z;
        this.LLILZLL = user;
        this.LLILZIL = i;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LLIZ = z;
        this.LLILLL = false;
    }
}
