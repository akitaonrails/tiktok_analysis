package X;

import android.widget.HorizontalScrollView;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.logic.BeatInfo;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0ECp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC360810ECp {
    void LIZ(int i);

    void LIZIZ(Function1 function1, boolean z);

    void LIZJ(int i, Boolean bool);

    boolean LIZLLL();

    void LJ(NLETrackSlot nLETrackSlot, boolean z);

    void LJFF(List list, AwS584S0100000_5 awS584S0100000_5);

    boolean LJI();

    int getCurTimeInMainTrack();

    int getCurTrackTime();

    HorizontalScrollView getHorizontalScrollView();

    int getNextBeatIndex();

    int getPreviousBeatIndex();

    Pair<BeatInfo, Integer> getSelectedBeat();

    void setAudioTrackPaint(InterfaceC367710EbJ interfaceC367710EbJ);

    void setBeats(List<BeatInfo> list);

    void setListener(InterfaceC371250Eh1 interfaceC371250Eh1);
}
