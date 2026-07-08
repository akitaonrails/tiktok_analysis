package Y;

import X.C0Y60;
import X.C127K;
import X.C1390380mHk;
import X.C19GS;
import X.C1C7U;
import X.C859340XnQ;
import X.C867450Y1f;
import X.C885760Yow;
import X.EnumC1216830hlp;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public class ARunnableS19S1100000_14 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        Context context = ((ProfileEditFragment) this.l1).getContext();
        if (context == null) {
            return;
        }
        if (TextUtils.isEmpty(this.s0)) {
            ProfileEditFragment profileEditFragment = (ProfileEditFragment) this.l1;
            C127K c127k = profileEditFragment.LLLFZ;
            profileEditFragment.pT(c127k != null ? c127k : null, context.getString(2131833269), false);
        } else {
            ProfileEditFragment profileEditFragment2 = (ProfileEditFragment) this.l1;
            C127K c127k2 = profileEditFragment2.LLLFZ;
            profileEditFragment2.pT(c127k2 != null ? c127k2 : null, this.s0, true);
        }
        Function1 function1 = (Function1) ((LinkedHashMap) ((ProfileEditFragment) this.l1).LLLLIILL).get(Integer.valueOf(EnumC1216830hlp.YOUTUBE.getType()));
        if (function1 != null) {
            function1.invoke(this.s0);
        }
        ((ProfileEditFragment) this.l1).UR(false);
    }

    public static final void run$0(ARunnableS19S1100000_14 aRunnableS19S1100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("DefaultConversationListModel@a5c5.removeConversation$1");
        try {
            ((ConcurrentHashMap) ((C0Y60) aRunnableS19S1100000_14.l1).LIZ).remove(aRunnableS19S1100000_14.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DefaultConversationListModel@a5c5.removeConversation$1");
    }

    public static final void run$1(ARunnableS19S1100000_14 aRunnableS19S1100000_14) {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aRunnableS19S1100000_14.l1;
        String str = aRunnableS19S1100000_14.s0;
        videoPublishContainerScene.getClass();
        C1C7U.LIZ("VideoPublishContainerScene@d2f3.notifySaveDraftSuccess$1L");
        C19GS c19gs = videoPublishContainerScene.LLLLLLZZ;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.isCenterToast(C859340XnQ.LIZIZ());
        creativeToastBuilder.message(str);
        creativeToastBuilder.acrossActivities(true);
        C1390380mHk.LIZ(c19gs, 2009, creativeToastBuilder);
        C1C7U.LIZIZ("VideoPublishContainerScene@d2f3.notifySaveDraftSuccess$1L");
    }

    public static final void run$2(ARunnableS19S1100000_14 aRunnableS19S1100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("MessageRequestBatchActionHandler@3f1f.fakeLoadingFinish$1");
        try {
            ((C885760Yow) aRunnableS19S1100000_14.l1).LIZ.Ka(aRunnableS19S1100000_14.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MessageRequestBatchActionHandler@3f1f.fakeLoadingFinish$1");
    }

    public static final void run$3(ARunnableS19S1100000_14 aRunnableS19S1100000_14) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileEditFragment@18c.bindYoutube$1");
        try {
            aRunnableS19S1100000_14.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileEditFragment@18c.bindYoutube$1");
    }

    public static final void run$4(ARunnableS19S1100000_14 aRunnableS19S1100000_14) {
        C867450Y1f c867450Y1f = (C867450Y1f) aRunnableS19S1100000_14.l1;
        String str = aRunnableS19S1100000_14.s0;
        c867450Y1f.getClass();
        C1C7U.LIZ("GetConversationInfoHandler@b454.get$1L");
        c867450Y1f.LJIILJJIL(str);
        C1C7U.LIZIZ("GetConversationInfoHandler@b454.get$1L");
    }

    public ARunnableS19S1100000_14(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
