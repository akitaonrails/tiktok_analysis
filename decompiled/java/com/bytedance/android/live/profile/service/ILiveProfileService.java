package com.bytedance.android.live.profile.service;

import X.C006A;
import X.C0JGA;
import X.C489040JFu;
import X.C495920Jcc;
import X.EnumC495860JcW;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.profile.ui.LiveProfileSheet;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.usercard.TryModeLiveProfileDialog;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public interface ILiveProfileService extends C006A {
    TryModeLiveProfileDialog HG1(long j, User user);

    C489040JFu Lj2(C495920Jcc c495920Jcc, User user);

    void OI(BaseFragment baseFragment, FollowPair followPair);

    Map<EnumC495860JcW, List<C0JGA<?>>> PG();

    void hd2(Context context, BaseFragment baseFragment, DataChannel dataChannel, boolean z, LifecycleOwner lifecycleOwner);

    void nA2(BaseFragment baseFragment);

    <T> void nN0(EnumC495860JcW enumC495860JcW, C0JGA<T> c0jga);

    LiveProfileSheet rP(Context context, DataChannel dataChannel, boolean z, Room room, User user, long j, UserProfileEvent userProfileEvent);

    void sq2(BaseFragment baseFragment, User user, Room room, boolean z);

    void tf1();
}
