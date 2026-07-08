package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS644S0100000_30;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.13PN, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13PN extends AbstractC20000013Ne {
    public static final C2278408wI LIZLLL = new C2278408wI();
    public static final Map<String, ArrayList<InterfaceC1634240sd4>> LJ = new LinkedHashMap();
    public final C13RD LIZ;
    public final ProviderEffect LIZIZ;
    public final String LIZJ;

    @Override // X.AbstractC20000013Ne
    public final void execute() {
        C13LD c13ld = C13LD.LIZ;
        ProviderEffect providerEffect = this.LIZIZ;
        c13ld.getClass();
        String strLJFF = C13LD.LJFF(providerEffect);
        String strSubstring = "";
        if (strLJFF == null) {
            strLJFF = "";
        }
        if (a0.LJJJIL(strLJFF)) {
            runOnMainThread(new AwS431S0200000_30(this, new C1662010tLr(10015), 96));
            return;
        }
        if (a0.LJJJIL(this.LIZIZ.getId())) {
            runOnMainThread(new AwS431S0200000_30(this, new C1662010tLr(10014), 96));
            return;
        }
        C13MA c13maLIZ = this.LIZ.LJJJIL.LIZ(this.LIZJ);
        C2278408wI c2278408wI = LIZLLL;
        c2278408wI.LIZ();
        try {
            Map<String, ArrayList<InterfaceC1634240sd4>> map = LJ;
            if (map.containsKey(this.LIZIZ.getId())) {
                ArrayList arrayList = (ArrayList) ((LinkedHashMap) map).get(this.LIZIZ.getId());
                if (arrayList != null) {
                    arrayList.add(c13maLIZ);
                }
                this.LIZ.LJJJIL.LIZJ(this.LIZJ);
                c2278408wI.LIZIZ();
                return;
            }
            map.put(this.LIZIZ.getId(), new ArrayList<>());
            c2278408wI.LIZIZ();
            if (C504670Jqj.LIZIZ(this.LIZIZ.getPath())) {
                int iLJJJJI = a0.LJJJJI(strLJFF, "/", 0, 6);
                int iLJJJJI2 = a0.LJJJJI(strLJFF, e3.d, 0, 6);
                if (1 <= iLJJJJI && iLJJJJI < iLJJJJI2) {
                    strSubstring = strLJFF.substring(iLJJJJI2, strLJFF.length());
                }
                ProviderEffect providerEffect2 = this.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZ.LJII);
                sbLIZ.append(C13SB.LIZ);
                sbLIZ.append(this.LIZIZ.getId());
                sbLIZ.append(strSubstring);
                providerEffect2.setPath(C2188811AlT.LIZIZ(sbLIZ));
            }
            try {
                ProviderEffect providerEffectLIZ = LIZ(strLJFF, this.LIZIZ.getPath());
                if (providerEffectLIZ != null) {
                    runOnMainThread(new AwS431S0200000_30(this, providerEffectLIZ, 99));
                } else {
                    runOnMainThread(new AwS431S0200000_30(this, new C1662010tLr(10002), 96));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                runOnMainThread(new AwS431S0200000_30(this, new C1662010tLr(e), 96));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c2278408wI.LIZIZ();
            throw th;
        }
    }

    @Override // X.AbstractC20000013Ne
    public final void onCancel() {
        runOnMainThread(new AwS574S0100000_30(this, 424));
    }

    public final ProviderEffect LIZ(String str, String str2) throws IOException, C1633840scQ {
        C13N8 c13n8FetchFromNetwork;
        if (!C13SB.LJ(this.LIZ.LJII)) {
            C13SB.LJIIJ(this.LIZ.LJII);
        }
        String strLIZ = C20012413Ry.LIZ(str2);
        if (strLIZ == null) {
            return null;
        }
        if (C13SB.LJ(strLIZ)) {
            C13SB.LJIIZILJ(strLIZ);
        }
        C0XSU c0xsu = new C0XSU(str, null, C0XSV.GET, null, null, false, null, null, 954);
        C13SQ c13sq = this.LIZ.LJIJJ;
        if (c13sq != null && (c13n8FetchFromNetwork = c13sq.fetchFromNetwork(c0xsu)) != null) {
            C20008713Qn c20008713Qn = new C20008713Qn(c13n8FetchFromNetwork.LIZIZ);
            C20012413Ry.LIZIZ(c20008713Qn, C13SB.LJIILJJIL(strLIZ, false), c13n8FetchFromNetwork.LIZJ, new AwS644S0100000_30(this, 50));
            c20008713Qn.close();
            C20012413Ry.LJIIL(strLIZ, str2, false);
            return this.LIZIZ;
        }
        throw new C1633840scQ(-2, "net response returned empty response!");
    }

    public C13PN(C13RD c13rd, ProviderEffect providerEffect, String str) {
        super(str, null);
        this.LIZ = c13rd;
        this.LIZIZ = providerEffect;
        this.LIZJ = str;
    }
}
