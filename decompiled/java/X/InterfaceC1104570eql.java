package X;

import com.bytedance.android.livesdk.goody_bag.model.GoodyBagBaseInfo;
import com.bytedance.android.livesdk.model.message.GoodyBagMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import webcast.api.goody_bag.GetRoomGoodyBagResponse;

/* JADX INFO: renamed from: X.0eql, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public interface InterfaceC1104570eql {
    GoodyBagBaseInfo LIZ();

    GoodyBagMessage LIZIZ();

    void LIZJ();

    void LIZLLL(GetRoomGoodyBagResponse.ResponseData responseData);

    void LJ(DataChannel dataChannel, InterfaceC1104610eqp interfaceC1104610eqp);

    boolean isAnchor();

    void onPause();

    void onResume();
}
