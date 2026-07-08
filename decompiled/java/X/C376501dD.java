package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.model.MutualRelationListResponse;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01dD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.alias.AliasServiceImpl$getAliasMatchInfoBySearchKeyword$aliasMatchInfoDeferred$1", f = "AliasServiceImpl.kt", l = {154}, m = "invokeSuspend")
public final class C376501dD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C316550Caz>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C376501dD(Map<String, String> map, long j, long j2, InterfaceC1364105Vn<? super C376501dD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = map;
        this.LLILZ = j;
        this.LLILZIL = j2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C376501dD c376501dD = new C376501dD(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c376501dD.LLILLJJLI = obj;
        return c376501dD;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        C316550Caz c316550Caz;
        Object objLIZIZ = obj;
        C1C7U.LIZ("AliasServiceImpl@2268.getAliasMatchInfoBySearchKeyword$aliasMatchInfoDeferred$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZIZ);
            } else {
                C155000ia.LIZIZ(objLIZIZ);
                SystemClock.elapsedRealtime();
                Map<String, String> map = this.LLILLL;
                long j = this.LLILZ;
                long j2 = this.LLILZIL;
                C1243980iTc c1243980iTc = C1243980iTc.LIZIZ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (C123100dR.LIZ(entry.getValue())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                AbstractC19484711Kz<MutualRelationListResponse> abstractC19484711KzLIZ = c1243980iTc.LIZ(2, C13LP.LJJLIIIJ(C13LP.LLIIII(linkedHashMap.keySet()), ",", "", "", 0, null, null, 56), "", C2286608xc.LJFF(j), C2286608xc.LJFF(j2), "", "", "", "");
                this.LL = 1;
                objLIZIZ = C11UD.LIZIZ(abstractC19484711KzLIZ, this);
                if (objLIZIZ == objLJFF) {
                    C1C7U.LIZIZ("AliasServiceImpl@2268.getAliasMatchInfoBySearchKeyword$aliasMatchInfoDeferred$1");
                    return objLJFF;
                }
            }
            MutualRelationListResponse mutualRelationListResponse = (MutualRelationListResponse) objLIZIZ;
            mutualRelationListResponse.checkValid();
            C189200o6.m2constructorimpl(mutualRelationListResponse);
            obj2 = mutualRelationListResponse;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj2 = c098200Yq;
        }
        SystemClock.elapsedRealtime();
        ArrayList arrayList = null;
        if (C189200o6.m7isFailureimpl(obj2)) {
            obj3 = null;
        } else {
            obj3 = obj2;
        }
        MutualRelationListResponse mutualRelationListResponse2 = (MutualRelationListResponse) obj3;
        if (C189200o6.m8isSuccessimpl(obj2) && mutualRelationListResponse2 != null) {
            List listLLIILII = C13LP.LLIILII(mutualRelationListResponse2.getUserList(), mutualRelationListResponse2.getMentionBlockTypes());
            Map<String, String> map2 = this.LLILLL;
            ArrayList arrayList2 = new ArrayList();
            for (Pair pair : (ArrayList) listLLIILII) {
                User user = (User) pair.getFirst();
                long jLongValue = ((Number) pair.getSecond()).longValue();
                String str = map2.get(user.getUid());
                if (str != null) {
                    c316550Caz = new C316550Caz(jLongValue, user, str);
                } else {
                    c316550Caz = null;
                }
                if (c316550Caz != null) {
                    arrayList2.add(c316550Caz);
                }
            }
            arrayList = arrayList2;
        }
        C1C7U.LIZIZ("AliasServiceImpl@2268.getAliasMatchInfoBySearchKeyword$aliasMatchInfoDeferred$1");
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C316550Caz>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
