package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.common.BaseShareContext;

/* JADX INFO: renamed from: X.0mbq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1402840mbq extends BaseShareContext {
    public Boolean isFromNewShareSdk() {
        return Boolean.valueOf("TikTok-Open-Android-SDK-Share".equals(this.mSdkName));
    }

    public String getSdkNameForServer() {
        return isFromNewShareSdk().booleanValue() ? "tiktok_sdk_share" : "";
    }

    public C1402840mbq(Bundle bundle) {
        super(bundle);
    }
}
