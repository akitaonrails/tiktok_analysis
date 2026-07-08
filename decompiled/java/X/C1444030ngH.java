package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import kotlin.Pair;
import lth.o;

/* JADX INFO: renamed from: X.0ngH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1444030ngH {
    public static final /* synthetic */ int LIZ = 0;

    public static final int LIZIZ(StitchParams stitchParams) {
        int duration;
        VideoFileInfo videoFileInfo;
        if (stitchParams == null) {
            return 0;
        }
        EditVideoSegment videoSegment = stitchParams.getVideoSegment();
        if (videoSegment != null && (videoFileInfo = videoSegment.getVideoFileInfo()) != null) {
            duration = (int) videoFileInfo.getDuration();
        } else {
            duration = 0;
        }
        return duration + Math.max(stitchParams.getMusicStart(), 0);
    }

    public static final C443120HZe<Long, Long, Long> LIZ(StitchParams stitchParams, String str, AVMusic aVMusic, long j) {
        long shootDuration;
        long duration;
        long musicStart;
        VideoFileInfo videoFileInfo;
        long musicDuration = o.LJI.getMusicDuration(str);
        if (aVMusic != null) {
            shootDuration = aVMusic.getShootDuration();
        } else {
            shootDuration = musicDuration;
        }
        EditVideoSegment videoSegment = stitchParams.getVideoSegment();
        if (videoSegment != null && (videoFileInfo = videoSegment.getVideoFileInfo()) != null) {
            duration = videoFileInfo.getDuration();
        } else {
            duration = 0;
        }
        long jMin = j - duration;
        if (shootDuration > 0) {
            musicStart = Math.min((musicDuration - ((long) stitchParams.getMusicStart())) - duration, shootDuration - duration);
        } else {
            musicStart = (musicDuration - ((long) stitchParams.getMusicStart())) - duration;
        }
        if (musicStart >= 3000) {
            jMin = Math.min(jMin, musicStart);
        }
        Pair pair = new Pair(Long.valueOf(jMin), Long.valueOf(jMin + duration));
        return new C443120HZe<>(Long.valueOf(musicDuration), Long.valueOf(((Number) pair.getFirst()).longValue()), Long.valueOf(((Number) pair.getSecond()).longValue()));
    }
}
