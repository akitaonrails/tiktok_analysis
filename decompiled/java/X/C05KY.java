package X;

import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05KY, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.view.GuideDMPermissionTopBannerView$Companion$shouldShow$user$1", f = "GuideDMPermissionTopBannerView.kt", l = {57}, m = "invokeSuspend")
public final class C05KY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super IMUser>, Object> {
    public int LL;

    public C05KY(InterfaceC1364105Vn<? super C05KY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05KY(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GuideDMPermissionTopBannerView$Companion@6524.shouldShow$user$1");
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
            IMContactApi.LIZ.getClass();
            C1BGS c1bgsLJ = C069P.LIZ().LJ();
            String strLIZIZ = C461720I8s.LIZIZ();
            this.LL = 1;
            obj = c1bgsLJ.LJIJ(strLIZIZ, null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GuideDMPermissionTopBannerView$Companion@6524.shouldShow$user$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("GuideDMPermissionTopBannerView$Companion@6524.shouldShow$user$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super IMUser> interfaceC1364105Vn) {
        return new C05KY(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
