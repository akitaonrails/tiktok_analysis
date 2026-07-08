package X;

import android.view.View;
import com.ss.android.ugc.aweme.comment.multiapp.CommentExServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.multiapp.ICommentExService;

/* JADX INFO: renamed from: X.0lG9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1350950lG9 implements ICommentExService {
    public static final C1350950lG9 LIZIZ = new C1350950lG9();
    public final /* synthetic */ ICommentExService LIZ;

    @Override // com.ss.android.ugc.aweme.multiapp.ICommentExService
    public final boolean LIZ(View view) {
        return this.LIZ.LIZ(view);
    }

    @Override // com.ss.android.ugc.aweme.multiapp.ICommentExService
    public final void LIZIZ(C2344009Gk c2344009Gk, Aweme aweme) {
        this.LIZ.LIZIZ(c2344009Gk, aweme);
    }

    @Override // com.ss.android.ugc.aweme.multiapp.ICommentExService
    public final boolean LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.multiapp.ICommentExService
    public final boolean LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.multiapp.ICommentExService
    public final boolean LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.multiapp.ICommentExService
    public final boolean LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.multiapp.ICommentExService
    public final int LJI() {
        return this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.multiapp.ICommentExService
    public final boolean LJII() {
        return this.LIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.multiapp.ICommentExService
    public final boolean enableShare() {
        return this.LIZ.enableShare();
    }

    public C1350950lG9() {
        ICommentExService iCommentExService;
        Object objLIZ = C04TD.LIZ(ICommentExService.class, false);
        if (objLIZ != null) {
            iCommentExService = (ICommentExService) objLIZ;
        } else {
            if (C04TD.LLJILJILJ == null) {
                synchronized (ICommentExService.class) {
                    if (C04TD.LLJILJILJ == null) {
                        C04TD.LLJILJILJ = new CommentExServiceImpl();
                    }
                }
            }
            iCommentExService = C04TD.LLJILJILJ;
        }
        this.LIZ = iCommentExService;
    }
}
