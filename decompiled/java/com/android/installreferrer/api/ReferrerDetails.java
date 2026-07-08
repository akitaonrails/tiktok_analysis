package com.android.installreferrer.api;

import android.os.Bundle;

/* JADX INFO: loaded from: classes29.dex */
public class ReferrerDetails {
    public final Bundle mOriginalBundle;

    public ReferrerDetails(Bundle bundle) {
        this.mOriginalBundle = bundle;
    }

    public boolean getGooglePlayInstantParam() {
        return this.mOriginalBundle.getBoolean("google_play_instant");
    }

    public long getInstallBeginTimestampSeconds() {
        return this.mOriginalBundle.getLong("install_begin_timestamp_seconds");
    }

    public long getInstallBeginTimestampServerSeconds() {
        return this.mOriginalBundle.getLong("install_begin_timestamp_server_seconds");
    }

    public String getInstallReferrer() {
        return this.mOriginalBundle.getString("install_referrer");
    }

    public String getInstallVersion() {
        return this.mOriginalBundle.getString("install_version");
    }

    public long getReferrerClickTimestampSeconds() {
        return this.mOriginalBundle.getLong("referrer_click_timestamp_seconds");
    }

    public long getReferrerClickTimestampServerSeconds() {
        return this.mOriginalBundle.getLong("referrer_click_timestamp_server_seconds");
    }
}
