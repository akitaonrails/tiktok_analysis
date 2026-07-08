package com.bytedance.android.live.poll;

import X.C0TDH;
import X.C11PQ;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* JADX INFO: loaded from: classes18.dex */
public abstract class ILiveNormalPollViewModel extends ViewModel implements OnMessageListener {
    public static final /* synthetic */ int LL = 0;

    public abstract boolean AQ2();

    public abstract void BQ2(int i);

    public abstract NextLiveData<PollMessage> vQ2();

    public abstract C11PQ<C0TDH> wQ2();

    public abstract void xQ2(Room room);

    public abstract boolean yQ2();

    public abstract boolean zQ2();
}
