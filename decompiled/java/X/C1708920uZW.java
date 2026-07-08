package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0uZW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1708920uZW implements InterfaceC736910SvR<InterfaceC1708850uZP> {
    public final C1708830uZN LL = new C1708830uZN(this);

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LL;
    }

    public static void LIZ(Context context, C1709570uaZ c1709570uaZ, C1709570uaZ c1709570uaZ2, C1708930uZX c1708930uZX) throws JSONException {
        Function1<C1709570uaZ, Unit> function1;
        if (c1709570uaZ != null) {
            c1709570uaZ.LJJJJIZL(context, false, c1709570uaZ2);
        } else {
            c1709570uaZ2.LJJJJIZL(context, true, c1709570uaZ2);
        }
        EventBus.LIZLLL().LJIILL(new C1435105jZ(c1709570uaZ2));
        if (c1708930uZX != null && (function1 = c1708930uZX.LIZ) != null) {
            function1.invoke(c1709570uaZ2);
        }
    }
}
