package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.email.EmailPopUpFragment;

/* JADX INFO: renamed from: X.0iK6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1238080iK6 {
    public static EmailPopUpFragment LIZ(C19EG c19eg, int i, boolean z, boolean z2, C20656615sK c20656615sK) {
        EmailPopUpFragment emailPopUpFragment = new EmailPopUpFragment(c19eg, i, z, z2, c20656615sK);
        Bundle bundle = new Bundle();
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    bundle.putInt("current_scene", EnumC852660Xce.BIND_EMAIL_FROM_PROFILE.getValue());
                }
            } else {
                bundle.putInt("current_scene", EnumC852660Xce.BIND_EMAIL_FROM_INBOX.getValue());
            }
        } else {
            bundle.putInt("current_scene", EnumC852660Xce.BIND_EMAIL_FROM_FEED.getValue());
        }
        emailPopUpFragment.setArguments(bundle);
        return emailPopUpFragment;
    }
}
