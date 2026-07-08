package X;

import com.ss.android.ugc.aweme.inbox.skylight.InboxSkylightWidgetV2;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0rhe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.skylight.InboxSkylightWidgetV2$makeSkylightRequestViaCoordinator$1$1", f = "InboxSkylightWidgetV2.kt", l = {775, 799}, m = "invokeSuspend")
public final class C1598640rhe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InboxSkylightWidgetV2 LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ SkylightListViewModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1598640rhe(InboxSkylightWidgetV2 inboxSkylightWidgetV2, boolean z, int i, SkylightListViewModel skylightListViewModel, InterfaceC1364105Vn<? super C1598640rhe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = inboxSkylightWidgetV2;
        this.LLILLL = z;
        this.LLILZ = i;
        this.LLILZIL = skylightListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1598640rhe(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x01af A[Catch: Exception -> 0x01b5, all -> 0x01e5, TRY_LEAVE, TryCatch #1 {Exception -> 0x01b5, blocks: (B:67:0x0167, B:68:0x016a, B:70:0x0180, B:72:0x018c, B:74:0x019c, B:75:0x019f, B:77:0x01af, B:14:0x005b, B:15:0x005e, B:17:0x008a, B:18:0x008c, B:20:0x00a3, B:21:0x00ad, B:23:0x00b3, B:24:0x00b7, B:26:0x00bd, B:27:0x00c1, B:36:0x00dc, B:38:0x010b, B:41:0x0113, B:45:0x011c, B:47:0x0122, B:51:0x012b, B:53:0x0131, B:60:0x0140, B:61:0x0149, B:63:0x014f, B:30:0x00ca, B:10:0x0028), top: B:86:0x0015, outer: #0 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r40) {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1598640rhe.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
