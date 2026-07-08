package X;

import android.app.Activity;

/* JADX INFO: renamed from: X.0XRj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public interface InterfaceC848770XRj {
    C15O7<Boolean> getSafeInfo();

    int getTwoStepVerificationStatusFromLocal();

    C15O7<Boolean> getTwoStepVerificationStatusFromNetwork();

    void handlePushChallengeInfo(String str, String str2);

    void openTwoStepVerificationManageActivity(Activity activity, String str);
}
