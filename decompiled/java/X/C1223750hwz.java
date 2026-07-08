package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupInviteListResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hwz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.selector.invitepeople.LiveInviteCTDSProtocol$onRefresh$2", f = "LiveInviteCTDSProtocol.kt", l = {79}, m = "invokeSuspend")
public final class C1223750hwz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AbstractC1223670hwr>, Object> {
    public int LL;
    public final /* synthetic */ C1227470i2z LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1223750hwz(C1227470i2z c1227470i2z, InterfaceC1364105Vn<? super C1223750hwz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1227470i2z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1223750hwz(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c1223680hws;
        Pair pair;
        Boolean bool;
        C1C7U.LIZ("LiveInviteCTDSProtocol@84a8.onRefresh$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean zBooleanValue = false;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1227470i2z c1227470i2z = this.LLILLJJLI;
                this.LL = 1;
                obj = c1227470i2z.LJJJJIZL(0, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LiveInviteCTDSProtocol@84a8.onRefresh$2");
                    return objLJFF;
                }
            }
            pair = (Pair) obj;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c1223680hws = new C1223680hws(e);
        }
        if (pair != null) {
            C1227470i2z c1227470i2z2 = this.LLILLJJLI;
            c1227470i2z2.LLILZLL = (List) pair.getSecond();
            String str = c1227470i2z2.LLILZIL.LJIIJJI;
            Integer num = null;
            if (str != null) {
                Object first = pair.getFirst();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C1223790hx3(str, (C1223780hx2) null, 6));
                arrayList.addAll((Collection) pair.getSecond());
                pair = new Pair(first, arrayList);
            }
            C1227470i2z c1227470i2z3 = this.LLILLJJLI;
            c1227470i2z3.LLIZLLLIL = true;
            c1227470i2z3.LJJJJJL(null);
            List list = (List) pair.getSecond();
            GroupInviteListResponse groupInviteListResponse = (GroupInviteListResponse) pair.getFirst();
            if (groupInviteListResponse != null && (bool = groupInviteListResponse.hasMore) != null) {
                zBooleanValue = bool.booleanValue();
            }
            GroupInviteListResponse groupInviteListResponse2 = (GroupInviteListResponse) pair.getFirst();
            if (groupInviteListResponse2 != null) {
                num = groupInviteListResponse2.nextCursor;
            }
            c1223680hws = new C1223660hwq(list, zBooleanValue, num);
            C1C7U.LIZIZ("LiveInviteCTDSProtocol@84a8.onRefresh$2");
            return c1223680hws;
        }
        C1223680hws c1223680hws2 = new C1223680hws(new Exception("group chat df not downloaded"));
        C1C7U.LIZIZ("LiveInviteCTDSProtocol@84a8.onRefresh$2");
        return c1223680hws2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AbstractC1223670hwr> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
