package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.e3;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.gamora.recorder.sticker.s;
import dtk.r;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS174S1100000_25;
import kotlin.jvm.internal.AwS234S0300000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import muk.p1;
import muk.q1;

/* JADX INFO: renamed from: X.0sOZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1625250sOZ {
    public static final InterfaceC1629550sVV LIZ() {
        return C0CHQ.LIZ().getAccountService().LIZ() ? C1622250sJj.LIZ : C1622260sJk.LIZ;
    }

    public static final e3 LJ(int i, C19A3 c19a3, C1DRG c1drg) {
        return new e3(c1drg, c19a3, i, new AwS604S0100000_25(c1drg, 308));
    }

    public static s LIZLLL(C1DRG c1drg, Function1 function1, C1621430sIP c1621430sIP, Function0 function0, int i) {
        C1630930sXj c1630930sXj = null;
        if ((i & 4) != 0) {
            function1 = null;
        }
        if ((i & 8) != 0) {
            c1621430sIP = new C1621430sIP(false, false);
        }
        if ((i & 16) != 0) {
            c1630930sXj = new C1630930sXj();
        }
        if ((i & 32) != 0) {
            function0 = new AwS174S1100000_25(c1drg, 7);
        }
        return new s(c1drg, c1630930sXj, c1621430sIP, new AwS234S0300000_25(c1drg, function0, function1, 19));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0sOg, X.0sOi] */
    public static C1625340sOi LIZIZ(final ShortVideoContext shortVideoContext, final C19GS c19gs, final C1629320sV8 c1629320sV8, final InterfaceC1629550sVV interfaceC1629550sVV, final InterfaceC1635390sev interfaceC1635390sev, final LifecycleOwner lifecycleOwner) {
        final List listLIZ = C1625360sOk.LIZ(c19gs);
        ?? r1 = new p1(c19gs, lifecycleOwner, shortVideoContext, c1629320sV8, interfaceC1629550sVV, interfaceC1635390sev, listLIZ) { // from class: X.0sOi
            public final ShortVideoContext LJIIL;

            @Override // muk.p1, X.C1625320sOg
            public final InterfaceC1628820sUK LIZIZ(C1629320sV8 c1629320sV82, InterfaceC1635390sev interfaceC1635390sev2, InterfaceC1629550sVV interfaceC1629550sVV2, List<? extends EffectCategoryModel> list, boolean z) {
                q1 q1Var = new q1(c1629320sV82, interfaceC1635390sev2, interfaceC1629550sVV2, list, this.LJIIL);
                InterfaceC1629750sVp interfaceC1629750sVp = this.LJII;
                if (interfaceC1629750sVp != null) {
                    q1Var.LJFF = interfaceC1629750sVp;
                }
                q1Var.LJI = AFwS214S0000000_25.get$arr$(219);
                return q1Var;
            }

            {
                this.LJIIL = shortVideoContext;
            }
        };
        r1.LJII = new r();
        r1.LJIIIIZZ = new C1420030n3Z();
        return r1;
    }

    public static p1 LIZJ(ShortVideoContext shortVideoContext, C19GS c19gs, C1629320sV8 c1629320sV8, InterfaceC1629550sVV interfaceC1629550sVV, InterfaceC1635390sev interfaceC1635390sev, LifecycleOwner lifecycleOwner) {
        p1 p1Var = new p1(c19gs, lifecycleOwner, shortVideoContext, c1629320sV8, interfaceC1629550sVV, interfaceC1635390sev, C1625360sOk.LIZ(c19gs));
        p1Var.LJII = new r();
        p1Var.LJIIIIZZ = new C1420030n3Z();
        return p1Var;
    }

    public static C1625350sOj LJFF(ShortVideoContext shortVideoContext, C19GS c19gs, C1629320sV8 c1629320sV8, InterfaceC1629550sVV interfaceC1629550sVV, InterfaceC1635390sev interfaceC1635390sev, LifecycleOwner lifecycleOwner) {
        C1625350sOj c1625350sOj = new C1625350sOj(c19gs, lifecycleOwner, shortVideoContext, c1629320sV8, interfaceC1629550sVV, interfaceC1635390sev, C1625360sOk.LIZ(c19gs));
        c1625350sOj.LJII = new r();
        c1625350sOj.LJIIIIZZ = new C1420030n3Z();
        return c1625350sOj;
    }
}
