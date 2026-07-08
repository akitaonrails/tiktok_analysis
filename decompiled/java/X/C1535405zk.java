package X;

import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.vm.ChatCommonViewModelImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS581S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.05zk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.vm.ChatCommonViewModelImpl$fetchBotInfo$1", f = "ChatCommonViewModelImpl.kt", l = {}, m = "invokeSuspend")
public final class C1535405zk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ C909290Zln LLILLJJLI;
    public final /* synthetic */ ChatCommonViewModelImpl LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1535405zk(long j, C909290Zln c909290Zln, ChatCommonViewModelImpl chatCommonViewModelImpl, InterfaceC1364105Vn<? super C1535405zk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = j;
        this.LLILLJJLI = c909290Zln;
        this.LLILLL = chatCommonViewModelImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1535405zk(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatCommonViewModelImpl@d0fa.fetchBotInfo$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IMAIServiceAPI.LIZ.getClass();
        IMUser iMUserLJI = AnonymousClass0629.LIZ().LIZIZ().LJI(AnonymousClass0629.LIZ().LIZIZ().LIZ(this.LL));
        this.LLILLJJLI.setFromUser(iMUserLJI);
        this.LLILLL.setState(new AwS581S0100000_2(iMUserLJI, 380));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatCommonViewModelImpl@d0fa.fetchBotInfo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
