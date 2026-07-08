package X;

import X.C1582310rHJ;
import X.C21673919s1;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3FeedRequestConfig;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ui.FriendsV3LoadingFooterCell;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0rHC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1582240rHC extends ViewOnAttachStateChangeListenerC20604515jv {
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public InterfaceC1582250rHD LLILZLL;
    public C20603715jn LLIZ;

    private final FriendsV3FeedRequestConfig getFeedsRequestConfig() {
        return (FriendsV3FeedRequestConfig) this.LLILZ.getValue();
    }

    private final boolean getReachBottomTrackingEnabled() {
        return ((Boolean) this.LLILZIL.getValue()).booleanValue();
    }

    public final C20603715jn getCurrentConfig() {
        C20603715jn c20603715jn = this.LLIZ;
        return c20603715jn == null ? getDefaultConfig() : c20603715jn;
    }

    public final C20603715jn getDefaultConfig() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZ = getFeedsRequestConfig().loadMorePrefetchOffset;
        c20603715jn.LIZIZ = 0;
        c20603715jn.LIZJ = false;
        c20603715jn.LIZLLL = getReachBottomTrackingEnabled() ? FriendsV3LoadingFooterCell.class : LoadingFooterCell.class;
        c20603715jn.LJIIIZ = "friends_feed_v3";
        return c20603715jn;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void scrollToPosition(int i) {
        InterfaceC1582250rHD interfaceC1582250rHD = this.LLILZLL;
        if (interfaceC1582250rHD != null) {
            interfaceC1582250rHD.LIZ();
        }
        super.scrollToPosition(i);
        InterfaceC1582250rHD interfaceC1582250rHD2 = this.LLILZLL;
        if (interfaceC1582250rHD2 != null) {
            interfaceC1582250rHD2.LIZIZ();
        }
    }

    @Override // X.ViewOnAttachStateChangeListenerC20604515jv
    public void setListConfig(C20603715jn c20603715jn) {
        super.setListConfig(c20603715jn);
        this.LLIZ = c20603715jn;
    }

    public final void setOnFakeScrollListener(InterfaceC1582250rHD interfaceC1582250rHD) {
        if (((Number) C278530Avr.LIZ.getValue()).intValue() == 1) {
            this.LLILZLL = interfaceC1582250rHD;
        }
    }

    public final void setPreloadCount(int i) {
        C20603715jn defaultConfig = this.LLIZ;
        if (defaultConfig != null) {
            if (i == defaultConfig.LIZ) {
                return;
            }
        } else {
            defaultConfig = getDefaultConfig();
        }
        defaultConfig.LIZ = i;
        setListConfig(defaultConfig);
    }

    public final void setPreloadPrevCount(int i) {
        C20603715jn defaultConfig = this.LLIZ;
        if (defaultConfig != null) {
            if (i == defaultConfig.LIZIZ) {
                return;
            }
        } else {
            defaultConfig = getDefaultConfig();
        }
        defaultConfig.LIZIZ = i;
        setListConfig(defaultConfig);
    }

    public C1582240rHC(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i, int i2) {
        if (C1582310rHJ.LIZIZ().enableStrategy) {
            return super.fling(C1582310rHJ.LIZ(i), C1582310rHJ.LIZ(i2));
        }
        return super.fling((int) (i * 0.76f), (int) (i2 * 0.76f));
    }

    public C1582240rHC(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(183));
        this.LLILZIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(184));
        setLayoutManager(new LinearLayoutManager(context) { // from class: com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ui.FriendsV3PowerList$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public final void calculateExtraLayoutSpace(C21673919s1 c21673919s1, int[] iArr) {
                super.calculateExtraLayoutSpace(c21673919s1, iArr);
                if (C1582310rHJ.LIZIZ().extraLayoutSpaceFactor > 0.0f && getHeight() > 0) {
                    iArr[0] = (int) (getHeight() * C1582310rHJ.LIZIZ().extraLayoutSpaceFactor);
                    iArr[1] = (int) (getHeight() * C1582310rHJ.LIZIZ().extraLayoutSpaceFactor);
                }
            }
        });
        C2271391DvN.LIZ(this, (C1A5L) C2271381DvM.L.getValue());
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
