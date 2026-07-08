package X;

import Y.ARunnableS100S0200000_31;
import Y.ARunnableS131S0100000_31;
import Y.ARunnableS3S1301000_31;
import Y.ARunnableS42S0101000_31;
import android.app.Activity;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.15LE, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15LE implements InterfaceC202028143e {
    public final /* synthetic */ MusicModel LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ long LIZJ;
    public final /* synthetic */ C15L9 LIZLLL;

    @Override // X.InterfaceC202028143e
    public final void LIZIZ(Map map, Map map2) {
    }

    @Override // X.InterfaceC202028143e
    public final void onCancel() {
    }

    @Override // X.InterfaceC202028143e
    public final void onStart() {
        C20684815ws.LJIJI("music_detail_trace", new Pair("music_download_start", "stage"));
        C15L9 c15l9 = this.LIZLLL;
        Activity activity = c15l9.LIZLLL;
        if (activity == null || c15l9.LJ == null) {
            return;
        }
        activity.runOnUiThread(new ARunnableS100S0200000_31(this, this.LIZ, 67));
        this.LIZLLL.LJ.Sx(this.LIZ);
    }

    @Override // X.InterfaceC202028143e
    public final void LIZJ(C202035143l c202035143l) {
        C20684815ws.LJIJI("music_detail_trace", new Pair("music_download_failed", "stage"));
        Activity activity = this.LIZLLL.LIZLLL;
        if (activity != null) {
            activity.runOnUiThread(new ARunnableS131S0100000_31(this, 168));
        }
    }

    @Override // X.InterfaceC202028143e
    public final void onProgress(int i) {
        Activity activity = this.LIZLLL.LIZLLL;
        if (activity != null) {
            activity.runOnUiThread(new ARunnableS42S0101000_31(i, this, 12));
        }
    }

    @Override // X.InterfaceC202028143e
    public final void LIZ(String str, MusicWaveBean musicWaveBean, Boolean bool) {
        C20684815ws.LJIJI("music_detail_trace", new Pair("music_download_success", "stage"));
        C15LG c15lg = this.LIZLLL.LJ;
        if (c15lg != null && !c15lg.h4()) {
            return;
        }
        Activity activity = this.LIZLLL.LIZLLL;
        if (activity != null) {
            activity.runOnUiThread(new ARunnableS3S1301000_31(musicWaveBean, str, this.LIZIZ, this, this.LIZ, 1));
        }
        C15L9.LJII(System.currentTimeMillis() - this.LIZJ, str);
    }

    public C15LE(C15L9 c15l9, MusicModel musicModel, int i, long j) {
        this.LIZLLL = c15l9;
        this.LIZ = musicModel;
        this.LIZIZ = i;
        this.LIZJ = j;
    }
}
