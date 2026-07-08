package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.story.experiment.feed.AvatarFetchStoryLoadingConfigData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01kE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.avatar.preload.StoryAvatarPreloadAnimator$start$2", f = "StoryAvatarPreloadAnimator.kt", l = {115}, m = "invokeSuspend")
public final class C420001kE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C20270314Td LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C420001kE(C20270314Td c20270314Td, InterfaceC1364105Vn<? super C420001kE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c20270314Td;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C420001kE c420001kE = new C420001kE(this.LLILLL, interfaceC1364105Vn);
        c420001kE.LLILLJJLI = obj;
        return c420001kE;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("StoryAvatarPreloadAnimator@3e2c.start$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL((InterfaceC497601wk) this.LLILLJJLI, null, null, new C419901kD(this.LLILLL, null), 3);
                long j = ((AvatarFetchStoryLoadingConfigData) C420101kF.LIZIZ.getValue()).timeout;
                C419801kC c419801kC = new C419801kC(anonymousClass0956LIZLLL, null);
                this.LL = 1;
                obj = C099A.LIZJ(j, c419801kC, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("StoryAvatarPreloadAnimator@3e2c.start$2");
                    return objLJFF;
                }
            }
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            C20270314Td c20270314Td = this.LLILLL;
            if (!c20270314Td.LJIIL) {
                c20270314Td.LJIILIIL = true;
                c20270314Td.LJFF.invoke(c20270314Td.LJIILJJIL, Boolean.valueOf(z));
            }
            this.LLILLL.LIZ(null);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("StoryAvatarPreloadAnimator@3e2c.start$2");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLL.LIZ(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
