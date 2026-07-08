package androidx.credentials.playservices;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C788530UwV;
import X.C817700W5w;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;

/* JADX INFO: loaded from: classes4.dex */
public final class CredentialProviderMetadataHolder extends Service {
    public final LocalBinder binder = new LocalBinder();

    public void androidx_credentials_playservices_CredentialProviderMetadataHolder__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        androidx_credentials_playservices_CredentialProviderMetadataHolder_com_ss_android_ugc_aweme_nxreword_proxy_NxStringLancet_attachBaseContextWrapper(this, context);
    }

    public final class LocalBinder extends Binder {
        public final CredentialProviderMetadataHolder getService() {
            return CredentialProviderMetadataHolder.this;
        }

        public LocalBinder() {
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "androidx/credentials/playservices/CredentialProviderMetadataHolder", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dTF6Tg0zW9KSVkUkQReKcn4kgXDyyNLqY3YzcCFcUcGFCbpHK/GcSRgCoZXCX1b8odfYsten3cj/Z37g2yuBECpe", new String[]{"01789"})));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
        }
        return this.binder;
    }

    public static void androidx_credentials_playservices_CredentialProviderMetadataHolder_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(CredentialProviderMetadataHolder credentialProviderMetadataHolder, Context context) {
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        credentialProviderMetadataHolder.androidx_credentials_playservices_CredentialProviderMetadataHolder__attachBaseContext$___twin___(context);
    }

    public static void androidx_credentials_playservices_CredentialProviderMetadataHolder_com_ss_android_ugc_aweme_nxreword_proxy_NxStringLancet_attachBaseContextWrapper(CredentialProviderMetadataHolder credentialProviderMetadataHolder, Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        androidx_credentials_playservices_CredentialProviderMetadataHolder_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(credentialProviderMetadataHolder, context);
    }
}
