package X;

import android.app.Activity;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0UV5, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UV5 implements C0UV1 {
    public final /* synthetic */ Activity LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ Function1<Integer, Unit> LIZJ;
    public final /* synthetic */ Function0<Unit> LIZLLL;
    public final /* synthetic */ String LJ;

    @Override // X.C0UV1
    public final void onSuccess() {
        boolean z = C925080aBG.LIZ;
        Activity activity = this.LIZ;
        final int i = this.LIZIZ;
        final Function1<Integer, Unit> function1 = this.LIZJ;
        final Function0<Unit> function0 = this.LIZLLL;
        final String str = this.LJ;
        C0UV0 c0uv0 = C0UV0.Camera;
        if (!c0uv0.isInstalled()) {
            c0uv0.checkInstall(activity, "interact", new C0UV1() { // from class: X.00iz
                @Override // X.C0UV1
                public final void onSuccess() {
                    ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).loadShortVideoRes().LJJLL(new C516101zj(i, (int) function1, (Function1<? super Boolean, Unit>) 14), new C515701zf(str, 8));
                }
            });
        } else {
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).init();
            function1.invoke(Integer.valueOf(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0UV5(Activity activity, int i, Function1<? super Integer, Unit> function1, Function0<Unit> function0, String str) {
        this.LIZ = activity;
        this.LIZIZ = i;
        this.LIZJ = function1;
        this.LIZLLL = function0;
        this.LJ = str;
    }
}
