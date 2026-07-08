package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01cu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.share.StreakSharerFilterManager$getFeatureResultSyncWithTimeout$1", f = "StreakSharerFilterManager.kt", l = {103}, m = "invokeSuspend")
public final class C374601cu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Map<Long, ? extends Integer>>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ AnonymousClass0957<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C374601cu(long j, String str, InterfaceC1364105Vn interfaceC1364105Vn, AnonymousClass0957 anonymousClass0957) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = str;
        this.LLILZ = anonymousClass0957;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C374601cu(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn, this.LLILZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Map mapLJ;
        C1C7U.LIZ("StreakSharerFilterManager@bb26.getFeatureResultSyncWithTimeout$1");
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
            long j = this.LLILLJJLI;
            C374501ct c374501ct = new C374501ct(this.LLILZ, null);
            this.LL = 1;
            if (C099A.LIZIZ(j, c374501ct, this) == objLJFF) {
                C1C7U.LIZIZ("StreakSharerFilterManager@bb26.getFeatureResultSyncWithTimeout$1");
                return objLJFF;
            }
        }
        ConcurrentHashMap<Long, Integer> concurrentHashMap = C1582806Hq.LLILZ.get(this.LLILLL);
        if (concurrentHashMap == null || (mapLJ = C2097608Jq.LJIIZILJ(concurrentHashMap)) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        C1C7U.LIZIZ("StreakSharerFilterManager@bb26.getFeatureResultSyncWithTimeout$1");
        return mapLJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Map<Long, ? extends Integer>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
