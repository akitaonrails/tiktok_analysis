package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.dependency.ad.AdDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nef, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.anchor.manager.AnchorIconManager$prefetchIcon$1", f = "AnchorIconManager.kt", l = {BaseNotice.CREATOR}, m = "invokeSuspend")
public final class C599110Nef extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<Aweme> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C599110Nef(List<? extends Aweme> list, InterfaceC1364105Vn<? super C599110Nef> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C599110Nef c599110Nef = new C599110Nef(this.LLILLL, interfaceC1364105Vn);
        c599110Nef.LLILLJJLI = obj;
        return c599110Nef;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        List list;
        AnonymousClass0317 anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        C1C7U.LIZ("AnchorIconManager@d83f.prefetchIcon$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            try {
                List listLLD = C13LP.LLD(10, this.LLILLL);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listLLD) {
                    Aweme aweme = (Aweme) obj2;
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = AdDependencyService.createIAdDependencyServicebyMonsterPlugin(false);
                        if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String name2 = IAdDependencyService.class.getName();
                        if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                            name = anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin.getClass().getName();
                        } else {
                            name = null;
                        }
                        C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAdDependencyService.class);
                    }
                    if (((IAdDependencyService) anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin).isEcomVideo(aweme)) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Aweme aweme2 = (Aweme) it2.next();
                        C1735040vFe.LIZ.getClass();
                        c098200Yq = C1735040vFe.LIZIZ(aweme2).iconUrls;
                        if (c098200Yq != null) {
                            break;
                        }
                    } else {
                        c098200Yq = null;
                        break;
                    }
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            List list2 = (List) c098200Yq;
            if (list2 != null) {
                if (!list2.isEmpty()) {
                    list = list2;
                } else {
                    list = null;
                }
                if (list != null) {
                    C1DFB c1dfb = C0PEM.LIZJ;
                    C340970DYh c340970DYh = new C340970DYh(list, list2, null);
                    this.LL = 1;
                    if (C23250099c.LJI(this, c1dfb, c340970DYh) == objLJFF) {
                        C1C7U.LIZIZ("AnchorIconManager@d83f.prefetchIcon$1");
                        return objLJFF;
                    }
                }
            }
        }
        C1735040vFe.LIZJ = true;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AnchorIconManager@d83f.prefetchIcon$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
