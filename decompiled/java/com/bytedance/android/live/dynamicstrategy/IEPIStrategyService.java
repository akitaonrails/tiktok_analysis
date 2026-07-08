package com.bytedance.android.live.dynamicstrategy;

import X.AbstractC467020ITc;
import X.C006A;
import X.C1093040eYA;
import X.InterfaceC1092770eXj;
import X.InterfaceC1294060jmO;
import com.bytedance.android.livestrategy.config.FinalStrategyConfig;
import com.bytedance.android.livestrategy.config.TriggerStrategyConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public interface IEPIStrategyService extends C006A {
    void BO(DataChannel dataChannel);

    void Du0(DataChannel dataChannel);

    AbstractC467020ITc Ei2(DataChannel dataChannel);

    void G2(InterfaceC1092770eXj interfaceC1092770eXj, TriggerStrategyConfig triggerStrategyConfig);

    void Pa0();

    void R60(DataChannel dataChannel);

    @InterfaceC1294060jmO
    Object T12(DataChannel dataChannel, String str);

    void T4(TriggerStrategyConfig triggerStrategyConfig);

    C1093040eYA Tt(FinalStrategyConfig finalStrategyConfig, Map<String, ? extends Object> map);

    void fillUploadFeatures(Map<String, String> map, String str);

    void n9(FinalStrategyConfig finalStrategyConfig, Map<String, ? extends Object> map, InterfaceC1092770eXj interfaceC1092770eXj);

    void xl(DataChannel dataChannel);
}
