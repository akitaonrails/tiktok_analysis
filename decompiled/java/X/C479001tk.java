package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01tk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.share.StreakSharerFilterManager$batchQueryFeatureRequest$deferred$1", f = "StreakSharerFilterManager.kt", l = {175}, m = "invokeSuspend")
public final class C479001tk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ List<Long> LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C479001tk(String str, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = list;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C479001tk(this.LLILZIL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Iterator it2;
        C1C7U.LIZ("StreakSharerFilterManager@bb26.batchQueryFeatureRequest$deferred$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        try {
            if (i != 0) {
                if (i == 1) {
                    it2 = (Iterator) this.LLILLJJLI;
                    str = (String) this.LL;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                List listLJJJIL = C13LP.LJJJIL(this.LLILZ, C06FV.LIZ().filterListMaxCount);
                str = this.LLILZIL;
                it2 = listLJJJIL.iterator();
            }
            while (it2.hasNext()) {
                List<Long> list = (List) it2.next();
                C1582806Hq c1582806Hq = C1582806Hq.LLILLJJLI;
                this.LL = str;
                this.LLILLJJLI = it2;
                this.LLILLL = 1;
                if (c1582806Hq.LJFF(str, list, this) == objLJFF) {
                    C1C7U.LIZIZ("StreakSharerFilterManager@bb26.batchQueryFeatureRequest$deferred$1");
                    return objLJFF;
                }
            }
            C1582806Hq.LLILZLL.remove(this.LLILZIL);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("StreakSharerFilterManager@bb26.batchQueryFeatureRequest$deferred$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1582806Hq.LLILZLL.remove(this.LLILZIL);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
