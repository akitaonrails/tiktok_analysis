package X;

import com.ss.android.ugc.tiktok.addyours.ui.assem.AddYoursInviteFriendsAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cwi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.addyours.ui.assem.AddYoursInviteFriendsAssem$onInvite$1$1$success$2$2", f = "AddYoursInviteFriendsAssem.kt", l = {}, m = "invokeSuspend")
public final class C330020Cwi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AddYoursInviteFriendsAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C330020Cwi(AddYoursInviteFriendsAssem addYoursInviteFriendsAssem, InterfaceC1364105Vn<? super C330020Cwi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = addYoursInviteFriendsAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C330020Cwi(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddYoursInviteFriendsAssem@84df.onInvite$1$1$success$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1389890mGx c1389890mGx = new C1389890mGx(this.LL.LJJIJL());
        c1389890mGx.LJIIIZ(2131848597);
        c1389890mGx.LJIIJJI();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddYoursInviteFriendsAssem@84df.onInvite$1$1$success$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
