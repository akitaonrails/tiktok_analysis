package X;

import com.ss.android.ugc.aweme.story.StoryDelayPublishData;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0nPx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.bytedance.tiktok.homepage.mainpagefragment.assem.SocialPublishLandingAssem$registerFeedLifecycleSignalIfNeeded$2$1", f = "SocialPublishLandingAssem.kt", l = {338}, m = "invokeSuspend")
public final class C1433910nPx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AtomicBoolean LLILLJJLI;
    public final /* synthetic */ C259800zU<AbstractC813200VvC> LLILLL;
    public final /* synthetic */ InterfaceC1433950nQ1 LLILZ;
    public final /* synthetic */ C19EG LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1433910nPx(AtomicBoolean atomicBoolean, C259800zU<AbstractC813200VvC> c259800zU, InterfaceC1433950nQ1 interfaceC1433950nQ1, C19EG c19eg, InterfaceC1364105Vn<? super C1433910nPx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = atomicBoolean;
        this.LLILLL = c259800zU;
        this.LLILZ = interfaceC1433950nQ1;
        this.LLILZIL = c19eg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1433910nPx(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialPublishLandingAssem@5578.registerFeedLifecycleSignalIfNeeded$2$1");
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
            StoryDelayPublishData storyDelayPublishData = C571860Mbo.LIZ;
            long j = C571860Mbo.LIZ.delayAfterPublishActivityDestoryMs;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("SocialPublishLandingAssem@5578.registerFeedLifecycleSignalIfNeeded$2$1");
                return objLJFF;
            }
        }
        if (this.LLILLJJLI.compareAndSet(false, true)) {
            AbstractC813200VvC abstractC813200VvC = this.LLILLL.element;
            if (abstractC813200VvC != null) {
                this.LLILZIL.getSupportFragmentManager().LLIILZL(abstractC813200VvC);
            }
            this.LLILZ.LIZ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialPublishLandingAssem@5578.registerFeedLifecycleSignalIfNeeded$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
