package X;

import com.ss.android.ugc.aweme.im.chatlist.impl.feature.topnotice.topnotice.SessionListTopNoticeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Ag, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.topnotice.topnotice.SessionListTopNoticeViewModel$aiGroupShotLocalFilterLogic$1", f = "SessionListTopNoticeViewModel.kt", l = {273}, m = "invokeSuspend")
public final class C1308805Ag extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SessionListTopNoticeViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1308805Ag(SessionListTopNoticeViewModel sessionListTopNoticeViewModel, InterfaceC1364105Vn<? super C1308805Ag> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = sessionListTopNoticeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1308805Ag(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SessionListTopNoticeViewModel@6f9a.aiGroupShotLocalFilterLogic$1");
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
            InterfaceC911930Zq3 interfaceC911930Zq3LJIIZILJ = C912070ZqH.LIZIZ.LJIIZILJ();
            this.LL = 1;
            obj = interfaceC911930Zq3LJIIZILJ.LJIIJ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SessionListTopNoticeViewModel@6f9a.aiGroupShotLocalFilterLogic$1");
                return objLJFF;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            SessionListTopNoticeViewModel sessionListTopNoticeViewModel = this.LLILLJJLI;
            C054G c054g = sessionListTopNoticeViewModel.LLJJIJIIJIL;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c054g, C2107308Nj.LIZ, null, new C1308905Ah(sessionListTopNoticeViewModel, null), 2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SessionListTopNoticeViewModel@6f9a.aiGroupShotLocalFilterLogic$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
