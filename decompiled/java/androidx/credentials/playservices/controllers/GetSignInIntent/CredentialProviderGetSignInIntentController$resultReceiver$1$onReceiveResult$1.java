package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.AbstractC20027713Xv;
import X.C2217421BqW;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes32.dex */
public final /* synthetic */ class CredentialProviderGetSignInIntentController$resultReceiver$1$onReceiveResult$1 extends C2217421BqW implements Function2<String, String, AbstractC20027713Xv> {
    public CredentialProviderGetSignInIntentController$resultReceiver$1$onReceiveResult$1(Object obj) {
        super(2, obj, CredentialProviderBaseController.Companion.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final AbstractC20027713Xv invoke(String str, String str2) {
        return ((CredentialProviderBaseController.Companion) this.receiver).getCredentialExceptionTypeToException$credentials_play_services_auth_release(str, str2);
    }
}
