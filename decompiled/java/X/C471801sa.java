package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01sa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.guideuploadcard.ResourcesPreloadStat$preloadCoversAndAvatar$1", f = "ResourcesPreloadStat.kt", l = {65}, m = "invokeSuspend")
public final class C471801sa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0HBZ LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0HBZ LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C471801sa(C0HBZ c0hbz, InterfaceC1364105Vn<? super C471801sa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0hbz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C471801sa(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0HBZ c0hbz;
        C1C7U.LIZ("ResourcesPreloadStat@d1f2.preloadCoversAndAvatar$1");
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
                UrlModel avatarLarger = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getAvatarLarger();
                this.LL = c0hbz;
                this.LLILLJJLI = 1;
                c0hbz.getClass();
                obj = C0HBZ.LIZ(avatarLarger, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ResourcesPreloadStat@d1f2.preloadCoversAndAvatar$1");
                    return objLJFF;
                }
            }
            c0hbz.LIZLLL = ((Number) obj).intValue();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLL.LIZLLL = 1;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ResourcesPreloadStat@d1f2.preloadCoversAndAvatar$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
