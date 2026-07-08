package Y;

import X.C09JN;
import X.C1587670rPx;
import X.C1587740rQ4;
import X.C1587810rQB;
import X.C1595550rcf;
import X.C1C7U;
import X.C703302op;
import X.C786410Ut5;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse;
import com.ss.android.ugc.aweme.story.homepage.StoryToolBarIconViewModel;
import kotlin.jvm.internal.AwS26S1400000_24;

/* JADX INFO: loaded from: classes25.dex */
public class AfS38S1300000_24 implements C09JN {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS38S1300000_24 afS38S1300000_24, Object obj) {
        C1C7U.LIZ("EmptyRetryManager@4752.refreshListByEmptyRetry$d$2");
        FriendsFeedResponse friendsFeedResponse = (FriendsFeedResponse) obj;
        int i = 0;
        ((C1587670rPx) afS38S1300000_24.l1).LIZIZ = false;
        ((C1587810rQB) afS38S1300000_24.l2).LJIIJ();
        Message messageObtainMessage = ((Handler) afS38S1300000_24.l3).obtainMessage(0);
        messageObtainMessage.obj = friendsFeedResponse;
        C786410Ut5.LJLJJLL((Handler) afS38S1300000_24.l3, messageObtainMessage);
        C1587740rQ4.LIZ.getClass();
        if (!C1587740rQ4.LJIJI) {
            if (friendsFeedResponse != null) {
                i = friendsFeedResponse.preload;
            }
            C1587740rQ4.LJIILL = i;
            C1587740rQ4.LJIILLIIL = C703302op.LIZ(afS38S1300000_24.s0);
            C1587740rQ4.LJ = SystemClock.elapsedRealtime();
        }
        C1C7U.LIZIZ("EmptyRetryManager@4752.refreshListByEmptyRetry$d$2");
    }

    public static final void accept$1(AfS38S1300000_24 afS38S1300000_24, Object obj) {
        C1C7U.LIZ("StoryToolBarIconViewModel@8781.drawAvatarBitmap$2");
        StoryToolBarIconViewModel storyToolBarIconViewModel = (StoryToolBarIconViewModel) afS38S1300000_24.l1;
        storyToolBarIconViewModel.setState(new AwS26S1400000_24(afS38S1300000_24.s0, (Bitmap) obj, (C1595550rcf) afS38S1300000_24.l2, storyToolBarIconViewModel, (C1595550rcf) afS38S1300000_24.l3, 5));
        C1C7U.LIZIZ("StoryToolBarIconViewModel@8781.drawAvatarBitmap$2");
    }

    public AfS38S1300000_24(Object obj, String str, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
        this.l3 = obj3;
    }
}
