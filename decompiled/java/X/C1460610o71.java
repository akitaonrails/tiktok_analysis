package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.zhiliaoapp.musically.R;
import iyl.i3;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0o71, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1460610o71 {
    public static final C1460610o71 LIZ = new C1460610o71();

    public static C1EOF LIZIZ(VideoPublishEditModel videoPublishEditModel, int i) {
        if (i != 15) {
            if (i != 21) {
                if (i != 25) {
                    if (i != 30) {
                        if (i != 1800) {
                            if (!u4.LJLL(videoPublishEditModel) && !videoPublishEditModel.isEnterFromDM()) {
                                C1657820tF6.LIZ.getClass();
                                if (C1657820tF6.LIZ() == 5) {
                                    for (C1EOG c1eog : C1EOG.values()) {
                                        if (c1eog.getType() != i) {
                                        }
                                    }
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("toolBar item with type(");
                                    sbLIZ.append(i);
                                    sbLIZ.append(") is not adapt to new toolbar");
                                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                                }
                                if (C1657820tF6.LIZ() == 7) {
                                    for (C1EOH c1eoh : C1EOH.values()) {
                                        if (c1eoh.getType() != i) {
                                        }
                                    }
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("toolBar item with type(");
                                    sbLIZ2.append(i);
                                    sbLIZ2.append(") is not adapt to new toolbar");
                                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
                                }
                            }
                            for (C1EOF c1eof : C1EOF.values()) {
                                if (c1eof.getType() == i) {
                                    return c1eof;
                                }
                            }
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("toolBar item with type(");
                            sbLIZ3.append(i);
                            sbLIZ3.append(") is not adapt to new toolbar");
                            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ3));
                        }
                        if (C565160MEo.LIZLLL(videoPublishEditModel)) {
                            return C1EOF.AI_LIVE_PHOTO;
                        }
                        return C1EOF.POST_AI_LIVE_PHOTO;
                    }
                    return C1EOF.AI_VISUAL_POET;
                }
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_put_save_local_to_bottom", true, false)) {
                    C548590LfN.LIZ.getClass();
                    if (!C548590LfN.LIZIZ().LJI(videoPublishEditModel.creativeModel)) {
                        return C1EOF.SAVE_LOCAL;
                    }
                }
                return C1EOF.SAVE_LOCAL_TOP;
            }
            if (C299100Bnw.LIZ() && u4.LJLL(videoPublishEditModel)) {
                return C1EOF.STORY_AUTO_CUT;
            }
            if (!u4.LJLL(videoPublishEditModel) && !videoPublishEditModel.isEnterFromDM()) {
                C1657820tF6.LIZ.getClass();
                if (C1657820tF6.LIZ() == 5) {
                    for (C1EOG c1eog2 : C1EOG.values()) {
                        if (c1eog2.getType() != i) {
                        }
                    }
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("toolBar item with type(");
                    sbLIZ4.append(i);
                    sbLIZ4.append(") is not adapt to new toolbar");
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ4));
                }
                if (C1657820tF6.LIZ() == 7) {
                    for (C1EOH c1eoh2 : C1EOH.values()) {
                        if (c1eoh2.getType() != i) {
                        }
                    }
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("toolBar item with type(");
                    sbLIZ5.append(i);
                    sbLIZ5.append(") is not adapt to new toolbar");
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ5));
                }
            }
            for (C1EOF c1eof2 : C1EOF.values()) {
                if (c1eof2.getType() == i) {
                    return c1eof2;
                }
            }
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("toolBar item with type(");
            sbLIZ6.append(i);
            sbLIZ6.append(") is not adapt to new toolbar");
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ6));
        }
        if (C1459780o5g.LIZ(videoPublishEditModel)) {
            return C1EOF.EDITOR;
        }
        return C1EOF.ADJUST_CLIPS;
    }

    public static i3 LIZ(C1460620o72 c1460620o72, VideoPublishEditModel videoPublishEditModel, boolean z, C1460140o6G c1460140o6G) {
        C1EOE c1eoeLIZIZ;
        int i;
        C1EOE next;
        boolean z2 = z;
        if (u4.LJJJJLI(videoPublishEditModel)) {
            int i2 = c1460620o72.LIZ;
            Iterator<C1EOE> it2 = C1EOE.getEntries().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.getType() == i2) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            c1eoeLIZIZ = next;
            if (c1eoeLIZIZ == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("toolBar item with type(");
                sbLIZ.append(i2);
                sbLIZ.append(") is not adapt to new toolbar");
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            c1eoeLIZIZ = LIZIZ(videoPublishEditModel, c1460620o72.LIZ);
        }
        int i3 = c1460620o72.LJ;
        int i4 = c1460620o72.LIZJ;
        int i5 = c1460620o72.LIZIZ;
        boolean z3 = c1460140o6G.LIZIZ;
        String str = c1460620o72.LIZLLL;
        Function1<C1459730o5b, Unit> function1 = c1460620o72.LJFF;
        C1657820tF6.LIZ.getClass();
        if (C1657820tF6.LIZIZ()) {
            i = 0;
        } else {
            i = R.attr.ee;
        }
        int i6 = c1460620o72.LJII;
        if (i6 <= 0) {
            i6 = i;
        }
        if (c1eoeLIZIZ.getSection() != EnumC1651310t4b.SLIDE) {
            z2 = false;
        }
        return new i3(i3, i4, c1eoeLIZIZ, i6, i5, z3, c1460140o6G.LIZ, c1460140o6G.LIZJ, z2, null, str, function1, 0, c1460620o72.LJIIIIZZ, c1460620o72.LJIIIZ, c1460620o72.LJIIJ, c1460620o72.LJIIJJI, c1460620o72.LJIIL, null, 0, 0.0f, 257010192);
    }
}
