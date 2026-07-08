package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sdk.resourcemanage.DMResourceManagementSchemaInterceptor;
import com.ss.android.ugc.aweme.im.service.resourcemanage.IDMResourceManagementService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.169Q, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C169Q implements IDMResourceManagementService, InterfaceC586170Myt, C0Z7L {
    public static final C169Q LLILLJJLI;
    public static final ConcurrentHashMap<String, ConcurrentHashMap<C169Z, C05E5>> LLILLL;
    public static final C01GW LLILZ;
    public static final C01GW LLILZIL;
    public static final C01GW LLILZLL;
    public static final C01GW LLIZ;
    public static final C557050Lt1 LLIZLLLIL;
    public final /* synthetic */ C0Z81 LL = C0Z81.LL;

    @Override // X.C0Z7L
    public final void LIZ(EnumC894670Z7x enumC894670Z7x, String str, String str2) {
        this.LL.LIZ(enumC894670Z7x, str, str2);
    }

    @Override // X.C0Z7L
    public final void LIZIZ(EnumC894670Z7x enumC894670Z7x, String str) {
        this.LL.LIZIZ(enumC894670Z7x, str);
    }

    @Override // X.C0Z7L
    public final void LJFF(EnumC894670Z7x enumC894670Z7x, String str) {
        this.LL.LJFF(enumC894670Z7x, str);
    }

    @Override // X.C0Z7L
    public final void LJI(String str, boolean z) {
        this.LL.LJI(str, z);
    }

    @Override // X.C0Z7L
    public final void LJIIIZ(String str) {
        this.LL.LJIIIZ(str);
    }

    static {
        C169Q c169q = new C169Q();
        LLILLJJLI = c169q;
        LLILLL = new ConcurrentHashMap<>();
        LLILZ = C452501pT.LIZIZ(new C0PEX());
        LLILZIL = C452501pT.LIZIZ(new C169X());
        LLILZLL = C452501pT.LIZIZ(new C20630915oB());
        LLIZ = C452501pT.LIZIZ(new C20631015oC());
        LLIZLLLIL = new C557050Lt1(false);
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIILL(c169q);
    }

    public static boolean LJIIL() {
        C0I0B c0i0b = C0I0B.LJFF;
        c0i0b.LIZJ();
        if (C894660Z7w.LIZJ()) {
            return true;
        }
        c0i0b.LIZJ();
        if (C894660Z7w.LJ()) {
            return true;
        }
        c0i0b.LIZJ();
        return Intrinsics.LJFF(C894660Z7w.LIZIZ(), "local_test");
    }

    @Override // com.ss.android.ugc.aweme.im.service.resourcemanage.IDMResourceManagementService
    public final void LIZJ() throws Exception {
        if (C287670BPh.LIZ()) {
            LJIIIIZZ("leave_chat_page", C2097608Jq.LJ());
            LJIIIIZZ("leave_new_page", C2097608Jq.LJ());
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.resourcemanage.IDMResourceManagementService
    public final boolean LIZLLL() {
        return C300770Bqd.LIZ() && C287670BPh.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.service.resourcemanage.IDMResourceManagementService
    public final void LJII() throws Exception {
        if (C287670BPh.LIZ()) {
            LJIIIIZZ("enter_chat_page", C2097608Jq.LJ());
            LJIIIIZZ("dm", C2097608Jq.LJ());
            LJIIIIZZ("open_new_page", C2097608Jq.LJ());
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.resourcemanage.IDMResourceManagementService
    public final DMResourceManagementSchemaInterceptor LJIIJ() {
        if (C287670BPh.LIZ()) {
            return new DMResourceManagementSchemaInterceptor();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.service.resourcemanage.IDMResourceManagementService
    public final void LJ(RecyclerView recyclerView) {
        if (C207292169q.LIZ() > 0 && C287670BPh.LIZ()) {
            recyclerView.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.168q
                @Override // X.AbstractC1585810rMx
                public final void LJJIIJ(RecyclerView recyclerView2, int i) {
                    if (i == 0) {
                        ((IDMResourceManagementService) ServiceManager.get().getService(IDMResourceManagementService.class)).LJIIIIZZ("scroll_end", C2097608Jq.LJ());
                    } else {
                        ((IDMResourceManagementService) ServiceManager.get().getService(IDMResourceManagementService.class)).LJIIIIZZ("scroll_start", C2097608Jq.LJ());
                    }
                }
            });
        }
    }

    public static void LJIIJJI(String str, C05E5 c05e5) {
        ConcurrentHashMap<C169Z, C05E5> concurrentHashMapPutIfAbsent;
        if (!C287670BPh.LIZ()) {
            return;
        }
        ConcurrentHashMap<String, ConcurrentHashMap<C169Z, C05E5>> concurrentHashMap = LLILLL;
        ConcurrentHashMap<C169Z, C05E5> concurrentHashMap2 = concurrentHashMap.get(str);
        if (concurrentHashMap2 == null && (concurrentHashMapPutIfAbsent = concurrentHashMap.putIfAbsent(str, (concurrentHashMap2 = new ConcurrentHashMap<>()))) != null) {
            concurrentHashMap2 = concurrentHashMapPutIfAbsent;
        }
        concurrentHashMap2.put(c05e5.LIZ, c05e5);
    }

    @Override // com.ss.android.ugc.aweme.im.service.resourcemanage.IDMResourceManagementService
    public final void LJIIIIZZ(String str, Map<String, ? extends Object> map) throws Exception {
        Object value;
        if (!C287670BPh.LIZ()) {
            return;
        }
        if (LLIZLLLIL.LIZ(false, true)) {
            Iterator it2 = ((List) LLILZIL.getValue()).iterator();
            while (it2.hasNext()) {
                try {
                    ((C169R) it2.next()).LIZJ();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (LJIIL()) {
                        throw e;
                    }
                }
            }
        }
        ConcurrentHashMap<C169Z, C05E5> concurrentHashMap = LLILLL.get(str);
        if (concurrentHashMap == null) {
            return;
        }
        Iterator<Map.Entry<C169Z, C05E5>> it3 = concurrentHashMap.entrySet().iterator();
        while (it3.hasNext()) {
            C05E5 value2 = it3.next().getValue();
            if (value2.LIZIZ) {
                LLILLJJLI.getClass();
                value = LLILZLL.getValue();
            } else {
                LLILLJJLI.getClass();
                value = LLIZ.getValue();
            }
            C23250099c.LIZLLL(C2296808zG.LIZ((CoroutineContext) value), null, null, new C05E4(value2, map, null), 3);
        }
    }

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) throws Exception {
        if (!C287670BPh.LIZ()) {
            return;
        }
        try {
            C0Z81.LL.onAccountResult(i, z, 0, user);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (user != null && user.getUid() != null) {
            for (C169R c169r : (List) LLILZIL.getValue()) {
                try {
                    c169r.LIZIZ();
                    c169r.LIZ();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (LJIIL()) {
                        throw e;
                    }
                }
            }
        }
    }
}
