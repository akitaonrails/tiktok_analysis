package com.android.installreferrer.api;

import android.content.Context;

/* JADX INFO: loaded from: classes29.dex */
public abstract class InstallReferrerClient {

    public static final class Builder {
        public final Context mContext;

        public Builder(Context context) {
            this.mContext = context;
        }

        public InstallReferrerClient build() {
            Context context = this.mContext;
            if (context != null) {
                return new InstallReferrerClientImpl(context);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
    }

    public abstract void endConnection();

    public abstract ReferrerDetails getInstallReferrer();

    public abstract boolean isReady();

    public abstract void startConnection(InstallReferrerStateListener installReferrerStateListener);

    public static Builder newBuilder(Context context) {
        return new Builder(context);
    }
}
