package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.ur.alias.AliasListResponse;
import com.ss.android.ugc.ur.alias.IAliasService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01cb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.lego.AliasFetchRequestLegoTask$getAliasInfoAsync$aliasInfoDeferred$1", f = "AliasFetchRequestLegoTask.kt", l = {76}, m = "invokeSuspend")
public final class C372701cb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends AliasListResponse>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C372701cb(InterfaceC1364105Vn<? super C372701cb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C372701cb c372701cb = new C372701cb(interfaceC1364105Vn);
        c372701cb.LLILLJJLI = obj;
        return c372701cb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C1C7U.LIZ("AliasFetchRequestLegoTask@12a4.getAliasInfoAsync$aliasInfoDeferred$1");
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
                SystemClock.elapsedRealtime();
                IAliasService iAliasService = (IAliasService) ServiceManager.get().getService(IAliasService.class);
                this.LL = 1;
                obj = iAliasService.fetchAliasList(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AliasFetchRequestLegoTask@12a4.getAliasInfoAsync$aliasInfoDeferred$1");
                    return objLJFF;
                }
            }
            AliasListResponse aliasListResponse = (AliasListResponse) obj;
            aliasListResponse.checkValid();
            C189200o6.m2constructorimpl(aliasListResponse);
            obj2 = aliasListResponse;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj2 = c098200Yq;
        }
        SystemClock.elapsedRealtime();
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(obj2);
        C1C7U.LIZIZ("AliasFetchRequestLegoTask@12a4.getAliasInfoAsync$aliasInfoDeferred$1");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends AliasListResponse>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
