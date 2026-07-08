package Y;

import X.C0ILD;
import X.C1C7U;
import X.C20441214yg;
import X.C786410Ut5;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveNewAudienceEndFragmentV2;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public class ARunnableS16S0400000_7 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        String strNR;
        if (((LiveNewAudienceEndFragmentV2) this.l3).isAdded() && ((LiveNewAudienceEndFragmentV2) this.l3).getView() != null) {
            LiveNewAudienceEndFragmentV2 liveNewAudienceEndFragmentV2 = (LiveNewAudienceEndFragmentV2) this.l3;
            if (liveNewAudienceEndFragmentV2.LLLI == null) {
                try {
                    strNR = liveNewAudienceEndFragmentV2.NR(((C0ILD) this.l0).LIZ.booleanValue());
                    C20441214yg.LIZIZ("endPageSchema", strNR);
                } finally {
                    try {
                    } catch (Throwable th) {
                    }
                }
                if (TextUtils.isEmpty(strNR)) {
                    C786410Ut5.LJLZ(8, ((LiveNewAudienceEndFragmentV2) this.l3).LLLFZ);
                    ((LiveNewAudienceEndFragmentV2) this.l3).LLLII = false;
                    return;
                }
                LiveNewAudienceEndFragmentV2 liveNewAudienceEndFragmentV22 = (LiveNewAudienceEndFragmentV2) this.l3;
                liveNewAudienceEndFragmentV22.LLLI = ((IHybridContainerService) this.l1).DU1((Context) this.l2, strNR, liveNewAudienceEndFragmentV22.getViewLifecycleOwner(), true, null);
                C786410Ut5.LJJJJI(((LiveNewAudienceEndFragmentV2) this.l3).LLLFZ);
                LiveNewAudienceEndFragmentV2 liveNewAudienceEndFragmentV23 = (LiveNewAudienceEndFragmentV2) this.l3;
                liveNewAudienceEndFragmentV23.LLLFZ.addView(liveNewAudienceEndFragmentV23.LLLI, new ViewGroup.LayoutParams(-1, -2));
                ((LiveNewAudienceEndFragmentV2) this.l3).LLLII = false;
                return;
            }
        }
        ((LiveNewAudienceEndFragmentV2) this.l3).LLLII = false;
    }

    public static final void run$0(ARunnableS16S0400000_7 aRunnableS16S0400000_7) {
        boolean zLIZ;
        C1C7U.LIZ("LiveNewAudienceEndFragmentV2@97bd.initEndPageLynxIfNeed$1");
        try {
            aRunnableS16S0400000_7.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveNewAudienceEndFragmentV2@97bd.initEndPageLynxIfNeed$1");
    }

    public static final void run$1(ARunnableS16S0400000_7 aRunnableS16S0400000_7) {
        boolean zLIZ;
        NextLiveData nextLiveData;
        C1C7U.LIZ("DataChannel@9cba.observe$1$1");
        try {
            DataChannel dataChannel = (DataChannel) aRunnableS16S0400000_7.l0;
            LifecycleOwner lifecycleOwner = (LifecycleOwner) aRunnableS16S0400000_7.l1;
            Class cls = (Class) aRunnableS16S0400000_7.l2;
            Function1 function1 = (Function1) aRunnableS16S0400000_7.l3;
            if (lifecycleOwner != null) {
                NextLiveData nextLiveData2 = (NextLiveData) dataChannel.vQ2(cls);
                if (nextLiveData2 != null) {
                    nextLiveData2.observe(lifecycleOwner, function1, false);
                }
            } else {
                LifecycleOwner lifecycleOwner2 = dataChannel.LLILZ;
                if (lifecycleOwner2 != null && (nextLiveData = (NextLiveData) dataChannel.vQ2(cls)) != null) {
                    nextLiveData.observe(lifecycleOwner2, function1, false);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DataChannel@9cba.observe$1$1");
    }

    public static final void run$2(ARunnableS16S0400000_7 aRunnableS16S0400000_7) {
        boolean zLIZ;
        NextLiveData nextLiveData;
        C1C7U.LIZ("DataChannel@9cba.observeSticky$1$1");
        try {
            DataChannel dataChannel = (DataChannel) aRunnableS16S0400000_7.l0;
            LifecycleOwner lifecycleOwner = (LifecycleOwner) aRunnableS16S0400000_7.l1;
            Class cls = (Class) aRunnableS16S0400000_7.l2;
            Function1 function1 = (Function1) aRunnableS16S0400000_7.l3;
            if (lifecycleOwner != null) {
                NextLiveData nextLiveData2 = (NextLiveData) dataChannel.vQ2(cls);
                if (nextLiveData2 != null) {
                    nextLiveData2.observe(lifecycleOwner, function1, true);
                }
            } else {
                LifecycleOwner lifecycleOwner2 = dataChannel.LLILZ;
                if (lifecycleOwner2 != null && (nextLiveData = (NextLiveData) dataChannel.vQ2(cls)) != null) {
                    nextLiveData.observe(lifecycleOwner2, function1, true);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DataChannel@9cba.observeSticky$1$1");
    }

    public ARunnableS16S0400000_7(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l3 = obj;
        this.l0 = obj2;
        this.l1 = obj3;
        this.l2 = obj4;
    }
}
