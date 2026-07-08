package X;

import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0Kfs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C523420Kfs {
    public static final /* synthetic */ C523420Kfs LIZ = new C523420Kfs();

    public static CommentService LIZ() {
        return (CommentService) ServiceManager.get().getService(CommentService.class);
    }
}
