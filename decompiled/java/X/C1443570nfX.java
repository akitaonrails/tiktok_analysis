package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PropFromGroupModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.FromGroupPropService;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nfX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1443570nfX {
    public static final boolean LIZIZ(PropFromGroupModel propFromGroupModel, FaceStickerBean faceStickerBean) {
        if (propFromGroupModel.fromPropResourceId.length() == 0 && propFromGroupModel.fromPropId.length() == 0) {
            return false;
        }
        String str = propFromGroupModel.fromPropResourceId;
        String resourceID = faceStickerBean.getResourceID();
        if (resourceID == null) {
            resourceID = null;
        }
        if (Intrinsics.LJFF(str, resourceID) || Intrinsics.LJFF(propFromGroupModel.fromPropId, String.valueOf(faceStickerBean.getStickerId()))) {
            return true;
        }
        return false;
    }

    public static final void LIZ(CreativeModel creativeModel, Bundle bundle, String str) {
        ArrayList<String> stringArrayList;
        Effect effect;
        if (!bundle.getBoolean("extra_editor_pro_to_record") && !bundle.containsKey("retake_video")) {
            FromGroupPropService fromGroupPropService = (FromGroupPropService) ServiceManager.get().getService(FromGroupPropService.class);
            String str2 = "";
            if (str == null && (((stringArrayList = bundle.getStringArrayList("reuse_sticker_ids")) == null || (str = (String) C13LP.LJJJLL(stringArrayList)) == null) && (str = bundle.getString("music_reuse_sticker_id")) == null && (str = bundle.getString("sticker_id")) == null)) {
                Parcelable parcelable = bundle.getParcelable("first_sticker");
                if (!(parcelable instanceof Effect) || (effect = (Effect) parcelable) == null || (str = effect.getEffectId()) == null) {
                    str = "";
                }
            }
            String string = bundle.getString("prop_resource_id");
            if (string != null) {
                str2 = string;
            }
            creativeModel.propFromGroupModel = new PropFromGroupModel(str, str2, fromGroupPropService.LIZJ(), fromGroupPropService.LIZLLL());
        }
    }
}
