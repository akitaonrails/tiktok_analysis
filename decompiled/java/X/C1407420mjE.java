package X;

import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.ss.android.vesdk.LoudnessDetectResult;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0mjE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1407420mjE extends AbstractC1407430mjF {
    @Override // X.AbstractC1407430mjF
    public final void LIZJ(InterfaceC1452170ntP interfaceC1452170ntP, LoudnessDetectResult[] loudnessDetectResultArr, C1407400mjC[] c1407400mjCArr, InterfaceC1407460mjI interfaceC1407460mjI) {
        if (interfaceC1452170ntP != null) {
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP);
            if (c348100DkmLIZIZ != null) {
                ArrayList arrayList = new ArrayList();
                int length = c1407400mjCArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    C1407400mjC c1407400mjC = c1407400mjCArr[i];
                    int i3 = i2 + 1;
                    if (loudnessDetectResultArr[i2].result == 0) {
                        C347470Djl c347470Djl = new C347470Djl(NLEEditorJniJNI.NLEFilterName_getAUDIO_LOUDNESS_BALANCE_FILTER());
                        c347470Djl.LJIIIZ = Double.valueOf(loudnessDetectResultArr[i2].avgLoudness);
                        c347470Djl.LJIIJ = Double.valueOf(loudnessDetectResultArr[i2].peakLoudness);
                        c347470Djl.LJIIJJI = Double.valueOf(c1407400mjC.LIZLLL);
                        if (c1407400mjC.LJIIIZ != 0) {
                            c347470Djl.LJ = Long.valueOf(c1407400mjC.LJIIIIZZ);
                            c347470Djl.LJFF = Long.valueOf(c1407400mjC.LJIIIZ);
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("audioBalanceFilter: ");
                        sbLIZ.append(c347470Djl.LJIIIZ);
                        sbLIZ.append(' ');
                        sbLIZ.append(c347470Djl.LJIIJ);
                        sbLIZ.append(" uuid:");
                        sbLIZ.append(c1407400mjC.LJFF);
                        sbLIZ.append(' ');
                        sbLIZ.append(c347470Djl.LJIIJJI);
                        sbLIZ.append(' ');
                        sbLIZ.append(c347470Djl.LJ);
                        sbLIZ.append(' ');
                        sbLIZ.append(c347470Djl.LJFF);
                        C201955140j.LIZIZ("LoudnessNormalization", C2188811AlT.LIZIZ(sbLIZ));
                        arrayList.add(c347470Djl);
                        String strLJIILL = c348100DkmLIZIZ.LJFF().LJIILL(c1407400mjC.LJFF, c347470Djl);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("complete loudness normalization result: ");
                        sbLIZ2.append(strLJIILL);
                        C201955140j.LIZIZ("LoudnessNormalization", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    i++;
                    i2 = i3;
                }
                if (interfaceC1407460mjI != null) {
                    interfaceC1407460mjI.LIZ((C347470Djl[]) arrayList.toArray(new C347470Djl[0]));
                    return;
                }
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }
}
