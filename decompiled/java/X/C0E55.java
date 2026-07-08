package X;

import android.util.Size;
import android.view.SurfaceView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.INLEListenerFirstFrame;
import com.bytedance.ies.nle.editor_jni.INLEListenerSeek;
import com.bytedance.ies.nle.editor_jni.INLEListenerVideoOutput;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESeekFlag;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0E55, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public interface C0E55 {
    long Jh();

    void LIZ(Function0<Unit> function0);

    void LIZIZ(long j);

    C560530Lyd LIZJ();

    MutableLiveData LIZLLL();

    MutableLiveData LJ();

    void LJFF(long j, NLESeekFlag nLESeekFlag, INLEListenerSeek iNLEListenerSeek);

    void LJI(SurfaceView surfaceView);

    void LJII(NLETrackSlot nLETrackSlot);

    void LJIIIIZZ(long j, long j2, boolean z);

    void LJIIIZ(INLEListenerFirstFrame iNLEListenerFirstFrame);

    void LJIIJ(NLEModel nLEModel, boolean z, Function0<Unit> function0);

    void LJIIJJI(long j, NLETrack nLETrack, NLETrackSlot nLETrackSlot);

    void LJIIL(float f, float f2, long j);

    void LJIILIIL();

    void LJIILJJIL(float f, float f2, float f3, float f4, InterfaceC1685420txc<? super SurfaceView, ? super Float, ? super Float, ? super Float, ? super Float, Unit> interfaceC1685420txc);

    void LJIILL(boolean z);

    void LJIILLIIL(INLEPlayer iNLEPlayer);

    void LJIIZILJ(boolean z);

    void LJIJ(long j, Boolean bool, Function0<Unit> function0);

    void LJIJI(long j, INLEListenerSeek iNLEListenerSeek);

    void LJIJJ();

    void LJIJJLI();

    void LJIL(C363090ELj c363090ELj);

    void LJJ(INLEListenerVideoOutput iNLEListenerVideoOutput);

    void LJJI();

    C560530Lyd LJJIFFI();

    void LJJII(long j, INLEListenerSeek iNLEListenerSeek);

    void LJJIII(INLEListenerVideoOutput iNLEListenerVideoOutput);

    void LJJIIJ();

    void LJJIIJZLJL(Function0<Unit> function0);

    void LJJIIZ(Integer num);

    void LJJIIZI(long j, long j2, boolean z, boolean z2);

    boolean LJJIJ();

    void LLIL(boolean z);

    float[] LLJLLIL();

    void Wj(boolean z);

    void ba(long j, INLEListenerSeek iNLEListenerSeek);

    void flushSeekCmd();

    Size getInitSize();

    boolean isPlaying();

    void onDestroy();

    void onVisibilityChanged(boolean z);

    void pause(boolean z);

    void prepare();

    long qq();

    void setActive(boolean z);

    void skipNextSeek(boolean z);
}
