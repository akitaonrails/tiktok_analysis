package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.chatnotice.GroupChatNoticeAssem;
import com.ss.android.ugc.aweme.chatnotice.GroupChatNoticeViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.067X, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.GroupChatNoticeAssem$onCreate$1", f = "GroupChatNoticeAssem.kt", l = {}, m = "invokeSuspend")
public final class C067X extends C09AX implements Function2<Function2<? super C06OO, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object>, InterfaceC1364105Vn<? super List<? extends C09AE>>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ GroupChatNoticeAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C067X(GroupChatNoticeAssem groupChatNoticeAssem, InterfaceC1364105Vn<? super C067X> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = groupChatNoticeAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C067X c067x = new C067X(this.LLILLJJLI, interfaceC1364105Vn);
        c067x.LL = obj;
        return c067x;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupChatNoticeAssem@e5c8.onCreate$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Function2<? super C06OO, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function2 = (Function2) this.LL;
        GroupChatNoticeViewModel groupChatNoticeViewModelZp = this.LLILLJJLI.zp();
        List listLJIIJJI = C1697810uHb.LJIIJJI(C23250099c.LIZLLL(ViewModelKt.getViewModelScope(groupChatNoticeViewModelZp), null, null, new C15598068u(groupChatNoticeViewModelZp, function2, (String) this.LLILLJJLI.LLLILZ.getValue(), null), 3), this.LLILLJJLI.cp().vQ2(function2));
        C1C7U.LIZIZ("GroupChatNoticeAssem@e5c8.onCreate$1");
        return listLJIIJJI;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Function2<? super C06OO, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function2, InterfaceC1364105Vn<? super List<? extends C09AE>> interfaceC1364105Vn) {
        return ((a) create(function2, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
