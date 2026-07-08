package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: X.0czE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public interface InterfaceC1032940czE {
    void didExit(C1033020czM c1033020czM);

    void distributeRewards();

    void onRewardAdDataReady();

    void onRewardAdPause(Integer num);

    void onRewardAdResume(Integer num);

    void onRewardAdShow(Integer num);

    void onRewardCountdownFinished();

    void skipRewardAdWatchDuration(int i);

    void updateBubbleTip(String str);

    void videoPlayStateDidChange(EnumC1031610cx5 enumC1031610cx5, int i);

    void viewDidLoad(ViewGroup viewGroup, Fragment fragment);

    void willExit(Context context);
}
