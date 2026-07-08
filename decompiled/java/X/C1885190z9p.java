package X;

import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipMixLiveAutoPlaySetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0z9p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1885190z9p extends C09AY implements Function0<InterfaceC1885180z9o> {
    public final /* synthetic */ C1885160z9m LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1885190z9p(C1885160z9m c1885160z9m) {
        super(0);
        this.LL = c1885160z9m;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0z9o, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1885180z9o invoke() {
        getClass();
        if (GameLivePartnershipMixLiveAutoPlaySetting.INSTANCE.getLiveAutoPlay()) {
            ?? gameLivePlayHelper = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getGameLivePlayHelper();
            if ((gameLivePlayHelper instanceof InterfaceC1885180z9o) && gameLivePlayHelper != 0) {
                this.LL.LLILLL.add(new WeakReference<>(gameLivePlayHelper));
                return gameLivePlayHelper;
            }
        }
        return null;
    }
}
