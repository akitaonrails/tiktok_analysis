package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0K5h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C511790K5h extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C511790K5h(String str, String str2, String str3, int i, String str4) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = i;
        this.LLILZIL = str4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_change_price_sheet_not_now");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(this.LL, "show_entrance");
        c474500IjALIZ.LJJII("notify_and_consent", "show_type");
        c474500IjALIZ.LJJII(this.LLILLJJLI, "old_price");
        c474500IjALIZ.LJJII(this.LLILLL, "new_price");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLILZ), "subscribe_month");
        c474500IjALIZ.LJJII("auto_sub", "subscribe_type");
        c474500IjALIZ.LJJII(this.LLILZIL, "renewal_time");
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }
}
