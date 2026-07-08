package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.story.forward.ForwardImageDownloader;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import com.ss.android.ugc.aweme.services.story.forward.ForwardVideoPlayerCacheProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0sDc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public interface InterfaceC1618460sDc {
    ForwardVideoPlayerCacheProvider LIZIZ();

    ForwardMediaDownloader LIZJ();

    void LIZLLL();

    boolean LJ(Fragment fragment, Aweme aweme);

    ForwardImageDownloader LJFF();

    void LJI(Aweme aweme, String str, Function1 function1);

    void LJII();

    void LJIIIIZZ(String str, String str2);

    ForwardMedia LJIIIZ(String str, String str2, Aweme aweme, Boolean bool);

    void LJIIJ(C20271514Tp c20271514Tp);

    void LJIIJJI(String str);

    void LJIIL(CommentVideoModel commentVideoModel, C20271514Tp c20271514Tp);

    void LJIILIIL();

    void LJIILJJIL(long j);

    long LJIILL();

    void LJIILLIIL(Aweme aweme);

    boolean LJIIZILJ();

    void LJIJ(C20271514Tp c20271514Tp, Function0<Unit> function0);

    boolean LJIJI(Aweme aweme, boolean z);

    void LJIJJ();

    ForwardMedia LJIJJLI(MediaModel mediaModel);

    void LJIL(C20271514Tp c20271514Tp, String str);

    void LJJ(Aweme aweme);

    void LJJI(long j, long j2, String str);

    long LJJIFFI(long j);
}
