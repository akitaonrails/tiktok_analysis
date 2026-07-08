package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.AbstractC20027713Xv;
import X.C0W3J;
import X.C0W4V;
import X.C0WZX;
import X.C15MM;
import X.C20433914xV;
import X.C20434214xY;
import X.C20441914yn;
import X.C20442014yo;
import X.C20442114yp;
import X.C20442714yv;
import X.C20444114z9;
import X.C207183165l;
import X.C2204961BRm;
import X.C259800zU;
import X.C833870WnR;
import X.C834010Wnf;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.HiddenActivity;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AFwS319S0000000_31;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class CredentialProviderGetSignInIntentController extends CredentialProviderController<C20444114z9, GetSignInIntentRequest, SignInCredential, C20433914xV, AbstractC20027713Xv> {
    public static final Companion Companion = new Companion();
    public C15MM<C20433914xV, AbstractC20027713Xv> callback;
    public CancellationSignal cancellationSignal;
    public final Context context;
    public Executor executor;
    public final CredentialProviderGetSignInIntentController$resultReceiver$1 resultReceiver;

    public static /* synthetic */ void getCallback$annotations() {
    }

    public static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    public static final CredentialProviderGetSignInIntentController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    public final C15MM<C20433914xV, AbstractC20027713Xv> getCallback() {
        C15MM<C20433914xV, AbstractC20027713Xv> c15mm = this.callback;
        if (c15mm != null) {
            return c15mm;
        }
        return null;
    }

    public final Executor getExecutor() {
        Executor executor = this.executor;
        if (executor != null) {
            return executor;
        }
        return null;
    }

    public static final class Companion {
        public final CredentialProviderGetSignInIntentController getInstance(Context context) {
            return new CredentialProviderGetSignInIntentController(context);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$resultReceiver$1] */
    public CredentialProviderGetSignInIntentController(Context context) {
        super(context);
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                if (this.this$0.maybeReportErrorFromResultReceiver(bundle, new CredentialProviderGetSignInIntentController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion), this.this$0.getExecutor(), this.this$0.getCallback(), this.this$0.cancellationSignal)) {
                    return;
                }
                this.this$0.handleResponse$credentials_play_services_auth_release(bundle.getInt("ACTIVITY_REQUEST_CODE"), i, (Intent) bundle.getParcelable("RESULT_DATA"));
            }
        };
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public GetSignInIntentRequest convertRequestToPlayServices(C20444114z9 c20444114z9) throws C20442714yv {
        if (c20444114z9.LIZ.size() != 1) {
            throw new C20442714yv("GetSignInWithGoogleOption cannot be combined with other options.");
        }
        ListProtector.get(c20444114z9.LIZ, 0);
        C0W3J.LJIIIIZZ(null);
        throw null;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public C20433914xV convertResponseToCredentialManager(SignInCredential signInCredential) throws C20442114yp {
        C20434214xY c20434214xYCreateGoogleIdCredential;
        if (signInCredential.zbg != null && (c20434214xYCreateGoogleIdCredential = createGoogleIdCredential(signInCredential)) != null) {
            return new C20433914xV(c20434214xYCreateGoogleIdCredential);
        }
        throw new C20442114yp("When attempting to convert get response, null credential found");
    }

    public final C20434214xY createGoogleIdCredential(SignInCredential signInCredential) throws C20442114yp {
        C207183165l c207183165l = new C207183165l();
        c207183165l.LIZ = signInCredential.zba;
        try {
            c207183165l.LIZIZ = signInCredential.zbg;
            String str = signInCredential.zbb;
            if (str != null) {
                c207183165l.LIZJ = str;
            }
            String str2 = signInCredential.zbc;
            if (str2 != null) {
                c207183165l.LJ = str2;
            }
            String str3 = signInCredential.zbd;
            if (str3 != null) {
                c207183165l.LIZLLL = str3;
            }
            String str4 = signInCredential.zbh;
            if (str4 != null) {
                c207183165l.LJI = str4;
            }
            Uri uri = signInCredential.zbe;
            if (uri != null) {
                c207183165l.LJFF = uri;
            }
            return new C20434214xY(c207183165l.LIZ, c207183165l.LIZIZ, c207183165l.LIZJ, c207183165l.LIZLLL, c207183165l.LJ, c207183165l.LJFF, c207183165l.LJI);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C20442114yp("When attempting to convert get response, null Google ID Token found");
        }
    }

    public final void setCallback(C15MM<C20433914xV, AbstractC20027713Xv> c15mm) {
        this.callback = c15mm;
    }

    public final void setExecutor(Executor executor) {
        this.executor = executor;
    }

    public static void INVOKEVIRTUAL_androidx_credentials_playservices_controllers_GetSignInIntent_CredentialProviderGetSignInIntentController_com_bytedance_router_monitor_page_PageLancet_startActivity(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dTF6Tg0zW9KSVkUkQReKcn4kgXDyyNLqY3YzcCFcUcGFCZpaIOGLSAAHpYvhA37veLLpIbgfRlF+HurjXQnvb8onu9xhCmSlQxb4Z7MEj32093up/C6c8itnawePytQPu+48ieyL10wt", new String[]{"01789"}));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [T, X.14yp] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, X.14yo] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, X.14yn] */
    public final void handleResponse$credentials_play_services_auth_release(int i, int i2, Intent intent) {
        if (i != CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE() || CredentialProviderController.maybeReportErrorResultCodeGet(i2, AFwS319S0000000_31.get$arr$(3), new AwS610S0100000_31(this, 9), this.cancellationSignal)) {
            return;
        }
        try {
            C834010Wnf.LIZIZ(this.context);
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new AwS432S0200000_31(this, convertResponseToCredentialManager(C833870WnR.LJFF(intent)), 18));
        } catch (C0W4V e) {
            TryCatchGuardChecker.doCheck(e);
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = new C20442114yp(e.getMessage());
            if (e.getStatusCode() == 16) {
                c259800zU.element = new C20441914yn(e.getMessage());
            } else if (CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(e.getStatusCode()))) {
                c259800zU.element = new C20442014yo(e.getMessage());
            }
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new AwS432S0200000_31(this, (CredentialProviderGetSignInIntentController) c259800zU, (C259800zU<AbstractC20027713Xv>) 19));
        } catch (AbstractC20027713Xv e2) {
            TryCatchGuardChecker.doCheck(e2);
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new AwS432S0200000_31(this, e2, 20));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new AwS432S0200000_31(this, new C20442114yp(th.getMessage()), 21));
        }
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(C20444114z9 c20444114z9, C15MM<C20433914xV, AbstractC20027713Xv> c15mm, Executor executor, CancellationSignal cancellationSignal) {
        this.cancellationSignal = cancellationSignal;
        setCallback(c15mm);
        setExecutor(executor);
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        try {
            GetSignInIntentRequest getSignInIntentRequestConvertRequestToPlayServices = convertRequestToPlayServices(c20444114z9);
            Intent intent = new Intent(this.context, (Class<?>) HiddenActivity.class);
            intent.putExtra("REQUEST_TYPE", getSignInIntentRequestConvertRequestToPlayServices);
            generateHiddenActivityIntent(this.resultReceiver, intent, "SIGN_IN_INTENT");
            INVOKEVIRTUAL_androidx_credentials_playservices_controllers_GetSignInIntent_CredentialProviderGetSignInIntentController_com_bytedance_router_monitor_page_PageLancet_startActivity(this.context, intent);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (e instanceof C20442714yv) {
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new AwS432S0200000_31(this, e, 22));
            } else {
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new AwS575S0100000_31(this, 16));
            }
        }
    }
}
