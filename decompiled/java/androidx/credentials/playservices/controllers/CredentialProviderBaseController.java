package androidx.credentials.playservices.controllers;

import X.AbstractC20027413Xs;
import X.AbstractC20027713Xv;
import X.C13LQ;
import X.C20027513Xt;
import X.C20441914yn;
import X.C20442014yo;
import X.C20442114yp;
import X.C20442214yq;
import X.C20444314zB;
import X.C20444514zD;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.ResultReceiver;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public class CredentialProviderBaseController {
    public final Context context;
    public static final Companion Companion = new Companion();
    public static final Set<Integer> retryables = C13LQ.LJLIIL(new Integer[]{7, 20});
    public static final int CONTROLLER_REQUEST_CODE = 1;

    public static final int getCONTROLLER_REQUEST_CODE() {
        return Companion.getCONTROLLER_REQUEST_CODE();
    }

    public static final class Companion {
        public static /* synthetic */ void getCONTROLLER_REQUEST_CODE$annotations() {
        }

        public final int getCONTROLLER_REQUEST_CODE() {
            return CredentialProviderBaseController.CONTROLLER_REQUEST_CODE;
        }

        public final Set<Integer> getRetryables() {
            return CredentialProviderBaseController.retryables;
        }

        public final AbstractC20027413Xs createCredentialExceptionTypeToException$credentials_play_services_auth_release(String str, String str2) {
            if (Intrinsics.LJFF(str, "CREATE_CANCELED")) {
                return new C20027513Xt(str2);
            }
            if (Intrinsics.LJFF(str, "CREATE_INTERRUPTED")) {
                return new C20444314zB(str2);
            }
            return new C20444514zD(str2);
        }

        public final AbstractC20027713Xv getCredentialExceptionTypeToException$credentials_play_services_auth_release(String str, String str2) {
            if (str != null) {
                int iHashCode = str.hashCode();
                if (iHashCode != -1567968963) {
                    if (iHashCode != -154594663) {
                        if (iHashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                            return new C20442214yq(str2);
                        }
                    } else if (str.equals("GET_INTERRUPTED")) {
                        return new C20442014yo(str2);
                    }
                } else if (str.equals("GET_CANCELED_TAG")) {
                    return new C20441914yn(str2);
                }
            }
            return new C20442114yp(str2);
        }
    }

    public CredentialProviderBaseController(Context context) {
        this.context = context;
    }

    public final <T extends ResultReceiver> ResultReceiver toIpcFriendlyResultReceiver(T t) {
        Parcel parcelObtain = Parcel.obtain();
        t.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        ResultReceiver resultReceiver = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return resultReceiver;
    }

    public final void generateHiddenActivityIntent(ResultReceiver resultReceiver, Intent intent, String str) {
        intent.putExtra("TYPE", str);
        intent.putExtra("ACTIVITY_REQUEST_CODE", CONTROLLER_REQUEST_CODE);
        intent.putExtra("RESULT_RECEIVER", toIpcFriendlyResultReceiver(resultReceiver));
        intent.setFlags(65536);
    }
}
