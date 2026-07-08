package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.story.inbox.StoryInsertCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01sc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.guideuploadcard.ResourcesPreloadStat$preloadCoversAndAvatar$2", f = "ResourcesPreloadStat.kt", l = {77}, m = "invokeSuspend")
public final class C472001sc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0HBZ LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0HBZ LLILLL;
    public final /* synthetic */ StoryInsertCard LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C472001sc(C0HBZ c0hbz, StoryInsertCard storyInsertCard, InterfaceC1364105Vn<? super C472001sc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0hbz;
        this.LLILZ = storyInsertCard;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C472001sc(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0HBZ c0hbz;
        C1C7U.LIZ("ResourcesPreloadStat@d1f2.preloadCoversAndAvatar$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            if (i != 0) {
                if (i == 1) {
                    c0hbz = this.LL;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                c0hbz = this.LLILLL;
                UrlModel urlModel = (UrlModel) C13LP.LJJLIIIJJI(this.LLILZ.coverUrls);
                this.LL = c0hbz;
                this.LLILLJJLI = 1;
                c0hbz.getClass();
                obj = C0HBZ.LIZ(urlModel, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ResourcesPreloadStat@d1f2.preloadCoversAndAvatar$2");
                    return objLJFF;
                }
            }
            c0hbz.LIZLLL = ((Number) obj).intValue();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLL.LIZLLL = 1;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ResourcesPreloadStat@d1f2.preloadCoversAndAvatar$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
