package X;

import com.bytedance.im.core.proto.SetConversationSettingInfoResponseBody;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS48S0500000_14;
import njp.a;

/* JADX INFO: renamed from: X.0Xwz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.client.conversation.DefaultConversationSettingsManager$batchChangeConversationTags$$inlined$scopedIO$1", f = "DefaultConversationSettingsManager.kt", l = {73}, m = "invokeSuspend")
public final class C865270Xwz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<List<? extends SetConversationSettingInfoResponseBody>>>, Object> {
    public int LL;
    public final /* synthetic */ C865340Xx6 LLILLJJLI;
    public final /* synthetic */ List LLILLL;
    public final /* synthetic */ List LLILZ;
    public final /* synthetic */ List LLILZIL;
    public final /* synthetic */ Boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C865270Xwz(InterfaceC1364105Vn interfaceC1364105Vn, C865340Xx6 c865340Xx6, List list, List list2, List list3, Boolean bool) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c865340Xx6;
        this.LLILLL = list;
        this.LLILZ = list2;
        this.LLILZIL = list3;
        this.LLILZLL = bool;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C865270Xwz(interfaceC1364105Vn, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<List<? extends SetConversationSettingInfoResponseBody>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultConversationSettingsManager@6c8c.batchChangeConversationTags$$inlined$scopedIO$1");
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
            AwS48S0500000_14 awS48S0500000_14 = new AwS48S0500000_14(this.LLILLJJLI, (C865340Xx6) this.LLILLL, (List<String>) this.LLILZ, (List<String>) this.LLILZIL, (List<String>) this.LLILZLL, (Boolean) 0);
            this.LL = 1;
            obj = C867000Xzm.LIZ(this, awS48S0500000_14);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DefaultConversationSettingsManager@6c8c.batchChangeConversationTags$$inlined$scopedIO$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("DefaultConversationSettingsManager@6c8c.batchChangeConversationTags$$inlined$scopedIO$1");
        return obj;
    }
}
