package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0ncy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1441980ncy {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(6282));

    public static boolean LIZ() {
        return !(LIZ || LIZLLL() == 0) || LIZIZ;
    }

    public static int LIZLLL() {
        return ((Number) LIZJ.getValue()).intValue();
    }

    public static boolean LJ() {
        return (LIZ() && LIZLLL() == 3) || LIZIZ;
    }

    public static boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel != null) {
            if (C1428470nHB.LJJZZI(videoPublishEditModel) && !u4.LJIIZILJ(videoPublishEditModel) && LIZ()) {
                return true;
            }
            return false;
        }
        return LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5) {
        /*
            com.ss.android.ugc.aweme.creative.model.CreativeModel r4 = r5.creativeModel
            boolean r0 = com.ss.android.ugc.aweme.shortvideo.edit.u4.LJIIZILJ(r5)
            r3 = 1
            if (r0 != 0) goto L4b
            boolean r0 = X.C1441960ncw.LIZ()
            if (r0 == 0) goto L4b
            com.ss.android.ugc.aweme.creative.model.OnThisDayData r0 = r4.onThisDayData
            boolean r0 = r0.isFromOnThisDay()
            if (r0 != 0) goto L4b
            X.0nHS r0 = X.C1428640nHS.LIZ
            r0.getClass()
            boolean r0 = X.C1428640nHS.LIZJ(r5)
            if (r0 == 0) goto L4b
            r2 = 1
        L23:
            com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel r0 = r4.draftInfoModel
            boolean r0 = r0.isDraft
            if (r0 != 0) goto L39
            com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData r1 = r4.imageAlbumModel
            if (r1 == 0) goto L39
            if (r2 == 0) goto L49
            int r0 = LIZLLL()
            if (r0 == 0) goto L49
            r0 = 1
        L36:
            r1.setDifferentiatedLayout(r0)
        L39:
            com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData r0 = r4.imageAlbumModel
            if (r0 == 0) goto L46
            boolean r0 = r0.isDifferentiatedLayout()
            if (r0 == 0) goto L46
            if (r2 == 0) goto L46
            r3 = 0
        L46:
            X.C1441980ncy.LIZ = r3
            return
        L49:
            r0 = 0
            goto L36
        L4b:
            r2 = 0
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1441980ncy.LIZJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):void");
    }
}
