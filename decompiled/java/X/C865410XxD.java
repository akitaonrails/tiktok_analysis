package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS380S0200000_14;
import njp.a;

/* JADX INFO: renamed from: X.0XxD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.client.conversation.DefaultConversationExtensionManager$batchPutLocalExt$$inlined$scopedIO$1", f = "DefaultConversationExtensionManager.kt", l = {81}, m = "invokeSuspend")
public final class C865410XxD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<Boolean>>, Object> {
    public int LL;
    public final /* synthetic */ Map LLILLJJLI;
    public final /* synthetic */ C0Y01 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C865410XxD(InterfaceC1364105Vn interfaceC1364105Vn, Map map, C0Y01 c0y01) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = map;
        this.LLILLL = c0y01;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C865410XxD(interfaceC1364105Vn, this.LLILLJJLI, this.LLILLL);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<Boolean>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Map<String, String> mapLJ;
        C1C7U.LIZ("DefaultConversationExtensionManager@ecdd.batchPutLocalExt$$inlined$scopedIO$1");
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
            Map map = this.LLILLJJLI;
            LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                String str = (String) entry.getKey();
                Map map2 = (Map) entry.getValue();
                C0Y8T c0y8tLJIL = this.LLILLL.LIZ.LJIL(str);
                if (c0y8tLJIL == null || (mapLJ = c0y8tLJIL.getLocalExt()) == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                linkedHashMap.put(key, C2097608Jq.LJIIL(mapLJ, map2));
            }
            AwS380S0200000_14 awS380S0200000_14 = new AwS380S0200000_14(this.LLILLL, (C0Y01) linkedHashMap, (Map<String, ? extends Map<String, String>>) 4);
            this.LL = 1;
            obj = C867000Xzm.LIZ(this, awS380S0200000_14);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DefaultConversationExtensionManager@ecdd.batchPutLocalExt$$inlined$scopedIO$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("DefaultConversationExtensionManager@ecdd.batchPutLocalExt$$inlined$scopedIO$1");
        return obj;
    }
}
