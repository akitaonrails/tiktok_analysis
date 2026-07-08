package X;

import com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseSingleChatNoticeViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.068f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseSingleChatNoticeViewModel$onSendMessageEvent$1$2", f = "BaseSingleChatNoticeViewModel.kt", l = {303, 307, 310, 313, 317}, m = "invokeSuspend")
public final class C15583068f extends C09AX implements Function2<Function2<? super C06OO, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object>, InterfaceC1364105Vn<? super List<? extends C09AE>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ BaseSingleChatNoticeViewModel LLILLL;
    public final /* synthetic */ C06SA LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15583068f(BaseSingleChatNoticeViewModel baseSingleChatNoticeViewModel, C06SA c06sa, InterfaceC1364105Vn<? super C15583068f> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = baseSingleChatNoticeViewModel;
        this.LLILZ = c06sa;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C15583068f c15583068f = new C15583068f(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c15583068f.LLILLJJLI = obj;
        return c15583068f;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0102  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15583068f.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Function2<? super C06OO, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function2, InterfaceC1364105Vn<? super List<? extends C09AE>> interfaceC1364105Vn) {
        return ((a) create(function2, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
