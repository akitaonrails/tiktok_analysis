package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.09ft, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2431509ft extends C09AY implements Function1<C1397660mTU, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2431509ft(String str, String str2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397660mTU c1397660mTU) {
        C0I0B.LJFF.LIZIZ().sendEvent("ttsocial_whee_open_app_popup_click", C2097608Jq.LJIIIIZZ(new Pair("enter_from", this.LL), new Pair("enter_method", this.LLILLJJLI), new Pair("button_name", "not_now")));
        return Unit.LIZ;
    }
}
