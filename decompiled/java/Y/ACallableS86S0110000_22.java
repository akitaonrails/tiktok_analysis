package Y;

import X.C0CHQ;
import X.C0EMD;
import X.C0LAB;
import X.C1420470n4H;
import X.C1428470nHB;
import X.C1439880nZa;
import X.C1463030oAv;
import X.C1C7U;
import X.C20684815ws;
import X.C559510Lwz;
import X.C790050Uyx;
import X.EnumC1405140mfY;
import X.InterfaceC1452170ntP;
import com.ss.android.ugc.aweme.creative.model.edit.EditSaveLocalModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes23.dex */
public class ACallableS86S0110000_22 implements Callable {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS86S0110000_22 aCallableS86S0110000_22) {
        int iUpdateAlgorithmFromNormal;
        C1C7U.LIZ("StickPointVideoPresenter@671e.updateAlgorithmFromNormal$1");
        InterfaceC1452170ntP interfaceC1452170ntP = ((C1463030oAv) aCallableS86S0110000_22.l0).LIZ;
        if (interfaceC1452170ntP != null) {
            iUpdateAlgorithmFromNormal = interfaceC1452170ntP.updateAlgorithmFromNormal();
            if (aCallableS86S0110000_22.z1 && iUpdateAlgorithmFromNormal >= 0) {
                iUpdateAlgorithmFromNormal = ((C1463030oAv) aCallableS86S0110000_22.l0).LIZ.genRandomSolve();
            }
        } else {
            iUpdateAlgorithmFromNormal = -1;
        }
        Integer numValueOf = Integer.valueOf(iUpdateAlgorithmFromNormal);
        C1C7U.LIZIZ("StickPointVideoPresenter@671e.updateAlgorithmFromNormal$1");
        return numValueOf;
    }

    public static final Object call$1(ACallableS86S0110000_22 aCallableS86S0110000_22) {
        long previewVideoLength;
        String str;
        C1C7U.LIZ("VideoPublishPageMobHelper@c9.mobPublish$8");
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aCallableS86S0110000_22.l0;
        boolean z = aCallableS86S0110000_22.z1;
        C1420470n4H c1420470n4H = new C1420470n4H("123456");
        C0LAB c0labLJFF = C0EMD.LJFF(videoPublishEditModel);
        c1420470n4H.LIZ(videoPublishEditModel, c0labLJFF);
        EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
        if (previewInfo != null) {
            previewVideoLength = previewInfo.getPreviewVideoLength();
        } else {
            previewVideoLength = 0;
        }
        c0labLJFF.LIZIZ(previewVideoLength, "source_duration");
        c0labLJFF.LIZIZ(previewVideoLength, "creation_duration");
        C1439880nZa.LIZ.getClass();
        c0labLJFF.LJFF("is_save_with_watermark", C1439880nZa.LJII(videoPublishEditModel, false));
        c0labLJFF.LIZ(0, "retry_publish");
        c0labLJFF.LIZ(130, "publish_step");
        c0labLJFF.LJ("publish_step_name", "click_publish_btn");
        C559510Lwz.LIZIZ(videoPublishEditModel, c0labLJFF);
        String str2 = "1";
        if (C790050Uyx.LIZ(C0CHQ.LIZ)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLJFF.LJ("network_available", str);
        c0labLJFF.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0labLJFF.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0labLJFF.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0labLJFF.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0labLJFF.LJ("event_type", EnumC1405140mfY.SUCCESS.getDesc());
        c0labLJFF.LIZ(videoPublishEditModel.creativeModel.publishMobParams.checkFileBeforeEdit, "is_click_publish");
        c0labLJFF.LIZ(videoPublishEditModel.creativeModel.publishMobParams.checkFileBeforePublish, "is_save_local");
        EditSaveLocalModel editSaveLocalModel = videoPublishEditModel.creativeModel.editSaveLocalModel;
        if ((!editSaveLocalModel.isFromQuickPublish || z) && !editSaveLocalModel.isQuickPostAsStory) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLJFF.LJ("is_from_save_local_popup", str2);
        C20684815ws.LJIILLIIL("parallel_publish_result", c0labLJFF.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoPublishPageMobHelper@c9.mobPublish$8");
        return unit;
    }

    public ACallableS86S0110000_22(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
