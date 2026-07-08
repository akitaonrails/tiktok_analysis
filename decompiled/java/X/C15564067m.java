package X;

import com.ss.android.ugc.aweme.im.b2c.notice.BusinessSingleChatNoticeAssem;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.067m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.notice.BusinessSingleChatNoticeAssem$onCreate$2", f = "BusinessSingleChatNoticeAssem.kt", l = {}, m = "invokeSuspend")
public final class C15564067m extends C09AX implements Function2<Function2<? super C06OO, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object>, InterfaceC1364105Vn<? super List<? extends C09AE>>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ BusinessSingleChatNoticeAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15564067m(BusinessSingleChatNoticeAssem businessSingleChatNoticeAssem, InterfaceC1364105Vn<? super C15564067m> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = businessSingleChatNoticeAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C15564067m c15564067m = new C15564067m(this.LLILLJJLI, interfaceC1364105Vn);
        c15564067m.LL = obj;
        return c15564067m;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BusinessSingleChatNoticeAssem@2cf.onCreate$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List listSingletonList = Collections.singletonList(this.LLILLJJLI.cp().vQ2((Function2) this.LL));
        C1C7U.LIZIZ("BusinessSingleChatNoticeAssem@2cf.onCreate$2");
        return listSingletonList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Function2<? super C06OO, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function2, InterfaceC1364105Vn<? super List<? extends C09AE>> interfaceC1364105Vn) {
        return ((a) create(function2, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
