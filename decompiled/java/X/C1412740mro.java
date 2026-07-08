package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0mro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1412740mro {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;

    public final Pair<Integer, Integer> LIZ() {
        return new Pair<>(Integer.valueOf(this.LIZ), Integer.valueOf(this.LIZIZ));
    }

    public final void LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        Pair<Integer, Integer> pairLJJIIZ = C1416310mxZ.LJJIIZ(videoPublishEditModel);
        this.LIZ = pairLJJIIZ.getFirst().intValue();
        this.LIZIZ = pairLJJIIZ.getSecond().intValue();
        this.LIZJ = C580270MpN.LJIIIZ(videoPublishEditModel);
    }
}
