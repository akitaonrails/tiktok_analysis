package X;

import Y.AgS295S0100000_14;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.inbox.widget.multi.ArchiveEntranceViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Yuh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.widget.multi.ArchiveEntranceViewModel$onPrepared$1", f = "ArchiveEntranceViewModel.kt", l = {42}, m = "invokeSuspend")
public final class C889330Yuh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ArchiveEntranceViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C889330Yuh(ArchiveEntranceViewModel archiveEntranceViewModel, InterfaceC1364105Vn<? super C889330Yuh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = archiveEntranceViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C889330Yuh(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ArchiveEntranceViewModel@d309.onPrepared$1");
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
            this.LLILLJJLI.getClass();
            IMChatListApi.LJJIII.getClass();
            InterfaceC346201Wa interfaceC346201WaLJIILL = C09IC.LJIILL(new C05RH(C890330YwJ.LIZ().LJIIIZ().LIZ()));
            AgS295S0100000_14 agS295S0100000_14 = new AgS295S0100000_14(this.LLILLJJLI, 19);
            this.LL = 1;
            if (interfaceC346201WaLJIILL.collect(agS295S0100000_14, this) == objLJFF) {
                C1C7U.LIZIZ("ArchiveEntranceViewModel@d309.onPrepared$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ArchiveEntranceViewModel@d309.onPrepared$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
