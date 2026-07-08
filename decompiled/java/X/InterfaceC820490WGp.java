package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.internal.measurement.zzdl;
import java.util.Map;

/* JADX INFO: renamed from: X.0WGp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public interface InterfaceC820490WGp extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(InterfaceC19804212e8 interfaceC19804212e8);

    void getAppInstanceId(InterfaceC19804212e8 interfaceC19804212e8);

    void getCachedAppInstanceId(InterfaceC19804212e8 interfaceC19804212e8);

    void getConditionalUserProperties(String str, String str2, InterfaceC19804212e8 interfaceC19804212e8);

    void getCurrentScreenClass(InterfaceC19804212e8 interfaceC19804212e8);

    void getCurrentScreenName(InterfaceC19804212e8 interfaceC19804212e8);

    void getGmpAppId(InterfaceC19804212e8 interfaceC19804212e8);

    void getMaxUserProperties(String str, InterfaceC19804212e8 interfaceC19804212e8);

    void getSessionId(InterfaceC19804212e8 interfaceC19804212e8);

    void getTestFlag(InterfaceC19804212e8 interfaceC19804212e8, int i);

    void getUserProperties(String str, String str2, boolean z, InterfaceC19804212e8 interfaceC19804212e8);

    void initForTests(Map map);

    void initialize(InterfaceC820590WGz interfaceC820590WGz, zzdl zzdlVar, long j);

    void isDataCollectionEnabled(InterfaceC19804212e8 interfaceC19804212e8);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC19804212e8 interfaceC19804212e8, long j);

    void logHealthData(int i, String str, InterfaceC820590WGz interfaceC820590WGz, InterfaceC820590WGz interfaceC820590WGz2, InterfaceC820590WGz interfaceC820590WGz3);

    void onActivityCreated(InterfaceC820590WGz interfaceC820590WGz, Bundle bundle, long j);

    void onActivityDestroyed(InterfaceC820590WGz interfaceC820590WGz, long j);

    void onActivityPaused(InterfaceC820590WGz interfaceC820590WGz, long j);

    void onActivityResumed(InterfaceC820590WGz interfaceC820590WGz, long j);

    void onActivitySaveInstanceState(InterfaceC820590WGz interfaceC820590WGz, InterfaceC19804212e8 interfaceC19804212e8, long j);

    void onActivityStarted(InterfaceC820590WGz interfaceC820590WGz, long j);

    void onActivityStopped(InterfaceC820590WGz interfaceC820590WGz, long j);

    void performAction(Bundle bundle, InterfaceC19804212e8 interfaceC19804212e8, long j);

    void registerOnMeasurementEventListener(InterfaceC19812412fS interfaceC19812412fS);

    void resetAnalyticsData(long j);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(InterfaceC820590WGz interfaceC820590WGz, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(InterfaceC19812412fS interfaceC19812412fS);

    void setInstanceIdProvider(C0WH0 c0wh0);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, InterfaceC820590WGz interfaceC820590WGz, boolean z, long j);

    void unregisterOnMeasurementEventListener(InterfaceC19812412fS interfaceC19812412fS);
}
