package X;

import com.bytedance.ies.nle.editor_jni.NLEMask;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentMask;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLEMaskSPtr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.android.editor.core.api.params.MaskParam;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0DoX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350430DoX extends C350680Dow implements InterfaceC353780Dtw {
    public C350430DoX(C0E48 c0e48) {
        super(c0e48);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:61|(12:70|(1:72)|69|148|76|(2:78|(1:84))(1:81)|85|(2:87|(1:93))(1:90)|94|(6:98|(3:100|(1:102)|103)|104|(3:106|(1:110)|111)|112|(3:114|(1:118)|119))|120|121)(1:67)|68|69|148|76|(0)(0)|85|(0)(0)|94|(0)|120|121) */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01ab, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ac, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0139 A[Catch: Exception -> 0x01ab, TryCatch #0 {Exception -> 0x01ab, blocks: (B:76:0x012c, B:78:0x0139, B:82:0x0141, B:84:0x0147, B:85:0x014a, B:87:0x0152, B:91:0x015a, B:93:0x0160, B:94:0x0163), top: B:148:0x012c }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0152 A[Catch: Exception -> 0x01ab, TryCatch #0 {Exception -> 0x01ab, blocks: (B:76:0x012c, B:78:0x0139, B:82:0x0141, B:84:0x0147, B:85:0x014a, B:87:0x0152, B:91:0x015a, B:93:0x0160, B:94:0x0163), top: B:148:0x012c }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b1  */
    /* JADX WARN: Type inference failed for: r8v2, types: [T, com.ss.ugc.android.editor.core.api.params.MaskParam] */
    @Override // X.InterfaceC353780Dtw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.ugc.android.editor.core.api.params.MaskParam LJJJJ(com.bytedance.ies.nle.editor_jni.NLETrackSlot r24) {
        /*
            Method dump skipped, instruction units count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C350430DoX.LJJJJ(com.bytedance.ies.nle.editor_jni.NLETrackSlot):com.ss.ugc.android.editor.core.api.params.MaskParam");
    }

    @Override // X.InterfaceC353780Dtw
    public final void LJLILLLLZI(NLETrackSlot nLETrackSlot) {
        for (String str : C1697810uHb.LJIIJJI("none", "line", "mirror", "circle", "text", "rectangle")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mask_params_");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (nLETrackSlot != null) {
                nLETrackSlot.removeExtraWithKey(strLIZIZ);
            }
        }
    }

    public static Float LLJJIJI(String str, JSONObject jSONObject) {
        Double d;
        try {
            Object obj = jSONObject.get(str);
            if (obj instanceof Double) {
                d = (Double) obj;
            } else {
                d = null;
            }
            if (d == null) {
                return null;
            }
            return Float.valueOf((float) d.doubleValue());
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("An operation is not implemented: ");
            sbLIZ.append("Not yet implemented");
            throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LLJJIJIIJIL(MaskParam maskParam, NLESegmentMask nLESegmentMask) {
        NLEResourceNode effectSDKMask;
        NLEResourceNode effectSDKMask2;
        String str = maskParam.LIZ;
        if (str != null && (effectSDKMask2 = nLESegmentMask.getEffectSDKMask()) != null) {
            effectSDKMask2.setResourceFile(str);
        }
        String str2 = maskParam.resourceId;
        if (str2 != null && (effectSDKMask = nLESegmentMask.getEffectSDKMask()) != null) {
            effectSDKMask.setResourceId(str2);
        }
        String str3 = maskParam.maskType;
        if (str3 != null) {
            nLESegmentMask.setMaskType(str3);
        }
        String str4 = maskParam.text;
        if (str4 != null) {
            nLESegmentMask.setText(str4);
        }
        Float f = maskParam.textScaleX;
        if (f != null) {
            nLESegmentMask.setScaleX(f.floatValue());
        }
        Float f2 = maskParam.textScaleY;
        if (f2 != null) {
            nLESegmentMask.setScaleY(f2.floatValue());
        }
        Float f3 = maskParam.maskCenterY;
        if (f3 != null) {
            nLESegmentMask.setCenterY(f3.floatValue());
        }
        Float f4 = maskParam.maskCenterX;
        if (f4 != null) {
            nLESegmentMask.setCenterX(f4.floatValue());
        }
        Float f5 = maskParam.maskWidth;
        if (f5 != null) {
            nLESegmentMask.setWidth(f5.floatValue());
        }
        Float f6 = maskParam.maskHeight;
        if (f6 != null) {
            nLESegmentMask.setHeight(f6.floatValue());
        }
        Float f7 = maskParam.maskRoundCorner;
        if (f7 != null) {
            nLESegmentMask.setRoundCorner(f7.floatValue());
        }
        Float f8 = maskParam.maskRotate;
        if (f8 != null) {
            nLESegmentMask.setRotation(f8.floatValue());
        }
        Boolean bool = maskParam.invert;
        if (bool != null) {
            nLESegmentMask.setInvert(bool.booleanValue());
        }
        Float f9 = maskParam.maskFeather;
        if (f9 != null) {
            nLESegmentMask.setFeather(Math.min(f9.floatValue(), 1.0f));
        }
    }

    @Override // X.InterfaceC353780Dtw
    public final void LJIIL(NLETrackSlot nLETrackSlot, MaskParam maskParam) {
        if (a0.LJJJIL(maskParam.maskType)) {
            return;
        }
        String strLIZIZ = C051R.LIZIZ(MaskParam.LIZ(maskParam, null, null, null, null, Boolean.FALSE, null, null, null, 15871));
        if (nLETrackSlot != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mask_params_");
            sbLIZ.append(maskParam.maskType);
            nLETrackSlot.setExtra(C2188811AlT.LIZIZ(sbLIZ), strLIZIZ);
        }
    }

    @Override // X.InterfaceC353780Dtw
    public final void LJJIIZI(NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd) {
        VecNLEMaskSPtr masks = nLETrackSlot.getMasks();
        if (masks != null && masks.isEmpty()) {
            return;
        }
        nLETrackSlot.clearMask();
        LLJJ(null, enumC356070Dxd);
    }

    @Override // X.InterfaceC353780Dtw
    public final MaskParam LJJLIIIJJI(NLETrackSlot nLETrackSlot, String str) {
        if (!a0.LJJJIL(str) && nLETrackSlot != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mask_params_");
            sbLIZ.append(str);
            String extra = nLETrackSlot.getExtra(C2188811AlT.LIZIZ(sbLIZ));
            if (extra != null) {
                return (MaskParam) C051R.LIZ(extra, MaskParam.class);
            }
        }
        return null;
    }

    @Override // X.InterfaceC353780Dtw
    public final void LJJZZIII(MaskParam maskParam, NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd) {
        NLEMask nLEMask;
        NLESegmentMask segment;
        if (nLETrackSlot != null && NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment()) != null) {
            VecNLEMaskSPtr masks = nLETrackSlot.getMasks();
            if (masks != null && (nLEMask = (NLEMask) C13LP.LJJJLL(masks)) != null && (segment = nLEMask.getSegment()) != null) {
                LLJJIJIIJIL(maskParam, segment);
            }
            LLJJ(null, enumC356070Dxd);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018e  */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
    @Override // X.InterfaceC353780Dtw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIIIZ(com.ss.ugc.android.editor.core.api.params.MaskParam r13, com.bytedance.ies.nle.editor_jni.NLETrackSlot r14, X.C0E1X r15, X.EnumC356070Dxd r16, kotlin.jvm.functions.Function1<? super com.bytedance.ies.nle.editor_jni.NLETrackSlot, android.util.SizeF> r17) {
        /*
            Method dump skipped, instruction units count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C350430DoX.LLIIIZ(com.ss.ugc.android.editor.core.api.params.MaskParam, com.bytedance.ies.nle.editor_jni.NLETrackSlot, X.0E1X, X.0Dxd, kotlin.jvm.functions.Function1):void");
    }
}
