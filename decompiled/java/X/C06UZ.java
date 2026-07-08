package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.story.userstory.mine.MineStoryFullSnapshot;
import com.ss.android.ugc.aweme.story.userstory.mine.MineStoryLightSnapshot;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06UZ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.userstory.mine.MineStoryDiskCache$scheduleFlush$job$1", f = "MineStoryDiskCache.kt", l = {286}, m = "invokeSuspend")
public final class C06UZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06UZ(long j, InterfaceC1364105Vn<? super C06UZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C06UZ c06uz = new C06UZ(this.LLILLL, interfaceC1364105Vn);
        c06uz.LLILLJJLI = obj;
        return c06uz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Object c098200Yq2;
        UserStory userStory;
        List<Aweme> stories;
        C1C7U.LIZ("MineStoryDiskCache@d84f.scheduleFlush$job$1");
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
            long j = this.LLILLL;
            if (j > 0) {
                this.LLILLJJLI = obj2;
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                    C1C7U.LIZIZ("MineStoryDiskCache@d84f.scheduleFlush$job$1");
                    return objLJFF;
                }
            }
        }
        MineStoryLightSnapshot andSet = C06UY.LJIIIZ.getAndSet(null);
        MineStoryFullSnapshot andSet2 = C06UY.LJIIJ.getAndSet(null);
        C013C c013c = new C013C();
        if (andSet != null) {
            try {
                C06UY.LIZ.getClass();
                ((Keva) C06UY.LIZIZ.getValue()).storeString(andSet.uid, ((Gson) C06UY.LIZLLL.getValue()).LJIILL(andSet));
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m8isSuccessimpl(c098200Yq)) {
                c013c.element = true;
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
        if (andSet2 != null) {
            Aweme aweme = andSet2.aweme;
            if (aweme != null && (userStory = aweme.getUserStory()) != null && (stories = userStory.getStories()) != null) {
                stories.size();
            }
            try {
                C06UY.LIZ.getClass();
                ((Keva) C06UY.LIZJ.getValue()).storeString(andSet2.uid, ((Gson) C06UY.LIZLLL.getValue()).LJIILL(andSet2));
                c098200Yq2 = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m8isSuccessimpl(c098200Yq2)) {
                c013c.element = true;
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq2);
        }
        if (c013c.element) {
            C06UY.LJII.set(System.currentTimeMillis());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MineStoryDiskCache@d84f.scheduleFlush$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
