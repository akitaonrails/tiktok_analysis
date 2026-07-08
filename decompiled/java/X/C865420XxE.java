package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XxE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.client.conversation.DefaultConversationExtensionManager$putLocalExt$$inlined$scopedIO$1", f = "DefaultConversationExtensionManager.kt", l = {75}, m = "invokeSuspend")
public final class C865420XxE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<Boolean>>, Object> {
    public int LL;
    public final /* synthetic */ C0Y01 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Map LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C865420XxE(InterfaceC1364105Vn interfaceC1364105Vn, C0Y01 c0y01, String str, Map map) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0y01;
        this.LLILLL = str;
        this.LLILZ = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C865420XxE(interfaceC1364105Vn, this.LLILLJJLI, this.LLILLL, this.LLILZ);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<Boolean>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Map<String, String> mapLJ;
        C1C7U.LIZ("DefaultConversationExtensionManager@ecdd.putLocalExt$$inlined$scopedIO$1");
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
            C0Y8T c0y8tLJIL = this.LLILLJJLI.LIZ.LJIL(this.LLILLL);
            if (c0y8tLJIL == null || (mapLJ = c0y8tLJIL.getLocalExt()) == null) {
                mapLJ = C2097608Jq.LJ();
            }
            Map<String, String> mapLJIIL = C2097608Jq.LJIIL(mapLJ, this.LLILZ);
            C0Y01 c0y01 = this.LLILLJJLI;
            String str = this.LLILLL;
            this.LL = 1;
            obj = c0y01.LJI(str, mapLJIIL, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DefaultConversationExtensionManager@ecdd.putLocalExt$$inlined$scopedIO$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("DefaultConversationExtensionManager@ecdd.putLocalExt$$inlined$scopedIO$1");
        return obj;
    }
}
