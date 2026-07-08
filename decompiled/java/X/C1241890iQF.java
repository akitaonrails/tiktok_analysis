package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerChunkProtocol;
import com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchResultAllTabVM;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0iQF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchResultAllTabVM$refresh$1$job$1$1", f = "InboxSearchResultAllTabVM.kt", l = {339}, m = "invokeSuspend")
public final class C1241890iQF extends C09AX implements Function2<C1241920iQI, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public Object LLILLJJLI;
    public InboxSearchPowerChunkProtocol LLILLL;
    public InboxSearchResultAllTabVM LLILZ;
    public C1242050iQV LLILZIL;
    public int LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ InboxSearchResultAllTabVM LLJ;
    public final /* synthetic */ InterfaceC497601wk LLJI;
    public final /* synthetic */ Map<EnumC1241910iQH, List<InterfaceC1240590iO9>> LLJIJIL;
    public final /* synthetic */ InboxSearchPowerChunkProtocol LLJILJIL;
    public final /* synthetic */ C1242050iQV LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1241890iQF(String str, InboxSearchResultAllTabVM inboxSearchResultAllTabVM, InterfaceC497601wk interfaceC497601wk, Map<EnumC1241910iQH, List<InterfaceC1240590iO9>> map, InboxSearchPowerChunkProtocol inboxSearchPowerChunkProtocol, C1242050iQV c1242050iQV, InterfaceC1364105Vn<? super C1241890iQF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = str;
        this.LLJ = inboxSearchResultAllTabVM;
        this.LLJI = interfaceC497601wk;
        this.LLJIJIL = map;
        this.LLJILJIL = inboxSearchPowerChunkProtocol;
        this.LLJILJILJ = c1242050iQV;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1241890iQF c1241890iQF = new C1241890iQF(this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
        c1241890iQF.LLIZ = obj;
        return c1241890iQF;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1241920iQI c1241920iQI;
        InboxSearchResultAllTabVM inboxSearchResultAllTabVM;
        C1DEV c1dev;
        Map<EnumC1241910iQH, List<InterfaceC1240590iO9>> map;
        InboxSearchPowerChunkProtocol inboxSearchPowerChunkProtocol;
        C1242050iQV c1242050iQV;
        C1C7U.LIZ("InboxSearchResultAllTabVM@33a5.refresh$1$job$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZLL;
        try {
            if (i != 0) {
                if (i == 1) {
                    c1242050iQV = this.LLILZIL;
                    inboxSearchResultAllTabVM = this.LLILZ;
                    inboxSearchPowerChunkProtocol = this.LLILLL;
                    map = (Map) this.LLILLJJLI;
                    c1dev = this.LL;
                    c1241920iQI = (C1241920iQI) this.LLIZ;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                c1241920iQI = (C1241920iQI) this.LLIZ;
                if (Intrinsics.LJFF(c1241920iQI.LIZ, this.LLIZLLLIL) && (!c1241920iQI.LIZJ.isEmpty())) {
                    inboxSearchResultAllTabVM = this.LLJ;
                    c1dev = inboxSearchResultAllTabVM.LLIZLLLIL;
                    map = this.LLJIJIL;
                    inboxSearchPowerChunkProtocol = this.LLJILJIL;
                    c1242050iQV = this.LLJILJILJ;
                    this.LLIZ = c1241920iQI;
                    this.LL = c1dev;
                    this.LLILLJJLI = map;
                    this.LLILLL = inboxSearchPowerChunkProtocol;
                    this.LLILZ = inboxSearchResultAllTabVM;
                    this.LLILZIL = c1242050iQV;
                    this.LLILZLL = 1;
                    if (c1dev.LIZLLL(null, this) == objLJFF) {
                        C1C7U.LIZIZ("InboxSearchResultAllTabVM@33a5.refresh$1$job$1$1");
                        return objLJFF;
                    }
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("InboxSearchResultAllTabVM@33a5.refresh$1$job$1$1");
                return unit;
            }
            map.put(inboxSearchPowerChunkProtocol.LJIIIZ(), c1241920iQI.LIZJ);
            Pair pair = new Pair(inboxSearchResultAllTabVM.wQ2(c1242050iQV), inboxSearchResultAllTabVM.vQ2(map, c1242050iQV, false));
            c1dev.LIZIZ(null);
            EnumC1241490iPb enumC1241490iPb = (EnumC1241490iPb) pair.getFirst();
            List list = (List) pair.getSecond();
            C2296808zG.LJFF(this.LLJI);
            this.LLJ.setState(new AwS385S0200000_19(list, (List<? extends InterfaceC1891350zJl>) enumC1241490iPb, (EnumC1241490iPb) 37));
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("InboxSearchResultAllTabVM@33a5.refresh$1$job$1$1");
            return unit2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1dev.LIZIZ(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C1241920iQI c1241920iQI, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c1241920iQI, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
