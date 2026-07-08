package androidx.credentials.playservices.controllers;

import X.AbstractC20027413Xs;
import X.AbstractC20027713Xv;
import X.C15MM;
import X.C20027513Xt;
import X.C20441914yn;
import X.C20442114yp;
import X.C20444514zD;
import X.C2188811AlT;
import X.C259800zU;
import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS275S0300000_31;
import kotlin.jvm.internal.AwS432S0200000_31;

/* JADX INFO: loaded from: classes32.dex */
public abstract class CredentialProviderController<T1, T2, R2, R1, E1> extends CredentialProviderBaseController {
    public static final Companion Companion = new Companion();
    public final Context context;

    public static final void cancelOrCallbackExceptionOrResult(CancellationSignal cancellationSignal, Function0<Unit> function0) {
        Companion.cancelOrCallbackExceptionOrResult(cancellationSignal, function0);
    }

    public static final boolean maybeReportErrorResultCodeCreate(int i, Function2<? super CancellationSignal, ? super Function0<Unit>, Unit> function2, Function1<? super AbstractC20027413Xs, Unit> function1, CancellationSignal cancellationSignal) {
        return Companion.maybeReportErrorResultCodeCreate(i, function2, function1, cancellationSignal);
    }

    public static final boolean maybeReportErrorResultCodeGet(int i, Function2<? super CancellationSignal, ? super Function0<Unit>, Unit> function2, Function1<? super AbstractC20027713Xv, Unit> function1, CancellationSignal cancellationSignal) {
        return Companion.maybeReportErrorResultCodeGet(i, function2, function1, cancellationSignal);
    }

    public abstract T2 convertRequestToPlayServices(T1 t1);

    public abstract R1 convertResponseToCredentialManager(R2 r2);

    public abstract void invokePlayServices(T1 t1, C15MM<R1, E1> c15mm, Executor executor, CancellationSignal cancellationSignal);

    public static final class Companion {
        public final String generateErrorStringCanceled$credentials_play_services_auth_release() {
            return "activity is cancelled by the user.";
        }

        public final String generateErrorStringUnknown$credentials_play_services_auth_release(int i) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("activity with result code: ");
            sbLIZ.append(i);
            sbLIZ.append(" indicating not RESULT_OK");
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final void cancelOrCallbackExceptionOrResult(CancellationSignal cancellationSignal, Function0<Unit> function0) {
            if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            function0.invoke();
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, X.14zD] */
        /* JADX WARN: Type inference failed for: r1v2, types: [T, X.13Xt] */
        public final boolean maybeReportErrorResultCodeCreate(int i, Function2<? super CancellationSignal, ? super Function0<Unit>, Unit> function2, Function1<? super AbstractC20027413Xs, Unit> function1, CancellationSignal cancellationSignal) {
            if (i != -1) {
                C259800zU c259800zU = new C259800zU();
                c259800zU.element = new C20444514zD(generateErrorStringUnknown$credentials_play_services_auth_release(i));
                if (i == 0) {
                    c259800zU.element = new C20027513Xt(generateErrorStringCanceled$credentials_play_services_auth_release());
                }
                function2.invoke(cancellationSignal, new AwS432S0200000_31(function1, (Function1<? super AbstractC20027413Xs, Unit>) c259800zU, (C259800zU<AbstractC20027413Xs>) 16));
                return true;
            }
            return false;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, X.14yp] */
        /* JADX WARN: Type inference failed for: r1v2, types: [T, X.14yn] */
        public final boolean maybeReportErrorResultCodeGet(int i, Function2<? super CancellationSignal, ? super Function0<Unit>, Unit> function2, Function1<? super AbstractC20027713Xv, Unit> function1, CancellationSignal cancellationSignal) {
            if (i != -1) {
                C259800zU c259800zU = new C259800zU();
                c259800zU.element = new C20442114yp(generateErrorStringUnknown$credentials_play_services_auth_release(i));
                if (i == 0) {
                    c259800zU.element = new C20441914yn(generateErrorStringCanceled$credentials_play_services_auth_release());
                }
                function2.invoke(cancellationSignal, new AwS432S0200000_31(function1, (Function1<? super AbstractC20027413Xs, Unit>) c259800zU, (C259800zU<AbstractC20027413Xs>) 17));
                return true;
            }
            return false;
        }
    }

    public CredentialProviderController(Context context) {
        super(context);
        this.context = context;
    }

    public final boolean maybeReportErrorFromResultReceiver(Bundle bundle, Function2<? super String, ? super String, ? extends E1> function2, Executor executor, C15MM<R1, E1> c15mm, CancellationSignal cancellationSignal) {
        if (!bundle.getBoolean("FAILURE_RESPONSE")) {
            return false;
        }
        cancelOrCallbackExceptionOrResult(cancellationSignal, new AwS275S0300000_31(executor, (Executor) c15mm, (C15MM<R1, int>) function2.invoke(bundle.getString("EXCEPTION_TYPE"), bundle.getString("EXCEPTION_MESSAGE")), 3));
        return true;
    }
}
