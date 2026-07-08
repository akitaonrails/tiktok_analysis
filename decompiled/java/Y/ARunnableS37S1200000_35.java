package Y;

import X.C08SB;
import X.C1C7U;
import X.C1DO6;
import X.C1DO8;
import X.C1DOD;
import X.C1DPB;
import X.C2084508Ep;
import X.C2188811AlT;
import com.bytedance.ies.effecteditor.swig.EEStdStringVector;
import com.bytedance.ies.effecteditor.swig.EffectEditorJniJNI;
import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;
import java.util.UUID;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes36.dex */
public class ARunnableS37S1200000_35 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS37S1200000_35.LIZ$0():void");
    }

    public static final void run$0(ARunnableS37S1200000_35 aRunnableS37S1200000_35) {
        C1DPB c1dpb = (C1DPB) aRunnableS37S1200000_35.l1;
        String str = aRunnableS37S1200000_35.s0;
        C1DO8 c1do8 = (C1DO8) aRunnableS37S1200000_35.l2;
        c1dpb.getClass();
        C1C7U.LIZ("EEUIAnnotationAsset@be7f.updateForVlExtra$1L");
        String strSubstring = str.substring(str.lastIndexOf(e3.d) + 1);
        String strLIZJ = C2084508Ep.LIZJ(str);
        if (strLIZJ == null) {
            strLIZJ = UUID.randomUUID().toString();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZJ);
        sbLIZ.append(e3.d);
        sbLIZ.append(strSubstring);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(c1dpb.LIZLLL);
        String str2 = C08SB.LIZ;
        sbLIZ2.append(str2);
        sbLIZ2.append(EffectEditorJniJNI.kUIAnnotationCallbackTypeVlExtra());
        sbLIZ2.append(str2);
        sbLIZ2.append(strLIZIZ);
        if (C08SB.LIZ(str, C2188811AlT.LIZIZ(sbLIZ2))) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(str2);
            sbLIZ3.append(EffectEditorJniJNI.kUIAnnotationCallbackTypeVlExtra());
            sbLIZ3.append(str2);
            sbLIZ3.append(strLIZIZ);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
            U u = c1dpb.LIZJ;
            if (u != 0) {
                u.updateValue(new EEStdStringVector(new String[]{strLIZIZ2}));
            }
            C1DO6.LIZIZ(c1do8);
            C1DOD.LIZIZ();
            C1C7U.LIZIZ("EEUIAnnotationAsset@be7f.updateForVlExtra$1L");
            return;
        }
        C1DO6.LIZ(c1do8, UIAnnotationErrorCode.UIAnnotationErrorCode_AssetsSaveFailed);
        C1DOD.LIZIZ();
        C1C7U.LIZIZ("EEUIAnnotationAsset@be7f.updateForVlExtra$1L");
    }

    public static final void run$1(ARunnableS37S1200000_35 aRunnableS37S1200000_35) {
        boolean zLIZ;
        C1C7U.LIZ("ConsumeManager@fa78.handleLancetEventV3$1");
        try {
            aRunnableS37S1200000_35.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ConsumeManager@fa78.handleLancetEventV3$1");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0106 A[Catch: all -> 0x011d, TryCatch #2 {all -> 0x011d, blocks: (B:38:0x00c0, B:40:0x00c6, B:42:0x00cc, B:61:0x010b, B:59:0x0103, B:60:0x0106, B:44:0x00d2, B:46:0x00dd, B:48:0x00e3, B:50:0x00ee, B:52:0x00f4, B:55:0x00fb), top: B:76:0x00c0, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void run$2(Y.ARunnableS37S1200000_35 r7) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS37S1200000_35.run$2(Y.ARunnableS37S1200000_35):void");
    }

    public ARunnableS37S1200000_35(Object obj, String str, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
    }
}
