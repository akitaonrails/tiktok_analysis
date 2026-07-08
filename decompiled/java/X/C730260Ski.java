package X;

import com.ss.android.ugc.aweme.social.sticker.editcomponent.secretreplies.service.SecretRepliesAbilityProviderImpl;
import com.ss.android.ugc.aweme.social.sticker.service.secretreplies.ISecretRepliesAbilityProvider;

/* JADX INFO: renamed from: X.0Ski, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C730260Ski implements ISecretRepliesAbilityProvider {
    public static final C730260Ski LIZIZ = new C730260Ski();
    public final /* synthetic */ ISecretRepliesAbilityProvider LIZ;

    @Override // com.ss.android.ugc.aweme.social.sticker.service.secretreplies.ISecretRepliesAbilityProvider
    public final InterfaceC730270Skj LIZ() {
        return this.LIZ.LIZ();
    }

    public C730260Ski() {
        ISecretRepliesAbilityProvider iSecretRepliesAbilityProvider;
        Object objLIZ = C04TD.LIZ(ISecretRepliesAbilityProvider.class, false);
        if (objLIZ != null) {
            iSecretRepliesAbilityProvider = (ISecretRepliesAbilityProvider) objLIZ;
        } else {
            if (C04TD.f117t5 == null) {
                synchronized (ISecretRepliesAbilityProvider.class) {
                    if (C04TD.f117t5 == null) {
                        C04TD.f117t5 = new SecretRepliesAbilityProviderImpl();
                    }
                }
            }
            iSecretRepliesAbilityProvider = C04TD.f117t5;
        }
        this.LIZ = iSecretRepliesAbilityProvider;
    }
}
