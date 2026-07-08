package X;

import android.content.Context;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.chatnotice.GroupChatNoticeAssem;
import com.ss.android.ugc.aweme.chatnotice.GroupChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.common.model.IMNoticeMsgStruct;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.067W, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.GroupChatNoticeAssem$subscribeChatNoticeData$2$1", f = "GroupChatNoticeAssem.kt", l = {}, m = "invokeSuspend")
public final class C067W extends C09AX implements Function2<Function2<? super C06OO, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object>, InterfaceC1364105Vn<? super List<? extends C09AE>>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ GroupChatNoticeAssem LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ List<IMNoticeMsgStruct> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C067W(GroupChatNoticeAssem groupChatNoticeAssem, Context context, List<IMNoticeMsgStruct> list, InterfaceC1364105Vn<? super C067W> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = groupChatNoticeAssem;
        this.LLILLL = context;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C067W c067w = new C067W(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c067w.LL = obj;
        return c067w;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupChatNoticeAssem@e5c8.subscribeChatNoticeData$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Function2<? super C06OO, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function2 = (Function2) this.LL;
        GroupChatNoticeViewModel groupChatNoticeViewModelZp = this.LLILLJJLI.zp();
        Context context = this.LLILLL;
        List<IMNoticeMsgStruct> list = this.LLILZ;
        GroupChatNoticeViewModel groupChatNoticeViewModelZp2 = this.LLILLJJLI.zp();
        List listLJIIJJI = C1697810uHb.LJIIJJI(C23250099c.LIZLLL(ViewModelKt.getViewModelScope(groupChatNoticeViewModelZp), null, null, new C15597068t(list, function2, context, groupChatNoticeViewModelZp, null), 3), this.LLILLJJLI.cp().wQ2(this.LLILZ, function2), C23250099c.LIZLLL(ViewModelKt.getViewModelScope(groupChatNoticeViewModelZp2), null, null, new C067U(function2, groupChatNoticeViewModelZp2, null), 3));
        C1C7U.LIZIZ("GroupChatNoticeAssem@e5c8.subscribeChatNoticeData$2$1");
        return listLJIIJJI;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Function2<? super C06OO, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function2, InterfaceC1364105Vn<? super List<? extends C09AE>> interfaceC1364105Vn) {
        return ((a) create(function2, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
