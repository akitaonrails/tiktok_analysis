package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.publish.CompileLevel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEVideoEncodeSettings;

/* JADX INFO: renamed from: X.0nTg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1436220nTg {
    public static final boolean LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.hasMusic() && videoPublishEditModel.creativeModel.musicBuzModel.musicType != 1) {
            return true;
        }
        return false;
    }

    public static final boolean LJ(VideoPublishEditModel videoPublishEditModel) {
        ImageAlbumData imageAlbumData;
        if (!C1428470nHB.LJJZZI(videoPublishEditModel) || (imageAlbumData = videoPublishEditModel.getImageAlbumData()) == null || !imageAlbumData.isTempImageMode()) {
            return false;
        }
        return true;
    }

    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel, boolean z) {
        if (z) {
            if (!C1428520nHG.LJJJJIZL(videoPublishEditModel) && !videoPublishEditModel.hasStickers()) {
                return false;
            }
            return true;
        }
        if (!C1428520nHG.LJJJJI(videoPublishEditModel) && !videoPublishEditModel.hasStickers()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fa, code lost:
    
        if (r3 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fc, code lost:
    
        r4 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0104, code lost:
    
        if (r4.hasNext() == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0106, code lost:
    
        r3 = r4.next();
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0116, code lost:
    
        if (r2.getLayer() != (r5.size() - 1)) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0120, code lost:
    
        if (r2.getSlots().isEmpty() == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012c, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.bytedance.ies.nle.editor_jni.NLENode LIZIZ(com.bytedance.ies.nle.editor_jni.NLENode r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1436220nTg.LIZIZ(com.bytedance.ies.nle.editor_jni.NLENode, boolean):com.bytedance.ies.nle.editor_jni.NLENode");
    }

    public static final CompileLevel LIZJ(InterfaceC1452170ntP interfaceC1452170ntP, VideoPublishEditModel videoPublishEditModel) {
        Object c098200Yq;
        if (interfaceC1452170ntP == null) {
            return CompileLevel.UNKNOWN;
        }
        try {
            c098200Yq = C1437030nUz.LIZJ(videoPublishEditModel, null, interfaceC1452170ntP, "", C1435080nRq.LIZIZ(videoPublishEditModel, false), false, false, false);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1AF0.LJFF(thM5exceptionOrNullimpl, "getVEEncodeSettings_failed");
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        VEVideoEncodeSettings vEVideoEncodeSettings = (VEVideoEncodeSettings) c098200Yq;
        if (vEVideoEncodeSettings == null) {
            C201955140j.LIZJ(C830690WiJ.LIZIZ, "can get compileLevel, VEEncodeSettings is null");
            return CompileLevel.UNKNOWN;
        }
        return C1435840nT4.LIZ(interfaceC1452170ntP.Bf(vEVideoEncodeSettings));
    }
}
