package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.vibefeed.model.VibeConfigResponse;
import com.ss.android.ugc.aweme.vibefeed.network.IVibeApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Om3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.vibefeed.feed.preload.VibeConfigPreload$preload$1", f = "VibeConfigPreload.kt", l = {41}, m = "invokeSuspend")
public final class C629170Om3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super VibeConfigResponse>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Function1<Class<IVibeApi>, IVibeApi> LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C629170Om3(int i, String str, String str2, String str3, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = function1;
        this.LLILZLL = str3;
        this.LLIZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        String str = this.LLILLL;
        String str2 = this.LLILZ;
        Function1<Class<IVibeApi>, IVibeApi> function1 = this.LLILZIL;
        C629170Om3 c629170Om3 = new C629170Om3(this.LLIZ, str, str2, this.LLILZLL, interfaceC1364105Vn, function1);
        c629170Om3.LLILLJJLI = obj;
        return c629170Om3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        boolean z;
        C1C7U.LIZ("VibeConfigPreload@2951.preload$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Object obj2 = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                boolean z2 = false;
                if (this.LLILLL.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (this.LLILZ.length() == 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        String str = this.LLILZ;
                        Function1<Class<IVibeApi>, IVibeApi> function1 = this.LLILZIL;
                        String str2 = this.LLILLL;
                        String str3 = this.LLILZLL;
                        int i2 = this.LLIZ;
                        String strLJII = C1575440r6E.LJII(str);
                        IVibeApi iVibeApiInvoke = function1.invoke(IVibeApi.class);
                        this.LL = 1;
                        obj = iVibeApiInvoke.getVibeConfig(str2, str3, i2, strLJII, this);
                        if (obj == objLJFF) {
                            C1C7U.LIZIZ("VibeConfigPreload@2951.preload$1");
                            return objLJFF;
                        }
                    }
                }
                C1C7U.LIZIZ("VibeConfigPreload@2951.preload$1");
                return null;
            }
            c098200Yq = (VibeConfigResponse) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj2 = c098200Yq;
        }
        C1C7U.LIZIZ("VibeConfigPreload@2951.preload$1");
        return obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super VibeConfigResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
