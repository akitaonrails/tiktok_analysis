package X;

import com.ss.android.ugc.aweme.story.StoryDelayPublishData;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0nPw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.bytedance.tiktok.homepage.mainpagefragment.assem.SocialPublishLandingAssem$registerFeedLifecycleSignalIfNeeded$1$onFragmentResumed$2", f = "SocialPublishLandingAssem.kt", l = {323}, m = "invokeSuspend")
public final class C1433900nPw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AtomicBoolean LLILLJJLI;
    public final /* synthetic */ C259800zU<InterfaceC420801kM> LLILLL;
    public final /* synthetic */ InterfaceC1433950nQ1 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1433900nPw(AtomicBoolean atomicBoolean, C259800zU<InterfaceC420801kM> c259800zU, InterfaceC1433950nQ1 interfaceC1433950nQ1, InterfaceC1364105Vn<? super C1433900nPw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = atomicBoolean;
        this.LLILLL = c259800zU;
        this.LLILZ = interfaceC1433950nQ1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1433900nPw(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialPublishLandingAssem@5578.registerFeedLifecycleSignalIfNeeded$1$onFragmentResumed$2");
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
            long j = C571860Mbo.LIZ.delayAfterResumePublishMs;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("SocialPublishLandingAssem@5578.registerFeedLifecycleSignalIfNeeded$1$onFragmentResumed$2");
                return objLJFF;
            }
        }
        if (this.LLILLJJLI.compareAndSet(false, true)) {
            InterfaceC420801kM interfaceC420801kM = this.LLILLL.element;
            if (interfaceC420801kM != null) {
                interfaceC420801kM.dispose();
            }
            this.LLILZ.LIZ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialPublishLandingAssem@5578.registerFeedLifecycleSignalIfNeeded$1$onFragmentResumed$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
