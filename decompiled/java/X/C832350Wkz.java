package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0Wkz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C832350Wkz {
    public static final C0W4N LIZ = new C0W4N("GoogleSignInCommon", new String[0]);

    public static void LIZJ(Context context) {
        C832360Wl0 c832360Wl0LIZ = C832360Wl0.LIZ(context);
        synchronized (c832360Wl0LIZ) {
            c832360Wl0LIZ.LIZ.LIZ();
        }
        Iterator<AbstractC831960WkM> it2 = AbstractC831960WkM.LJII().iterator();
        while (it2.hasNext()) {
            it2.next().LJIILIIL();
        }
        C831040Wis.LIZ();
    }

    public static Intent LIZ(Context context, GoogleSignInOptions googleSignInOptions) {
        LIZ.getClass();
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIJL(bundle, "config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    public static BasePendingResult LIZIZ(final AbstractC831960WkM abstractC831960WkM, Context context, boolean z) {
        LIZ.getClass();
        LIZJ(context);
        if (z) {
            Status status = Status.RESULT_SUCCESS;
            C0W3J.LJIIIZ(status, "Result must not be null");
            C832630WlR c832630WlR = new C832630WlR(abstractC831960WkM);
            c832630WlR.LIZ(status);
            return c832630WlR;
        }
        return abstractC831960WkM.LJI(new AbstractC832150Wkf(abstractC831960WkM) { // from class: X.0Woc
            @Override // com.google.android.gms.common.api.internal.BasePendingResult
            public final /* bridge */ /* synthetic */ InterfaceC832870Wlp LJ(Status status2) {
                return status2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC831980WkO
            public final void LJIILIIL(InterfaceC831160Wj4 interfaceC831160Wj4) {
                C833480Wmo c833480Wmo = (C833480Wmo) interfaceC831160Wj4;
                C834590Wob c834590Wob = (C834590Wob) c833480Wmo.getService();
                BinderC834660Woi binderC834660Woi = new BinderC834660Woi() { // from class: X.0Wog
                    @Override // X.BinderC834660Woi, X.InterfaceC834800Wow
                    public final void LLLIL(Status status2) {
                        LIZ(status2);
                    }
                };
                GoogleSignInOptions googleSignInOptions = c833480Wmo.LL;
                Parcel parcelLJJJZ = c834590Wob.LJJJZ();
                C834680Wok.LIZLLL(parcelLJJJZ, binderC834660Woi);
                C834680Wok.LIZJ(parcelLJJJZ, googleSignInOptions);
                c834590Wob.LLILLIZIL(102, parcelLJJJZ);
            }
        });
    }
}
