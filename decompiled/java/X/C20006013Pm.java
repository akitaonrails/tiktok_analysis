package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.effectmanager.common.model.FetchModelType;
import com.ss.ugc.effectplatform.model.TagInfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.13Pm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20006013Pm extends AbstractC20000013Ne {
    public final C13RD LIZ;
    public final C20008613Qm LIZIZ;
    public final int LIZJ;
    public final C13QD LIZLLL;
    public final List<String> LJ;
    public final C557050Lt1 LJFF;

    public C20006013Pm() {
        throw null;
    }

    @Override // X.AbstractC20000013Ne
    public final void onCancel() {
    }

    public final C0XSU buildRequest() {
        Object c098200Yq;
        Object c098200Yq2;
        HashMap map = new HashMap();
        String str = this.LIZ.LIZIZ;
        if (str == null) {
            str = "";
        }
        map.put("sdk_version", str);
        String str2 = this.LIZ.LJI;
        map.put("device_type", str2 != null ? str2 : "");
        if (this.LIZ.LJJIJ == FetchModelType.ZIP) {
            map.put("url_type", "zip");
        } else {
            map.put("url_type", "source");
        }
        EnumC19364410pO enumC19364410pO = this.LIZ.LJJIJIIJIL;
        if (enumC19364410pO == null) {
            enumC19364410pO = EnumC19364410pO.ONLINE;
        }
        map.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(enumC19364410pO.ordinal()));
        int i = this.LIZJ;
        if (i > 0) {
            map.put("busi_id", String.valueOf(i));
        }
        try {
            c098200Yq = this.LIZIZ.LIZLLL("model/effect_local_config.json");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str3 = (String) c098200Yq;
        if (str3 != null) {
            try {
                C13R7 c13r7 = this.LIZ.LJIJI;
                c098200Yq2 = c13r7 != null ? (TagInfo) c13r7.LIZ.convertJsonToObj(str3, TagInfo.class) : null;
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            TagInfo tagInfo = (TagInfo) (C189200o6.m7isFailureimpl(c098200Yq2) ? null : c098200Yq2);
            if (tagInfo != null) {
                map.put("tag", tagInfo.tag);
            }
        }
        List<String> list = this.LJ;
        if (list != null) {
            map.put("required_model_list", C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62));
        }
        map.putAll(C13RE.LIZ(this.LIZ, false));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ.LJJIIJZLJL);
        sbLIZ.append(this.LIZ.LJJJLIIL == 2 ? "/model/api/list" : "/model/api/arithmetics");
        return new C0XSU(C1535105zh.LIZ(map, C2188811AlT.LIZIZ(sbLIZ)), null, C0XSV.GET, null, null, false, null, null, 1018);
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x00ba: IGET (r0 I:X.13RD) = (r6 I:X.13Pm) A[Catch: all -> 0x00ce] (LINE:186) X.13Pm.LIZ X.13RD, block:B:43:0x00b3 */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.13Pm] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.AbstractC20000013Ne
    public final void execute() {
        ?? r6;
        String str;
        Map<String, String> map;
        InterfaceC20008913Qp interfaceC20008913Qp;
        C13QE c13qeLIZ = C13QF.LIZ();
        try {
            try {
                if (this.isCanceled) {
                    return;
                }
                C0XSU c0xsuBuildRequest = buildRequest();
                C13SQ c13sq = this.LIZ.LJIJJ;
                C13N8 c13n8FetchFromNetwork = c13sq != null ? c13sq.fetchFromNetwork(c0xsuBuildRequest) : null;
                long jLIZ = c13qeLIZ.LIZ();
                String strLIZ = (c13n8FetchFromNetwork == null || (interfaceC20008913Qp = c13n8FetchFromNetwork.LIZIZ) == null) ? null : C20009013Qq.LIZ(interfaceC20008913Qp);
                long jLIZ2 = c13qeLIZ.LIZ() - jLIZ;
                if (c13n8FetchFromNetwork == null || (map = c13n8FetchFromNetwork.LJ) == null || (str = map.get("x-tt-logid")) == null) {
                    str = "";
                }
                if (strLIZ == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("responseString return null when convertToString, errorMsg: ");
                    sbLIZ.append(c13n8FetchFromNetwork != null ? c13n8FetchFromNetwork.LIZLLL : null);
                    LIZ(10026, C2188811AlT.LIZIZ(sbLIZ), c13qeLIZ.LIZ(), str);
                    return;
                }
                if (C504670Jqj.LIZIZ(strLIZ)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("responseString is empty when convertToString, errorMsg: ");
                    sbLIZ2.append(c13n8FetchFromNetwork != null ? c13n8FetchFromNetwork.LIZLLL : null);
                    LIZ(10026, C2188811AlT.LIZIZ(sbLIZ2), c13qeLIZ.LIZ(), str);
                    return;
                }
                C13Q6 c13q6LIZJ = LIZJ(strLIZ);
                if (c13q6LIZJ == null) {
                    LIZ(10026, "result return null when parseResponse", c13qeLIZ.LIZ(), str);
                } else {
                    LIZIZ(c13q6LIZJ, jLIZ, jLIZ2, c13qeLIZ.LIZ(), strLIZ.length());
                    this.LIZ.getClass();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                long jLIZ3 = c13qeLIZ.LIZ();
                r6.LIZ.getClass();
                String message = e.getMessage();
                if (message == null) {
                    message = "exception caught, but no message";
                }
                r6.LIZ(-2, message, jLIZ3, "");
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C13Q6 LIZJ(java.lang.String r27) {
        /*
            Method dump skipped, instruction units count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20006013Pm.LIZJ(java.lang.String):X.13Q6");
    }

    public C20006013Pm(C13RD c13rd, C20008613Qm c20008613Qm, int i, C20006113Pn c20006113Pn) {
        super(null, null);
        this.LIZ = c13rd;
        this.LIZIZ = c20008613Qm;
        this.LIZJ = i;
        this.LIZLLL = c20006113Pn;
        this.LJ = null;
        this.LJFF = new C557050Lt1(false);
    }

    public final void LIZ(int i, String str, long j, String str2) {
        String str3;
        String str4;
        if (str == null) {
            str3 = "";
        } else {
            str3 = str;
        }
        C13RD c13rd = this.LIZ;
        InterfaceC1633730scF interfaceC1633730scF = c13rd.LJIJJLI;
        if (interfaceC1633730scF != null) {
            Pair[] pairArr = new Pair[6];
            int size = 0;
            pairArr[0] = new Pair("error_code", Integer.valueOf(i));
            boolean z = true;
            pairArr[1] = new Pair("log_id", str2);
            pairArr[2] = new Pair("duration", Long.valueOf(j));
            List<String> list = this.LJ;
            if (list != null && !list.isEmpty()) {
                z = false;
            }
            pairArr[3] = new Pair("is_all_model_info", Boolean.valueOf(z));
            List<String> list2 = this.LJ;
            if (list2 != null) {
                size = list2.size();
            }
            pairArr[4] = new Pair("fetch_model_info_count", Integer.valueOf(size));
            if (this.LIZ.LJJJLIIL == 2) {
                str4 = "/model/api/list";
            } else {
                str4 = "/model/api/arithmetics";
            }
            pairArr[5] = new Pair("url_path", str4);
            C19997513Mf.LIZ(interfaceC1633730scF, false, "model_info_list", c13rd, C2097608Jq.LJIIIIZZ(pairArr), str3);
        }
        C13QD c13qd = this.LIZLLL;
        if (c13qd != null) {
            c13qd.LIZ(new RuntimeException(str));
        }
    }

    public final void LIZIZ(C13Q6 c13q6, long j, long j2, long j3, long j4) {
        String str;
        C13RD c13rd = this.LIZ;
        InterfaceC1633730scF interfaceC1633730scF = c13rd.LJIJJLI;
        if (interfaceC1633730scF != null) {
            Pair[] pairArr = new Pair[7];
            int size = 0;
            pairArr[0] = new Pair("duration", Long.valueOf(j3));
            boolean z = true;
            pairArr[1] = new Pair("network_time", Long.valueOf(j));
            pairArr[2] = new Pair("json_time", Long.valueOf(j2));
            pairArr[3] = new Pair("size", Long.valueOf(j4));
            List<String> list = this.LJ;
            if (list != null && !list.isEmpty()) {
                z = false;
            }
            pairArr[4] = new Pair("is_all_model_info", Boolean.valueOf(z));
            List<String> list2 = this.LJ;
            if (list2 != null) {
                size = list2.size();
            }
            pairArr[5] = new Pair("fetch_model_info_count", Integer.valueOf(size));
            if (this.LIZ.LJJJLIIL == 2) {
                str = "/model/api/list";
            } else {
                str = "/model/api/arithmetics";
            }
            pairArr[6] = new Pair("url_path", str);
            C19997513Mf.LIZ(interfaceC1633730scF, true, "model_info_list", c13rd, C2097608Jq.LJIIIIZZ(pairArr), "");
        }
        C13QD c13qd = this.LIZLLL;
        if (c13qd != null) {
            c13qd.LIZIZ(c13q6);
        }
    }
}
