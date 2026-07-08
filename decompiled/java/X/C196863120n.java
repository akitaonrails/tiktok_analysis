package X;

import com.ss.android.ugc.aweme.choosemusic.fragment.LocalMusicTabFragment;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;

/* JADX INFO: renamed from: X.120n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C196863120n implements InterfaceC196862120m {
    public final /* synthetic */ LocalMusicTabFragment LIZ;

    @Override // X.InterfaceC196862120m
    public final void onFailed() {
        this.LIZ.LLJJIII = false;
    }

    public C196863120n(LocalMusicTabFragment localMusicTabFragment) {
        this.LIZ = localMusicTabFragment;
    }

    @Override // X.InterfaceC196862120m
    public final void onSuccess(List<? extends MusicModel> list) {
        this.LIZ.LLJJIII = true;
    }
}
