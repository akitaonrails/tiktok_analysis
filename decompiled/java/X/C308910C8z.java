package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0C8z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C308910C8z extends C09AY implements Function0<Integer> {
    public C308910C8z() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        n nVar;
        n nVarLJJIJ;
        k kVarLJJIIZ;
        String string;
        Integer numLJIIJJI;
        try {
            nVar = (n) SettingsManager.LIZLLL().LJIIIIZZ("ecom_user_act_config", n.class, null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LIZJ(th.getMessage());
        }
        int iIntValue = (nVar == null || (nVarLJJIJ = nVar.LJJIJ("goods_view_action")) == null || (kVarLJJIIZ = nVarLJJIJ.LJJIIZ("size")) == null || (string = kVarLJJIIZ.toString()) == null || (numLJIIJJI = C2095008Iq.LJIIJJI(string)) == null) ? 30 : numLJIIJJI.intValue();
        return Integer.valueOf(iIntValue);
    }
}
