package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.ss.ugc.effectplatform.model.net.PanelInfoCheckedResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS1S0100300_30;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: renamed from: X.13Oa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20002213Oa extends AbstractC20000013Ne {
    public final C13RD LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final int LJI;

    @Override // X.AbstractC20000013Ne
    public final void execute() {
        LIZ(null, null);
    }

    @Override // X.AbstractC20000013Ne
    public final void onCancel() {
        runOnMainThread(new AwS574S0100000_30(this, 414));
    }

    public final void LIZIZ(C1662010tLr c1662010tLr) {
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed: ");
        sbLIZ.append(c1662010tLr);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c13ss.getClass();
        C13SS.LIZIZ("FetchPanelInfoCheckedCacheTask", strLIZIZ, null);
        runOnMainThread(new AwS431S0200000_30(this, c1662010tLr, 78));
    }

    public final void LIZ(Function1<? super Integer, Unit> function1, Function1<? super C1662010tLr, Unit> function12) {
        C20008813Qo c20008813QoLJIILIIL;
        PanelInfoCheckedResponse panelInfoCheckedResponse;
        C13RD c13rd = this.LIZ;
        InterfaceC20004513Ox interfaceC20004513Ox = c13rd.LJJIFFI;
        if (interfaceC20004513Ox != null) {
            c20008813QoLJIILIIL = interfaceC20004513Ox.LJIILIIL(C13OQ.LJIIJJI(this.LJI, this.LJFF, c13rd.LJ, this.LIZIZ, this.LJ, this.LIZLLL));
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
        try {
            String strLJIIIZ = C13SB.LJIIIZ(c20008813QoLJIILIIL);
            int length = strLJIIIZ.length() / 1024;
            C13R7 c13r7 = this.LIZ.LJIJI;
            if (c13r7 != null) {
                panelInfoCheckedResponse = (PanelInfoCheckedResponse) c13r7.LIZ.convertJsonToObj(strLJIIIZ, PanelInfoCheckedResponse.class);
            } else {
                panelInfoCheckedResponse = null;
            }
            C13SB.LIZIZ(c20008813QoLJIILIIL);
            if (panelInfoCheckedResponse != null) {
                PanelInfoModel data = panelInfoCheckedResponse.getData();
                if (panelInfoCheckedResponse.checkValue() && data != null) {
                    C13RD c13rd2 = this.LIZ;
                    if (c13rd2.LJJJ == 2) {
                        C13LD.LJ(C13LD.LIZ, c13rd2, this.LIZIZ, data, true, null, 16);
                    }
                    CategoryEffectModel categoryEffectModel = data.getCategoryEffectModel();
                    if (categoryEffectModel != null) {
                        categoryEffectModel.setCache(true);
                    }
                    runOnMainThread(new AwS431S0200000_30(this, data, 80));
                    if (function1 == null) {
                        return;
                    }
                    ((AwS1S0100300_30) function1).invoke(Integer.valueOf(length));
                    return;
                }
            }
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                C13SS c13ss = C13SS.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Json Parse Exception: ");
                sbLIZ.append(th);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c13ss.getClass();
                C13SS.LIZIZ("FetchPanelInfoCheckedCacheTask", strLIZIZ, null);
                C13SB.LIZIZ(c20008813QoLJIILIIL);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C13SB.LIZIZ(c20008813QoLJIILIIL);
                throw th2;
            }
        }
        C1662010tLr c1662010tLr2 = new C1662010tLr(10004);
        LIZIZ(c1662010tLr2);
        if (function12 == null) {
            return;
        }
        ((AwS609S0100000_30) function12).invoke(c1662010tLr2);
    }

    public C20002213Oa(C13RD c13rd, String str, String str2, boolean z, String str3, int i, int i2) {
        super(str2, null);
        this.LIZ = c13rd;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = z;
        this.LJ = str3;
        this.LJFF = i;
        this.LJI = i2;
    }
}
