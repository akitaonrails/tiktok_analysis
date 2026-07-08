package X;

import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import com.ss.android.ugc.aweme.im.message.content.utils.SystemContentDismissContext;
import com.ss.android.ugc.aweme.im.message.content.utils.SystemContentDismissUtil;
import com.ss.android.ugc.aweme.im.service.viewmodel.ChatRoomStreakViewModel;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Pd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.viewmodel.ChatRoomStreakViewModel$tryStreakDeleteInlineMsg$1", f = "ChatRoomStreakViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1602306Pd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<C869590Y9l> LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ ChatRoomStreakViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1602306Pd(List<? extends C869590Y9l> list, Function0<Unit> function0, ChatRoomStreakViewModel chatRoomStreakViewModel, InterfaceC1364105Vn<? super C1602306Pd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = function0;
        this.LLILLL = chatRoomStreakViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1602306Pd(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        SystemContent systemContentLIZ;
        List<Map<String, String>> msgDismissConditions;
        C1C7U.LIZ("ChatRoomStreakViewModel@6295.tryStreakDeleteInlineMsg$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<C869590Y9l> list = this.LL;
        ChatRoomStreakViewModel chatRoomStreakViewModel = this.LLILLL;
        for (C869590Y9l c869590Y9l : list) {
            if (c869590Y9l.getMsgType() == 1 && (systemContentLIZ = C06Y7.LIZ(c869590Y9l)) != null && (msgDismissConditions = systemContentLIZ.getMsgDismissConditions()) != null && SystemContentDismissUtil.INSTANCE.shouldDismiss(new SystemContentDismissContext(c869590Y9l.getConversationId(), null, null, null), msgDismissConditions)) {
                C875230YVd.LIZ(c869590Y9l, false, new C1769006wK(c869590Y9l, chatRoomStreakViewModel, 5));
            }
        }
        this.LLILLJJLI.invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatRoomStreakViewModel@6295.tryStreakDeleteInlineMsg$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
