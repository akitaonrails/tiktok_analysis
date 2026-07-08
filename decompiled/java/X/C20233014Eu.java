package X;

import android.content.Context;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import com.ss.android.ugc.aweme.tako.otherpage.share.vm.TakoShareVM;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14Eu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20233014Eu {
    public static final void LIZ(Context context, TakoShareVM takoShareVM) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (C14FR.LIZ.LJIILIIL()) {
            C665130Q7b.LIZ(C14TF.LIZIZ, context, "notification_page_tikbot", "click_share_message", jCurrentTimeMillis, null, null, null, null, "session_list_chat_sug", null, null, null, null, null, null, null, null, null, null, null, new AIBotInfo(0L, null, null, 0, 0, 0, null, null, false, false, false, null, null, null, null, null, null, null, false, null, null, null, null, 8388607, null), null, null, null, null, null, null, null, -67109904, 2047);
        } else if (Intrinsics.LJFF(C1852920yJm.LIZ.enable, Boolean.TRUE)) {
            C14TF.LIZIZ.LJJLIIIJJIZ(context, "message_history", "");
        } else {
            takoShareVM.setState(AFwS256S0000000_18.get$arr$(1024));
        }
    }
}
