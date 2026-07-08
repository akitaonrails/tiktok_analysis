package X;

import com.bytedance.ies.nle.editor_jni.NLETemplateJNI;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.SetInt;
import com.bytedance.ies.nle.editor_jni.SetString;
import com.bytedance.ies.nle.editor_jni.VecUInt32;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nNF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1432230nNF extends C09AY implements Function0<InterfaceC1432240nNG> {
    public C1432230nNF() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1432240nNG invoke() {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "nle_so_avoid_load", true, false)) {
            C382301e9 c382301e9 = C382301e9.LIZ;
            if (!(!Intrinsics.LJFF(C382301e9.LIZIZ.getString("ve_version", ""), "21.8.0.128"))) {
                return c382301e9;
            }
        }
        return new InterfaceC1432240nNG() { // from class: X.1Dq7
            @Override // X.InterfaceC1432240nNG
            public final List<Long> LIZIZ(List<String> list, boolean z) {
                return NLETemplateModel.getAllSupportFeatureBits(new SetString(list));
            }

            @Override // X.InterfaceC1432240nNG
            public final List<Long> LIZJ(List<String> list, boolean z) {
                SetInt setInt = new SetInt();
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    setInt.add(NLETemplateJNI.NLETemplateModel_getFeatureIndex__SWIG_0(it2.next()));
                }
                return NLETemplateModel.getSupportUGCFeatureExcludeFeatures(setInt);
            }

            @Override // X.InterfaceC1432240nNG
            public final boolean LIZ(List<Long> list, List<Long> list2, boolean z) {
                if (((Boolean) C18092076s.LIZ.getValue()).booleanValue()) {
                    return NLETemplateModel.canSupportFeatureBits(new VecUInt32(C13LP.LJJJJLI(list)), new VecUInt32(C13LP.LJJJJLI(list2)));
                }
                return NLETemplateModel.canSupportFeatureBits(new VecUInt32(list), new VecUInt32(list2));
            }
        };
    }
}
