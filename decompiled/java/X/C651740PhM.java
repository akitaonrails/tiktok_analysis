package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.horizontal.ng.viewmodel.SearchAwemePoolViewModelNG;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0PhM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.horizontal.ng.viewmodel.SearchAwemePoolViewModelNG$onReceiveJsEvent$1", f = "SearchAwemePoolViewModelNG.kt", l = {}, m = "invokeSuspend")
public final class C651740PhM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C262100zr LL;
    public final /* synthetic */ SearchAwemePoolViewModelNG LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C651740PhM(C262100zr c262100zr, SearchAwemePoolViewModelNG searchAwemePoolViewModelNG, InterfaceC1364105Vn<? super C651740PhM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c262100zr;
        this.LLILLJJLI = searchAwemePoolViewModelNG;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C651740PhM(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        JSONObject jSONObjectLIZIZ;
        C1C7U.LIZ("SearchAwemePoolViewModelNG@4edd.onReceiveJsEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            InterfaceC1107590evd interfaceC1107590evd = this.LL.LIZIZ;
            String string = null;
            if (interfaceC1107590evd != null) {
                C1872780ypo.LIZ.getClass();
                jSONObjectLIZIZ = C1872780ypo.LIZIZ(interfaceC1107590evd);
            } else {
                jSONObjectLIZIZ = null;
            }
            C1227904rF c1227904rF = C1227904rF.LIZ;
            if (jSONObjectLIZIZ != null) {
                string = JSONObjectProtectorUtils.getString(jSONObjectLIZIZ, "awemes");
            }
            Type type = new TypeToken<List<? extends Aweme>>() { // from class: X.0PhR
            }.getType();
            c1227904rF.getClass();
            c098200Yq = (List) C1227904rF.LIZJ(string, type);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        SearchAwemePoolViewModelNG searchAwemePoolViewModelNG = this.LLILLJJLI;
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) == null) {
            searchAwemePoolViewModelNG.wQ2((List) c098200Yq);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchAwemePoolViewModelNG@4edd.onReceiveJsEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
