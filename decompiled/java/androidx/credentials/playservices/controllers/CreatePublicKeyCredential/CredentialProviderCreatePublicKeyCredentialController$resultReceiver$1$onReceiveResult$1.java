package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.AbstractC20027413Xs;
import X.C2217421BqW;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes32.dex */
public final /* synthetic */ class CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 extends C2217421BqW implements Function2<String, String, AbstractC20027413Xs> {
    public CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1(Object obj) {
        super(2, obj, CredentialProviderBaseController.Companion.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final AbstractC20027413Xs invoke(String str, String str2) {
        return ((CredentialProviderBaseController.Companion) this.receiver).createCredentialExceptionTypeToException$credentials_play_services_auth_release(str, str2);
    }
}
