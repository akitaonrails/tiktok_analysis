package X;

import com.ss.android.ugc.playerkit.radar.SimRadar;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0oPQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1472020oPQ extends AbstractC1472980oQy implements InterfaceC1467760oIY {
    public C1472150oPd LL;
    public String LLILLJJLI;

    public final String toString() {
        return "VidDataSource";
    }

    @Override // X.AbstractC1472980oQy, X.InterfaceC1471870oPB
    public final void LIZJ(C1472150oPd c1472150oPd) {
        SimRadar.keyScan("TTPlayer", "EngineDataSourceHelper", "VidDataSource.onRelease");
        ((CopyOnWriteArrayList) c1472150oPd.LJIJJLI.LL).remove(this);
    }

    @Override // X.InterfaceC1471870oPB
    public final void LIZLLL(Map<String, String> map) {
        ((HashMap) map).put("is_video_id", "1");
    }

    @Override // X.InterfaceC1467760oIY
    public final boolean LJJIIZI(C1470240oMY c1470240oMY) {
        if (this.LL == null) {
            return false;
        }
        C1474600oTa c1474600oTa = new C1474600oTa(c1470240oMY);
        String str = this.LLILLJJLI;
        boolean z = C1479290ob9.LIZ;
        EnumC2281151EQn enumC2281151EQnLIZ = C2281201EQs.LIZ(C607330Nrv.LIZ.LIZ().getProperResolution(str, c1474600oTa));
        if (enumC2281151EQnLIZ == EnumC2281151EQn.Undefine) {
            enumC2281151EQnLIZ = TTVideoEngine.LJJIJL(c1470240oMY, EnumC2281151EQn.Standard, 1);
        }
        this.LL.LJIILIIL(enumC2281151EQnLIZ);
        return false;
    }

    @Override // X.InterfaceC1471870oPB
    public final void LIZ(C1472150oPd c1472150oPd, String str, final C1472990oQz c1472990oQz, Map<String, Object> map) {
        EnumC2281151EQn enumC2281151EQnLIZ;
        this.LL = c1472150oPd;
        this.LLILLJJLI = C1472050oPT.LIZIZ("group_id", map);
        c1472150oPd.LJIJJLI.LIZLLL(this);
        c1472150oPd.LIZJ(203, 1);
        c1472150oPd.LIZJ(160, 1);
        if (c1472990oQz.LJIILJJIL) {
            c1472150oPd.LIZJ(29, 1);
            AbstractC1472980oQy.LJ(c1472150oPd, c1472990oQz);
        } else {
            EnumC2281141EQm enumC2281141EQm = c1472990oQz.LJIIIZ;
            if (enumC2281141EQm != null) {
                enumC2281151EQnLIZ = C2281201EQs.LIZ(enumC2281141EQm);
            } else {
                enumC2281151EQnLIZ = EnumC2281151EQn.SuperHigh;
            }
            c1472150oPd.LJIILIIL(enumC2281151EQnLIZ);
        }
        c1472150oPd.LJJIIZ(c1472990oQz.LJ);
        if (c1472990oQz.LJIIL != 0) {
            c1472150oPd.LIZJ(34, 1);
        } else {
            c1472150oPd.LIZJ(34, 0);
        }
        if (c1472990oQz.LJIILIIL == 0) {
            c1472150oPd.LIZJ(37, 0);
        } else {
            c1472150oPd.LIZJ(37, 1);
        }
        if (c1472990oQz.LJJIFFI == 2) {
            c1472150oPd.LJJI(2, null);
            c1472150oPd.LIZ.LLLLLZ = new InterfaceC1467770oIZ() { // from class: X.0oPS
                @Override // X.InterfaceC1467770oIZ
                public final String LIZ(int i, Map map2) {
                    C1472990oQz c1472990oQz2 = c1472990oQz;
                    return C786410Ut5.j4("https://%s/?%s", new Object[]{c1472990oQz2.LIZLLL, c1472990oQz2.LJI});
                }
            };
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C786410Ut5.j4("https://%s/video/drm/v1/bdtoken?aid=", new Object[]{c1472990oQz.LJIILL}));
            sbLIZ.append(c1472990oQz.LJII);
            sbLIZ.append("&vid=%s&kid=%s");
            c1472150oPd.LLJILJIL(C2188811AlT.LIZIZ(sbLIZ));
            c1472150oPd.LJJI(1, c1472990oQz.LJFF);
            c1472150oPd.LIZ.LLLLLZ = new InterfaceC1467770oIZ() { // from class: X.0oPR
                @Override // X.InterfaceC1467770oIZ
                public final String LIZ(int i, Map map2) {
                    StringBuilder sb = new StringBuilder();
                    HashMap map3 = (HashMap) map2;
                    if (map3.size() > 0) {
                        for (String str2 : map3.keySet()) {
                            sb.append("&");
                            sb.append(str2);
                            sb.append("=");
                            sb.append((String) map3.get(str2));
                        }
                    }
                    C1472990oQz c1472990oQz2 = c1472990oQz;
                    return C786410Ut5.j4("%s/video/openapi/v1/?action=GetPlayInfo&video_id=%s&ptoken=%s&aid=%s%s", new Object[]{c1472990oQz2.LIZLLL, c1472990oQz2.LJ, c1472990oQz2.LJI, c1472990oQz2.LJII, sb.toString()});
                }
            };
        }
        if (c1472990oQz.LJIIIIZZ) {
            c1472150oPd.LIZJ(33, 1);
            c1472150oPd.LIZJ(17, 1);
        } else {
            c1472150oPd.LIZJ(33, 0);
            c1472150oPd.LIZJ(17, 0);
        }
    }
}
