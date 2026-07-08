package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.IABLoadingFormatModel;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0cYU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1016360cYU implements Serializable {
    public UrlModel authorAvatar;
    public String destructionTiming;
    public IABLoadingFormatModel iabLoadingFormatModel;
    public Integer landingFormatType;
    public int loadingFormatCdnResourceExist;
    public Long loadingFormatDestructionDuration;
    public String loadingFormatStatus;
    public long loadingFormatStuckDuration;
    public long loadingFormatStuckStartTime;
    public Long renderingDuration;
    public boolean shouldAddLoadingFormatView;
    public int showScreenShotLoading;

    public C1016360cYU() {
        this(null, false, null, null, null, null, null, null, 0, 0, 0L, 0L);
    }

    public int hashCode() {
        String str = this.loadingFormatStatus;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.shouldAddLoadingFormatView)) * 31;
        Integer num = this.landingFormatType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.destructionTiming;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.renderingDuration;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.loadingFormatDestructionDuration;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        IABLoadingFormatModel iABLoadingFormatModel = this.iabLoadingFormatModel;
        int iHashCode6 = (iHashCode5 + (iABLoadingFormatModel == null ? 0 : iABLoadingFormatModel.hashCode())) * 31;
        UrlModel urlModel = this.authorAvatar;
        return ((((((((iHashCode6 + (urlModel != null ? urlModel.hashCode() : 0)) * 31) + this.showScreenShotLoading) * 31) + this.loadingFormatCdnResourceExist) * 31) + C786410Ut5.Y2(this.loadingFormatStuckStartTime)) * 31) + C786410Ut5.Y2(this.loadingFormatStuckDuration);
    }

    public String toString() {
        return "AdWebLoadingFormatModel(loadingFormatStatus=" + this.loadingFormatStatus + ", shouldAddLoadingFormatView=" + this.shouldAddLoadingFormatView + ", landingFormatType=" + this.landingFormatType + ", destructionTiming=" + this.destructionTiming + ", renderingDuration=" + this.renderingDuration + ", loadingFormatDestructionDuration=" + this.loadingFormatDestructionDuration + ", iabLoadingFormatModel=" + this.iabLoadingFormatModel + ", authorAvatar=" + this.authorAvatar + ", showScreenShotLoading=" + this.showScreenShotLoading + ", loadingFormatCdnResourceExist=" + this.loadingFormatCdnResourceExist + ", loadingFormatStuckStartTime=" + this.loadingFormatStuckStartTime + ", loadingFormatStuckDuration=" + this.loadingFormatStuckDuration + ')';
    }

    public final Long getLFDestructionDuration() {
        return this.loadingFormatDestructionDuration;
    }

    public final Long getLFRenderingDuration() {
        return this.renderingDuration;
    }

    public final void setAuthorAvatar(UrlModel urlModel) {
        this.authorAvatar = urlModel;
    }

    public final void setDestructionTiming(String str) {
        this.destructionTiming = str;
    }

    public final void setIabLoadingFormatModel(IABLoadingFormatModel iABLoadingFormatModel) {
        this.iabLoadingFormatModel = iABLoadingFormatModel;
    }

    public final void setLandingFormatType(Integer num) {
        this.landingFormatType = num;
    }

    public final void setLoadingFormatCdnResourceExist(int i) {
        this.loadingFormatCdnResourceExist = i;
    }

    public final void setLoadingFormatDestructionDuration(Long l) {
        this.loadingFormatDestructionDuration = l;
    }

    public final void setLoadingFormatStatus(String str) {
        this.loadingFormatStatus = str;
    }

    public final void setLoadingFormatStuckDuration(long j) {
        this.loadingFormatStuckDuration = j;
    }

    public final void setLoadingFormatStuckStartTime(long j) {
        this.loadingFormatStuckStartTime = j;
    }

    public final void setRenderingDuration(Long l) {
        this.renderingDuration = l;
    }

    public final void setShouldAddLoadingFormatView(boolean z) {
        this.shouldAddLoadingFormatView = z;
    }

    public final void setShowScreenShotLoading(int i) {
        this.showScreenShotLoading = i;
    }

    public C1016360cYU(String str, boolean z, Integer num, String str2, Long l, Long l2, IABLoadingFormatModel iABLoadingFormatModel, UrlModel urlModel, int i, int i2, long j, long j2) {
        this.loadingFormatStatus = str;
        this.shouldAddLoadingFormatView = z;
        this.landingFormatType = num;
        this.destructionTiming = str2;
        this.renderingDuration = l;
        this.loadingFormatDestructionDuration = l2;
        this.iabLoadingFormatModel = iABLoadingFormatModel;
        this.authorAvatar = urlModel;
        this.showScreenShotLoading = i;
        this.loadingFormatCdnResourceExist = i2;
        this.loadingFormatStuckStartTime = j;
        this.loadingFormatStuckDuration = j2;
    }
}
