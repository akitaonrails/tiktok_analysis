package X;

import X.AbstractC1514820pWS;
import android.view.View;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pex, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public interface InterfaceC1520090pex<T extends AbstractC1514820pWS<?>> {
    T getViewSession(View view);

    void onHybridContextAttached(String str, View view);

    void onReceivedContainerError(View view, String str, C1491800ovK c1491800ovK, C1520180pf6 c1520180pf6);

    void onReceivedCustomEvent(View view, C1520350pfN c1520350pfN);

    void onReceivedHybridEvent(View view, String str, JSONObject jSONObject);
}
