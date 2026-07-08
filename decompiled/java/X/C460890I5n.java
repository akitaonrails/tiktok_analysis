package X;

import com.ss.android.ugc.aweme.im.sdk.chat.controller.utils.QuotedMessageViewModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS585S0100000_6;
import njp.a;

/* JADX INFO: renamed from: X.0I5n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.controller.utils.QuotedMessageViewModel$tryFetchFromDBThenRemote$2", f = "QuotedMessageViewModel.kt", l = {}, m = "invokeSuspend")
public final class C460890I5n extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<Long> LL;
    public final /* synthetic */ QuotedMessageViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C460890I5n(List<Long> list, QuotedMessageViewModel quotedMessageViewModel, String str, InterfaceC1364105Vn<? super C460890I5n> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = quotedMessageViewModel;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C460890I5n(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String conversationId;
        C1C7U.LIZ("QuotedMessageViewModel@57e9.tryFetchFromDBThenRemote$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Set setLLIIIZ = C13LP.LLIIIZ(this.LL);
        C0YNY c0yny = InterfaceC874680YTa.LIZ;
        List<C869590Y9l> listLJJIJIIJIL = C0YNY.LIZ(c0yny).LJJIJIIJIL(this.LL);
        this.LLILLJJLI.zQ2(listLJJIJIIJIL, new AwS585S0100000_6(setLLIIIZ, (Set<Long>) 296));
        C869590Y9l c869590Y9l = (C869590Y9l) C13LP.LJJJLL(listLJJIJIIJIL);
        if (c869590Y9l != null && (conversationId = c869590Y9l.getConversationId()) != null) {
            C1336205Ku.LIZ(false).getMessageRefreshManager().LIZJ(conversationId, listLJJIJIIJIL);
        }
        if (!setLLIIIZ.isEmpty()) {
            InterfaceC874680YTa interfaceC874680YTaLIZ = C0YNY.LIZ(c0yny);
            String str = this.LLILLL;
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(setLLIIIZ, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
            for (Object obj2 : setLLIIIZ) {
                ((Number) obj2).longValue();
                linkedHashMap.put(obj2, str);
            }
            interfaceC874680YTaLIZ.LJIILIIL(linkedHashMap, new C463020IDs(this.LLILLJJLI, 2));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("QuotedMessageViewModel@57e9.tryFetchFromDBThenRemote$2");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("QuotedMessageViewModel@57e9.tryFetchFromDBThenRemote$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
