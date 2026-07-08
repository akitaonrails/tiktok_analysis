package X;

import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08uF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2265708uF extends AbstractC1921407fo {
    public final ExtractFramesModel LIZ;
    public final List<MultiEditVideoSegmentRecordData> LIZIZ;

    @Override // X.AbstractC1921407fo
    public final boolean LIZ(AbstractC1921407fo abstractC1921407fo) {
        String str;
        List<FrameItem> allFrames;
        FrameItem frameItem;
        List<FrameItem> allFrames2;
        FrameItem frameItem2;
        if (Intrinsics.LJFF(abstractC1921407fo, this)) {
            return true;
        }
        if (!(abstractC1921407fo instanceof C2265708uF)) {
            return false;
        }
        C2265708uF c2265708uF = (C2265708uF) abstractC1921407fo;
        if (Intrinsics.LJFF(c2265708uF.LIZ, this.LIZ)) {
            return true;
        }
        ExtractFramesModel extractFramesModel = this.LIZ;
        String str2 = null;
        if (extractFramesModel != null && (allFrames2 = extractFramesModel.getAllFrames()) != null && (frameItem2 = (FrameItem) C13LP.LJJLIIIJL(allFrames2)) != null) {
            str = frameItem2.path;
        } else {
            str = null;
        }
        ExtractFramesModel extractFramesModel2 = c2265708uF.LIZ;
        if (extractFramesModel2 != null && (allFrames = extractFramesModel2.getAllFrames()) != null && (frameItem = (FrameItem) C13LP.LJJLIIIJL(allFrames)) != null) {
            str2 = frameItem.path;
        }
        return Intrinsics.LJFF(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2265708uF(ExtractFramesModel extractFramesModel, List<? extends MultiEditVideoSegmentRecordData> list) {
        this.LIZ = extractFramesModel;
        this.LIZIZ = list;
    }
}
