package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.record.CameraLayoutModel;
import com.ss.android.ugc.aweme.creative.model.record.LayoutMediaType;
import com.ss.android.ugc.aweme.creative.model.template.VideoTemplateSlot;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LFk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C539900LFk {
    public static final boolean LIZ(ShortVideoContext shortVideoContext) {
        boolean z = !shortVideoContext.creativeModel.templateData.getCameraSlotModel().getTemplateSlots().isEmpty();
        if ((TextUtils.equals(shortVideoContext.shootWay, "ugc_template") || TextUtils.equals(shortVideoContext.shootWay, "pugc_template")) && z) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(ShortVideoContext shortVideoContext) {
        String str;
        if (shortVideoContext != null) {
            str = shortVideoContext.enterMethod;
        } else {
            str = null;
        }
        return Intrinsics.LJFF(str, "swipe_right");
    }

    public static final int LIZJ(ShortVideoContext shortVideoContext) {
        ArrayList<TimeSpeedModelExtension> arrayList;
        if (LJI(shortVideoContext)) {
            CameraLayoutModel cameraLayoutModel = shortVideoContext.creativeModel.cameraLayoutModel;
            if (cameraLayoutModel != null && (arrayList = cameraLayoutModel.captureSegments) != null) {
                return arrayList.size();
            }
            return 0;
        }
        return shortVideoContext.LJI().size();
    }

    public static final List<String> LIZLLL(ShortVideoContext shortVideoContext) {
        CreativeModel creativeModel = shortVideoContext.creativeModel;
        List<String> list = creativeModel.recordEffectModel.effectReuseFlowStickerIds;
        String str = creativeModel.feedPropPinModel.effectId;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        if (list.isEmpty()) {
            if (C123100dR.LIZ(str)) {
                return Collections.singletonList(str);
            }
            return C13BV.INSTANCE;
        }
        return list;
    }

    public static final String LJ(ShortVideoContext shortVideoContext) {
        ArrayList<VideoTemplateSlot> templateSlots = shortVideoContext.creativeModel.templateData.getCameraSlotModel().getTemplateSlots();
        boolean z = !templateSlots.isEmpty();
        int slotIndex = shortVideoContext.creativeModel.templateData.getCameraSlotModel().getSlotIndex();
        if (z && slotIndex < templateSlots.size() && slotIndex >= 0 && C531630Kt7.LIZ((VideoTemplateSlot) ListProtector.get(templateSlots, slotIndex))) {
            return C531630Kt7.LIZIZ((VideoTemplateSlot) ListProtector.get(templateSlots, slotIndex));
        }
        return "";
    }

    public static final boolean LJFF(ShortVideoContext shortVideoContext) {
        ArrayList<LayoutMediaType> arrayList;
        if (LJI(shortVideoContext) && !shortVideoContext.cameraComponentModel.isRetakeMode) {
            CameraLayoutModel cameraLayoutModel = shortVideoContext.creativeModel.cameraLayoutModel;
            if (cameraLayoutModel != null && (arrayList = cameraLayoutModel.layoutItemTypes) != null && arrayList.size() > 0) {
                return true;
            }
            return false;
        }
        if (shortVideoContext.LJII() > 0) {
            return true;
        }
        return false;
    }

    public static final boolean LJI(ShortVideoContext shortVideoContext) {
        CreativeModel creativeModel;
        CameraLayoutModel cameraLayoutModel;
        if (shortVideoContext == null || (creativeModel = shortVideoContext.creativeModel) == null || (cameraLayoutModel = creativeModel.cameraLayoutModel) == null || !cameraLayoutModel.layoutEnabled) {
            return false;
        }
        return true;
    }

    public static final boolean LJII(ShortVideoContext shortVideoContext) {
        if (shortVideoContext == null) {
            return false;
        }
        return shortVideoContext.creativeModel.recordData.lightRecordContainerMode;
    }

    public static final boolean LJIIIIZZ(ShortVideoContext shortVideoContext) {
        if (shortVideoContext == null || !shortVideoContext.isStory) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIIZ(ShortVideoContext shortVideoContext) {
        if (shortVideoContext.shootMode == 21) {
            return true;
        }
        return false;
    }
}
