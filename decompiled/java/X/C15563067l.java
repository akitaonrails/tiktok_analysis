package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.b2c.notice.BusinessSingleChatNoticeAssem;
import com.ss.android.ugc.aweme.im.common.model.IMNoticeMsgStruct;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.067l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.notice.BusinessSingleChatNoticeAssem$subscribeChatNoticeData$2$1", f = "BusinessSingleChatNoticeAssem.kt", l = {}, m = "invokeSuspend")
public final class C15563067l extends C09AX implements Function2<Function2<? super C06OO, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object>, InterfaceC1364105Vn<? super List<? extends C09AE>>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ BusinessSingleChatNoticeAssem LLILLJJLI;
    public final /* synthetic */ List<IMNoticeMsgStruct> LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15563067l(BusinessSingleChatNoticeAssem businessSingleChatNoticeAssem, List<IMNoticeMsgStruct> list, Context context, InterfaceC1364105Vn<? super C15563067l> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = businessSingleChatNoticeAssem;
        this.LLILLL = list;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C15563067l c15563067l = new C15563067l(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c15563067l.LL = obj;
        return c15563067l;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BusinessSingleChatNoticeAssem@2cf.subscribeChatNoticeData$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Function2<? super C06OO, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function2 = (Function2) this.LL;
        this.LLILLJJLI.zp().EQ2(this.LLILLL);
        List listLJIIJJI = C1697810uHb.LJIIJJI(this.LLILLJJLI.zp().FQ2(this.LLILZ, this.LLILLL, function2), this.LLILLJJLI.cp().wQ2(this.LLILLL, function2));
        C1C7U.LIZIZ("BusinessSingleChatNoticeAssem@2cf.subscribeChatNoticeData$2$1");
        return listLJIIJJI;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Function2<? super C06OO, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function2, InterfaceC1364105Vn<? super List<? extends C09AE>> interfaceC1364105Vn) {
        return ((a) create(function2, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
