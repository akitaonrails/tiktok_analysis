package X;

import android.net.Uri;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0E6d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C359130E6d extends C09AY implements Function0<Unit> {
    public final /* synthetic */ NLETrackSlot LL;
    public final /* synthetic */ VideoPublishEditModel LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C0E48 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C359130E6d(NLETrackSlot nLETrackSlot, VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, boolean z) {
        super(0);
        this.LL = nLETrackSlot;
        this.LLILLJJLI = videoPublishEditModel;
        this.LLILLL = z;
        this.LLILZ = c0e48;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String resourceFile;
        NLEResourceNode resource;
        NLESegment mainSegment = this.LL.getMainSegment();
        if (mainSegment == null || (resource = mainSegment.getResource()) == null || (resourceFile = resource.getResourceFile()) == null) {
            resourceFile = "";
        }
        Uri uriLJIILIIL = C2471909mP.LJIILIIL(resourceFile);
        C01GW<C365840EVy> c01gw = C365840EVy.LIZIZ;
        String strLIZ = C09N5.LIZ(C351010DpT.LIZ().LIZ(), uriLJIILIIL);
        long jLJ = C354090DuR.LJ(this.LLILZ, this.LL.getUUID());
        C20137413qm c20137413qm = C20137413qm.LIZ;
        boolean zLIZJ = C20137413qm.LIZJ(strLIZ);
        long jLJIIIZ = C2471909mP.LJIIIZ(strLIZ);
        if (zLIZJ) {
            C1452610nu7 c1452610nu7LIZ = c20137413qm.LIZ(strLIZ);
            C0EI4 c0ei4 = C0EI4.LIZ;
            VideoPublishEditModel videoPublishEditModel = this.LLILLJJLI;
            int i = c1452610nu7LIZ.LIZ;
            int i2 = c1452610nu7LIZ.LIZIZ;
            boolean z = this.LLILLL;
            c0ei4.getClass();
            C0EI4.LJIIIZ(videoPublishEditModel, jLJ, zLIZJ, i, i2, -1, -1, jLJIIIZ, z);
        } else {
            VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(strLIZ);
            if (videoFileInfo != null) {
                C0EI4 c0ei42 = C0EI4.LIZ;
                VideoPublishEditModel videoPublishEditModel2 = this.LLILLJJLI;
                int i3 = videoFileInfo.width;
                int i4 = videoFileInfo.height;
                int i5 = videoFileInfo.fps;
                int i6 = videoFileInfo.duration;
                boolean z2 = this.LLILLL;
                c0ei42.getClass();
                C0EI4.LJIIIZ(videoPublishEditModel2, jLJ, true, i3, i4, i5, i6, jLJIIIZ, z2);
            }
        }
        return Unit.LIZ;
    }
}
