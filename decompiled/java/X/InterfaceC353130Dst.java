package X;

import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.ugc.android.editor.core.api.params.EditMedia;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS214S0300000_5;
import kotlin.jvm.internal.AwS249S0300000_5;

/* JADX INFO: renamed from: X.0Dst, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC353130Dst {
    void LJIILJJIL(NLETrackSlot nLETrackSlot, long j, long j2, long j3, EnumC356070Dxd enumC356070Dxd);

    void LJIJI(NLETrack nLETrack, NLETrackSlot nLETrackSlot, boolean z, boolean z2);

    NLETrackSlot LJJ(EditMedia editMedia, C350990DpR c350990DpR, InterfaceC351060DpY interfaceC351060DpY, Function1<? super NLETrackSlot, Unit> function1);

    void LJJIIJZLJL(NLETrackSlot nLETrackSlot, int i, int i2, EnumC356070Dxd enumC356070Dxd);

    boolean LJJIJLIJ(List list, AwS214S0300000_5 awS214S0300000_5);

    void LJLJLLL(List<EditMedia> list, C350990DpR c350990DpR, boolean z, Function1<? super NLETrackSlot, Unit> function1);

    void LJLLLLLL(List<C350130Do3> list, C350990DpR c350990DpR);

    void LLD(int i, int i2, NLETrackSlot nLETrackSlot, long j, long j2, long j3, boolean z, EnumC356070Dxd enumC356070Dxd);

    void LLFZ(NLETrackSlot nLETrackSlot, long j, long j2, int i, EnumC356070Dxd enumC356070Dxd);

    AbstractC351020DpU LLIIIL(NLETrackSlot nLETrackSlot);

    boolean LLIIL(List list, Boolean bool, AwS249S0300000_5 awS249S0300000_5);

    void LLJ(NLETrackSlot nLETrackSlot, long j, long j2, EnumC356070Dxd enumC356070Dxd);
}
