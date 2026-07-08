package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;

/* JADX INFO: renamed from: X.0EGo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C361840EGo implements InterfaceC379610EuV, InterfaceC350220DoC {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final C1DRG LL;
    public final C1664740tQG LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C361840EGo.class, "textNewApi", "getTextNewApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/text/api/EditorProTextNewApi;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C361840EGo(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLJJLI = C1664770tQJ.LIZIZ(c1drg, C0EJ3.class, null);
    }

    @Override // X.InterfaceC350220DoC
    public final void LIZLLL(C0EMN c0emn) {
        VideoPublishEditModel videoPublishEditModel;
        VideoPublishEditModel videoPublishEditModel2;
        C364440EQo c364440EQoLLLZIL;
        NLEModel nLEModelLIZ = c0emn.LIZ();
        if (nLEModelLIZ == null || (videoPublishEditModel = c0emn.LIZIZ) == null || (videoPublishEditModel2 = c0emn.LIZJ) == null) {
            return;
        }
        C0EJ3 c0ej3 = (C0EJ3) this.LLILLJJLI.getValue(this, LLILLL[0]);
        if (c0ej3 != null) {
            c364440EQoLLLZIL = c0ej3.LLLZIL();
        } else {
            c364440EQoLLLZIL = null;
        }
        C364470EQr.LIZ.getClass();
        C364470EQr.LIZJ(videoPublishEditModel, nLEModelLIZ, c364440EQoLLLZIL);
        if (u4.LJLJLLL(videoPublishEditModel2)) {
            videoPublishEditModel2.creativeModel.inlineCaptionModel = videoPublishEditModel.creativeModel.inlineCaptionModel;
        }
    }
}
