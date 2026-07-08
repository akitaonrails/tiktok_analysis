package X;

import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.ss.ugc.effectplatform.model.net.PanelInfoPagingCheckedResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS1S0100300_30;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: renamed from: X.13OZ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13OZ extends AbstractC20000013Ne {
    public final C13RD LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final String LJII;
    public final boolean LJIIIIZZ;

    @Override // X.AbstractC20000013Ne
    public final void execute() {
        LIZ(null, null);
    }

    @Override // X.AbstractC20000013Ne
    public final void onCancel() {
        runOnMainThread(new AwS574S0100000_30(this, 418));
    }

    public final void LIZIZ(C1662010tLr c1662010tLr) {
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed: ");
        sbLIZ.append(c1662010tLr);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c13ss.getClass();
        C13SS.LIZIZ("FetchPanelInfoPagingCheckedCacheTask", strLIZIZ, null);
        runOnMainThread(new AwS431S0200000_30(this, c1662010tLr, 89));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.13OE, com.ss.ugc.effectplatform.model.net.PanelInfoPagingCheckedResponse] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final void LIZ(Function1<? super Integer, Unit> function1, Function1<? super C1662010tLr, Unit> function12) {
        C20008813Qo c20008813QoLJIILIIL;
        C13RD c13rd = this.LIZ;
        InterfaceC20004513Ox interfaceC20004513Ox = c13rd.LJJIFFI;
        ?? r1 = 0;
        ?? r12 = 0;
        if (interfaceC20004513Ox != null) {
            c20008813QoLJIILIIL = interfaceC20004513Ox.LJIILIIL(C13OQ.LJIILJJIL(this.LJFF, this.LJ, this.LJI, c13rd.LJ, this.LIZIZ, this.LIZLLL, this.LJII, this.LJIIIIZZ));
        } else {
            c20008813QoLJIILIIL = null;
        }
        if (c20008813QoLJIILIIL == null) {
            C1662010tLr c1662010tLr = new C1662010tLr(10004);
            LIZIZ(c1662010tLr);
            if (function12 != null) {
                ((AwS609S0100000_30) function12).invoke(c1662010tLr);
                return;
            }
            return;
        }
        int length = 0;
        try {
            String strLJIIIZ = C13SB.LJIIIZ(c20008813QoLJIILIIL);
            length = strLJIIIZ.length() / 1024;
            C13R7 c13r7 = this.LIZ.LJIJI;
            if (c13r7 != null) {
                r1 = (PanelInfoPagingCheckedResponse) c13r7.LIZ.convertJsonToObj(strLJIIIZ, PanelInfoPagingCheckedResponse.class);
                r12 = r1;
            }
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        C13SB.LIZIZ(c20008813QoLJIILIIL);
        if (r12 != 0 && r12.checkValue()) {
            PanelInfoModel responseData = r12.getResponseData();
            if (responseData != null) {
                C13RD c13rd2 = this.LIZ;
                if (c13rd2.LJJJ == 2) {
                    C13LD.LJ(C13LD.LIZ, c13rd2, this.LIZIZ, responseData, true, null, 16);
                }
                C13MA c13maLIZ = this.LIZ.LJJJIL.LIZ(this.LIZJ);
                if (c13maLIZ != null) {
                    c13maLIZ.preProcess(responseData);
                }
                runOnMainThread(new AwS431S0200000_30(this, responseData, 92));
            }
            if (function1 == null) {
                return;
            }
            ((AwS1S0100300_30) function1).invoke(Integer.valueOf(length));
            return;
        }
        C1662010tLr c1662010tLr2 = new C1662010tLr(10004);
        LIZIZ(c1662010tLr2);
        if (function12 == null) {
            return;
        }
        ((AwS609S0100000_30) function12).invoke(c1662010tLr2);
    }

    public C13OZ(C13RD c13rd, String str, String str2, String str3, int i, int i2, int i3, String str4) {
        super(str2, null);
        this.LIZ = c13rd;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = i;
        this.LJFF = i2;
        this.LJI = i3;
        this.LJII = str4;
        this.LJIIIIZZ = true;
    }
}
