package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.ui.fragment.PostModeDetailPageFragment;
import com.ss.android.ugc.aweme.viewmodel.PostModePageViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeTimeLoggerViewModel;

/* JADX INFO: renamed from: X.0SRX, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public interface C0SRX extends C0OGM {
    public static final C721370SRj LJLILLLLZI = C721370SRj.LIZ;

    void DP(PostModeDetailPageFragment postModeDetailPageFragment);

    boolean FL(String str, String str2, String str3, PostModeDetailParams postModeDetailParams);

    C0SSR FO();

    CommentContextSource GL();

    PostModeDetailParams H();

    PhotoSharedViewModel LA();

    void LI(PostModeDetailParams postModeDetailParams);

    void LLLLLLIL();

    void M9();

    C0SRZ N6();

    View Nd();

    PostModeTimeLoggerViewModel SJ();

    void aL();

    boolean cw();

    void ft();

    String getEnterFrom();

    PostModePageViewModel getViewModel();

    /* JADX INFO: renamed from: if, reason: not valid java name */
    boolean mo33if();

    void vy(Context context);
}
