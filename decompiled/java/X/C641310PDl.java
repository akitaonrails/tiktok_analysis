package X;

import Y.ARunnableS17S0201000_10;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.inbox.StoryInboxItem;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PDl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C641310PDl {
    public static void LIZ(String str, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        String uid;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            AbstractC21673719rz itemAnimator = viewOnAttachStateChangeListenerC20604515jv.getItemAnimator();
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
            int i = 0;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                C20600815jK<InterfaceC1891350zJl> state = viewOnAttachStateChangeListenerC20604515jv.getState();
                if (state != null) {
                    Iterator it2 = ((ArrayList) state.LJII()).iterator();
                    i = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) it2.next();
                            if (interfaceC1891350zJl instanceof StoryInboxItem) {
                                User user = ((StoryInboxItem) interfaceC1891350zJl).getUser();
                                if (user != null) {
                                    uid = user.getUid();
                                } else {
                                    uid = null;
                                }
                                if (Intrinsics.LJFF(uid, str)) {
                                    break;
                                }
                            }
                            i++;
                        } else {
                            i = -1;
                            break;
                        }
                    }
                }
                HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv, new ARunnableS17S0201000_10(i, viewOnAttachStateChangeListenerC20604515jv, itemAnimator, 7));
            }
        }
    }
}
