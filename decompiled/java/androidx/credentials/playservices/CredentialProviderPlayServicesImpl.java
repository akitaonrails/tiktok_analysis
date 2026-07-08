package androidx.credentials.playservices;

import X.AbstractC20027413Xs;
import X.AbstractC20027713Xv;
import X.AbstractC20434814xe;
import X.AbstractC20444214zA;
import X.AbstractC831960WkM;
import X.AbstractC835450Wpz;
import X.AbstractC836950WsP;
import X.C13XD;
import X.C13XS;
import X.C15MM;
import X.C20433914xV;
import X.C20444114z9;
import X.C20445514zN;
import X.C207184165m;
import X.C207185165n;
import X.C810670Vr7;
import X.C831040Wis;
import X.C832510WlF;
import X.C833870WnR;
import X.C834010Wnf;
import X.C834040Wni;
import X.C836350WrR;
import X.InterfaceC20443714z5;
import X.InterfaceC831290WjH;
import X.InterfaceC835710WqP;
import X.InterfaceC835730WqR;
import android.content.Context;
import android.os.CancellationSignal;
import android.os.Parcel;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS240S0300000_31;
import kotlin.jvm.internal.AwS275S0300000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class CredentialProviderPlayServicesImpl implements InterfaceC20443714z5 {
    public static final Companion Companion = new Companion();
    public final Context context;
    public GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    public /* bridge */ /* synthetic */ void onGetCredential(Context context, C207185165n c207185165n, CancellationSignal cancellationSignal, Executor executor, C15MM c15mm) {
    }

    public /* bridge */ /* synthetic */ void onPrepareCredential(C20444114z9 c20444114z9, CancellationSignal cancellationSignal, Executor executor, C15MM c15mm) {
    }

    @Override // X.InterfaceC20443714z5
    public boolean isAvailableOnDevice() {
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context);
        if (iIsGooglePlayServicesAvailable == 0) {
            return true;
        }
        new ConnectionResult(iIsGooglePlayServicesAvailable);
        return false;
    }

    public final GoogleApiAvailability getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    public static final class Companion {
        public final boolean cancellationReviewer$credentials_play_services_auth_release(CancellationSignal cancellationSignal) {
            if (cancellationSignal != null && cancellationSignal.isCanceled()) {
                return true;
            }
            return false;
        }

        public final boolean isGetSignInIntentRequest$credentials_play_services_auth_release(C20444114z9 c20444114z9) {
            Iterator<AbstractC836950WsP> it2 = c20444114z9.LIZ.iterator();
            while (it2.hasNext()) {
                if (it2.next() instanceof C836350WrR) {
                    return true;
                }
            }
            return false;
        }

        public final void cancellationReviewerWithCallback$credentials_play_services_auth_release(CancellationSignal cancellationSignal, Function0<Unit> function0) {
            if (!cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                function0.invoke();
            }
        }
    }

    public CredentialProviderPlayServicesImpl(Context context) {
        this.context = context;
    }

    private final int isGooglePlayServicesAvailable(Context context) {
        return this.googleApiAvailability.isGooglePlayServicesAvailable(context, 230815045);
    }

    public final void setGoogleApiAvailability(GoogleApiAvailability googleApiAvailability) {
        this.googleApiAvailability = googleApiAvailability;
    }

    public void onClearCredential(C207184165m c207184165m, final CancellationSignal cancellationSignal, final Executor executor, final C15MM<Void, C13XS> c15mm) {
        if (Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        final C833870WnR c833870WnRLIZIZ = C834010Wnf.LIZIZ(this.context);
        C810670Vr7.LIZJ(c833870WnRLIZIZ.zab, 0, "com.google.android.gms.signin").edit().clear().apply();
        Set<AbstractC831960WkM> set = AbstractC831960WkM.LIZ;
        synchronized (set) {
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Iterator<AbstractC831960WkM> it2 = set.iterator();
        while (it2.hasNext()) {
            it2.next().LJIILIIL();
        }
        C831040Wis.LIZ();
        C832510WlF c832510WlF = new C832510WlF();
        c832510WlF.LIZJ = new Feature[]{C834040Wni.LIZIZ};
        c832510WlF.LIZ = new InterfaceC831290WjH() { // from class: X.0Wof
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC831290WjH
            public final void LIZ(InterfaceC831160Wj4 interfaceC831160Wj4, Object obj) {
                C833870WnR c833870WnR = c833870WnRLIZIZ;
                c833870WnR.getClass();
                BinderC831760Wk2 binderC831760Wk2 = new BinderC831760Wk2((C835520Wq6) obj);
                C834590Wob c834590Wob = (C834590Wob) ((AbstractC832390Wl3) interfaceC831160Wj4).getService();
                String str = c833870WnR.LIZ;
                Parcel parcelLJJJZ = c834590Wob.LJJJZ();
                C834680Wok.LIZLLL(parcelLJJJZ, binderC831760Wk2);
                parcelLJJJZ.writeString(str);
                c834590Wob.LLILLIZIL(2, parcelLJJJZ);
            }
        };
        c832510WlF.LIZIZ = false;
        c832510WlF.LIZLLL = 1554;
        AbstractC835450Wpz abstractC835450WpzDoWrite = c833870WnRLIZIZ.doWrite(c832510WlF.LIZ());
        final AwS240S0300000_31 awS240S0300000_31 = new AwS240S0300000_31(cancellationSignal, (CancellationSignal) executor, (Executor) c15mm, (C15MM<Void, C13XS>) 4);
        abstractC835450WpzDoWrite.LJFF(new InterfaceC835710WqP() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda0
            @Override // X.InterfaceC835710WqP
            public final void onSuccess(Object obj) {
                awS240S0300000_31.invoke(obj);
            }
        }).LIZLLL(new InterfaceC835730WqR() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda1
            @Override // X.InterfaceC835730WqR
            public final void onFailure(Exception exc) {
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$2(this.f$0, cancellationSignal, executor, c15mm, exc);
            }
        });
    }

    public static final void onClearCredential$lambda$2(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, C15MM c15mm, Exception exc) {
        Companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new AwS275S0300000_31(exc, (Exception) executor, (Executor) c15mm, (C15MM<Void, C13XS>) 2));
    }

    @Override // X.InterfaceC20443714z5
    public void onCreateCredential(Context context, AbstractC20444214zA abstractC20444214zA, CancellationSignal cancellationSignal, Executor executor, C15MM<AbstractC20434814xe, AbstractC20027413Xs> c15mm) {
        if (Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (abstractC20444214zA instanceof C20445514zN) {
            CredentialProviderCreatePasswordController.Companion.getInstance(context).invokePlayServices((C20445514zN) abstractC20444214zA, c15mm, executor, cancellationSignal);
        } else {
            if (abstractC20444214zA instanceof C13XD) {
                CredentialProviderCreatePublicKeyCredentialController.Companion.getInstance(context).invokePlayServices((C13XD) abstractC20444214zA, c15mm, executor, cancellationSignal);
                return;
            }
            throw new UnsupportedOperationException("Create Credential request is unsupported, not password or publickeycredential");
        }
    }

    @Override // X.InterfaceC20443714z5
    public void onGetCredential(Context context, C20444114z9 c20444114z9, CancellationSignal cancellationSignal, Executor executor, C15MM<C20433914xV, AbstractC20027713Xv> c15mm) {
        Companion companion = Companion;
        if (companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (companion.isGetSignInIntentRequest$credentials_play_services_auth_release(c20444114z9)) {
            new CredentialProviderGetSignInIntentController(context).invokePlayServices(c20444114z9, c15mm, executor, cancellationSignal);
        } else {
            new CredentialProviderBeginSignInController(context).invokePlayServices(c20444114z9, c15mm, executor, cancellationSignal);
        }
    }
}
