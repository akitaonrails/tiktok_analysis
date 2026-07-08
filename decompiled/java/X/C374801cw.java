package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01cw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.share.StreakSharerFilterManager$getConversationFeatureResultSyncWithTimeout$1$1", f = "StreakSharerFilterManager.kt", l = {}, m = "invokeSuspend")
public final class C374801cw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AnonymousClass0957<? extends Unit>>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ List<String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C374801cw(String str, List<String> list, InterfaceC1364105Vn<? super C374801cw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C374801cw(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakSharerFilterManager@bb26.getConversationFeatureResultSyncWithTimeout$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1582806Hq c1582806Hq = C1582806Hq.LLILLJJLI;
        String str = this.LL;
        List<String> list = this.LLILLJJLI;
        c1582806Hq.getClass();
        C099G c099gLIZLLL = C1582806Hq.LIZLLL(str, list);
        C1C7U.LIZIZ("StreakSharerFilterManager@bb26.getConversationFeatureResultSyncWithTimeout$1$1");
        return c099gLIZLLL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AnonymousClass0957<? extends Unit>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
