package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.059r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.jsb.LsReviewUploadManager$submitReview$1", f = "LsReviewUploadManager.kt", l = {193}, m = "invokeSuspend")
public final class C13073059r extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Map<String, Object> LLILZ;
    public final /* synthetic */ List<String> LLILZIL;
    public final /* synthetic */ Function1<C07ZV, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C13073059r(String str, Map<String, ? extends Object> map, List<String> list, Function1<? super C07ZV, Unit> function1, InterfaceC1364105Vn<? super C13073059r> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = map;
        this.LLILZIL = list;
        this.LLILZLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C13073059r c13073059r = new C13073059r(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c13073059r.LLILLJJLI = obj;
        return c13073059r;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("LsReviewUploadManager@7edb.submitReview$1");
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
            Object obj2 = this.LLILLJJLI;
            C09WT c09wt = C09WT.LIZ;
            String str = this.LLILLL;
            Map<String, Object> map = this.LLILZ;
            List<String> list = this.LLILZIL;
            this.LLILLJJLI = obj2;
            this.LL = 1;
            obj = c09wt.LJFF(str, list, map, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LsReviewUploadManager@7edb.submitReview$1");
                return objLJFF;
            }
        }
        Function1<C07ZV, Unit> function1 = this.LLILZLL;
        if (function1 == null) {
            unit = null;
        } else {
            try {
                function1.invoke((C07ZV) obj);
                unit = Unit.LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        C189200o6.m2constructorimpl(unit);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LsReviewUploadManager@7edb.submitReview$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
