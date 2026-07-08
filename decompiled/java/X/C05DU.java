package X;

import com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl;

/* JADX INFO: renamed from: X.05DU, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05DU implements Runnable {
    public final /* synthetic */ ReplaceMusicServiceImpl LL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ReplaceMusicServiceImpl@cb3a.upLoadingTask$1");
        try {
            this.LL.LJIILIIL = false;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ReplaceMusicServiceImpl@cb3a.upLoadingTask$1");
    }

    public C05DU(ReplaceMusicServiceImpl replaceMusicServiceImpl) {
        this.LL = replaceMusicServiceImpl;
    }
}
