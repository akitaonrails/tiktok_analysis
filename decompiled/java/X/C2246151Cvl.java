package X;

import android.app.Activity;
import com.bytedance.hox.Hox;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Cvl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2246151Cvl extends C09AY implements Function0<Unit> {
    public C2246151Cvl() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        final C19EG c19eg;
        C838910WvZ.LJ = true;
        Activity activityLIZ = C2421209eE.LIZ();
        if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null) {
            C838910WvZ.LJFF = C1559540qga.LIZ(c19eg);
            Hox.LLJILJIL.LIZ(c19eg).vQ2(new InterfaceC1583770rJf() { // from class: X.1Cvn
                @Override // X.InterfaceC1583770rJf
                public final void A4(String str, String str2) {
                    C838910WvZ.LJFF = C1559540qga.LIZ(c19eg);
                    C838910WvZ.LIZ();
                }
            });
        }
        C838910WvZ.LIZ();
        return Unit.LIZ;
    }
}
