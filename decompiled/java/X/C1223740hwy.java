package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupInviteListResponse;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hwy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.selector.invitepeople.LiveInviteCTDSProtocol$onLoadMore$2", f = "LiveInviteCTDSProtocol.kt", l = {140}, m = "invokeSuspend")
public final class C1223740hwy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AbstractC1223670hwr>, Object> {
    public int LL;
    public final /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1227470i2z LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1223740hwy(Object obj, C1227470i2z c1227470i2z, InterfaceC1364105Vn<? super C1223740hwy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = obj;
        this.LLILLL = c1227470i2z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1223740hwy(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c1223680hws;
        Integer num;
        boolean zBooleanValue;
        C1C7U.LIZ("LiveInviteCTDSProtocol@84a8.onLoadMore$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c1223680hws = new C1223680hws(new Exception(e));
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            Object obj2 = this.LLILLJJLI;
            if (obj2 instanceof Integer) {
                num = (Integer) obj2;
            } else {
                num = null;
            }
            if (num != null) {
                C1227470i2z c1227470i2z = this.LLILLL;
                num.intValue();
                int iIntValue = num.intValue();
                this.LL = 1;
                obj = c1227470i2z.LJJJJIZL(iIntValue, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LiveInviteCTDSProtocol@84a8.onLoadMore$2");
                    return objLJFF;
                }
            } else {
                c1223680hws = new C1223680hws(new Exception("cursor not int"));
                C1C7U.LIZIZ("LiveInviteCTDSProtocol@84a8.onLoadMore$2");
                return c1223680hws;
            }
        }
        Pair pair = (Pair) obj;
        if (pair == null) {
            c1223680hws = new C1223680hws(new Exception("group chat df not downloaded"));
        } else {
            List list = (List) pair.getSecond();
            Boolean bool = ((GroupInviteListResponse) pair.getFirst()).hasMore;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            c1223680hws = new C1223660hwq(list, zBooleanValue, ((GroupInviteListResponse) pair.getFirst()).nextCursor);
        }
        C1C7U.LIZIZ("LiveInviteCTDSProtocol@84a8.onLoadMore$2");
        return c1223680hws;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AbstractC1223670hwr> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
