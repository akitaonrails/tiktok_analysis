package X;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1ASc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2179641ASc {
    public final List<PlaybackStateCompat.CustomAction> LIZ;
    public int LIZIZ;
    public long LIZJ;
    public final long LIZLLL;
    public float LJ;
    public long LJFF;
    public final int LJI;
    public final CharSequence LJII;
    public long LJIIIIZZ;
    public final long LJIIIZ;
    public final Bundle LJIIJ;

    public final PlaybackStateCompat LIZ() {
        return new PlaybackStateCompat(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LIZ, this.LJIIIZ, this.LJIIJ);
    }

    public C2179641ASc() {
        this.LIZ = new ArrayList();
        this.LJIIIZ = -1L;
    }

    public C2179641ASc(PlaybackStateCompat playbackStateCompat) {
        ArrayList arrayList = new ArrayList();
        this.LIZ = arrayList;
        this.LJIIIZ = -1L;
        this.LIZIZ = playbackStateCompat.mState;
        this.LIZJ = playbackStateCompat.mPosition;
        this.LJ = playbackStateCompat.mSpeed;
        this.LJIIIIZZ = playbackStateCompat.mUpdateTime;
        this.LIZLLL = playbackStateCompat.mBufferedPosition;
        this.LJFF = playbackStateCompat.mActions;
        this.LJI = playbackStateCompat.mErrorCode;
        this.LJII = playbackStateCompat.mErrorMessage;
        List<PlaybackStateCompat.CustomAction> list = playbackStateCompat.mCustomActions;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.LJIIIZ = playbackStateCompat.mActiveItemId;
        this.LJIIJ = playbackStateCompat.mExtras;
    }

    public final void LIZIZ(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.LIZIZ = i;
        this.LIZJ = j;
        this.LJIIIIZZ = jElapsedRealtime;
        this.LJ = 1.0f;
    }
}
