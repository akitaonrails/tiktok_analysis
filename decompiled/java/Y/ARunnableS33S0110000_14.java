package Y;

import X.AbstractC855890Xhr;
import X.C1390380mHk;
import X.C19727912Gn;
import X.C1C7U;
import X.C856790XjJ;
import android.app.Activity;
import com.ss.android.ugc.aweme.inbox.v2.InboxFragmentV2;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: loaded from: classes15.dex */
public class ARunnableS33S0110000_14 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS33S0110000_14 aRunnableS33S0110000_14) {
        boolean zLIZ;
        C19727912Gn c19727912GnNS;
        C1C7U.LIZ("InboxFragmentV2@d7b5.statusUpdateCallback$1$1");
        try {
            C19727912Gn c19727912GnNS2 = ((InboxFragmentV2) aRunnableS33S0110000_14.l0).nS();
            if (c19727912GnNS2 != null && c19727912GnNS2.getParent() != null && ((c19727912GnNS = ((InboxFragmentV2) aRunnableS33S0110000_14.l0).nS()) == null || c19727912GnNS.LLJ != aRunnableS33S0110000_14.z1)) {
                ((InboxFragmentV2) aRunnableS33S0110000_14.l0).rS();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InboxFragmentV2@d7b5.statusUpdateCallback$1$1");
    }

    public static final void run$1(ARunnableS33S0110000_14 aRunnableS33S0110000_14) {
        boolean zLIZ;
        C1C7U.LIZ("BasePublishAudioCopyrightController@1db7.checkNeedShowProcessEndToast$1");
        try {
            AbstractC855890Xhr abstractC855890Xhr = (AbstractC855890Xhr) aRunnableS33S0110000_14.l0;
            Activity activity = abstractC855890Xhr.LJ;
            VideoPublishEditModel videoPublishEditModelLIZJ = abstractC855890Xhr.LIZJ();
            if (aRunnableS33S0110000_14.z1) {
                C856790XjJ.LIZ.getClass();
                C856790XjJ.LIZLLL(videoPublishEditModelLIZJ, "sound_copyright_complete_toast_show", null);
            }
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.isCenterToast(true);
            creativeToastBuilder.messageRes(2131837695);
            creativeToastBuilder.duration(2000L);
            C1390380mHk.LIZ(activity, 3012, creativeToastBuilder);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BasePublishAudioCopyrightController@1db7.checkNeedShowProcessEndToast$1");
    }

    public ARunnableS33S0110000_14(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
