package X;

import com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseCommonChatNoticeViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.067s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseCommonChatNoticeViewModel$onAddMessageEvent$1", f = "BaseCommonChatNoticeViewModel.kt", l = {}, m = "invokeSuspend")
public final class C15570067s extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C15626069w LL;
    public final /* synthetic */ BaseCommonChatNoticeViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15570067s(C15626069w c15626069w, BaseCommonChatNoticeViewModel baseCommonChatNoticeViewModel, InterfaceC1364105Vn<? super C15570067s> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c15626069w;
        this.LLILLJJLI = baseCommonChatNoticeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15570067s(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseCommonChatNoticeViewModel@63e8.onAddMessageEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List listLJIIJJI = C1697810uHb.LJIIJJI(C2286608xc.LJ(1813), C2286608xc.LJ(1823), C2286608xc.LJ(4051));
        if (C0ZDX.LJJIJL(this.LL.LIZIZ) || listLJIIJJI.contains(C2286608xc.LJ(this.LL.LIZIZ.getMsgType()))) {
            this.LLILLJJLI.QQ2(this.LL.LIZIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseCommonChatNoticeViewModel@63e8.onAddMessageEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
