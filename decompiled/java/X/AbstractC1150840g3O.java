package X;

import Y.AfS186S0100000_17;
import android.content.Context;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.livesetting.wallet.LiveGiftExchangeFESchema;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g3O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1150840g3O {
    public long LIZ;
    public final HashMap<String, Long> LIZIZ = new HashMap<>();

    public abstract C495520Jby LIZ(Context context, C495520Jby c495520Jby);

    public abstract boolean LIZIZ(boolean z);

    public abstract String LIZJ();

    public abstract Context LIZLLL();

    public abstract String LJ();

    public abstract List<Integer> LJFF();

    public abstract EnumC1150950g3Z LJI();

    public abstract long LJII();

    public abstract C1144350fsv LJIIIIZZ();

    public abstract Boolean LJIIIZ();

    public abstract Boolean LJIIJ();

    public abstract boolean LJIILIIL();

    public boolean LJIILJJIL() {
        return true;
    }

    public boolean LJIILL() {
        return true;
    }

    public abstract void LJIILLIIL(EnumC1150950g3Z enumC1150950g3Z);

    public abstract void LJIIZILJ(Boolean bool);

    public abstract void LJIJ(Boolean bool);

    public final void LJIIJJI(Context context) {
        switch (C1150960g3a.LIZ[LJI().ordinal()]) {
            case 1:
                LIZIZ(false);
                return;
            case 2:
                int iIntValue = ((Number) ListProtector.get(LJFF(), 0)).intValue();
                int i = LJIIIIZZ().LIZIZ;
                boolean zLJIILIIL = LJIILIIL();
                boolean zLJIILJJIL = LJIILJJIL();
                C1149970g1z.LIZIZ(C1149160g0g.LIZJ(((Number) ListProtector.get(LJFF(), 1)).intValue()), C1149160g0g.LIZIZ(LJIIIIZZ().LIZLLL, null, LJIILIIL(), LJIILL()), LJIIIIZZ().LJ, iIntValue, i, zLJIILIIL, zLJIILJJIL).LJFF(new C0UO0()).LJJIIZ(new AfS186S0100000_17(this, 98), new AfS186S0100000_17(this, 99));
                return;
            case 3:
                C1149160g0g.LIZ(this.LIZ, "loading_duration", this.LIZIZ);
                this.LIZ = C158B.LIZ();
                if (Intrinsics.LJFF(LJIIJ(), Boolean.TRUE)) {
                    Context contextLIZLLL = LIZLLL();
                    C495520Jby c495520Jby = new C495520Jby(LiveGiftExchangeFESchema.INSTANCE.getW9PopUpSchema());
                    C1803420x1w.LIZ(c495520Jby, contextLIZLLL);
                    ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(contextLIZLLL, c495520Jby.LIZLLL());
                    C1149160g0g.LJ(1, null, ((Number) ListProtector.get(LJFF(), 1)).intValue(), LJIIIIZZ(), this.LIZIZ, LJIILIIL(), LJIILL(), LJIILJJIL());
                    return;
                }
                if (LJIILIIL() && Intrinsics.LJFF(LJIIIZ(), Boolean.FALSE)) {
                    LJIILLIIL(EnumC1150950g3Z.HANDLE_AUTO_EXCHANGE);
                    LJIIJJI(LIZLLL());
                    return;
                } else {
                    LJIILLIIL(EnumC1150950g3Z.HANDLE_EXCHANGE_DIALOG);
                    LJIIJJI(LIZLLL());
                    return;
                }
            case 4:
                C495520Jby c495520Jby2 = new C495520Jby(LiveGiftExchangeFESchema.INSTANCE.getGiftExchangePopUpSchema());
                LIZ(context, c495520Jby2);
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, c495520Jby2.LIZLLL());
                return;
            case 5:
                LJIIL(true);
                return;
            case 6:
                LJIIL(false);
                return;
            case 7:
                return;
            default:
                throw new C1954807lC();
        }
    }

    public final void LJIIL(boolean z) {
        if (z) {
            C1149680g1W.LJIJI();
            C1150830g3N.LIZLLL(((Number) ListProtector.get(LJFF(), 1)).intValue(), 97, LIZJ(), LJ(), LJIIIIZZ().LIZLLL, false, LJII());
            C1149160g0g.LIZLLL(((Number) ListProtector.get(LJFF(), 1)).intValue(), LJIIIIZZ(), LJIILIIL(), LJIILL(), LJIILJJIL());
            return;
        }
        String strLIZJ = LIZJ();
        Map<String, InterfaceC1149850g1n> map = C1150830g3N.LIZ;
        if (!map.containsKey(strLIZJ)) {
            return;
        }
        InterfaceC1149850g1n interfaceC1149850g1n = (InterfaceC1149850g1n) ((LinkedHashMap) map).get(strLIZJ);
        if (interfaceC1149850g1n != null) {
            interfaceC1149850g1n.LIZJ();
        }
        map.remove(strLIZJ);
    }
}
