package X;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.lemon.postmode.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.lemon.postmode.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.lemon.postmode.ui.common.PostModeTimeLoggerViewModel;
import com.ss.android.ugc.aweme.lemon.postmode.ui.photo.model.PostModeFullPageViewModel;
import com.ss.android.ugc.aweme.lemon.postmode.viewmodel.PostModeContainerViewModel;

/* JADX INFO: renamed from: X.0HWn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C442430HWn {
    public final Fragment LIZ;
    public final C19EG LIZIZ;
    public final Aweme LIZJ;
    public final ViewGroup LIZLLL;
    public ViewGroup LJ = null;
    public ViewGroup LJFF = null;
    public final PostModeDetailParams LJI;
    public final PostModeContainerViewModel LJII;
    public final PostModeFullPageViewModel LJIIIIZZ;
    public final PostModeTimeLoggerViewModel LJIIIZ;
    public final ViewGroup LJIIJ;
    public final C0HYF LJIIJJI;

    public C442430HWn(Fragment fragment, C19EG c19eg, Aweme aweme, ViewGroup viewGroup, PostModeDetailParams postModeDetailParams, PostModeContainerViewModel postModeContainerViewModel, PostModeFullPageViewModel postModeFullPageViewModel, PostModeTimeLoggerViewModel postModeTimeLoggerViewModel, ViewGroup viewGroup2, PhotoSharedViewModel photoSharedViewModel) {
        this.LIZ = fragment;
        this.LIZIZ = c19eg;
        this.LIZJ = aweme;
        this.LIZLLL = viewGroup;
        this.LJI = postModeDetailParams;
        this.LJII = postModeContainerViewModel;
        this.LJIIIIZZ = postModeFullPageViewModel;
        this.LJIIIZ = postModeTimeLoggerViewModel;
        this.LJIIJ = viewGroup2;
        this.LJIIJJI = photoSharedViewModel;
    }
}
