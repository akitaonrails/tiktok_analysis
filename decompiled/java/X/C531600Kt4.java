package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import com.ss.android.ugc.aweme.creative.model.template.VideoTemplateSlot;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.TemplateSlot;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import java.util.List;

/* JADX INFO: renamed from: X.0Kt4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C531600Kt4 {
    public static final VideoTemplateSlot LIZIZ(TemplateSlot templateSlot) {
        return new VideoTemplateSlot(templateSlot.getStartTime(), templateSlot.getEndTime(), templateSlot.getClipStart(), templateSlot.getClipEnd(), templateSlot.getSource(), templateSlot.getType(), templateSlot.getUuid(), templateSlot.getDescription(), templateSlot.getMagicSupportType(), templateSlot.getLimitMaterialType(), templateSlot.getProcessor(), templateSlot.getGameplaySource(), templateSlot.getSameAssetGroup(), templateSlot.getFreezeGroup(), templateSlot.getFreezeFromUUID(), templateSlot.getFreezeRefVideoUUID(), templateSlot.isReverseVideo(), templateSlot.getOriginMaterialType());
    }

    public static final CutSameVideoImageExtraData LIZ(VideoTemplateSlot videoTemplateSlot, ShortVideoContext shortVideoContext) {
        CreativeModel creativeModel;
        PUgcTemplateData pUgcTemplateData;
        List<Integer> list;
        List<String> listLJJLL = null;
        CutSameVideoImageExtraData cutSameVideoImageExtraData = new CutSameVideoImageExtraData(null, (long) (((float) videoTemplateSlot.getDuration()) * LSPassThroughRecordSizeConfig.DEFAULT), 30);
        if (C531630Kt7.LIZ(videoTemplateSlot) && C123100dR.LIZ(C531630Kt7.LIZIZ(videoTemplateSlot))) {
            cutSameVideoImageExtraData.materialType = C531630Kt7.LIZIZ(videoTemplateSlot);
        }
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (pUgcTemplateData = creativeModel.pugcTemplateData) != null && (list = pUgcTemplateData.featureCodes) != null && list.contains(Integer.valueOf(C0CIJ.UGC_I2V_FRAME.getValue()))) {
            cutSameVideoImageExtraData.materialType = TemplateSlot.Companion.getMATERIAL_TYPE_IMG();
        }
        String[] processor = videoTemplateSlot.getProcessor();
        if (processor != null && processor.length != 0) {
            String[] processor2 = videoTemplateSlot.getProcessor();
            if (processor2 != null) {
                listLJJLL = C13LQ.LJJLL(processor2);
            }
            cutSameVideoImageExtraData.processor = listLJJLL;
        }
        cutSameVideoImageExtraData.sameAssetGroup = videoTemplateSlot.getSameAssetGroup();
        return cutSameVideoImageExtraData;
    }
}
