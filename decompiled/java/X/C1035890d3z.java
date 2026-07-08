package X;

import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.metric.LogItem;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0d3z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1035890d3z implements Serializable {
    public Long clickTimeStamp;
    public Long enterWebViewTimeStamp;
    public Long exitWebViewTimeStamp;
    public boolean hasLoad;
    public boolean hasLoadFinishOrError;
    public boolean hitSSPDataWhenEnter;
    public boolean isHide;
    public boolean isInstantPage;
    public final List<LogItem> logList;
    public Runnable pendingClickRunnable;
    public float scrollPercent;
    public EnumC1039490d9n sessionType;
    public EnumC1037150d61 webViewVisible;

    public C1035890d3z() {
        this(false, false, false, false, EnumC1037150d61.VISIBLE, EnumC1039490d9n.DEFAULT_SESSION_START, Collections.synchronizedList(new ArrayList()), null, null, false, null, null);
    }

    public final C1035890d3z copy(boolean z, boolean z2, boolean z3, boolean z4, EnumC1037150d61 enumC1037150d61, EnumC1039490d9n enumC1039490d9n, List<LogItem> list, Long l, Long l2, boolean z5, Long l3, Runnable runnable) {
        return new C1035890d3z(z, z2, z3, z4, enumC1037150d61, enumC1039490d9n, list, l, l2, z5, l3, runnable);
    }

    public int hashCode() {
        int iZ2 = ((((((((((((C786410Ut5.Z2(this.hasLoad) * 31) + C786410Ut5.Z2(this.isHide)) * 31) + C786410Ut5.Z2(this.hasLoadFinishOrError)) * 31) + C786410Ut5.Z2(this.isInstantPage)) * 31) + this.webViewVisible.hashCode()) * 31) + this.sessionType.hashCode()) * 31) + this.logList.hashCode()) * 31;
        Long l = this.enterWebViewTimeStamp;
        int iHashCode = (iZ2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.exitWebViewTimeStamp;
        int iHashCode2 = (((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31) + C786410Ut5.Z2(this.hitSSPDataWhenEnter)) * 31;
        Long l3 = this.clickTimeStamp;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Runnable runnable = this.pendingClickRunnable;
        return iHashCode3 + (runnable != null ? runnable.hashCode() : 0);
    }

    public String toString() {
        return "AdWebCommonData(hasLoad=" + this.hasLoad + ", isHide=" + this.isHide + ", hasLoadFinishOrError=" + this.hasLoadFinishOrError + ", isInstantPage=" + this.isInstantPage + ", webViewVisible=" + this.webViewVisible + ", sessionType=" + this.sessionType + ", logList=" + this.logList + ", enterWebViewTimeStamp=" + this.enterWebViewTimeStamp + ", exitWebViewTimeStamp=" + this.exitWebViewTimeStamp + ", hitSSPDataWhenEnter=" + this.hitSSPDataWhenEnter + ", clickTimeStamp=" + this.clickTimeStamp + ", pendingClickRunnable=" + this.pendingClickRunnable + ')';
    }

    public final boolean isHide() {
        return this.isHide;
    }

    public final boolean isInstantPage() {
        return this.isInstantPage;
    }

    public final void setClickTimeStamp(Long l) {
        this.clickTimeStamp = l;
    }

    public final void setEnterWebViewTimeStamp(Long l) {
        this.enterWebViewTimeStamp = l;
    }

    public final void setExitWebViewTimeStamp(Long l) {
        this.exitWebViewTimeStamp = l;
    }

    public final void setHasLoad(boolean z) {
        this.hasLoad = z;
    }

    public final void setHasLoadFinishOrError(boolean z) {
        this.hasLoadFinishOrError = z;
    }

    public final void setHide(boolean z) {
        this.isHide = z;
    }

    public final void setHitSSPDataWhenEnter(boolean z) {
        this.hitSSPDataWhenEnter = z;
    }

    public final void setInstantPage(boolean z) {
        this.isInstantPage = z;
    }

    public final void setPendingClickRunnable(Runnable runnable) {
        this.pendingClickRunnable = runnable;
    }

    public final void setScrollPercent(float f) {
        if (Float.isNaN(f)) {
            return;
        }
        this.scrollPercent = ((float) Math.rint(f * r3)) / 100;
    }

    public final void setSessionType(EnumC1039490d9n enumC1039490d9n) {
        this.sessionType = enumC1039490d9n;
    }

    public final void setWebViewVisible(EnumC1037150d61 enumC1037150d61) {
        this.webViewVisible = enumC1037150d61;
    }

    public C1035890d3z(boolean z, boolean z2, boolean z3, boolean z4, EnumC1037150d61 enumC1037150d61, EnumC1039490d9n enumC1039490d9n, List<LogItem> list, Long l, Long l2, boolean z5, Long l3, Runnable runnable) {
        this.hasLoad = z;
        this.isHide = z2;
        this.hasLoadFinishOrError = z3;
        this.isInstantPage = z4;
        this.webViewVisible = enumC1037150d61;
        this.sessionType = enumC1039490d9n;
        this.logList = list;
        this.enterWebViewTimeStamp = l;
        this.exitWebViewTimeStamp = l2;
        this.hitSSPDataWhenEnter = z5;
        this.clickTimeStamp = l3;
        this.pendingClickRunnable = runnable;
        this.scrollPercent = -1.0f;
    }
}
