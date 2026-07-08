package X;

import android.content.SharedPreferences;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08RC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08RC extends C09AY implements Function0<SharedPreferences> {
    public final /* synthetic */ C08RA LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08RC(C08RA c08ra) {
        super(0);
        this.LL = c08ra;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SharedPreferences invoke() {
        return C810670Vr7.LIZJ(this.LL.LIZIZ().getApplicationContext(), 0, "sp_TicketGuardManager");
    }
}
