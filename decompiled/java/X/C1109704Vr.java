package X;

import com.ss.android.ugc.aweme.ad.comment.CommerceCommentServiceImpl;
import com.ss.android.ugc.aweme.ad.comment.ICommerceCommentService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04Vr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1109704Vr extends C09AY implements Function0<ICommerceCommentService> {
    public C1109704Vr() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.ad.comment.ICommerceCommentService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ICommerceCommentService invoke() {
        ?? LIZ = C04TD.LIZ(ICommerceCommentService.class, false);
        return LIZ == 0 ? new CommerceCommentServiceImpl() : LIZ;
    }
}
