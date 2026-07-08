package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.chatnotice.GroupChatNoticeAssem;
import com.ss.android.ugc.aweme.chatnotice.GroupChatNoticeViewModel;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.067V, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.GroupChatNoticeAssem$subscribeChatNoticeData$2$2", f = "GroupChatNoticeAssem.kt", l = {}, m = "invokeSuspend")
public final class C067V extends C09AX implements Function2<Function2<? super C06OO, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object>, InterfaceC1364105Vn<? super List<? extends C09AE>>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ GroupChatNoticeAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C067V(GroupChatNoticeAssem groupChatNoticeAssem, InterfaceC1364105Vn<? super C067V> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = groupChatNoticeAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C067V c067v = new C067V(this.LLILLJJLI, interfaceC1364105Vn);
        c067v.LL = obj;
        return c067v;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupChatNoticeAssem@e5c8.subscribeChatNoticeData$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Function2 function2 = (Function2) this.LL;
        GroupChatNoticeViewModel groupChatNoticeViewModelZp = this.LLILLJJLI.zp();
        List listSingletonList = Collections.singletonList(C23250099c.LIZLLL(ViewModelKt.getViewModelScope(groupChatNoticeViewModelZp), null, null, new C067U(function2, groupChatNoticeViewModelZp, null), 3));
        C1C7U.LIZIZ("GroupChatNoticeAssem@e5c8.subscribeChatNoticeData$2$2");
        return listSingletonList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Function2<? super C06OO, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function2, InterfaceC1364105Vn<? super List<? extends C09AE>> interfaceC1364105Vn) {
        return ((a) create(function2, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
