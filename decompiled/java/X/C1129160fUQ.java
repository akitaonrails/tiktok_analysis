package X;

import com.bytedance.android.livesdk.livesetting.gift.GiftPanelDomainRefactorSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS631S0100000_17;

/* JADX INFO: renamed from: X.0fUQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129160fUQ {
    public final Function0<Unit> LIZ;
    public final Function1<C1129150fUP, Unit> LIZIZ;
    public final Function2<Integer, String, Unit> LIZJ;
    public long LIZLLL = -1;
    public boolean LJ;

    public final void LIZ(C1129150fUP c1129150fUP) {
        if (!GiftPanelDomainRefactorSettings.isEnabled()) {
            return;
        }
        long j = c1129150fUP.LJIIJJI;
        if (j == this.LIZLLL) {
            return;
        }
        this.LIZLLL = j;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[NewArch] onStateChanged - phase=");
        sbLIZ.append(c1129150fUP.LIZ);
        sbLIZ.append(", version=");
        sbLIZ.append(c1129150fUP.LJIIJJI);
        sbLIZ.append(", source=");
        sbLIZ.append(c1129150fUP.LJIIIIZZ);
        C20441214yg.LIZIZ("GiftMVI.View", C2188811AlT.LIZIZ(sbLIZ));
        int i = C1129630fVB.LIZ[c1129150fUP.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new C1954807lC();
                    }
                    return;
                }
                Function2<Integer, String, Unit> function2 = this.LIZJ;
                Integer numValueOf = Integer.valueOf(c1129150fUP.LJIIIZ);
                String str = c1129150fUP.LJIIJ;
                if (str == null) {
                    str = "";
                }
                function2.invoke(numValueOf, str);
                return;
            }
            if (this.LJ && c1129150fUP.LJIIIIZZ == EnumC1129600fV8.TAB_SWITCH) {
                this.LJ = false;
                C20441214yg.LIZIZ("GiftMVI.View", "[NewArch] TAB_SWITCH state sync, skip immediate re-render");
                return;
            } else {
                this.LIZIZ.invoke(c1129150fUP);
                return;
            }
        }
        this.LIZ.invoke();
    }

    public C1129160fUQ(C1128880fTy c1128880fTy, AwS561S0100000_17 awS561S0100000_17, AwS631S0100000_17 awS631S0100000_17) {
        this.LIZ = awS561S0100000_17;
        this.LIZIZ = c1128880fTy;
        this.LIZJ = awS631S0100000_17;
    }
}
