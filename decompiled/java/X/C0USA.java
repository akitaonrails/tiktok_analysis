package X;

import com.bytedance.android.livesdk.broadcast.preview.onetap.OneTapGoLiveManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0USA, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C0USA extends C2217421BqW implements Function1<Throwable, Unit> {
    public C0USA(Object obj) {
        super(1, obj, OneTapGoLiveManager.class, "handleBannedLinkMic", "handleBannedLinkMic(Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        OneTapGoLiveManager oneTapGoLiveManager = (OneTapGoLiveManager) this.receiver;
        oneTapGoLiveManager.getClass();
        C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131844624));
        C20441214yg.LJFF("OneTapGoLiveManager", "oneTapGoLive failed,has no link mic permission for,", th);
        oneTapGoLiveManager.LJIIJ();
        return Unit.LIZ;
    }
}
