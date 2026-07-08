package X;

import com.bytedance.android.livesdk.livesetting.subscription.LiveSubOnlyChatConfig;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0133, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0133 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C01BC LLILLJJLI;
    public final /* synthetic */ Room LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0133(boolean z, C01BC c01bc, Room room) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = c01bc;
        this.LLILLL = room;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = this.LL ? 2131755992 : 2131755608;
        LiveSubOnlyChatConfig liveSubOnlyChatConfig = LiveSubOnlyChatConfig.INSTANCE;
        C766270U4b.LJIIJJI(C497740JfY.LJIIL(i, liveSubOnlyChatConfig.onLiveSwitchFrequencyMin(), Integer.valueOf(liveSubOnlyChatConfig.onLiveSwitchFrequencyMin())));
        C01BC c01bc = this.LLILLJJLI;
        Room room = this.LLILLL;
        c01bc.getClass();
        C01BC.LIZ(room);
        return Unit.LIZ;
    }
}
