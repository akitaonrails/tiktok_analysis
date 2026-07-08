package X;

import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rdY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1596100rdY {
    public static final C1596100rdY LIZ = new C1596100rdY();

    public static C1595260rcC LIZ(int i, long j, boolean z) {
        EnumC1595320rcI enumC1595320rcI;
        C1596130rdb.LIZ.getClass();
        C1596120rda c1596120rda = (C1596120rda) C1596130rdb.LIZLLL().get(Integer.valueOf(i));
        if (c1596120rda == null) {
            return new C1595260rcC(EnumC1595320rcI.SUCCESS, C13BV.INSTANCE, String.valueOf(j), null, null, 0, false, false, 0, 496);
        }
        List listLJIIJ = C1596130rdb.LJIIJ(i, z, c1596120rda.LIZ);
        if (c1596120rda.LJIIJJI) {
            enumC1595320rcI = EnumC1595320rcI.SUCCESS;
        } else {
            enumC1595320rcI = EnumC1595320rcI.COMPLETE;
        }
        C1595260rcC c1595260rcC = new C1595260rcC(enumC1595320rcI, listLJIIJ, String.valueOf(j), null, null, c1596120rda.LJIILIIL, true, false, 0, 400);
        c1595260rcC.LJ = c1596120rda.LJIILJJIL;
        return c1595260rcC;
    }

    public static C1595260rcC LIZJ(StoryGetFeedByPageResponse storyGetFeedByPageResponse, int i, boolean z, EnumC1595320rcI enumC1595320rcI, long j) {
        if (Intrinsics.LJFF(storyGetFeedByPageResponse.isDemotioned(), Boolean.TRUE)) {
            C1596130rdb.LIZ.getClass();
            if (z) {
                C1596120rda c1596120rdaLJFF = C1596130rdb.LJFF(i);
                if (c1596120rdaLJFF == null) {
                    return new C1595260rcC(EnumC1595320rcI.SUCCESS, C1596130rdb.LJIIJ(i, true, new ArrayList()), String.valueOf(j), null, null, 0, false, false, 0, 496);
                }
                return new C1595260rcC(EnumC1595320rcI.SUCCESS, C1596130rdb.LJIIJ(i, true, c1596120rdaLJFF.LIZ), String.valueOf(j), null, null, 0, false, false, 0, 496);
            }
            return new C1595260rcC(EnumC1595320rcI.SUCCESS, C13BV.INSTANCE, String.valueOf(j), null, null, 0, false, false, 0, 496);
        }
        if (enumC1595320rcI == EnumC1595320rcI.FAIL) {
            if (z) {
                return LIZ(i, j, true);
            }
            return new C1595260rcC(EnumC1595320rcI.SUCCESS, C13BV.INSTANCE, String.valueOf(j), null, null, 0, false, false, 0, 496);
        }
        C1596130rdb.LIZ.getClass();
        C1596130rdb.LJIILL(i, z, storyGetFeedByPageResponse);
        return new C1595260rcC(enumC1595320rcI, C1596130rdb.LJIIJ(i, z, storyGetFeedByPageResponse.getAwemes()), String.valueOf(storyGetFeedByPageResponse.getCursor()), null, null, storyGetFeedByPageResponse.getSkylightSort(), false, false, 0, 464);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085 A[Catch: all -> 0x00e8, TryCatch #3 {all -> 0x00e8, blocks: (B:22:0x007f, B:25:0x0089, B:28:0x008f, B:24:0x0085), top: B:68:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca A[Catch: all -> 0x00e2, TryCatch #0 {all -> 0x00e2, blocks: (B:32:0x00c2, B:34:0x00ca, B:35:0x00cc, B:36:0x00d5), top: B:62:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5 A[Catch: all -> 0x00e2, TryCatch #0 {all -> 0x00e2, blocks: (B:32:0x00c2, B:34:0x00ca, B:35:0x00cc, B:36:0x00d5), top: B:62:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a7 A[RETURN] */
    /* JADX WARN: Type inference failed for: r35v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r36v0, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r38v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r39v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r40v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r41v0, types: [java.lang.Boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(int r43, boolean r44, int r45, int r46, int r47, long r48, com.ss.android.ugc.aweme.story.inbox.InsertStory r50, X.InterfaceC1596220rdk r51, java.lang.String r52, X.InterfaceC1364105Vn<? super X.C1596020rdQ<com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse>> r53) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1596100rdY.LIZIZ(int, boolean, int, int, int, long, com.ss.android.ugc.aweme.story.inbox.InsertStory, X.0rdk, java.lang.String, X.05Vn):java.lang.Object");
    }
}
