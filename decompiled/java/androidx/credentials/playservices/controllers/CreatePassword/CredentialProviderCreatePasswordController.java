package androidx.credentials.playservices.controllers.CreatePassword;

import X.AbstractC20027413Xs;
import X.AbstractC20434814xe;
import X.C0WZX;
import X.C15MM;
import X.C20444914zH;
import X.C20445514zN;
import X.C2204961BRm;
import X.C836210WrD;
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
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SignInPassword;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS319S0000000_31;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class CredentialProviderCreatePasswordController extends CredentialProviderController<C20445514zN, SavePasswordRequest, Unit, AbstractC20434814xe, AbstractC20027413Xs> {
    public static final Companion Companion = new Companion();
    public C15MM<AbstractC20434814xe, AbstractC20027413Xs> callback;
    public CancellationSignal cancellationSignal;
    public final Context context;
    public Executor executor;
    public final CredentialProviderCreatePasswordController$resultReceiver$1 resultReceiver;

    public static /* synthetic */ void getCallback$annotations() {
    }

    public static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static final CredentialProviderCreatePasswordController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    public static final class Companion {
        public final CredentialProviderCreatePasswordController getInstance(Context context) {
            return new CredentialProviderCreatePasswordController(context);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController$resultReceiver$1] */
    public CredentialProviderCreatePasswordController(Context context) {
        super(context);
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.this$0;
                CredentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1 credentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1 = new CredentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion);
                CredentialProviderCreatePasswordController credentialProviderCreatePasswordController2 = this.this$0;
                Executor executor = credentialProviderCreatePasswordController2.executor;
                C15MM<AbstractC20434814xe, AbstractC20027413Xs> c15mm = null;
                if (executor == null) {
                    executor = null;
                }
                C15MM<AbstractC20434814xe, AbstractC20027413Xs> c15mm2 = credentialProviderCreatePasswordController2.callback;
                if (c15mm2 != null) {
                    c15mm = c15mm2;
                }
                if (credentialProviderCreatePasswordController.maybeReportErrorFromResultReceiver(bundle, credentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1, executor, c15mm, credentialProviderCreatePasswordController2.cancellationSignal)) {
                    return;
                }
                this.this$0.handleResponse$credentials_play_services_auth_release(bundle.getInt("ACTIVITY_REQUEST_CODE"), i);
            }
        };
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public SavePasswordRequest convertRequestToPlayServices(C20445514zN c20445514zN) {
        C836210WrD c836210WrD = new C836210WrD();
        c20445514zN.getClass();
        c836210WrD.LIZ = new SignInPassword(null, null);
        return new SavePasswordRequest(c836210WrD.LIZ, c836210WrD.LIZIZ, c836210WrD.LIZJ);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public AbstractC20434814xe convertResponseToCredentialManager(Unit unit) {
        new Bundle();
        return new C20444914zH();
    }

    public static void INVOKEVIRTUAL_androidx_credentials_playservices_controllers_CreatePassword_CredentialProviderCreatePasswordController_com_bytedance_router_monitor_page_PageLancet_startActivity(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dTF6Tg0zW9KSVkUkQReKcn4kgXDyyNLqY3YzcCFcUcGFCZpaIOGLSAAHpYvhA3r4kp9RDY0XrjB3UCou70NtQKXFtMtHBhQSL3XzE6I/TImgGXftJXiRzJjLLZS0qC9vP+C6u96nAA==", new String[]{"01789"}));
    }

    public final void handleResponse$credentials_play_services_auth_release(int i, int i2) {
        if (i != CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE() || CredentialProviderController.maybeReportErrorResultCodeCreate(i2, AFwS319S0000000_31.get$arr$(1), new AwS610S0100000_31(this, 7), this.cancellationSignal)) {
            return;
        }
        CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new AwS432S0200000_31(this, convertResponseToCredentialManager(Unit.LIZ), 9));
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(C20445514zN c20445514zN, C15MM<AbstractC20434814xe, AbstractC20027413Xs> c15mm, Executor executor, CancellationSignal cancellationSignal) {
        this.cancellationSignal = cancellationSignal;
        this.callback = c15mm;
        this.executor = executor;
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        SavePasswordRequest savePasswordRequestConvertRequestToPlayServices = convertRequestToPlayServices(c20445514zN);
        Intent intent = new Intent(this.context, (Class<?>) HiddenActivity.class);
        intent.putExtra("REQUEST_TYPE", savePasswordRequestConvertRequestToPlayServices);
        generateHiddenActivityIntent(this.resultReceiver, intent, "CREATE_PASSWORD");
        try {
            INVOKEVIRTUAL_androidx_credentials_playservices_controllers_CreatePassword_CredentialProviderCreatePasswordController_com_bytedance_router_monitor_page_PageLancet_startActivity(this.context, intent);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new AwS575S0100000_31(this, 14));
        }
    }
}
