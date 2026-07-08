package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupInviteListResponse;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hww, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.newselector.template.publicgroup.PublicGroupInviteCTDSProtocol$onRefresh$2", f = "PublicGroupInviteCTDSProtocol.kt", l = {85}, m = "invokeSuspend")
public final class C1223720hww extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AbstractC1223670hwr>, Object> {
    public int LL;
    public final /* synthetic */ C1227480i30 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1223720hww(C1227480i30 c1227480i30, InterfaceC1364105Vn<? super C1223720hww> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1227480i30;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1223720hww(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c1223680hws;
        C1C7U.LIZ("PublicGroupInviteCTDSProtocol@2c81.onRefresh$2");
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
                C1227480i30 c1227480i30 = this.LLILLJJLI;
                this.LL = 1;
                obj = c1227480i30.LJJJJIZL(0, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PublicGroupInviteCTDSProtocol@2c81.onRefresh$2");
                    return objLJFF;
                }
            }
            Pair pair = (Pair) obj;
            List list = (List) pair.getSecond();
            Boolean bool = ((GroupInviteListResponse) pair.getFirst()).hasMore;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            c1223680hws = new C1223660hwq(list, zBooleanValue, ((GroupInviteListResponse) pair.getFirst()).nextCursor);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c1223680hws = new C1223680hws(e);
        }
        C1C7U.LIZIZ("PublicGroupInviteCTDSProtocol@2c81.onRefresh$2");
        return c1223680hws;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AbstractC1223670hwr> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
