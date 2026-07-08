package X;

import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.editSticker.model.CoverNewItem;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0M1r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.da.DraftNewMobHelper$mobDraftsInfoWhenColdStart$1", f = "DraftNewMobHelper.kt", l = {}, m = "invokeSuspend")
public final class C561810M1r extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C561810M1r(InterfaceC1364105Vn<? super C561810M1r> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C561810M1r(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        CopyOnWriteArrayList<CoverNewItem> newCoverList;
        C1C7U.LIZ("DraftNewMobHelper@95e9.mobDraftsInfoWhenColdStart$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0M2U.LIZ.getClass();
        List<AwemeDraft> listLJ = C0M4A.LJ(new C0M4E(null, null, C0M4D.LJIIIIZZ(), true, null, null, null, null, false, null, 1011), null);
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList<AwemeDraft> arrayList = (ArrayList) listLJ;
        int i = 0;
        int i2 = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        long j4 = 0;
        int i8 = 0;
        int i9 = 0;
        long j5 = 0;
        int i10 = 0;
        long j6 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (AwemeDraft awemeDraft : arrayList) {
            long j7 = jCurrentTimeMillis - awemeDraft.lastEditTime;
            long jLIZIZ = awemeDraft.LJJI;
            if (jLIZIZ == 0) {
                C571770Mbf c571770Mbf = new C571770Mbf();
                c571770Mbf.LIZ = awemeDraft;
                jLIZIZ = c571770Mbf.LIZIZ();
                awemeDraft.LJJI = jLIZIZ;
            }
            if (j7 < 604800000) {
                i9++;
                i11++;
                i12++;
                i13++;
                i14++;
                j += jLIZIZ;
                j2 += jLIZIZ;
                j4 += jLIZIZ;
                j5 += jLIZIZ;
                j3 += jLIZIZ;
            } else if (j7 < 2592000000L) {
                i11++;
                i12++;
                i13++;
                i14++;
                j2 += jLIZIZ;
                j4 += jLIZIZ;
                j5 += jLIZIZ;
                j3 += jLIZIZ;
            } else {
                if (j7 < 7776000000L) {
                    i12++;
                    i13++;
                    i14++;
                    j4 += jLIZIZ;
                } else if (j7 < 15552000000L) {
                    i13++;
                    i14++;
                } else if (j7 < 31536000000L) {
                    i14++;
                    j3 += jLIZIZ;
                }
                j5 += jLIZIZ;
                j3 += jLIZIZ;
            }
            new C1438570nXT("mob");
            VideoPublishEditModel videoPublishEditModelLIZJ = C1438570nXT.LIZJ(awemeDraft, true);
            CoverPublishModel coverPublishModel = videoPublishEditModelLIZJ.getCoverPublishModel();
            if (coverPublishModel == null || (newCoverList = coverPublishModel.getNewCoverList()) == null || newCoverList.isEmpty()) {
                i10++;
            }
            if (C1428470nHB.LJZ(videoPublishEditModelLIZJ)) {
                i8++;
            } else if (C1428470nHB.LJLIIL(videoPublishEditModelLIZJ)) {
                i3++;
            } else if (!C1428470nHB.LLIIIJ(videoPublishEditModelLIZJ)) {
                i++;
            }
            if (videoPublishEditModelLIZJ.hasMusic()) {
                i2++;
            }
            if (videoPublishEditModelLIZJ.hasEditEffect() || C123100dR.LIZ(videoPublishEditModelLIZJ.getStickers()) || videoPublishEditModelLIZJ.creativeModel.recordEffectModel.stickerInfo != null) {
                i4++;
            }
            DraftInfoModel draftInfoModel = videoPublishEditModelLIZJ.creativeModel.draftInfoModel;
            C0M2U.LIZ.getClass();
            List<String> list = C0M2U.LIZLLL;
            if (C13LP.LJJJJ(draftInfoModel.firstSaveDraftScene, list) || (draftInfoModel.firstSaveDraftScene == null && list.contains(draftInfoModel.saveDraftScene))) {
                i5++;
            }
            DraftInfoModel draftInfoModel2 = videoPublishEditModelLIZJ.creativeModel.draftInfoModel;
            List<String> list2 = C0M2U.LIZJ;
            if (C13LP.LJJJJ(draftInfoModel2.firstSaveDraftScene, list2) || (draftInfoModel2.firstSaveDraftScene == null && list2.contains(draftInfoModel2.saveDraftScene))) {
                i6++;
            }
            DraftInfoModel draftInfoModel3 = videoPublishEditModelLIZJ.creativeModel.draftInfoModel;
            List<String> list3 = C0M2U.LJ;
            if (C13LP.LJJJJ(draftInfoModel3.firstSaveDraftScene, list3) || (draftInfoModel3.firstSaveDraftScene == null && list3.contains(draftInfoModel3.saveDraftScene))) {
                i7++;
            }
            j6 += jLIZIZ;
        }
        long jLJ = C0WYJ.LJ(C0CHQ.LIZ);
        long jLJI = C09N1.LJI(C0CHQ.LIZ);
        if (jLJI == -1) {
            jLJI = -1;
        }
        float f = j6 * 1.0f;
        float f2 = f / jLJ;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(arrayList.size(), "count");
        c0lab.LIZ(i9, "recent_week_cnt");
        c0lab.LIZ(i11, "recent_month_cnt");
        c0lab.LIZ(i12, "recent_quarter_cnt");
        c0lab.LIZ(i13, "recent_half_cnt");
        c0lab.LIZ(i14, "recent_year_cnt");
        c0lab.LIZIZ(j, "recent_week_size");
        c0lab.LIZIZ(j2, "recent_month_size");
        c0lab.LIZIZ(j4, "recent_quarter_size");
        c0lab.LIZIZ(j5, "recent_half_size");
        c0lab.LIZIZ(j3, "recent_year_size");
        c0lab.LIZ(i8, "single_photo_cnt");
        c0lab.LIZ(i3, "multi_photo_cnt");
        c0lab.LIZ(i, "video_cnt");
        c0lab.LIZ(i2, "music_cnt");
        c0lab.LIZ(i4, "prop_cnt");
        c0lab.LIZ(i5, "save_at_post_cnt");
        c0lab.LIZ(i6, "save_at_edit_cnt");
        c0lab.LIZ(i7, "save_at_shoot_cnt");
        c0lab.LIZIZ(j6, "storage_size");
        c0lab.LIZJ(C2286608xc.LIZLLL(f2), "storage_app_pct");
        c0lab.LIZJ(C2286608xc.LIZLLL(f / (jLJI + C0WYJ.LJIJ())), "storage_device_pct");
        c0lab.LIZ(i10, "draft_with_old_path");
        C20684815ws.LJIILLIIL("draft_info", c0lab.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftNewMobHelper@95e9.mobDraftsInfoWhenColdStart$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C561810M1r(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
