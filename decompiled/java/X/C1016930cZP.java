package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0cZP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1016930cZP implements Serializable {
    public UrlModel avatarUri;
    public boolean isEnterpriseVerified;
    public String nickname;

    public C1016930cZP() {
        this(false, null, null);
    }

    public int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.isEnterpriseVerified) * 31;
        String str = this.nickname;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        UrlModel urlModel = this.avatarUri;
        return iHashCode + (urlModel != null ? urlModel.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdLpBottomModel(isEnterpriseVerified=");
        sbLIZ.append(this.isEnterpriseVerified);
        sbLIZ.append(", nickname=");
        sbLIZ.append(this.nickname);
        sbLIZ.append(", avatarUri=");
        sbLIZ.append(this.avatarUri);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isEnterpriseVerified() {
        return this.isEnterpriseVerified;
    }

    public final void setAvatarUri(UrlModel urlModel) {
        this.avatarUri = urlModel;
    }

    public final void setEnterpriseVerified(boolean z) {
        this.isEnterpriseVerified = z;
    }

    public final void setNickname(String str) {
        this.nickname = str;
    }

    public C1016930cZP(boolean z, String str, UrlModel urlModel) {
        this.isEnterpriseVerified = z;
        this.nickname = str;
        this.avatarUri = urlModel;
    }
}
