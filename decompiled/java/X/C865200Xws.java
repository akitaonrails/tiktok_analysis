package X;

import com.bytedance.im.core.proto.SetConversationSettingInfoResponseBody;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS380S0200000_14;
import njp.a;

/* JADX INFO: renamed from: X.0Xws, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.client.conversation.DefaultConversationReadStatusManager$batchMarkUnread$$inlined$scopedIO$1", f = "DefaultConversationReadStatusManager.kt", l = {73}, m = "invokeSuspend")
public final class C865200Xws extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<List<? extends SetConversationSettingInfoResponseBody>>>, Object> {
    public int LL;
    public final /* synthetic */ C865210Xwt LLILLJJLI;
    public final /* synthetic */ List LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C865200Xws(InterfaceC1364105Vn interfaceC1364105Vn, C865210Xwt c865210Xwt, List list) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c865210Xwt;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C865200Xws(interfaceC1364105Vn, this.LLILLJJLI, this.LLILLL);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<List<? extends SetConversationSettingInfoResponseBody>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultConversationReadStatusManager@291.batchMarkUnread$$inlined$scopedIO$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            AwS380S0200000_14 awS380S0200000_14 = new AwS380S0200000_14(this.LLILLJJLI, (C865210Xwt) this.LLILLL, (List<String>) 8);
            this.LL = 1;
            obj = C867000Xzm.LIZ(this, awS380S0200000_14);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DefaultConversationReadStatusManager@291.batchMarkUnread$$inlined$scopedIO$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("DefaultConversationReadStatusManager@291.batchMarkUnread$$inlined$scopedIO$1");
        return obj;
    }
}
