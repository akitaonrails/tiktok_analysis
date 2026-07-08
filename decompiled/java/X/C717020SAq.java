package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoNavigateAssem;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS412S0200000_11;

/* JADX INFO: renamed from: X.0SAq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C717020SAq {
    public final PhotoViewModelV2 LIZ;
    public final String LIZIZ;
    public final VideoItemParams LIZJ;
    public final IFeedPanelPlatformAbility LIZLLL;
    public final C696330RTb LJ;
    public final InterfaceC717050SAt LJFF;
    public final C0HTT<C737030Svd> LJI;

    public C717020SAq(PhotoViewModelV2 photoViewModelV2, PhotoSharedViewModel photoSharedViewModel, String str, VideoItemParams videoItemParams, IFeedPanelPlatformAbility iFeedPanelPlatformAbility, C696330RTb c696330RTb, PhotoNavigateAssem photoNavigateAssem, C0SBA c0sba, C0HTT c0htt) {
        this.LIZ = photoViewModelV2;
        this.LIZIZ = str;
        this.LIZJ = videoItemParams;
        this.LIZLLL = iFeedPanelPlatformAbility;
        this.LJ = c696330RTb;
        this.LJFF = photoNavigateAssem;
        this.LJI = c0htt;
        photoSharedViewModel.LLJJIJI = new WeakReference<>(c0sba);
        photoSharedViewModel.LLJJJ = new AwS412S0200000_11(photoSharedViewModel, this, 69);
        photoSharedViewModel.LLJJIJIL = new AwS412S0200000_11(photoSharedViewModel, this, 70);
    }
}
