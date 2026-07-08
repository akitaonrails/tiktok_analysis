package X;

import com.ss.android.ugc.tiktok.addyours.ui.assem.AddYoursInviteFriendsAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cwj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.addyours.ui.assem.AddYoursInviteFriendsAssem$onInvite$1$1$success$2$1", f = "AddYoursInviteFriendsAssem.kt", l = {}, m = "invokeSuspend")
public final class C330030Cwj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AddYoursInviteFriendsAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C330030Cwj(AddYoursInviteFriendsAssem addYoursInviteFriendsAssem, InterfaceC1364105Vn<? super C330030Cwj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = addYoursInviteFriendsAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C330030Cwj(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddYoursInviteFriendsAssem@84df.onInvite$1$1$success$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.Go().setLoading(false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddYoursInviteFriendsAssem@84df.onInvite$1$1$success$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
