package X;

import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YQv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.logicunit.MessageRequestChatListFilter$Companion$isChatQualified$lambda$8$lambda$7$$inlined$blockingResult$1", f = "MessageRequestChatListFilter.kt", l = {131}, m = "invokeSuspend")
public final class C874110YQv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<Map<String, ? extends Map<String, ? extends String>>>>, Object> {
    public int LL;
    public final /* synthetic */ C0Y8T LLILLJJLI;
    public final /* synthetic */ List LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C874110YQv(InterfaceC1364105Vn interfaceC1364105Vn, C0Y8T c0y8t, List list) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0y8t;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C874110YQv(interfaceC1364105Vn, this.LLILLJJLI, this.LLILLL);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<Map<String, ? extends Map<String, ? extends String>>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0YHX c0yhxLIZ;
        C0YH4 c0yh4LJIIL;
        InterfaceC866310Xyf interfaceC866310XyfLIZIZ;
        InterfaceC865850Xxv interfaceC865850XxvLJIIIZ;
        C1C7U.LIZ("MessageRequestChatListFilter$Companion@83e9.isChatQualified$lambda$8$lambda$7$$inlined$blockingResult$1");
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
            IIMCoreProxyService.LIZ.getClass();
            IIMCoreProxyService iIMCoreProxyServiceLIZ = C875420YVw.LIZ();
            if (iIMCoreProxyServiceLIZ != null && (c0yhxLIZ = iIMCoreProxyServiceLIZ.LIZ(C0YM2.TIKTOK_SOCIAL_IM)) != null && (c0yh4LJIIL = c0yhxLIZ.LJIIL()) != null && (interfaceC866310XyfLIZIZ = c0yh4LJIIL.LIZIZ()) != null && (interfaceC865850XxvLJIIIZ = interfaceC866310XyfLIZIZ.LJIIIZ()) != null) {
                List<String> listSingletonList = Collections.singletonList(this.LLILLJJLI.getConversationId());
                List<String> list = this.LLILLL;
                this.LL = 1;
                obj = interfaceC865850XxvLJIIIZ.LIZIZ(listSingletonList, list, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MessageRequestChatListFilter$Companion@83e9.isChatQualified$lambda$8$lambda$7$$inlined$blockingResult$1");
                    return objLJFF;
                }
            }
            obj = C865670Xxd.LIZJ(C2097608Jq.LJ());
            C1C7U.LIZIZ("MessageRequestChatListFilter$Companion@83e9.isChatQualified$lambda$8$lambda$7$$inlined$blockingResult$1");
            return obj;
        }
        if (obj == null) {
            obj = C865670Xxd.LIZJ(C2097608Jq.LJ());
        }
        C1C7U.LIZIZ("MessageRequestChatListFilter$Companion@83e9.isChatQualified$lambda$8$lambda$7$$inlined$blockingResult$1");
        return obj;
    }
}
