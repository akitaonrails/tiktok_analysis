package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.10z9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19424910z9 {
    public static C19403310vf LIZ(n nVar) {
        EnumC587610N2x enumC587610N2x;
        boolean z;
        String strLJIL;
        C19402010vS c19402010vS;
        C19401910vR c19401910vR;
        try {
            if (nVar.LJJIJIIJIL("type") && Intrinsics.LJFF(nVar.LJJIIZ("type").LJIL(), "color_picker")) {
                enumC587610N2x = EnumC587610N2x.COLOR_PICKER;
            } else {
                enumC587610N2x = EnumC587610N2x.GRID;
            }
            String strLJIL2 = nVar.LJJIIZ("key").LJIL();
            String strLJIL3 = nVar.LJJIIZ("name").LJIL();
            String strLJIL4 = nVar.LJJIIZ("tab").LJIL();
            if (!nVar.LJJIJIIJIL("inspirations")) {
                z = true;
            } else {
                z = false;
            }
            C19403310vf c19403310vf = new C19403310vf(strLJIL2, strLJIL3, enumC587610N2x, strLJIL4, z);
            if (nVar.LJJIJIIJIL("color_pickers")) {
                C19401910vR c19401910vR2 = new C19401910vR();
                Iterator<k> it2 = nVar.LJJIIZ("color_pickers").LJIIL().iterator();
                while (it2.hasNext()) {
                    C19402010vS c19402010vSLIZ = C19425010zA.LIZ(it2.next().LJIILIIL());
                    if (c19402010vSLIZ != null) {
                        c19401910vR2.LIZ.add(c19402010vSLIZ);
                    }
                }
                c19403310vf.LJIIIIZZ = c19401910vR2;
                ArrayList<C19402010vS> arrayList = c19401910vR2.LIZ;
                if (arrayList != null && (c19402010vS = arrayList.get(0)) != null && (c19401910vR = c19403310vf.LJIIIIZZ) != null) {
                    c19401910vR.LIZIZ = c19402010vS;
                }
            }
            if (nVar.LJJIJIIJIL("flip")) {
                c19403310vf.LJIIIZ = new C19425210zC(nVar.LJJIIZ("flip").LJIILIIL().LJJIIZ("key").LJIL());
            }
            if (nVar.LJJIJIIJIL("extra")) {
                c19403310vf.LJFF = new C19403110vd(a0.LJJLIIIJILLIZJL(new JSONObject(nVar.LJJIIZ("extra").LJIL()).optString("resets", ""), new String[]{","}, 0, 6));
            }
            if (nVar.LJJIJIIJIL("sliders")) {
                for (k kVar : nVar.LJJIIZ("sliders").LJIIL()) {
                    String strLJIL5 = kVar.LJIILIIL().LJJIIZ("key").LJIL();
                    c19403310vf.LJII.put(strLJIL5, new C19425410zE(strLJIL5, kVar.LJIILIIL().LJJIIZ("name").LJIL(), kVar.LJIILIIL().LJJIIZ("min").LJIIJJI(), kVar.LJIILIIL().LJJIIZ("max").LJIIJJI(), kVar.LJIILIIL().LJJIIZ("default").LJIIJJI(), kVar.LJIILIIL().LJJIIZ("step").LJIIJJI(), c19403310vf));
                }
            }
            if (nVar.LJJIJIIJIL("inspirations")) {
                Iterator<k> it3 = nVar.LJJIIZ("inspirations").LJIIL().iterator();
                while (it3.hasNext()) {
                    n nVarLJIILIIL = it3.next().LJIILIIL();
                    try {
                        C19425110zB c19425110zB = new C19425110zB(nVarLJIILIIL.LJJIIZ("key").LJIL(), nVarLJIILIIL.LJJIIZ("thumbnail").LJIL(), c19403310vf);
                        c19403310vf.LJIIJ.put(c19425110zB.LIZ, c19425110zB);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        e.getMessage();
                    }
                }
            }
            if (nVar.LJJIJIIJIL("group") && (strLJIL = nVar.LJJIIZ("group").LJIL()) != null && strLJIL.length() != 0) {
                c19403310vf.LJIIJJI = strLJIL;
            }
            return c19403310vf;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            e2.getMessage();
            return null;
        }
    }
}
