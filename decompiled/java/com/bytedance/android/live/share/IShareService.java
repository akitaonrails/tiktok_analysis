package com.bytedance.android.live.share;

import X.C006A;
import X.C1106110etF;
import X.C1106210etP;
import X.C11NZ;
import X.C19EG;
import X.C481250Iu3;
import X.C781050UkR;
import X.InterfaceC1372610lp5;
import X.InterfaceC481210Itz;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.share.LiveShareDialog;
import com.bytedance.android.livesdk.share.LiveShareWidget;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface IShareService extends C006A {
    LiveShareWidget A30();

    boolean I21(Room room);

    C1106110etF K72(C19EG c19eg, Context context, LiveMode liveMode, LifecycleOwner lifecycleOwner);

    C481250Iu3 Xg0();

    List fK2(LiveMode liveMode, Room room, DataChannel dataChannel);

    void hy1(FragmentManager fragmentManager);

    void jR0(Activity activity, C1106210etP c1106210etP, InterfaceC1372610lp5 interfaceC1372610lp5);

    C11NZ ky(String str, long j, String str2, String str3);

    InterfaceC481210Itz mh();

    LiveShareDialog t71(C1106210etP c1106210etP, InterfaceC1372610lp5 interfaceC1372610lp5);

    C781050UkR uJ2();

    boolean vH2(Room room);
}
