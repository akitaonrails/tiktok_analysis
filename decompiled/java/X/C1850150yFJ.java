package X;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.commercialize.media.impl.utils.ScopedMusicPlayer;
import com.ss.android.ugc.aweme.commercialize.media.impl.viewmodel.RecommendMusicV2ViewModel;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: renamed from: X.0yFJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1850150yFJ implements InterfaceC1850330yFb {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJI;
    public final C1850230yFR LIZ;
    public final C1850240yFS LIZIZ = new C1850240yFS(LJ(), Activity.class);
    public final C1850240yFS LIZJ = new C1850240yFS(LJ(), MusicDetail.class);
    public final C1850240yFS LIZLLL = new C1850240yFS(LJ(), LifecycleOwner.class);
    public final C1850240yFS LJ = new C1850240yFS(LJ(), RecommendMusicV2ViewModel.class);
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1410));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1850150yFJ.class, "activity", "getActivity()Landroid/app/Activity;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1850150yFJ.class, "musicDetail", "getMusicDetail()Lcom/ss/android/ugc/aweme/music/model/MusicDetail;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1850150yFJ.class, "lifecycleOwner", "getLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1850150yFJ.class, "viewModelV2", "getViewModelV2()Lcom/ss/android/ugc/aweme/commercialize/media/impl/viewmodel/RecommendMusicV2ViewModel;", 0);
        c09r3.getClass();
        LJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    public final void LIZ() {
        ScopedMusicPlayer scopedMusicPlayer = (ScopedMusicPlayer) ((RecommendMusicV2ViewModel) this.LJ.LIZ(LJI[3])).LLILLL.getValue();
        if (scopedMusicPlayer != null) {
            scopedMusicPlayer.pause();
        }
    }

    @Override // X.InterfaceC1850330yFb
    public final C1850230yFR LJ() {
        return this.LIZ;
    }

    public C1850150yFJ(C1850230yFR c1850230yFR) {
        this.LIZ = c1850230yFR;
    }
}
