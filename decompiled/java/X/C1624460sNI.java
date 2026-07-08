package X;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0sNI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1624460sNI extends C09AY implements Function1<Bundle, Unit> {
    public final /* synthetic */ String LL = "carousel";
    public final /* synthetic */ String LLILLJJLI = "carousel";
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1624460sNI(String str) {
        super(1);
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putBoolean("need_report_prop_click", false);
        C786410Ut5.LJJJI("tab_name", this.LL, bundle2);
        C786410Ut5.LJJJI("tab_key", this.LLILLJJLI, bundle2);
        C786410Ut5.LJJJI("prop_selected_from", this.LLILLL, bundle2);
        bundle2.putBoolean("is_default_on_shoot_page", true);
        C786410Ut5.LJJJI("carousel_open", "1", bundle2);
        return Unit.LIZ;
    }
}
