package X;

import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;

/* JADX INFO: renamed from: X.0EXW, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EXW implements InterfaceC350220DoC, InterfaceC379610EuV {
    public static final C0EYB LLJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C1DRG LL;
    public final boolean LLILLJJLI;
    public final C0ELJ LLILLL;
    public final C1664750tQH LLILZ;
    public final C1664750tQH LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public C0EYT LLIZLLLIL;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0EYB] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EXW.class, "editProAdapterApi", "getEditProAdapterApi()Lcom/ss/android/ugc/gamora/editorpro/infra/EditorProAdapterApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C0EXW.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0)};
        LLJ = new Object() { // from class: X.0EYB
        };
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    @Override // X.InterfaceC350220DoC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.C0EMN r19) {
        /*
            r18 = this;
            r3 = r19
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r8 = r3.LIZJ
            if (r8 != 0) goto L7
            return
        L7:
            com.bytedance.ies.nle.editor_jni.NLEModel r15 = r3.LIZ()
            if (r15 != 0) goto Le
            return
        Le:
            X.0EMy r0 = X.C363500EMy.LIZ
            r0.getClass()
            boolean r2 = X.C363500EMy.LJIIIIZZ(r8)
            r5 = r18
            X.0tQH r1 = r5.LLILZ
            X.1Bqa<java.lang.Object>[] r7 = X.C0EXW.LLJI
            r0 = 0
            r0 = r7[r0]
            java.lang.Object r0 = r1.getValue(r5, r0)
            X.0EYP r0 = (X.C0EYP) r0
            X.0o9N r6 = r0.lb2()
            r4 = 0
            if (r2 == 0) goto La6
            if (r6 == 0) goto La6
            X.0nMW r2 = X.C1431780nMW.LIZ
            X.0tQH r1 = r5.LLILZIL
            r0 = 1
            r0 = r7[r0]
            java.lang.Object r0 = r1.getValue(r5, r0)
            X.0nzM r0 = (X.InterfaceC1455860nzM) r0
            r2.getClass()
            if (r0 == 0) goto La4
            androidx.lifecycle.LiveData r0 = r0.g()
            if (r0 == 0) goto La4
            java.lang.Object r0 = r0.getValue()
            X.0ntP r0 = (X.InterfaceC1452170ntP) r0
        L4d:
            boolean r0 = X.C1431780nMW.LJFF(r8, r0, r6)
            if (r0 == 0) goto La6
            java.lang.String r16 = "multi_photo"
        L55:
            X.0EXt r0 = r3.LIZLLL
            if (r0 == 0) goto La0
            boolean r14 = r0.LIZ
            X.0E48 r0 = r3.LIZ
            if (r0 == 0) goto La1
            com.bytedance.ies.nle.editor_jni.INLEMediaSession r0 = r0.f1()
            if (r0 == 0) goto La1
            com.bytedance.ies.nle.editor_jni.INLEPlayer r0 = r0.getPlayerApi()
            if (r0 == 0) goto La1
            long r2 = r0.getDuration()
        L6f:
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r2 = r2 / r0
            int r0 = (int) r2
            X.0EYT r7 = new X.0EYT
            long r9 = (long) r0
            int r0 = r5.LLILZLL
            long r11 = (long) r0
            int r13 = r5.LLIZ
            boolean r0 = r5.LLILLJJLI
            r17 = r0
            r7.<init>(r8, r9, r11, r13, r14, r15, r16, r17)
            r5.LLIZLLLIL = r7
            boolean r0 = X.C363500EMy.LJIIJ(r8)
            if (r0 != 0) goto La0
            X.0ELJ r0 = r5.LLILLL
            boolean r3 = r0.isFromAIPlaygroundLoadingPage()
            X.1DFB r0 = X.C0PEM.LIZJ
            X.054G r2 = X.C2296808zG.LIZ(r0)
            X.0EYR r1 = new X.0EYR
            r1.<init>(r5, r3, r4)
            r0 = 3
            X.C23250099c.LIZLLL(r2, r4, r4, r1, r0)
        La0:
            return
        La1:
            r2 = 0
            goto L6f
        La4:
            r0 = r4
            goto L4d
        La6:
            r16 = r4
            goto L55
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EXW.LIZLLL(X.0EMN):void");
    }

    public C0EXW(C1DRG c1drg, VideoPublishEditModel videoPublishEditModel, boolean z, C0ELJ c0elj) {
        int size;
        List<MultiEditVideoSegmentRecordData> list;
        this.LL = c1drg;
        this.LLILLJJLI = z;
        this.LLILLL = c0elj;
        this.LLILZ = C1664770tQJ.LIZ(c1drg, C0EYP.class, null);
        this.LLILZIL = C1664770tQJ.LIZ(c1drg, InterfaceC1446740nke.class, null);
        if (videoPublishEditModel != null) {
            this.LLILZLL = videoPublishEditModel.getVideoLength();
            MultiEditVideoRecordData curMultiEditVideoRecordData = videoPublishEditModel.getCurMultiEditVideoRecordData();
            if (curMultiEditVideoRecordData != null && (list = curMultiEditVideoRecordData.segmentDataList) != null) {
                size = list.size();
            } else {
                size = videoPublishEditModel.getEditorProModel().getPipResourcePaths().size();
            }
            this.LLIZ = size;
        }
    }
}
