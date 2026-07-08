package X;

import android.app.Activity;
import android.app.Dialog;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.keva.Keva;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feedback.reply.NewestReply;
import com.ss.android.ugc.aweme.feedback.reply.ReplyInfo;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zNd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@InterfaceC20647615qs("feedback_replay_dialog")
public final class C1893750zNd extends AbstractC20660215su<Dialog> {
    public final Activity LLILZIL;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 225;
    }

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        LifecycleOwner lifecycleOwnerLIZIZ = C0SY5.LIZIZ(this.LLILZIL);
        if (lifecycleOwnerLIZIZ != null) {
            return new C688120Qyw(this.LLILZIL, lifecycleOwnerLIZIZ, null);
        }
        return null;
    }

    @Override // X.C11VC
    public final void LJIIIIZZ() {
        NewestReply newestReply;
        ReplyInfo replyInfo;
        boolean zLJI = MethodIDManager.LJI(202367);
        if (C1061440djC.LIZ == null) {
            C1061440djC.LIZ = Keva.getRepo("HasFeedbackKeva");
        }
        Keva keva = C1061440djC.LIZ;
        if (keva != null && keva.getBoolean("has", false)) {
            InterfaceC1891220zJY interfaceC1891220zJY = C1891210zJX.LIZ;
            boolean zLJI2 = MethodIDManager.LJI(137753);
            try {
                newestReply = C1891210zJX.LIZ.LIZ().execute().LIZIZ;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                newestReply = new NewestReply("", 0, null);
            }
            if (zLJI2) {
                MethodIDManager.LJ();
            }
            if (newestReply.errCode == 0 && (replyInfo = newestReply.replyInfo) != null && Intrinsics.LJFF(replyInfo.hasReply, Boolean.TRUE) && C1893760zNe.LIZ(C2214201BlK.LJFF(), false) && C826810Wc3.LIZ() > 0) {
                C11VB.LIZ(this, true);
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
        }
        C11VB.LIZ(this, false);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public C1893750zNd(C19EG c19eg) {
        this.LLILZIL = c19eg;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("uid", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        C20684815ws.LJIILLIIL("feedback_reply_alert", c2344009Gk.LIZ);
        C1397580mTM c1397580mTM = new C1397580mTM(c688120Qyw.LIZ);
        c1397580mTM.LIZ(2131836167);
        C985403tE.LIZ(c1397580mTM, new AwS607S0100000_28(this, 69));
        return new C1397510mTF(c1397580mTM).LJ();
    }
}
