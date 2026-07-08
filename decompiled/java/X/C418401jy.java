package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01jy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C418401jy extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL = "others_homepage";
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C418401jy(String str, String str2) {
        super(0);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LL);
        c2344009Gk.LJIIIIZZ("type", this.LLILLJJLI);
        c2344009Gk.LJIIIIZZ("to_user_id", this.LLILLL);
        C20684815ws.LJIILLIIL("profile_set_user_data", c2344009Gk.LIZ);
        return Unit.LIZ;
    }
}
