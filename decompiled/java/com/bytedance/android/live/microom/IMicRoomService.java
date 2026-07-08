package com.bytedance.android.live.microom;

import X.C006A;
import android.content.Context;
import com.bytedance.android.livesdk.microom.LiveMicRoomInfoDialog;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public interface IMicRoomService extends C006A {
    Class<? extends LiveRecyclableWidget> D11();

    boolean On1();

    Class<? extends LiveRecyclableWidget> Pl0();

    int Sw2(Room room);

    boolean TM(Room room);

    Class<? extends LiveRecyclableWidget> Uo2();

    boolean Ve2(Room room);

    LiveMicRoomInfoDialog a61(Context context, boolean z, long j, Room room);

    void aa2(long j, Long l, boolean z, boolean z2);

    int eO0();

    String getEnterFromMerge();

    String getEnterMethod();

    Map<String, String> getRoomInfo();

    boolean n42(Room room);

    Class<? extends LiveRecyclableWidget> pf2();

    boolean t42();

    boolean tp1();

    Class<? extends LiveRecyclableWidget> u42();

    boolean zS();
}
