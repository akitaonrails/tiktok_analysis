package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0xzX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.widget.StoryWidgetMgr$checkFeatureEnv$2", f = "StoryWidgetMgr.kt", l = {}, m = "invokeSuspend")
public final class C1840370xzX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;

    public C1840370xzX(InterfaceC1364105Vn<? super C1840370xzX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1840370xzX c1840370xzX = new C1840370xzX(interfaceC1364105Vn);
        c1840370xzX.LL = obj;
        return c1840370xzX;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryWidgetMgr@ce0b.checkFeatureEnv$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        Throwable th = null;
        if (C10EU.LJIILIIL()) {
            C2296808zG.LIZJ(interfaceC497601wk, C2239008pw.LIZ("kids mode open", new C1840340xzU("kids mode open", th) { // from class: X.0xzT
                public static final int $stable = 8;
            }));
        }
        if (!C1601110rld.LIZ() || !C288820BTs.LIZ() || !C1618440sDa.LIZIZ.LIZ()) {
            C2296808zG.LIZJ(interfaceC497601wk, C2239008pw.LIZ("feature close", new C1840340xzU("feature close", th) { // from class: X.0xzV
                public static final int $stable = 8;
            }));
        }
        if (!((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin()) {
            C2296808zG.LIZJ(interfaceC497601wk, C2239008pw.LIZ("not login", new C1840340xzU("not login", th) { // from class: X.0xzV
                public static final int $stable = 8;
            }));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryWidgetMgr@ce0b.checkFeatureEnv$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
