package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS66S0210000_14;
import njp.a;

/* JADX INFO: renamed from: X.0Xwn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.client.conversation.DefaultConversationManager$batchDeleteConversations$$inlined$scopedIO$1", f = "DefaultConversationManager.kt", l = {87}, m = "invokeSuspend")
public final class C865150Xwn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<List<? extends String>>>, Object> {
    public int LL;
    public final /* synthetic */ List LLILLJJLI;
    public final /* synthetic */ C866340Xyi LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C865150Xwn(InterfaceC1364105Vn interfaceC1364105Vn, List list, C866340Xyi c866340Xyi, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = c866340Xyi;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C865150Xwn(interfaceC1364105Vn, this.LLILLJJLI, this.LLILLL, this.LLILZ);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<List<? extends String>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultConversationManager@5d7d.batchDeleteConversations$$inlined$scopedIO$1");
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
            List list = this.LLILLJJLI;
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C0Y8T c0y8tLJIL = this.LLILLL.LIZ.LJIL((String) it2.next());
                if (c0y8tLJIL != null) {
                    arrayList.add(c0y8tLJIL);
                }
            }
            AwS66S0210000_14 awS66S0210000_14 = new AwS66S0210000_14(this.LLILLL, (C866340Xyi) arrayList, (List<C0Y8T>) this.LLILZ, false);
            this.LL = 1;
            obj = C867000Xzm.LIZ(this, awS66S0210000_14);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DefaultConversationManager@5d7d.batchDeleteConversations$$inlined$scopedIO$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("DefaultConversationManager@5d7d.batchDeleteConversations$$inlined$scopedIO$1");
        return obj;
    }
}
