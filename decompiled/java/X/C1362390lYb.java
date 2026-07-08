package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;

/* JADX INFO: renamed from: X.0lYb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1362390lYb {
    public static EnumC1362480lYk LIZ(IMContact iMContact, boolean z, C429270GsP c429270GsP) {
        if (!(iMContact instanceof IMConversation) && !(iMContact instanceof IMUser)) {
            return EnumC1362480lYk.NONE;
        }
        if (z) {
            return EnumC1362480lYk.SELECTED;
        }
        if (c429270GsP != null && C429290GsR.LIZ(c429270GsP)) {
            return EnumC1362480lYk.SHOW_ACTIVE;
        }
        return EnumC1362480lYk.NONE;
    }
}
