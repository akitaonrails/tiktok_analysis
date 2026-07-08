package X;

import com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model.typed.TypedFrequencySceneConfig;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model.typed.TypedFrequencyUnit;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.config.model.ImFrequencyTriggerEnum;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.config.model.ImFrequencyTypeEnum;
import java.util.Collections;

/* JADX INFO: renamed from: X.056g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12984056g {
    public static final /* synthetic */ int LIZ = 0;

    public static TypedFrequencySceneConfig LIZIZ(EnumC12986056i enumC12986056i) {
        ImFrequencyTypeEnum imFrequencyTypeEnum = ImFrequencyTypeEnum.UID_CONVERSATION;
        ImFrequencyTriggerEnum imFrequencyTriggerEnum = ImFrequencyTriggerEnum.SHOW;
        EnumC12927054b enumC12927054b = EnumC12927054b.SECOND;
        return new TypedFrequencySceneConfig(enumC12986056i, 1, imFrequencyTypeEnum, 86400L, Collections.singletonList(new TypedFrequencyUnit(imFrequencyTriggerEnum, Collections.singletonList(LIZ(enumC12986056i, new C12907053h(0, 172800L, enumC12927054b), new C12914053o(1209600L, enumC12927054b), null)))));
    }

    public static TypedFrequencySceneConfig LIZJ(EnumC12986056i enumC12986056i, int i) {
        return new TypedFrequencySceneConfig(enumC12986056i, 1, ImFrequencyTypeEnum.UID, 86400L, Collections.singletonList(new TypedFrequencyUnit(ImFrequencyTriggerEnum.SHOW, Collections.singletonList(LIZ(enumC12986056i, new C12912053m(i), C12915053p.LIZ, null)))));
    }

    public static C053W LIZ(EnumC12986056i enumC12986056i, C053Z c053z, InterfaceC12901053b interfaceC12901053b, ImFrequencyTriggerEnum imFrequencyTriggerEnum) {
        String strName;
        String strName2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(enumC12986056i.getSceneName());
        sbLIZ.append('_');
        String str = "";
        if (imFrequencyTriggerEnum == null || (strName = imFrequencyTriggerEnum.name()) == null) {
            strName = "";
        }
        sbLIZ.append(strName);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C12918053s c12918053sLIZ = C12920053u.LIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(enumC12986056i.getSceneName());
        sbLIZ2.append('_');
        if (imFrequencyTriggerEnum != null && (strName2 = imFrequencyTriggerEnum.name()) != null) {
            str = strName2;
        }
        sbLIZ2.append(str);
        return new C053W(strLIZIZ, c12918053sLIZ, c053z, interfaceC12901053b, C2188811AlT.LIZIZ(sbLIZ2));
    }
}
