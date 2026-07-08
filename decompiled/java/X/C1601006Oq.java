package X;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.jvm.internal.AwS211S0300000_2;

/* JADX INFO: renamed from: X.06Oq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1601006Oq {
    public static final C1601006Oq LIZ = new C1601006Oq();

    public static CharSequence LIZ(Activity activity, IMUser iMUser, SessionInfo sessionInfo) {
        String nickName;
        if (iMUser == null || (nickName = iMUser.getNickName()) == null) {
            nickName = "";
        }
        C0I0B.LJFF.LIZJ();
        Context contextLIZ = C894660Z7w.LIZ();
        String string = contextLIZ.getString(2131835948);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(new SpannableStringBuilder(contextLIZ.getString(2131835947, nickName, string)));
        C1697806kq.LIZJ(spannableStringBuilder, string, 42, new AwS211S0300000_2(sessionInfo, activity, iMUser, 30));
        return spannableStringBuilder;
    }
}
