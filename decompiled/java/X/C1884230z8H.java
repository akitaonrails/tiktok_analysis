package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.DetailFeedService;
import com.ss.android.ugc.aweme.fe.method.feeds.pojo.FeedsResponse;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z8H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.pns.activitycenter.acfeeds.ACFeedsBridgeModel$requestEntireData$2", f = "ACFeedsBridgeModel.kt", l = {282}, m = "invokeSuspend")
public final class C1884230z8H extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1884270z8L>, Object> {
    public C1884270z8L LL;
    public int LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ C1884220z8G LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1884230z8H(List<String> list, C1884220z8G c1884220z8G, Function0<Unit> function0, String str, String str2, boolean z, InterfaceC1364105Vn<? super C1884230z8H> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = c1884220z8G;
        this.LLILZIL = function0;
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1884230z8H(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        List list;
        int size;
        C1884270z8L c1884270z8L;
        Object next;
        boolean z;
        boolean z2;
        C1C7U.LIZ("ACFeedsBridgeModel@97aa.requestEntireData$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c1884270z8L = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (!this.LLILLL.isEmpty()) {
                list = ((DetailFeedService) ServiceManager.get().getService(DetailFeedService.class)).LJIILIIL(42, this.LLILLL.toString()).items;
            } else {
                list = C13BV.INSTANCE;
            }
            if (list != null) {
                size = list.size();
            } else {
                size = 0;
            }
            if (size != this.LLILLL.size()) {
                EnumC1884170z8B enumC1884170z8B = EnumC1884170z8B.AWAEME_LIST_IS_NOT_COMPLETED;
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("ids", this.LLILLL.toString());
                jSONObject.putOpt("aweme_list", list.toString());
                C1885840zAs.LIZ(enumC1884170z8B, "Aweme list size is not equal to ids size", jSONObject);
            }
            C1884220z8G c1884220z8G = this.LLILZ;
            String str = this.LLILZLL;
            String str2 = this.LLIZ;
            boolean z3 = this.LLIZLLLIL;
            synchronized (c1884220z8G) {
                try {
                    if (Intrinsics.LJFF(str, c1884220z8G.LLILZIL)) {
                        if (c1884220z8G.getData() != null) {
                            T t = c1884220z8G.mData;
                            FeedsResponse feedsResponse = (FeedsResponse) t;
                            if (z3) {
                                z = true;
                            } else {
                                z = false;
                            }
                            feedsResponse.hasMore = z;
                            ((FeedsResponse) t).list.addAll(list);
                            if (!z3) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c1884220z8G.mIsNewDataEmpty = z2;
                        }
                        c1884220z8G.mIsLoading = false;
                        c1884220z8G.LLILZIL = str2;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            Function0<Unit> function0 = this.LLILZIL;
            if (function0 != null) {
                function0.invoke();
            }
            C1884220z8G c1884220z8G2 = this.LLILZ;
            Iterator it2 = ((ArrayList) c1884220z8G2.LLILZLL).iterator();
            while (true) {
                c1884270z8L = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(((C1884270z8L) next).LIZ, c1884220z8G2.LLILZIL)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1884270z8L c1884270z8L2 = (C1884270z8L) next;
            if (c1884270z8L2 != null) {
                C1884220z8G c1884220z8G3 = this.LLILZ;
                List<String> list2 = c1884270z8L2.LIZLLL;
                boolean z4 = c1884270z8L2.LIZJ;
                String str3 = c1884270z8L2.LIZIZ;
                String str4 = c1884270z8L2.LIZ;
                AwS546S0100000_2 awS546S0100000_2 = c1884220z8G3.LLJI;
                this.LL = c1884270z8L2;
                this.LLILLJJLI = 1;
                if (c1884220z8G3.LJIILJJIL(list2, z4, str3, str4, awS546S0100000_2, this) == objLJFF) {
                    C1C7U.LIZIZ("ACFeedsBridgeModel@97aa.requestEntireData$2");
                    return objLJFF;
                }
                c1884270z8L = c1884270z8L2;
            }
        }
        C1C7U.LIZIZ("ACFeedsBridgeModel@97aa.requestEntireData$2");
        return c1884270z8L;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1884270z8L> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
