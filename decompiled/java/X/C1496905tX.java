package X;

import com.ss.android.ugc.aweme.im.chatroom.common.titlebar.SingleTitleBarCenterViewModel;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS368S0200000_2;
import njp.a;

/* JADX INFO: renamed from: X.05tX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.common.titlebar.SingleTitleBarCenterViewModel$fetchLocalUser$1", f = "SingleTitleBarCenterViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1496905tX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SingleTitleBarCenterViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1496905tX(SingleTitleBarCenterViewModel singleTitleBarCenterViewModel, InterfaceC1364105Vn<? super C1496905tX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = singleTitleBarCenterViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1496905tX(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IMUser fromUser;
        C1C7U.LIZ("SingleTitleBarCenterViewModel@b628.fetchLocalUser$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C909290Zln c909290Zln = (C909290Zln) this.LL.LLILLL.getValue();
        if (c909290Zln != null && (fromUser = c909290Zln.getFromUser()) != null) {
            final SingleTitleBarCenterViewModel singleTitleBarCenterViewModel = this.LL;
            IMContactApi.LIZ.getClass();
            C069P.LIZ().LJ().LJI(new InterfaceC1480505qt() { // from class: X.05tY
                @Override // X.InterfaceC1480505qt
                public final void LIZ(Throwable th) {
                }

                @Override // X.InterfaceC1480505qt
                public final void LIZJ() {
                }

                @Override // X.InterfaceC1480505qt
                public final void LIZIZ(IMUser iMUser) {
                    SingleTitleBarCenterViewModel singleTitleBarCenterViewModel2 = singleTitleBarCenterViewModel;
                    singleTitleBarCenterViewModel2.getClass();
                    singleTitleBarCenterViewModel2.setState(new AwS368S0200000_2(iMUser, singleTitleBarCenterViewModel2, 106));
                }
            }, fromUser.getUid(), fromUser.getSecUid(), "im_local_db", false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SingleTitleBarCenterViewModel@b628.fetchLocalUser$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
