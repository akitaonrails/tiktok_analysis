package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0UGA, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UGA {
    public static C207209166l LIZ(LiveEffect liveEffect, String str) {
        String strLJJIJIL = liveEffect.LJJIJIL();
        EnumC771350UNp enumC771350UNp = EnumC771350UNp.STICKER;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("quiz/");
        sbLIZ.append(liveEffect.getResourceId());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append('/');
        sbLIZ2.append(liveEffect.LJJIJIL());
        return new C207209166l(strLJJIJIL, enumC771350UNp, strLIZIZ, null, C2188811AlT.LIZIZ(sbLIZ2), null, false, 0, false, LSPassThroughRecordSizeConfig.DEFAULT);
    }
}
