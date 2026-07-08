package X;

import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0mbR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1402590mbR {
    public static final String LIZ(InfoStickerModel infoStickerModel) {
        List<StickerItemModel> list;
        String str;
        String strLJIIJJI = ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJIIJJI();
        if (strLJIIJJI == null || (list = infoStickerModel.stickers) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StickerItemModel stickerItemModel : list) {
            StickerItemModel stickerItemModel2 = stickerItemModel;
            if (stickerItemModel2 != null && (str = stickerItemModel2.extra) != null && a0.LJJIIZI(str, strLJIIJJI, false)) {
                arrayList.add(stickerItemModel);
            }
        }
        if (!(!arrayList.isEmpty())) {
            return null;
        }
        return C13LP.LJJLIIIJ(arrayList, null, null, null, 0, null, AFwS261S0000000_22.get$arr$(134), 31);
    }
}
