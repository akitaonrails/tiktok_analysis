package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0hyt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.selector.invitepeople.LiveInviteSearchDataSourceProtocol$onSearch$2", f = "LiveInviteSearchDataSourceProtocol.kt", l = {71}, m = "invokeSuspend")
public final class C1224930hyt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AbstractC1223670hwr>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1224940hyu LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1224930hyt(String str, C1224940hyu c1224940hyu, InterfaceC1364105Vn<? super C1224930hyt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = c1224940hyu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1224930hyt c1224930hyt = new C1224930hyt(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1224930hyt.LLILLJJLI = obj;
        return c1224930hyt;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c1223680hws;
        boolean z;
        List<C1224840hyk> list;
        List<C1224840hyk> list2;
        List<C1224840hyk> list3;
        List<C1224840hyk> list4;
        C1224780hye c1224780hyeLJIILLIIL;
        Map<String, List<C1224840hyk>> map;
        C1224780hye c1224780hyeLJIILLIIL2;
        Map<String, List<C1224840hyk>> map2;
        C1224780hye c1224780hyeLJIILLIIL3;
        Map<String, List<C1224840hyk>> map3;
        C1224780hye c1224780hyeLJIILLIIL4;
        Map<String, List<C1224840hyk>> map4;
        Object objLJLIIIL = obj;
        C1C7U.LIZ("LiveInviteSearchDataSourceProtocol@86f8.onSearch$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c1223680hws = new C1223680hws(e);
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLJLIIIL);
        } else {
            C155000ia.LIZIZ(objLJLIIIL);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            if (a0.LJLIIIL(this.LLILLL).toString().length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c1223680hws = new C1223660hwq(C13BV.INSTANCE);
                C1C7U.LIZIZ("LiveInviteSearchDataSourceProtocol@86f8.onSearch$2");
                return c1223680hws;
            }
            InterfaceC1226510i1R interfaceC1226510i1R = this.LLILZ.LL.LIZ;
            if (interfaceC1226510i1R == null || (c1224780hyeLJIILLIIL4 = interfaceC1226510i1R.LJIILLIIL()) == null || (map4 = c1224780hyeLJIILLIIL4.LIZ) == null || (list = map4.get(EnumC1226540i1U.TAB_KEY_LIVE_MOST_WATCH_TIME.getValue())) == null) {
                list = C13BV.INSTANCE;
            }
            InterfaceC1226510i1R interfaceC1226510i1R2 = this.LLILZ.LL.LIZ;
            if (interfaceC1226510i1R2 == null || (c1224780hyeLJIILLIIL3 = interfaceC1226510i1R2.LJIILLIIL()) == null || (map3 = c1224780hyeLJIILLIIL3.LIZ) == null || (list2 = map3.get(EnumC1226540i1U.TAB_KEY_LIVE_MOST_GIFT_COUNT.getValue())) == null) {
                list2 = C13BV.INSTANCE;
            }
            InterfaceC1226510i1R interfaceC1226510i1R3 = this.LLILZ.LL.LIZ;
            if (interfaceC1226510i1R3 == null || (c1224780hyeLJIILLIIL2 = interfaceC1226510i1R3.LJIILLIIL()) == null || (map2 = c1224780hyeLJIILLIIL2.LIZ) == null || (list3 = map2.get(EnumC1226540i1U.TAB_KEY_LIVE_SMB.getValue())) == null) {
                list3 = C13BV.INSTANCE;
            }
            InterfaceC1226510i1R interfaceC1226510i1R4 = this.LLILZ.LL.LIZ;
            if (interfaceC1226510i1R4 == null || (c1224780hyeLJIILLIIL = interfaceC1226510i1R4.LJIILLIIL()) == null || (map = c1224780hyeLJIILLIIL.LIZ) == null || (list4 = map.get(EnumC1226540i1U.TAB_KEY_LIVE_TOP_GUEST.getValue())) == null) {
                list4 = C13BV.INSTANCE;
            }
            C2296808zG.LJFF(interfaceC497601wk);
            List<C1224840hyk> list5 = list;
            this.LLILZ.LLILZ = C23250099c.LIZIZ(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1223690hwt(this.LLILZ, this.LLILLL, list5, list2, list3, list4, null), 3);
            C23118094a.LJI(interfaceC497601wk.getCoroutineContext());
            C099G c099g = this.LLILZ.LLILZ;
            if (c099g != null) {
                this.LL = 1;
                objLJLIIIL = c099g.LJLIIIL(this);
                if (objLJLIIIL == objLJFF) {
                    C1C7U.LIZIZ("LiveInviteSearchDataSourceProtocol@86f8.onSearch$2");
                    return objLJFF;
                }
            }
            c1223680hws = new C1223660hwq(C13BV.INSTANCE, false, "remote_search_cursor");
            C1C7U.LIZIZ("LiveInviteSearchDataSourceProtocol@86f8.onSearch$2");
            return c1223680hws;
        }
        c1223680hws = (AbstractC1223670hwr) objLJLIIIL;
        if (c1223680hws == null) {
            c1223680hws = new C1223660hwq(C13BV.INSTANCE, false, "remote_search_cursor");
        }
        C1C7U.LIZIZ("LiveInviteSearchDataSourceProtocol@86f8.onSearch$2");
        return c1223680hws;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AbstractC1223670hwr> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
