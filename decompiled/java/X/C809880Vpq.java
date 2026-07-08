package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialRequest;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialRequest;
import android.credentials.GetCredentialResponse;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Vpq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C809880Vpq {
    public static InterfaceC20443714z5 LIZ(final Context context) {
        String string;
        if (Build.VERSION.SDK_INT >= 34) {
            return new InterfaceC20443714z5(context) { // from class: X.14z4
                public final CredentialManager LIZ;

                @Override // X.InterfaceC20443714z5
                public final boolean isAvailableOnDevice() {
                    return Build.VERSION.SDK_INT >= 34;
                }

                {
                    this.LIZ = (CredentialManager) C786410Ut5.H2(context, "credential");
                }

                @Override // X.InterfaceC20443714z5
                public final void onCreateCredential(Context context2, AbstractC20444214zA abstractC20444214zA, CancellationSignal cancellationSignal, Executor executor, C15MM<AbstractC20434814xe, AbstractC20027413Xs> c15mm) {
                    int i;
                    final C20443914z7 c20443914z7 = (C20443914z7) c15mm;
                    AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(c20443914z7, 17);
                    if (this.LIZ == null) {
                        awS575S0100000_31.invoke();
                        return;
                    }
                    final C13XD c13xd = (C13XD) abstractC20444214zA;
                    OutcomeReceiver<CreateCredentialResponse, CreateCredentialException> outcomeReceiver = new OutcomeReceiver<CreateCredentialResponse, CreateCredentialException>() { // from class: X.14z2
                        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                        /* JADX WARN: Removed duplicated region for block: B:4:0x0014  */
                        @Override // android.os.OutcomeReceiver
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void onError(java.lang.Throwable r5) {
                            /*
                                r4 = this;
                                android.credentials.CreateCredentialException r5 = (android.credentials.CreateCredentialException) r5
                                X.15MM<X.14xe, X.13Xs> r1 = r1
                                X.14z4 r0 = r3
                                r0.getClass()
                                java.lang.String r2 = r5.getType()
                                int r0 = r2.hashCode()
                                switch(r0) {
                                    case -2055374133: goto L7a;
                                    case 1316905704: goto L68;
                                    case 2092588512: goto L56;
                                    case 2131915191: goto L44;
                                    default: goto L14;
                                }
                            L14:
                                java.lang.String r3 = r5.getType()
                                r2 = 0
                                java.lang.String r0 = "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION"
                                boolean r0 = kotlin.text.u.LJJIIJZLJL(r3, r0, r2)
                                if (r0 == 0) goto L36
                                X.14z1 r3 = X.C20443214z0.Companion
                                java.lang.String r2 = r5.getType()
                                java.lang.String r0 = r5.getMessage()
                                r3.getClass()
                                X.13Xs r3 = X.C20443314z1.LIZ(r2, r0)
                            L32:
                                r1.LIZ(r3)
                                return
                            L36:
                                X.14yh r3 = new X.14yh
                                java.lang.String r2 = r5.getType()
                                java.lang.String r0 = r5.getMessage()
                                r3.<init>(r2, r0)
                                goto L32
                            L44:
                                java.lang.String r0 = "android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS"
                                boolean r0 = r2.equals(r0)
                                if (r0 == 0) goto L14
                                X.14zC r3 = new X.14zC
                                java.lang.String r0 = r5.getMessage()
                                r3.<init>(r0)
                                goto L32
                            L56:
                                java.lang.String r0 = "android.credentials.CreateCredentialException.TYPE_INTERRUPTED"
                                boolean r0 = r2.equals(r0)
                                if (r0 == 0) goto L14
                                X.14zB r3 = new X.14zB
                                java.lang.String r0 = r5.getMessage()
                                r3.<init>(r0)
                                goto L32
                            L68:
                                java.lang.String r0 = "android.credentials.CreateCredentialException.TYPE_UNKNOWN"
                                boolean r0 = r2.equals(r0)
                                if (r0 == 0) goto L14
                                X.14zD r3 = new X.14zD
                                java.lang.String r0 = r5.getMessage()
                                r3.<init>(r0)
                                goto L32
                            L7a:
                                java.lang.String r0 = "android.credentials.CreateCredentialException.TYPE_USER_CANCELED"
                                boolean r0 = r2.equals(r0)
                                if (r0 == 0) goto L14
                                X.13Xt r3 = new X.13Xt
                                java.lang.String r0 = r5.getMessage()
                                r3.<init>(r0)
                                goto L32
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C20443414z2.onError(java.lang.Throwable):void");
                        }

                        @Override // android.os.OutcomeReceiver
                        public final void onResult(CreateCredentialResponse createCredentialResponse) {
                            AbstractC20434814xe c20434614xc;
                            C15MM<AbstractC20434814xe, AbstractC20027413Xs> c15mm2 = c20443914z7;
                            String str = c13xd.LIZ;
                            Bundle data = createCredentialResponse.getData();
                            try {
                                if (Intrinsics.LJFF(str, "android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                                    c20434614xc = new C20444914zH();
                                } else if (Intrinsics.LJFF(str, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                                    try {
                                        c20434614xc = new C20434614xc(data.getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON"));
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        throw new C13XT();
                                    }
                                } else {
                                    throw new C13XT();
                                }
                            } catch (C13XT e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                c20434614xc = new AbstractC20434814xe(str) { // from class: X.14xd
                                    {
                                        if (str.length() > 0) {
                                            return;
                                        }
                                        "type should not be empty".toString();
                                        throw new IllegalArgumentException("type should not be empty");
                                    }
                                };
                            }
                            c15mm2.onResult(c20434614xc);
                        }
                    };
                    CredentialManager credentialManager = this.LIZ;
                    String str = abstractC20444214zA.LIZ;
                    Bundle bundle = abstractC20444214zA.LIZIZ;
                    C13XF c13xf = abstractC20444214zA.LJ;
                    c13xf.getClass();
                    Bundle bundle2 = new Bundle();
                    C786410Ut5.LJJIJIIJI(bundle2, "androidx.credentials.BUNDLE_KEY_USER_ID", c13xf.LIZ);
                    if (!TextUtils.isEmpty(c13xf.LIZIZ)) {
                        C786410Ut5.LJJIJIIJI(bundle2, "androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME", c13xf.LIZIZ);
                    }
                    if (!TextUtils.isEmpty(c13xf.LIZJ)) {
                        C786410Ut5.LJJJI("androidx.credentials.BUNDLE_KEY_DEFAULT_PROVIDER", c13xf.LIZJ, bundle2);
                    }
                    if (abstractC20444214zA instanceof C20445514zN) {
                        i = 2130971837;
                    } else if (abstractC20444214zA instanceof C13XD) {
                        i = R.drawable.c0u;
                    } else {
                        i = 2130971834;
                    }
                    C786410Ut5.LJJIJL(bundle2, "androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON", Icon.createWithResource(context2, i));
                    C786410Ut5.LJJIIZI(bundle, bundle2, "androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO");
                    CreateCredentialRequest.Builder alwaysSendAppInfoToProvider = new CreateCredentialRequest.Builder(str, bundle, abstractC20444214zA.LIZJ).setIsSystemProviderRequired(abstractC20444214zA.LIZLLL).setAlwaysSendAppInfoToProvider(true);
                    String str2 = abstractC20444214zA.LJFF;
                    if (str2 != null) {
                        alwaysSendAppInfoToProvider.setOrigin(str2);
                    }
                    credentialManager.createCredential(context2, alwaysSendAppInfoToProvider.build(), cancellationSignal, executor, outcomeReceiver);
                }

                @Override // X.InterfaceC20443714z5
                public final void onGetCredential(Context context2, C20444114z9 c20444114z9, CancellationSignal cancellationSignal, Executor executor, C15MM<C20433914xV, AbstractC20027713Xv> c15mm) {
                    final C20444014z8 c20444014z8 = (C20444014z8) c15mm;
                    AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(c20444014z8, 18);
                    if (this.LIZ == null) {
                        awS575S0100000_31.invoke();
                        return;
                    }
                    OutcomeReceiver<GetCredentialResponse, GetCredentialException> outcomeReceiver = new OutcomeReceiver<GetCredentialResponse, GetCredentialException>() { // from class: X.14ym
                        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                        /* JADX WARN: Removed duplicated region for block: B:4:0x0014  */
                        @Override // android.os.OutcomeReceiver
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void onError(java.lang.Throwable r5) {
                            /*
                                r4 = this;
                                android.credentials.GetCredentialException r5 = (android.credentials.GetCredentialException) r5
                                X.15MM<X.14xV, X.13Xv> r1 = r1
                                X.14z4 r0 = r2
                                r0.getClass()
                                java.lang.String r2 = r5.getType()
                                int r0 = r2.hashCode()
                                switch(r0) {
                                    case -781118336: goto L7a;
                                    case -45448328: goto L68;
                                    case 580557411: goto L56;
                                    case 627896683: goto L44;
                                    default: goto L14;
                                }
                            L14:
                                java.lang.String r3 = r5.getType()
                                r2 = 0
                                java.lang.String r0 = "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION"
                                boolean r0 = kotlin.text.u.LJJIIJZLJL(r3, r0, r2)
                                if (r0 == 0) goto L36
                                X.14yk r3 = X.C20441514yj.Companion
                                java.lang.String r2 = r5.getType()
                                java.lang.String r0 = r5.getMessage()
                                r3.getClass()
                                X.13Xv r3 = X.C20441614yk.LIZ(r2, r0)
                            L32:
                                r1.LIZ(r3)
                                return
                            L36:
                                X.14yi r3 = new X.14yi
                                java.lang.String r2 = r5.getType()
                                java.lang.String r0 = r5.getMessage()
                                r3.<init>(r2, r0)
                                goto L32
                            L44:
                                java.lang.String r0 = "android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL"
                                boolean r0 = r2.equals(r0)
                                if (r0 == 0) goto L14
                                X.14yq r3 = new X.14yq
                                java.lang.String r0 = r5.getMessage()
                                r3.<init>(r0)
                                goto L32
                            L56:
                                java.lang.String r0 = "android.credentials.GetCredentialException.TYPE_USER_CANCELED"
                                boolean r0 = r2.equals(r0)
                                if (r0 == 0) goto L14
                                X.14yn r3 = new X.14yn
                                java.lang.String r0 = r5.getMessage()
                                r3.<init>(r0)
                                goto L32
                            L68:
                                java.lang.String r0 = "android.credentials.GetCredentialException.TYPE_INTERRUPTED"
                                boolean r0 = r2.equals(r0)
                                if (r0 == 0) goto L14
                                X.14yo r3 = new X.14yo
                                java.lang.String r0 = r5.getMessage()
                                r3.<init>(r0)
                                goto L32
                            L7a:
                                java.lang.String r0 = "android.credentials.GetCredentialException.TYPE_UNKNOWN"
                                boolean r0 = r2.equals(r0)
                                if (r0 == 0) goto L14
                                X.14yp r3 = new X.14yp
                                java.lang.String r0 = r5.getMessage()
                                r3.<init>(r0)
                                goto L32
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C20441814ym.onError(java.lang.Throwable):void");
                        }

                        @Override // android.os.OutcomeReceiver
                        public final void onResult(GetCredentialResponse getCredentialResponse) {
                            AbstractC20432914xL c20434114xX;
                            C15MM<C20433914xV, AbstractC20027713Xv> c15mm2 = c20444014z8;
                            getClass();
                            Credential credential = getCredentialResponse.getCredential();
                            String type = credential.getType();
                            Bundle data = credential.getData();
                            try {
                                if (Intrinsics.LJFF(type, "android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                                    try {
                                        data.getString("androidx.credentials.BUNDLE_KEY_ID");
                                        c20434114xX = new C20436914xz(data.getString("androidx.credentials.BUNDLE_KEY_PASSWORD"), data);
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        throw new C13XT();
                                    }
                                } else if (Intrinsics.LJFF(type, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                                    try {
                                        c20434114xX = new C20434514xb(data.getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON"), data);
                                    } catch (Exception e2) {
                                        TryCatchGuardChecker.doCheck(e2);
                                        throw new C13XT();
                                    }
                                } else {
                                    throw new C13XT();
                                }
                            } catch (C13XT e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                c20434114xX = new C20434114xX(type, data);
                            }
                            c15mm2.onResult(new C20433914xV(c20434114xX));
                        }
                    };
                    CredentialManager credentialManager = this.LIZ;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", c20444114z9.LIZJ);
                    bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", c20444114z9.LJ);
                    C786410Ut5.LJJIJL(bundle, "androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", c20444114z9.LIZLLL);
                    GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder(bundle);
                    for (AbstractC836950WsP abstractC836950WsP : c20444114z9.LIZ) {
                        builder.addCredentialOption(new CredentialOption.Builder(abstractC836950WsP.LIZ, abstractC836950WsP.LIZIZ, abstractC836950WsP.LIZJ).setIsSystemProviderRequired(abstractC836950WsP.LIZLLL).setAllowedProviders(abstractC836950WsP.LJ).build());
                    }
                    String str = c20444114z9.LIZIZ;
                    if (str != null) {
                        builder.setOrigin(str);
                    }
                    credentialManager.getCredential(context2, builder.build(), cancellationSignal, executor, outcomeReceiver);
                }
            };
        }
        PackageInfo packageInfoY3 = C786410Ut5.Y3(context.getPackageManager(), context.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfoY3.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List listLLIIII = C13LP.LLIIII(arrayList);
        if (listLLIIII.isEmpty()) {
            return null;
        }
        Iterator it2 = listLLIIII.iterator();
        InterfaceC20443714z5 interfaceC20443714z5 = null;
        while (it2.hasNext()) {
            try {
                InterfaceC20443714z5 interfaceC20443714z52 = (InterfaceC20443714z5) Class.forName((String) it2.next()).getConstructor(Context.class).newInstance(context);
                if (!interfaceC20443714z52.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (interfaceC20443714z5 != null) {
                        return null;
                    }
                    interfaceC20443714z5 = interfaceC20443714z52;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return interfaceC20443714z5;
    }
}
