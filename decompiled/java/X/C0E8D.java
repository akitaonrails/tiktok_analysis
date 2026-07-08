package X;

import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.ugc.android.editor.track.SeekInfo;
import com.ss.ugc.android.editor.track.TrackShowType;

/* JADX INFO: renamed from: X.0E8D, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public interface C0E8D {
    boolean LIZ(TrackShowType trackShowType);

    void LIZIZ(C0E6I c0e6i);

    boolean LIZJ();

    void LIZLLL();

    void LJ();

    void LJFF(String str);

    boolean LJI();

    void LJII();

    boolean LJIIIIZZ(TrackShowType trackShowType);

    boolean LJIIIZ(NLETrackSlot nLETrackSlot, View view);

    void onAddResourceClick();

    void onAudioMuteClick(boolean z, boolean z2);

    void onMove(int i, int i2, NLETrackSlot nLETrackSlot, long j, long j2, long j3, boolean z);

    void onVideoPositionChanged(SeekInfo seekInfo);
}
