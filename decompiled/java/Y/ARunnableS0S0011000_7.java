package Y;

import X.C1C7U;
import X.C468770IZv;
import X.C477110InN;
import X.C784440Upu;
import com.bytedance.android.feed.api.TopLiveSkylightEntranceEvent;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* JADX INFO: loaded from: classes8.dex */
public class ARunnableS0S0011000_7 implements Runnable {
    public final int $t;
    public int i1;
    public boolean z0;

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

    public static final void run$0(ARunnableS0S0011000_7 aRunnableS0S0011000_7) {
        int i = aRunnableS0S0011000_7.i1;
        boolean z = aRunnableS0S0011000_7.z0;
        C1C7U.LIZ("AbsAudienceInteractionFragment@61ad.playWatchLaterAddedAnimation$1L");
        if (i == 1 && z) {
            DataChannelGlobal.LLILZ.FQ2(TopLiveSkylightEntranceEvent.class, new C477110InN(true, "watch_later_guide", "watch_later_guide", true));
            C784440Upu.LIZ().LIZIZ(new C468770IZv());
        }
        C1C7U.LIZIZ("AbsAudienceInteractionFragment@61ad.playWatchLaterAddedAnimation$1L");
    }

    public static final void run$1(ARunnableS0S0011000_7 aRunnableS0S0011000_7) {
        int i = aRunnableS0S0011000_7.i1;
        boolean z = aRunnableS0S0011000_7.z0;
        C1C7U.LIZ("ToolbarShareBehavior@28ff.playWatchLaterAddedAnimation$1L");
        if (i == 1 && z) {
            DataChannelGlobal.LLILZ.FQ2(TopLiveSkylightEntranceEvent.class, new C477110InN(true, "watch_later_guide", "watch_later_guide", true));
            C784440Upu.LIZ().LIZIZ(new C468770IZv());
        }
        C1C7U.LIZIZ("ToolbarShareBehavior@28ff.playWatchLaterAddedAnimation$1L");
    }

    public ARunnableS0S0011000_7(int i, boolean z, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.z0 = z;
    }
}
