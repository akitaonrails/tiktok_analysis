package com.bytedance.android.live.network.interceptors;

import X.C0X52;
import X.C0XMB;
import X.C1161920gLG;
import X.C1494590ozp;
import X.C1974107oJ;
import X.C293501Bt;
import X.InterfaceC1904907d9;
import X.InterfaceC519150KXp;
import X.InterfaceC841770X0l;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDedupOptExp;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveFeedDynamicFeatureConfig;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.FormUrlEncodedTypedOutput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class InjectFeedFeatureInterceptor implements InterfaceC1904907d9 {
    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        String method;
        C1974107oJ c1974107oJ;
        Method method2;
        Object liveFeature;
        Request request = ((C1494590ozp) interfaceC841770X0l).LIZJ;
        if (request != null) {
            method = request.getMethod();
        } else {
            method = null;
        }
        if (Intrinsics.LJFF(method, "POST")) {
            return ((C1494590ozp) interfaceC841770X0l).LIZ(request);
        }
        if (request != null && (c1974107oJ = (C1974107oJ) request.tag(C1974107oJ.class)) != null && (method2 = c1974107oJ.LIZ) != null && method2.getAnnotation(InterfaceC519150KXp.class) != null) {
            C0XMB c0xmbNewBuilder = request.newBuilder();
            FormUrlEncodedTypedOutput formUrlEncodedTypedOutput = new FormUrlEncodedTypedOutput();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Map<String, List<String>>> entry : LiveFeedDynamicFeatureConfig.INSTANCE.getValue().entrySet()) {
                String key = entry.getKey();
                Map<String, List<String>> value = entry.getValue();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<String, List<String>> entry2 : value.entrySet()) {
                    String key2 = entry2.getKey();
                    for (String str : entry2.getValue()) {
                        if (str.length() > 0 && (liveFeature = ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).getLiveFeature(key, key2, str)) != null) {
                            linkedHashMap2.put(str, liveFeature);
                        }
                    }
                }
                linkedHashMap.put(key, linkedHashMap2);
            }
            try {
                formUrlEncodedTypedOutput.addField("live_dynamic_features", C293501Bt.LIZ().LJIILL(linkedHashMap));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (LiveDedupOptExp.INSTANCE.enable()) {
                ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).onFeedRequestTriggerFinish();
            }
            c0xmbNewBuilder.LIZIZ(formUrlEncodedTypedOutput, "POST");
            return ((C1494590ozp) interfaceC841770X0l).LIZ(c0xmbNewBuilder.LIZ());
        }
        return ((C1494590ozp) interfaceC841770X0l).LIZ(request);
    }
}
