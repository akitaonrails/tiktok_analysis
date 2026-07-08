package X;

import android.content.Context;
import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import com.bytedance.im.core.proto.ReferenceInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0I1w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC459940I1w implements InterfaceC908930ZlD {
    public final Context LIZ;
    public final String LIZIZ;
    public final Map<String, String> LIZJ = new LinkedHashMap();
    public final Map<String, String> LIZLLL = new LinkedHashMap();

    public Map<String, String> LIZ() {
        return null;
    }

    public abstract Map<String, String> LIZJ();

    public abstract C0I25 LIZLLL();

    public abstract int LJ();

    public ReferenceInfo LJFF() {
        return null;
    }

    public String LJI() {
        return "";
    }

    public abstract InterfaceC459970I1z LJII(C874730YTf c874730YTf);

    @Override // X.InterfaceC908930ZlD
    public final void LIZIZ() {
        C1628906Zj.LIZ(this.LIZ);
        LJIIIIZZ(null);
    }

    public final void LJIIIIZZ(C0YTK c0ytk) {
        LinkedHashMap linkedHashMap;
        C0YHX c0yhxLIZ;
        C0YOZ c0yozLJFF;
        LinkedHashMap linkedHashMap2 = null;
        if (C455040Hss.LIZ()) {
            C0YM2 c0ym2 = C0YM2.TIKTOK_SOCIAL_IM;
            IIMCoreProxyService.LIZ.getClass();
            IIMCoreProxyService iIMCoreProxyServiceLIZ = C875420YVw.LIZ();
            if (iIMCoreProxyServiceLIZ != null && (c0yhxLIZ = iIMCoreProxyServiceLIZ.LIZ(c0ym2)) != null && (c0yozLJFF = c0yhxLIZ.LJFF()) != null) {
                C1265504xJ c1265504xJ = new C1265504xJ(this.LIZIZ);
                int iLJ = LJ();
                C0I25 c0i25LIZLLL = LIZLLL();
                String strLJI = LJI();
                Map<String, String> mapLIZ = LIZ();
                ReferenceInfo referenceInfoLJFF = LJFF();
                Map<String, String> map = this.LIZJ;
                if (!(!map.isEmpty())) {
                    map = null;
                }
                c0yozLJFF.LJI(new C0YP2(c1265504xJ, iLJ, c0i25LIZLLL, strLJI, null, mapLIZ, map, null, null, C901060ZWm.LJ(LIZJ()), null, referenceInfoLJFF, 13712), new C0IC5(null, 3), C0YTP.LIZIZ(c0ytk, null, null, false, 31));
                return;
            }
            C0YTP.LIZ(c0ytk);
            return;
        }
        CopyOnWriteArrayList<InterfaceC1743406sC> copyOnWriteArrayList = C874810YTn.LIZ;
        C874730YTf c874730YTfLIZ = C874780YTk.LIZ();
        c874730YTfLIZ.LIZIZ.LJFF = this.LIZIZ;
        LJII(c874730YTfLIZ);
        C874730YTf c874730YTfLIZ2 = c874730YTfLIZ.LIZ();
        c874730YTfLIZ2.LIZIZ.LJIIL = LJI();
        Map<String, String> mapLIZ2 = LIZ();
        if (mapLIZ2 != null) {
            linkedHashMap = new LinkedHashMap(mapLIZ2);
        } else {
            linkedHashMap = null;
        }
        c874730YTfLIZ2.LIZIZ.LJIIIZ = linkedHashMap;
        c874730YTfLIZ2.LIZIZ.LJIJ = LJFF();
        Map<String, String> map2 = this.LIZJ;
        if (!map2.isEmpty()) {
            linkedHashMap2 = new LinkedHashMap(map2);
        }
        c874730YTfLIZ2.LIZIZ.LJIILIIL = linkedHashMap2;
        c874730YTfLIZ2.LIZIZ.LJIILL = C901060ZWm.LJ(LIZJ());
        if (c0ytk != null) {
            c874730YTfLIZ2.LJFF(c0ytk);
        } else {
            c874730YTfLIZ2.LJ();
        }
    }

    public AbstractC459940I1w(Context context, String str) {
        this.LIZ = context;
        this.LIZIZ = str;
    }
}
