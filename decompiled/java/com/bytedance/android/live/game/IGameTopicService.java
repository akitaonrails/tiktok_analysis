package com.bytedance.android.live.game;

import X.C006A;
import X.C754750Tj7;
import X.EnumC754690Tj1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: loaded from: classes13.dex */
public interface IGameTopicService extends C006A {
    void Jm0(String str);

    void ZE2(Fragment fragment, DataChannel dataChannel);

    GameTag fB(LiveMode liveMode);

    void lk1(FragmentManager fragmentManager, C754750Tj7 c754750Tj7, EnumC754690Tj1 enumC754690Tj1, LiveMode liveMode);

    Integer md2(GameTag gameTag);

    Hashtag s62(LiveMode liveMode);

    GameTag y61(DataChannel dataChannel, Fragment fragment, long j);
}
