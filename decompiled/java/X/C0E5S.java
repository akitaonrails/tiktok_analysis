package X;

import android.view.View;
import androidx.lifecycle.LiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.ugc.android.editor.track.CurrentSlotInfo;
import com.ss.ugc.android.editor.track.PlayPositionState;
import com.ss.ugc.android.editor.track.SeekInfo;
import com.ss.ugc.android.editor.track.TrackShowType;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0E5S, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public interface C0E5S extends C05YF {
    double A9();

    void G22(NLETrackSlot nLETrackSlot, C0E6E c0e6e, EnumC358760E4s enumC358760E4s, boolean z, boolean z2, boolean z3);

    void I61(NLEModel nLEModel, boolean z, boolean z2);

    InterfaceC368720Ecw Ji(Function1<? super NLETrackSlot, Boolean> function1);

    void LJJIJIIJIL();

    LiveData<C0E6I> LLLIIIL();

    void NT0();

    LiveData<Pair<List<NLETrackSlot>, List<NLETrackSlot>>> NU1();

    LiveState<TrackShowType> Q82();

    void QD2(boolean z, boolean z2);

    void R41(boolean z);

    void Tp(boolean z);

    void Xa2(Function1<? super C359500E7o, C359500E7o> function1);

    void ZP0(boolean z);

    void Zv();

    void ai();

    LiveEvent<NLETrackSlot> dE0();

    LiveData<C0E75> dQ();

    void da0(TrackShowType trackShowType);

    LiveState<C359380E7c> fC2();

    void j();

    void jB2();

    void lf1(long j, int i);

    void pl(float f);

    void q8(C0E6E c0e6e);

    boolean u80();

    LiveEvent<Unit> uo2();

    CurrentSlotInfo vD1();

    void w6(NLETrack nLETrack, boolean z, boolean z2);

    void wE(boolean z);

    View xg();

    void yV(Function1<? super C359480E7m, C359480E7m> function1);

    LiveData<SeekInfo> zE2();

    void zv(PlayPositionState playPositionState, boolean z);
}
