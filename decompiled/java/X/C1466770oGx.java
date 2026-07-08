package X;

import android.content.Intent;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.location.LocationStickerModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0oGx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1466770oGx implements OnActivityResultCallback {
    public final int $t;
    public Object l0;

    @Override // com.bytedance.router.OnActivityResultCallback
    public final void onActivityResult(int i, int i2, Intent intent) {
        switch (this.$t) {
            case 0:
                onActivityResult$0(this, i, i2, intent);
                break;
            case 1:
                onActivityResult$1(this, i, i2, intent);
                break;
            case 2:
                onActivityResult$2(this, i, i2, intent);
                break;
        }
    }

    public C1466770oGx(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onActivityResult$0(C1466770oGx c1466770oGx, int i, int i2, Intent intent) {
        ArrayList<InteractionTagUserInfo> arrayList;
        if (i2 == -1 && intent != null && intent.getBooleanExtra("need_update", false)) {
            VideoPublishEditModel videoPublishEditModelD5 = ((C190M) c1466770oGx.l0).d5();
            Serializable serializableExtra = intent.getSerializableExtra("tagged_user_list");
            if (serializableExtra instanceof ArrayList) {
                arrayList = (ArrayList) serializableExtra;
            } else {
                arrayList = null;
            }
            videoPublishEditModelD5.setTagUserList(arrayList);
            ((C190M) c1466770oGx.l0).K4();
        }
    }

    public static final void onActivityResult$1(C1466770oGx c1466770oGx, int i, int i2, Intent intent) {
        PoiData poiData;
        List<StickerModel> listLLLILZLLLI;
        StickerModel stickerModel;
        LocationStickerModel locationStickerModel;
        InterfaceC391240FVq interfaceC391240FVqG2;
        if (i == 10003 && i2 == -1) {
            Serializable serializableExtra = intent.getSerializableExtra("poi_data");
            if ((serializableExtra instanceof PoiData) && (poiData = (PoiData) serializableExtra) != null) {
                InterfaceC1465230oET interfaceC1465230oETO2 = ((C1466180oG0) c1466770oGx.l0).o2();
                if (interfaceC1465230oETO2 != null) {
                    C1462460oA0.LIZ(interfaceC1465230oETO2, false, 0L, 6);
                }
                InterfaceC391240FVq interfaceC391240FVqG22 = ((C1466180oG0) c1466770oGx.l0).G2();
                if (interfaceC391240FVqG22 != null && (listLLLILZLLLI = interfaceC391240FVqG22.LLLILZLLLI(EnumC1466150oFx.LOCATION)) != null && (stickerModel = (StickerModel) C13LP.LJJJLZIJ(0, listLLLILZLLLI)) != null) {
                    if ((stickerModel instanceof LocationStickerModel) && (locationStickerModel = (LocationStickerModel) stickerModel) != null && (interfaceC391240FVqG2 = ((C1466180oG0) c1466770oGx.l0).G2()) != null) {
                        interfaceC391240FVqG2.k3(locationStickerModel.copy(locationStickerModel.baseStickerModel, locationStickerModel.theme, poiData, locationStickerModel.clickable, locationStickerModel.textSize, locationStickerModel.isCutOff, locationStickerModel.useCapsuleStyle), EnumC356070Dxd.COMMIT);
                        return;
                    }
                    return;
                }
                InterfaceC391240FVq interfaceC391240FVqG23 = ((C1466180oG0) c1466770oGx.l0).G2();
                if (interfaceC391240FVqG23 == null) {
                    return;
                }
                LocationStickerModel locationStickerModel2 = new LocationStickerModel(new BaseStickerModel(0, 0, EnumC1466150oFx.LOCATION, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null), EnumC1466210oG3.DEFAULT, poiData, false, 30.0f, null, C300240Bpm.LIZ());
                locationStickerModel2.getBaseStickerModel().setStickerSource("2");
                interfaceC391240FVqG23.f3(locationStickerModel2, EnumC356070Dxd.COMMIT);
            }
        }
    }

    public static final void onActivityResult$2(C1466770oGx c1466770oGx, int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && intent.getBooleanExtra("need_update", false)) {
            VideoPublishEditModel videoPublishEditModel = ((C1445410niV) c1466770oGx.l0).LLJLLL;
            if (videoPublishEditModel != null) {
                videoPublishEditModel.setTagUserList((ArrayList) intent.getSerializableExtra("tagged_user_list"));
                ((C1445410niV) c1466770oGx.l0).LLLIILIL();
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }
}
