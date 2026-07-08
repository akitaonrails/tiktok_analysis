package com.bytedance.android.live.base.service;

import X.C006A;
import X.C0IIE;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public interface IHostMonitorAndLog extends C006A {
    void GC1(String str, Map<String, String> map, boolean z);

    void Iz0();

    void MD2(int i, int i2, long j);

    C0IIE Ru2();

    void Wp2(JSONObject jSONObject);

    void ensureNotReachHere(Throwable th, String str);

    void ensureNotReachHere(Throwable th, String str, Map<String, String> map);

    void monitorCommonLog(String str, JSONObject jSONObject);

    void monitorDirectOnTimer(String str, String str2, float f);

    void monitorDuration(String str, JSONObject jSONObject, JSONObject jSONObject2);

    void monitorStatusAndDuration(String str, int i, JSONObject jSONObject, JSONObject jSONObject2);

    void monitorStatusRate(String str, int i, JSONObject jSONObject);

    void vn(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);
}
