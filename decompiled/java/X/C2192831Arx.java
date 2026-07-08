package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.TreeMap;

/* JADX INFO: renamed from: X.1Arx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2192831Arx {
    public static final /* synthetic */ int LIZ = 0;

    public static C2192811Arv LIZLLL(String str) throws Exception {
        String lowerCase = str.toLowerCase();
        C2192851Arz c2192851Arz = new C2192851Arz(lowerCase);
        C2192811Arv c2192811Arv = new C2192811Arv();
        try {
            if (c2192851Arz.LIZ()) {
                LIZJ(lowerCase, c2192851Arz, c2192851Arz.LIZIZ(), false, c2192811Arv);
                return c2192811Arv;
            }
            throw new C20129013pQ(C786410Ut5.j4("Language subtag not found: %s", new Object[]{lowerCase}));
        } catch (C2192871As1 e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C20129013pQ(C786410Ut5.j4("Locale Identifier subtag iteration failed: %s", new Object[]{lowerCase}));
        }
    }

    public static void LIZIZ(C2192841Ary c2192841Ary, C2192851Arz c2192851Arz, C2192811Arv c2192811Arv, CharSequence charSequence) throws Exception {
        if (c2192851Arz.LIZ()) {
            char cCharAt = c2192841Ary.toString().charAt(0);
            if (cCharAt == 'u') {
                if (c2192851Arz.LIZ()) {
                    C2192841Ary c2192841AryLIZIZ = c2192851Arz.LIZIZ();
                    if (c2192811Arv.LIZIZ == null && c2192811Arv.LIZJ == null) {
                        while (C2192861As0.LIZJ(c2192841AryLIZIZ.LIZIZ, c2192841AryLIZIZ.LIZJ, c2192841AryLIZIZ.LIZ, 3, 8)) {
                            if (c2192811Arv.LIZIZ == null) {
                                c2192811Arv.LIZIZ = new ArrayList<>();
                            }
                            c2192811Arv.LIZIZ.add(c2192841AryLIZIZ.toString());
                            if (c2192851Arz.LIZ()) {
                                c2192841AryLIZIZ = c2192851Arz.LIZIZ();
                            } else {
                                return;
                            }
                        }
                        if (c2192841AryLIZIZ.LIZIZ()) {
                            if (c2192811Arv.LIZJ == null) {
                                c2192811Arv.LIZJ = new TreeMap<>();
                            }
                            do {
                                String string = c2192841AryLIZIZ.toString();
                                ArrayList<String> arrayList = new ArrayList<>();
                                c2192811Arv.LIZJ.put(string, arrayList);
                                if (c2192851Arz.LIZ()) {
                                    c2192841AryLIZIZ = c2192851Arz.LIZIZ();
                                    while (C2192861As0.LIZJ(c2192841AryLIZIZ.LIZIZ, c2192841AryLIZIZ.LIZJ, c2192841AryLIZIZ.LIZ, 3, 8)) {
                                        arrayList.add(c2192841AryLIZIZ.toString());
                                        if (c2192851Arz.LIZ()) {
                                            c2192841AryLIZIZ = c2192851Arz.LIZIZ();
                                        } else {
                                            return;
                                        }
                                    }
                                } else {
                                    return;
                                }
                            } while (c2192841AryLIZIZ.LIZIZ());
                        }
                        if (C2192861As0.LIZJ(c2192841AryLIZIZ.LIZIZ, c2192841AryLIZIZ.LIZJ, c2192841AryLIZIZ.LIZ, 1, 1)) {
                            LIZIZ(c2192841AryLIZIZ, c2192851Arz, c2192811Arv, charSequence);
                            return;
                        }
                        throw new C20129013pQ("Malformed sequence expected.");
                    }
                    throw new C20129013pQ(C786410Ut5.j4("Duplicate unicode extension sequence in [%s]", new Object[]{charSequence}));
                }
                throw new C20129013pQ("Extension sequence expected.");
            }
            if (cCharAt == 't') {
                if (c2192851Arz.LIZ()) {
                    C2192841Ary c2192841AryLIZIZ2 = c2192851Arz.LIZIZ();
                    if (c2192841AryLIZIZ2.LIZJ()) {
                        LIZJ(charSequence, c2192851Arz, c2192841AryLIZIZ2, true, c2192811Arv);
                        return;
                    } else {
                        if (c2192841AryLIZIZ2.LIZ()) {
                            LJ(c2192841AryLIZIZ2, c2192851Arz, c2192811Arv, charSequence);
                            return;
                        }
                        throw new C20129013pQ(C786410Ut5.j4("Unexpected token [%s] in transformed extension sequence [%s]", new Object[]{c2192841AryLIZIZ2.toString(), charSequence}));
                    }
                }
                throw new C20129013pQ("Extension sequence expected.");
            }
            if (cCharAt == 'x') {
                if (c2192851Arz.LIZ()) {
                    C2192841Ary c2192841AryLIZIZ3 = c2192851Arz.LIZIZ();
                    if (c2192811Arv.LJI == null) {
                        c2192811Arv.LJI = new ArrayList<>();
                    }
                    while (C2192861As0.LIZJ(c2192841AryLIZIZ3.LIZIZ, c2192841AryLIZIZ3.LIZJ, c2192841AryLIZIZ3.LIZ, 1, 8)) {
                        c2192811Arv.LJI.add(c2192841AryLIZIZ3.toString());
                        if (c2192851Arz.LIZ()) {
                            c2192841AryLIZIZ3 = c2192851Arz.LIZIZ();
                        } else {
                            return;
                        }
                    }
                    throw new C20129013pQ("Tokens are not expected after pu extension.");
                }
                throw new C20129013pQ("Extension sequence expected.");
            }
            if (c2192851Arz.LIZ()) {
                C2192841Ary c2192841AryLIZIZ4 = c2192851Arz.LIZIZ();
                if (c2192811Arv.LJFF == null) {
                    c2192811Arv.LJFF = new TreeMap<>();
                }
                ArrayList<String> arrayList2 = new ArrayList<>();
                c2192811Arv.LJFF.put(new Character(cCharAt), arrayList2);
                while (C2192861As0.LIZJ(c2192841AryLIZIZ4.LIZIZ, c2192841AryLIZIZ4.LIZJ, c2192841AryLIZIZ4.LIZ, 2, 8)) {
                    arrayList2.add(c2192841AryLIZIZ4.toString());
                    if (c2192851Arz.LIZ()) {
                        c2192841AryLIZIZ4 = c2192851Arz.LIZIZ();
                    } else {
                        return;
                    }
                }
                if (C2192861As0.LIZJ(c2192841AryLIZIZ4.LIZIZ, c2192841AryLIZIZ4.LIZJ, c2192841AryLIZIZ4.LIZ, 1, 1)) {
                    LIZIZ(c2192841AryLIZIZ4, c2192851Arz, c2192811Arv, charSequence);
                    return;
                }
                throw new C20129013pQ("Malformed sequence expected.");
            }
            throw new C20129013pQ("Extension sequence expected.");
        }
        throw new C20129013pQ("Extension sequence expected.");
    }

    public static void LJ(C2192841Ary c2192841Ary, C2192851Arz c2192851Arz, C2192811Arv c2192811Arv, CharSequence charSequence) throws Exception {
        if (c2192841Ary.LIZ()) {
            if (c2192811Arv.LJ == null) {
                c2192811Arv.LJ = new TreeMap<>();
                do {
                    String string = c2192841Ary.toString();
                    ArrayList<String> arrayList = new ArrayList<>();
                    c2192811Arv.LJ.put(string, arrayList);
                    if (c2192851Arz.LIZ()) {
                        c2192841Ary = c2192851Arz.LIZIZ();
                        while (C2192861As0.LIZJ(c2192841Ary.LIZIZ, c2192841Ary.LIZJ, c2192841Ary.LIZ, 3, 8)) {
                            arrayList.add(c2192841Ary.toString());
                            if (!c2192851Arz.LIZ()) {
                                return;
                            } else {
                                c2192841Ary = c2192851Arz.LIZIZ();
                            }
                        }
                    } else {
                        throw new C20129013pQ(C786410Ut5.j4("Malformated transformed key in : %s", new Object[]{charSequence}));
                    }
                } while (c2192841Ary.LIZ());
            } else {
                throw new C20129013pQ(C786410Ut5.j4("Duplicate transformed extension sequence in [%s]", new Object[]{charSequence}));
            }
        }
        if (C2192861As0.LIZJ(c2192841Ary.LIZIZ, c2192841Ary.LIZJ, c2192841Ary.LIZ, 1, 1)) {
            LIZIZ(c2192841Ary, c2192851Arz, c2192811Arv, charSequence);
            return;
        }
        throw new C20129013pQ("Malformed extension sequence.");
    }

    public static boolean LIZ(CharSequence charSequence, C2192851Arz c2192851Arz, C2192841Ary c2192841Ary, boolean z, C2192811Arv c2192811Arv) throws Exception {
        if (z && c2192841Ary.LIZ()) {
            LJ(c2192841Ary, c2192851Arz, c2192811Arv, charSequence);
            return true;
        }
        if (!C2192861As0.LIZJ(c2192841Ary.LIZIZ, c2192841Ary.LIZJ, c2192841Ary.LIZ, 1, 1)) {
            return false;
        }
        if (!z) {
            LIZIZ(c2192841Ary, c2192851Arz, c2192811Arv, charSequence);
            return true;
        }
        throw new C20129013pQ(C786410Ut5.j4("Extension singletons in transformed extension language tag: %s", new Object[]{charSequence}));
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00d2 A[Catch: 1As1 -> 0x0184, LOOP:4: B:48:0x00ce->B:50:0x00d2, LOOP_END, TryCatch #0 {1As1 -> 0x0184, blocks: (B:7:0x0013, B:9:0x001c, B:10:0x0023, B:12:0x0027, B:13:0x0037, B:16:0x0044, B:19:0x004f, B:21:0x005c, B:22:0x0063, B:24:0x0067, B:26:0x006b, B:28:0x0086, B:27:0x0079, B:29:0x0089, B:32:0x0096, B:33:0x009a, B:35:0x00a7, B:37:0x00ad, B:42:0x00b8, B:46:0x00c4, B:55:0x00f3, B:58:0x00fa, B:60:0x0109, B:62:0x010f, B:64:0x0119, B:80:0x0158, B:81:0x016d, B:66:0x0121, B:68:0x0129, B:70:0x012f, B:71:0x0137, B:75:0x0149, B:78:0x0150, B:79:0x0157, B:74:0x013e, B:47:0x00c7, B:48:0x00ce, B:50:0x00d2, B:51:0x00e2, B:54:0x00ef, B:82:0x016e, B:83:0x0183), top: B:87:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ef A[Catch: 1As1 -> 0x0184, TryCatch #0 {1As1 -> 0x0184, blocks: (B:7:0x0013, B:9:0x001c, B:10:0x0023, B:12:0x0027, B:13:0x0037, B:16:0x0044, B:19:0x004f, B:21:0x005c, B:22:0x0063, B:24:0x0067, B:26:0x006b, B:28:0x0086, B:27:0x0079, B:29:0x0089, B:32:0x0096, B:33:0x009a, B:35:0x00a7, B:37:0x00ad, B:42:0x00b8, B:46:0x00c4, B:55:0x00f3, B:58:0x00fa, B:60:0x0109, B:62:0x010f, B:64:0x0119, B:80:0x0158, B:81:0x016d, B:66:0x0121, B:68:0x0129, B:70:0x012f, B:71:0x0137, B:75:0x0149, B:78:0x0150, B:79:0x0157, B:74:0x013e, B:47:0x00c7, B:48:0x00ce, B:50:0x00d2, B:51:0x00e2, B:54:0x00ef, B:82:0x016e, B:83:0x0183), top: B:87:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(java.lang.CharSequence r14, X.C2192851Arz r15, X.C2192841Ary r16, boolean r17, X.C2192811Arv r18) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2192831Arx.LIZJ(java.lang.CharSequence, X.1Arz, X.1Ary, boolean, X.1Arv):void");
    }
}
