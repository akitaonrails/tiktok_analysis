package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.ICommentCareModeService;

/* JADX INFO: renamed from: X.0l22, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1342200l22 {
    public static final /* synthetic */ C1342200l22 LIZ = new C1342200l22();

    public static ICommentCareModeService LIZ() {
        ICommentCareModeService iCommentCareModeService = (ICommentCareModeService) PluggableExtentionKt.pluggableSpi$default(ICommentCareModeService.class, false, false, false, 14, null);
        return iCommentCareModeService == null ? new ICommentCareModeService() { // from class: X.0l23
            @Override // com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.ICommentCareModeService
            public final void LIZ(Fragment fragment, Aweme aweme) {
            }

            @Override // com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.ICommentCareModeService
            public final void LIZIZ(C19EG c19eg, Aweme aweme, Comment comment, EnumC1620106Vz enumC1620106Vz) {
            }

            @Override // com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.ICommentCareModeService
            public final boolean LIZJ(Aweme aweme) {
                return false;
            }

            @Override // com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.ICommentCareModeService
            public final boolean LIZLLL(Aweme aweme) {
                return false;
            }

            @Override // com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.ICommentCareModeService
            public final void LJ(C19EG c19eg, boolean z, EnumC1620106Vz enumC1620106Vz) {
            }
        } : iCommentCareModeService;
    }
}
