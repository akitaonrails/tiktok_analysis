package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0nZU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1439820nZU {
    public final VideoPublishEditModel LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public AVMusic LIZLLL;
    public EnumC1438880nXy LJ;
    public int LJFF;

    public static C1439820nZU LIZ(C1439820nZU c1439820nZU, VideoPublishEditModel videoPublishEditModel, AVMusic aVMusic, int i) {
        boolean z;
        int i2;
        EnumC1438880nXy enumC1438880nXy;
        int i3;
        AVMusic aVMusic2 = aVMusic;
        VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
        if ((i & 1) != 0) {
            videoPublishEditModel2 = c1439820nZU.LIZ;
        }
        if ((i & 2) != 0) {
            z = c1439820nZU.LIZIZ;
        } else {
            z = false;
        }
        if ((i & 4) != 0) {
            i2 = c1439820nZU.LIZJ;
        } else {
            i2 = 0;
        }
        if ((i & 8) != 0) {
            aVMusic2 = c1439820nZU.LIZLLL;
        }
        if ((i & 16) != 0) {
            enumC1438880nXy = c1439820nZU.LJ;
        } else {
            enumC1438880nXy = null;
        }
        if ((i & 32) != 0) {
            i3 = c1439820nZU.LJFF;
        } else {
            i3 = 0;
        }
        return new C1439820nZU(videoPublishEditModel2, z, i2, aVMusic2, enumC1438880nXy, i3);
    }

    public C1439820nZU(VideoPublishEditModel videoPublishEditModel, boolean z, int i, AVMusic aVMusic, EnumC1438880nXy enumC1438880nXy, int i2) {
        this.LIZ = videoPublishEditModel;
        this.LIZIZ = z;
        this.LIZJ = i;
        this.LIZLLL = aVMusic;
        this.LJ = enumC1438880nXy;
        this.LJFF = i2;
    }
}
