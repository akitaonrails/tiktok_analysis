package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tts.pigeon.paas.components.base.PigeonConversationListComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS248S0000000_14;
import njp.a;

/* JADX INFO: renamed from: X.0YX9, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.tts.pigeon.paas.components.base.PigeonConversationListComponent$updateConversationListFromIMSDK$1", f = "PigeonConversationListComponent.kt", l = {}, m = "invokeSuspend")
public final class C0YX9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PigeonConversationListComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YX9(PigeonConversationListComponent pigeonConversationListComponent, InterfaceC1364105Vn<? super C0YX9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = pigeonConversationListComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YX9(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PigeonConversationListComponent@8ae3.updateConversationListFromIMSDK$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            List listLJJII = C09RB.LJJII(C09RB.LJIIIZ(new C1939607ik(this.LL.LL.m144getConversationListManager().LIZIZ()), AFwS248S0000000_14.get$arr$(16)));
            PigeonConversationListComponent pigeonConversationListComponent = this.LL;
            synchronized (pigeonConversationListComponent.LLILLL) {
                try {
                    pigeonConversationListComponent.LLILLL.clear();
                    CopyOnWriteArrayList<C0YX2> copyOnWriteArrayList = pigeonConversationListComponent.LLILLL;
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJII, 10));
                    Iterator it2 = listLJJII.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new C0YX2((C0Y8T) it2.next()));
                    }
                    copyOnWriteArrayList.addAll(arrayList);
                    pigeonConversationListComponent.LLILLJJLI.setValue(new ArrayList(pigeonConversationListComponent.LLILLL));
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            if (!((Boolean) this.LL.LLILZ.getValue()).booleanValue()) {
                this.LL.LLILZ.setValue(true);
                PigeonConversationListComponent pigeonConversationListComponent2 = this.LL;
                C0YXD.LIZJ(pigeonConversationListComponent2.LJJJJLL(), AFwS248S0000000_14.get$arr$(15));
            }
        } catch (Exception e) {
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PigeonConversationListComponent@8ae3.updateConversationListFromIMSDK$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
