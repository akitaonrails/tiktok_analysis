package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.common.monitor.whitescreen.config.SearchBlankScreenDetectionConfig;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09pn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.common.monitor.whitescreen.SearchBlankScreenDetectionUtils$tryDetect$1", f = "SearchBlankScreenDetectionUtils.kt", l = {98, 105}, m = "invokeSuspend")
public final class C2492909pn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C2493109pp LLILLJJLI;
    public final /* synthetic */ Function0<Boolean> LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ SearchBlankScreenDetectionConfig.Config LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2492909pn(C2493109pp c2493109pp, Function0<Boolean> function0, View view, SearchBlankScreenDetectionConfig.Config config, InterfaceC1364105Vn<? super C2492909pn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2493109pp;
        this.LLILLL = function0;
        this.LLILZ = view;
        this.LLILZIL = config;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2492909pn(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("SearchBlankScreenDetectionUtils@122d.tryDetect$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SearchBlankScreenDetectionUtils@122d.tryDetect$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            long j = ((long) this.LLILLJJLI.LIZ) * 1000;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("SearchBlankScreenDetectionUtils@122d.tryDetect$1");
                return objLJFF;
            }
        }
        if (!this.LLILLL.invoke().booleanValue()) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("SearchBlankScreenDetectionUtils@122d.tryDetect$1");
            return unit2;
        }
        C2493209pq c2493209pq = C2493209pq.LIZ;
        View view = this.LLILZ;
        c2493209pq.getClass();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            C842150X1x.LIZIZ(new Canvas(bitmapCreateBitmap), view);
            c098200Yq = new Pair(bitmapCreateBitmap, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Pair pair = (Pair) c098200Yq;
        if (pair == null) {
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("SearchBlankScreenDetectionUtils@122d.tryDetect$1");
            return unit3;
        }
        Bitmap bitmap = (Bitmap) pair.getFirst();
        long jLongValue = ((Number) pair.getSecond()).longValue();
        C1DFB c1dfb = C0PEM.LIZJ;
        C2493009po c2493009po = new C2493009po(bitmap, this.LLILLJJLI, jLongValue, this.LLILZIL, null);
        this.LL = 2;
        if (C23250099c.LJI(this, c1dfb, c2493009po) == objLJFF) {
            C1C7U.LIZIZ("SearchBlankScreenDetectionUtils@122d.tryDetect$1");
            return objLJFF;
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("SearchBlankScreenDetectionUtils@122d.tryDetect$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
