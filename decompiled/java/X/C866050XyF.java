package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XyF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.im.core.client.ConversationListModelImpl$batchChangeConversationTagsById$$inlined$bridge$default$1", f = "ConversationListModelImpl.kt", l = {102}, m = "invokeSuspend")
public final class C866050XyF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC863600XuI LLILLJJLI;
    public final /* synthetic */ C866710XzJ LLILLL;
    public final /* synthetic */ List LLILZ;
    public final /* synthetic */ List LLILZIL;
    public final /* synthetic */ List LLILZLL;
    public final /* synthetic */ Boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C866050XyF(InterfaceC863600XuI interfaceC863600XuI, InterfaceC1364105Vn interfaceC1364105Vn, C866710XzJ c866710XzJ, List list, List list2, List list3, Boolean bool) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC863600XuI;
        this.LLILLL = c866710XzJ;
        this.LLILZ = list;
        this.LLILZIL = list2;
        this.LLILZLL = list3;
        this.LLIZ = bool;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C866050XyF(this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0Y6Q c0y6qLIZIZ;
        C1C7U.LIZ("ConversationListModelImpl@8f5d.batchChangeConversationTagsById$$inlined$bridge$default$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                InterfaceC866060XyG interfaceC866060XyGLJFF = this.LLILLL.LIZIZ.LIZIZ().LJFF();
                List<String> list = this.LLILZ;
                List list2 = this.LLILZIL;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((EnumC879080YeA) it2.next()).getValue());
                }
                List list3 = this.LLILZLL;
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((EnumC879080YeA) it3.next()).getValue());
                }
                Boolean bool = this.LLIZ;
                this.LL = 1;
                obj = interfaceC866060XyGLJFF.LJFF(list, arrayList, arrayList2, bool, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ConversationListModelImpl@8f5d.batchChangeConversationTagsById$$inlined$bridge$default$1");
                    return objLJFF;
                }
            }
            c0y6qLIZIZ = (C0Y6Q) obj;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            String message = th.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            c0y6qLIZIZ = C865670Xxd.LIZIZ(new C0YPY(-1, message, th));
        }
        C867000Xzm.LIZIZ(c0y6qLIZIZ, this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ConversationListModelImpl@8f5d.batchChangeConversationTagsById$$inlined$bridge$default$1");
        return unit;
    }
}
