package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0L9h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C538310L9h {
    public final int LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final String LJ;

    public final EditPreviewInfo LIZ(List<? extends EditVideoSegment> list) {
        Activity activityLIZIZ;
        Activity activityLIZ;
        boolean z;
        List<? extends EditVideoSegment> list2 = list;
        EditPreviewInfo editPreviewInfo = new EditPreviewInfo(new ArrayList(), this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ);
        if (!(!list2.isEmpty())) {
            list2 = null;
        }
        if (list2 != null) {
            editPreviewInfo.getVideoList().addAll(list2);
            C0MJ8 c0mj8 = C0MJ8.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateOriginSegmentsList: list.size = ");
            sbLIZ.append(list2.size());
            C201955140j.LIZLLL(c0mj8, "FixSegmentsEmptyCrashHelper", C2188811AlT.LIZIZ(sbLIZ));
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_fix_segments_empty_crash", true, false)) {
                ArrayList<EditVideoSegment> arrayList = C538320L9i.LIZ;
                arrayList.clear();
                arrayList.addAll(list2);
            }
        } else {
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                ICreativeSAAService iCreativeSAAService = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null);
                if (iCreativeSAAService != null && iCreativeSAAService.isEditScene(activityLIZ)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_fix_segments_empty_crash", true, false)) {
                        C0MJ8 c0mj82 = C0MJ8.LIZIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("getOriginSegmentsList: list.size = ");
                        ArrayList<EditVideoSegment> arrayList2 = C538320L9i.LIZ;
                        sbLIZ2.append(arrayList2.size());
                        C201955140j.LIZLLL(c0mj82, "FixSegmentsEmptyCrashHelper", C2188811AlT.LIZIZ(sbLIZ2));
                        if (!arrayList2.isEmpty()) {
                            editPreviewInfo.getVideoList().addAll(arrayList2);
                            return editPreviewInfo;
                        }
                    } else {
                        throw new IllegalArgumentException("segments must not be NullOrEmpty");
                    }
                } else {
                    C1AF0.LIZJ("segments must not be NullOrEmpty");
                    return editPreviewInfo;
                }
            }
        }
        return editPreviewInfo;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C538310L9h(int i, int i2, int i3) {
        String str;
        int i4 = i2;
        int i5 = (i3 & 1) != 0 ? 0 : i;
        i4 = (i3 & 2) != 0 ? 0 : i4;
        if ((i3 & 16) != 0) {
            str = "";
        } else {
            str = null;
        }
        this(i5, 0L, 0L, i4, str);
    }

    public C538310L9h(int i, long j, long j2, int i2, String str) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = str;
    }
}
