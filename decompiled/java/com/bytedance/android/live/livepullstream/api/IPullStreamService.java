package com.bytedance.android.live.livepullstream.api;

import X.C006A;
import X.C0IEB;
import X.C0IF5;
import X.C0IM1;
import X.C0IM2;
import X.C0IMA;
import X.C0UYH;
import X.C0UZJ;
import X.C1286680jaU;
import X.C19EG;
import X.C20856616jU;
import X.C464010IHn;
import X.C465130ILv;
import X.C480680It8;
import X.InterfaceC1502380pCO;
import X.InterfaceC1699460uKG;
import X.InterfaceC463820IGu;
import X.InterfaceC465170ILz;
import X.InterfaceC480510Isr;
import X.InterfaceC480570Isx;
import X.InterfaceC780290UjD;
import X.InterfaceC784360Upm;
import android.content.Context;
import com.bytedance.android.livesdk.chatroom.detail.RoomPlayer2;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public interface IPullStreamService extends C006A {
    String IG0();

    C1286680jaU JE();

    C465130ILv Qt1();

    void R92(String str);

    C0IEB SM0(C0IMA c0ima, String str, String str2, LiveMode liveMode, StreamUrlExtra.SrConfig srConfig, InterfaceC463820IGu interfaceC463820IGu, InterfaceC480570Isx interfaceC480570Isx, Context context, String str3, long j, boolean z);

    String Si2(C0IMA c0ima, Context context, String str, String str2, String str3, String str4, StreamUrlExtra.SrConfig srConfig, LiveMode liveMode, String str5, long j);

    int TJ1();

    InterfaceC1699460uKG Wr1();

    C0IM1 XZ0();

    InterfaceC480510Isr Xj1();

    C480680It8 YY();

    InterfaceC780290UjD ZC0();

    void bindSurface(C0IF5 c0if5, String str);

    C0IM1 bp1();

    void cy1(String str);

    C0IEB dv1(C0IMA c0ima, EnterRoomConfig enterRoomConfig, Context context);

    String fG2(C0IM2 c0im2);

    InterfaceC784360Upm fY1();

    JSONObject hj();

    C0IEB iB0(Context context, Room room);

    InterfaceC1502380pCO jA1();

    C0IEB na0(C0IMA c0ima, String str, LiveMode liveMode, StreamUrlExtra.SrConfig srConfig, InterfaceC463820IGu interfaceC463820IGu, C464010IHn c464010IHn, Context context, String str2, String str3, long j, boolean z);

    C0UZJ rC0();

    void sW1(InterfaceC465170ILz interfaceC465170ILz);

    RoomPlayer2 sh0(C0IMA c0ima, String str, String str2, LiveMode liveMode, StreamUrlExtra.SrConfig srConfig, C20856616jU c20856616jU, C0UYH c0uyh, C19EG c19eg, long j);

    void t11(String str);

    void v42();

    void zg1();
}
