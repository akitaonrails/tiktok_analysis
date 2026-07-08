package X;

import com.ss.android.ugc.aweme.creative.model.template.VideoTemplateSlot;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kt7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C531630Kt7 {
    public static final boolean LIZ(VideoTemplateSlot videoTemplateSlot) {
        String freezeGroup = videoTemplateSlot.getFreezeGroup();
        if ((freezeGroup == null || freezeGroup.length() == 0) && !LIZLLL(videoTemplateSlot) && !Intrinsics.LJFF(videoTemplateSlot.isReverseVideo(), Boolean.TRUE) && videoTemplateSlot.getLimitMaterialType() == 0) {
            return false;
        }
        return true;
    }

    public static final String LIZIZ(VideoTemplateSlot videoTemplateSlot) {
        if (Intrinsics.LJFF(videoTemplateSlot.isReverseVideo(), Boolean.TRUE)) {
            VideoTemplateSlot.Companion.getClass();
            return VideoTemplateSlot.MATERIAL_TYPE_VIDEO;
        }
        if (LIZLLL(videoTemplateSlot)) {
            String magicSupportType = videoTemplateSlot.getMagicSupportType();
            if (Intrinsics.LJFF(magicSupportType, "1")) {
                VideoTemplateSlot.Companion.getClass();
                return VideoTemplateSlot.MATERIAL_TYPE_IMG;
            }
            if (Intrinsics.LJFF(magicSupportType, "2")) {
                VideoTemplateSlot.Companion.getClass();
                return VideoTemplateSlot.MATERIAL_TYPE_VIDEO;
            }
            return videoTemplateSlot.getMagicSupportType();
        }
        int limitMaterialType = videoTemplateSlot.getLimitMaterialType();
        if (limitMaterialType != 1) {
            if (limitMaterialType != 2) {
                return videoTemplateSlot.getOriginMaterialType();
            }
            VideoTemplateSlot.Companion.getClass();
            return VideoTemplateSlot.MATERIAL_TYPE_VIDEO;
        }
        VideoTemplateSlot.Companion.getClass();
        return VideoTemplateSlot.MATERIAL_TYPE_IMG;
    }

    public static final double LIZJ(VideoTemplateSlot videoTemplateSlot) {
        if (videoTemplateSlot.getStartTime() < 0.0d) {
            return 0.0d;
        }
        return videoTemplateSlot.getStartTime();
    }

    public static final boolean LIZLLL(VideoTemplateSlot videoTemplateSlot) {
        if (Intrinsics.LJFF(videoTemplateSlot.getGameplaySource(), "magic")) {
            return true;
        }
        String magicSupportType = videoTemplateSlot.getMagicSupportType();
        if (magicSupportType != null && magicSupportType.length() != 0) {
            return true;
        }
        return false;
    }
}
