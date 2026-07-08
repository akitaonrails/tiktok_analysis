package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.NLECommonKeyframe;
import com.bytedance.ies.nle.editor_jni.NLEKeyframe;
import com.bytedance.ies.nle.editor_jni.NLEKeyframeType;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.List;

/* JADX INFO: renamed from: X.0DqR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC351610DqR {
    NLETrackSlot Ah(long j);

    boolean LJIIJ(NLETrackSlot nLETrackSlot);

    void LJIILIIL(long j);

    void LJJI(long j, NLETrackSlot nLETrackSlot);

    void LJJIII(NLETrackSlot nLETrackSlot);

    void LJJIIJ(NLETrackSlot nLETrackSlot);

    void LJJIJL(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2);

    void LJJJIL(NLEKeyframeType nLEKeyframeType, long j, NLETrackSlot nLETrackSlot);

    MutableLiveData<NLETimeSpaceNode> LJJJJL();

    List<NLECommonKeyframe> LJJLIIIJJIZ(long j);

    boolean LJJLIIIJL();

    MutableLiveData<C375830EoP<Boolean>> LJJLJ();

    long LJLIIL();

    void LLF(long j);

    boolean LLFF();

    void LLIFFJFJJ(long j, NLETrack nLETrack, NLETrackSlot nLETrackSlot);

    void LLIILII(boolean z);

    void LLILIL(long j);

    boolean LLILZLL();

    List<NLEKeyframe> LLJI(long j);

    MutableLiveData LLJIJIL();

    boolean X5();

    void Xb(NLEKeyframeType nLEKeyframeType, boolean z);

    boolean yv(NLEKeyframeType nLEKeyframeType);
}
