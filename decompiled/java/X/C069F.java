package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.viewmodel.SingleChatNoticeViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.069F, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.viewmodel.SingleChatNoticeViewModel$triggerLocalTasks$1$1", f = "SingleChatNoticeViewModel.kt", l = {68, 69, 70, 71, 73, 77, 80, 83, 87, 88, 98}, m = "invokeSuspend")
public final class C069F extends C09AX implements Function2<Function2<? super C06OO, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object>, InterfaceC1364105Vn<? super List<? extends C09AE>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C909290Zln LLILLL;
    public final /* synthetic */ SingleChatNoticeViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C069F(C909290Zln c909290Zln, SingleChatNoticeViewModel singleChatNoticeViewModel, InterfaceC1364105Vn<? super C069F> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c909290Zln;
        this.LLILZ = singleChatNoticeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C069F c069f = new C069F(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c069f.LLILLJJLI = obj;
        return c069f;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01de  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C069F.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Function2<? super C06OO, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function2, InterfaceC1364105Vn<? super List<? extends C09AE>> interfaceC1364105Vn) {
        return ((a) create(function2, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
