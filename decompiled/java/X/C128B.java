package X;

import Y.ARunnableS37S0400000_29;
import android.content.Context;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import java.util.Map;

/* JADX INFO: renamed from: X.128B, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C128B implements InterfaceC202028143e {
    public Long LIZ;
    public final /* synthetic */ C128C LIZIZ;
    public final /* synthetic */ MusicModel LIZJ;

    @Override // X.InterfaceC202028143e
    public final void LIZIZ(Map map, Map map2) {
    }

    @Override // X.InterfaceC202028143e
    public final void LIZJ(C202035143l c202035143l) {
    }

    @Override // X.InterfaceC202028143e
    public final void onCancel() {
    }

    @Override // X.InterfaceC202028143e
    public final void onProgress(int i) {
    }

    @Override // X.InterfaceC202028143e
    public final void onStart() {
        this.LIZ = Long.valueOf(SystemClock.elapsedRealtime());
    }

    public C128B(C128C c128c, MusicModel musicModel) {
        this.LIZIZ = c128c;
        this.LIZJ = musicModel;
    }

    @Override // X.InterfaceC202028143e
    public final void LIZ(String str, MusicWaveBean musicWaveBean, Boolean bool) {
        C19EG c19egLIZIZ;
        Context context = this.LIZIZ.LIZJ;
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            c19egLIZIZ.runOnUiThread(new ARunnableS37S0400000_29(this.LIZJ, musicWaveBean, this.LIZIZ, str, this, 0));
        }
    }
}
