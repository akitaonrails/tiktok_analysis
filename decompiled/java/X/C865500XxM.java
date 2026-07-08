package X;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS54S1300000_14;
import njp.a;

/* JADX INFO: renamed from: X.0XxM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.client.conversation.DefaultConversationMemberManager$removeMembers$$inlined$scopedIO$1", f = "DefaultConversationMemberManager.kt", l = {73}, m = "invokeSuspend")
public final class C865500XxM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<List<? extends C0YAE>>>, Object> {
    public int LL;
    public final /* synthetic */ C865530XxP LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ List LLILZ;
    public final /* synthetic */ Map LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C865500XxM(InterfaceC1364105Vn interfaceC1364105Vn, C865530XxP c865530XxP, String str, List list, Map map) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c865530XxP;
        this.LLILLL = str;
        this.LLILZ = list;
        this.LLILZIL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C865500XxM(interfaceC1364105Vn, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<List<? extends C0YAE>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultConversationMemberManager@28e6.removeMembers$$inlined$scopedIO$1");
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
            AwS54S1300000_14 awS54S1300000_14 = new AwS54S1300000_14(this.LLILLJJLI, (C865530XxP) this.LLILLL, (String) this.LLILZ, (List<Long>) this.LLILZIL, (Map<String, String>) 0);
            this.LL = 1;
            obj = C867010Xzn.LIZ(this, awS54S1300000_14);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DefaultConversationMemberManager@28e6.removeMembers$$inlined$scopedIO$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("DefaultConversationMemberManager@28e6.removeMembers$$inlined$scopedIO$1");
        return obj;
    }
}
