package X;

import Y.ACallableS255S0200000_30;
import Y.ACallableS433S0100000_30;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: renamed from: X.143t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202043143t implements InterfaceC202028143e {
    public final InterfaceC202028143e LIZ;

    @Override // X.InterfaceC202028143e
    public final void LIZIZ(Map map, Map map2) {
    }

    @Override // X.InterfaceC202028143e
    public final void onCancel() {
        C15O7.LIZIZ(new ACallableS433S0100000_30(this, 2), C15O7.LJIIIIZZ, null);
    }

    @Override // X.InterfaceC202028143e
    public final void onStart() {
        C15O7.LIZIZ(new ACallableS433S0100000_30(this, 3), C15O7.LJIIIIZZ, null);
    }

    public C202043143t(C202041143r c202041143r) {
        this.LIZ = c202041143r;
    }

    @Override // X.InterfaceC202028143e
    public final void LIZJ(C202035143l c202035143l) {
        C15O7.LIZIZ(new ACallableS255S0200000_30(this, c202035143l, 1), C15O7.LJIIIIZZ, null);
    }

    @Override // X.InterfaceC202028143e
    public final void onProgress(final int i) {
        C15O7.LIZIZ(new Callable() { // from class: X.143u
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("MainThreadMusicDownloadListener@7489.onProgress$1");
                this.LL.LIZ.onProgress(i);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MainThreadMusicDownloadListener@7489.onProgress$1");
                return unit;
            }
        }, C15O7.LJIIIIZZ, null);
    }

    @Override // X.InterfaceC202028143e
    public final void LIZ(final String str, final MusicWaveBean musicWaveBean, final Boolean bool) {
        C15O7.LIZIZ(new Callable() { // from class: X.143s
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("MainThreadMusicDownloadListener@7489.onSuccess$1");
                this.LL.LIZ.LIZ(str, musicWaveBean, bool);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MainThreadMusicDownloadListener@7489.onSuccess$1");
                return unit;
            }
        }, C15O7.LJIIIIZZ, null);
    }
}
