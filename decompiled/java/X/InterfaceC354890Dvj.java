package X;

import com.bytedance.ies.nle.editor_jni.NLEAIMatting;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentChromaChannel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.ugc.android.editor.core.editor.ColorPickerInfo;
import com.ss.ugc.android.editor.core.model.StrokeParams;
import java.io.File;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Dvj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC354890Dvj {
    void LJFF(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2, float f, EnumC356070Dxd enumC356070Dxd);

    void LJIIIZ(NLETrackSlot nLETrackSlot, float f);

    void LJIL(NLETrackSlot nLETrackSlot, File file, int i, boolean z, NLEResourceNode nLEResourceNode, StrokeParams strokeParams, EnumC356070Dxd enumC356070Dxd, Function1<? super NLEAIMatting, Unit> function1);

    Pair<String, EnumC356150Dxl> LJJII();

    void LJJIJIIJIL(NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd);

    Pair<NLETrackSlot, NLETrackSlot> LJJJLIIL(C354760DvW c354760DvW, EnumC356070Dxd enumC356070Dxd);

    void LJJLIL(C354750DvV c354750DvV);

    void LJJZ(NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd, Function1<? super NLESegmentChromaChannel, Unit> function1);

    void LJJZZI(NLETrackSlot nLETrackSlot, int i, String str);

    void LJLJI(NLETrackSlot nLETrackSlot, NLEResourceNode nLEResourceNode, StrokeParams strokeParams, EnumC356070Dxd enumC356070Dxd);

    void LJLJJI(C354780DvY c354780DvY, EnumC356070Dxd enumC356070Dxd);

    void LJLLL(NLETrackSlot nLETrackSlot, long j, float f, float f2, String str, String str2, ColorPickerInfo colorPickerInfo, EnumC356070Dxd enumC356070Dxd);

    void LJZL(NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd, Function1<? super NLEAIMatting, Unit> function1);

    void LLI(boolean z, NLETrackSlot nLETrackSlot, int i, EnumC356070Dxd enumC356070Dxd);

    void LLIIIJ(NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd);

    void LLILII(NLETrackSlot nLETrackSlot, String str, EnumC356150Dxl enumC356150Dxl, EnumC356070Dxd enumC356070Dxd);

    void LLILZIL(NLETrackSlot nLETrackSlot, Pair<Integer, Integer> pair);
}
