package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS128S1100000_14;
import njp.a;

/* JADX INFO: renamed from: X.0XxG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.client.conversation.DefaultConversationMemberManager$queryGroupManagers$$inlined$scopedIO$1", f = "DefaultConversationMemberManager.kt", l = {73}, m = "invokeSuspend")
public final class C865440XxG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<List<? extends C0YAE>>>, Object> {
    public int LL;
    public final /* synthetic */ C865530XxP LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C865440XxG(InterfaceC1364105Vn interfaceC1364105Vn, C865530XxP c865530XxP, String str) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c865530XxP;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C865440XxG(interfaceC1364105Vn, this.LLILLJJLI, this.LLILLL);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<List<? extends C0YAE>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultConversationMemberManager@28e6.queryGroupManagers$$inlined$scopedIO$1");
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
            AwS128S1100000_14 awS128S1100000_14 = new AwS128S1100000_14(this.LLILLJJLI, this.LLILLL, 0);
            this.LL = 1;
            obj = C867000Xzm.LIZ(this, awS128S1100000_14);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DefaultConversationMemberManager@28e6.queryGroupManagers$$inlined$scopedIO$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("DefaultConversationMemberManager@28e6.queryGroupManagers$$inlined$scopedIO$1");
        return obj;
    }
}
