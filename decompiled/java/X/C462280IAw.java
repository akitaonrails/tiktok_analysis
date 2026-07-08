package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.im.service.impl.AwemeCardManager;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0IAw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.impl.AwemeCardManager$queryQuotedMsg$1", f = "AwemeCardManager.kt", l = {}, m = "invokeSuspend")
public final class C462280IAw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C869590Y9l LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C462280IAw(C869590Y9l c869590Y9l, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c869590Y9l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C462280IAw c462280IAw = new C462280IAw(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
        c462280IAw.LL = obj;
        return c462280IAw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String conversationId;
        C1C7U.LIZ("AwemeCardManager@84f0.queryQuotedMsg$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C869590Y9l c869590Y9lLIZIZ = C875230YVd.LIZIZ(this.LLILLJJLI);
        int iIntValue = 0;
        if (c869590Y9lLIZIZ != null) {
            C869590Y9l c869590Y9l = this.LLILLL;
            AwemeCardManager awemeCardManager = AwemeCardManager.LIZIZ;
            List listSingletonList = Collections.singletonList(c869590Y9l);
            awemeCardManager.getClass();
            AwemeCardManager.LJII(c869590Y9lLIZIZ, listSingletonList);
            List<? extends C869590Y9l> listSingletonList2 = Collections.singletonList(c869590Y9lLIZIZ);
            C869590Y9l c869590Y9l2 = (C869590Y9l) C13LP.LJJJLL(listSingletonList2);
            if (c869590Y9l2 != null && (conversationId = c869590Y9l2.getConversationId()) != null) {
                C1336205Ku.LIZ(false).getMessageRefreshManager().LIZJ(conversationId, listSingletonList2);
            }
        } else {
            String str = this.LLILLJJLI;
            C869590Y9l c869590Y9l3 = this.LLILLL;
            ConcurrentHashMap<String, Integer> concurrentHashMap = AwemeCardManager.LJII;
            Integer num = concurrentHashMap.get(str);
            if (num == null || num.intValue() < 2) {
                Integer num2 = concurrentHashMap.get(str);
                if (num2 != null) {
                    iIntValue = num2.intValue();
                }
                concurrentHashMap.put(str, C2286608xc.LJ(iIntValue + 1));
                C869590Y9l c869590Y9l4 = new C869590Y9l();
                c869590Y9l4.setMsgId(CastLongProtector.parseLong(str));
                C0YNY.LIZ(InterfaceC874680YTa.LIZ).LJIIIZ(new C463020IDs(c869590Y9l3, 0), c869590Y9l3.getConversationId(), Collections.singletonList(c869590Y9l4));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AwemeCardManager@84f0.queryQuotedMsg$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
