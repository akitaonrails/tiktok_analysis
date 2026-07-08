package com.bytedance.android.live.ai.impl.pitaya.features;

import X.C00J1;
import X.C01GW;
import X.C163500jx;
import X.C500260Jjc;
import X.C776250Uch;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.ai.api.pitaya.feature.ILiveFeaturesService;
import com.bytedance.android.livesdk.livesetting.clientai.LiveRevenueFeatureIMSettings;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class LiveFeaturesServiceImpl implements ILiveFeaturesService {
    @Override // com.bytedance.android.live.ai.api.pitaya.feature.ILiveFeaturesService
    public final void J9(Fragment fragment, DataChannel dataChannel) {
        IMessageManager iMessageManager;
        C01GW c01gw = C00J1.LIZ;
        if (LiveRevenueFeatureIMSettings.INSTANCE.enabled(C500260Jjc.LJIIZILJ(dataChannel)) && dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            Iterator it2 = ((Map) C00J1.LIZ.getValue()).keySet().iterator();
            while (it2.hasNext()) {
                iMessageManager.removeMessageListener(((Number) it2.next()).intValue(), (C163500jx) C00J1.LIZJ.getValue());
            }
        }
    }

    @Override // com.bytedance.android.live.ai.api.pitaya.feature.ILiveFeaturesService
    public final void g0(Fragment fragment, DataChannel dataChannel) {
        IMessageManager iMessageManager;
        C01GW c01gw = C00J1.LIZ;
        if (LiveRevenueFeatureIMSettings.INSTANCE.enabled(C500260Jjc.LJIIZILJ(dataChannel)) && dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            Iterator it2 = ((Map) C00J1.LIZ.getValue()).keySet().iterator();
            while (it2.hasNext()) {
                iMessageManager.addMessageListener(((Number) it2.next()).intValue(), (OnIMMessageListener) C00J1.LIZJ.getValue());
            }
        }
    }
}
