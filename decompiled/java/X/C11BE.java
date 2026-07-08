package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.base.model.UrlModel;

/* JADX INFO: renamed from: X.11BE, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C11BE {
    public String LL = String.valueOf(SystemClock.elapsedRealtime());

    public abstract String getDesc();

    public abstract String getDetailUrl();

    public abstract String getDonateLink();

    public String getFundraiserGoalDesc() {
        return null;
    }

    public abstract String getFundraiserId();

    public String getFundraiserOwnerId() {
        return null;
    }

    public abstract UrlModel getIcon();

    public abstract String getName();

    public abstract Integer getNgoId();

    public abstract String getOrgId();

    public abstract String getOrgType();

    public String getAddTime() {
        return this.LL;
    }

    public void setAddTime(String str) {
        this.LL = str;
    }
}
