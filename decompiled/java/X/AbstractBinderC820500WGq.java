package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.google.android.gms.internal.measurement.zzdl;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0WGq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractBinderC820500WGq extends C0WGD implements InterfaceC820490WGp {
    public AbstractBinderC820500WGq() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static InterfaceC820490WGp asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (iInterfaceQueryLocalInterface instanceof InterfaceC820490WGp) {
            return (InterfaceC820490WGp) iInterfaceQueryLocalInterface;
        }
        return new C820520WGs(iBinder);
    }

    @Override // X.C0WGD
    public final boolean LJJJZ(int i, Parcel parcel, Parcel parcel2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        InterfaceC19804212e8 c820560WGw = null;
        InterfaceC19804212e8 c820560WGw2 = null;
        InterfaceC19804212e8 c820560WGw3 = null;
        InterfaceC19804212e8 c820560WGw4 = null;
        InterfaceC19804212e8 c820560WGw5 = null;
        InterfaceC19804212e8 c820560WGw6 = null;
        InterfaceC19804212e8 c820560WGw7 = null;
        C0WH0 c820580WGy = null;
        InterfaceC19804212e8 c820560WGw8 = null;
        InterfaceC19804212e8 c820560WGw9 = null;
        InterfaceC19804212e8 c820560WGw10 = null;
        InterfaceC19804212e8 c820560WGw11 = null;
        InterfaceC19804212e8 c820560WGw12 = null;
        InterfaceC19804212e8 c820560WGw13 = null;
        InterfaceC19812412fS c820530WGt = null;
        InterfaceC19812412fS c820530WGt2 = null;
        InterfaceC19812412fS c820530WGt3 = null;
        InterfaceC19804212e8 c820560WGw14 = null;
        InterfaceC19804212e8 c820560WGw15 = null;
        switch (i) {
            case 1:
                InterfaceC820590WGz interfaceC820590WGzLLILLIZIL = AbstractBinderC828770WfD.LLILLIZIL(parcel.readStrongBinder());
                zzdl zzdlVar = (zzdl) C0W8X.LIZ(parcel, zzdl.CREATOR);
                long j = parcel.readLong();
                C0W8X.LIZLLL(parcel);
                initialize(interfaceC820590WGzLLILLIZIL, zzdlVar, j);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) C0W8X.LIZ(parcel, Bundle.CREATOR);
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                long j2 = parcel.readLong();
                C0W8X.LIZLLL(parcel);
                logEvent(string, string2, bundle, z2, z3, j2);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) C0W8X.LIZ(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface instanceof InterfaceC19804212e8) {
                        c820560WGw2 = (InterfaceC19804212e8) iInterfaceQueryLocalInterface;
                    } else {
                        c820560WGw2 = new C820560WGw(strongBinder);
                    }
                }
                long j3 = parcel.readLong();
                C0W8X.LIZLLL(parcel);
                logEventAndBundle(string3, string4, bundle2, c820560WGw2, j3);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                InterfaceC820590WGz interfaceC820590WGzLLILLIZIL2 = AbstractBinderC828770WfD.LLILLIZIL(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                long j4 = parcel.readLong();
                C0W8X.LIZLLL(parcel);
                setUserProperty(string5, string6, interfaceC820590WGzLLILLIZIL2, z, j4);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface2 instanceof InterfaceC19804212e8) {
                        c820560WGw3 = (InterfaceC19804212e8) iInterfaceQueryLocalInterface2;
                    } else {
                        c820560WGw3 = new C820560WGw(strongBinder2);
                    }
                }
                C0W8X.LIZLLL(parcel);
                getUserProperties(string7, string8, z4, c820560WGw3);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface3 instanceof InterfaceC19804212e8) {
                        c820560WGw4 = (InterfaceC19804212e8) iInterfaceQueryLocalInterface3;
                    } else {
                        c820560WGw4 = new C820560WGw(strongBinder3);
                    }
                }
                C0W8X.LIZLLL(parcel);
                getMaxUserProperties(string9, c820560WGw4);
                break;
            case 7:
                String string10 = parcel.readString();
                long j5 = parcel.readLong();
                C0W8X.LIZLLL(parcel);
                setUserId(string10, j5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) C0W8X.LIZ(parcel, Bundle.CREATOR);
                long j6 = parcel.readLong();
                C0W8X.LIZLLL(parcel);
                setConditionalUserProperty(bundle3, j6);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) C0W8X.LIZ(parcel, Bundle.CREATOR);
                C0W8X.LIZLLL(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface4 instanceof InterfaceC19804212e8) {
                        c820560WGw5 = (InterfaceC19804212e8) iInterfaceQueryLocalInterface4;
                    } else {
                        c820560WGw5 = new C820560WGw(strongBinder4);
                    }
                }
                C0W8X.LIZLLL(parcel);
                getConditionalUserProperties(string13, string14, c820560WGw5);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                long j7 = parcel.readLong();
                C0W8X.LIZLLL(parcel);
                setMeasurementEnabled(z4, j7);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                long j8 = parcel.readLong();
                C0W8X.LIZLLL(parcel);
                resetAnalyticsData(j8);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                long j9 = parcel.readLong();
                C0W8X.LIZLLL(parcel);
                setMinimumSessionDuration(j9);
                break;
            case 14:
                long j10 = parcel.readLong();
                C0W8X.LIZLLL(parcel);
                setSessionTimeoutDuration(j10);
                break;
            case 15:
                InterfaceC820590WGz interfaceC820590WGzLLILLIZIL3 = AbstractBinderC828770WfD.LLILLIZIL(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j11 = parcel.readLong();
                C0W8X.LIZLLL(parcel);
                setCurrentScreen(interfaceC820590WGzLLILLIZIL3, string15, string16, j11);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface5 instanceof InterfaceC19804212e8) {
                        c820560WGw6 = (InterfaceC19804212e8) iInterfaceQueryLocalInterface5;
                    } else {
                        c820560WGw6 = new C820560WGw(strongBinder5);
                    }
                }
                C0W8X.LIZLLL(parcel);
                getCurrentScreenName(c820560WGw6);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface6 instanceof InterfaceC19804212e8) {
                        c820560WGw7 = (InterfaceC19804212e8) iInterfaceQueryLocalInterface6;
                    } else {
                        c820560WGw7 = new C820560WGw(strongBinder6);
                    }
                }
                C0W8X.LIZLLL(parcel);
                getCurrentScreenClass(c820560WGw7);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (iInterfaceQueryLocalInterface7 instanceof C0WH0) {
                        c820580WGy = (C0WH0) iInterfaceQueryLocalInterface7;
                    } else {
                        c820580WGy = new C820580WGy(strongBinder7);
                    }
                }
                C0W8X.LIZLLL(parcel);
                setInstanceIdProvider(c820580WGy);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface8 instanceof InterfaceC19804212e8) {
                        c820560WGw8 = (InterfaceC19804212e8) iInterfaceQueryLocalInterface8;
                    } else {
                        c820560WGw8 = new C820560WGw(strongBinder8);
                    }
                }
                C0W8X.LIZLLL(parcel);
                getCachedAppInstanceId(c820560WGw8);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface9 instanceof InterfaceC19804212e8) {
                        c820560WGw9 = (InterfaceC19804212e8) iInterfaceQueryLocalInterface9;
                    } else {
                        c820560WGw9 = new C820560WGw(strongBinder9);
                    }
                }
                C0W8X.LIZLLL(parcel);
                getAppInstanceId(c820560WGw9);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface10 instanceof InterfaceC19804212e8) {
                        c820560WGw10 = (InterfaceC19804212e8) iInterfaceQueryLocalInterface10;
                    } else {
                        c820560WGw10 = new C820560WGw(strongBinder10);
                    }
                }
                C0W8X.LIZLLL(parcel);
                getGmpAppId(c820560WGw10);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface11 instanceof InterfaceC19804212e8) {
                        c820560WGw11 = (InterfaceC19804212e8) iInterfaceQueryLocalInterface11;
                    } else {
                        c820560WGw11 = new C820560WGw(strongBinder11);
                    }
                }
                C0W8X.LIZLLL(parcel);
                generateEventId(c820560WGw11);
                break;
            case 23:
                String string17 = parcel.readString();
                long j12 = parcel.readLong();
                C0W8X.LIZLLL(parcel);
                beginAdUnitExposure(string17, j12);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                String string18 = parcel.readString();
                long j13 = parcel.readLong();
                C0W8X.LIZLLL(parcel);
                endAdUnitExposure(string18, j13);
                break;
            case 25:
                InterfaceC820590WGz interfaceC820590WGzLLILLIZIL4 = AbstractBinderC828770WfD.LLILLIZIL(parcel.readStrongBinder());
                long j14 = parcel.readLong();
                C0W8X.LIZLLL(parcel);
                onActivityStarted(interfaceC820590WGzLLILLIZIL4, j14);
                break;
            case 26:
                InterfaceC820590WGz interfaceC820590WGzLLILLIZIL5 = AbstractBinderC828770WfD.LLILLIZIL(parcel.readStrongBinder());
                long j15 = parcel.readLong();
                C0W8X.LIZLLL(parcel);
                onActivityStopped(interfaceC820590WGzLLILLIZIL5, j15);
                break;
            case 27:
                InterfaceC820590WGz interfaceC820590WGzLLILLIZIL6 = AbstractBinderC828770WfD.LLILLIZIL(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) C0W8X.LIZ(parcel, Bundle.CREATOR);
                long j16 = parcel.readLong();
                C0W8X.LIZLLL(parcel);
                onActivityCreated(interfaceC820590WGzLLILLIZIL6, bundle5, j16);
                break;
            case 28:
                InterfaceC820590WGz interfaceC820590WGzLLILLIZIL7 = AbstractBinderC828770WfD.LLILLIZIL(parcel.readStrongBinder());
                long j17 = parcel.readLong();
                C0W8X.LIZLLL(parcel);
                onActivityDestroyed(interfaceC820590WGzLLILLIZIL7, j17);
                break;
            case 29:
                InterfaceC820590WGz interfaceC820590WGzLLILLIZIL8 = AbstractBinderC828770WfD.LLILLIZIL(parcel.readStrongBinder());
                long j18 = parcel.readLong();
                C0W8X.LIZLLL(parcel);
                onActivityPaused(interfaceC820590WGzLLILLIZIL8, j18);
                break;
            case 30:
                InterfaceC820590WGz interfaceC820590WGzLLILLIZIL9 = AbstractBinderC828770WfD.LLILLIZIL(parcel.readStrongBinder());
                long j19 = parcel.readLong();
                C0W8X.LIZLLL(parcel);
                onActivityResumed(interfaceC820590WGzLLILLIZIL9, j19);
                break;
            case 31:
                InterfaceC820590WGz interfaceC820590WGzLLILLIZIL10 = AbstractBinderC828770WfD.LLILLIZIL(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface12 instanceof InterfaceC19804212e8) {
                        c820560WGw12 = (InterfaceC19804212e8) iInterfaceQueryLocalInterface12;
                    } else {
                        c820560WGw12 = new C820560WGw(strongBinder12);
                    }
                }
                long j20 = parcel.readLong();
                C0W8X.LIZLLL(parcel);
                onActivitySaveInstanceState(interfaceC820590WGzLLILLIZIL10, c820560WGw12, j20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) C0W8X.LIZ(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface13 instanceof InterfaceC19804212e8) {
                        c820560WGw13 = (InterfaceC19804212e8) iInterfaceQueryLocalInterface13;
                    } else {
                        c820560WGw13 = new C820560WGw(strongBinder13);
                    }
                }
                long j21 = parcel.readLong();
                C0W8X.LIZLLL(parcel);
                performAction(bundle6, c820560WGw13, j21);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                int i2 = parcel.readInt();
                String string19 = parcel.readString();
                InterfaceC820590WGz interfaceC820590WGzLLILLIZIL11 = AbstractBinderC828770WfD.LLILLIZIL(parcel.readStrongBinder());
                InterfaceC820590WGz interfaceC820590WGzLLILLIZIL12 = AbstractBinderC828770WfD.LLILLIZIL(parcel.readStrongBinder());
                InterfaceC820590WGz interfaceC820590WGzLLILLIZIL13 = AbstractBinderC828770WfD.LLILLIZIL(parcel.readStrongBinder());
                C0W8X.LIZLLL(parcel);
                logHealthData(i2, string19, interfaceC820590WGzLLILLIZIL11, interfaceC820590WGzLLILLIZIL12, interfaceC820590WGzLLILLIZIL13);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (iInterfaceQueryLocalInterface14 instanceof InterfaceC19812412fS) {
                        c820530WGt = (InterfaceC19812412fS) iInterfaceQueryLocalInterface14;
                    } else {
                        c820530WGt = new C820530WGt(strongBinder14);
                    }
                }
                C0W8X.LIZLLL(parcel);
                setEventInterceptor(c820530WGt);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (iInterfaceQueryLocalInterface15 instanceof InterfaceC19812412fS) {
                        c820530WGt2 = (InterfaceC19812412fS) iInterfaceQueryLocalInterface15;
                    } else {
                        c820530WGt2 = new C820530WGt(strongBinder15);
                    }
                }
                C0W8X.LIZLLL(parcel);
                registerOnMeasurementEventListener(c820530WGt2);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (iInterfaceQueryLocalInterface16 instanceof InterfaceC19812412fS) {
                        c820530WGt3 = (InterfaceC19812412fS) iInterfaceQueryLocalInterface16;
                    } else {
                        c820530WGt3 = new C820530WGt(strongBinder16);
                    }
                }
                C0W8X.LIZLLL(parcel);
                unregisterOnMeasurementEventListener(c820530WGt3);
                break;
            case 37:
                HashMap hashMap = parcel.readHashMap(C0W8X.LIZ);
                C0W8X.LIZLLL(parcel);
                initForTests(hashMap);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface17 instanceof InterfaceC19804212e8) {
                        c820560WGw14 = (InterfaceC19804212e8) iInterfaceQueryLocalInterface17;
                    } else {
                        c820560WGw14 = new C820560WGw(strongBinder17);
                    }
                }
                int i3 = parcel.readInt();
                C0W8X.LIZLLL(parcel);
                getTestFlag(c820560WGw14, i3);
                break;
            case 39:
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                C0W8X.LIZLLL(parcel);
                setDataCollectionEnabled(z4);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface18 instanceof InterfaceC19804212e8) {
                        c820560WGw15 = (InterfaceC19804212e8) iInterfaceQueryLocalInterface18;
                    } else {
                        c820560WGw15 = new C820560WGw(strongBinder18);
                    }
                }
                C0W8X.LIZLLL(parcel);
                isDataCollectionEnabled(c820560WGw15);
                break;
            case 41:
            case 47:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) C0W8X.LIZ(parcel, Bundle.CREATOR);
                C0W8X.LIZLLL(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j22 = parcel.readLong();
                C0W8X.LIZLLL(parcel);
                clearMeasurementEnabled(j22);
                break;
            case 44:
                Bundle bundle8 = (Bundle) C0W8X.LIZ(parcel, Bundle.CREATOR);
                long j23 = parcel.readLong();
                C0W8X.LIZLLL(parcel);
                setConsent(bundle8, j23);
                break;
            case 45:
                Bundle bundle9 = (Bundle) C0W8X.LIZ(parcel, Bundle.CREATOR);
                long j24 = parcel.readLong();
                C0W8X.LIZLLL(parcel);
                setConsentThirdParty(bundle9, j24);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface19 instanceof InterfaceC19804212e8) {
                        c820560WGw = (InterfaceC19804212e8) iInterfaceQueryLocalInterface19;
                    } else {
                        c820560WGw = new C820560WGw(strongBinder19);
                    }
                }
                C0W8X.LIZLLL(parcel);
                getSessionId(c820560WGw);
                break;
            case 48:
                Intent intent = (Intent) C0W8X.LIZ(parcel, Intent.CREATOR);
                C0W8X.LIZLLL(parcel);
                setSgtmDebugInfo(intent);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
