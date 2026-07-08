package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.gift.model.LiveCoinConsumptionInput;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0g2d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public interface InterfaceC1150370g2d {
    Room LIZ();

    void LIZIZ(LiveCoinConsumptionInput liveCoinConsumptionInput);

    void LIZJ(LiveCoinConsumptionInput liveCoinConsumptionInput, C1150700g3A c1150700g3A);

    void LIZLLL(LiveCoinConsumptionInput liveCoinConsumptionInput);

    Context getContext();

    DataChannel getDataChannel();

    View getWidgetView();
}
