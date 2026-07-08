package X;

import com.bytedance.ies.cutsame.util.VEUtils;
import com.bytedance.ies.nle.editor_jni.INLEListenerCompile;
import com.bytedance.ies.nle.editor_jni.NLECompileLevel;
import com.bytedance.ies.nle.editor_jni.NLECompileResult;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0npr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1449970npr implements INLEListenerCompile {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ C1463670oBx LIZLLL;
    public final /* synthetic */ boolean LJ;
    public final /* synthetic */ InterfaceC1450050npz LJFF;
    public final /* synthetic */ SingleImageData LJI;
    public final /* synthetic */ C817403Hg LJII;
    public final /* synthetic */ int LJIIIIZZ;
    public final /* synthetic */ int LJIIIZ;

    @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
    public final void onCompileProgress(float f) {
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
    public final void onCompileDone() {
        LinkedBlockingQueue<C1463670oBx> linkedBlockingQueue = C1452690nuF.LIZ;
        C1452690nuF.LIZJ(this.LIZLLL, this.LJ);
        NLECompileResult compileResult = this.LIZLLL.LIZLLL().LIZIZ.getExporterApi().getCompileResult();
        NLECompileLevel compileLevel = compileResult != null ? compileResult.getCompileLevel() : null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("compileId = ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" onCompileDone, cost=");
        sbLIZ.append(System.currentTimeMillis() - this.LIZIZ);
        sbLIZ.append(", compileLevel=");
        sbLIZ.append(compileLevel);
        sbLIZ.append(" path = ");
        sbLIZ.append(this.LIZJ);
        C1450070nq1.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LJ) {
            this.LJFF.LIZIZ(new ImageSynthesisResult(this.LIZJ, this.LJIIIIZZ, this.LJIIIZ, compileLevel != null ? Integer.valueOf(compileLevel.swigValue()) : null, null, null, null, null, null, 496, null));
            return;
        }
        C1449990npt c1449990npt = C1449990npt.LIZ;
        String strSubstring = this.LIZJ;
        c1449990npt.getClass();
        int iLJJJJ = a0.LJJJJ(strSubstring, '.', 0, 6);
        if (iLJJJJ != -1) {
            strSubstring = strSubstring.substring(0, iLJJJJ);
        }
        String str = this.LIZJ;
        int duration = this.LIZLLL.getDuration();
        C0VSJ c0vsj = new C0VSJ(strSubstring);
        C1449980nps c1449980nps = new C1449980nps(this.LJFF, compileLevel, this.LJII, this.LIZJ, this.LJIIIIZZ, this.LJIIIZ, strSubstring);
        VEUtils vEUtils = VEUtils.LIZ;
        int[] iArr = {duration - 1};
        final C020X c020x = new C020X(c1449980nps, c0vsj, 0);
        vEUtils.getClass();
        com.ss.android.vesdk.VEUtils.getVideoFrames2(str, iArr, -1, -1, false, new InterfaceC1286300jZs() { // from class: X.0npy
            @Override // X.InterfaceC1286300jZs
            public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
                return ((Boolean) c020x.invoke(byteBuffer, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
            }
        });
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
    public final void onCompileError(int i, int i2, float f, String str) {
        Boolean boolValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("compileId = ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" onCompileError, cost=");
        sbLIZ.append(System.currentTimeMillis() - this.LIZIZ);
        sbLIZ.append(", path = ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(" exist = ");
        File parentFile = new C0VSJ(this.LIZJ).getParentFile();
        if (parentFile != null) {
            boolValueOf = Boolean.valueOf(parentFile.exists());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(" error = ");
        sbLIZ.append(i);
        sbLIZ.append(" p1 = ");
        sbLIZ.append(i2);
        sbLIZ.append(" message = ");
        sbLIZ.append(str);
        C1450070nq1.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        LinkedBlockingQueue<C1463670oBx> linkedBlockingQueue = C1452690nuF.LIZ;
        C1452690nuF.LIZJ(this.LIZLLL, this.LJ);
        if (i2 == -558) {
            C1449990npt.LJ(this.LJ, this.LJI, this.LJFF, this.LJII, this.LJIIIIZZ, this.LJIIIZ);
        } else {
            this.LJFF.LIZ(i, i2, f);
        }
    }

    public C1449970npr(String str, long j, String str2, C1463670oBx c1463670oBx, boolean z, InterfaceC1450050npz interfaceC1450050npz, SingleImageData singleImageData, C817403Hg c817403Hg, int i, int i2) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = str2;
        this.LIZLLL = c1463670oBx;
        this.LJ = z;
        this.LJFF = interfaceC1450050npz;
        this.LJI = singleImageData;
        this.LJII = c817403Hg;
        this.LJIIIIZZ = i;
        this.LJIIIZ = i2;
    }
}
