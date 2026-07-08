package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0yDn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1849210yDn {
    public final InterfaceC497601wk LIZ;
    public final Keva LIZIZ;
    public final C1DEV LIZJ;
    public volatile boolean LIZLLL;

    public static C2220221Bv2 LIZLLL() {
        return C2220251Bv5.LIZJ(null, C2097908Jt.LIZJ(new Pair("data", "")));
    }

    public final C2220221Bv2 LIZIZ() {
        try {
            for (String str : this.LIZIZ.getAll().keySet()) {
                if (!LJIIJJI(str)) {
                    this.LIZIZ.erase(str);
                }
            }
            this.LIZIZ.storeLong("\u0001__amg_storage__:rebuild_epoch", 0L);
            LJJ(0L);
            return LIZLLL();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C2220251Bv5.LIZ(EnumC2221121BwU.IO_ERROR, "clearStorageSync failed: " + th.getMessage());
        }
    }

    public final void LJFF() throws Throwable {
        if (this.LIZLLL) {
            return;
        }
        C23250099c.LJ(C23271099x.INSTANCE, new C455201pu(this, null));
    }

    public final C2220221Bv2 LJIIIZ() {
        try {
            ArrayList arrayList = new ArrayList();
            for (String str : this.LIZIZ.getAll().keySet()) {
                if (!LJIIJJI(str)) {
                    arrayList.add(str);
                }
            }
            return C2220251Bv5.LIZJ(null, C2097608Jq.LJIIIIZZ(new Pair("keys", new JSONArray(arrayList.toArray(new String[0]))), new Pair("currentSize", Integer.valueOf((int) (LJIIJ() / ((long) 1024)))), new Pair("limitSize", 10240)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C2220251Bv5.LIZ(EnumC2221121BwU.IO_ERROR, "getStorageInfoSync failed: " + th.getMessage());
        }
    }

    public final long LJIIJ() {
        long j = this.LIZIZ.getLong("\u0001__amg_storage__:total_bytes", 0L);
        if (j >= 0) {
            return j;
        }
        return 0L;
    }

    public final void LJIJ() {
        String string;
        Integer numLJIILLIIL;
        long j = 0;
        for (String str : this.LIZIZ.getAll().keySet()) {
            if (!LJIIJJI(str) && (string = this.LIZIZ.getString(str, null)) != null && (numLJIILLIIL = LJIILLIIL(string)) != null) {
                long jIntValue = numLJIILLIIL.intValue();
                if (jIntValue < 0) {
                    jIntValue = 0;
                }
                j += jIntValue;
            }
        }
        LJJ(j);
        Keva keva = this.LIZIZ;
        keva.storeLong("\u0001__amg_storage__:rebuild_epoch", keva.getLong("\u0001__amg_storage__:rebuild_epoch", 0L) + 1);
    }

    public static Pair LIZJ(C1781420wSS c1781420wSS) {
        double d;
        long jLongValue;
        Long lLJIILIIL;
        String str = "";
        switch (c1781420wSS.LIZ) {
            case 0:
                return new Pair(null, "null");
            case 1:
                String str2 = c1781420wSS.LIZIZ;
                if (str2 != null) {
                    str = str2;
                }
                return new Pair(str, "string");
            case 2:
                String str3 = c1781420wSS.LIZIZ;
                if (str3 == null) {
                    str3 = CardStruct.IStatusCode.DEFAULT;
                }
                Double dLJII = C2327809Ae.LJII(str3);
                if (dLJII == null) {
                    return new Pair(str3, "string");
                }
                return new Pair(dLJII, "number");
            case 3:
                return new Pair(Boolean.valueOf(Intrinsics.LJFF(c1781420wSS.LIZIZ, "1")), "boolean");
            case 4:
                String str4 = c1781420wSS.LIZIZ;
                if (str4 == null) {
                    str4 = "{}";
                }
                return new Pair(new JSONObject(str4), "object");
            case 5:
                String str5 = c1781420wSS.LIZIZ;
                if (str5 == null) {
                    str5 = "[]";
                }
                return new Pair(new JSONArray(str5), "array");
            case 6:
                String str6 = c1781420wSS.LIZIZ;
                if (str6 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str6)) != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    jLongValue = 0;
                }
                return new Pair(new Date(jLongValue), "date");
            case 7:
                String str7 = c1781420wSS.LIZIZ;
                if (str7 != null) {
                    int iHashCode = str7.hashCode();
                    if (iHashCode != 78043) {
                        if (iHashCode != 237817416) {
                            if (iHashCode == 506745205 && str7.equals("-Infinity")) {
                                d = Double.NEGATIVE_INFINITY;
                            }
                        } else if (str7.equals("Infinity")) {
                            d = Double.POSITIVE_INFINITY;
                        }
                    } else {
                        str7.equals("NaN");
                    }
                    d = Double.NaN;
                } else {
                    d = Double.NaN;
                }
                return new Pair(Double.valueOf(d), "number");
            default:
                return new Pair("", "string");
        }
    }

    public static boolean LJIIJJI(String str) {
        return u.LJJIIJZLJL(str, "\u0001__amg_storage__:", false);
    }

    public static C1781420wSS LJIIL(String str) {
        Object c098200Yq;
        String strOptString;
        Object obj = null;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("t", -1);
            if (iOptInt < 0) {
                c098200Yq = null;
            } else {
                if (jSONObject.isNull("v")) {
                    strOptString = null;
                } else {
                    strOptString = jSONObject.optString("v", null);
                }
                int i = 0;
                int iOptInt2 = jSONObject.optInt("s", 0);
                if (iOptInt2 >= 0) {
                    i = iOptInt2;
                }
                c098200Yq = new C1781420wSS(iOptInt, strOptString, i);
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (C1781420wSS) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01b2 A[EDGE_INSN: B:110:0x01b2->B:102:0x01b2 BREAK  A[LOOP:0: B:7:0x001a->B:101:0x01ae], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1781420wSS LJIILIIL(java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1849210yDn.LJIILIIL(java.lang.String):X.0wSS");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0047 A[EDGE_INSN: B:113:0x0047->B:22:0x0047 BREAK  A[LOOP:0: B:7:0x0017->B:94:0x014c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Integer LJIILLIIL(java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1849210yDn.LJIILLIIL(java.lang.String):java.lang.Integer");
    }

    public static C1781400wSQ LJIIZILJ(Object obj) throws JSONException {
        String string;
        String str;
        int i;
        C1781420wSS c1781420wSS;
        Object obj2;
        String str2 = null;
        if (obj == JSONObject.NULL) {
            obj = null;
        }
        if (!(obj instanceof byte[])) {
            int i2 = 1;
            if (obj == 0) {
                string = "";
                i = 0;
            } else if (obj instanceof String) {
                string = (String) obj;
                str2 = string;
                i = 1;
                i2 = 2;
            } else {
                boolean z = obj instanceof Boolean;
                str2 = CardStruct.IStatusCode.DEFAULT;
                if (z) {
                    Boolean bool = (Boolean) obj;
                    if (bool.booleanValue()) {
                        str2 = "1";
                    }
                    string = String.valueOf(bool.booleanValue());
                    i2 = 4;
                    i = 3;
                } else {
                    if (!(obj instanceof Integer) && !(obj instanceof Long)) {
                        if (!(obj instanceof Float) && !(obj instanceof Double)) {
                            i = 6;
                            if (obj instanceof Date) {
                                string = String.valueOf(((Date) obj).getTime());
                                i2 = 3;
                            } else {
                                if (obj instanceof JSONObject) {
                                    string = C786410Ut5.J3((JSONObject) obj);
                                } else {
                                    if (obj instanceof JSONArray) {
                                        string = ((JSONArray) obj).toString();
                                    } else if (obj instanceof Map) {
                                        string = C786410Ut5.J3(new JSONObject((Map) obj));
                                    } else if (obj instanceof List) {
                                        string = new JSONArray((Collection) obj).toString();
                                    } else {
                                        throw new IllegalArgumentException("unsupported data type");
                                    }
                                    i2 = 6;
                                    i = 5;
                                }
                                str2 = string;
                                i2 = 5;
                                i = 4;
                            }
                            str2 = string;
                        } else {
                            double dDoubleValue = ((Number) obj).doubleValue();
                            if (Double.isNaN(dDoubleValue)) {
                                c1781420wSS = new C1781420wSS(7, "NaN", 0);
                            } else if (dDoubleValue == Double.POSITIVE_INFINITY) {
                                c1781420wSS = new C1781420wSS(7, "Infinity", 0);
                            } else if (dDoubleValue == Double.NEGATIVE_INFINITY) {
                                c1781420wSS = new C1781420wSS(7, "-Infinity", 0);
                            } else {
                                c1781420wSS = new C1781420wSS(2, String.valueOf(dDoubleValue), 0);
                            }
                            i = c1781420wSS.LIZ;
                            str = c1781420wSS.LIZIZ;
                            if (str != null) {
                                str2 = str;
                            }
                            string = str2;
                        }
                    } else {
                        string = obj.toString();
                        str = string;
                        i = 2;
                    }
                    str2 = str;
                    i2 = 3;
                }
            }
            int length = C786410Ut5.J3(new JSONObject().put("dataType", i2).put("value", string)).getBytes(Charsets.UTF_8).length;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("t", i);
            if (str2 == null) {
                obj2 = JSONObject.NULL;
            } else {
                obj2 = str2;
            }
            jSONObject.put("v", obj2);
            jSONObject.put("s", length);
            return new C1781400wSQ(C786410Ut5.J3(jSONObject), length, i, str2);
        }
        throw new IllegalArgumentException("unsupported data type");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super X.C2220221Bv2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C1849340yE0
            if (r0 == 0) goto L39
            r4 = r6
            X.0yE0 r4 = (X.C1849340yE0) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILZ
            r0 = 1
            if (r1 == 0) goto L29
            if (r1 != r0) goto L3f
            X.0yDn r0 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L24:
            X.1Bv2 r0 = r0.LIZIZ()
            return r0
        L29:
            X.C155000ia.LIZIZ(r3)
            r4.LL = r5
            r4.LLILZ = r0
            java.lang.Object r0 = r5.LJ(r4)
            if (r0 != r2) goto L37
            return r2
        L37:
            r0 = r5
            goto L24
        L39:
            X.0yE0 r4 = new X.0yE0
            r4.<init>(r5, r6)
            goto L12
        L3f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1849210yDn.LIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C1849300yDw
            if (r0 == 0) goto L28
            r6 = r8
            X.0yDw r6 = (X.C1849300yDw) r6
            int r2 = r6.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r6.LLILZIL = r2
        L12:
            java.lang.Object r5 = r6.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r6.LLILZIL
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L36
            if (r0 != r3) goto L2e
            X.1DEV r1 = r6.LLILLJJLI
            X.0yDn r2 = r6.LL
            X.C155000ia.LIZIZ(r5)
            goto L50
        L28:
            X.0yDw r6 = new X.0yDw
            r6.<init>(r7, r8)
            goto L12
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            X.C155000ia.LIZIZ(r5)
            boolean r0 = r7.LIZLLL
            if (r0 == 0) goto L40
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L40:
            X.1DEV r1 = r7.LIZJ
            r6.LL = r7
            r6.LLILLJJLI = r1
            r6.LLILZIL = r3
            java.lang.Object r0 = r1.LIZLLL(r4, r6)
            if (r0 != r2) goto L4f
            return r2
        L4f:
            r2 = r7
        L50:
            boolean r0 = r2.LIZLLL     // Catch: java.lang.Throwable -> L65
            if (r0 == 0) goto L5a
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L65
            r1.LIZIZ(r4)
            return r0
        L5a:
            r2.LJIJ()     // Catch: java.lang.Throwable -> L65
            r2.LIZLLL = r3     // Catch: java.lang.Throwable -> L65
            r1.LIZIZ(r4)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L65:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L65
            r1.LIZIZ(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1849210yDn.LJ(X.05Vn):java.lang.Object");
    }

    public final C2220221Bv2 LJII(String str) {
        if (str != null && !a0.LJJJIL(str)) {
            if (LJIIJJI(str)) {
                return C2220251Bv5.LIZJ(null, C2097608Jq.LJIIIIZZ(new Pair("data", ""), new Pair("dataType", "string")));
            }
            try {
                String string = this.LIZIZ.getString(str, null);
                if (string == null) {
                    return C2220251Bv5.LIZ(EnumC2221121BwU.NO_SUCH_FILE, "no such key");
                }
                if (string.length() == 0) {
                    return C2220251Bv5.LIZJ(null, C2097908Jt.LIZJ(new Pair("data", "")));
                }
                C1781420wSS c1781420wSSLJIILIIL = LJIILIIL(string);
                if (c1781420wSSLJIILIIL == null) {
                    return C2220251Bv5.LIZJ(null, C2097908Jt.LIZJ(new Pair("data", string)));
                }
                if (c1781420wSSLJIILIIL.LIZ == 0) {
                    return C2220251Bv5.LIZJ(null, C2097908Jt.LIZJ(new Pair("data", null)));
                }
                return C2220251Bv5.LIZJ(null, C2097908Jt.LIZJ(new Pair("data", LIZJ(c1781420wSSLJIILIIL).getFirst())));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return C2220251Bv5.LIZ(EnumC2221121BwU.IO_ERROR, "getStorageSync failed: " + th.getMessage());
            }
        }
        return C2220251Bv5.LIZ(EnumC2221121BwU.INVALID_ARG, "empty key");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(X.InterfaceC1364105Vn<? super X.C2220221Bv2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C1849350yE1
            if (r0 == 0) goto L39
            r4 = r6
            X.0yE1 r4 = (X.C1849350yE1) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILZ
            r0 = 1
            if (r1 == 0) goto L29
            if (r1 != r0) goto L3f
            X.0yDn r0 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L24:
            X.1Bv2 r0 = r0.LJIIIZ()
            return r0
        L29:
            X.C155000ia.LIZIZ(r3)
            r4.LL = r5
            r4.LLILZ = r0
            java.lang.Object r0 = r5.LJ(r4)
            if (r0 != r2) goto L37
            return r2
        L37:
            r0 = r5
            goto L24
        L39:
            X.0yE1 r4 = new X.0yE1
            r4.<init>(r5, r6)
            goto L12
        L3f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1849210yDn.LJIIIIZZ(X.05Vn):java.lang.Object");
    }

    public final C2220221Bv2 LJIJJ(String str) {
        Integer numLJIILLIIL;
        int iIntValue = 0;
        if (str != null && !a0.LJJJIL(str)) {
            if (LJIIJJI(str)) {
                return LIZLLL();
            }
            try {
                String string = this.LIZIZ.getString(str, null);
                if (string != null && (numLJIILLIIL = LJIILLIIL(string)) != null) {
                    iIntValue = numLJIILLIIL.intValue();
                }
                this.LIZIZ.erase(str);
                long jLJIIJ = LJIIJ();
                if (iIntValue > 0) {
                    LJJ(Math.max(0L, jLJIIJ - ((long) iIntValue)));
                }
                return LIZLLL();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return C2220251Bv5.LIZ(EnumC2221121BwU.IO_ERROR, "removeStorageSync failed: " + th.getMessage());
            }
        }
        return LIZLLL();
    }

    public final void LJJ(long j) {
        Keva keva = this.LIZIZ;
        if (j < 0) {
            j = 0;
        }
        keva.storeLong("\u0001__amg_storage__:total_bytes", j);
    }

    public C1849210yDn(C054G c054g, C1304160k2g c1304160k2g) {
        this.LIZ = c054g == null ? C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ)) : c054g;
        this.LIZIZ = Keva.getRepo("minigame_storage_" + C09KZ.LIZ(c1304160k2g), 0);
        this.LIZJ = C2191201ApK.LIZ();
    }

    public static Pair LJIILJJIL(int i, String str) {
        int i2 = i + 2;
        if (i2 < str.length() && str.charAt(i) == '\"' && str.charAt(i2) == '\"') {
            char cCharAt = str.charAt(i + 1);
            if (cCharAt != 's' && cCharAt != 't' && cCharAt != 'v') {
                return null;
            }
            return new Pair(Character.valueOf(cCharAt), Integer.valueOf(i + 3));
        }
        return null;
    }

    public static Pair LJIILL(int i, String str) {
        int i2;
        Integer numLJIIJJI;
        if (i >= str.length()) {
            return null;
        }
        if (str.charAt(i) == '-') {
            i2 = i + 1;
        } else {
            i2 = i;
        }
        int i3 = i2;
        while (i3 < str.length() && Character.isDigit(str.charAt(i3))) {
            i3++;
        }
        if (i2 == i3 || (numLJIIJJI = C2095008Iq.LJIIJJI(str.substring(i, i3))) == null) {
            return null;
        }
        return new Pair(Integer.valueOf(numLJIIJJI.intValue()), Integer.valueOf(i3));
    }

    public static int LJJI(int i, String str) {
        while (i < str.length() && C1244080iTm.LJ(str.charAt(i))) {
            i++;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(java.lang.String r6, X.InterfaceC1364105Vn<? super X.C2220221Bv2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1849320yDy
            if (r0 == 0) goto L3f
            r4 = r7
            X.0yDy r4 = (X.C1849320yDy) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r3 = r4.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILZIL
            r0 = 1
            if (r1 == 0) goto L2d
            if (r1 != r0) goto L45
            java.lang.Object r6 = r4.LLILLJJLI
            java.lang.String r6 = (java.lang.String) r6
            X.0yDn r0 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L28:
            X.1Bv2 r0 = r0.LJII(r6)
            return r0
        L2d:
            X.C155000ia.LIZIZ(r3)
            r4.LL = r5
            r4.LLILLJJLI = r6
            r4.LLILZIL = r0
            java.lang.Object r0 = r5.LJ(r4)
            if (r0 != r2) goto L3d
            return r2
        L3d:
            r0 = r5
            goto L28
        L3f:
            X.0yDy r4 = new X.0yDy
            r4.<init>(r5, r7)
            goto L12
        L45:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1849210yDn.LJI(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJI(java.lang.String r6, X.InterfaceC1364105Vn<? super X.C2220221Bv2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1849330yDz
            if (r0 == 0) goto L3f
            r4 = r7
            X.0yDz r4 = (X.C1849330yDz) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r3 = r4.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILZIL
            r0 = 1
            if (r1 == 0) goto L2d
            if (r1 != r0) goto L45
            java.lang.Object r6 = r4.LLILLJJLI
            java.lang.String r6 = (java.lang.String) r6
            X.0yDn r0 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L28:
            X.1Bv2 r0 = r0.LJIJJ(r6)
            return r0
        L2d:
            X.C155000ia.LIZIZ(r3)
            r4.LL = r5
            r4.LLILLJJLI = r6
            r4.LLILZIL = r0
            java.lang.Object r0 = r5.LJ(r4)
            if (r0 != r2) goto L3d
            return r2
        L3d:
            r0 = r5
            goto L28
        L3f:
            X.0yDz r4 = new X.0yDz
            r4.<init>(r5, r7)
            goto L12
        L45:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1849210yDn.LJIJI(java.lang.String, X.05Vn):java.lang.Object");
    }

    public final C2220221Bv2 LJIL(Object obj, String str) {
        Integer numLJIILLIIL;
        int iIntValue;
        int i = 0;
        if (str != null && !a0.LJJJIL(str)) {
            if (LJIIJJI(str)) {
                return C2220251Bv5.LIZ(EnumC2221121BwU.INVALID_ARG, "invalid key");
            }
            try {
                C1781400wSQ c1781400wSQLJIIZILJ = LJIIZILJ(obj);
                int i2 = c1781400wSQLJIIZILJ.LIZIZ;
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 > 1048576) {
                    return C2220251Bv5.LIZ(EnumC2221121BwU.STORAGE_EXCEEDED, "single >1 MB (" + C244300wz.LIZ(i2) + " MB)");
                }
                try {
                    long jLJIIJ = LJIIJ();
                    String string = this.LIZIZ.getString(str, null);
                    if (string != null && (numLJIILLIIL = LJIILLIIL(string)) != null && (iIntValue = numLJIILLIIL.intValue()) >= 0) {
                        i = iIntValue;
                    }
                    long j = (jLJIIJ - ((long) i)) + ((long) i2);
                    if (j > 10485760) {
                        return C2220251Bv5.LIZ(EnumC2221121BwU.STORAGE_EXCEEDED, "total >10 MB (" + C244300wz.LIZ(j) + " MB)");
                    }
                    this.LIZIZ.storeString(str, c1781400wSQLJIIZILJ.LIZ);
                    LJJ(Math.max(0L, jLJIIJ + ((long) (i2 - i))));
                    return LIZLLL();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return C2220251Bv5.LIZ(EnumC2221121BwU.IO_ERROR, "setStorageSync failed: " + th.getMessage());
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                return C2220251Bv5.LIZ(EnumC2221121BwU.INVALID_ARG, "unsupported data type");
            }
        }
        return C2220251Bv5.LIZ(EnumC2221121BwU.INVALID_ARG, "empty key");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJJLI(java.lang.String r6, java.lang.Object r7, X.InterfaceC1364105Vn<? super X.C2220221Bv2> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C1849310yDx
            if (r0 == 0) goto L43
            r4 = r8
            X.0yDx r4 = (X.C1849310yDx) r4
            int r2 = r4.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L43
            int r2 = r2 - r1
            r4.LLILZLL = r2
        L12:
            java.lang.Object r3 = r4.LLILZ
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILZLL
            r0 = 1
            if (r1 == 0) goto L2f
            if (r1 != r0) goto L49
            java.lang.Object r7 = r4.LLILLL
            java.lang.Object r6 = r4.LLILLJJLI
            java.lang.String r6 = (java.lang.String) r6
            X.0yDn r0 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L2a:
            X.1Bv2 r0 = r0.LJIL(r7, r6)
            return r0
        L2f:
            X.C155000ia.LIZIZ(r3)
            r4.LL = r5
            r4.LLILLJJLI = r6
            r4.LLILLL = r7
            r4.LLILZLL = r0
            java.lang.Object r0 = r5.LJ(r4)
            if (r0 != r2) goto L41
            return r2
        L41:
            r0 = r5
            goto L2a
        L43:
            X.0yDx r4 = new X.0yDx
            r4.<init>(r5, r8)
            goto L12
        L49:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1849210yDn.LJIJJLI(java.lang.String, java.lang.Object, X.05Vn):java.lang.Object");
    }
}
