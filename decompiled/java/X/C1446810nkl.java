package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.creative.model.TemplateEffectInfo;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nkl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1446810nkl {
    public static final FaceStickerBean LIZ(Effect effect, UploadableMobileEffect2 uploadableMobileEffect2) {
        String str;
        TemplateEffectInfo templateEffectInfo = uploadableMobileEffect2.templateInfo;
        String str2 = null;
        if (templateEffectInfo != null) {
            str = templateEffectInfo.templateEffectId;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, effect.getEffectId())) {
            FaceStickerBean faceStickerBeanLIZIZ = C1441210nbj.LIZIZ(effect, null, null, null);
            faceStickerBeanLIZIZ.setMobileEffect(true);
            faceStickerBeanLIZIZ.setStickerId(CastLongProtector.parseLong(uploadableMobileEffect2.effectId));
            TemplateEffectInfo templateEffectInfo2 = uploadableMobileEffect2.templateInfo;
            if (templateEffectInfo2 != null) {
                str2 = templateEffectInfo2.templateResourceId;
            }
            faceStickerBeanLIZIZ.setResourceID(str2);
            faceStickerBeanLIZIZ.setName(uploadableMobileEffect2.effectName);
            faceStickerBeanLIZIZ.setCustomizedPropId(uploadableMobileEffect2.effectId);
            return faceStickerBeanLIZIZ;
        }
        return FaceStickerBean.NONE;
    }
}
