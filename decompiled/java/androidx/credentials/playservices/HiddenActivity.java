package androidx.credentials.playservices;

import X.AbstractC831380WjQ;
import X.AbstractC835450Wpz;
import X.C0W4V;
import X.C1389600mGU;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C817700W5w;
import X.C832510WlF;
import X.C833100WmC;
import X.C833800WnK;
import X.C833830WnN;
import X.C833870WnR;
import X.C834010Wnf;
import X.C834040Wni;
import X.C835490Wq3;
import X.C835510Wq5;
import X.C836070Wqz;
import X.C836210WrD;
import X.C836250WrH;
import X.InterfaceC831290WjH;
import X.InterfaceC835710WqP;
import X.InterfaceC835730WqR;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.common.Feature;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import kotlin.jvm.internal.AwS121S0101000_13;

/* JADX INFO: loaded from: classes14.dex */
public class HiddenActivity extends Activity {
    public static final Companion Companion = new Companion();
    public static final String _pnsPageId = "KSsoOyA6LD1iKj02LCAiPSYyJDZiOSMyHELIOSMTYpOzk6KyA/Zwc6LCEpJw4wPCw6IDsq";
    public boolean mWaitingForActivityResult;
    public ResultReceiver resultReceiver;

    public static final class Companion {
    }

    public void androidx_credentials_playservices_HiddenActivity__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    public void androidx_credentials_playservices_HiddenActivity__onStop$___twin___() {
        super.onStop();
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        androidx_credentials_playservices_HiddenActivity_com_ss_android_ugc_aweme_nxreword_proxy_NxStringLancet_attachBaseContextActivity(this, context);
    }

    @Override // android.app.Activity
    public void onStop() {
        androidx_credentials_playservices_HiddenActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(this);
    }

