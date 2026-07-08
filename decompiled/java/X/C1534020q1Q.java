package X;

import android.net.Uri;
import com.bytedance.forest.chain.fetchers.CDNFetcher;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0q1Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1534020q1Q {
    public static String LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_expired_time");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZLLL(String str) {
        Object c098200Yq;
        String lowerCase;
        String strLJJLJ;
        try {
            c098200Yq = UriProtector.parse(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Uri uri = (Uri) c098200Yq;
        if (uri == null) {
            return "";
        }
        String path = uri.getPath();
        if (path == null || (strLJJLJ = a0.LJJLJ('.', path, "")) == null || (lowerCase = strLJJLJ.toLowerCase(Locale.ENGLISH)) == null) {
            lowerCase = "";
        }
        if (!(!a0.LJJJIL(lowerCase))) {
            return "";
        }
        return e3.d.concat(lowerCase);
    }

    public static String LJFF(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_query");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d8, code lost:
    
        if (r6 == false) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1534110q1Z LIZIZ(X.AbstractC1522730pjD r15, X.C1534000q1O r16) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1534020q1Q.LIZIZ(X.0pjD, X.0q1O):X.0q1Z");
    }

    public static C1534110q1Z LIZ(String str, String str2, boolean z) throws IOException {
        Object c098200Yq;
        Map map;
        String stringJustDisk;
        Long lLJIILIIL;
        long jLongValue;
        Object c098200Yq2;
        String str3 = str2;
        C1534250q1n c1534250q1n = C1534250q1n.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[createDiskCache] url: ");
        sbLIZ.append(str);
        C1534250q1n.LIZ(c1534250q1n, "ResponseCache", C2188811AlT.LIZIZ(sbLIZ));
        boolean z2 = true;
        List listLJJLIIIJ = a0.LJJLIIIJ(a0.LJJLL('.', str3, str3), new char[]{'-'}, false, 0, 6);
        CDNFetcher.Companion.getClass();
        C0VSJ c0vsj = new C0VSJ(C1534430q25.LIZ(), str3);
        Object obj = null;
        if (c0vsj.isFile()) {
            if (c0vsj.length() != 0) {
                Keva keva = C1534880q2o.LIZ;
                if (keva.contains(str3)) {
                    String stringJustDisk2 = keva.getStringJustDisk(LJFF(str3), null);
                    if (stringJustDisk2 != null) {
                        try {
                            C1529710puT.LIZ.getClass();
                            c098200Yq = C1529710puT.LIZJ(stringJustDisk2);
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq)) {
                            c098200Yq = null;
                        }
                        map = (Map) c098200Yq;
                    } else {
                        map = null;
                    }
                    int size = listLJJLIIIJ.size();
                    if (size != 2) {
                        if (size == 3) {
                            Long lLJIILIIL2 = C2095008Iq.LJIILIIL((String) ListProtector.get(listLJJLIIIJ, 2));
                            if (lLJIILIIL2 != null) {
                                long jLongValue2 = lLJIILIIL2.longValue();
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append((String) ListProtector.get(listLJJLIIIJ, 0));
                                sbLIZ2.append('-');
                                sbLIZ2.append(jLongValue2);
                                sbLIZ2.append(LIZLLL(str));
                                stringJustDisk = C2188811AlT.LIZIZ(sbLIZ2);
                                jLongValue = lLJIILIIL2.longValue();
                            } else {
                                throw new IllegalArgumentException("ResponseCache [createDiskCache] file name not valid");
                            }
                        } else {
                            throw new IllegalArgumentException("ResponseCache [createDiskCache] file name not valid");
                        }
                    } else {
                        Keva keva2 = C1534880q2o.LIZ;
                        stringJustDisk = C1534880q2o.LIZ.getStringJustDisk(LIZJ(str3), null);
                        if (stringJustDisk != null) {
                            if (z) {
                                C1534880q2o.LIZ(LIZJ(str3));
                            }
                            lLJIILIIL = C2095008Iq.LJIILIIL((String) ListProtector.get(a0.LJJLIIIJ(a0.LJJLL('.', stringJustDisk, stringJustDisk), new char[]{'-'}, false, 0, 6), 1));
                            if (lLJIILIIL == null) {
                            }
                            jLongValue = lLJIILIIL.longValue();
                            z2 = z;
                        } else {
                            stringJustDisk = str3;
                        }
                        lLJIILIIL = C2095008Iq.LJIILIIL((String) ListProtector.get(listLJJLIIIJ, 1));
                        if (lLJIILIIL == null) {
                            throw new IllegalArgumentException("ResponseCache [createDiskCache] file name not valid");
                        }
                        jLongValue = lLJIILIIL.longValue();
                        z2 = z;
                    }
                    if (stringJustDisk != str3) {
                        C1534250q1n.LIZ(C1534250q1n.LIZ, "ResponseCache", "[createDiskCache] cache key updated or lost, cache file: " + str3 + ", cache key: " + stringJustDisk);
                        if (z2) {
                            C0VSJ c0vsj2 = new C0VSJ(c0vsj.getParent(), stringJustDisk);
                            String stringJustDisk3 = C1534880q2o.LIZ.getStringJustDisk(str3, null);
                            if (stringJustDisk3 != null) {
                                C1529710puT.LIZ.getClass();
                                try {
                                    c098200Yq2 = Boolean.valueOf(c0vsj.renameTo(c0vsj2));
                                    C189200o6.m2constructorimpl(c098200Yq2);
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    c098200Yq2 = new C098200Yq(th2);
                                    C189200o6.m2constructorimpl(c098200Yq2);
                                }
                                if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                                    obj = c098200Yq2;
                                }
                                Boolean bool = (Boolean) obj;
                                if (bool != null && bool.booleanValue()) {
                                    C1534880q2o.LIZIZ(stringJustDisk, stringJustDisk3);
                                    if (stringJustDisk2 != null) {
                                        C1534880q2o.LIZIZ(LJFF(stringJustDisk), stringJustDisk2);
                                    }
                                    C1534880q2o.LIZ(str3);
                                    C1534880q2o.LIZ(LJFF(str3));
                                    c0vsj = c0vsj2;
                                    str3 = stringJustDisk;
                                } else {
                                    throw new IOException("ResponseCache [createDiskCache] rename failed");
                                }
                            } else {
                                throw new IOException("ResponseCache [createDiskCache] no repo info found");
                            }
                        }
                    } else {
                        str3 = stringJustDisk;
                    }
                    return new C1534110q1Z(str, str3, jLongValue, c0vsj, map);
                }
                throw new IllegalArgumentException("ResponseCache [createDiskCache] repo not exists");
            }
            throw new IllegalArgumentException("ResponseCache [createDiskCache] cache is invalid since the file length is 0");
        }
        throw new IllegalArgumentException("ResponseCache [createDiskCache] cache not exists or not a file");
    }

    public static C443120HZe LJ(String str, Map map, Map map2) {
        Iterable iterableLJJLIIIJILLIZJL;
        String string;
        String lowerCase;
        StringBuilder sb = new StringBuilder(str);
        sb.append(':');
        HashMap map3 = new HashMap();
        for (Map.Entry entry : map2.entrySet()) {
            map3.put(((String) entry.getKey()).toLowerCase(Locale.ENGLISH), entry.getValue());
        }
        String str2 = (String) map3.get("vary");
        if (str2 == null || (string = a0.LJLIIIL(str2).toString()) == null || (lowerCase = string.toLowerCase(Locale.ENGLISH)) == null || (iterableLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(lowerCase, new String[]{","}, 0, 6)) == null) {
            iterableLJJLIIIJILLIZJL = C13BV.INSTANCE;
        }
        List<String> listLJLLJ = C13LP.LJLLJ(iterableLJJLIIIJILLIZJL);
        map3.put("vary", C13LP.LJJLIIIJ(listLJLLJ, ",", null, null, 0, null, null, 62));
        boolean z = true;
        for (String str3 : listLJLLJ) {
            String str4 = (String) map.get(str3);
            if (str4 == null) {
                str4 = "";
            }
            if (!z) {
                sb.append(",");
            }
            sb.append(str3);
            sb.append(':');
            sb.append(str4);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("forest-append-");
            sbLIZ.append(str3);
            map3.put(C2188811AlT.LIZIZ(sbLIZ), str4);
            z = false;
        }
        C1529710puT.LIZ.getClass();
        long jLIZ = C1529710puT.LIZ(map3);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(C08IP.LJ(sb.toString()).substring(0, 8));
        sbLIZ2.append('-');
        sbLIZ2.append(jLIZ);
        sbLIZ2.append(LIZLLL(str));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        while (jLIZ != 0 && C1534880q2o.LIZ.contains(strLIZIZ)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("forest_");
            sbLIZ3.append(strLIZIZ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        return new C443120HZe(strLIZIZ, map3, Long.valueOf(jLIZ));
    }
}
