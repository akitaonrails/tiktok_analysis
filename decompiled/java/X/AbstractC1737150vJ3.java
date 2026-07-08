package X;

import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.effectcreator.experiments.AutoGenIconConfig;
import com.ss.android.ugc.aweme.effectcreator.models.EffectObjectDataWrapper;
import com.ss.android.ugc.aweme.effectcreator.models.EffectPackageDataWrapper;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImage;
import com.ss.android.ugc.aweme.publish.EffectMobilePublishVM;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vJ3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1737150vJ3 {
    public EffectMobilePublishVM LIZ;
    public MobileEffectData LIZIZ;
    public Context LIZJ;
    public C1737500vJc LIZLLL;

    public abstract boolean LIZ(EditImage editImage, EditImage editImage2);

    public abstract List<C1737450vJX> LIZIZ();

    public abstract void LJFF();

    public final C1557090qcd LIZJ(AbstractC1737400vJS abstractC1737400vJS) {
        int iIntValue;
        int iIntValue2;
        EffectPackageDataWrapper effectPackageDataWrapper;
        MobileEffectData mobileEffectData = this.LIZIZ;
        List<EffectObjectDataWrapper> list = null;
        if (mobileEffectData != null && (effectPackageDataWrapper = mobileEffectData.publishData) != null) {
            list = effectPackageDataWrapper.objectDataList;
        }
        AutoGenIconConfig autoGenIconConfig = C0NRR.LIZ;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        AutoGenIconConfig autoGenIconConfig2 = C0NRR.LIZ;
        AutoGenIconConfig autoGenIconConfig3 = (AutoGenIconConfig) settingsManagerLIZLLL.LJIIIIZZ("ame_auto_gen_icon_config", AutoGenIconConfig.class, autoGenIconConfig2);
        if (autoGenIconConfig3 != null) {
            autoGenIconConfig2 = autoGenIconConfig3;
        }
        Map<String, Integer> map = autoGenIconConfig2.getFrameDelayCountConfig;
        int iIntValue3 = 1;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (EffectObjectDataWrapper effectObjectDataWrapper : list) {
                String str = effectObjectDataWrapper.featureType;
                if (map.containsKey(str)) {
                    Integer num = map.get(str);
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 1;
                    }
                    arrayList.add(Integer.valueOf(iIntValue));
                } else if (Intrinsics.LJFF(str, "ame_gan_face_fusion")) {
                    if (Intrinsics.LJFF(effectObjectDataWrapper.trackingType, EnumC993240bxC.REAL_TIME_TRACKING_TYPE_FUSION.getTypeName())) {
                        Integer num2 = map.get(str);
                        if (num2 != null) {
                            iIntValue2 = num2.intValue();
                        } else {
                            iIntValue2 = 15;
                        }
                        arrayList.add(Integer.valueOf(iIntValue2));
                    } else if (Intrinsics.LJFF(effectObjectDataWrapper.trackingType, EnumC993240bxC.NON_REAL_TIME_TRACKING_TYPE_FUSION.getTypeName())) {
                        z = true;
                    }
                }
            }
            if (!z && arrayList.size() > 0) {
                iIntValue3 = ((Number) C13LP.LJJLJ(arrayList)).intValue();
            }
        }
        return new C1557090qcd(abstractC1737400vJS, iIntValue3);
    }

    public final void LIZLLL(EnumC1736950vIj enumC1736950vIj, boolean z, boolean z2) {
        if (z) {
            C1737500vJc c1737500vJc = this.LIZLLL;
            if (c1737500vJc != null) {
                c1737500vJc.LLLFZ(new C1737450vJX(enumC1736950vIj, EnumC1737530vJf.LOADING, null, z2, 4));
                return;
            }
            return;
        }
        C1737500vJc c1737500vJc2 = this.LIZLLL;
        if (c1737500vJc2 == null) {
            return;
        }
        c1737500vJc2.LLLFZ(new C1737450vJX(enumC1736950vIj, EnumC1737530vJf.ADD, null, z2, 4));
    }
}
