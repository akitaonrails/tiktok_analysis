package Y;

import X.AbstractC1000340c8e;
import X.C08SB;
import X.C1C7U;
import X.C1DO6;
import X.C1DO8;
import X.C1DOD;
import X.C1DP9;
import X.C1DPB;
import X.C1DPC;
import X.C1DPD;
import X.C20516015Pq;
import X.C2084508Ep;
import X.C2109908Oj;
import X.C2188811AlT;
import X.C2255521DPy;
import X.C823050WQl;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.widget.Widget;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.ies.effecteditor.swig.EEStdStringVector;
import com.bytedance.ies.effecteditor.swig.EffectEditorJniJNI;
import com.bytedance.ies.effecteditor.swig.UIAnnotationAsset;
import com.bytedance.ies.effecteditor.swig.UIAnnotationAssetUIMore;
import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;
import com.bytedance.ies.effecteditor.swig.UIAnnotationUpdateType;
import com.ss.android.ugc.aweme.commercialize.service.ComponentShowStatusExamineProxy;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes36.dex */
public class ARunnableS43S0400000_35 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    public static final void run$8(ARunnableS43S0400000_35 aRunnableS43S0400000_35) {
        ((WidgetManager) aRunnableS43S0400000_35.l0).lambda$continueLoadNew$10((Widget) aRunnableS43S0400000_35.l1, (C20516015Pq) aRunnableS43S0400000_35.l2, (View) aRunnableS43S0400000_35.l3);
    }

    public static final void run$9(ARunnableS43S0400000_35 aRunnableS43S0400000_35) {
        ((WidgetManager) aRunnableS43S0400000_35.l0).lambda$continueLoadOld$9((Widget) aRunnableS43S0400000_35.l1, (ViewGroup) aRunnableS43S0400000_35.l2, (View) aRunnableS43S0400000_35.l3);
    }

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
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS43S0400000_35 aRunnableS43S0400000_35) {
        EEStdStringVector eEStdStringVector;
        C1DPB c1dpb = (C1DPB) aRunnableS43S0400000_35.l0;
        Object obj = aRunnableS43S0400000_35.l1;
        UIAnnotationUpdateType uIAnnotationUpdateType = (UIAnnotationUpdateType) aRunnableS43S0400000_35.l2;
        C1DO8 c1do8 = (C1DO8) aRunnableS43S0400000_35.l3;
        c1dpb.getClass();
        C1C7U.LIZ("EEUIAnnotationAsset@be7f.updateValue$1L");
        if (obj instanceof Object[]) {
            if (((Object[]) obj).length > 0) {
                if (obj instanceof Bitmap[]) {
                    C1DOD.LIZ();
                    C823050WQl.LIZJ().execute(new ARunnableS43S0400000_35(c1dpb, (Bitmap[]) obj, c1do8, uIAnnotationUpdateType, 1));
                } else if (obj instanceof C2109908Oj[]) {
                    C1DOD.LIZ();
                    C823050WQl.LIZJ().execute(new ARunnableS43S0400000_35(c1dpb, (C2109908Oj[]) obj, c1do8, uIAnnotationUpdateType, 2));
                } else if (obj instanceof String[]) {
                    C1DOD.LIZ();
                    C823050WQl.LIZJ().execute(new ARunnableS43S0400000_35(c1do8, c1dpb, uIAnnotationUpdateType, (String[]) obj, 3));
                } else {
                    C1DO6.LIZ(c1do8, UIAnnotationErrorCode.UIAnnotationErrorCode_UpdateValueFault);
                }
            } else {
                U u = c1dpb.LIZJ;
                if (u != 0) {
                    UIAnnotationAssetUIMore uIAnnotationAssetUIMoreDynamicCast = UIAnnotationAssetUIMore.dynamicCast(u.getUIMore());
                    U u2 = c1dpb.LIZJ;
                    if (uIAnnotationAssetUIMoreDynamicCast != null) {
                        eEStdStringVector = uIAnnotationAssetUIMoreDynamicCast.getLastValue();
                    } else {
                        eEStdStringVector = new EEStdStringVector();
                    }
                    u2.updateValue(eEStdStringVector, uIAnnotationUpdateType, new C1DP9(c1do8));
                } else {
                    C1DO6.LIZ(c1do8, UIAnnotationErrorCode.UIAnnotationErrorCode_NullPtr);
                }
            }
        } else {
            C1DO6.LIZ(c1do8, UIAnnotationErrorCode.UIAnnotationErrorCode_UpdateValueFault);
        }
        C1DOD.LIZIZ();
        C1C7U.LIZIZ("EEUIAnnotationAsset@be7f.updateValue$1L");
    }

    public static final void run$1(ARunnableS43S0400000_35 aRunnableS43S0400000_35) {
        C1DPB c1dpb = (C1DPB) aRunnableS43S0400000_35.l0;
        Bitmap[] bitmapArr = (Bitmap[]) aRunnableS43S0400000_35.l1;
        C1DO8 c1do8 = (C1DO8) aRunnableS43S0400000_35.l2;
        UIAnnotationUpdateType uIAnnotationUpdateType = (UIAnnotationUpdateType) aRunnableS43S0400000_35.l3;
        c1dpb.getClass();
        C1C7U.LIZ("EEUIAnnotationAsset@be7f.updateForImages$1L");
        ArrayList arrayList = new ArrayList(bitmapArr.length);
        for (Bitmap bitmap : bitmapArr) {
            String strLIZIZ = C2084508Ep.LIZIZ(bitmap);
            if (strLIZIZ == null) {
                strLIZIZ = UUID.randomUUID().toString();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(".png");
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c1dpb.LJFF);
            String str = C08SB.LIZ;
            sbLIZ2.append(str);
            sbLIZ2.append(strLIZIZ2);
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(c1dpb.LJ);
            sbLIZ3.append(str);
            sbLIZ3.append(strLIZIZ2);
            if (C08SB.LIZLLL(bitmap, Bitmap.CompressFormat.PNG, C2188811AlT.LIZIZ(sbLIZ3))) {
                arrayList.add(strLIZIZ3);
            } else {
                C1DO6.LIZ(c1do8, UIAnnotationErrorCode.UIAnnotationErrorCode_AssetsSaveFailed);
                C1DOD.LIZIZ();
                C1C7U.LIZIZ("EEUIAnnotationAsset@be7f.updateForImages$1L");
                return;
            }
        }
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        U u = c1dpb.LIZJ;
        if (u != 0) {
            u.updateValue(new EEStdStringVector(strArr), uIAnnotationUpdateType, new C1DP9(c1do8));
        } else {
            C1DO6.LIZ(c1do8, UIAnnotationErrorCode.UIAnnotationErrorCode_NullPtr);
        }
        C1DOD.LIZIZ();
        C1C7U.LIZIZ("EEUIAnnotationAsset@be7f.updateForImages$1L");
    }

    public static final void run$10(ARunnableS43S0400000_35 aRunnableS43S0400000_35) {
        boolean zLIZ;
        C1C7U.LIZ("ComponentShowStatusExamineProxy@cedb.addComponent$1");
        try {
            C2255521DPy c2255521DPy = ((ComponentShowStatusExamineProxy) aRunnableS43S0400000_35.l0).LIZ;
            if (c2255521DPy != null) {
                c2255521DPy.at((AbstractC1000340c8e) aRunnableS43S0400000_35.l1, (View) aRunnableS43S0400000_35.l2, (Function1) aRunnableS43S0400000_35.l3);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ComponentShowStatusExamineProxy@cedb.addComponent$1");
    }

    public static final void run$2(ARunnableS43S0400000_35 aRunnableS43S0400000_35) {
        C1DPB c1dpb = (C1DPB) aRunnableS43S0400000_35.l0;
        C2109908Oj[] c2109908OjArr = (C2109908Oj[]) aRunnableS43S0400000_35.l1;
        C1DO8 c1do8 = (C1DO8) aRunnableS43S0400000_35.l2;
        UIAnnotationUpdateType uIAnnotationUpdateType = (UIAnnotationUpdateType) aRunnableS43S0400000_35.l3;
        c1dpb.getClass();
        C1C7U.LIZ("EEUIAnnotationAsset@be7f.updateForEEFrames$1L");
        ArrayList arrayList = new ArrayList(c2109908OjArr.length);
        for (C2109908Oj c2109908Oj : c2109908OjArr) {
            c2109908Oj.getClass();
            String strLIZIZ = C2084508Ep.LIZIZ(null);
            if (strLIZIZ == null) {
                strLIZIZ = UUID.randomUUID().toString();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(".png");
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c1dpb.LJFF);
            String str = C08SB.LIZ;
            sbLIZ2.append(str);
            sbLIZ2.append(strLIZIZ2);
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(c1dpb.LJ);
            sbLIZ3.append(str);
            sbLIZ3.append(strLIZIZ2);
            if (C08SB.LIZLLL(null, Bitmap.CompressFormat.PNG, C2188811AlT.LIZIZ(sbLIZ3))) {
                arrayList.add(strLIZIZ3);
            } else {
                C1DO6.LIZ(c1do8, UIAnnotationErrorCode.UIAnnotationErrorCode_AssetsSaveFailed);
                C1DOD.LIZIZ();
                C1C7U.LIZIZ("EEUIAnnotationAsset@be7f.updateForEEFrames$1L");
                return;
            }
        }
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        U u = c1dpb.LIZJ;
        if (u != 0) {
            u.updateValue(new EEStdStringVector(strArr), uIAnnotationUpdateType, new C1DP9(c1do8));
        } else {
            C1DO6.LIZ(c1do8, UIAnnotationErrorCode.UIAnnotationErrorCode_NullPtr);
        }
        C1DOD.LIZIZ();
        C1C7U.LIZIZ("EEUIAnnotationAsset@be7f.updateForEEFrames$1L");
    }

    public static final void run$3(ARunnableS43S0400000_35 aRunnableS43S0400000_35) {
        String callbackType;
        C1DPB c1dpb = (C1DPB) aRunnableS43S0400000_35.l0;
        String[] strArr = (String[]) aRunnableS43S0400000_35.l1;
        UIAnnotationUpdateType uIAnnotationUpdateType = (UIAnnotationUpdateType) aRunnableS43S0400000_35.l2;
        C1DO8 c1do8 = (C1DO8) aRunnableS43S0400000_35.l3;
        c1dpb.getClass();
        C1C7U.LIZ("EEUIAnnotationAsset@be7f.updateForUrls$1L");
        U u = c1dpb.LIZJ;
        if (u != 0) {
            callbackType = ((UIAnnotationAsset) u).getCallbackType();
        } else {
            callbackType = "";
        }
        if (EffectEditorJniJNI.kUIAnnotationCallbackTypeVlExtra().equals(callbackType)) {
            if (strArr.length > 0) {
                String str = strArr[0];
                C1DOD.LIZ();
                C823050WQl.LIZJ().execute(new ARunnableS37S1200000_35(c1dpb, str, c1do8, 0));
                C1DOD.LIZIZ();
                C1C7U.LIZIZ("EEUIAnnotationAsset@be7f.updateForUrls$1L");
                return;
            }
            C1DO6.LIZIZ(c1do8);
            C1DOD.LIZIZ();
            C1C7U.LIZIZ("EEUIAnnotationAsset@be7f.updateForUrls$1L");
            return;
        }
        C1DOD.LIZ();
        C823050WQl.LIZJ().execute(new ARunnableS43S0400000_35(c1do8, c1dpb, uIAnnotationUpdateType, strArr, 4));
        C1DOD.LIZIZ();
        C1C7U.LIZIZ("EEUIAnnotationAsset@be7f.updateForUrls$1L");
    }

    public static final void run$4(ARunnableS43S0400000_35 aRunnableS43S0400000_35) {
        C1DPB c1dpb = (C1DPB) aRunnableS43S0400000_35.l0;
        String[] strArr = (String[]) aRunnableS43S0400000_35.l1;
        C1DO8 c1do8 = (C1DO8) aRunnableS43S0400000_35.l2;
        UIAnnotationUpdateType uIAnnotationUpdateType = (UIAnnotationUpdateType) aRunnableS43S0400000_35.l3;
        c1dpb.getClass();
        C1C7U.LIZ("EEUIAnnotationAsset@be7f.updateForFiles$1L");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
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
            sbLIZ2.append(c1dpb.LJFF);
            String str2 = C08SB.LIZ;
            sbLIZ2.append(str2);
            sbLIZ2.append(strLIZIZ);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(c1dpb.LJ);
            sbLIZ3.append(str2);
            sbLIZ3.append(strLIZIZ);
            if (C08SB.LIZ(str, C2188811AlT.LIZIZ(sbLIZ3))) {
                arrayList.add(strLIZIZ2);
            } else {
                C1DO6.LIZ(c1do8, UIAnnotationErrorCode.UIAnnotationErrorCode_AssetsSaveFailed);
                C1DOD.LIZIZ();
                C1C7U.LIZIZ("EEUIAnnotationAsset@be7f.updateForFiles$1L");
                return;
            }
        }
        String[] strArr2 = new String[arrayList.size()];
        arrayList.toArray(strArr2);
        U u = c1dpb.LIZJ;
        if (u != 0) {
            u.updateValue(new EEStdStringVector(strArr2), uIAnnotationUpdateType, new C1DP9(c1do8));
        } else {
            C1DO6.LIZ(c1do8, UIAnnotationErrorCode.UIAnnotationErrorCode_NullPtr);
        }
        C1DOD.LIZIZ();
        C1C7U.LIZIZ("EEUIAnnotationAsset@be7f.updateForFiles$1L");
    }

    public static final void run$5(ARunnableS43S0400000_35 aRunnableS43S0400000_35) {
        C1DPD c1dpd = (C1DPD) aRunnableS43S0400000_35.l0;
        Object obj = aRunnableS43S0400000_35.l1;
        UIAnnotationUpdateType uIAnnotationUpdateType = (UIAnnotationUpdateType) aRunnableS43S0400000_35.l2;
        C1DO8 c1do8 = (C1DO8) aRunnableS43S0400000_35.l3;
        c1dpd.getClass();
        C1C7U.LIZ("EEUIAnnotationOptionList@33a5.updateValue$1L");
        if (obj instanceof String[]) {
            C1DOD.LIZ();
            C823050WQl.LIZJ().execute(new ARunnableS43S0400000_35(c1dpd, (String[]) obj, uIAnnotationUpdateType, c1do8, 6));
            C1DOD.LIZIZ();
            C1C7U.LIZIZ("EEUIAnnotationOptionList@33a5.updateValue$1L");
            return;
        }
        C1DO6.LIZ(c1do8, UIAnnotationErrorCode.UIAnnotationErrorCode_UpdateValueFault);
        C1DOD.LIZIZ();
        C1C7U.LIZIZ("EEUIAnnotationOptionList@33a5.updateValue$1L");
    }

    public static final void run$6(ARunnableS43S0400000_35 aRunnableS43S0400000_35) {
        C1DPD c1dpd = (C1DPD) aRunnableS43S0400000_35.l0;
        String[] strArr = (String[]) aRunnableS43S0400000_35.l1;
        UIAnnotationUpdateType uIAnnotationUpdateType = (UIAnnotationUpdateType) aRunnableS43S0400000_35.l2;
        C1DO8 c1do8 = (C1DO8) aRunnableS43S0400000_35.l3;
        c1dpd.getClass();
        C1C7U.LIZ("EEUIAnnotationOptionList@33a5.updateForOptionKeyArray$1L");
        U u = c1dpd.LIZJ;
        if (u != 0) {
            u.updateValue(new EEStdStringVector(strArr), uIAnnotationUpdateType, new C1DP9(c1do8));
        } else {
            C1DO6.LIZ(c1do8, UIAnnotationErrorCode.UIAnnotationErrorCode_NullPtr);
        }
        C1DOD.LIZIZ();
        C1C7U.LIZIZ("EEUIAnnotationOptionList@33a5.updateForOptionKeyArray$1L");
    }

    public static final void run$7(ARunnableS43S0400000_35 aRunnableS43S0400000_35) {
        final C1DPC c1dpc = (C1DPC) aRunnableS43S0400000_35.l0;
        Object obj = aRunnableS43S0400000_35.l1;
        final UIAnnotationUpdateType uIAnnotationUpdateType = (UIAnnotationUpdateType) aRunnableS43S0400000_35.l2;
        final C1DO8 c1do8 = (C1DO8) aRunnableS43S0400000_35.l3;
        c1dpc.getClass();
        C1C7U.LIZ("EEUIAnnotationTextInput@3f73.updateValue$1L");
        if (obj instanceof String) {
            final String str = (String) obj;
            C1DOD.LIZ();
            C823050WQl.LIZJ().execute(new Runnable() { // from class: X.1DPA
                @Override // java.lang.Runnable
                public final void run() {
                    C1DPC c1dpc2 = c1dpc;
                    String str2 = str;
                    UIAnnotationUpdateType uIAnnotationUpdateType2 = uIAnnotationUpdateType;
                    C1DO8 c1do82 = c1do8;
                    c1dpc2.getClass();
                    C1C7U.LIZ("EEUIAnnotationTextInput@3f73.updateForText$1L");
                    U u = c1dpc2.LIZJ;
                    if (u != 0) {
                        u.updateValue(str2, uIAnnotationUpdateType2, new C1DP9(c1do82));
                    } else {
                        C1DO6.LIZ(c1do82, UIAnnotationErrorCode.UIAnnotationErrorCode_NullPtr);
                    }
                    C1DOD.LIZIZ();
                    C1C7U.LIZIZ("EEUIAnnotationTextInput@3f73.updateForText$1L");
                }
            });
            C1DOD.LIZIZ();
            C1C7U.LIZIZ("EEUIAnnotationTextInput@3f73.updateValue$1L");
            return;
        }
        C1DO6.LIZ(c1do8, UIAnnotationErrorCode.UIAnnotationErrorCode_UpdateValueFault);
        C1DOD.LIZIZ();
        C1C7U.LIZIZ("EEUIAnnotationTextInput@3f73.updateValue$1L");
    }

    public ARunnableS43S0400000_35(C1DO8 c1do8, C1DPB c1dpb, UIAnnotationUpdateType uIAnnotationUpdateType, String[] strArr, int i) {
        this.$t = i;
        if (3 - i != 0) {
            this.l0 = c1dpb;
            this.l1 = strArr;
            this.l2 = c1do8;
            this.l3 = uIAnnotationUpdateType;
            return;
        }
        this.l0 = c1dpb;
        this.l1 = strArr;
        this.l2 = uIAnnotationUpdateType;
        this.l3 = c1do8;
    }

    public ARunnableS43S0400000_35(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
