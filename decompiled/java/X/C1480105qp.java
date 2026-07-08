package X;

import Y.ARunnableS71S0200000_2;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05qp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.ReadUserListViewModel$getUser$1", f = "ReadUserListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1480105qp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ InterfaceC1480505qt LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1480105qp(String str, String str2, InterfaceC1480505qt interfaceC1480505qt, InterfaceC1364105Vn<? super C1480105qp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = interfaceC1480505qt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1480105qp(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReadUserListViewModel@b583.getUser$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IMContactApi.LIZ.getClass();
        C1BGS c1bgsLJ = C069P.LIZ().LJ();
        String str = this.LL;
        String str2 = this.LLILLJJLI;
        final InterfaceC1480505qt interfaceC1480505qt = this.LLILLL;
        c1bgsLJ.LIZJ(new InterfaceC1480505qt() { // from class: X.05qq
            @Override // X.InterfaceC1480505qt
            public final void LIZ(Throwable th) {
            }

            @Override // X.InterfaceC1480505qt
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1480505qt
            public final void LIZIZ(IMUser iMUser) {
                C2485509ob.LIZIZ(new ARunnableS71S0200000_2(interfaceC1480505qt, iMUser, 0));
            }
        }, str, str2, "im_chat_group", false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ReadUserListViewModel@b583.getUser$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
