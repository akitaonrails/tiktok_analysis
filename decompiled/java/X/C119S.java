package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.119S, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C119S {
    public static InterfaceC1635410sex LIZIZ;
    public static final C01GW<C119S> LIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(462));
    public static final C01GW<C194557119v> LIZJ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(463));

    public static boolean LIZ(Effect effect) {
        int iIntValue;
        Integer numLJIIJJI;
        String effectId = effect.getEffectId();
        if (effectId != null && (numLJIIJJI = C2095008Iq.LJIIJJI(effectId)) != null) {
            iIntValue = numLJIIJJI.intValue();
        } else {
            iIntValue = -1;
        }
        if (iIntValue < 0) {
            return true;
        }
        InterfaceC1635410sex interfaceC1635410sexLIZIZ = C119R.LIZIZ();
        if ((interfaceC1635410sexLIZIZ != null && interfaceC1635410sexLIZIZ.LJIIIIZZ(effect)) || effect.getEffectType() != 0) {
            return true;
        }
        return false;
    }
}
