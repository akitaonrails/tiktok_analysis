package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzdl;

/* JADX INFO: renamed from: X.0WGs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C820520WGs extends C820540WGu implements InterfaceC820490WGp {
    public C820520WGs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // X.InterfaceC820490WGp
    public final void clearMeasurementEnabled(long j) {
        Parcel parcelLJJJZ = LJJJZ();
        parcelLJJJZ.writeLong(j);
        LLLIIL(43, parcelLJJJZ);
    }

    @Override // X.InterfaceC820490WGp
    public final void generateEventId(InterfaceC19804212e8 interfaceC19804212e8) {
        Parcel parcelLJJJZ = LJJJZ();
        C0W8X.LIZIZ(parcelLJJJZ, interfaceC19804212e8);
        LLLIIL(22, parcelLJJJZ);
    }

    @Override // X.InterfaceC820490WGp
    public final void getAppInstanceId(InterfaceC19804212e8 interfaceC19804212e8) {
        Parcel parcelLJJJZ = LJJJZ();
        C0W8X.LIZIZ(parcelLJJJZ, interfaceC19804212e8);
        LLLIIL(20, parcelLJJJZ);
    }

    @Override // X.InterfaceC820490WGp
    public final void getCachedAppInstanceId(InterfaceC19804212e8 interfaceC19804212e8) {
        Parcel parcelLJJJZ = LJJJZ();
        C0W8X.LIZIZ(parcelLJJJZ, interfaceC19804212e8);
        LLLIIL(19, parcelLJJJZ);
    }

    @Override // X.InterfaceC820490WGp
    public final void getCurrentScreenClass(InterfaceC19804212e8 interfaceC19804212e8) {
        Parcel parcelLJJJZ = LJJJZ();
        C0W8X.LIZIZ(parcelLJJJZ, interfaceC19804212e8);
        LLLIIL(17, parcelLJJJZ);
    }

    @Override // X.InterfaceC820490WGp
    public final void getCurrentScreenName(InterfaceC19804212e8 interfaceC19804212e8) {
        Parcel parcelLJJJZ = LJJJZ();
        C0W8X.LIZIZ(parcelLJJJZ, interfaceC19804212e8);
        LLLIIL(16, parcelLJJJZ);
    }

    @Override // X.InterfaceC820490WGp
    public final void getGmpAppId(InterfaceC19804212e8 interfaceC19804212e8) {
        Parcel parcelLJJJZ = LJJJZ();
        C0W8X.LIZIZ(parcelLJJJZ, interfaceC19804212e8);
        LLLIIL(21, parcelLJJJZ);
    }

    @Override // X.InterfaceC820490WGp
    public final void setDataCollectionEnabled(boolean z) {
        Parcel parcelLJJJZ = LJJJZ();
        parcelLJJJZ.writeInt(z ? 1 : 0);
        LLLIIL(39, parcelLJJJZ);
    }

    @Override // X.InterfaceC820490WGp
    public final void beginAdUnitExposure(String str, long j) {
        Parcel parcelLJJJZ = LJJJZ();
        parcelLJJJZ.writeString(str);
        parcelLJJJZ.writeLong(j);
        LLLIIL(23, parcelLJJJZ);
    }

    @Override // X.InterfaceC820490WGp
    public final void endAdUnitExposure(String str, long j) {
        Parcel parcelLJJJZ = LJJJZ();
        parcelLJJJZ.writeString(str);
        parcelLJJJZ.writeLong(j);
        LLLIIL(24, parcelLJJJZ);
    }

    @Override // X.InterfaceC820490WGp
    public final void getMaxUserProperties(String str, InterfaceC19804212e8 interfaceC19804212e8) {
        Parcel parcelLJJJZ = LJJJZ();
        parcelLJJJZ.writeString(str);
        C0W8X.LIZIZ(parcelLJJJZ, interfaceC19804212e8);
        LLLIIL(6, parcelLJJJZ);
    }

    @Override // X.InterfaceC820490WGp
    public final void onActivityDestroyed(InterfaceC820590WGz interfaceC820590WGz, long j) {
        Parcel parcelLJJJZ = LJJJZ();
        C0W8X.LIZIZ(parcelLJJJZ, interfaceC820590WGz);
        parcelLJJJZ.writeLong(j);
        LLLIIL(28, parcelLJJJZ);
    }

    @Override // X.InterfaceC820490WGp
    public final void onActivityPaused(InterfaceC820590WGz interfaceC820590WGz, long j) {
        Parcel parcelLJJJZ = LJJJZ();
        C0W8X.LIZIZ(parcelLJJJZ, interfaceC820590WGz);
        parcelLJJJZ.writeLong(j);
        LLLIIL(29, parcelLJJJZ);
    }

    @Override // X.InterfaceC820490WGp
    public final void onActivityResumed(InterfaceC820590WGz interfaceC820590WGz, long j) {
        Parcel parcelLJJJZ = LJJJZ();
        C0W8X.LIZIZ(parcelLJJJZ, interfaceC820590WGz);
        parcelLJJJZ.writeLong(j);
        LLLIIL(30, parcelLJJJZ);
    }

    @Override // X.InterfaceC820490WGp
    public final void onActivityStarted(InterfaceC820590WGz interfaceC820590WGz, long j) {
        Parcel parcelLJJJZ = LJJJZ();
        C0W8X.LIZIZ(parcelLJJJZ, interfaceC820590WGz);
        parcelLJJJZ.writeLong(j);
        LLLIIL(25, parcelLJJJZ);
    }

    @Override // X.InterfaceC820490WGp
    public final void onActivityStopped(InterfaceC820590WGz interfaceC820590WGz, long j) {
        Parcel parcelLJJJZ = LJJJZ();
        C0W8X.LIZIZ(parcelLJJJZ, interfaceC820590WGz);
        parcelLJJJZ.writeLong(j);
        LLLIIL(26, parcelLJJJZ);
    }

    @Override // X.InterfaceC820490WGp
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel parcelLJJJZ = LJJJZ();
        C0W8X.LIZJ(parcelLJJJZ, bundle);
        parcelLJJJZ.writeLong(j);
        LLLIIL(8, parcelLJJJZ);
    }

    @Override // X.InterfaceC820490WGp
    public final void setConsentThirdParty(Bundle bundle, long j) {
        Parcel parcelLJJJZ = LJJJZ();
        C0W8X.LIZJ(parcelLJJJZ, bundle);
        parcelLJJJZ.writeLong(j);
        LLLIIL(45, parcelLJJJZ);
    }

    @Override // X.InterfaceC820490WGp
    public final void setMeasurementEnabled(boolean z, long j) {
        Parcel parcelLJJJZ = LJJJZ();
        parcelLJJJZ.writeInt(z ? 1 : 0);
        parcelLJJJZ.writeLong(j);
        LLLIIL(11, parcelLJJJZ);
    }

    @Override // X.InterfaceC820490WGp
    public final void setUserId(String str, long j) {
        Parcel parcelLJJJZ = LJJJZ();
        parcelLJJJZ.writeString(str);
        parcelLJJJZ.writeLong(j);
        LLLIIL(7, parcelLJJJZ);
    }

    @Override // X.InterfaceC820490WGp
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelLJJJZ = LJJJZ();
        parcelLJJJZ.writeString(str);
        parcelLJJJZ.writeString(str2);
        C0W8X.LIZJ(parcelLJJJZ, bundle);
        LLLIIL(9, parcelLJJJZ);
    }

    @Override // X.InterfaceC820490WGp
    public final void getConditionalUserProperties(String str, String str2, InterfaceC19804212e8 interfaceC19804212e8) {
        Parcel parcelLJJJZ = LJJJZ();
        parcelLJJJZ.writeString(str);
        parcelLJJJZ.writeString(str2);
        C0W8X.LIZIZ(parcelLJJJZ, interfaceC19804212e8);
        LLLIIL(10, parcelLJJJZ);
    }

    @Override // X.InterfaceC820490WGp
    public final void initialize(InterfaceC820590WGz interfaceC820590WGz, zzdl zzdlVar, long j) {
        Parcel parcelLJJJZ = LJJJZ();
        C0W8X.LIZIZ(parcelLJJJZ, interfaceC820590WGz);
        C0W8X.LIZJ(parcelLJJJZ, zzdlVar);
        parcelLJJJZ.writeLong(j);
        LLLIIL(1, parcelLJJJZ);
    }

    @Override // X.InterfaceC820490WGp
    public final void onActivityCreated(InterfaceC820590WGz interfaceC820590WGz, Bundle bundle, long j) {
        Parcel parcelLJJJZ = LJJJZ();
        C0W8X.LIZIZ(parcelLJJJZ, interfaceC820590WGz);
        C0W8X.LIZJ(parcelLJJJZ, bundle);
        parcelLJJJZ.writeLong(j);
        LLLIIL(27, parcelLJJJZ);
    }

    @Override // X.InterfaceC820490WGp
    public final void onActivitySaveInstanceState(InterfaceC820590WGz interfaceC820590WGz, InterfaceC19804212e8 interfaceC19804212e8, long j) {
        Parcel parcelLJJJZ = LJJJZ();
        C0W8X.LIZIZ(parcelLJJJZ, interfaceC820590WGz);
        C0W8X.LIZIZ(parcelLJJJZ, interfaceC19804212e8);
        parcelLJJJZ.writeLong(j);
        LLLIIL(31, parcelLJJJZ);
    }

    @Override // X.InterfaceC820490WGp
    public final void getUserProperties(String str, String str2, boolean z, InterfaceC19804212e8 interfaceC19804212e8) {
        Parcel parcelLJJJZ = LJJJZ();
        parcelLJJJZ.writeString(str);
        parcelLJJJZ.writeString(str2);
        parcelLJJJZ.writeInt(z ? 1 : 0);
        C0W8X.LIZIZ(parcelLJJJZ, interfaceC19804212e8);
        LLLIIL(5, parcelLJJJZ);
    }

    @Override // X.InterfaceC820490WGp
    public final void setCurrentScreen(InterfaceC820590WGz interfaceC820590WGz, String str, String str2, long j) {
        Parcel parcelLJJJZ = LJJJZ();
        C0W8X.LIZIZ(parcelLJJJZ, interfaceC820590WGz);
        parcelLJJJZ.writeString(str);
        parcelLJJJZ.writeString(str2);
        parcelLJJJZ.writeLong(j);
        LLLIIL(15, parcelLJJJZ);
    }

    @Override // X.InterfaceC820490WGp
    public final void logHealthData(int i, String str, InterfaceC820590WGz interfaceC820590WGz, InterfaceC820590WGz interfaceC820590WGz2, InterfaceC820590WGz interfaceC820590WGz3) {
        Parcel parcelLJJJZ = LJJJZ();
        parcelLJJJZ.writeInt(i);
        parcelLJJJZ.writeString(str);
        C0W8X.LIZIZ(parcelLJJJZ, interfaceC820590WGz);
        C0W8X.LIZIZ(parcelLJJJZ, interfaceC820590WGz2);
        C0W8X.LIZIZ(parcelLJJJZ, interfaceC820590WGz3);
        LLLIIL(33, parcelLJJJZ);
    }

    @Override // X.InterfaceC820490WGp
    public final void setUserProperty(String str, String str2, InterfaceC820590WGz interfaceC820590WGz, boolean z, long j) {
        Parcel parcelLJJJZ = LJJJZ();
        parcelLJJJZ.writeString(str);
        parcelLJJJZ.writeString(str2);
        C0W8X.LIZIZ(parcelLJJJZ, interfaceC820590WGz);
        parcelLJJJZ.writeInt(z ? 1 : 0);
        parcelLJJJZ.writeLong(j);
        LLLIIL(4, parcelLJJJZ);
    }

    @Override // X.InterfaceC820490WGp
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel parcelLJJJZ = LJJJZ();
        parcelLJJJZ.writeString(str);
        parcelLJJJZ.writeString(str2);
        C0W8X.LIZJ(parcelLJJJZ, bundle);
        parcelLJJJZ.writeInt(z ? 1 : 0);
        parcelLJJJZ.writeInt(z2 ? 1 : 0);
        parcelLJJJZ.writeLong(j);
        LLLIIL(2, parcelLJJJZ);
    }
}
