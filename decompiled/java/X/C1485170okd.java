package X;

import com.ss.android.ugc.aweme.video.preload.VideoPreloadManager;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0okd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1485170okd implements InterfaceC1485650olP {
    public final Map<C0NKF, InterfaceC1485260okm> LIZ = new HashMap();

    public final InterfaceC1485260okm LIZ(C0NKF c0nkf, C1478300oZY c1478300oZY) {
        InterfaceC1485260okm interfaceC1485260okm;
        if (((HashMap) this.LIZ).containsKey(c0nkf)) {
            return (InterfaceC1485260okm) ((HashMap) this.LIZ).get(c0nkf);
        }
        if (c1478300oZY.getExperiment().enableMDLInitDelay()) {
            final InterfaceC1485260okm interfaceC1485260okm2 = (InterfaceC1485260okm) C1126604au.LIZ(c0nkf.LL);
            interfaceC1485260okm = new InterfaceC1485260okm(interfaceC1485260okm2) { // from class: X.0okl
                public final InterfaceC1485260okm LIZ;

                @Override // X.InterfaceC1485260okm
                public final /* synthetic */ String LJIIJ() {
                    return null;
                }

                @Override // X.InterfaceC1485260okm
                public final /* synthetic */ void LJIIZILJ(boolean z) {
                }

                @Override // X.InterfaceC1485260okm
                public final /* synthetic */ String LJIJJ() {
                    return null;
                }

                @Override // X.InterfaceC1485260okm
                public final /* synthetic */ boolean LJJ(SimVideoUrlModel simVideoUrlModel) {
                    return false;
                }

                @Override // X.InterfaceC1485260okm
                public final /* synthetic */ int LJJII() {
                    return 0;
                }

                @Override // X.InterfaceC1485260okm
                public final /* synthetic */ long LJJIIJ(String str, String str2) {
                    return -1L;
                }

                @Override // X.InterfaceC1485260okm
                public final /* synthetic */ void LJJIIZI(String str, List list) {
                }

                @Override // X.InterfaceC1485260okm
                public final /* synthetic */ String LJJIJ(String str) {
                    return null;
                }

                @Override // X.InterfaceC1485260okm
                public final /* synthetic */ void LJJJIL(String str) {
                }

                @Override // X.InterfaceC1485260okm
                public final /* synthetic */ void LJJJJIZL(int i, String str) {
                }

                @Override // X.InterfaceC1485260okm
                public final /* synthetic */ void LJJJLIIL(boolean z) {
                }

                @Override // X.InterfaceC1485260okm
                public final /* synthetic */ void LJJJLL(InterfaceC1475540oV6 interfaceC1475540oV6) {
                }

                @Override // X.InterfaceC1485260okm
                public final /* synthetic */ void LJJL(int i, int i2) {
                }

                @Override // X.InterfaceC1485260okm
                public final /* synthetic */ void LJJLIIIJ(int i, JSONObject jSONObject) {
                }

                @Override // X.InterfaceC1485260okm
                public final /* synthetic */ long LJJLIIIJJI(SimVideoUrlModel simVideoUrlModel) {
                    return -1L;
                }

                @Override // X.InterfaceC1485260okm
                public final void LIZ() {
                    if (C1478160oZK.LIZIZ) {
                        this.LIZ.LIZ();
                    }
                }

                @Override // X.InterfaceC1485260okm
                public final boolean LJIIJJI() {
                    if (C1478160oZK.LIZIZ) {
                        return this.LIZ.LJIIJJI();
                    }
                    return false;
                }

                @Override // X.InterfaceC1485260okm
                public final boolean LJIJJLI() {
                    if (C1478160oZK.LIZ) {
                        return this.LIZ.LJIJJLI();
                    }
                    return false;
                }

                @Override // X.InterfaceC1485260okm
                public final Map LJJIJIIJI() {
                    return new LinkedHashMap();
                }

                @Override // X.InterfaceC1485260okm
                public final int LJJIJIL() {
                    if (C1478160oZK.LIZIZ) {
                        return this.LIZ.LJJIJIL();
                    }
                    return -1;
                }

                @Override // X.InterfaceC1485260okm
                public final boolean LJJJJI() {
                    if (C1478160oZK.LIZ) {
                        return this.LIZ.LJJJJI();
                    }
                    return false;
                }

                @Override // X.InterfaceC1485260okm
                public final String LJJJJJ() {
                    if (C1478160oZK.LIZIZ) {
                        return this.LIZ.LJJJJJ();
                    }
                    return null;
                }

                @Override // X.InterfaceC1485260okm
                public final void LJJLIIIIJ() {
                    this.LIZ.LJJLIIIIJ();
                }

                @Override // X.InterfaceC1485260okm
                public final File LJJLIIIJILLIZJL() {
                    if (C1478160oZK.LIZIZ) {
                        return this.LIZ.LJJLIIIJILLIZJL();
                    }
                    return null;
                }

                @Override // X.InterfaceC1485260okm
                public final void clearCache() {
                    if (C1478160oZK.LIZIZ) {
                        this.LIZ.clearCache();
                    }
                }

                {
                    this.LIZ = interfaceC1485260okm2;
                }

                @Override // X.InterfaceC1485260okm
                public final void LIZIZ(InterfaceC1475300oUi interfaceC1475300oUi) {
                    this.LIZ.LIZIZ(interfaceC1475300oUi);
                }

                @Override // X.InterfaceC1485260okm
                public final List<C2262431Dgv> LIZJ(SimVideoUrlModel simVideoUrlModel) {
                    if (!C1478160oZK.LIZIZ) {
                        return null;
                    }
                    return this.LIZ.LIZJ(simVideoUrlModel);
                }

                @Override // X.InterfaceC1485260okm
                public final void LIZLLL(InterfaceC1475300oUi interfaceC1475300oUi) {
                    this.LIZ.LIZLLL(interfaceC1475300oUi);
                }

                @Override // X.InterfaceC1485260okm
                public final void LJ(boolean z) {
                    if (C1478160oZK.LIZIZ) {
                        this.LIZ.LJ(z);
                    }
                }

                @Override // X.InterfaceC1485260okm
                public final void LJI(String str) {
                    if (C1478160oZK.LIZIZ) {
                        this.LIZ.LJI(str);
                    }
                }

                @Override // X.InterfaceC1485260okm
                public final void LJII(String str) {
                    if (C1478160oZK.LIZIZ) {
                        this.LIZ.LJII(str);
                    }
                }

                @Override // X.InterfaceC1485260okm
                public final boolean LJIIIIZZ(SimVideoUrlModel simVideoUrlModel) {
                    if (!C1478160oZK.LIZIZ) {
                        return false;
                    }
                    return this.LIZ.LJIIIIZZ(simVideoUrlModel);
                }

                @Override // X.InterfaceC1485260okm
                public final void LJIILIIL(InterfaceC1475290oUh interfaceC1475290oUh) {
                    this.LIZ.LJIILIIL(interfaceC1475290oUh);
                }

                @Override // X.InterfaceC1485260okm
                public final long LJIILL(String str) {
                    if (!C1478160oZK.LIZIZ) {
                        return 0L;
                    }
                    return this.LIZ.LJIILL(str);
                }

                @Override // X.InterfaceC1485260okm
                public final void LJIL(String str) {
                    if (C1478160oZK.LIZIZ) {
                        this.LIZ.LJIL(str);
                    }
                }

                @Override // X.InterfaceC1485260okm
                public final void LJJI(InterfaceC1475290oUh interfaceC1475290oUh) {
                    this.LIZ.LJJI(interfaceC1475290oUh);
                }

                @Override // X.InterfaceC1485260okm
                public final List<C1EJO> LJJIIJZLJL(SimVideoUrlModel simVideoUrlModel) {
                    if (!C1478160oZK.LIZIZ) {
                        return null;
                    }
                    return this.LIZ.LJJIIJZLJL(simVideoUrlModel);
                }

                @Override // X.InterfaceC1485260okm
                public final void LJJIIZ(String str) {
                    if (C1478160oZK.LIZIZ) {
                        this.LIZ.LJJIIZ(str);
                    }
                }

                @Override // X.InterfaceC1485260okm
                public final void LJJIJIIJIL(String str) {
                    if (C1478160oZK.LIZIZ) {
                        this.LIZ.LJJIJIIJIL(str);
                    }
                }

                @Override // X.InterfaceC1485260okm
                public final void LJJIJL(Map<String, String> map) {
                    if (C1478160oZK.LIZIZ) {
                        this.LIZ.LJJIJL(map);
                    }
                }

                @Override // X.InterfaceC1485260okm
                public final void LJJIJLIJ(String str) {
                    if (C1478160oZK.LIZIZ) {
                        this.LIZ.LJJIJLIJ(str);
                    }
                }

                @Override // X.InterfaceC1485260okm
                public final void LJJJ(String str) {
                    if (C1478160oZK.LIZIZ) {
                        this.LIZ.LJJJ(str);
                    }
                }

                @Override // X.InterfaceC1485260okm
                public final int LJJJJL(SimVideoUrlModel simVideoUrlModel) {
                    if (!C1478160oZK.LIZIZ) {
                        return 0;
                    }
                    return this.LIZ.LJJJJL(simVideoUrlModel);
                }

                @Override // X.InterfaceC1485260okm
                public final void LJJJJLI(String str) {
                    if (C1478160oZK.LIZIZ) {
                        this.LIZ.LJJJJLI(str);
                    }
                }

                @Override // X.InterfaceC1485260okm
                public final void LJJJJLL(boolean z) {
                    this.LIZ.LJJJJLL(z);
                }

                @Override // X.InterfaceC1485260okm
                public final void LJJJJZ(SimVideoUrlModel simVideoUrlModel) {
                    if (C1478160oZK.LIZIZ) {
                        this.LIZ.LJJJJZ(simVideoUrlModel);
                    }
                }

                @Override // X.InterfaceC1485260okm
                public final C2262431Dgv LJJJJZI(SimVideoUrlModel simVideoUrlModel) {
                    if (!C1478160oZK.LIZIZ) {
                        return null;
                    }
                    return this.LIZ.LJJJJZI(simVideoUrlModel);
                }

                @Override // X.InterfaceC1485260okm
                public final void LJJJZ(String str) {
                    if (C1478160oZK.LIZIZ) {
                        this.LIZ.LJJJZ(str);
                    }
                }

                @Override // X.InterfaceC1485260okm
                public final long LJJLIIIJL(String str) {
                    if (!C1478160oZK.LIZIZ) {
                        return 0L;
                    }
                    return this.LIZ.LJJLIIIJL(str);
                }

                @Override // X.InterfaceC1485260okm
                public final void LJJLIIIJLLLLLLLZ(SimVideoUrlModel simVideoUrlModel) {
                    if (!C1478160oZK.LIZIZ) {
                        return;
                    }
                    this.LIZ.LJJLIIIJLLLLLLLZ(simVideoUrlModel);
                }

                @Override // X.InterfaceC1485260okm
                public final boolean isCache(SimVideoUrlModel simVideoUrlModel) {
                    if (!C1478160oZK.LIZIZ) {
                        return true;
                    }
                    return this.LIZ.isCache(simVideoUrlModel);
                }

                @Override // X.InterfaceC1485260okm
                public final long LJFF(SimVideoUrlModel simVideoUrlModel, long j) {
                    if (!C1478160oZK.LIZIZ) {
                        return 0L;
                    }
                    return this.LIZ.LJFF(simVideoUrlModel, j);
                }

                @Override // X.InterfaceC1485260okm
                public final long LJIILJJIL(long j, boolean z) {
                    if (!C1478160oZK.LIZIZ) {
                        return -1L;
                    }
                    return this.LIZ.LJIILJJIL(j, z);
                }

                @Override // X.InterfaceC1485260okm
                public final long LJIJI(SimBitRate simBitRate, boolean z) {
                    if (simBitRate != null) {
                        return LJIILL(simBitRate.getUrlKey());
                    }
                    return -1L;
                }

                @Override // X.InterfaceC1485260okm
                public final void LJJIL(SimVideoUrlModel simVideoUrlModel, C0NI4 c0ni4) {
                    if (C1478160oZK.LIZIZ) {
                        this.LIZ.LJJIL(simVideoUrlModel, c0ni4);
                    }
                }

                @Override // X.InterfaceC1485260okm
                public final void LJJJI(String str, String str2) {
                    if (C1478160oZK.LIZIZ) {
                        this.LIZ.LJJJI(str, str2);
                    }
                }

                @Override // X.InterfaceC1485260okm
                public final long LJJJJ(SimBitRate simBitRate, boolean z) {
                    return LJJLIIIJL(simBitRate.getUrlKey());
                }

                @Override // X.InterfaceC1485260okm
                public final boolean LJJLI(int i, List list) {
                    if (!C1478160oZK.LIZIZ) {
                        return false;
                    }
                    return this.LIZ.LJJLI(i, list);
                }

                @Override // X.InterfaceC1485260okm
                public final boolean LJJLIIIJLJLI(int i, List list) {
                    if (!C1478160oZK.LIZIZ) {
                        return false;
                    }
                    return this.LIZ.LJJLIIIJLJLI(i, list);
                }

                @Override // X.InterfaceC1485260okm
                public final String LJJIII(SimVideoUrlModel simVideoUrlModel, String str, String[] strArr) {
                    if (!C1478160oZK.LIZIZ) {
                        return null;
                    }
                    return this.LIZ.LJJIII(simVideoUrlModel, str, strArr);
                }

                @Override // X.InterfaceC1485260okm
                public final void LJJLIIIJJIZ(String str, String str2, long j) {
                    this.LIZ.LJJLIIIJJIZ(str, str2, j);
                }

                @Override // X.InterfaceC1485260okm
                public final void LJIJ(String str, List list, boolean z, boolean z2) {
                    if (C1478160oZK.LIZIZ) {
                        this.LIZ.LJIJ(str, list, z, z2);
                    }
                }

                @Override // X.InterfaceC1485260okm
                public final boolean LJJJLZIJ(SimVideoUrlModel simVideoUrlModel, int i, C0NKD c0nkd, C1475410oUt c1475410oUt) {
                    if (!C1478160oZK.LIZIZ) {
                        return false;
                    }
                    return this.LIZ.LJJJLZIJ(simVideoUrlModel, i, c0nkd, c1475410oUt);
                }

                @Override // X.InterfaceC1485260okm
                public final void LJIIIZ(String str, String str2, boolean z, boolean z2, InterfaceC1475840oVa interfaceC1475840oVa) {
                    if (!C1478160oZK.LIZIZ) {
                        if (interfaceC1475840oVa != null) {
                            interfaceC1475840oVa.LIZIZ(1);
                            return;
                        }
                        return;
                    }
                    this.LIZ.LJIIIZ(str, str2, z, z2, interfaceC1475840oVa);
                }

                @Override // X.InterfaceC1485260okm
                public final void LJIIL(String str, long j, long j2, int i, byte[] bArr) {
                    if (C1478160oZK.LIZIZ) {
                        this.LIZ.LJIIL(str, j, j2, i, bArr);
                    }
                }

                @Override // X.InterfaceC1485260okm
                public final void LJJIFFI(SimVideoUrlModel simVideoUrlModel, String str, boolean z, boolean z2, InterfaceC1475840oVa interfaceC1475840oVa) {
                    if (!C1478160oZK.LIZIZ) {
                        if (interfaceC1475840oVa != null) {
                            interfaceC1475840oVa.LIZIZ(1);
                            return;
                        }
                        return;
                    }
                    this.LIZ.LJJIFFI(simVideoUrlModel, str, z, z2, interfaceC1475840oVa);
                }

                @Override // X.InterfaceC1485260okm
                public final void LJJJJJL(SimVideoUrlModel simVideoUrlModel, String str, boolean z, long j, InterfaceC1475840oVa interfaceC1475840oVa) {
                    if (!C1478160oZK.LIZIZ) {
                        if (interfaceC1475840oVa != null) {
                            interfaceC1475840oVa.LIZIZ(1);
                            return;
                        }
                        return;
                    }
                    this.LIZ.LJJJJJL(simVideoUrlModel, str, z, j, interfaceC1475840oVa);
                }
            };
        } else {
            interfaceC1485260okm = (InterfaceC1485260okm) C1126604au.LIZ(c0nkf.LL);
            interfaceC1485260okm.LJJLIIIIJ();
            interfaceC1485260okm.LJIJJLI();
            VideoPreloadManager.LJI = true;
        }
        ((HashMap) this.LIZ).put(c0nkf, interfaceC1485260okm);
        return interfaceC1485260okm;
    }
}
