package X;

import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.startup.protocol.ITakoAiBotProcessorProtocol;

/* JADX INFO: renamed from: X.0yZP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1862610yZP {
    public static boolean LIZ(ITakoAiBotProcessorProtocol iTakoAiBotProcessorProtocol, TakoEnterParams takoEnterParams, IMessageAbility iMessageAbility) {
        if (C20227614Cs.LIZ(takoEnterParams.botInfo) && iTakoAiBotProcessorProtocol.Wd(iMessageAbility, takoEnterParams)) {
            return true;
        }
        return false;
    }
}
