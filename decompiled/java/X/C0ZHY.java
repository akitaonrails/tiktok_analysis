package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.slots.InlineLabelReusedSkeletonUIContent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZHY, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.slots.InlineLabelReusedSkeletonUIContent$onShown$2", f = "InlineLabelReusedSkeletonUIContent.kt", l = {}, m = "invokeSuspend")
public final class C0ZHY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InlineLabelReusedSkeletonUIContent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZHY(InlineLabelReusedSkeletonUIContent inlineLabelReusedSkeletonUIContent, InterfaceC1364105Vn<? super C0ZHY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = inlineLabelReusedSkeletonUIContent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ZHY(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InlineLabelReusedSkeletonUIContent@4cf1.onShown$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String conversationId = this.LL.Ep().LL.getConversationId();
        boolean z = true;
        if (!this.LL.Ep().LL.isGroupChat()) {
            z = false;
        }
        C897200ZHq.LIZIZ(conversationId, z, "whee_content");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InlineLabelReusedSkeletonUIContent@4cf1.onShown$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
