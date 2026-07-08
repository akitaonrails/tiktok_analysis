package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.android.sdk.ticketguard.TicketGuardInitParam;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0XNQ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XNQ extends C09AY implements Function0<SharedPreferences> {
    public C0XNQ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final SharedPreferences invoke() {
        TicketGuardInitParam ticketGuardInitParamLIZIZ;
        Context applicationContext;
        C0XNK c0xnk = C0XNC.LIZ;
        if (c0xnk == null || (ticketGuardInitParamLIZIZ = c0xnk.LIZIZ()) == null || (applicationContext = ticketGuardInitParamLIZIZ.getApplicationContext()) == null) {
            return null;
        }
        return C810670Vr7.LIZJ(applicationContext, 0, "TicketGuardEventHelper_didReport");
    }
}
