package X;

import android.content.DialogInterface;
import android.os.Handler;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1DsD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2269431DsD extends C09AY implements Function0<C1662130tM3> {
    public C2269431DsD() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0tM3] */
    @Override // kotlin.jvm.functions.Function0
    public final C1662130tM3 invoke() {
        return new InterfaceC1621700sIq() { // from class: X.0tM3
            @Override // X.InterfaceC1621700sIq
            public final C19469911Fh LIZ(Effect effect, ViewGroup viewGroup, C19GS c19gs) {
                if (!C1652780t6y.LIZ(effect, true) || !C1624200sMs.LIZLLL(effect) || !C1621890sJ9.LIZJ()) {
                    return null;
                }
                C1662140tM4 c1662140tM4 = new C1662140tM4();
                C1624610sNX.LIZ.getClass();
                c1662140tM4.LIZLLL = C1624610sNX.LIZIZ;
                if (C1624200sMs.LIZLLL(effect) && C1621890sJ9.LIZJ()) {
                    c1662140tM4.LIZLLL(effect);
                }
                if (!c1662140tM4.LIZJ()) {
                    return null;
                }
                return new C19469911Fh(viewGroup, c1662140tM4, c19gs);
            }

            @Override // X.InterfaceC1621700sIq
            public final DialogC19470111Fj LIZIZ(Effect effect, DialogInterface.OnDismissListener onDismissListener, Handler handler, C19GS c19gs, boolean z, boolean z2, boolean z3) {
                String strOptString;
                String strOptString2;
                String strOptString3;
                if (!C1652780t6y.LIZ(effect, z3)) {
                    return null;
                }
                C1662140tM4 c1662140tM4 = new C1662140tM4();
                C1624610sNX.LIZ.getClass();
                c1662140tM4.LIZLLL = C1624610sNX.LIZIZ;
                if (C1624200sMs.LIZLLL(effect) && (C1621890sJ9.LIZIZ() || C1621890sJ9.LIZJ())) {
                    c1662140tM4.LIZLLL(effect);
                } else {
                    try {
                        C1446130njf.LIZ.getClass();
                        JSONObject jSONObjectLJII = C1446130njf.LJII(effect);
                        if (jSONObjectLJII != null) {
                            strOptString = jSONObjectLJII.optString("pixaloop_text");
                        } else {
                            strOptString = null;
                        }
                        c1662140tM4.LIZJ = strOptString;
                        if (jSONObjectLJII == null) {
                            strOptString2 = null;
                        } else {
                            strOptString2 = jSONObjectLJII.optString("pixaloop_picture_cover");
                        }
                        c1662140tM4.LIZ = strOptString2;
                        if (jSONObjectLJII == null) {
                            strOptString3 = null;
                        } else {
                            strOptString3 = jSONObjectLJII.optString("pixaloop_video_cover");
                        }
                        c1662140tM4.LIZIZ = strOptString3;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                if (!c1662140tM4.LIZJ()) {
                    return null;
                }
                DialogC19470111Fj dialogC19470111Fj = new DialogC19470111Fj(c19gs, effect, c1662140tM4, z, z2, z3);
                dialogC19470111Fj.LLJILJILJ = handler;
                dialogC19470111Fj.setOnDismissListener(onDismissListener);
                dialogC19470111Fj.setOwnerActivity(c19gs);
                return dialogC19470111Fj;
            }
        };
    }
}
