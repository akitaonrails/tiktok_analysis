package X;

import com.bytedance.tiktok.creationmodel.nano.core.Controlled;
import com.bytedance.tiktok.creationmodel.nano.core.ControlledModelDeserializer;
import com.bytedance.tiktok.creationmodel.nano.core.ControlledModelSerializer;
import com.google.gson.Gson;
import com.google.gson.e;
import com.ss.android.ugc.airemix.model.AIRemixCreationModel;
import com.ss.android.ugc.airemix.model.AIRemixGenerationModel;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.dmt_integration.typeadapter.AVUploadSaveModelDeserializer;
import com.ss.android.ugc.aweme.dmt_integration.typeadapter.BackgroundVideoDeserializer;
import com.ss.android.ugc.aweme.dmt_integration.typeadapter.EditPreviewInfoDeserializer;
import com.ss.android.ugc.aweme.dmt_integration.typeadapter.EditVideoSegmentDeserializer;
import com.ss.android.ugc.aweme.dmt_integration.typeadapter.EffectDeserializer;
import com.ss.android.ugc.aweme.dmt_integration.typeadapter.ImportVideoInfoDeserializer;
import com.ss.android.ugc.aweme.dmt_integration.typeadapter.MultiEditVideoRecordDataDeserializer;
import com.ss.android.ugc.aweme.dmt_integration.typeadapter.MultiEditVideoSegmentRecordDataDeserializer;
import com.ss.android.ugc.aweme.dmt_integration.typeadapter.MvCreateVideoDataDeserializer;
import com.ss.android.ugc.aweme.dmt_integration.typeadapter.MvSourceItemInfoDeserializer;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextPair;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextPairDeserializer;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleDataDeserializer;
import com.ss.android.ugc.aweme.effectplatform.AssetCategoryResponseDeserializer;
import com.ss.android.ugc.aweme.effectplatform.AssetItemResponseDeserializer;
import com.ss.android.ugc.aweme.effectplatform.AssetPanelResponseDeserializer;
import com.ss.android.ugc.aweme.effectplatform.FetchTemplateFavoriteListResponseDeserializer;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteModeDeserializer;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteModeSerializer;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.mvtheme.MvSourceItemInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import com.ss.android.ugc.aweme.theater.model.AITheaterCreationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterGenerationModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.FetchTemplateFavoriteListResponse;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetItemResponse;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetPanelResponse;
import com.ss.android.ugc.tools.type_adapter.BooleanAsIntTypeAdapter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Bao, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2207681Bao extends C09AY implements Function0<Gson> {
    public C2207681Bao() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Gson invoke() {
        AIRemixCreationModel.Companion companion = AIRemixCreationModel.Companion;
        AITheaterCreationModel.Companion companion2 = AITheaterCreationModel.Companion;
        e eVar = new e();
        eVar.LJIIJ = true;
        eVar.LIZJ(new MultiEditVideoSegmentRecordDataDeserializer(), MultiEditVideoSegmentRecordData.class);
        eVar.LIZJ(new EditVideoSegmentDeserializer(), EditVideoSegment.class);
        eVar.LIZJ(new ImportVideoInfoDeserializer(), ImportVideoInfo.class);
        eVar.LIZJ(new MultiEditVideoRecordDataDeserializer(), MultiEditVideoRecordData.class);
        eVar.LIZJ(new MvCreateVideoDataDeserializer(), MvCreateVideoData.class);
        eVar.LIZJ(new EditPreviewInfoDeserializer(), EditPreviewInfo.class);
        eVar.LIZJ(new AVUploadSaveModelDeserializer(), AVUploadSaveModel.class);
        eVar.LIZJ(new MvSourceItemInfoDeserializer(), MvSourceItemInfo.class);
        eVar.LIZJ(new BackgroundVideoDeserializer(), BackgroundVideo.class);
        eVar.LIZJ(new BooleanAsIntTypeAdapter(), Integer.TYPE);
        eVar.LIZJ(new TextStickerTextPairDeserializer(), TextStickerTextPair.class);
        eVar.LIZJ(new TextFontStyleDataDeserializer(), TextFontStyleData.class);
        if (((Boolean) C282680B6c.LIZ.getValue()).booleanValue()) {
            eVar.LIZJ(new QuoteModeSerializer(), QuoteMode.class);
            eVar.LIZJ(new QuoteModeDeserializer(), QuoteMode.class);
        }
        if (((Boolean) C1866710yg1.LIZIZ.getValue()).booleanValue()) {
            eVar.LIZJ(new EffectDeserializer(), Effect.class);
        }
        eVar.LJIIJJI = true;
        if (C296620Bjw.LIZ()) {
            eVar.LIZJ(new AssetPanelResponseDeserializer(), AssetPanelResponse.class);
            eVar.LIZJ(new AssetItemResponseDeserializer(), AssetItemResponse.class);
            eVar.LIZJ(new AssetCategoryResponseDeserializer(), AssetCategoryResponse.class);
        }
        if (C289070BUr.LIZ()) {
            eVar.LIZJ(new FetchTemplateFavoriteListResponseDeserializer(), FetchTemplateFavoriteListResponse.class);
        }
        eVar.LIZJ(new ControlledModelSerializer(), Controlled.class);
        eVar.LIZJ(new ControlledModelDeserializer(), Controlled.class);
        companion2.getClass();
        eVar.LIZJ(new AITheaterCreationModel.Companion.AITheaterGenerationModelDeserializer(), AITheaterGenerationModel.class);
        eVar.LIZJ(new AITheaterCreationModel.Companion.AITheaterGenerationModelSerializer(), AITheaterGenerationModel.class);
        companion.getClass();
        eVar.LIZJ(new AIRemixCreationModel.Companion.AIRemixGenerationModelDeserializer(), AIRemixGenerationModel.class);
        eVar.LIZJ(new AIRemixCreationModel.Companion.AIRemixGenerationModelSerializer(), AIRemixGenerationModel.class);
        return eVar.LIZ();
    }
}
