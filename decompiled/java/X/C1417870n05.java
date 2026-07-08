package X;

import com.bytedance.ies.smartmovie.jni.VecMeta;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.MetaExt;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.cutsame.TemplateList;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0n05, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1417870n05 implements InterfaceC1419480n2g {
    public final String LIZ;
    public final String LIZIZ;
    public long LIZJ = -1;
    public long LIZLLL = -1;
    public long LJ = -1;

    @Override // X.InterfaceC1419480n2g
    public final void LIZ() {
        this.LIZJ = System.currentTimeMillis();
    }

    @Override // X.InterfaceC1419480n2g
    public final void LIZIZ() {
        this.LJ = System.currentTimeMillis();
    }

    @Override // X.InterfaceC1419480n2g
    public final void LJFF() {
        this.LIZLLL = System.currentTimeMillis();
    }

    public C1417870n05(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }

    @Override // X.InterfaceC1419480n2g
    public final void LJI(int i, String str, String str2, boolean z) {
        long jLIZLLL = C1417710mzp.LIZLLL(this.LJ);
        String str3 = this.LIZ;
        String str4 = this.LIZIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(!z ? 1 : 0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZ(i, "error_code");
        c0lab.LJ("error_msg", str);
        c0lab.LIZIZ(jLIZLLL, "duration");
        c0lab.LJ("zip_url", str2);
        c0lab.LJ("shoot_way", str3);
        c0lab.LJ("creation_id", str4);
        Map<String, String> map = c0lab.LIZ;
        C20684815ws.LJIILLIIL("tool_performance_autocut_tos", map);
        C1417710mzp.LIZ.getClass();
        C1417710mzp.LJJIZ("tool_performance_autocut_tos", map, z);
    }

    @Override // X.InterfaceC1419480n2g
    public final void LJ(List list, boolean z, int i, int i2, String str, String str2, Long l, String str3, String str4, boolean z2, boolean z3) {
        CutsameDataItem cutsameDataItem;
        String str5;
        Integer numValueOf;
        ArrayList<String> arrayList;
        List<CutsameDataItem> list2;
        long jLIZLLL = C1417710mzp.LIZLLL(this.LIZJ);
        C443120HZe<TemplateList, String, String> c443120HZeLJJLI = s.LJJLI(str3);
        TemplateList first = c443120HZeLJJLI.getFirst();
        String third = c443120HZeLJJLI.getThird();
        Set setLLIIJI = null;
        if (first != null && (list2 = first.templateList) != null) {
            cutsameDataItem = (CutsameDataItem) C13LP.LJJJLL(list2);
        } else {
            cutsameDataItem = null;
        }
        if (z2) {
            s sVar = s.LIZ;
            if (cutsameDataItem != null && (arrayList = cutsameDataItem.ursList) != null) {
                setLLIIJI = C13LP.LLIIJI(arrayList);
            } else {
                if (cutsameDataItem == null) {
                    str5 = null;
                    numValueOf = null;
                }
                sVar.getClass();
                s.LJJJJL(setLLIIJI, str5, numValueOf);
            }
            str5 = cutsameDataItem.templateData;
            numValueOf = Integer.valueOf(cutsameDataItem.templateType);
            sVar.getClass();
            s.LJJJJL(setLLIIJI, str5, numValueOf);
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C1417860n04(third, str3, this, z, cutsameDataItem, list, i, i2, str, jLIZLLL, str2, l, str4, z3, null), 3);
    }

    @Override // X.InterfaceC1419480n2g
    public final void LIZJ(VecMeta vecMeta, boolean z, int i, int i2, String str, String str2, Long l, String str3, String str4, String str5, boolean z2, boolean z3) {
        LJ(C1418020n0K.LIZJ(vecMeta), z, i, i2, str, str2, l, str4, str5, z2, z3);
    }

    @Override // X.InterfaceC1419480n2g
    public final void LIZLLL(boolean z, int i, int i2, String str, String str2, String str3, String str4, String str5, List<MetaExt> list, Boolean bool, String str6, String str7, boolean z2) {
        long jLIZLLL = C1417710mzp.LIZLLL(this.LIZLLL);
        if (str4 != null) {
            C1417710mzp.LJJII(z, i, i2, str, jLIZLLL, str2, str3, this.LIZ, this.LIZIZ, str4, list, str6, str7, z2);
        } else {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C1417880n06(str5, this, z, i, i2, str, jLIZLLL, str2, str3, str6, str7, z2, null), 3);
        }
    }
}
