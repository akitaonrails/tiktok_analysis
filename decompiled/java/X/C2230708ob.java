package X;

import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08ob, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.SimplifyPermissionFirstAuthorizationUIPanelSceneV2$executeWithSafeState$1", f = "SimplifyPermissionFirstAuthorizationUIPanelSceneV2.kt", l = {523}, m = "invokeSuspend")
public final class C2230708ob extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C1662830tNB LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2230708ob(long j, C1662830tNB c1662830tNB, Function0<Unit> function0, InterfaceC1364105Vn<? super C2230708ob> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = c1662830tNB;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2230708ob(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Activity activity;
        Activity activity2;
        C1C7U.LIZ("SimplifyPermissionFirstAuthorizationUIPanelSceneV2@c0c9.executeWithSafeState$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long j = this.LLILLJJLI;
            if (j > 0) {
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                    C1C7U.LIZIZ("SimplifyPermissionFirstAuthorizationUIPanelSceneV2@c0c9.executeWithSafeState$1");
                    return objLJFF;
                }
            }
        }
        C1662830tNB c1662830tNB = this.LLILLL;
        if (c1662830tNB.mView != null && (((activity = c1662830tNB.mActivity) == null || !activity.isDestroyed()) && this.LLILLL.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED) && ((activity2 = this.LLILLL.mActivity) == null || !activity2.isFinishing()))) {
            this.LLILZ.invoke();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SimplifyPermissionFirstAuthorizationUIPanelSceneV2@c0c9.executeWithSafeState$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
