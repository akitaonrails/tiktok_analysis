package X;

import com.bytedance.ies.nle.editor_jni.INLEListenerCompile;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0LFo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C539940LFo extends AbstractC2255721DQs<C0LFT> implements C0LFT, InterfaceC379610EuV {
    public static final int LLILZ = 8;
    public final C1DRG LL;
    public final C0LFT LLILLJJLI = this;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(171));

    private final C1463670oBx X1() {
        return (C1463670oBx) this.LLILLL.getValue();
    }

    public C0LFT W1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C539940LFo(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.C0LFT
    public Object lH0(NLEModel nLEModel, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJIIZILJ(new CreativeInfo(null, 0, null, 7, null)));
        sbLIZ.append('/');
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(".mp4");
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C348100Dkm c348100DkmLIZLLL = X1().LIZLLL();
        if (c348100DkmLIZLLL != null) {
            NLEEditor nLEEditor = c348100DkmLIZLLL.LIZ;
            VecNLETrackSPtr tracks = nLEModel.getTracks();
            ArrayList arrayList = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                if (C351220Dpo.LLILLL(nLETrack)) {
                    arrayList.add(nLETrack);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((NLENode) it2.next()).setEnable(false);
            }
            nLEEditor.setModel(nLEModel);
            nLEEditor.commit();
            C1780100wQK c1780100wQK = new C1780100wQK(2);
            VEVideoEncodeSettings.COMPILE_TYPE compile_type = VEVideoEncodeSettings.COMPILE_TYPE.COMPILE_TYPE_MP4;
            VEVideoEncodeSettings vEVideoEncodeSettings = c1780100wQK.LIZIZ;
            vEVideoEncodeSettings.compileType = compile_type;
            vEVideoEncodeSettings.resizeMode = 4;
            c1780100wQK.LJII(-1);
            VEVideoEncodeSettings vEVideoEncodeSettingsLIZ = c1780100wQK.LIZ();
            C1DFH c1dfh = C0PEM.LIZ;
            final C557050Lt1 c557050Lt1 = new C557050Lt1(false);
            X1().LIZLLL().LIZIZ.getExporterApi().compile(strLIZIZ, C1776260wK8.LJ(vEVideoEncodeSettingsLIZ), new INLEListenerCompile() { // from class: X.0LFp
                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
                public final void onCompileProgress(float f) {
                }

                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
                public final void onCompileDone() {
                    if (c557050Lt1.LIZ(false, true)) {
                        InterfaceC1364105Vn<String> interfaceC1364105Vn2 = c23260099m;
                        String str = strLIZIZ;
                        C189200o6.m2constructorimpl(str);
                        interfaceC1364105Vn2.resumeWith(str);
                    }
                }

                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
                public final void onCompileError(int i, int i2, float f, String str) {
                    if (c557050Lt1.LIZ(false, true)) {
                        InterfaceC1364105Vn<String> interfaceC1364105Vn2 = c23260099m;
                        C189200o6.m2constructorimpl("");
                        interfaceC1364105Vn2.resumeWith("");
                    }
                }
            });
            Object objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(interfaceC1364105Vn);
            }
            return objLIZ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
