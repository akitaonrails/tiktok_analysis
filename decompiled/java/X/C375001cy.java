package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01cy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.share.StreakSharerFilterManager$getUidListFeatureResultSyncWithTimeout$1$1", f = "StreakSharerFilterManager.kt", l = {}, m = "invokeSuspend")
public final class C375001cy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AnonymousClass0957<? extends Unit>>, Object> {
    public final /* synthetic */ List<Long> LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C375001cy(String str, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C375001cy(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C099G c099gLIZJ;
        C1C7U.LIZ("StreakSharerFilterManager@bb26.getUidListFeatureResultSyncWithTimeout$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<Long> list = this.LL;
        if (list != null) {
            String str = this.LLILLJJLI;
            C1582806Hq.LLILLJJLI.getClass();
            c099gLIZJ = C1582806Hq.LIZJ(str, list);
        } else {
            c099gLIZJ = null;
        }
        C1C7U.LIZIZ("StreakSharerFilterManager@bb26.getUidListFeatureResultSyncWithTimeout$1$1");
        return c099gLIZJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AnonymousClass0957<? extends Unit>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
