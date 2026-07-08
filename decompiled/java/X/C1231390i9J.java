package X;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: renamed from: X.0i9J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1231390i9J {
    public final Activity LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final void LIZ() {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("im_group_invite_id", this.LIZIZ, bundle);
        C786410Ut5.LJJJI("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION", bundle);
        C786410Ut5.LJJJI("key_group_invite_url", this.LIZJ, bundle);
        C1230680i8A c1230680i8A = InterfaceC1230510i7t.LIZ;
        String str = this.LIZIZ;
        c1230680i8A.getClass();
        if (str != null) {
            C1230680i8A.LIZIZ.add(str);
        }
        C1336205Ku.LIZ(false).getImChatService().LJIIL(this.LIZ, bundle, false, 67108864);
    }

    public C1231390i9J(Activity activity, String str, String str2) {
        this.LIZ = activity;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
