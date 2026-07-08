package X;

import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QQY, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QQY {
    public static final C0QQY LIZ = new C0QQY();

    public static boolean LIZ(Aweme aweme, C1349800lEI c1349800lEI) {
        AwemeStatus statusSafety;
        if (aweme == null || C10EU.LJIIZILJ(AwemeExtKt.getAuthorUid(aweme)) || C10EU.LJIILL(aweme.getAuthor(), C10EU.LJIIZILJ(AwemeExtKt.getAuthorUid(aweme)))) {
            return true;
        }
        CommentService.LIZ.getClass();
        if (C523420Kfs.LIZ().LJIILLIIL(aweme) || !C523420Kfs.LIZ().LJJIJIIJIL(aweme) || AwemeExtKt.getStatusSafety(aweme) == null || (statusSafety = AwemeExtKt.getStatusSafety(aweme)) == null || statusSafety.getPrivateStatus() != 0 || Intrinsics.LJFF(c1349800lEI.getEventType(), "selfharm") || ComplianceServiceProvider.LJIIJJI().LJIIIZ()) {
            return true;
        }
        return false;
    }
}
