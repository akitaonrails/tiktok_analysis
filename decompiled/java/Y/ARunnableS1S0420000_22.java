package Y;

import X.AbstractC443520HaI;
import X.C013C;
import X.C0MH8;
import X.C123100dR;
import X.C1322110kVd;
import X.C1428470nHB;
import X.C1428520nHG;
import X.C1429320nIY;
import X.C1443990ngD;
import X.C1444000ngE;
import X.C1455250nyN;
import X.C1C7U;
import X.C20102213l6;
import X.C201955140j;
import X.C2286708xd;
import X.C383300F1c;
import X.C565950MHp;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.creative.model.publish.PublishPreviewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public class ARunnableS1S0420000_22 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;
    public boolean z5;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (((C013C) this.l0).element) {
            ((C1455250nyN) this.l1).LLLLZLL().oL2();
            ((C013C) this.l0).element = false;
        }
        C1455250nyN c1455250nyN = (C1455250nyN) this.l1;
        c1455250nyN.LLZ((Runnable) this.l2, (Runnable) this.l3, c1455250nyN.getEditModel().mIsFromDraft, this.z4, this.z5);
    }

    public final void LIZ$1() {
        String str;
        CreativeModel creativeModel;
        MultiEditVideoStatusRecordData multiEditVideoRecordData;
        MultiEditVideoStatusRecordData multiEditVideoRecordData2;
        Pair<String, Integer> pairLJJIIJZLJL;
        C1444000ngE c1444000ngE = (C1444000ngE) this.l0;
        if (c1444000ngE != null) {
            C201955140j.LIZLLL(C20102213l6.LIZIZ, "MEMORY_LEAK", "SafeSimpleDraweeView getDraweeView");
            C1322110kVd c1322110kVd = c1444000ngE.LIZIZ;
            if (c1322110kVd != null) {
                c1322110kVd.setImageDrawable((AbstractC443520HaI) this.l1);
            }
        }
        C565950MHp.LIZ((VideoPublishEditModel) this.l2);
        int i = this.z4 ? 5 : 3;
        if (C1428470nHB.LJJJJZ((VideoPublishEditModel) this.l2) && (pairLJJIIJZLJL = C1428520nHG.LJJIIJZLJL((VideoPublishEditModel) this.l2, false, null, true, i)) != null) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.l2;
            Bitmap bitmap = (Bitmap) this.l3;
            if (pairLJJIIJZLJL.getFirst().length() > 0) {
                C1443990ngD c1443990ngD = C1443990ngD.LIZ;
                String first = pairLJJIIJZLJL.getFirst();
                c1443990ngD.getClass();
                C1443990ngD.LJIIIIZZ(videoPublishEditModel, bitmap, i, first, null);
                videoPublishEditModel.creativeModel.publishPreviewModel.firstFramePath = pairLJJIIJZLJL.getFirst();
            }
        }
        if (((VideoPublishEditModel) this.l2).getMultiEditVideoRecordData() == null) {
            Pair<String, Integer> pairLJJIIJZLJL2 = C1428520nHG.LJJIIJZLJL((VideoPublishEditModel) this.l2, false, null, true, i);
            if (C1429320nIY.LIZJ((VideoPublishEditModel) this.l2)) {
                if (C123100dR.LIZ(pairLJJIIJZLJL2 != null ? pairLJJIIJZLJL2.getFirst() : null)) {
                    VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) this.l2;
                    if (videoPublishEditModel2 == null || !C1429320nIY.LJ(videoPublishEditModel2)) {
                        C1443990ngD c1443990ngD2 = C1443990ngD.LIZ;
                        VideoPublishEditModel videoPublishEditModel3 = (VideoPublishEditModel) this.l2;
                        Bitmap bitmap2 = (Bitmap) this.l3;
                        first = pairLJJIIJZLJL2 != null ? pairLJJIIJZLJL2.getFirst() : null;
                        AFwS261S0000000_22 aFwS261S0000000_22 = AFwS261S0000000_22.get$arr$(298);
                        c1443990ngD2.getClass();
                        C1443990ngD.LJIIIIZZ(videoPublishEditModel3, bitmap2, i, first, aFwS261S0000000_22);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        MultiEditVideoStatusRecordData multiEditVideoRecordData3 = ((VideoPublishEditModel) this.l2).getMultiEditVideoRecordData();
        if (TextUtils.isEmpty(multiEditVideoRecordData3 != null ? multiEditVideoRecordData3.coverImagePath : null) && (multiEditVideoRecordData2 = ((VideoPublishEditModel) this.l2).getMultiEditVideoRecordData()) != null) {
            multiEditVideoRecordData2.coverImagePath = C383300F1c.LIZJ(((VideoPublishEditModel) this.l2).getCreativeInfo());
        }
        if (this.z5 && (multiEditVideoRecordData = ((VideoPublishEditModel) this.l2).getMultiEditVideoRecordData()) != null) {
            C0MH8 c0mh8 = C0MH8.LIZ;
            VideoPublishEditModel videoPublishEditModel4 = (VideoPublishEditModel) this.l2;
            c0mh8.getClass();
            multiEditVideoRecordData.coverImagePath = C0MH8.LJI(videoPublishEditModel4, i);
        }
        C1443990ngD c1443990ngD3 = C1443990ngD.LIZ;
        VideoPublishEditModel videoPublishEditModel5 = (VideoPublishEditModel) this.l2;
        Bitmap bitmap3 = (Bitmap) this.l3;
        MultiEditVideoStatusRecordData multiEditVideoRecordData4 = videoPublishEditModel5.getMultiEditVideoRecordData();
        String str2 = multiEditVideoRecordData4 != null ? multiEditVideoRecordData4.coverImagePath : null;
        c1443990ngD3.getClass();
        C1443990ngD.LJIIIIZZ(videoPublishEditModel5, bitmap3, i, str2, null);
        VideoPublishEditModel videoPublishEditModel6 = (VideoPublishEditModel) this.l2;
        PublishPreviewModel publishPreviewModel = videoPublishEditModel6.creativeModel.publishPreviewModel;
        MultiEditVideoStatusRecordData multiEditVideoRecordData5 = videoPublishEditModel6.getMultiEditVideoRecordData();
        if (multiEditVideoRecordData5 == null || (str = multiEditVideoRecordData5.coverImagePath) == null) {
            str = "";
        }
        publishPreviewModel.firstFramePath = str;
        if (this.z5) {
            VideoPublishEditModel videoPublishEditModel7 = (VideoPublishEditModel) this.l2;
            C0MH8.LIZ.getClass();
            videoPublishEditModel7.setVideoCoverPath(C0MH8.LJI(videoPublishEditModel7, i));
        }
        String videoCoverPath = ((VideoPublishEditModel) this.l2).getVideoCoverPath();
        if (C1429320nIY.LIZJ((VideoPublishEditModel) this.l2)) {
            VideoPublishEditModel videoPublishEditModel8 = (VideoPublishEditModel) this.l2;
            if (videoPublishEditModel8 != null && (creativeModel = videoPublishEditModel8.creativeModel) != null) {
                first = creativeModel.effectEntrancePosition;
            }
            if (Intrinsics.LJFF(first, "edit_page_panel") && C2286708xd.LIZJ(videoCoverPath)) {
                C1443990ngD.LJIIIIZZ((VideoPublishEditModel) this.l2, (Bitmap) this.l3, i, videoCoverPath, AFwS261S0000000_22.get$arr$(297));
            }
        }
    }

    public static final void run$0(ARunnableS1S0420000_22 aRunnableS1S0420000_22) {
        boolean zLIZ;
        C1C7U.LIZ("SocialEditRootScene@8880.asyncExtraCoverIfNeeded$task$1");
        try {
            aRunnableS1S0420000_22.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SocialEditRootScene@8880.asyncExtraCoverIfNeeded$task$1");
    }

    public static final void run$1(ARunnableS1S0420000_22 aRunnableS1S0420000_22) {
        boolean zLIZ;
        C1C7U.LIZ("ChooseCoverHelper@ec4.mergeCoverTextWithSaveOpt$1");
        try {
            aRunnableS1S0420000_22.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ChooseCoverHelper@ec4.mergeCoverTextWithSaveOpt$1");
    }

    public ARunnableS1S0420000_22(Object obj, Object obj2, Object obj3, boolean z, boolean z2, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.z4 = z;
        this.z5 = z2;
        this.l3 = obj4;
    }
}
