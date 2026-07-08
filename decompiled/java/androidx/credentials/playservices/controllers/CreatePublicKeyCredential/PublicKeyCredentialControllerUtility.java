package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.AbstractC20027413Xs;
import X.AbstractC20027713Xv;
import X.AbstractC20446014zS;
import X.C0W3J;
import X.C13XC;
import X.C13XD;
import X.C19838812ji;
import X.C19843312kR;
import X.C19844012kY;
import X.C19844212ka;
import X.C19845912kr;
import X.C19846012ks;
import X.C19846212ku;
import X.C19846412kw;
import X.C19846612ky;
import X.C19846812l0;
import X.C19847012l2;
import X.C19847212l4;
import X.C19847412l6;
import X.C19847612l8;
import X.C19848812lK;
import X.C19849012lM;
import X.C20027513Xt;
import X.C20441714yl;
import X.C20441914yn;
import X.C20442114yp;
import X.C20443514z3;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C836310WrN;
import X.C836330WrP;
import X.InterfaceC1294060jmO;
import android.util.Base64;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public final class PublicKeyCredentialControllerUtility {
    public static final Companion Companion = new Companion();
    public static final String JSON_KEY_CLIENT_DATA = "clientDataJSON";
    public static final String JSON_KEY_ATTESTATION_OBJ = "attestationObject";
    public static final String JSON_KEY_AUTH_DATA = "authenticatorData";
    public static final String JSON_KEY_SIGNATURE = "signature";
    public static final String JSON_KEY_USER_HANDLE = "userHandle";
    public static final String JSON_KEY_RESPONSE = "response";
    public static final String JSON_KEY_ID = FollowStatusChangeMethod.PARAM_UID;
    public static final String JSON_KEY_RAW_ID = "rawId";
    public static final String JSON_KEY_TYPE = "type";
    public static final String JSON_KEY_RPID = "rpId";
    public static final String JSON_KEY_CHALLENGE = "challenge";
    public static final String JSON_KEY_APPID = "appid";
    public static final String JSON_KEY_THIRD_PARTY_PAYMENT = "thirdPartyPayment";
    public static final String JSON_KEY_AUTH_SELECTION = "authenticatorSelection";
    public static final String JSON_KEY_REQUIRE_RES_KEY = "requireResidentKey";
    public static final String JSON_KEY_RES_KEY = "residentKey";
    public static final String JSON_KEY_AUTH_ATTACHMENT = "authenticatorAttachment";
    public static final String JSON_KEY_TIMEOUT = "timeout";
    public static final String JSON_KEY_EXCLUDE_CREDENTIALS = "excludeCredentials";
    public static final String JSON_KEY_TRANSPORTS = "transports";
    public static final String JSON_KEY_RP = "rp";
    public static final String JSON_KEY_NAME = "name";
    public static final String JSON_KEY_ICON = "icon";
    public static final String JSON_KEY_ALG = "alg";
    public static final String JSON_KEY_USER = "user";
    public static final String JSON_KEY_DISPLAY_NAME = "displayName";
    public static final String JSON_KEY_USER_VERIFICATION_METHOD = "userVerificationMethod";
    public static final String JSON_KEY_KEY_PROTECTION_TYPE = "keyProtectionType";
    public static final String JSON_KEY_MATCHER_PROTECTION_TYPE = "matcherProtectionType";
    public static final String JSON_KEY_EXTENSTIONS = "extensions";
    public static final String JSON_KEY_ATTESTATION = "attestation";
    public static final String JSON_KEY_PUB_KEY_CRED_PARAMS = "pubKeyCredParams";
    public static final String JSON_KEY_CLIENT_EXTENSION_RESULTS = "clientExtensionResults";
    public static final String JSON_KEY_RK = "rk";
    public static final String JSON_KEY_CRED_PROPS = "credProps";
    public static final LinkedHashMap<ErrorCode, AbstractC20446014zS> orderedErrorCodeToExceptions = C2097608Jq.LJII(new Pair(ErrorCode.UNKNOWN_ERR, new C19848812lK()), new Pair(ErrorCode.ABORT_ERR, new C19845912kr()), new Pair(ErrorCode.ATTESTATION_NOT_PRIVATE_ERR, new C19847012l2()), new Pair(ErrorCode.CONSTRAINT_ERR, new C19846012ks()), new Pair(ErrorCode.DATA_ERR, new C19846212ku()), new Pair(ErrorCode.INVALID_STATE_ERR, new C19846412kw()), new Pair(ErrorCode.ENCODING_ERR, new C19849012lM()), new Pair(ErrorCode.NETWORK_ERR, new C19846612ky()), new Pair(ErrorCode.NOT_ALLOWED_ERR, new C19846812l0()), new Pair(ErrorCode.NOT_SUPPORTED_ERR, new C19847212l4()), new Pair(ErrorCode.SECURITY_ERR, new C19847412l6()), new Pair(ErrorCode.TIMEOUT_ERR, new C19847612l8()));

    public static final PublicKeyCredentialCreationOptions convert(C13XD c13xd) {
        return Companion.convert(c13xd);
    }

    public static final class Companion {
        public final String getJSON_KEY_ALG$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ALG;
        }

        public final String getJSON_KEY_APPID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_APPID;
        }

        public final String getJSON_KEY_ATTESTATION$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION;
        }

        public final String getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION_OBJ;
        }

        public final String getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_ATTACHMENT;
        }

        public final String getJSON_KEY_AUTH_DATA$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_DATA;
        }

        public final String getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_SELECTION;
        }

        public final String getJSON_KEY_CHALLENGE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE;
        }

        public final String getJSON_KEY_CLIENT_DATA$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA;
        }

        public final String getJSON_KEY_CLIENT_EXTENSION_RESULTS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_EXTENSION_RESULTS;
        }

        public final String getJSON_KEY_CRED_PROPS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CRED_PROPS;
        }

        public final String getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME;
        }

        public final String getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXCLUDE_CREDENTIALS;
        }

        public final String getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS;
        }

        public final String getJSON_KEY_ICON$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ICON;
        }

        public final String getJSON_KEY_ID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        }

        public final String getJSON_KEY_KEY_PROTECTION_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_KEY_PROTECTION_TYPE;
        }

        public final String getJSON_KEY_MATCHER_PROTECTION_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_MATCHER_PROTECTION_TYPE;
        }

        public final String getJSON_KEY_NAME$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        }

        public final String getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_PUB_KEY_CRED_PARAMS;
        }

        public final String getJSON_KEY_RAW_ID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RAW_ID;
        }

        public final String getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_REQUIRE_RES_KEY;
        }

        public final String getJSON_KEY_RESPONSE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
        }

        public final String getJSON_KEY_RES_KEY$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RES_KEY;
        }

        public final String getJSON_KEY_RK$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RK;
        }

        public final String getJSON_KEY_RP$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RP;
        }

        public final String getJSON_KEY_RPID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RPID;
        }

        public final String getJSON_KEY_SIGNATURE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE;
        }

        public final String getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_THIRD_PARTY_PAYMENT;
        }

        public final String getJSON_KEY_TIMEOUT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
        }

        public final String getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS;
        }

        public final String getJSON_KEY_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        }

        public final String getJSON_KEY_USER$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        }

        public final String getJSON_KEY_USER_HANDLE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_HANDLE;
        }

        public final String getJSON_KEY_USER_VERIFICATION_METHOD$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_VERIFICATION_METHOD;
        }

        public final LinkedHashMap<ErrorCode, AbstractC20446014zS> getOrderedErrorCodeToExceptions$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions;
        }

        private final byte[] getChallenge(JSONObject jSONObject) throws JSONException {
            String strOptString = jSONObject.optString(getJSON_KEY_CHALLENGE$credentials_play_services_auth_release(), "");
            if (strOptString.length() == 0) {
                throw new JSONException("Challenge not found in request or is unexpectedly empty");
            }
            return b64Decode(strOptString);
        }

        public final byte[] b64Decode(String str) {
            return Base64.decode(str, 11);
        }

        public final String b64Encode(byte[] bArr) {
            return Base64.encodeToString(bArr, 11);
        }

        public final boolean checkAlgSupported(int i) {
            try {
                COSEAlgorithmIdentifier.LIZ(i);
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return false;
            }
        }

        public final PublicKeyCredentialCreationOptions convert(C13XD c13xd) {
            return convertJSON$credentials_play_services_auth_release(new JSONObject(c13xd.LJI));
        }

        public final PublicKeyCredentialCreationOptions convertJSON$credentials_play_services_auth_release(JSONObject jSONObject) throws Exception {
            String string;
            C19844012kY c19844012kY = new C19844012kY();
            parseRequiredChallengeAndUser$credentials_play_services_auth_release(jSONObject, c19844012kY);
            parseRequiredRpAndParams$credentials_play_services_auth_release(jSONObject, c19844012kY);
            parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release(jSONObject, c19844012kY);
            parseOptionalTimeout$credentials_play_services_auth_release(jSONObject, c19844012kY);
            parseOptionalAuthenticatorSelection$credentials_play_services_auth_release(jSONObject, c19844012kY);
            parseOptionalExtensions$credentials_play_services_auth_release(jSONObject, c19844012kY);
            PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = c19844012kY.LIZ;
            PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = c19844012kY.LIZIZ;
            byte[] bArr = c19844012kY.LIZJ;
            List list = c19844012kY.LIZLLL;
            Double d = c19844012kY.LJ;
            List list2 = c19844012kY.LJFF;
            AuthenticatorSelectionCriteria authenticatorSelectionCriteria = c19844012kY.LJI;
            AttestationConveyancePreference attestationConveyancePreference = c19844012kY.LJII;
            if (attestationConveyancePreference == null) {
                string = null;
            } else {
                string = attestationConveyancePreference.toString();
            }
            return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArr, list, d, list2, authenticatorSelectionCriteria, null, null, string, c19844012kY.LJIIIIZZ);
        }

        public final BeginSignInRequest.PasskeyJsonRequestOptions convertToPlayAuthPasskeyJsonRequest(C13XC c13xc) {
            C836330WrP c836330WrP = new C836330WrP();
            c836330WrP.LIZ = true;
            c836330WrP.LIZIZ = c13xc.LJFF;
            return new BeginSignInRequest.PasskeyJsonRequestOptions(c836330WrP.LIZ, c836330WrP.LIZIZ);
        }

        @InterfaceC1294060jmO
        public final BeginSignInRequest.PasskeysRequestOptions convertToPlayAuthPasskeyRequest(C13XC c13xc) throws JSONException {
            JSONObject jSONObject = new JSONObject(c13xc.LJFF);
            String strOptString = jSONObject.optString(getJSON_KEY_RPID$credentials_play_services_auth_release(), "");
            if (strOptString.length() == 0) {
                throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
            }
            byte[] challenge = getChallenge(jSONObject);
            C836310WrN c836310WrN = new C836310WrN();
            c836310WrN.LIZ = true;
            c836310WrN.LIZJ = strOptString;
            c836310WrN.LIZIZ = challenge;
            boolean z = c836310WrN.LIZ;
            return new BeginSignInRequest.PasskeysRequestOptions(c836310WrN.LIZJ, c836310WrN.LIZIZ, z);
        }

        public final AbstractC20027413Xs publicKeyCredentialResponseContainsError(PublicKeyCredential publicKeyCredential) {
            AuthenticatorResponse authenticatorResponseLJLZ = publicKeyCredential.LJLZ();
            if (authenticatorResponseLJLZ instanceof AuthenticatorErrorResponse) {
                AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) authenticatorResponseLJLZ;
                ErrorCode errorCode = authenticatorErrorResponse.zza;
                AbstractC20446014zS abstractC20446014zS = getOrderedErrorCodeToExceptions$credentials_play_services_auth_release().get(errorCode);
                String str = authenticatorErrorResponse.zzb;
                if (abstractC20446014zS == null) {
                    C19848812lK c19848812lK = new C19848812lK();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("unknown fido gms exception - ");
                    sbLIZ.append(str);
                    return new C20443514z3(c19848812lK, C2188811AlT.LIZIZ(sbLIZ));
                }
                if (errorCode == ErrorCode.CONSTRAINT_ERR && str != null && a0.LJJIIZI(str, "Unable to get sync account", false)) {
                    return new C20027513Xt("Passkey registration was cancelled by the user.");
                }
                return new C20443514z3(abstractC20446014zS, str);
            }
            return null;
        }

        public final String toAssertPasskeyResponse(SignInCredential signInCredential) {
            AuthenticatorResponse authenticatorResponseLJLZ;
            JSONObject jSONObject = new JSONObject();
            PublicKeyCredential publicKeyCredential = signInCredential.zbi;
            if (publicKeyCredential != null) {
                authenticatorResponseLJLZ = publicKeyCredential.LJLZ();
            } else {
                authenticatorResponseLJLZ = null;
            }
            if (!(authenticatorResponseLJLZ instanceof AuthenticatorErrorResponse)) {
                if (authenticatorResponseLJLZ instanceof AuthenticatorAssertionResponse) {
                    try {
                        return publicKeyCredential.LLFFF();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("The PublicKeyCredential response json had an unexpected exception when parsing: ");
                        sbLIZ.append(th.getMessage());
                        throw new C20442114yp(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
                return C786410Ut5.J3(jSONObject);
            }
            AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) authenticatorResponseLJLZ;
            throw beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release(authenticatorErrorResponse.zza, authenticatorErrorResponse.zzb);
        }

        public final AbstractC20027713Xv beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release(ErrorCode errorCode, String str) {
            AbstractC20446014zS abstractC20446014zS = getOrderedErrorCodeToExceptions$credentials_play_services_auth_release().get(errorCode);
            if (abstractC20446014zS == null) {
                C19848812lK c19848812lK = new C19848812lK();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unknown fido gms exception - ");
                sbLIZ.append(str);
                return new C20441714yl(c19848812lK, C2188811AlT.LIZIZ(sbLIZ));
            }
            if (errorCode == ErrorCode.CONSTRAINT_ERR && str != null && a0.LJJIIZI(str, "Unable to get sync account", false)) {
                return new C20441914yn("Passkey retrieval was cancelled by the user.");
            }
            return new C20441714yl(abstractC20446014zS, str);
        }

        public final void parseOptionalAuthenticatorSelection$credentials_play_services_auth_release(JSONObject jSONObject, C19844012kY c19844012kY) throws Exception {
            boolean z;
            ResidentKeyRequirement residentKeyRequirementFromString;
            String string;
            String string2;
            if (jSONObject.has(getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release())) {
                JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release());
                C19843312kR c19843312kR = new C19843312kR();
                boolean zOptBoolean = jSONObject2.optBoolean(getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth_release(), false);
                String strOptString = jSONObject2.optString(getJSON_KEY_RES_KEY$credentials_play_services_auth_release(), "");
                if (strOptString.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    residentKeyRequirementFromString = ResidentKeyRequirement.fromString(strOptString);
                } else {
                    residentKeyRequirementFromString = null;
                }
                c19843312kR.LIZIZ = Boolean.valueOf(zOptBoolean);
                c19843312kR.LIZJ = residentKeyRequirementFromString;
                String strOptString2 = jSONObject2.optString(getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth_release(), "");
                if (strOptString2.length() > 0) {
                    c19843312kR.LIZ = Attachment.fromString(strOptString2);
                }
                Attachment attachment = c19843312kR.LIZ;
                if (attachment == null) {
                    string = null;
                } else {
                    string = attachment.toString();
                }
                Boolean bool = c19843312kR.LIZIZ;
                ResidentKeyRequirement residentKeyRequirement = c19843312kR.LIZJ;
                if (residentKeyRequirement == null) {
                    string2 = null;
                } else {
                    string2 = residentKeyRequirement.toString();
                }
                c19844012kY.LJI = new AuthenticatorSelectionCriteria(string, bool, null, string2);
            }
        }

        public final void parseOptionalExtensions$credentials_play_services_auth_release(JSONObject jSONObject, C19844012kY c19844012kY) {
            if (jSONObject.has(getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release())) {
                JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release());
                C19838812ji c19838812ji = new C19838812ji();
                String strOptString = jSONObject2.optString(getJSON_KEY_APPID$credentials_play_services_auth_release(), "");
                if (strOptString.length() > 0) {
                    c19838812ji.LIZ = new FidoAppIdExtension(strOptString);
                }
                if (jSONObject2.optBoolean(getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth_release(), false)) {
                    c19838812ji.LIZJ = new GoogleThirdPartyPaymentExtension(true);
                }
                if (jSONObject2.optBoolean("uvm", false)) {
                    c19838812ji.LIZIZ = new UserVerificationMethodExtension(true);
                }
                c19844012kY.LJIIIIZZ = new AuthenticationExtensions(c19838812ji.LIZ, null, c19838812ji.LIZIZ, null, null, null, null, null, c19838812ji.LIZJ, null);
            }
        }

        public final void parseOptionalTimeout$credentials_play_services_auth_release(JSONObject jSONObject, C19844012kY c19844012kY) {
            if (jSONObject.has(getJSON_KEY_TIMEOUT$credentials_play_services_auth_release())) {
                c19844012kY.LJ = Double.valueOf(JSONObjectProtectorUtils.getLong(jSONObject, getJSON_KEY_TIMEOUT$credentials_play_services_auth_release()) / ((double) LSPassThroughRecordSizeConfig.DEFAULT));
            }
        }

        public final void parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release(JSONObject jSONObject, C19844012kY c19844012kY) throws JSONException, C20443514z3 {
            ArrayList arrayList;
            ArrayList arrayList2 = new ArrayList();
            if (jSONObject.has(getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release())) {
                JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release());
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                    byte[] bArrB64Decode = b64Decode(JSONObjectProtectorUtils.getString(jSONObject2, getJSON_KEY_ID$credentials_play_services_auth_release()));
                    String string = JSONObjectProtectorUtils.getString(jSONObject2, getJSON_KEY_TYPE$credentials_play_services_auth_release());
                    if (string.length() == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor type value is not found or unexpectedly empty");
                    }
                    if (bArrB64Decode.length == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor id value is not found or unexpectedly empty");
                    }
                    if (jSONObject2.has(getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release())) {
                        arrayList = new ArrayList();
                        JSONArray jSONArray2 = JSONObjectProtectorUtils.getJSONArray(jSONObject2, getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release());
                        int length2 = jSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            try {
                                arrayList.add(Transport.fromString(JSONArrayProtectorUtils.getString(jSONArray2, i2)));
                            } catch (C19844212ka e) {
                                TryCatchGuardChecker.doCheck(e);
                                throw new C20443514z3(new C19849012lM(), e.getMessage());
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    arrayList2.add(new PublicKeyCredentialDescriptor(string, arrayList, bArrB64Decode));
                }
            }
            c19844012kY.LJFF = arrayList2;
            String str = "none";
            String strOptString = jSONObject.optString(getJSON_KEY_ATTESTATION$credentials_play_services_auth_release(), "none");
            if (strOptString.length() != 0) {
                str = strOptString;
            }
            c19844012kY.LJII = AttestationConveyancePreference.fromString(str);
        }

        public final void parseRequiredChallengeAndUser$credentials_play_services_auth_release(JSONObject jSONObject, C19844012kY c19844012kY) throws JSONException {
            byte[] challenge = getChallenge(jSONObject);
            c19844012kY.getClass();
            C0W3J.LJIIIIZZ(challenge);
            c19844012kY.LIZJ = challenge;
            JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, getJSON_KEY_USER$credentials_play_services_auth_release());
            byte[] bArrB64Decode = b64Decode(JSONObjectProtectorUtils.getString(jSONObject2, getJSON_KEY_ID$credentials_play_services_auth_release()));
            String string = JSONObjectProtectorUtils.getString(jSONObject2, getJSON_KEY_NAME$credentials_play_services_auth_release());
            String string2 = JSONObjectProtectorUtils.getString(jSONObject2, getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth_release());
            String strOptString = jSONObject2.optString(getJSON_KEY_ICON$credentials_play_services_auth_release(), "");
            if (string2.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing displayName or they are unexpectedly empty");
            }
            if (bArrB64Decode.length == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user id or they are unexpectedly empty");
            }
            if (string.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user name or they are unexpectedly empty");
            }
            c19844012kY.LIZIZ = new PublicKeyCredentialUserEntity(string, strOptString, string2, bArrB64Decode);
        }

        public final void parseRequiredRpAndParams$credentials_play_services_auth_release(JSONObject jSONObject, C19844012kY c19844012kY) throws JSONException {
            JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, getJSON_KEY_RP$credentials_play_services_auth_release());
            String string = JSONObjectProtectorUtils.getString(jSONObject2, getJSON_KEY_ID$credentials_play_services_auth_release());
            String strOptString = jSONObject2.optString(getJSON_KEY_NAME$credentials_play_services_auth_release(), "");
            String strOptString2 = jSONObject2.optString(getJSON_KEY_ICON$credentials_play_services_auth_release(), "");
            if (strOptString2.length() == 0) {
                strOptString2 = null;
            }
            if (strOptString.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp name is missing or unexpectedly empty");
            }
            if (string.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp ID is missing or unexpectedly empty");
            }
            PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = new PublicKeyCredentialRpEntity(string, strOptString, strOptString2);
            c19844012kY.getClass();
            c19844012kY.LIZ = publicKeyCredentialRpEntity;
            JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth_release());
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject3 = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                int i2 = (int) JSONObjectProtectorUtils.getLong(jSONObject3, getJSON_KEY_ALG$credentials_play_services_auth_release());
                String strOptString3 = jSONObject3.optString(getJSON_KEY_TYPE$credentials_play_services_auth_release(), "");
                if (strOptString3.length() == 0) {
                    throw new JSONException("PublicKeyCredentialCreationOptions PublicKeyCredentialParameter type missing or unexpectedly empty");
                }
                if (checkAlgSupported(i2)) {
                    arrayList.add(new PublicKeyCredentialParameters(strOptString3, i2));
                }
            }
            c19844012kY.LIZLLL = arrayList;
        }

        public final void addAuthenticatorAttestationResponse$credentials_play_services_auth_release(byte[] bArr, byte[] bArr2, String[] strArr, JSONObject jSONObject) throws JSONException {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(getJSON_KEY_CLIENT_DATA$credentials_play_services_auth_release(), b64Encode(bArr));
            jSONObject2.put(getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth_release(), b64Encode(bArr2));
            jSONObject2.put(getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release(), new JSONArray(strArr));
            jSONObject.put(getJSON_KEY_RESPONSE$credentials_play_services_auth_release(), jSONObject2);
        }
    }
}
