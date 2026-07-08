package com.appsflyer.deeplink;

import X.C08FF;
import X.C786410Ut5;
import com.appsflyer.AFLogger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public class DeepLinkResult {
    public final DeepLink deepLink;
    public final Error error;
    public final Status status;

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("deepLink", this.deepLink);
            jSONObject.put("error", this.error);
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, this.status);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            AFLogger.afErrorLogForExcManagerOnly("error while creating deep link json", e);
        }
        return C786410Ut5.J3(jSONObject);
    }

    public DeepLink getDeepLink() {
        return this.deepLink;
    }

    public Error getError() {
        return this.error;
    }

    public Status getStatus() {
        return this.status;
    }

    public enum Error {
        TIMEOUT,
        NETWORK,
        HTTP_STATUS_CODE,
        UNEXPECTED,
        DEVELOPER_ERROR;

        public static Error valueOf(String str) {
            return (Error) C08FF.LIZ(Error.class, str);
        }
    }

    public enum Status {
        FOUND,
        NOT_FOUND,
        ERROR;

        public static Status valueOf(String str) {
            return (Status) C08FF.LIZ(Status.class, str);
        }
    }

    public DeepLinkResult(DeepLink deepLink, Error error) {
        this.deepLink = deepLink;
        this.error = error;
        if (error != null) {
            this.status = Status.ERROR;
        } else if (deepLink != null) {
            this.status = Status.FOUND;
        } else {
            this.status = Status.NOT_FOUND;
        }
    }
}
