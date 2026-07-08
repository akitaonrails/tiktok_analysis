package X;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0WnR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C833870WnR extends AbstractC831380WjQ {
    public static final C832010WkR LIZIZ = new C832010WkR("Auth.Api.Identity.SignIn.API", new AbstractC831970WkN() { // from class: X.0WnQ
        @Override // X.AbstractC831970WkN
        public final /* synthetic */ InterfaceC831160Wj4 buildClient(Context context, Looper looper, C831470WjZ c831470WjZ, Object obj, InterfaceC832280Wks interfaceC832280Wks, InterfaceC832890Wlr interfaceC832890Wlr) {
            return new AbstractC832400Wl4(context, looper, c831470WjZ, interfaceC832280Wks, interfaceC832890Wlr) { // from class: X.0WnP
                public final Bundle LL = new Bundle();

                @Override // X.AbstractC832390Wl3
                public final Bundle getGetServiceRequestExtraArgs() {
                    return this.LL;
                }

                @Override // X.AbstractC832390Wl3, X.InterfaceC831160Wj4
                public final int getMinApkVersion() {
                    return 17895000;
                }

                @Override // X.AbstractC832390Wl3
                public final String getServiceDescriptor() {
                    return "com.google.android.gms.auth.api.identity.internal.ISignInService";
                }

                @Override // X.AbstractC832390Wl3
                public final String getStartServiceAction() {
                    return "com.google.android.gms.auth.api.identity.service.signin.START";
                }

                @Override // X.AbstractC832390Wl3
                public final boolean getUseDynamicLookup() {
                    return true;
                }

                @Override // X.AbstractC832390Wl3
                public final boolean usesClientTelemetry() {
                    return true;
                }

                @Override // X.AbstractC832390Wl3
                public final Feature[] getApiFeatures() {
                    return C834040Wni.LJFF;
                }

                @Override // X.AbstractC832390Wl3
                public final /* synthetic */ IInterface createServiceInterface(final IBinder iBinder) {
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
                    if (iInterfaceQueryLocalInterface instanceof C834030Wnh) {
                        return iInterfaceQueryLocalInterface;
                    }
                    return new C834590Wob(iBinder) { // from class: X.0Wnh
                    };
                }
            };
        }
    }, new C832160Wkg());
    public final String LIZ;

    public static final String LIZLLL(Intent intent) {
        String stringExtra;
        if (intent != null) {
            Status status = (Status) C0W0J.LIZIZ(intent, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Status.CREATOR);
            if (status != null) {
                if (status.LJLZ()) {
                    try {
                        stringExtra = intent.getStringExtra("phone_number_hint_result");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        stringExtra = null;
                    }
                    if (stringExtra != null) {
                        return stringExtra;
                    }
                    throw new C0W4V(Status.RESULT_INTERNAL_ERROR);
                }
                throw new C0W4V(status);
            }
            throw new C0W4V(Status.RESULT_CANCELED);
        }
        throw new C0W4V(Status.RESULT_INTERNAL_ERROR);
    }

    public static final SignInCredential LJFF(Intent intent) throws C0W4V {
        if (intent != null) {
            Status status = (Status) C0W0J.LIZIZ(intent, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Status.CREATOR);
            if (status != null) {
                if (status.LJLZ()) {
                    SignInCredential signInCredential = (SignInCredential) C0W0J.LIZIZ(intent, "sign_in_credential", SignInCredential.CREATOR);
                    if (signInCredential != null) {
                        return signInCredential;
                    }
                    throw new C0W4V(Status.RESULT_INTERNAL_ERROR);
                }
                throw new C0W4V(status);
            }
            throw new C0W4V(Status.RESULT_CANCELED);
        }
        throw new C0W4V(Status.RESULT_INTERNAL_ERROR);
    }

    public final AbstractC835450Wpz<PendingIntent> LJ(final GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest) {
        C832510WlF c832510WlF = new C832510WlF();
        c832510WlF.LIZJ = new Feature[]{C834040Wni.LJ};
        c832510WlF.LIZ = new InterfaceC831290WjH() { // from class: X.0Woe
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC831290WjH
            public final void LIZ(InterfaceC831160Wj4 interfaceC831160Wj4, Object obj) {
                C833870WnR c833870WnR = this.LIZ;
                GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest2 = getPhoneNumberHintIntentRequest;
                c833870WnR.getClass();
                BinderC834790Wov binderC834790Wov = new BinderC834790Wov((C835520Wq6) obj);
                C834590Wob c834590Wob = (C834590Wob) ((AbstractC832390Wl3) interfaceC831160Wj4).getService();
                String str = c833870WnR.LIZ;
                Parcel parcelLJJJZ = c834590Wob.LJJJZ();
                C834680Wok.LIZLLL(parcelLJJJZ, binderC834790Wov);
                C834680Wok.LIZJ(parcelLJJJZ, getPhoneNumberHintIntentRequest2);
                parcelLJJJZ.writeString(str);
                c834590Wob.LLILLIZIL(4, parcelLJJJZ);
            }
        };
        c832510WlF.LIZLLL = 1653;
        return doRead(c832510WlF.LIZ());
    }

    public C833870WnR(Activity activity, C834000Wne c834000Wne) {
        super(activity, (C832010WkR<C834000Wne>) LIZIZ, c834000Wne, C831490Wjb.LIZJ);
        this.LIZ = C833580Wmy.LIZ();
    }

    public C833870WnR(Context context, C834000Wne c834000Wne) {
        super(context, (C832010WkR<C834000Wne>) LIZIZ, c834000Wne, C831490Wjb.LIZJ);
        this.LIZ = C833580Wmy.LIZ();
    }
}
