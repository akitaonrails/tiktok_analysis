package X;

import android.app.Activity;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0UV4, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UV4 implements C0UV1 {
    public final /* synthetic */ Activity LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ Function1<Integer, Unit> LIZJ;
    public final /* synthetic */ Function0<Unit> LIZLLL;

    @Override // X.C0UV1
    public final void onSuccess() {
        Activity activity = this.LIZ;
        final int i = this.LIZIZ;
        final Function1<Integer, Unit> function1 = this.LIZJ;
        final Function0<Unit> function0 = this.LIZLLL;
        C0UV0 c0uv0 = C0UV0.LiveResource;
        if (!c0uv0.isInstalled()) {
            c0uv0.checkInstall(activity, "interact", new C0UV1() { // from class: X.00iy
                @Override // X.C0UV1
                public final void onSuccess() {
                    ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).loadShortVideoRes().LJJLL(new C516101zj(i, (int) function1, (Function1<? super Boolean, Unit>) 8), new C09JN() { // from class: X.00j0
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("GameLinkPermissionManager@2602.checkVideoShotPluginInstall$1$onSuccess$2");
                            C20441214yg.LIZLLL(((Throwable) obj).getMessage());
                            C1C7U.LIZIZ("GameLinkPermissionManager@2602.checkVideoShotPluginInstall$1$onSuccess$2");
                        }
                    });
                }
            });
        } else {
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).init();
            function1.invoke(Integer.valueOf(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0UV4(Activity activity, int i, Function1<? super Integer, Unit> function1, Function0<Unit> function0) {
        this.LIZ = activity;
        this.LIZIZ = i;
        this.LIZJ = function1;
        this.LIZLLL = function0;
    }
}