    private final void handleBeginSignIn() {
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (beginSignInRequest == null) {
            finish();
            return;
        }
        final C833870WnR c833870WnRLIZ = C834010Wnf.LIZ(this);
        C836250WrH c836250WrHLJLZ = BeginSignInRequest.LJLZ(beginSignInRequest);
        c836250WrHLJLZ.LJ = c833870WnRLIZ.LIZ;
        final BeginSignInRequest beginSignInRequest2 = new BeginSignInRequest(c836250WrHLJLZ.LIZ, c836250WrHLJLZ.LIZIZ, c836250WrHLJLZ.LJ, c836250WrHLJLZ.LJFF, c836250WrHLJLZ.LJI, c836250WrHLJLZ.LIZJ, c836250WrHLJLZ.LIZLLL);
        C832510WlF c832510WlF = new C832510WlF();
        c832510WlF.LIZJ = new Feature[]{C834040Wni.LIZ};
        c832510WlF.LIZ = new InterfaceC831290WjH(c833870WnRLIZ, beginSignInRequest2) { // from class: X.0Wom
            public final /* synthetic */ BeginSignInRequest LIZ;

            {
                this.LIZ = beginSignInRequest2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC831290WjH
            public final void LIZ(InterfaceC831160Wj4 interfaceC831160Wj4, Object obj) {
                BeginSignInRequest beginSignInRequest3 = this.LIZ;
                BinderC834770Wot binderC834770Wot = new BinderC834770Wot((C835520Wq6) obj);
                C834590Wob c834590Wob = (C834590Wob) ((AbstractC832390Wl3) interfaceC831160Wj4).getService();
                C0W3J.LJIIIIZZ(beginSignInRequest3);
                Parcel parcelLJJJZ = c834590Wob.LJJJZ();
                C834680Wok.LIZLLL(parcelLJJJZ, binderC834770Wot);
                C834680Wok.LIZJ(parcelLJJJZ, beginSignInRequest3);
                c834590Wob.LLILLIZIL(1, parcelLJJJZ);
            }
        };
        c832510WlF.LIZIZ = false;
        c832510WlF.LIZLLL = 1553;
        AbstractC835450Wpz abstractC835450WpzDoRead = c833870WnRLIZ.doRead(c832510WlF.LIZ());
        final AwS121S0101000_13 awS121S0101000_13 = new AwS121S0101000_13(this, intExtra, 0);
        C835510Wq5 c835510Wq5LJFF = abstractC835450WpzDoRead.LJFF(new InterfaceC835710WqP() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda4
            @Override // X.InterfaceC835710WqP
            public final void onSuccess(Object obj) {
                awS121S0101000_13.invoke(obj);
            }
        });
        InterfaceC835730WqR interfaceC835730WqR = new InterfaceC835730WqR() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda5
            @Override // X.InterfaceC835730WqR
            public final void onFailure(Exception exc) {
                HiddenActivity.handleBeginSignIn$lambda$10$lambda$9(this.f$0, exc);
            }
        };
        c835510Wq5LJFF.getClass();
        c835510Wq5LJFF.LJ(C835490Wq3.LIZ, interfaceC835730WqR);
    }

    private final void handleCreatePassword() {
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (savePasswordRequest == null) {
            finish();
            return;
        }
        final C833800WnK c833800WnK = new C833800WnK(this, new C833830WnN());
        C836210WrD c836210WrDLJLZ = SavePasswordRequest.LJLZ(savePasswordRequest);
        c836210WrDLJLZ.LIZIZ = c833800WnK.LIZ;
        final SavePasswordRequest savePasswordRequest2 = new SavePasswordRequest(c836210WrDLJLZ.LIZ, c836210WrDLJLZ.LIZIZ, c836210WrDLJLZ.LIZJ);
        C832510WlF c832510WlF = new C832510WlF();
        c832510WlF.LIZJ = new Feature[]{C834040Wni.LIZJ};
        c832510WlF.LIZ = new InterfaceC831290WjH(c833800WnK, savePasswordRequest2) { // from class: X.0Wol
            public final /* synthetic */ SavePasswordRequest LIZ;

            {
                this.LIZ = savePasswordRequest2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC831290WjH
            public final void LIZ(InterfaceC831160Wj4 interfaceC831160Wj4, Object obj) {
                SavePasswordRequest savePasswordRequest3 = this.LIZ;
                BinderC834760Wos binderC834760Wos = new BinderC834760Wos((C835520Wq6) obj);
                C834590Wob c834590Wob = (C834590Wob) ((AbstractC832390Wl3) interfaceC831160Wj4).getService();
                C0W3J.LJIIIIZZ(savePasswordRequest3);
                Parcel parcelLJJJZ = c834590Wob.LJJJZ();
                C834680Wok.LIZLLL(parcelLJJJZ, binderC834760Wos);
                C834680Wok.LIZJ(parcelLJJJZ, savePasswordRequest3);
                c834590Wob.LLILLIZIL(2, parcelLJJJZ);
            }
        };
        c832510WlF.LIZIZ = false;
        c832510WlF.LIZLLL = 1536;
        AbstractC835450Wpz abstractC835450WpzDoRead = c833800WnK.doRead(c832510WlF.LIZ());
        final AwS121S0101000_13 awS121S0101000_13 = new AwS121S0101000_13(this, intExtra, 1);
        C835510Wq5 c835510Wq5LJFF = abstractC835450WpzDoRead.LJFF(new InterfaceC835710WqP() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda6
            @Override // X.InterfaceC835710WqP
            public final void onSuccess(Object obj) {
                awS121S0101000_13.invoke(obj);
            }
        });
        InterfaceC835730WqR interfaceC835730WqR = new InterfaceC835730WqR() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda7
            @Override // X.InterfaceC835730WqR
            public final void onFailure(Exception exc) {
                HiddenActivity.handleCreatePassword$lambda$14$lambda$13(this.f$0, exc);
            }
        };
        c835510Wq5LJFF.getClass();
        c835510Wq5LJFF.LJ(C835490Wq3.LIZ, interfaceC835730WqR);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.0WjQ, X.0Wm2] */
    private final void handleCreatePublicKeyCredential() {
        final PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (publicKeyCredentialCreationOptions == null) {
            finish();
            return;
        }
        final ?? r2 = new AbstractC831380WjQ<C833100WmC>(this) { // from class: X.0Wm2
            public static final C832010WkR LIZ = new C832010WkR("Fido.FIDO2_API", new AbstractC831970WkN() { // from class: X.0Wm9
                @Override // X.AbstractC831970WkN
                public final /* synthetic */ InterfaceC831160Wj4 buildClient(final Context context, final Looper looper, final C831470WjZ c831470WjZ, Object obj, final InterfaceC832260Wkq interfaceC832260Wkq, final InterfaceC832270Wkr interfaceC832270Wkr) {
                    return new AbstractC832400Wl4(context, looper, c831470WjZ, interfaceC832260Wkq, interfaceC832270Wkr) { // from class: X.0WmZ
                        @Override // X.AbstractC832390Wl3
                        public final Feature[] getApiFeatures() {
                            return new Feature[]{C833340Wma.LIZIZ, C833340Wma.LIZ};
                        }

                        @Override // X.AbstractC832390Wl3, X.InterfaceC831160Wj4
                        public final int getMinApkVersion() {
                            return 13000000;
                        }

                        @Override // X.AbstractC832390Wl3
                        public final String getServiceDescriptor() {
                            return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
                        }

                        @Override // X.AbstractC832390Wl3
                        public final String getStartServiceAction() {
                            return "com.google.android.gms.fido.fido2.regular.START";
                        }

                        @Override // X.AbstractC832390Wl3
                        public final boolean usesClientTelemetry() {
                            return true;
                        }

                        @Override // X.AbstractC832390Wl3
                        public final Bundle getGetServiceRequestExtraArgs() {
                            Bundle bundle = new Bundle();
                            C786410Ut5.LJJJI("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START", bundle);
                            return bundle;
                        }

                        @Override // X.AbstractC832390Wl3
                        public final /* synthetic */ IInterface createServiceInterface(final IBinder iBinder) {
                            if (iBinder == null) {
                                return null;
                            }
                            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
                            if (iInterfaceQueryLocalInterface instanceof C833350Wmb) {
                                return iInterfaceQueryLocalInterface;
                            }
                            return new C833360Wmc(iBinder) { // from class: X.0Wmb
                            };
                        }
                    };
                }
            }, new C832160Wkg());

            {
                C832010WkR c832010WkR = LIZ;
                C833100WmC c833100WmC = InterfaceC833080WmA.LJIIL;
                C831630Wjp c831630Wjp = new C831630Wjp();
            }
        };
        C832510WlF c832510WlF = new C832510WlF();
        c832510WlF.LIZ = new InterfaceC831290WjH(r2, publicKeyCredentialCreationOptions) { // from class: X.0Wmh
            public final /* synthetic */ PublicKeyCredentialCreationOptions LIZ;

            {
                this.LIZ = publicKeyCredentialCreationOptions;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC831290WjH
            public final void LIZ(InterfaceC831160Wj4 interfaceC831160Wj4, Object obj) {
                PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions2 = this.LIZ;
                BinderC833430Wmj binderC833430Wmj = new BinderC833430Wmj((C835520Wq6) obj);
                C833360Wmc c833360Wmc = (C833360Wmc) ((AbstractC832390Wl3) interfaceC831160Wj4).getService();
                c833360Wmc.getClass();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(c833360Wmc.LLILLJJLI);
                parcelObtain.writeStrongBinder(binderC833430Wmj);
                if (publicKeyCredentialCreationOptions2 == null) {
                    parcelObtain.writeInt(0);
                } else {
                    parcelObtain.writeInt(1);
                    publicKeyCredentialCreationOptions2.writeToParcel(parcelObtain, 0);
                }
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    c833360Wmc.LL.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                    throw th;
                }
            }
        };
        c832510WlF.LIZLLL = 5407;
        AbstractC835450Wpz abstractC835450WpzDoRead = r2.doRead(c832510WlF.LIZ());
        final AwS121S0101000_13 awS121S0101000_13 = new AwS121S0101000_13(this, intExtra, 2);
        C835510Wq5 c835510Wq5LJFF = abstractC835450WpzDoRead.LJFF(new InterfaceC835710WqP() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda0
            @Override // X.InterfaceC835710WqP
            public final void onSuccess(Object obj) {
                awS121S0101000_13.invoke(obj);
            }
        });
        InterfaceC835730WqR interfaceC835730WqR = new InterfaceC835730WqR() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda1
            @Override // X.InterfaceC835730WqR
            public final void onFailure(Exception exc) {
                HiddenActivity.handleCreatePublicKeyCredential$lambda$2$lambda$1(this.f$0, exc);
            }
        };
        c835510Wq5LJFF.getClass();
        c835510Wq5LJFF.LJ(C835490Wq3.LIZ, interfaceC835730WqR);
    }

    private final void handleGetSignInIntent() {
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (getSignInIntentRequest == null) {
            finish();
            return;
        }
        final C833870WnR c833870WnRLIZ = C834010Wnf.LIZ(this);
        C836070Wqz c836070WqzLJLZ = GetSignInIntentRequest.LJLZ(getSignInIntentRequest);
        c836070WqzLJLZ.LIZJ = c833870WnRLIZ.LIZ;
        final GetSignInIntentRequest getSignInIntentRequest2 = new GetSignInIntentRequest(c836070WqzLJLZ.LJFF, c836070WqzLJLZ.LIZ, c836070WqzLJLZ.LIZIZ, c836070WqzLJLZ.LIZJ, c836070WqzLJLZ.LIZLLL, c836070WqzLJLZ.LJ);
        C832510WlF c832510WlF = new C832510WlF();
        c832510WlF.LIZJ = new Feature[]{C834040Wni.LIZLLL};
        c832510WlF.LIZ = new InterfaceC831290WjH(c833870WnRLIZ, getSignInIntentRequest2) { // from class: X.0Won
            public final /* synthetic */ GetSignInIntentRequest LIZ;

            {
                this.LIZ = getSignInIntentRequest2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC831290WjH
            public final void LIZ(InterfaceC831160Wj4 interfaceC831160Wj4, Object obj) {
                GetSignInIntentRequest getSignInIntentRequest3 = this.LIZ;
                BinderC834780Wou binderC834780Wou = new BinderC834780Wou((C835520Wq6) obj);
                C834590Wob c834590Wob = (C834590Wob) ((AbstractC832390Wl3) interfaceC831160Wj4).getService();
                C0W3J.LJIIIIZZ(getSignInIntentRequest3);
                Parcel parcelLJJJZ = c834590Wob.LJJJZ();
                C834680Wok.LIZLLL(parcelLJJJZ, binderC834780Wou);
                C834680Wok.LIZJ(parcelLJJJZ, getSignInIntentRequest3);
                c834590Wob.LLILLIZIL(3, parcelLJJJZ);
            }
        };
        c832510WlF.LIZLLL = 1555;
        AbstractC835450Wpz abstractC835450WpzDoRead = c833870WnRLIZ.doRead(c832510WlF.LIZ());
        final AwS121S0101000_13 awS121S0101000_13 = new AwS121S0101000_13(this, intExtra, 3);
        C835510Wq5 c835510Wq5LJFF = abstractC835450WpzDoRead.LJFF(new InterfaceC835710WqP() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda2
            @Override // X.InterfaceC835710WqP
            public final void onSuccess(Object obj) {
                awS121S0101000_13.invoke(obj);
            }
        });
        InterfaceC835730WqR interfaceC835730WqR = new InterfaceC835730WqR() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda3
            @Override // X.InterfaceC835730WqR
            public final void onFailure(Exception exc) {
                HiddenActivity.handleGetSignInIntent$lambda$6$lambda$5(this.f$0, exc);
            }
        };
        c835510Wq5LJFF.getClass();
        c835510Wq5LJFF.LJ(C835490Wq3.LIZ, interfaceC835730WqR);
    }

    public static void androidx_credentials_playservices_HiddenActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(HiddenActivity hiddenActivity) {
        hiddenActivity.androidx_credentials_playservices_HiddenActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                hiddenActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void androidx_credentials_playservices_HiddenActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(HiddenActivity hiddenActivity) {
        androidx_credentials_playservices_HiddenActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(hiddenActivity);
        try {
            hiddenActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    private final void restoreState(Bundle bundle) {
        if (bundle != null) {
            this.mWaitingForActivityResult = bundle.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            C1389600mGU.LIZIZ(this);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        overridePendingTransition(0, 0);
        String strINVOKEVIRTUAL_androidx_credentials_playservices_HiddenActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = INVOKEVIRTUAL_androidx_credentials_playservices_HiddenActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(getIntent(), "TYPE");
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.resultReceiver = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        restoreState(bundle);
        if (this.mWaitingForActivityResult) {
            return;
        }
        if (strINVOKEVIRTUAL_androidx_credentials_playservices_HiddenActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra != null) {
            switch (strINVOKEVIRTUAL_androidx_credentials_playservices_HiddenActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra.hashCode()) {
                case -441061071:
                    if (strINVOKEVIRTUAL_androidx_credentials_playservices_HiddenActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra.equals("BEGIN_SIGN_IN")) {
                        handleBeginSignIn();
                        return;
                    }
                    break;
                case 15545322:
                    if (strINVOKEVIRTUAL_androidx_credentials_playservices_HiddenActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra.equals("CREATE_PUBLIC_KEY_CREDENTIAL")) {
                        handleCreatePublicKeyCredential();
                        return;
                    }
                    break;
                case 1246634622:
                    if (strINVOKEVIRTUAL_androidx_credentials_playservices_HiddenActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra.equals("CREATE_PASSWORD")) {
                        handleCreatePassword();
                        return;
                    }
                    break;
                case 1980564212:
                    if (strINVOKEVIRTUAL_androidx_credentials_playservices_HiddenActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra.equals("SIGN_IN_INTENT")) {
                        handleGetSignInIntent();
                        return;
                    }
                    break;
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.mWaitingForActivityResult);
        super.onSaveInstanceState(bundle);
    }

    public static String INVOKEVIRTUAL_androidx_credentials_playservices_HiddenActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void androidx_credentials_playservices_HiddenActivity_com_ss_android_ugc_aweme_nxreword_proxy_NxStringLancet_attachBaseContextActivity(HiddenActivity hiddenActivity, Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextActivity: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, true);
        }
        hiddenActivity.androidx_credentials_playservices_HiddenActivity__attachBaseContext$___twin___(context);
    }

    public static final void handleBeginSignIn$lambda$10$lambda$9(HiddenActivity hiddenActivity, Exception exc) {
        String str;
        if ((exc instanceof C0W4V) && CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(((C0W4V) exc).getStatusCode()))) {
            str = "GET_INTERRUPTED";
        } else {
            str = "GET_NO_CREDENTIALS";
        }
        ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("During begin sign in, failure response from one tap: ");
        sbLIZ.append(exc.getMessage());
        hiddenActivity.setupFailure(resultReceiver, str, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void handleCreatePassword$lambda$14$lambda$13(HiddenActivity hiddenActivity, Exception exc) {
        String str;
        if ((exc instanceof C0W4V) && CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(((C0W4V) exc).getStatusCode()))) {
            str = "CREATE_INTERRUPTED";
        } else {
            str = "CREATE_UNKNOWN";
        }
        ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("During save password, found password failure response from one tap ");
        sbLIZ.append(exc.getMessage());
        hiddenActivity.setupFailure(resultReceiver, str, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void handleCreatePublicKeyCredential$lambda$2$lambda$1(HiddenActivity hiddenActivity, Exception exc) {
        String str;
        if ((exc instanceof C0W4V) && CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(((C0W4V) exc).getStatusCode()))) {
            str = "CREATE_INTERRUPTED";
        } else {
            str = "CREATE_UNKNOWN";
        }
        ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("During create public key credential, fido registration failure: ");
        sbLIZ.append(exc.getMessage());
        hiddenActivity.setupFailure(resultReceiver, str, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void handleGetSignInIntent$lambda$6$lambda$5(HiddenActivity hiddenActivity, Exception exc) {
        String str;
        if ((exc instanceof C0W4V) && CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(((C0W4V) exc).getStatusCode()))) {
            str = "GET_INTERRUPTED";
        } else {
            str = "GET_NO_CREDENTIALS";
        }
        ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("During get sign-in intent, failure response from one tap: ");
        sbLIZ.append(exc.getMessage());
        hiddenActivity.setupFailure(resultReceiver, str, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", false);
        bundle.putInt("ACTIVITY_REQUEST_CODE", i);
        C786410Ut5.LJJIJL(bundle, "RESULT_DATA", intent);
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver != null) {
            resultReceiver.send(i2, bundle);
        }
        this.mWaitingForActivityResult = false;
        finish();
    }

    public final void setupFailure(ResultReceiver resultReceiver, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", true);
        C786410Ut5.LJJJI("EXCEPTION_TYPE", str, bundle);
        C786410Ut5.LJJJI("EXCEPTION_MESSAGE", str2, bundle);
        resultReceiver.send(Integer.MAX_VALUE, bundle);
        finish();
    }
}
