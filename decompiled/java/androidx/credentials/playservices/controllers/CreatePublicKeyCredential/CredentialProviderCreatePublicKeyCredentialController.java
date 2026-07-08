package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.AbstractC20027413Xs;
import X.AbstractC20434814xe;
import X.C0W0J;
import X.C0WZX;
import X.C13XD;
import X.C15MM;
import X.C19848812lK;
import X.C19849012lM;
import X.C20434614xc;
import X.C20443514z3;
import X.C20444514zD;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C786410Ut5;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.HiddenActivity;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.ss.android.ugc.aweme.ICredentialManagerService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AFwS319S0000000_31;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import org.json.JSONException;

/* JADX INFO: loaded from: classes32.dex */
public final class CredentialProviderCreatePublicKeyCredentialController extends CredentialProviderController<C13XD, PublicKeyCredentialCreationOptions, PublicKeyCredential, AbstractC20434814xe, AbstractC20027413Xs> {
    public static final Companion Companion = new Companion();
    public C15MM<AbstractC20434814xe, AbstractC20027413Xs> callback;
    public CancellationSignal cancellationSignal;
    public final Context context;
    public Executor executor;
    public final CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1 resultReceiver;

    public static /* synthetic */ void getCallback$annotations() {
    }

    public static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    public static final CredentialProviderCreatePublicKeyCredentialController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    public static final class Companion {
        public final CredentialProviderCreatePublicKeyCredentialController getInstance(Context context) {
            return new CredentialProviderCreatePublicKeyCredentialController(context);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1] */
    public CredentialProviderCreatePublicKeyCredentialController(Context context) {
        super(context);
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
                CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 credentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 = new CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion);
                CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController2 = this.this$0;
                Executor executor = credentialProviderCreatePublicKeyCredentialController2.executor;
                C15MM<AbstractC20434814xe, AbstractC20027413Xs> c15mm = null;
                if (executor == null) {
                    executor = null;
                }
                C15MM<AbstractC20434814xe, AbstractC20027413Xs> c15mm2 = credentialProviderCreatePublicKeyCredentialController2.callback;
                if (c15mm2 != null) {
                    c15mm = c15mm2;
                }
                if (credentialProviderCreatePublicKeyCredentialController.maybeReportErrorFromResultReceiver(bundle, credentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1, executor, c15mm, credentialProviderCreatePublicKeyCredentialController2.cancellationSignal)) {
                    return;
                }
                try {
                    this.this$0.handleResponse$credentials_play_services_auth_release(bundle.getInt("ACTIVITY_REQUEST_CODE"), i, (Intent) bundle.getParcelable("RESULT_DATA"));
                } catch (IllegalStateException e) {
                    TryCatchGuardChecker.doCheck(e);
                    ((ICredentialManagerService) ServiceManager.get().getService(ICredentialManagerService.class)).LJII();
                }
            }
        };
    }

    public static final void handleResponse$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        C15MM<AbstractC20434814xe, AbstractC20027413Xs> c15mm = credentialProviderCreatePublicKeyCredentialController.callback;
        if (c15mm == null) {
            c15mm = null;
        }
        c15mm.LIZ(new C20443514z3(new C19848812lK(), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
    }

    public final C20443514z3 JSONExceptionToPKCError(JSONException jSONException) {
        String message = jSONException.getMessage();
        if (message != null && message.length() > 0) {
            return new C20443514z3(new C19849012lM(), message);
        }
        return new C20443514z3(new C19849012lM(), "Unknown error");
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public PublicKeyCredentialCreationOptions convertRequestToPlayServices(C13XD c13xd) {
        return PublicKeyCredentialControllerUtility.Companion.convert(c13xd);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public AbstractC20434814xe convertResponseToCredentialManager(PublicKeyCredential publicKeyCredential) throws C20444514zD {
        try {
            String strLLFFF = publicKeyCredential.LLFFF();
            C786410Ut5.LJJJI("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON", strLLFFF, new Bundle());
            return new C20434614xc(strLLFFF);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("The PublicKeyCredential response json had an unexpected exception when parsing: ");
            sbLIZ.append(th.getMessage());
            throw new C20444514zD(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void INVOKEVIRTUAL_androidx_credentials_playservices_controllers_CreatePublicKeyCredential_CredentialProviderCreatePublicKeyCredentialController_com_bytedance_router_monitor_page_PageLancet_startActivity(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dTF6Tg0zW9KSVkUkQReKcn4kgXDyyNLqY3YzcCFcUcGFCZpaIOGLSAAHpYvhA3r4kp9RDY0Dvy9pXBMvuENtQOObVF5zYQxbhV/pUeYNzxqikXV0pNuB5zdiRcfZPUMvs5EXp7RDefo+Jya/CRP7rFaQiW9TLcL3VZoovfw=", new String[]{"01789"}));
    }

    public final void handleResponse$credentials_play_services_auth_release(int i, int i2, Intent intent) {
        byte[] byteArrayExtra;
        if (i != CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE() || CredentialProviderController.maybeReportErrorResultCodeCreate(i2, AFwS319S0000000_31.get$arr$(2), new AwS610S0100000_31(this, 8), this.cancellationSignal)) {
            return;
        }
        Executor executor = null;
        if (intent != null && (byteArrayExtra = intent.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA")) != null) {
            PublicKeyCredential publicKeyCredential = (PublicKeyCredential) C0W0J.LIZ(byteArrayExtra, PublicKeyCredential.CREATOR);
            AbstractC20027413Xs abstractC20027413XsPublicKeyCredentialResponseContainsError = PublicKeyCredentialControllerUtility.Companion.publicKeyCredentialResponseContainsError(publicKeyCredential);
            if (abstractC20027413XsPublicKeyCredentialResponseContainsError != null) {
                CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new AwS432S0200000_31(this, abstractC20027413XsPublicKeyCredentialResponseContainsError, 10));
                return;
            }
            try {
                CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new AwS432S0200000_31(this, convertResponseToCredentialManager(publicKeyCredential), 11));
                return;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new AwS432S0200000_31(this, e, 12));
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new AwS432S0200000_31(this, th, 13));
                return;
            }
        }
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(this.cancellationSignal)) {
            return;
        }
        Executor executor2 = this.executor;
        if (executor2 != null) {
            executor = executor2;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$0(this.f$0);
            }
        });
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(C13XD c13xd, C15MM<AbstractC20434814xe, AbstractC20027413Xs> c15mm, Executor executor, CancellationSignal cancellationSignal) {
        this.cancellationSignal = cancellationSignal;
        this.callback = c15mm;
        this.executor = executor;
        try {
            PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptionsConvertRequestToPlayServices = convertRequestToPlayServices(c13xd);
            if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            Intent intent = new Intent(this.context, (Class<?>) HiddenActivity.class);
            intent.putExtra("REQUEST_TYPE", publicKeyCredentialCreationOptionsConvertRequestToPlayServices);
            generateHiddenActivityIntent(this.resultReceiver, intent, "CREATE_PUBLIC_KEY_CREDENTIAL");
            try {
                INVOKEVIRTUAL_androidx_credentials_playservices_controllers_CreatePublicKeyCredential_CredentialProviderCreatePublicKeyCredentialController_com_bytedance_router_monitor_page_PageLancet_startActivity(this.context, intent);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new AwS575S0100000_31(this, 15));
            }
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new AwS432S0200000_31(this, e2, 14));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new AwS432S0200000_31(this, th, 15));
        }
    }
}
