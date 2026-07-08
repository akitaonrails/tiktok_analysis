package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01cx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.share.StreakSharerFilterManager$getUidListFeatureResultSyncWithTimeout$1", f = "StreakSharerFilterManager.kt", l = {130}, m = "invokeSuspend")
public final class C374901cx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Map<Long, ? extends Integer>>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ List<Long> LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C374901cx(long j, String str, boolean z, List<Long> list, String str2, InterfaceC1364105Vn<? super C374901cx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = str;
        this.LLILZ = z;
        this.LLILZIL = list;
        this.LLILZLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C374901cx(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJ;
        C1C7U.LIZ("StreakSharerFilterManager@bb26.getUidListFeatureResultSyncWithTimeout$1");
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
            C375001cy c375001cy = new C375001cy(this.LLILZLL, this.LLILZIL, null);
            this.LL = 1;
            if (C099A.LIZIZ(j, c375001cy, this) == objLJFF) {
                C1C7U.LIZIZ("StreakSharerFilterManager@bb26.getUidListFeatureResultSyncWithTimeout$1");
                return objLJFF;
            }
        }
        C1582806Hq c1582806Hq = C1582806Hq.LLILLJJLI;
        String str = this.LLILLL;
        long j2 = this.LLILLJJLI;
        boolean z = this.LLILZ;
        c1582806Hq.getClass();
        String strLJ = C1582806Hq.LJ(str, z);
        try {
            objLJ = C23250099c.LJ(C23271099x.INSTANCE, new C374601cu(j2, strLJ, null, C1582806Hq.LLILZLL.get(strLJ)));
        } catch (C094W e) {
            TryCatchGuardChecker.doCheck(e);
            boolean z2 = C1590906Kt.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("StreakSharerFilterManager, getFeatureResultSyncWithTimeout timeout for ");
            sbLIZ.append(strLJ);
            C1590906Kt.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            ConcurrentHashMap<Long, Integer> concurrentHashMap = C1582806Hq.LLILZ.get(strLJ);
            if (concurrentHashMap == null || (objLJ = C2097608Jq.LJIIZILJ(concurrentHashMap)) == null) {
                objLJ = C2097608Jq.LJ();
            }
        }
        C1C7U.LIZIZ("StreakSharerFilterManager@bb26.getUidListFeatureResultSyncWithTimeout$1");
        return objLJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Map<Long, ? extends Integer>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
