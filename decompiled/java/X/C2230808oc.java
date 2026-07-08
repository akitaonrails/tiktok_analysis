package X;

import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08oc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.SimplifyPermissionFirstAuthorizationUIPanelSceneV2$loadContinueIconAnimation$1$1", f = "SimplifyPermissionFirstAuthorizationUIPanelSceneV2.kt", l = {}, m = "invokeSuspend")
public final class C2230808oc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1662830tNB LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2230808oc(C1662830tNB c1662830tNB, String str, InterfaceC1364105Vn<? super C2230808oc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1662830tNB;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2230808oc(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Activity activity;
        Activity activity2;
        C1C7U.LIZ("SimplifyPermissionFirstAuthorizationUIPanelSceneV2@c0c9.loadContinueIconAnimation$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1662830tNB c1662830tNB = this.LL;
        if (c1662830tNB.mView != null && (((activity = c1662830tNB.mActivity) == null || !activity.isDestroyed()) && this.LL.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED) && ((activity2 = this.LL.mActivity) == null || !activity2.isFinishing()))) {
            C1662830tNB c1662830tNB2 = this.LL;
            C1292030jj7<C1294720jnS> c1292030jj7 = c1662830tNB2.LLLZIL;
            if (c1292030jj7 != null) {
                c1292030jj7.LJII(c1662830tNB2.LLLZL);
            }
            this.LL.LLLZIL = C1294250jmh.LJII(this.LLILLJJLI, null);
            C1662830tNB c1662830tNB3 = this.LL;
            C1292030jj7<C1294720jnS> c1292030jj72 = c1662830tNB3.LLLZIL;
            if (c1292030jj72 != null) {
                c1292030jj72.LIZIZ(c1662830tNB3.LLLZL);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SimplifyPermissionFirstAuthorizationUIPanelSceneV2@c0c9.loadContinueIconAnimation$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
