package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS98S1200000_14;
import njp.a;

/* JADX INFO: renamed from: X.0XxF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.client.conversation.DefaultConversationExtensionManager$upsertCoreExt$$inlined$scopedIO$1", f = "DefaultConversationExtensionManager.kt", l = {73}, m = "invokeSuspend")
public final class C865430XxF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<C0Y8T>>, Object> {
    public int LL;
    public final /* synthetic */ C0Y01 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Map LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C865430XxF(InterfaceC1364105Vn interfaceC1364105Vn, C0Y01 c0y01, String str, Map map) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0y01;
        this.LLILLL = str;
        this.LLILZ = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C865430XxF(interfaceC1364105Vn, this.LLILLJJLI, this.LLILLL, this.LLILZ);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<C0Y8T>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultConversationExtensionManager@ecdd.upsertCoreExt$$inlined$scopedIO$1");
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
            AwS98S1200000_14 awS98S1200000_14 = new AwS98S1200000_14(this.LLILLJJLI, (C0Y01) this.LLILLL, (String) this.LLILZ, (Map<String, String>) 1);
            this.LL = 1;
            obj = C867000Xzm.LIZ(this, awS98S1200000_14);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DefaultConversationExtensionManager@ecdd.upsertCoreExt$$inlined$scopedIO$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("DefaultConversationExtensionManager@ecdd.upsertCoreExt$$inlined$scopedIO$1");
        return obj;
    }
}
