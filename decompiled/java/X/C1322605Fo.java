package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Fo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.offlinemode.service.OfflineModeServiceImpl$getCachedAwemeListBatch$2", f = "OfflineModeServiceImpl.kt", l = {200}, m = "invokeSuspend")
public final class C1322605Fo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Aweme>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1322605Fo(int i, int i2, InterfaceC1364105Vn<? super C1322605Fo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = i;
        this.LLILZ = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1322605Fo c1322605Fo = new C1322605Fo(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1322605Fo.LLILLJJLI = obj;
        return c1322605Fo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        boolean z;
        C1C7U.LIZ("OfflineModeServiceImpl@a1dd.getCachedAwemeListBatch$2");
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
                String curSecUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurSecUserId();
                if (curSecUserId != null && curSecUserId.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    C1C7U.LIZIZ("OfflineModeServiceImpl@a1dd.getCachedAwemeListBatch$2");
                    return null;
                }
                int i2 = this.LLILLL;
                int i3 = this.LLILZ;
                C625530OgB c625530OgB = C625530OgB.LIZ;
                this.LL = 1;
                c625530OgB.getClass();
                obj = C625530OgB.LJIIJ(i2, i3);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("OfflineModeServiceImpl@a1dd.getCachedAwemeListBatch$2");
                    return objLJFF;
                }
            }
            c098200Yq = (List) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj2 = c098200Yq;
        }
        C1C7U.LIZIZ("OfflineModeServiceImpl@a1dd.getCachedAwemeListBatch$2");
        return obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Aweme>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
