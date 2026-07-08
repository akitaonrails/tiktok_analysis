package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ml.strategycenter.stream.CaiSlardarEventBlackList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Wgq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C829780Wgq extends C09AY implements Function0<CaiSlardarEventBlackList> {
    public C829780Wgq() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.ml.strategycenter.stream.CaiSlardarEventBlackList, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final CaiSlardarEventBlackList invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        CaiSlardarEventBlackList caiSlardarEventBlackList = C829770Wgp.LIZIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("psp_slardar_event_black_key", CaiSlardarEventBlackList.class, caiSlardarEventBlackList);
        if (LJIIIIZZ != 0) {
            return LJIIIIZZ;
        }
        C829770Wgp.LIZ.getClass();
        return caiSlardarEventBlackList;
    }
}
