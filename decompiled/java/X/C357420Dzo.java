package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.android.davinciresource.DavinciResource;
import com.ss.ugc.android.davinciresource.jni.DAVUnZipFunc;

/* JADX INFO: renamed from: X.0Dzo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C357420Dzo {
    public static final void LIZ(C354240Dug c354240Dug, InterfaceC20343514iv interfaceC20343514iv) {
        NLEResourceAV aVFile;
        String resourceFile;
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) c354240Dug.LIZIZ.getMainSegment());
        if (nLESegmentVideoDynamicCast != null && (aVFile = nLESegmentVideoDynamicCast.getAVFile()) != null && (resourceFile = aVFile.getResourceFile()) != null) {
            ((InterfaceC357410Dzn) C366380EYa.LJ.getValue()).LIZIZ(resourceFile, c354240Dug.LIZ.LIZLLL, interfaceC20343514iv);
        } else {
            interfaceC20343514iv.onError(-1, "");
        }
    }

    public static final void LIZIZ(Context context, C357530Dzz c357530Dzz, DAVUnZipFunc dAVUnZipFunc) {
        C2222731Bz5.LIZIZ = ((Boolean) C276770At1.LIZ.getValue()).booleanValue();
        if (!C357440Dzq.LIZIZ) {
            synchronized (C357440Dzq.LIZ) {
                try {
                    if (!C357440Dzq.LIZIZ) {
                        C357430Dzp.LIZ = C786410Ut5.N3(context);
                        C366380EYa.LIZ(c357530Dzz);
                        C357440Dzq.LIZIZ = true;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        DavinciResource.INSTANCE.setUnZipper(dAVUnZipFunc);
    }
}
