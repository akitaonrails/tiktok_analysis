package X;

import com.bytedance.effectcreatormobile.infrastructure.effectplatform.api.AssetsLibData;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0uUo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1706000uUo implements InterfaceC1705380uTo<AssetsLibData> {
    public final boolean LIZ;
    public final CopyOnWriteArrayList<String> LIZIZ;
    public final String LIZJ;
    public final InterfaceC1364105Vn<AssetsLibData> LIZLLL;
    public final C1706100uUy LJ;

    @Override // X.InterfaceC1705380uTo
    public final void LIZ(Integer num, String str) {
        int iIntValue;
        int iIntValue2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrefabCategoryMonitor failed errorCode: ");
        sbLIZ.append(num);
        sbLIZ.append(" errorMsg:");
        sbLIZ.append(str);
        C1706630uVp.LIZJ("PrefabPaginatedResProvider", C2188811AlT.LIZIZ(sbLIZ));
        C1706130uV1 c1706130uV1LJIIIZ = C2256241DSs.LJIIIZ();
        c1706130uV1LJIIIZ.LIZ(false);
        int iIntValue3 = -999;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -999;
        }
        c1706130uV1LJIIIZ.LIZIZ.LIZJ = iIntValue;
        if (!this.LIZ) {
            C1706100uUy c1706100uUy = this.LJ;
            if (c1706100uUy != null) {
                c1706100uUy.LIZIZ.LJ = "net";
            }
            if (c1706100uUy != null) {
                c1706100uUy.LIZIZ.LIZJ = -2001;
                if (num != null) {
                    iIntValue2 = num.intValue();
                } else {
                    iIntValue2 = -999;
                }
                c1706100uUy.LIZIZ.LIZLLL = iIntValue2;
            }
            C1706100uUy c1706100uUy2 = this.LJ;
            if (c1706100uUy2 != null) {
                c1706100uUy2.LJFF();
            }
            C1706090uUx c1706090uUxLJIIJ = C2256241DSs.LJIIJ();
            C1706050uUt c1706050uUt = c1706090uUxLJIIJ.LIZIZ;
            c1706050uUt.LJII = "net";
            c1706050uUt.LJIIIZ = -2001;
            if (num != null) {
                iIntValue3 = num.intValue();
            }
            c1706090uUxLJIIJ.LIZIZ.LJIIJ = iIntValue3;
        }
        InterfaceC1364105Vn<AssetsLibData> interfaceC1364105Vn = this.LIZLLL;
        C189200o6.m2constructorimpl(null);
        interfaceC1364105Vn.resumeWith(null);
    }

    @Override // X.InterfaceC1705380uTo
    public final void LIZIZ(AssetsLibData assetsLibData, boolean z) {
        Integer numValueOf;
        List<AssetsLibData.AssetsLibCategory> list;
        AssetsLibData assetsLibData2 = assetsLibData;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrefabCategoryMonitor success size: ");
        if (assetsLibData2 != null && (list = assetsLibData2.categories) != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C1706630uVp.LIZ("PrefabPaginatedResProvider", C2188811AlT.LIZIZ(sbLIZ));
        if (!z) {
            this.LIZIZ.add(this.LIZJ);
        }
        C1706130uV1 c1706130uV1LJIIIZ = C2256241DSs.LJIIIZ();
        c1706130uV1LJIIIZ.LIZ(z);
        c1706130uV1LJIIIZ.LIZIZ.LIZJ = 1;
        C1706090uUx c1706090uUxLJIIJ = C2256241DSs.LJIIJ();
        if (z) {
            C1706100uUy c1706100uUy = this.LJ;
            if (c1706100uUy != null) {
                c1706100uUy.LIZIZ.LJ = "cache_disk";
            }
            c1706090uUxLJIIJ.LIZIZ.LJII = "cache_disk";
        } else {
            C1706100uUy c1706100uUy2 = this.LJ;
            if (c1706100uUy2 != null) {
                c1706100uUy2.LIZIZ.LJ = "net";
            }
            c1706090uUxLJIIJ.LIZIZ.LJII = "net";
        }
        InterfaceC1364105Vn<AssetsLibData> interfaceC1364105Vn = this.LIZLLL;
        C189200o6.m2constructorimpl(assetsLibData2);
        interfaceC1364105Vn.resumeWith(assetsLibData2);
    }

    public C1706000uUo(boolean z, CopyOnWriteArrayList copyOnWriteArrayList, String str, C23260099m c23260099m, C1706100uUy c1706100uUy) {
        this.LIZ = z;
        this.LIZIZ = copyOnWriteArrayList;
        this.LIZJ = str;
        this.LIZLLL = c23260099m;
        this.LJ = c1706100uUy;
    }
}
