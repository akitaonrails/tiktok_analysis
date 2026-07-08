package androidx.credentials.playservices.controllers.BeginSignIn;

import X.AbstractC836950WsP;
import X.C0W3J;
import X.C13XC;
import X.C20444114z9;
import X.C786410Ut5;
import X.C836250WrH;
import X.C836280WrK;
import X.C836300WrM;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: classes14.dex */
public final class BeginSignInControllerUtility {
    public static final Companion Companion = new Companion();

    public static final class Companion {
        private final boolean needsBackwardsCompatibleRequest(long j) {
            return j < 231815000;
        }

        private final BeginSignInRequest.GoogleIdTokenRequestOptions convertToGoogleIdTokenOption(C836280WrK c836280WrK) {
            C836300WrM c836300WrM = new C836300WrM();
            c836300WrM.LIZLLL = c836280WrK.LJII;
            c836300WrM.LIZJ = c836280WrK.LJI;
            c836300WrM.LJI = c836280WrK.LJIIJ;
            String str = c836280WrK.LJFF;
            C0W3J.LJI(str);
            c836300WrM.LIZIZ = str;
            c836300WrM.LIZ = true;
            String str2 = c836280WrK.LJIIIIZZ;
            if (str2 != null) {
                List list = c836280WrK.LJIIIZ;
                c836300WrM.LJ = str2;
                c836300WrM.LJFF = list;
            }
            boolean z = c836300WrM.LIZ;
            return new BeginSignInRequest.GoogleIdTokenRequestOptions(c836300WrM.LIZIZ, c836300WrM.LIZJ, c836300WrM.LJ, c836300WrM.LJFF, z, c836300WrM.LIZLLL, c836300WrM.LJI);
        }

        private final long determineDeviceGMSVersionCode(Context context) {
            return C786410Ut5.Y3(context.getPackageManager(), "com.google.android.gms", 0).versionCode;
        }

        public final BeginSignInRequest constructBeginSignInRequest$credentials_play_services_auth_release(C20444114z9 c20444114z9, Context context) throws JSONException {
            C836250WrH c836250WrH = new C836250WrH();
            boolean z = false;
            boolean z2 = false;
            for (AbstractC836950WsP abstractC836950WsP : c20444114z9.LIZ) {
                if ((abstractC836950WsP instanceof C13XC) && !z2) {
                    if (needsBackwardsCompatibleRequest(determineDeviceGMSVersionCode(context))) {
                        BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptionsConvertToPlayAuthPasskeyRequest = PublicKeyCredentialControllerUtility.Companion.convertToPlayAuthPasskeyRequest((C13XC) abstractC836950WsP);
                        C0W3J.LJIIIIZZ(passkeysRequestOptionsConvertToPlayAuthPasskeyRequest);
                        c836250WrH.LIZJ = passkeysRequestOptionsConvertToPlayAuthPasskeyRequest;
                    } else {
                        BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptionsConvertToPlayAuthPasskeyJsonRequest = PublicKeyCredentialControllerUtility.Companion.convertToPlayAuthPasskeyJsonRequest((C13XC) abstractC836950WsP);
                        C0W3J.LJIIIIZZ(passkeyJsonRequestOptionsConvertToPlayAuthPasskeyJsonRequest);
                        c836250WrH.LIZLLL = passkeyJsonRequestOptionsConvertToPlayAuthPasskeyJsonRequest;
                    }
                    z2 = true;
                } else if (abstractC836950WsP instanceof C836280WrK) {
                    C836280WrK c836280WrK = (C836280WrK) abstractC836950WsP;
                    BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptionsConvertToGoogleIdTokenOption = convertToGoogleIdTokenOption(c836280WrK);
                    C0W3J.LJIIIIZZ(googleIdTokenRequestOptionsConvertToGoogleIdTokenOption);
                    c836250WrH.LIZIZ = googleIdTokenRequestOptionsConvertToGoogleIdTokenOption;
                    if (!z && !c836280WrK.LJIIJJI) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
            }
            c836250WrH.LJFF = z;
            return new BeginSignInRequest(c836250WrH.LIZ, c836250WrH.LIZIZ, c836250WrH.LJ, c836250WrH.LJFF, c836250WrH.LJI, c836250WrH.LIZJ, c836250WrH.LIZLLL);
        }
    }
}
