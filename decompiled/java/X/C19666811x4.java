package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.11x4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19666811x4 {
    public static final C19666811x4 LIZ = new C19666811x4();
    public static String LIZIZ;

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPublishLanding(C09XF c09xf) {
        Keva repo = Keva.getRepo("onboarding_card_action_keva");
        String string = repo.getString("key_pending_publish_creation_id", null);
        if (string != null && Intrinsics.LJFF(c09xf.LIZ, string)) {
            repo.storeString("key_posted_toast_conversation_id", LIZIZ);
            LIZIZ = null;
            C15580068c.LIZ.getClass();
            C15580068c.LIZIZ(this);
            return;
        }
        LIZIZ = null;
        C15580068c.LIZ.getClass();
        C15580068c.LIZIZ(this);
    }
}
