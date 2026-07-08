package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Dvm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC354920Dvm {
    NLETrackSlot LJII(NLETrack nLETrack, C350470Dob c350470Dob, EnumC356070Dxd enumC356070Dxd);

    Pair<NLETrack, NLETrackSlot> LJIJ(boolean z, NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd, NLEModel nLEModel);

    boolean LJJJLZIJ(boolean z, NLETrackSlot nLETrackSlot, float f, boolean z2, EnumC356070Dxd enumC356070Dxd);

    NLETrackSlot LJZI(boolean z, C350540Doi c350540Doi, NLETrack nLETrack, EnumC356070Dxd enumC356070Dxd, NLEModel nLEModel);

    NLETrackSlot LL(NLETrackSlot nLETrackSlot, C350540Doi c350540Doi, EnumC356070Dxd enumC356070Dxd, NLEModel nLEModel, boolean z);
}
