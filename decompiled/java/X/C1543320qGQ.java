package X;

import android.content.Context;
import android.view.View;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qGQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1543320qGQ implements InterfaceC1538970q9P, InterfaceC1543360qGU {
    public final ConcurrentHashMap<String, C650250Pex> LIZIZ = new ConcurrentHashMap<>();

    public final void LIZJ() {
        for (Map.Entry<String, C650250Pex> entry : this.LIZIZ.entrySet()) {
            if (entry.getValue().LJ) {
                C1543340qGS c1543340qGS = entry.getValue().LIZLLL;
                if (c1543340qGS != null) {
                    c1543340qGS.LIZLLL();
                }
                entry.getValue().LIZLLL = null;
            }
        }
        if (Intrinsics.LJFF(C1535630q41.LIZIZ("try_fix_jsb_not_found_error"), Boolean.TRUE)) {
            this.LIZIZ.clear();
        }
    }

    @Override // X.InterfaceC1538970q9P
    public final void LJII(Context context) {
        Iterator<Map.Entry<String, C650250Pex>> it2 = this.LIZIZ.entrySet().iterator();
        while (it2.hasNext()) {
            C1543340qGS c1543340qGS = it2.next().getValue().LIZLLL;
            if (c1543340qGS != null) {
                c1543340qGS.LJII(context);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0qGT] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1543360qGU
    public final boolean LIZIZ(C1543910qHN c1543910qHN, Object obj, final InterfaceC1543370qGV interfaceC1543370qGV) throws JSONException {
        C1543340qGS c1543340qGS;
        View viewLIZ;
        String strLIZIZ;
        String strLIZIZ2;
        String strLIZIZ3;
        String strLIZIZ4;
        String strLIZIZ5;
        String strLIZIZ6;
        boolean z;
        boolean z2;
        C1544610qIV c1544610qIV;
        C1544610qIV c1544610qIV2;
        C1543080qG2 c1543080qG2;
        C650250Pex c650250Pex;
        String str = null;
        if (this.LIZIZ.get(c1543910qHN.LJFF) != null && ((c650250Pex = this.LIZIZ.get(c1543910qHN.LJFF)) == null || c650250Pex.LIZLLL == null)) {
            c1543910qHN.LJJIFFI.LIZ(Boolean.TRUE, "bridgeInfo_has_been_released");
        }
        C650250Pex c650250Pex2 = this.LIZIZ.get(c1543910qHN.LJFF);
        boolean z3 = false;
        if (c650250Pex2 == null || (c1543340qGS = c650250Pex2.LIZLLL) == 0) {
            return false;
        }
        ?? r0 = new C1051810dTf() { // from class: X.0qGT
            @Override // X.C1051810dTf
            public final void LIZ(int i, Object obj2, String str2) {
                if (obj2 == null) {
                    interfaceC1543370qGV.LIZIZ(C1543260qGK.LIZ(i, str2, null).LIZIZ());
                } else {
                    interfaceC1543370qGV.LIZIZ(obj2);
                }
            }
        };
        c1543340qGS.LIZIZ(obj, r0);
        c1543340qGS.LIZJ(c1543910qHN, obj, r0);
        InterfaceC1544190qHp interfaceC1544190qHp = c1543910qHN.LIZ.LJ;
        if (interfaceC1544190qHp == null || (viewLIZ = interfaceC1544190qHp.LIZ()) == null) {
            viewLIZ = c1543910qHN.LIZ.LJFF;
        }
        C1520360pfO c1520360pfO = new C1520360pfO("JSB_DOWNGRADE_EVENT");
        c1520360pfO.LJIIIIZZ = c1543910qHN.LIZ.LJIIIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jsb_name", c1543910qHN.LJFF);
        C1543330qGR c1543330qGR = C1544000qHW.LJIILLIIL;
        C1283610jVX c1283610jVX = c1543330qGR.LIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1543330qGR.LJIIIZ;
        Long l = (Long) c1283610jVX.LL;
        if (l != null) {
            long jLongValue = l.longValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("0x");
            sbLIZ.append(Long.toHexString(jLongValue));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = null;
        }
        jSONObject.put("allJSB", strLIZIZ);
        Long l2 = (Long) c1543330qGR.LIZIZ.LL;
        if (l2 != null) {
            long jLongValue2 = l2.longValue();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("0x");
            sbLIZ2.append(Long.toHexString(jLongValue2));
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            strLIZIZ2 = null;
        }
        jSONObject.put("allJSBTwo", strLIZIZ2);
        Long l3 = (Long) c1543330qGR.LIZJ.LL;
        if (l3 != null) {
            long jLongValue3 = l3.longValue();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("0x");
            sbLIZ3.append(Long.toHexString(jLongValue3));
            strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        } else {
            strLIZIZ3 = null;
        }
        jSONObject.put("tcp", strLIZIZ3);
        Long l4 = (Long) c1543330qGR.LIZLLL.LL;
        if (l4 != null) {
            long jLongValue4 = l4.longValue();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("0x");
            sbLIZ4.append(Long.toHexString(jLongValue4));
            strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ4);
        } else {
            strLIZIZ4 = null;
        }
        jSONObject.put("search", strLIZIZ4);
        Long l5 = (Long) c1543330qGR.LJ.LL;
        if (l5 != null) {
            long jLongValue5 = l5.longValue();
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("0x");
            sbLIZ5.append(Long.toHexString(jLongValue5));
            strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ5);
        } else {
            strLIZIZ5 = null;
        }
        jSONObject.put("monetization", strLIZIZ5);
        Long l6 = (Long) c1543330qGR.LJFF.LL;
        if (l6 != null) {
            long jLongValue6 = l6.longValue();
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("0x");
            sbLIZ6.append(Long.toHexString(jLongValue6));
            strLIZIZ6 = C2188811AlT.LIZIZ(sbLIZ6);
        } else {
            strLIZIZ6 = null;
        }
        jSONObject.put("xbridge", strLIZIZ6);
        C1543410qGZ c1543410qGZ = c1543910qHN.LIZ.LIZ;
        if (c1543410qGZ != null && (c1544610qIV2 = c1543410qGZ.LJ) != null && (c1543080qG2 = (C1543080qG2) c1544610qIV2.LIZIZ(C1543080qG2.class)) != null) {
            synchronized (c1543080qG2) {
                try {
                    str = c1543080qG2.LIZ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        jSONObject.put(Scene.SCENE_SERVICE, str);
        jSONObject.put("controller", c1543330qGR.LJI.LL);
        jSONObject.put("moreInfos", c1543330qGR.LIZIZ());
        jSONObject.put("logInfos", c1543910qHN.LJJJ);
        jSONObject.put("initialized", c1543910qHN.LJJIZ);
        if (c1543910qHN.LIZ.LIZ == null) {
            z = true;
        } else {
            z = false;
        }
        jSONObject.put("bdxBridge_null", z);
        C1543410qGZ c1543410qGZ2 = c1543910qHN.LIZ.LIZ;
        if (c1543410qGZ2 != null && c1543410qGZ2.LJ != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        jSONObject.put("sdkContext_null", z2);
        C1543410qGZ c1543410qGZ3 = c1543910qHN.LIZ.LIZ;
        if (c1543410qGZ3 == null || (c1544610qIV = c1543410qGZ3.LJ) == null || c1544610qIV.LIZIZ(C1543080qG2.class) == null) {
            z3 = true;
        }
        jSONObject.put("sceneInfo_null", z3);
        c1520360pfO.LIZLLL = jSONObject;
        c1520360pfO.LJIIJJI = EnumC993170bx5.Both;
        C1538660q8u.LIZ(viewLIZ, c1520360pfO.LIZ());
        return true;
    }
}
