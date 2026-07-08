package X;

import com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OeI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem$onCreate$1", f = "InboxBannerProtocol.kt", l = {134}, m = "invokeSuspend")
public final class C624360OeI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ InboxBannerAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C624360OeI(long j, InboxBannerAssem inboxBannerAssem, InterfaceC1364105Vn<? super C624360OeI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = inboxBannerAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C624360OeI(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxBannerAssem@a566.onCreate$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("InboxBannerAssem@a566.onCreate$1");
                return objLJFF;
            }
        }
        if (((Pair) this.LLILLL.LL.getValue()).getFirst() == EnumC637310OzB.INIT) {
            C624370OeJ.LIZ(this.LLILLL.getClass().getSimpleName(), "timeout dismiss");
            this.LLILLL.LL.setValue(new Pair(EnumC637310OzB.DISMISS, null));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxBannerAssem@a566.onCreate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
