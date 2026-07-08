package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.experiment.ITakoDisableDiffProtocol;
import com.ss.android.ugc.aweme.tako.experiment.TakoInfoModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Ju, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1843207Ju {
    public static final TakoInfoModel LIZ = new TakoInfoModel(Boolean.FALSE, Boolean.FALSE, null, null, Boolean.TRUE, null, 72);

    public static TakoInfoModel LIZIZ() {
        try {
            ITakoDisableDiffProtocol.LIZ.getClass();
            C07J8.LIZIZ.getValue().LIZ();
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            TakoInfoModel takoInfoModel = LIZ;
            TakoInfoModel takoInfoModel2 = (TakoInfoModel) settingsManagerLIZLLL.LJIIIIZZ("search_chat_bot_info", TakoInfoModel.class, takoInfoModel);
            return takoInfoModel2 != null ? takoInfoModel2 : takoInfoModel;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return LIZ;
        }
    }

    public static final boolean LIZ() {
        return Intrinsics.LJFF(LIZIZ().enableFeedEntrance, Boolean.TRUE) && C123100dR.LIZ(LIZIZ().botId);
    }

    public static final String LIZJ() {
        return LIZIZ().botName;
    }
}
