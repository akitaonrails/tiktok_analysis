package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.player.ab.abs.buffer.PlayeAbBufferConfigData;
import com.ss.android.ugc.aweme.strategy.api.IStrategyApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07M9, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07M9 extends C09AY implements Function0<PlayeAbBufferConfigData> {
    public C07M9() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.ss.android.ugc.aweme.player.ab.abs.buffer.PlayeAbBufferConfigData, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final PlayeAbBufferConfigData invoke() {
        boolean zLIZ = C1784706yr.LIZ();
        PlayeAbBufferConfigData playeAbBufferConfigData = new PlayeAbBufferConfigData();
        playeAbBufferConfigData.setInteractionBlockDurationPreloaded(500);
        playeAbBufferConfigData.setInteractionBlockDurationNonPreloaded(800);
        playeAbBufferConfigData.setNetBlockDurationMax(2000);
        playeAbBufferConfigData.setNetBlockIncFactor(9.0f);
        playeAbBufferConfigData.setNetBlockDurationInitial(800);
        C07MC.LIZ.getClass();
        return C1827607Du.LIZIZ(zLIZ, playeAbBufferConfigData, C07MC.LIZIZ.contains(((IStrategyApi) ServiceManager.get().getService(IStrategyApi.class)).LJIIJ()), new C07MA());
    }
}
