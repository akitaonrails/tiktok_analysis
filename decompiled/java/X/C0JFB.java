package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JFB, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.avatar.repo.SocPubStatusCache$cleanIfNeed$1", f = "SocialPubStatusRepo.kt", l = {}, m = "invokeSuspend")
public final class C0JFB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1605720rt4 LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JFB(C1605720rt4 c1605720rt4, String str, InterfaceC1364105Vn<? super C0JFB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1605720rt4;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0JFB c0jfb = new C0JFB(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c0jfb.LL = obj;
        return c0jfb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        HashSet<String> hashSet;
        Integer numLJ;
        C1C7U.LIZ("SocPubStatusCache@d9ef.cleanIfNeed$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1605720rt4 c1605720rt4 = this.LLILLJJLI;
        String str = this.LLILLL;
        try {
            hashSet = new HashSet();
            for (Map.Entry<String, MutableLiveData<C727780Sgi>> entry : c1605720rt4.LIZIZ().entrySet()) {
                if (!entry.getValue().hasObservers()) {
                    hashSet.add(entry.getKey());
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (hashSet.isEmpty()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SocPubStatusCache@d9ef.cleanIfNeed$1");
            return unit;
        }
        int size = c1605720rt4.LIZIZ().size() - hashSet.size();
        int i = 0;
        for (String str2 : hashSet) {
            c1605720rt4.LIZIZ().remove(str2);
            C727780Sgi c727780Sgi = c1605720rt4.LIZJ().get(str2);
            if (c727780Sgi != null && (numLJ = C2286608xc.LJ(c727780Sgi.LIZ)) != null && (numLJ.intValue() == 0 || numLJ.intValue() == -1)) {
                c1605720rt4.LIZJ().remove(str2);
                i++;
            }
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(size, "live_data_status_size_after");
        c2344009Gk.LIZJ(hashSet.size(), "live_data_status_size_cleaned");
        c2344009Gk.LIZJ(c1605720rt4.LIZJ().size(), "user_status_size_after");
        c2344009Gk.LIZJ(i, "user_status_size_cleaned");
        c2344009Gk.LJIIIIZZ("clean_source", str);
        C20684815ws.LJIILLIIL("story_status_cache_clear", c2344009Gk.LIZ);
        C189200o6.m2constructorimpl(Unit.LIZ);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SocPubStatusCache@d9ef.cleanIfNeed$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
