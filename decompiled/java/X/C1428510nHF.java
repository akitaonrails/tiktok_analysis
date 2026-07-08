package X;

import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS35S0001000_22;

/* JADX INFO: renamed from: X.0nHF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1428510nHF {
    public static final C1428510nHF LIZ = new C1428510nHF();

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, int i) {
        List<StickerItemModel> list;
        InfoStickerModel infoStickerModel = videoPublishEditModel.getInfoStickerModel();
        if (infoStickerModel != null && (list = infoStickerModel.stickers) != null) {
            C1466090oFr.LJIILJJIL(list, new AwS35S0001000_22(i, 29));
        }
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, int i) {
        List<InteractStickerStruct> listLJIIIIZZ;
        String mainBusinessData = videoPublishEditModel.getMainBusinessData();
        if (mainBusinessData != null && (listLJIIIIZZ = C1429860nJQ.LJIIIIZZ(mainBusinessData, EnumC1428480nHC.TRACK_PAGE_EDIT)) != null) {
            ArrayList arrayList = new ArrayList();
            for (InteractStickerStruct interactStickerStruct : listLJIIIIZZ) {
                if (interactStickerStruct.getType() != i) {
                    arrayList.add(interactStickerStruct);
                }
            }
            videoPublishEditModel.setMainBusinessData(C1429860nJQ.LJIIIZ(videoPublishEditModel.getMainBusinessContext(), arrayList, EnumC1428480nHC.TRACK_PAGE_EDIT));
        }
    }
}
