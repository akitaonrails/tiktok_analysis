package X;

import com.bytedance.ies.nle.editor_jni.INLEExporter;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS93S1000000_8;

/* JADX INFO: renamed from: X.0LDE, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LDE {
    public static final ConcurrentHashMap<String, Pair<String, List<MediaModel>>> LJIIJJI = new ConcurrentHashMap<>();
    public final ShortVideoContext LIZ;
    public final NLEModel LIZIZ;
    public final int LIZJ;
    public final Function1<ArrayList<MediaModel>, Unit> LIZLLL;
    public final Function1<Float, Unit> LJ;
    public final Function1<String, Unit> LJFF;
    public final C563400M7u LJI = new C563400M7u(0);
    public final C01GW LJII = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(376));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 907));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 906));
    public C0LAB LJIIJ;

    public final NLEEditor LIZIZ() {
        return (NLEEditor) this.LJIIIZ.getValue();
    }

    public final C1463860oCG LIZJ() {
        return (C1463860oCG) this.LJIIIIZZ.getValue();
    }

    public final void LJIIIIZZ() {
        INLEExporter exporterApi;
        C1463860oCG c1463860oCGLIZJ = LIZJ();
        if (c1463860oCGLIZJ == null || (exporterApi = c1463860oCGLIZJ.getExporterApi()) == null) {
            return;
        }
        ((C1463840oCE) exporterApi).destroyCompiler();
    }

    public final void LJ(String str) {
        if (this.LJI.LIZ(2, 0)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handleCompileError: ");
            sbLIZ.append(str);
            C576730Mjf.LJIIJJI("CameraLayoutNLECompiler", C2188811AlT.LIZIZ(sbLIZ));
            this.LJFF.invoke(str);
        }
    }

    public final void LJFF(String str) {
        if (!this.LJI.LIZ(2, 0)) {
            return;
        }
        MediaModel mediaModel = new MediaModel(UUID.randomUUID().toString());
        Pair<Integer, Integer> pairLIZJ = C097U.LIZJ(str);
        mediaModel.duration = 3000L;
        mediaModel.width = pairLIZJ.getFirst().intValue();
        mediaModel.height = pairLIZJ.getSecond().intValue();
        mediaModel.type = 1;
        mediaModel.extra = "from_record";
        mediaModel.LJIILL(str);
        this.LIZLLL.invoke(C1697810uHb.LJ(mediaModel));
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x024e  */
    /* JADX WARN: Type inference failed for: r3v44, types: [T, kotlin.Pair] */
    /* JADX WARN: Type inference failed for: r3v64, types: [T, kotlin.Pair] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.util.ArrayList<com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> r21, X.AbstractC577050MkB r22) {
        /*
            Method dump skipped, instruction units count: 1331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LDE.LIZ(java.util.ArrayList, X.0MkB):void");
    }

    public final void LJI(String str, List<? extends MediaModel> list) {
        if (!this.LJI.LIZ(2, 0)) {
            return;
        }
        VideoFileInfo videoFileInfoLJIIJ = C571500MbE.LJIIJ(str);
        MediaModel mediaModel = new MediaModel(UUID.randomUUID().toString());
        mediaModel.width = videoFileInfoLJIIJ.getWidth();
        mediaModel.height = videoFileInfoLJIIJ.getHeight();
        mediaModel.duration = videoFileInfoLJIIJ.getDuration();
        mediaModel.startTime = 0;
        mediaModel.endTime = (int) videoFileInfoLJIIJ.getDuration();
        mediaModel.fps = videoFileInfoLJIIJ.getFps();
        mediaModel.extra = "from_record";
        mediaModel.LJIILL(str);
        if (C536510L2j.LIZ().livePhotoLoopCount > 0) {
            if (C576730Mjf.LJII(C13LP.LJJJJLI(list))) {
                mediaModel.type = 1;
                mediaModel.subType = 1;
            } else {
                mediaModel.type = 4;
                break;
            }
        } else {
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (MediaModel mediaModel2 : list) {
                    if (mediaModel2 == null || !mediaModel2.LJIIJJI()) {
                        mediaModel.type = 4;
                        break;
                    }
                }
            }
            mediaModel.type = 1;
            mediaModel.subType = 1;
        }
        C576730Mjf.LJIIJJI("CameraLayoutNLECompiler", "handleVideoCompileDone: videoPath=" + str + ", type=" + mediaModel.type + ", duration=" + mediaModel.duration + ", width=" + mediaModel.width + ", height=" + mediaModel.height);
        this.LIZLLL.invoke(C1697810uHb.LJ(mediaModel));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZLLL(java.lang.String r7, X.AbstractC577050MkB r8, java.util.List r9) {
        /*
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            int r1 = r9.size()
            int r0 = r8.LIZJ
            r8 = 0
            if (r1 == r0) goto Lc
            return r8
        Lc:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, kotlin.Pair<java.lang.String, java.util.List<com.ss.android.ugc.aweme.mediachoose.helper.MediaModel>>> r0 = X.C0LDE.LJIIJJI
            java.lang.Object r7 = r0.get(r7)
            kotlin.Pair r7 = (kotlin.Pair) r7
            r6 = 1
            if (r7 == 0) goto L70
            java.lang.Object r0 = r7.getSecond()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L70
            int r1 = r9.size()
            int r0 = r0.size()
            if (r1 != r0) goto L70
            java.util.Iterator r5 = r9.iterator()
            r4 = 1
            r3 = 0
        L2f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L5f
            java.lang.Object r2 = r5.next()
            int r1 = r3 + 1
            if (r3 < 0) goto L5b
            com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r2 = (com.ss.android.ugc.aweme.mediachoose.helper.MediaModel) r2
            if (r2 == 0) goto L59
            if (r7 == 0) goto L57
            java.lang.Object r0 = r7.getSecond()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L57
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
        L4f:
            boolean r0 = r2.equals(r0)
            if (r0 != r6) goto L59
        L55:
            r3 = r1
            goto L2f
        L57:
            r0 = r8
            goto L4f
        L59:
            r4 = 0
            goto L55
        L5b:
            X.C1697810uHb.LJIJI()
            throw r8
        L5f:
            if (r4 != 0) goto L62
            return r8
        L62:
            java.lang.Object r1 = r7.getFirst()
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = X.C570490MZb.LJ(r1)
            if (r0 != 0) goto L6f
            return r8
        L6f:
            return r1
        L70:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LDE.LIZLLL(java.lang.String, X.0MkB, java.util.List):java.lang.String");
    }

    public static Pair LJII(String str, String str2, List list) {
        String first;
        if (C305160Bxi.LIZ()) {
            ConcurrentHashMap<String, Pair<String, List<MediaModel>>> concurrentHashMap = LJIIJJI;
            if (concurrentHashMap.containsKey(str)) {
                Pair<String, List<MediaModel>> pairRemove = concurrentHashMap.remove(str);
                if (pairRemove != null) {
                    first = pairRemove.getFirst();
                } else {
                    first = null;
                }
                C0CNO.LIZ(C15O7.LJI, new AwS93S1000000_8(first, 2));
            }
        }
        return new Pair(str2, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0LDE(ShortVideoContext shortVideoContext, NLEModel nLEModel, int i, Function1<? super ArrayList<MediaModel>, Unit> function1, Function1<? super Float, Unit> function12, Function1<? super String, Unit> function13) {
        this.LIZ = shortVideoContext;
        this.LIZIZ = nLEModel;
        this.LIZJ = i;
        this.LIZLLL = function1;
        this.LJ = function12;
        this.LJFF = function13;
    }
}
