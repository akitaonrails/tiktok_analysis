package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.q;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.06nc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1715006nc {
    public static final List<Regex> LIZ = C1697810uHb.LJIIJJI(new Regex(".*\\.lastEditTime"), new Regex(".*\\.saveTime"), new Regex("creativeInfo\\.version"));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1230));

    public static boolean LIZJ(k kVar) {
        if (kVar != null && !(kVar instanceof m)) {
            if (kVar instanceof q) {
                q qVarLJIILJJIL = kVar.LJIILJJIL();
                Object obj = qVarLJIILJJIL.LL;
                if (obj instanceof String) {
                    if (qVarLJIILJJIL.LJIL().length() == 0) {
                        return true;
                    }
                    return false;
                }
                if (obj instanceof Number) {
                    if (qVarLJIILJJIL.LJIIIZ() == 0.0d) {
                        return true;
                    }
                    return false;
                }
                if ((obj instanceof Boolean) && !qVarLJIILJJIL.LJ()) {
                    return true;
                }
                return false;
            }
            if (kVar instanceof h) {
                if (kVar.LJIIL().size() == 0) {
                    return true;
                }
                return false;
            }
            if ((kVar instanceof n) && kVar.LJIILIIL().size() == 0) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static Object LIZLLL(k kVar) {
        kVar.getClass();
        if (kVar instanceof m) {
            return null;
        }
        if (kVar instanceof q) {
            q qVarLJIILJJIL = kVar.LJIILJJIL();
            Object obj = qVarLJIILJJIL.LL;
            if (obj instanceof Boolean) {
                return Boolean.valueOf(qVarLJIILJJIL.LJ());
            }
            if (obj instanceof Number) {
                return qVarLJIILJJIL.LJIJ();
            }
            return qVarLJIILJJIL.LJIL();
        }
        if (!(kVar instanceof h) && !(kVar instanceof n)) {
            return kVar.toString();
        }
        return kVar.toString();
    }

    public static C2393209Zi LIZ(Object obj, Object obj2) {
        C01GW c01gw = LIZIZ;
        k jsonTree = GsonProtectorUtils.toJsonTree((Gson) c01gw.getValue(), obj);
        k jsonTree2 = GsonProtectorUtils.toJsonTree((Gson) c01gw.getValue(), obj2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LIZIZ(jsonTree, jsonTree2, "", 0, linkedHashMap, linkedHashMap2, linkedHashMap3, true);
        return new C2393209Zi(linkedHashMap, linkedHashMap2, linkedHashMap3);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(com.google.gson.k r8, com.google.gson.k r9, java.lang.String r10, int r11, java.util.Map r12, java.util.Map r13, java.util.Map r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1715006nc.LIZIZ(com.google.gson.k, com.google.gson.k, java.lang.String, int, java.util.Map, java.util.Map, java.util.Map, boolean):void");
    }
}
