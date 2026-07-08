package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS22S1400000_14;
import njp.a;

/* JADX INFO: renamed from: X.0Xx1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.client.conversation.DefaultConversationSettingsManager$changeConversationTags$$inlined$scopedIO$1", f = "DefaultConversationSettingsManager.kt", l = {73}, m = "invokeSuspend")
public final class C865290Xx1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<C0Y8T>>, Object> {
    public int LL;
    public final /* synthetic */ C865340Xx6 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ List LLILZ;
    public final /* synthetic */ List LLILZIL;
    public final /* synthetic */ Boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C865290Xx1(InterfaceC1364105Vn interfaceC1364105Vn, C865340Xx6 c865340Xx6, String str, List list, List list2, Boolean bool) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c865340Xx6;
        this.LLILLL = str;
        this.LLILZ = list;
        this.LLILZIL = list2;
        this.LLILZLL = bool;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C865290Xx1(interfaceC1364105Vn, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<C0Y8T>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultConversationSettingsManager@6c8c.changeConversationTags$$inlined$scopedIO$1");
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
            AwS22S1400000_14 awS22S1400000_14 = new AwS22S1400000_14(this.LLILLJJLI, (C865340Xx6) this.LLILLL, (String) this.LLILZ, (List<String>) this.LLILZIL, (List<String>) this.LLILZLL, (Boolean) 0);
            this.LL = 1;
            obj = C867000Xzm.LIZ(this, awS22S1400000_14);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DefaultConversationSettingsManager@6c8c.changeConversationTags$$inlined$scopedIO$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("DefaultConversationSettingsManager@6c8c.changeConversationTags$$inlined$scopedIO$1");
        return obj;
    }
}
