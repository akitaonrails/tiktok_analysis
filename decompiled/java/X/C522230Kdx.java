package X;

import com.ss.android.ugc.aweme.services.upload.IServiceMusicResDownListener;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import java.util.Map;
import kotlin.jvm.internal.AwS122S1100000_8;
import kotlin.jvm.internal.AwS23S0010000_8;

/* JADX INFO: renamed from: X.0Kdx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C522230Kdx implements IServiceMusicResDownListener {
    public final ShortVideoContext LIZ;
    public final ChooseMediaViewModel LIZIZ;
    public final int LIZJ;
    public final Map<String, Object> LIZLLL;

    @Override // com.ss.android.ugc.aweme.services.upload.IServiceMusicResDownListener
    public void onFailed() {
    }

    @Override // com.ss.android.ugc.aweme.services.upload.IServiceMusicResDownListener
    public final Map<String, Object> getMusicRecommendExtra() {
        return this.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.services.upload.IServiceMusicResDownListener
    public void onSuccess(MusicModel musicModel, String str) {
        ShortVideoContext shortVideoContext;
        Workspace workspace;
        musicModel.setLocalPath(str);
        ChooseMediaViewModel chooseMediaViewModel = this.LIZIZ;
        if (chooseMediaViewModel != null) {
            chooseMediaViewModel.yR2(new AwS23S0010000_8(true, 4));
        }
        ChooseMediaViewModel chooseMediaViewModel2 = this.LIZIZ;
        if (chooseMediaViewModel2 != null) {
            chooseMediaViewModel2.yR2(new AwS122S1100000_8(musicModel, str, 5));
        }
        ChooseMediaViewModel chooseMediaViewModel3 = this.LIZIZ;
        if (chooseMediaViewModel3 != null) {
            chooseMediaViewModel3.yR2(new AwS122S1100000_8(musicModel, str, 4));
        }
        int i = this.LIZJ;
        if ((i == 9 || i == 18 || i == 24 || i == 36 || i == 42 || i == 40 || i == 31) && (shortVideoContext = this.LIZ) != null && (workspace = shortVideoContext.cameraComponentModel.mWorkspace) != null) {
            workspace.MC(str);
        }
    }

    public C522230Kdx(ShortVideoContext shortVideoContext, ChooseMediaViewModel chooseMediaViewModel, int i, Map<String, ? extends Object> map) {
        this.LIZ = shortVideoContext;
        this.LIZIZ = chooseMediaViewModel;
        this.LIZJ = i;
        this.LIZLLL = map;
    }
}
