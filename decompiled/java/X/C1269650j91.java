package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS53S0300000_20;
import android.content.res.AssetManager;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.opengl.GlRenderDrawer;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.TTLHABSettingsConfigs;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0j91, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1269650j91 extends C1269970j9X {
    public InterfaceC1268640j7O LLILLL;
    public final C1267500j5Y LLILZ;
    public final AudioDeviceModule LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public final Handler LLIZLLLIL;
    public GlRenderDrawer LLJ;
    public int LLJI;
    public Matrix LLJIJIL;
    public boolean LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public C1271790jCT LLJJ;
    public C1271780jCS LLJJI;
    public InterfaceC1273290jEt LLJJIII;
    public List<C1276780jKW> LLJJIJI;

    public final void LJIIL() {
        if (this.LLILZLL > 0) {
            AVLog.logKibana(4, "ExtraEffectNode", "destroyTexture", null);
            GLES20.glDeleteTextures(1, new int[]{this.LLILZLL}, 0);
            this.LLILZLL = 0;
        }
    }

    public final boolean LJIILIIL() {
        this.LLILZ.LIZ.ttlhABSettingsConfigs.getClass();
        return this.LLILZ.LIZ.enableNewVideoBufferPool && !TTLHABSettingsConfigs.LJFF.getVideoFramePoolConfig().getEnable() && (this.LLILZ.LIZ.mPushBase.LJIILIIL() && this.LLILZ.LIZ.mPushBase.LJIJJLI());
    }

    @Override // X.C1271610jCB
    public final void release() {
        Handler handler = this.LLIZLLLIL;
        if (handler == null) {
            return;
        }
        C1283100jUi.LIZIZ(handler, new ARunnableS120S0100000_20(this, 181));
    }

    @Override // X.C1271610jCB
    public final String LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExtraEffectNode");
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final VideoFrame LJIIJ(VideoFrame videoFrame) {
        Handler handler = this.LLIZLLLIL;
        if (handler == null) {
            return videoFrame;
        }
        VideoFrame[] videoFrameArr = new VideoFrame[1];
        C1283100jUi.LIZIZ(handler, new ARunnableS53S0300000_20(videoFrame, videoFrameArr, this, 32));
        return videoFrameArr[0];
    }

    public final void LJIILJJIL(List<C1276780jKW> list) {
        this.LLJJIJI = list;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setMixLayout mixLayout:");
        sbLIZ.append(list);
        AVLog.logKibana(4, "ExtraEffectNode", C2188811AlT.LIZIZ(sbLIZ), null);
    }

    public final void LJIILL(C1273160jEg c1273160jEg) {
        if (c1273160jEg != null) {
            if (this.LLJI == 0) {
                int[] iArr = new int[1];
                GLES20.glGenFramebuffers(1, iArr, 0);
                this.LLJI = iArr[0];
            }
            if (this.LLJ == null) {
                this.LLJ = new GlRenderDrawer();
            }
        }
        this.LLJJIII = c1273160jEg;
    }

    public final void LJIIJJI(int i, int i2) {
        GlUtil.clearAllGLError();
        int iGenerateTexture = GlUtil.generateTexture(3553);
        this.LLILZLL = iGenerateTexture;
        if (iGenerateTexture > 0) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.LLILZLL);
            GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
            GLES20.glBindTexture(3553, 0);
            this.LLJILJILJ = i;
            this.LLJILLL = i2;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createTexture width:");
            sbLIZ.append(i);
            sbLIZ.append(" height:");
            sbLIZ.append(i2);
            AVLog.logKibana(4, "ExtraEffectNode", C2188811AlT.LIZIZ(sbLIZ), null);
        }
    }

    @Override // X.C1269970j9X, X.InterfaceC1269980j9Y
    public final void onData(VideoFrame videoFrame, Bundle bundle) {
        InterfaceC1268640j7O interfaceC1268640j7O;
        if (this.LLJILJIL && (interfaceC1268640j7O = this.LLILLL) != null && interfaceC1268640j7O.isValid()) {
            VideoFrame videoFrameLJIIJ = LJIIJ(videoFrame);
            if (videoFrameLJIIJ != null) {
                LJIIIZ(videoFrameLJIIJ, bundle);
                if (!LJIILIIL()) {
                    videoFrameLJIIJ.release();
                    return;
                }
                return;
            }
            return;
        }
        LJIIIZ(videoFrame, bundle);
    }

    public C1269650j91(C1267500j5Y c1267500j5Y, Handler handler, AudioDeviceModule audioDeviceModule, C1273230jEn c1273230jEn) {
        AssetManager assetManager;
        new ArrayList();
        this.LLILZ = c1267500j5Y;
        this.LLIZLLLIL = handler;
        this.LLILZIL = audioDeviceModule;
        if (c1267500j5Y.LIZ.LJIIIZ() && LJIILIIL()) {
            this.LLILLL = new C1272260jDE(audioDeviceModule, c1267500j5Y.LIZIZ.LJIIZILJ, c1267500j5Y, handler, C1269260j8O.LIZIZ(c1267500j5Y));
        } else {
            this.LLILLL = new C1272090jCx(null, c1267500j5Y.LIZIZ.LJIIZILJ, handler, audioDeviceModule, c1267500j5Y);
        }
        this.LLILLL.LJJJJJ(c1267500j5Y.LIZIZ.LJIIJJI);
        this.LLILLL.LJIJI();
        this.LLILLL.enable(true);
        this.LLILLL.composerSetMode(1, 0);
        this.LLILLL.setServiceManager(c1267500j5Y.LIZJ);
        Object obj = c1267500j5Y.LIZIZ.LJIIL;
        if (obj instanceof AssetManager) {
            assetManager = (AssetManager) obj;
        } else {
            assetManager = null;
        }
        this.LLILLL.LLIIIILZ(c1273230jEn);
        C1269140j8C c1269140j8C = c1267500j5Y.LIZIZ;
        int[] iArrLJ = C1271270jBd.LIZ.LJ(c1269140j8C.LJIILIIL, c1269140j8C.LJIILJJIL, 0);
        int i = iArrLJ[0];
        int i2 = iArrLJ[1];
        InterfaceC1268640j7O interfaceC1268640j7O = this.LLILLL;
        C1269140j8C c1269140j8C2 = c1267500j5Y.LIZIZ;
        interfaceC1268640j7O.LJJIJIIJI(i, i2, c1269140j8C2.LJIJ, Build.MODEL, c1269140j8C2.LJIJI, c1269140j8C2.LJIJJ, assetManager, c1269140j8C2.LJIJJLI);
        this.LLILLL.LJLILLLLZI(new InterfaceC1272420jDU() { // from class: X.0j92
            @Override // X.InterfaceC1272420jDU
            public final /* synthetic */ void LIZ() {
            }

            @Override // X.InterfaceC1272420jDU
            public final void LIZIZ(String[] strArr) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onComposerAppendNodesWithTags nodePaths:");
                sbLIZ.append(strArr);
                AVLog.logKibana(4, "ExtraEffectNode", C2188811AlT.LIZIZ(sbLIZ), null);
                this.LIZ.LLJILJIL = true;
            }

            @Override // X.InterfaceC1272420jDU
            public final void LIZJ(String[] strArr) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onComposerAppendNodesWithTags nodePaths:");
                sbLIZ.append(strArr);
                AVLog.logKibana(4, "ExtraEffectNode", C2188811AlT.LIZIZ(sbLIZ), null);
                this.LIZ.LLJILJIL = true;
            }

            @Override // X.InterfaceC1272420jDU
            public final void LIZLLL(String[] strArr) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onComposerRemoveNodes nodePaths:");
                sbLIZ.append(strArr);
                AVLog.logKibana(4, "ExtraEffectNode", C2188811AlT.LIZIZ(sbLIZ), null);
                this.LIZ.LLJILJIL = false;
            }
        });
    }
}
