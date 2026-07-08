package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.profile.business.ur.alias.UserAliasApi;
import com.ss.android.ugc.ur.alias.AliasListResponse;
import com.ss.android.ugc.ur.alias.UserAlias;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iSc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.alias.AliasServiceImpl$fullUpdateInWarmStart$1", f = "AliasServiceImpl.kt", l = {93}, m = "invokeSuspend")
public final class C1243360iSc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C1243360iSc(InterfaceC1364105Vn<? super C1243360iSc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1243360iSc c1243360iSc = new C1243360iSc(interfaceC1364105Vn);
        c1243360iSc.LLILLJJLI = obj;
        return c1243360iSc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        List<UserAlias> list;
        List<UserAlias> list2;
        C1C7U.LIZ("AliasServiceImpl@2268.fullUpdateInWarmStart$1");
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
                this.LL = 1;
                obj = ((UserAliasApi) C1243350iSb.LIZ.getValue()).fetchAliasList(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AliasServiceImpl@2268.fullUpdateInWarmStart$1");
                    return objLJFF;
                }
            }
            c098200Yq = (AliasListResponse) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        int size = 0;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            AliasListResponse aliasListResponse = (AliasListResponse) c098200Yq;
            if (aliasListResponse != null && (list2 = aliasListResponse.userAlias) != null) {
                C2286608xc.LJ(list2.size());
            }
            C1243370iSd.LIZ.getClass();
            C1243370iSd.LIZIZ(aliasListResponse, true);
            Pair[] pairArr = new Pair[2];
            pairArr[0] = new Pair("is_cold_start", CardStruct.IStatusCode.DEFAULT);
            if (aliasListResponse != null && (list = aliasListResponse.userAlias) != null) {
                size = list.size();
            }
            pairArr[1] = new Pair("count", String.valueOf(size));
            C20684815ws.LJIILLIIL("alias_full_update", C2097608Jq.LJIIIIZZ(pairArr));
        } else {
            C20684815ws.LJIILLIIL("alias_full_update", C2097608Jq.LJIIIIZZ(new Pair("is_cold_start", CardStruct.IStatusCode.DEFAULT), new Pair("count", CardStruct.IStatusCode.DEFAULT)));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AliasServiceImpl@2268.fullUpdateInWarmStart$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
