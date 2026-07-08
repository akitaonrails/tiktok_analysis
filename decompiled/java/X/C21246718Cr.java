package X;

import android.net.Uri;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.util.LazyKt;
import com.bytedance.android.btm.api.util.LazyNullable;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18Cr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21246718Cr {
    public static final C21246718Cr LIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZIZ;
    public static final LazyNullable LIZJ;
    public static volatile BcmParams LIZLLL;
    public static volatile long LJ;
    public static volatile String LJFF;
    public static final C01GW LJI;
    public static volatile boolean LJII;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C21246718Cr.class, "bcmParamsCallback", "getBcmParamsCallback()Lcom/bytedance/android/btm/impl/virtualnode/VirtualNodeBcmParamsCallback;", 0);
        C13LE.LIZ.getClass();
        LIZIZ = new InterfaceC2217461Bqa[]{c2217371BqR};
        LIZ = new C21246718Cr();
        LIZJ = LazyKt.INSTANCE.lazyNullable(new C18C2());
        LJ = -1L;
        LJI = C452501pT.LIZIZ(new C21247318Cx());
    }

    public static C18EH LIZIZ() {
        return (C18EH) LJI.getValue();
    }

    public static String LIZJ(String str, List list) {
        String strLIZIZ;
        String strLIZIZ2 = "";
        try {
            Uri uri = UriProtector.parse(str);
            StringBuilder sb = new StringBuilder();
            sb.append(uri.getScheme());
            sb.append("://");
            sb.append(uri.getHost());
            String path = uri.getPath();
            if (path == null) {
                path = "";
            }
            sb.append(path);
            String string = sb.toString();
            if (list.isEmpty()) {
                return string;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                String queryParameter = UriProtector.getQueryParameter(uri, str2);
                if (queryParameter != null) {
                    C21246718Cr c21246718Cr = LIZ;
                    C13BV c13bv = C13BV.INSTANCE;
                    c21246718Cr.getClass();
                    String strLJZL = C13LN.LJZL(80, LIZJ(queryParameter, c13bv));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str2);
                    sbLIZ.append('=');
                    sbLIZ.append(Uri.encode(strLJZL));
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    strLIZIZ = null;
                }
                if (strLIZIZ != null) {
                    arrayList.add(strLIZIZ);
                }
            }
            if (arrayList.isEmpty()) {
                return string;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(string);
            sbLIZ2.append('?');
            sbLIZ2.append(C13LP.LJJLIIIJ(arrayList, "&", null, null, 0, null, null, 62));
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            return strLIZIZ2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return strLIZIZ2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02de  */
    /* JADX WARN: Type inference failed for: r1v28, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, java.lang.String] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZ(java.lang.String r38, java.lang.String r39, int r40, com.bytedance.android.bcm.api.model.BcmParams r41) {
        /*
            Method dump skipped, instruction units count: 937
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21246718Cr.LIZ(java.lang.String, java.lang.String, int, com.bytedance.android.bcm.api.model.BcmParams):java.lang.String");
    }

    public static void LIZLLL(String str, String str2, String str3, int i, String str4, BcmParams bcmParams) {
        int i2;
        String str5;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("original_url", str);
            jSONObject.put("source", str2);
            jSONObject.put("source_btm_token", str3);
            if (a0.LJJJIL(str3)) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            jSONObject.put("create_token_success", i2);
            if (i == 0) {
                str5 = "allowlist";
            } else {
                str5 = "blocklist";
            }
            jSONObject.put("allow_mode", str5);
            jSONObject.put("message", str4);
            if (bcmParams != null) {
                jSONObject.put("bcm", bcmParams.toJSON());
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C1523880pl4 c1523880pl4 = new C1523880pl4("btm_external_evoke", jSONObject);
        C18D5 c18d5 = C18D5.LIZ;
        if (C18D5.LIZLLL == null) {
            c18d5.LIZIZ();
        }
        C18D5.LIZLLL.onEventV3(c1523880pl4);
    }
}
