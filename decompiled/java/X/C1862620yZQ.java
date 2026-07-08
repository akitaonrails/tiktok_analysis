package X;

import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.startup.protocol.ITakoNormalProcessorProtocol;

/* JADX INFO: renamed from: X.0yZQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1862620yZQ {
    public static boolean LIZ(ITakoNormalProcessorProtocol iTakoNormalProcessorProtocol, TakoEnterParams takoEnterParams, IMessageAbility iMessageAbility) {
        if (!C20227614Cs.LIZ(takoEnterParams.botInfo) && iTakoNormalProcessorProtocol.Wd(iMessageAbility, takoEnterParams)) {
            return true;
        }
        return false;
    }
}
