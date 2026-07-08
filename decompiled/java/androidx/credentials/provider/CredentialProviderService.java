package androidx.credentials.provider;

import X.C08CX;
import X.C13LP;
import X.C13XT;
import X.C13XU;
import X.C1777830wMf;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C788530UwV;
import X.C817700W5w;
import android.content.Context;
import android.credentials.ClearCredentialStateException;
import android.credentials.GetCredentialException;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import android.service.credentials.BeginGetCredentialOption;
import android.service.credentials.BeginGetCredentialRequest;
import android.service.credentials.BeginGetCredentialResponse;
import android.service.credentials.CallingAppInfo;
import android.service.credentials.ClearCredentialStateRequest;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public abstract class CredentialProviderService extends android.service.credentials.CredentialProviderService {
    public abstract void LIZ();

    public abstract void LIZIZ();

    public abstract void LIZJ();

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        super.attachBaseContext(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006f A[Catch: 13XT -> 0x0091, TryCatch #0 {13XT -> 0x0091, blocks: (B:2:0x0000, B:6:0x0012, B:8:0x001a, B:10:0x0024, B:13:0x0045, B:14:0x004d, B:20:0x006f, B:22:0x007c, B:23:0x008b, B:15:0x004e, B:17:0x0056, B:19:0x005f, B:11:0x0033), top: B:31:0x0000, inners: #1 }] */
    @Override // android.service.credentials.CredentialProviderService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBeginCreateCredential(android.service.credentials.BeginCreateCredentialRequest r5, android.os.CancellationSignal r6, android.os.OutcomeReceiver<android.service.credentials.BeginCreateCredentialResponse, android.credentials.CreateCredentialException> r7) {
        /*
            r4 = this;
            java.lang.String r2 = r5.getType()     // Catch: X.C13XT -> L91
            int r1 = r2.hashCode()     // Catch: X.C13XT -> L91
            r0 = -543568185(0xffffffffdf99cec7, float:-2.216603E19)
            if (r1 == r0) goto L4e
            r0 = -95037569(0xfffffffffa55d77f, float:-2.775825E35)
            if (r1 != r0) goto L6f
            java.lang.String r0 = "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL"
            boolean r0 = r2.equals(r0)     // Catch: X.C13XT -> L91
            if (r0 == 0) goto L6f
            android.os.Bundle r3 = r5.getData()     // Catch: X.C13XT -> L91
            android.service.credentials.CallingAppInfo r2 = r5.getCallingAppInfo()     // Catch: X.C13XT -> L91
            if (r2 == 0) goto L33
            X.0wMf r1 = new X.0wMf     // Catch: X.C13XT -> L91
            java.lang.String r0 = r2.getPackageName()     // Catch: X.C13XT -> L91
            r2.getSigningInfo()     // Catch: X.C13XT -> L91
            r2.getOrigin()     // Catch: X.C13XT -> L91
            r1.<init>(r0)     // Catch: X.C13XT -> L91
        L33:
            java.lang.String r0 = "androidx.credentials.BUNDLE_KEY_REQUEST_JSON"
            java.lang.String r1 = r3.getString(r0)     // Catch: java.lang.Exception -> L44
            java.lang.String r0 = "androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH"
            r3.getByteArray(r0)     // Catch: java.lang.Exception -> L44
            X.13XH r0 = new X.13XH     // Catch: java.lang.Exception -> L44
            r0.<init>(r1, r3)     // Catch: java.lang.Exception -> L44
            goto Lb6
        L44:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: X.C13XT -> L91
            X.13XT r0 = new X.13XT     // Catch: X.C13XT -> L91
            r0.<init>()     // Catch: X.C13XT -> L91
            throw r0     // Catch: X.C13XT -> L91
        L4e:
            java.lang.String r0 = "android.credentials.TYPE_PASSWORD_CREDENTIAL"
            boolean r0 = r2.equals(r0)     // Catch: X.C13XT -> L91
            if (r0 == 0) goto L6f
            r5.getData()     // Catch: X.C13XT -> L91
            android.service.credentials.CallingAppInfo r2 = r5.getCallingAppInfo()     // Catch: X.C13XT -> L91
            if (r2 == 0) goto Lb6
            X.0wMf r1 = new X.0wMf     // Catch: X.C13XT -> L91
            java.lang.String r0 = r2.getPackageName()     // Catch: X.C13XT -> L91
            r2.getSigningInfo()     // Catch: X.C13XT -> L91
            r2.getOrigin()     // Catch: X.C13XT -> L91
            r1.<init>(r0)     // Catch: X.C13XT -> L91
            goto Lb6
        L6f:
            java.lang.String r3 = r5.getType()     // Catch: X.C13XT -> L91
            r5.getData()     // Catch: X.C13XT -> L91
            android.service.credentials.CallingAppInfo r2 = r5.getCallingAppInfo()     // Catch: X.C13XT -> L91
            if (r2 == 0) goto L8b
            X.0wMf r1 = new X.0wMf     // Catch: X.C13XT -> L91
            java.lang.String r0 = r2.getPackageName()     // Catch: X.C13XT -> L91
            r2.getSigningInfo()     // Catch: X.C13XT -> L91
            r2.getOrigin()     // Catch: X.C13XT -> L91
            r1.<init>(r0)     // Catch: X.C13XT -> L91
        L8b:
            X.13XL r0 = new X.13XL     // Catch: X.C13XT -> L91
            r0.<init>(r3)     // Catch: X.C13XT -> L91
            goto Lb6
        L91:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r3 = r5.getType()
            r5.getData()
            android.service.credentials.CallingAppInfo r2 = r5.getCallingAppInfo()
            if (r2 == 0) goto Lb1
            X.0wMf r1 = new X.0wMf
            java.lang.String r0 = r2.getPackageName()
            r2.getSigningInfo()
            r2.getOrigin()
            r1.<init>(r0)
        Lb1:
            X.13XL r0 = new X.13XL
            r0.<init>(r3)
        Lb6:
            r4.LIZ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.provider.CredentialProviderService.onBeginCreateCredential(android.service.credentials.BeginCreateCredentialRequest, android.os.CancellationSignal, android.os.OutcomeReceiver):void");
    }

    @Override // android.service.credentials.CredentialProviderService
    public final void onBeginGetCredential(BeginGetCredentialRequest beginGetCredentialRequest, CancellationSignal cancellationSignal, OutcomeReceiver<BeginGetCredentialResponse, GetCredentialException> outcomeReceiver) throws C13XT {
        C13XU c13xu;
        final Set setLLIIJI;
        ArrayList arrayList = new ArrayList();
        for (BeginGetCredentialOption beginGetCredentialOption : beginGetCredentialRequest.getBeginGetCredentialOptions()) {
            final String id = beginGetCredentialOption.getId();
            final String type = beginGetCredentialOption.getType();
            final Bundle candidateQueryData = beginGetCredentialOption.getCandidateQueryData();
            if (Intrinsics.LJFF(type, "android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                ArrayList<String> stringArrayList = candidateQueryData.getStringArrayList("androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS");
                if (stringArrayList == null || (setLLIIJI = C13LP.LLIIJI(stringArrayList)) == null) {
                    setLLIIJI = C08CX.INSTANCE;
                }
                c13xu = new C13XU(setLLIIJI, candidateQueryData, id) { // from class: X.13XQ
                    public static final /* synthetic */ int LIZJ = 0;
                    public final Set<String> LIZIZ;

                    {
                        super(id, candidateQueryData);
                        this.LIZIZ = setLLIIJI;
                    }
                };
            } else if (Intrinsics.LJFF(type, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                try {
                    final String string = candidateQueryData.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                    candidateQueryData.getByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH");
                    c13xu = new C13XU(candidateQueryData, id, string) { // from class: X.13XO
                        public static final /* synthetic */ int LIZIZ = 0;

                        {
                            if (string.length() != 0) {
                                try {
                                    new JSONObject(string);
                                    return;
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                            "requestJson must not be empty, and must be a valid JSON".toString();
                            throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
                        }
                    };
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new C13XT();
                }
            } else {
                c13xu = new C13XU(id, type, candidateQueryData) { // from class: X.13XP
                    {
                        super(id, candidateQueryData);
                        if (id.length() > 0) {
                            if (type.length() > 0) {
                                return;
                            }
                            "type should not be empty".toString();
                            throw new IllegalArgumentException("type should not be empty");
                        }
                        "id should not be empty".toString();
                        throw new IllegalArgumentException("id should not be empty");
                    }
                };
            }
            arrayList.add(c13xu);
        }
        CallingAppInfo callingAppInfo = beginGetCredentialRequest.getCallingAppInfo();
        if (callingAppInfo != null) {
            String packageName = callingAppInfo.getPackageName();
            callingAppInfo.getSigningInfo();
            callingAppInfo.getOrigin();
            new C1777830wMf(packageName);
        }
        LIZIZ();
    }

    @Override // android.service.credentials.CredentialProviderService
    public final void onClearCredentialState(ClearCredentialStateRequest clearCredentialStateRequest, CancellationSignal cancellationSignal, OutcomeReceiver<Void, ClearCredentialStateException> outcomeReceiver) {
        String packageName = clearCredentialStateRequest.getCallingAppInfo().getPackageName();
        clearCredentialStateRequest.getCallingAppInfo().getSigningInfo();
        clearCredentialStateRequest.getCallingAppInfo().getOrigin();
        new C1777830wMf(packageName);
        LIZJ();
    }
}
