package androidx.credentials.playservices.controllers.BeginSignIn;

import X.AbstractC20027713Xv;
import X.C0W4V;
import X.C0WZX;
import X.C15MM;
import X.C20433914xV;
import X.C20434214xY;
import X.C20441914yn;
import X.C20442014yo;
import X.C20442114yp;
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
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.ss.android.ugc.aweme.ICredentialManagerService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AFwS319S0000000_31;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class CredentialProviderBeginSignInController extends CredentialProviderController<C20444114z9, BeginSignInRequest, SignInCredential, C20433914xV, AbstractC20027713Xv> {
    public static final Companion Companion = new Companion();
    public C15MM<C20433914xV, AbstractC20027713Xv> callback;
    public CancellationSignal cancellationSignal;
    public final Context context;
    public Executor executor;
    public final CredentialProviderBeginSignInController$resultReceiver$1 resultReceiver;

    public static /* synthetic */ void getCallback$annotations() {
    }

    public static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    public static final CredentialProviderBeginSignInController getInstance(Context context) {
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
        public final CredentialProviderBeginSignInController getInstance(Context context) {
            return new CredentialProviderBeginSignInController(context);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$resultReceiver$1] */
    public CredentialProviderBeginSignInController(Context context) {
        super(context);
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                if (this.this$0.maybeReportErrorFromResultReceiver(bundle, new CredentialProviderBeginSignInController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion), this.this$0.getExecutor(), this.this$0.getCallback(), this.this$0.cancellationSignal)) {
                    return;
                }
                try {
                    this.this$0.handleResponse$credentials_play_services_auth_release(bundle.getInt("ACTIVITY_REQUEST_CODE"), i, (Intent) bundle.getParcelable("RESULT_DATA"));
                } catch (IllegalStateException e) {
                    TryCatchGuardChecker.doCheck(e);
                    ((ICredentialManagerService) ServiceManager.get().getService(ICredentialManagerService.class)).LJIJJLI();
                }
            }
        };
    }

    private final C20434214xY createGoogleIdCredential(SignInCredential signInCredential) {
        C207183165l c207183165l = new C207183165l();
        c207183165l.LIZ = signInCredential.zba;
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
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public BeginSignInRequest convertRequestToPlayServices(C20444114z9 c20444114z9) {
        return BeginSignInControllerUtility.Companion.constructBeginSignInRequest$credentials_play_services_auth_release(c20444114z9, this.context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r4 != null) goto L5;
     */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C20433914xV convertResponseToCredentialManager(com.google.android.gms.auth.api.identity.SignInCredential r6) throws X.C20442114yp {
        /*
            r5 = this;
            java.lang.String r0 = r6.zbf
            if (r0 == 0) goto L22
            X.14xz r4 = new X.14xz
            java.lang.String r3 = r6.zba
            java.lang.String r2 = r6.zbf
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r0 = "androidx.credentials.BUNDLE_KEY_ID"
            X.C786410Ut5.LJJJI(r0, r3, r1)
            java.lang.String r0 = "androidx.credentials.BUNDLE_KEY_PASSWORD"
            X.C786410Ut5.LJJJI(r0, r2, r1)
            r4.<init>(r2, r1)
        L1c:
            X.14xV r0 = new X.14xV
            r0.<init>(r4)
            return r0
        L22:
            java.lang.String r0 = r6.zbg
            if (r0 == 0) goto L2d
            X.14xY r4 = r5.createGoogleIdCredential(r6)
            if (r4 == 0) goto L47
            goto L1c
        L2d:
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredential r0 = r6.zbi
            if (r0 == 0) goto L47
            X.14xb r4 = new X.14xb
            androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility$Companion r0 = androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.Companion
            java.lang.String r2 = r0.toAssertPasskeyResponse(r6)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r0 = "androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON"
            X.C786410Ut5.LJJJI(r0, r2, r1)
            r4.<init>(r2, r1)
            goto L1c
        L47:
            X.14yp r1 = new X.14yp
            java.lang.String r0 = "When attempting to convert get response, null credential found"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController.convertResponseToCredentialManager(com.google.android.gms.auth.api.identity.SignInCredential):X.14xV");
    }

    public final void setCallback(C15MM<C20433914xV, AbstractC20027713Xv> c15mm) {
        this.callback = c15mm;
    }

    public final void setExecutor(Executor executor) {
        this.executor = executor;
    }

    public static void INVOKEVIRTUAL_androidx_credentials_playservices_controllers_BeginSignIn_CredentialProviderBeginSignInController_com_bytedance_router_monitor_page_PageLancet_startActivity(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dTF6Tg0zW9KSVkUkQReKcn4kgXDyyNLqY3YzcCFcUcGFCZpaIOGLSAAHpYvhA3vvbMW6DhvGauCkTEzfEgP5tLmcUNc7jcz4uR0yqu9fWjOAuZTZRqJ8+/fhmV0Sq1izqA==", new String[]{"01789"}));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [T, X.14yp] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, X.14yo] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, X.14yn] */
    public final void handleResponse$credentials_play_services_auth_release(int i, int i2, Intent intent) {
        if (i != CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE() || CredentialProviderController.maybeReportErrorResultCodeGet(i2, AFwS319S0000000_31.get$arr$(0), new AwS610S0100000_31(this, 6), this.cancellationSignal)) {
            return;
        }
        try {
            C834010Wnf.LIZIZ(this.context);
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new AwS432S0200000_31(this, convertResponseToCredentialManager(C833870WnR.LJFF(intent)), 5));
        } catch (C0W4V e) {
            TryCatchGuardChecker.doCheck(e);
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = new C20442114yp(e.getMessage());
            if (e.getStatusCode() == 16) {
                c259800zU.element = new C20441914yn(e.getMessage());
            } else if (CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(e.getStatusCode()))) {
                c259800zU.element = new C20442014yo(e.getMessage());
            }
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new AwS432S0200000_31(this, (CredentialProviderBeginSignInController) c259800zU, (C259800zU<AbstractC20027713Xv>) 6));
        } catch (AbstractC20027713Xv e2) {
            TryCatchGuardChecker.doCheck(e2);
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new AwS432S0200000_31(this, e2, 7));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new AwS432S0200000_31(this, new C20442114yp(th.getMessage()), 8));
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
        BeginSignInRequest beginSignInRequestConvertRequestToPlayServices = convertRequestToPlayServices(c20444114z9);
        Intent intent = new Intent(this.context, (Class<?>) HiddenActivity.class);
        intent.putExtra("REQUEST_TYPE", beginSignInRequestConvertRequestToPlayServices);
        generateHiddenActivityIntent(this.resultReceiver, intent, "BEGIN_SIGN_IN");
        try {
            INVOKEVIRTUAL_androidx_credentials_playservices_controllers_BeginSignIn_CredentialProviderBeginSignInController_com_bytedance_router_monitor_page_PageLancet_startActivity(this.context, intent);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new AwS575S0100000_31(this, 13));
        }
    }
}
