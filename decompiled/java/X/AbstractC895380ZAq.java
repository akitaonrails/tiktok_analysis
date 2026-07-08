package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZAq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC895380ZAq implements InterfaceC1891350zJl, InterfaceC887560Yrq, InterfaceC895400ZAs, InterfaceC1890700zIi {
    public static final int $stable = 8;
    public int LL = -1;
    public boolean isDefaultPod;
    public boolean isLoading;
    public final int type;

    public abstract C890610Ywl convertToInboxEntranceWrapper$awemenotice_release();

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public long getLastNoticeTime$awemenotice_release() {
        return 0L;
    }

    public abstract boolean isUnread();

    public int getPriority$awemenotice_release() {
        int i = this.type;
        if (i == 0) {
            return 100;
        }
        if (i == 1) {
            return DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        }
        if (i == 205) {
            return 201;
        }
        switch (i) {
            case BdTuring.TYPE_ECAF /* 9 */:
                return 600;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return 540;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return 538;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return 539;
            default:
                switch (i) {
                    case 200:
                        return 550;
                    case 201:
                        return 549;
                    case 202:
                        return 548;
                    default:
                        return 0;
                }
        }
    }

    public int hashCode() {
        return this.type + C786410Ut5.Z2(isUnread());
    }

    @Override // X.InterfaceC895400ZAs
    public boolean getHasUnReadCountInInbox() {
        return isUnread();
    }

    public int getStoryStatusForInbox() {
        return this.LL;
    }

    public final int getType() {
        return this.type;
    }

    public final boolean isDefaultPod() {
        return this.isDefaultPod;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public AbstractC895380ZAq(int i) {
        this.type = i;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return isSameItem(interfaceC1891350zJl);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC895380ZAq)) {
            return false;
        }
        AbstractC895380ZAq abstractC895380ZAq = (AbstractC895380ZAq) obj;
        if (abstractC895380ZAq.type == this.type && abstractC895380ZAq.isUnread() == isUnread() && abstractC895380ZAq.isLoading == this.isLoading) {
            return true;
        }
        return false;
    }

    public boolean isSameItem(Object obj) {
        if ((obj instanceof AbstractC895380ZAq) && this.type == ((AbstractC895380ZAq) obj).type) {
            return true;
        }
        return false;
    }

    public final void setDefaultPod(boolean z) {
        this.isDefaultPod = z;
    }

    public final void setLoading(boolean z) {
        this.isLoading = z;
    }

    public void setStoryStatusForInbox(int i) {
        this.LL = i;
    }
}
