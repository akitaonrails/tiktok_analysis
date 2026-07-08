package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.ss.android.ugc.aweme.creative.model.publish.PublishSecureModel;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;

/* JADX INFO: renamed from: X.0nN7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1432150nN7 extends AbstractC1430630nKf {
    @Override // X.AbstractC1430630nKf
    public boolean LJIILLIIL(VideoPublishEditModel videoPublishEditModel) {
        EffectTextModel effectTextModel;
        CoverPublishModel coverPublishModel = videoPublishEditModel.getCoverPublishModel();
        if (coverPublishModel == null || (effectTextModel = coverPublishModel.getEffectTextModel()) == null || !effectTextModel.isCoverTextValid()) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC1430630nKf
    public String LJIJI(VideoPublishEditModel videoPublishEditModel) {
        String str;
        String str2;
        int width;
        int width2;
        EffectTextModel effectTextModel;
        StickerItemModel textSticker;
        String str3;
        EffectTextModel effectTextModel2;
        StickerItemModel textSticker2;
        EffectTextModel effectTextModel3;
        StickerItemModel textSticker3;
        PublishSecureModel publishSecureModel = videoPublishEditModel.creativeModel.publishSecureModel;
        String str4 = publishSecureModel.coverMD5;
        String str5 = publishSecureModel.coverSecureSalt;
        String creationId = videoPublishEditModel.getCreationId();
        CoverPublishModel coverPublishModel = videoPublishEditModel.getCoverPublishModel();
        if (coverPublishModel == null || (effectTextModel3 = coverPublishModel.getEffectTextModel()) == null || (textSticker3 = effectTextModel3.getTextSticker()) == null || (str = textSticker3.path) == null) {
            str = "";
        }
        if (C1440950nbJ.LIZ(str4, str5, creationId, str)) {
            CoverPublishModel coverPublishModel2 = videoPublishEditModel.getCoverPublishModel();
            if (coverPublishModel2 != null && (effectTextModel2 = coverPublishModel2.getEffectTextModel()) != null && (textSticker2 = effectTextModel2.getTextSticker()) != null) {
                str2 = textSticker2.path;
            } else {
                str2 = null;
            }
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str2);
            if (bitmapDecodeFile == null) {
                CoverPublishModel coverPublishModel3 = videoPublishEditModel.getCoverPublishModel();
                if (coverPublishModel3 != null && (effectTextModel = coverPublishModel3.getEffectTextModel()) != null && (textSticker = effectTextModel.getTextSticker()) != null && (str3 = textSticker.path) != null) {
                    return str3;
                }
            } else {
                if (bitmapDecodeFile.getWidth() >= (bitmapDecodeFile.getHeight() * 3) / 4) {
                    width = (bitmapDecodeFile.getHeight() * 3) / 4;
                    width2 = bitmapDecodeFile.getHeight();
                } else {
                    width = bitmapDecodeFile.getWidth();
                    width2 = (bitmapDecodeFile.getWidth() * 4) / 3;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, (bitmapDecodeFile.getWidth() - width) / 2, (bitmapDecodeFile.getHeight() - width2) / 2, width, width2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJI(videoPublishEditModel, ""));
                sbLIZ.append("bug_fixed_cover_png.png");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C0VSJ c0vsj = new C0VSJ(strLIZIZ);
                C570490MZb.LJI(c0vsj);
                C2475009mu.LJFF(100, Bitmap.CompressFormat.PNG, bitmapCreateBitmap, c0vsj);
                C2475009mu.LJ(bitmapCreateBitmap);
                C2475009mu.LJ(bitmapDecodeFile);
                return strLIZIZ;
            }
        }
        return "";
    }

    @Override // X.AbstractC1430630nKf
    public final void LJIILL(AbstractImageUploader abstractImageUploader, UploadImageConfig uploadImageConfig, VideoPublishEditModel videoPublishEditModel) {
        C2208411Bbz c2208411Bbz = new C2208411Bbz();
        c2208411Bbz.LIZJ(uploadImageConfig);
        abstractImageUploader.LJIIL(c2208411Bbz.LIZLLL());
    }
}
