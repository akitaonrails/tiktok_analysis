package X;

import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: renamed from: X.0wZ1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1785490wZ1 {
    public final InterfaceC497601wk LIZ;
    public final InterfaceC1785610wZD LIZIZ;
    public final Function1<InterfaceC1785530wZ5, Unit> LIZJ;
    public AnonymousClass0956 LIZLLL;
    public boolean LJ;
    public Integer LJFF;

    public final boolean LIZ() {
        if (!this.LJ) {
            return false;
        }
        Integer num = this.LJFF;
        RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
        return num != null && num.intValue() == RankTypeV2.LJJIIZ.type;
    }

    public final void LIZIZ() {
        AnonymousClass0956 anonymousClass0956 = this.LIZLLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LIZLLL = null;
    }

    public final void LIZLLL() {
        if (!LIZ()) {
            LIZIZ();
            return;
        }
        if (!this.LIZIZ.LIZJ()) {
            LIZJ(C1785660wZI.LIZ);
        } else if (this.LIZIZ.LIZIZ()) {
            LIZIZ();
        } else {
            LIZJ(C1785670wZJ.LIZ);
        }
    }

    public final void LIZJ(InterfaceC1785530wZ5 interfaceC1785530wZ5) {
        LIZIZ();
        this.LIZLLL = C23250099c.LIZLLL(this.LIZ, null, null, new C807850VmZ(this, interfaceC1785530wZ5, null), 3);
    }

    public C1785490wZ1(InterfaceC497601wk interfaceC497601wk, InterfaceC1785610wZD interfaceC1785610wZD, AwS593S0100000_14 awS593S0100000_14) {
        this.LIZ = interfaceC497601wk;
        this.LIZIZ = interfaceC1785610wZD;
        this.LIZJ = awS593S0100000_14;
    }
}
