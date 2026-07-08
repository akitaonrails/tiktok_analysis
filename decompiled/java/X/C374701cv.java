package X;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01cv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.share.StreakSharerFilterManager$getConversationFeatureResultSyncWithTimeout$1", f = "StreakSharerFilterManager.kt", l = {157}, m = "invokeSuspend")
public final class C374701cv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Map<String, ? extends Integer>>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ List<String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C374701cv(long j, String str, List<String> list, InterfaceC1364105Vn<? super C374701cv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = str;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C374701cv(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Map mapLJ;
        C1C7U.LIZ("StreakSharerFilterManager@bb26.getConversationFeatureResultSyncWithTimeout$1");
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
            C374801cw c374801cw = new C374801cw(this.LLILLL, this.LLILZ, null);
            this.LL = 1;
            if (C099A.LIZIZ(j, c374801cw, this) == objLJFF) {
                C1C7U.LIZIZ("StreakSharerFilterManager@bb26.getConversationFeatureResultSyncWithTimeout$1");
                return objLJFF;
            }
        }
        ConcurrentHashMap<String, Integer> concurrentHashMap = C1582806Hq.LLILZIL.get(this.LLILLL);
        if (concurrentHashMap == null || (mapLJ = C2097608Jq.LJIIZILJ(concurrentHashMap)) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        C1C7U.LIZIZ("StreakSharerFilterManager@bb26.getConversationFeatureResultSyncWithTimeout$1");
        return mapLJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Map<String, ? extends Integer>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
