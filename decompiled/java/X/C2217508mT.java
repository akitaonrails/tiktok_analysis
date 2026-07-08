package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08mT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.SimplifyPermissionFirstAuthorizationUIPanelSceneV2$onActivityCreated$2$3", f = "SimplifyPermissionFirstAuthorizationUIPanelSceneV2.kt", l = {140}, m = "invokeSuspend")
public final class C2217508mT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1662830tNB LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2217508mT(C1662830tNB c1662830tNB, InterfaceC1364105Vn<? super C2217508mT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1662830tNB;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2217508mT(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SimplifyPermissionFirstAuthorizationUIPanelSceneV2@c0c9.onActivityCreated$2$3");
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
            long value = Mp4ScreenVideoLoadTimeout.getValue();
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(value, this) == objLJFF) {
                C1C7U.LIZIZ("SimplifyPermissionFirstAuthorizationUIPanelSceneV2@c0c9.onActivityCreated$2$3");
                return objLJFF;
            }
        }
        this.LLILLJJLI.LLLLZLLIL(false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SimplifyPermissionFirstAuthorizationUIPanelSceneV2@c0c9.onActivityCreated$2$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
