package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.repo.IChatRequestRepository;

/* JADX INFO: renamed from: X.068s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15596068s {
    public static final /* synthetic */ C15596068s LIZ = new C15596068s();

    public static IChatRequestRepository LIZ() {
        IChatRequestRepository.RepositoryFactory repositoryFactory = (IChatRequestRepository.RepositoryFactory) PluggableExtentionKt.pluggableSpiForReal(IChatRequestRepository.RepositoryFactory.class);
        if (repositoryFactory != null) {
            return repositoryFactory.create();
        }
        return null;
    }
}
