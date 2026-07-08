package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.11wf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19664311wf {
    public final LifecycleOwner LIZ;

    public abstract int LIZ();

    public Long LIZIZ() {
        return null;
    }

    public abstract int LIZJ();

    public abstract int LIZLLL();

    public AbstractC19664311wf(LifecycleOwner lifecycleOwner) {
        this.LIZ = lifecycleOwner;
    }

    public final void LJFF(C19663611wY c19663611wY) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ), C0PEM.LIZJ, null, new C19664411wg(this, c19663611wY.LIZLLL, c19663611wY.LIZ(), c19663611wY.LIZIZ, null), 2);
    }

    public static void LJIIIIZZ(String str, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("live_event_id", str);
        jSONObject.put("success", z ? 1 : 0);
        C389001fE.LIZ("live_event_display_sticker_finish", jSONObject, System.currentTimeMillis(), false);
    }

    public static void LJ(C262100zr c262100zr, Function1 function1, Function0 function0) {
        InterfaceC1107590evd interfaceC1107590evd;
        if (!Intrinsics.LJFF(c262100zr.LIZ, "live_event_display_sticker") || (interfaceC1107590evd = c262100zr.LIZIZ) == null) {
            return;
        }
        if (C1871910yoP.LIZLLL(interfaceC1107590evd, "result", 0) == 1) {
            InterfaceC1107590evd interfaceC1107590evdLJ = C1871910yoP.LJ(interfaceC1107590evd, "live_event");
            if (interfaceC1107590evdLJ == null) {
                return;
            }
            function1.invoke(C19663811wa.LIZ(interfaceC1107590evdLJ));
            return;
        }
        function0.invoke();
    }

    public final void LJI(C19663611wY c19663611wY, Function1 function1, C19665111wn c19665111wn) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ), C0PEM.LIZJ, null, new C19664511wh(this, c19663611wY.LIZLLL, c19663611wY.LJIIIIZZ, c19663611wY.LJIIIZ, function1, c19663611wY, c19665111wn, null), 2);
    }

    public final void LJII(C19663611wY c19663611wY, Function0 function0, C19665211wo c19665211wo) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ), C0PEM.LIZJ, null, new C19664611wi(this, c19663611wY.LIZLLL, function0, c19665211wo, c19663611wY, null), 2);
    }
}
