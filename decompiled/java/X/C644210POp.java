package X;

import Y.ARunnableS110S0100000_10;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApi;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0POp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C644210POp {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static final C644210POp LIZ = new C644210POp();
    public static final C644250POt LIZLLL = new C644250POt();
    public static final C644220POq LJ = new C644220POq();
    public static final C0POF LJFF = new C0POF();
    public static final C644240POs LJI = new C644240POs();

    public static void LJIIIIZZ() {
        LIZIZ = false;
        LIZJ = false;
        C644250POt c644250POt = LIZLLL;
        if (c644250POt.LIZIZ == null) {
            c644250POt.LIZIZ = null;
            c644250POt.LIZ("", "search_domain");
        }
        if (c644250POt.LIZJ == null) {
            c644250POt.LIZJ = null;
            c644250POt.LIZ("", "network");
        }
        if (c644250POt.LIZLLL == null) {
            c644250POt.LIZLLL = null;
            c644250POt.LIZ("", "band_width_quality");
        }
        C644220POq c644220POq = LJ;
        c644220POq.LIZIZ = null;
        c644220POq.LIZJ = null;
        c644220POq.LIZLLL = -2;
        c644220POq.LJ = null;
        c644220POq.LJFF = null;
        c644220POq.LJI = null;
        c644220POq.LJII = null;
        C644240POs c644240POs = LJI;
        c644240POs.LJ = null;
        c644240POs.LIZIZ = null;
        c644240POs.LIZLLL = null;
        c644240POs.LIZJ = null;
        C0POF c0pof = LJFF;
        c0pof.LIZIZ = -1L;
        c0pof.LIZJ = -1L;
        c0pof.LIZLLL = -1L;
        c0pof.LJ = -1L;
        c0pof.LJI = null;
        c0pof.LJFF = false;
    }

    public static boolean LIZ() {
        String str;
        return (LJFF.LIZIZ == -1 || (str = LJI.LIZLLL) == null || str.length() == 0) ? false : true;
    }

    public static void LJI() {
        if (LIZIZ || LIZJ || !LIZ()) {
            return;
        }
        C0POF c0pof = LJFF;
        if (c0pof.LIZIZ != -1 && c0pof.LJI == null) {
            Long lValueOf = Long.valueOf(System.currentTimeMillis() - c0pof.LIZIZ);
            c0pof.LJI = lValueOf;
            c0pof.LIZ(Long.valueOf(lValueOf != null ? lValueOf.longValue() : 0L), "cost");
        }
        LJII();
    }

    public static void LJII() {
        try {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, Object> entry : LIZLLL.LIZ.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    LIZ.getClass();
                    if (LIZIZ(value)) {
                        jSONObject.put(key, value);
                    }
                }
                for (Map.Entry<String, Object> entry2 : LJI.LIZ.entrySet()) {
                    String key2 = entry2.getKey();
                    Object value2 = entry2.getValue();
                    LIZ.getClass();
                    if (LIZIZ(value2)) {
                        jSONObject.put(key2, value2);
                    }
                }
                for (Map.Entry<String, Object> entry3 : LJFF.LIZ.entrySet()) {
                    String key3 = entry3.getKey();
                    Object value3 = entry3.getValue();
                    LIZ.getClass();
                    if (LIZIZ(value3)) {
                        jSONObject.put(key3, value3);
                    }
                }
                for (Map.Entry<String, Object> entry4 : LJ.LIZ.entrySet()) {
                    String key4 = entry4.getKey();
                    Object value4 = entry4.getValue();
                    LIZ.getClass();
                    if (LIZIZ(value4)) {
                        jSONObject.put(key4, value4);
                    }
                }
                AppLogNewUtils.onEventV3("search_trigger_refresh_monitor_v3", jSONObject);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("realpost :  ");
                sbLIZ.append(LIZLLL);
                sbLIZ.append(' ');
                sbLIZ.append(LJ);
                sbLIZ.append(' ');
                sbLIZ.append(LJI);
                sbLIZ.append(' ');
                sbLIZ.append(LJFF);
                C2188811AlT.LIZIZ(sbLIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            LIZJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZJ();
            throw th;
        }
    }

    public static void LIZJ() {
        LJIIIIZZ();
        LIZIZ = true;
    }

    public static C644220POq LIZLLL() {
        return LJ;
    }

    public static C0POF LJ() {
        return LJFF;
    }

    public static boolean LIZIZ(Object obj) {
        Long l;
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            if (num != null && Math.abs(num.intValue()) < 1000000) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof Long) || ((l = (Long) obj) != null && Math.abs(l.longValue()) < 1000000)) {
            return true;
        }
        return false;
    }

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
    public final void onEventStart(SearchResultParam searchResultParam) {
        String keyword;
        String searchFrom;
        LJIIIIZZ();
        C644240POs c644240POs = LJI;
        Integer numValueOf = null;
        if (searchResultParam != null) {
            c644240POs.getClass();
            keyword = searchResultParam.getKeyword();
        } else {
            keyword = null;
        }
        Object obj = "";
        if (c644240POs.LIZLLL == null) {
            c644240POs.LIZLLL = keyword;
            if (keyword == null) {
                keyword = "";
            }
            c644240POs.LIZ(keyword, "search_keyword");
        }
        if (searchResultParam != null) {
            searchFrom = searchResultParam.getSearchFrom();
        } else {
            searchFrom = null;
        }
        if (c644240POs.LIZIZ == null) {
            c644240POs.LIZIZ = searchFrom;
            if (searchFrom == null) {
                searchFrom = "";
            }
            c644240POs.LIZ(searchFrom, "search_source");
        }
        if (searchResultParam != null) {
            numValueOf = Integer.valueOf(searchResultParam.getIndex());
        }
        if (c644240POs.LIZJ == null && numValueOf != null) {
            numValueOf.intValue();
            c644240POs.LIZJ = numValueOf;
            c644240POs.LIZ(numValueOf, "search_position");
        }
        C644250POt c644250POt = LIZLLL;
        c644250POt.getClass();
        SearchApi.LIZ.getClass();
        String str = SearchApi.LIZIZ;
        if (c644250POt.LIZIZ == null) {
            c644250POt.LIZIZ = str;
            if (str == null) {
                str = "";
            }
            c644250POt.LIZ(str, "search_domain");
        }
        EnumC804620VhM enumC804620VhM = C036E.LIZ.LIZIZ;
        if (c644250POt.LIZJ == null) {
            c644250POt.LIZJ = enumC804620VhM;
            Object obj2 = enumC804620VhM;
            if (enumC804620VhM == null) {
                obj2 = "";
            }
            c644250POt.LIZ(obj2, "network");
        }
        EnumC1494480oze enumC1494480ozeLIZIZ = C1494500ozg.LIZ.LIZIZ();
        if (c644250POt.LIZLLL == null) {
            c644250POt.LIZLLL = enumC1494480ozeLIZIZ;
            if (enumC1494480ozeLIZIZ != null) {
                obj = enumC1494480ozeLIZIZ;
            }
            c644250POt.LIZ(obj, "band_width_quality");
        }
        EnumC804620VhM enumC804620VhM2 = c644250POt.LIZJ;
        EnumC804620VhM enumC804620VhM3 = EnumC804620VhM.NONE;
        if (enumC804620VhM2 == enumC804620VhM3 || enumC804620VhM2 == enumC804620VhM3) {
            LIZ.getClass();
            LJ.LIZJ(1, "NO_NETWORK");
        }
        C644220POq c644220POq = LJ;
        if (c644220POq.LJ == null) {
            c644220POq.LJ = 0;
            c644220POq.LIZ(0, "count");
        }
        C0POF c0pof = LJFF;
        c0pof.getClass();
        c0pof.LIZIZ = System.currentTimeMillis();
    }

    public static void LJFF(View view, String str) {
        boolean z;
        C0POF c0pof = LJFF;
        c0pof.getClass();
        LIZ.getClass();
        boolean z2 = LIZIZ;
        boolean z3 = LIZJ;
        if (c0pof.LIZLLL == -1 && !c0pof.LJFF) {
            z = false;
        } else {
            z = true;
        }
        if (!z2 && z && !z3 && Intrinsics.LJFF(str, LJI.LJ)) {
            view.postOnAnimation(new ARunnableS110S0100000_10(c0pof, 133));
        }
    }
}
