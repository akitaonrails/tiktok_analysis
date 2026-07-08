package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.AiAgentConfig;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0d3k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1035740d3k implements Serializable {
    public AiAgentConfig aiAgentConfig;
    public UrlModel authorAvatar;
    public String awemeAuthorUid;
    public String awemeId;
    public Integer clickFrom;
    public String commerceEnterFrom;
    public String containerId;
    public boolean disableImmersionBar;
    public boolean forbidJump;
    public boolean forceShowNavBar;
    public boolean fromTransparentStatusBarPage;
    public boolean isFromJsb;
    public int landpageShowType;
    public String refer;
    public String reportAdExtraData;
    public String requestId;
    public String source;
    public String title;
    public String url;
    public int useWebUrl;

    public final boolean isFromJsb() {
        return this.isFromJsb;
    }

    public final void setAiAgentConfig(AiAgentConfig aiAgentConfig) {
        this.aiAgentConfig = aiAgentConfig;
    }

    public final void setAuthorAvatar(UrlModel urlModel) {
        this.authorAvatar = urlModel;
    }

    public final void setAwemeAuthorUid(String str) {
        this.awemeAuthorUid = str;
    }

    public final void setAwemeId(String str) {
        this.awemeId = str;
    }

    public final void setClickFrom(Integer num) {
        this.clickFrom = num;
    }

    public final void setCommerceEnterFrom(String str) {
        this.commerceEnterFrom = str;
    }

    public final void setContainerId(String str) {
        this.containerId = str;
    }

    public final void setDisableImmersionBar(boolean z) {
        this.disableImmersionBar = z;
    }

    public final void setForbidJump(boolean z) {
        this.forbidJump = z;
    }

    public final void setForceShowNavBar(boolean z) {
        this.forceShowNavBar = z;
    }

    public final void setFromJsb(boolean z) {
        this.isFromJsb = z;
    }

    public final void setFromTransparentStatusBarPage(boolean z) {
        this.fromTransparentStatusBarPage = z;
    }

    public final void setLandpageShowType(int i) {
        this.landpageShowType = i;
    }

    public final void setRefer(String str) {
        this.refer = str;
    }

    public final void setReportAdExtraData(String str) {
        this.reportAdExtraData = str;
    }

    public final void setRequestId(String str) {
        this.requestId = str;
    }

    public final void setSource(String str) {
        this.source = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void setUseWebUrl(int i) {
        this.useWebUrl = i;
    }

    public C1035740d3k(String str, int i, String str2, String str3, String str4, boolean z, String str5, boolean z2, int i2, String str6, boolean z3, boolean z4, String str7, String str8, String str9, UrlModel urlModel, boolean z5, String str10, AiAgentConfig aiAgentConfig, Integer num) {
        this.url = str;
        this.useWebUrl = i;
        this.title = str2;
        this.commerceEnterFrom = str3;
        this.refer = str4;
        this.forbidJump = z;
        this.source = str5;
        this.isFromJsb = z2;
        this.landpageShowType = i2;
        this.containerId = str6;
        this.forceShowNavBar = z3;
        this.fromTransparentStatusBarPage = z4;
        this.awemeId = str7;
        this.awemeAuthorUid = str8;
        this.requestId = str9;
        this.authorAvatar = urlModel;
        this.disableImmersionBar = z5;
        this.reportAdExtraData = str10;
        this.aiAgentConfig = aiAgentConfig;
        this.clickFrom = num;
    }
}
