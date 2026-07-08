package X;

import android.text.TextPaint;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.event.UserProfileEvent;

/* JADX INFO: renamed from: X.0ezZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1110030ezZ extends AbstractC1098790ehR {
    public final int LLILZIL;
    public final User LLILZLL;

    @Override // X.AbstractC431510Gw1
    public final void LIZ() {
    }

    public void LIZJ(View view, UserProfileEvent userProfileEvent) {
    }

    @Override // X.AbstractC1098790ehR
    public void LIZIZ(View view) {
        User user;
        if (view != null && (user = this.LLILZLL) != null) {
            if (user.getUserRole() == 0 && this.LLILZLL.getId() == 0) {
                return;
            }
            UserProfileEvent userProfileEvent = new UserProfileEvent(this.LLILZLL.getId(), "user_msg");
            userProfileEvent.setEnigmaOutside(this.LLILZLL.enigmaInfo);
            userProfileEvent.mReportType = "report_user";
            userProfileEvent.mSource = "live_comment";
            userProfileEvent.mShowEntrance = "comment_area";
            LIZJ(view, userProfileEvent);
            C784440Upu.LIZ().LIZIZ(userProfileEvent);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(this.LLILZIL);
    }

    public C1110030ezZ(int i, User user) {
        this.LLILZLL = user;
        this.LLILZIL = i;
        this.LLILLL = false;
    }
}
