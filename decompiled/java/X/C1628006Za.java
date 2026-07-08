package X;

import com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMReadMessageAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Za, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMReadMessageAnalytics$reportReadMessage$1$7", f = "IMReadMessageAnalytics.kt", l = {217}, m = "invokeSuspend")
public final class C1628006Za extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC874680YTa LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1628006Za(InterfaceC874680YTa interfaceC874680YTa, InterfaceC1364105Vn<? super C1628006Za> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC874680YTa;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1628006Za(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMReadMessageAnalytics@1b58.reportReadMessage$1$7");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(800L, this) == objLJFF) {
                C1C7U.LIZIZ("IMReadMessageAnalytics@1b58.reportReadMessage$1$7");
                return objLJFF;
            }
        }
        IMReadMessageAnalytics iMReadMessageAnalytics = IMReadMessageAnalytics.LIZIZ;
        InterfaceC874680YTa interfaceC874680YTa = this.LLILLJJLI;
        iMReadMessageAnalytics.getClass();
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) IMReadMessageAnalytics.LIZJ;
        if (!copyOnWriteArraySet.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = copyOnWriteArraySet.iterator();
            while (it2.hasNext()) {
                C869590Y9l c869590Y9lLIZLLL = interfaceC874680YTa.LIZLLL((String) it2.next());
                if (c869590Y9lLIZLLL != null) {
                    arrayList.add(c869590Y9lLIZLLL);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                int i2 = C0ZDX.LIZJ;
                if (((C869590Y9l) obj2).getLocalExt().get("key_local_ext_has_read") == null) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ((C869590Y9l) it3.next()).getLocalExt().put("key_local_ext_has_read", "1");
            }
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                arrayList3.add(new Pair(it4.next(), C2097908Jt.LIZJ(new Pair("key_local_ext_has_read", new C0Y3R("1")))));
            }
            interfaceC874680YTa.LIZIZ().LJFF(arrayList3, true, new C0Y3I("flag message as read"));
            ((CopyOnWriteArraySet) IMReadMessageAnalytics.LIZJ).clear();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMReadMessageAnalytics@1b58.reportReadMessage$1$7");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
