package X;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.scene.Scene;
import com.ss.android.agilelogger.ALog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.19C1, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19C1 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C19C2 LL;
    public final /* synthetic */ Bundle LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19C1(C19C2 c19c2, Bundle bundle, Activity activity) {
        super(0);
        this.LL = c19c2;
        this.LLILLJJLI = bundle;
        this.LLILLL = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC21498219Bk interfaceC21498219Bk;
        this.LL.getClass();
        if (!C19C2.LJI()) {
            throw new IllegalStateException("onStarted must run on ui thread");
        }
        C19C2 c19c2 = this.LL;
        if (c19c2.LJII != C19C4.LL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invoke onDestroyView() first, current state ");
            sbLIZ.append(c19c2.LJII);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            throw new IllegalStateException(strLIZIZ);
        }
        c19c2.LJIIJ = this.LLILLJJLI;
        c19c2.LJII = C19C4.LLILLJJLI;
        Scene scene = c19c2.LIZLLL;
        scene.mRootScopeFactory = c19c2.LJ;
        scene.dispatchAttachActivity(this.LLILLL);
        this.LL.LIZLLL.dispatchAttachScene(null);
        C19C2 c19c22 = this.LL;
        Bundle bundle = c19c22.LJIIJ;
        if (bundle != null && (interfaceC21498219Bk = c19c22.LJFF) != null) {
            c19c22.LJIIJ = interfaceC21498219Bk.onRestoreInstanceState(bundle);
        }
        if (this.LL.LJIIJ != null && (!r1.getBoolean("SceneLifecycleManager_onSaveInstanceState_TAG"))) {
            throw new C19BV("savedInstanceState argument is not null, but previous onSaveInstanceState() is missing");
        }
        C19C2 c19c23 = this.LL;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("dispatchCreate ");
        sbLIZ2.append(c19c23.LJIIJ);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("SceneSafeLifecycleDispatcher", strLIZIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("SceneSafeLifecycleDispatcher");
        sbLIZ3.append(": ");
        sbLIZ3.append(strLIZIZ2);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ3));
        C19C2 c19c24 = this.LL;
        c19c24.LIZLLL.dispatchCreate(c19c24.LJIIJ);
        return Unit.LIZ;
    }
}
