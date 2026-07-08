package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.userservice.UserService;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0a7v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C923010a7v {
    public static final <T, S> int LIZ(InterfaceC923020a7w<T, S> interfaceC923020a7w) {
        return interfaceC923020a7w.LIZ().size() - 1;
    }

    public static final boolean LIZLLL(InterfaceC923020a7w<LinkListUser, LinkMessage> interfaceC923020a7w) {
        for (LinkListUser linkListUser : interfaceC923020a7w.LIZ()) {
            User user = linkListUser.user;
            if (user != null && user.getId() == UserService.getInstance().user().getCurrentUserId()) {
                if (linkListUser != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public static final LinkListUser LIZIZ(InterfaceC923020a7w<LinkListUser, LinkMessage> interfaceC923020a7w, long j) {
        LinkListUser next;
        Iterator<LinkListUser> it2 = interfaceC923020a7w.LIZ().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                User user = next.user;
                if (user != null && user.getId() == j) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    public static final LinkListUser LIZJ(InterfaceC923020a7w<LinkListUser, LinkMessage> interfaceC923020a7w, String str) {
        LinkListUser linkListUser = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator<LinkListUser> it2 = interfaceC923020a7w.LIZIZ().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            LinkListUser next = it2.next();
            if (TextUtils.equals(next.linkMicId, str)) {
                linkListUser = next;
                break;
            }
        }
        return linkListUser;
    }
}
