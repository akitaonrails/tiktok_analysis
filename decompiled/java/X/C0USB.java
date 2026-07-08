package X;

import com.bytedance.android.livesdk.broadcast.preview.onetap.OneTapGoLiveManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0USB, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C0USB extends C2217421BqW implements Function1<Throwable, Unit> {
    public C0USB(Object obj) {
        super(1, obj, OneTapGoLiveManager.class, "checkPermissionFailed", "checkPermissionFailed(Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        OneTapGoLiveManager oneTapGoLiveManager = (OneTapGoLiveManager) this.receiver;
        oneTapGoLiveManager.getClass();
        C464950ILd.LJI.getClass();
        C464950ILd.LJ(oneTapGoLiveManager, 0);
        oneTapGoLiveManager.LJIIL("link_mic_permission_failed");
        C20441214yg.LJFF("OneTapGoLiveManager", "oneTapGoLive failed,checkPermissionFailed failed for:", th);
        return Unit.LIZ;
    }
}
