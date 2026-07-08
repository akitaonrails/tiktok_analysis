package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS416S0200000_15;

/* JADX INFO: renamed from: X.0b3K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C958600b3K implements InterfaceC959480b4k {
    public final Context LIZ;

    public static List LIZIZ() {
        List<C954460awe> listLJIJJ = C915980Zwa.LJII().LJIJJ();
        ArrayList arrayList = new ArrayList();
        for (C954460awe c954460awe : listLJIJJ) {
            C954460awe c954460awe2 = c954460awe;
            if ((c954460awe2.LJJIIZ == EnumC950200apm.APPLIED && c954460awe2.LJIIJJI() && c954460awe2.LJJIJIIJIL && !c954460awe2.LJJIJIL) || C948780anU.LJIIIIZZ(C915980Zwa.LJII().LJIIIZ(), c954460awe2.LJIIJJI)) {
                arrayList.add(c954460awe);
            }
        }
        return arrayList;
    }

    public C958600b3K(Context context) {
        this.LIZ = context;
    }

    @Override // X.InterfaceC959480b4k
    public final void LIZ(C959490b4l c959490b4l) {
        boolean z;
        boolean z2;
        boolean z3;
        EnumC950120ape enumC950120apeLLI = C915980Zwa.LJII().LLI();
        List<C954460awe> listLJIJJ = C915980Zwa.LJII().LJIJJ();
        if ((listLJIJJ instanceof Collection) && listLJIJJ.isEmpty()) {
            z = false;
        } else {
            for (C954460awe c954460awe : listLJIJJ) {
                if (c954460awe.LJIIJJI() && c954460awe.LJIIJ()) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        boolean z4 = !((ArrayList) LIZIZ()).isEmpty();
        List<C954460awe> listLJIJJ2 = C915980Zwa.LJII().LJIJJ();
        if ((listLJIJJ2 instanceof Collection) && listLJIJJ2.isEmpty()) {
            z2 = false;
        } else {
            for (C954460awe c954460awe2 : listLJIJJ2) {
                if (c954460awe2.LJJIIZ.isInviting() && c954460awe2.LJIIJJI()) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        if (enumC950120apeLLI != EnumC950120ape.Invited && ((enumC950120apeLLI != EnumC950120ape.Linked || !z || z4) && !z2)) {
            z3 = false;
        } else {
            z3 = true;
        }
        C20441214yg.LIZIZ("CoHostStatusInterceptor", "intercept cohost status, cohost user list = " + C915980Zwa.LJII().LJIJJ());
        C20441214yg.LIZIZ("CoHostStatusInterceptor", "enable different invite = " + C915980Zwa.LJII().LLJ());
        if (z3 && !C915980Zwa.LJII().LLJ()) {
            C955850ayt.LIZ(this.LIZ, EnumC955790ayn.INVITE_PAIR, new AwS416S0200000_15(this, c959490b4l, 102), AFwS203S0000000_15.get$arr$(406));
            AwS416S0200000_15 awS416S0200000_15 = c959490b4l.LIZLLL;
            if (awS416S0200000_15 != null) {
                awS416S0200000_15.invoke();
            }
            C20441214yg.LIZIZ("CoHostStatusInterceptor", "checkInvitedAppliedState, block by invited state");
            return;
        }
        if (enumC950120apeLLI != EnumC950120ape.Applied && !z4) {
            if (C915980Zwa.LJII().LLJ()) {
                List<C954460awe> listLJIJJ3 = C915980Zwa.LJII().LJIJJ();
                ArrayList arrayList = new ArrayList();
                for (C954460awe c954460awe3 : listLJIJJ3) {
                    C954460awe c954460awe4 = c954460awe3;
                    EnumC950200apm enumC950200apm = c954460awe4.LJJIIZ;
                    if (enumC950200apm == EnumC950200apm.INVITING || enumC950200apm == EnumC950200apm.INVITED) {
                        if (c954460awe4.LJIIJJI()) {
                            arrayList.add(c954460awe3);
                        }
                    }
                }
                int size = arrayList.size();
                C955540ayO c955540ayOLJIILLIIL = C915980Zwa.LJI().LIZ().LJIILLIIL();
                if (size >= C950220apo.LJIIJ(c955540ayOLJIILLIIL)) {
                    C766270U4b.LJIIJJI(C497740JfY.LJIIL(2131755813, C950220apo.LJIIJ(c955540ayOLJIILLIIL), Integer.valueOf(C950220apo.LJIIJ(c955540ayOLJIILLIIL))));
                    return;
                }
            }
            c959490b4l.LIZIZ();
            return;
        }
        C955850ayt.LIZ(this.LIZ, EnumC955790ayn.APPLY_PAIR, new AwS416S0200000_15(this, c959490b4l, 103), AFwS203S0000000_15.get$arr$(407));
        AwS416S0200000_15 awS416S0200000_152 = c959490b4l.LIZLLL;
        if (awS416S0200000_152 != null) {
            awS416S0200000_152.invoke();
        }
        C20441214yg.LIZIZ("CoHostStatusInterceptor", "checkInvitedAppliedState, block by applied state");
    }
}
