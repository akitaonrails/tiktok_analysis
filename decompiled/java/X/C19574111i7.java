package X;

import com.ss.android.ugc.aweme.search.player.core.viewmodel.MusicPlayHelper;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import java.util.Map;

/* JADX INFO: renamed from: X.11i7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19574111i7 implements InterfaceC202028143e {
    public final /* synthetic */ MusicPlayHelper LIZ;
    public final /* synthetic */ MusicModel LIZIZ;
    public final /* synthetic */ Boolean LIZJ;
    public final /* synthetic */ String LIZLLL;

    @Override // X.InterfaceC202028143e
    public final void LIZIZ(Map map, Map map2) {
    }

    @Override // X.InterfaceC202028143e
    public final void onCancel() {
    }

    @Override // X.InterfaceC202028143e
    public final void onStart() {
        this.LIZ.LLILZLL.setValue(new C19574011i6(1, 0, 12));
    }

    @Override // X.InterfaceC202028143e
    public final void LIZJ(C202035143l c202035143l) {
        this.LIZ.LLILZLL.postValue(new C19574011i6(4, -1, 8));
    }

    @Override // X.InterfaceC202028143e
    public final void onProgress(int i) {
        this.LIZ.LLILZLL.postValue(new C19574011i6(2, i, 12));
    }

    @Override // X.InterfaceC202028143e
    public final void LIZ(String str, MusicWaveBean musicWaveBean, Boolean bool) {
        this.LIZ.LLILZLL.postValue(new C19574011i6(3, 100, 0, new C19573911i5(str, this.LIZIZ, this.LIZJ, this.LIZLLL)));
    }

    public C19574111i7(MusicPlayHelper musicPlayHelper, MusicModel musicModel, Boolean bool, String str) {
        this.LIZ = musicPlayHelper;
        this.LIZIZ = musicModel;
        this.LIZJ = bool;
        this.LIZLLL = str;
    }
}
