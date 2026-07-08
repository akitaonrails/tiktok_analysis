package X;

import Y.ARunnableS113S0100000_13;
import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0X2t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C842370X2t implements InterfaceC842320X2o {
    public static final Map<String, String> LIZJ = new LinkedHashMap();
    public static String LIZLLL;
    public final SharedPreferences LIZ;
    public final Map<URI, Set<C842380X2u>> LIZIZ = new LinkedHashMap();

    public final synchronized void LJ() {
        Map<URI, Set<C842380X2u>> map = this.LIZIZ;
        if (map == null || map.isEmpty()) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) this.LIZIZ).entrySet()) {
            if (entry != null) {
                URI uri = (URI) entry.getKey();
                if (uri.getScheme() != null && uri.getScheme().equals("https")) {
                    linkedHashMap.put((URI) entry.getKey(), (Set) entry.getValue());
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (entry2 != null) {
                URI uri2 = (URI) entry2.getKey();
                Set<C842380X2u> set = (Set) entry2.getValue();
                try {
                    URI uri3 = new URI(uri2.toString().replace("https:", "http:"));
                    Set<C842380X2u> set2 = (Set) ((LinkedHashMap) this.LIZIZ).get(uri3);
                    if (set2 == null || set2.isEmpty()) {
                        this.LIZIZ.remove(uri2);
                        this.LIZIZ.put(uri3, set);
                    } else {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (C842380X2u c842380X2u : set2) {
                            boolean z = false;
                            for (C842380X2u c842380X2u2 : set) {
                                if (c842380X2u != null && c842380X2u2 != null && c842380X2u.getHttpCookie().equals(c842380X2u2.getHttpCookie()) && c842380X2u2.getWhenCreated().longValue() >= c842380X2u.getWhenCreated().longValue()) {
                                    linkedHashSet.add(c842380X2u2);
                                    z = true;
                                }
                            }
                            if (!z) {
                                linkedHashSet.add(c842380X2u);
                            }
                        }
                        for (C842380X2u c842380X2u3 : set) {
                            if (!linkedHashSet.contains(c842380X2u3)) {
                                linkedHashSet.add(c842380X2u3);
                            }
                        }
                        this.LIZIZ.remove(uri2);
                        this.LIZIZ.put(uri3, linkedHashSet);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        try {
            Map<URI, Set<C842380X2u>> map2 = this.LIZIZ;
            if (map2 == null || map2.isEmpty()) {
                return;
            }
            SharedPreferences.Editor editorEdit = this.LIZ.edit();
            editorEdit.clear();
            for (Map.Entry entry3 : ((LinkedHashMap) this.LIZIZ).entrySet()) {
                URI uri4 = (URI) entry3.getKey();
                for (C842380X2u c842380X2u4 : (Set) entry3.getValue()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(uri4.toString());
                    sbLIZ.append("|");
                    sbLIZ.append(c842380X2u4.getHttpCookie().LLILZLL);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    String strEncode = c842380X2u4.encode();
                    if (c842380X2u4.getHttpCookie().LLILZIL > 0) {
                        editorEdit.putString(strLIZIZ, strEncode);
                    } else {
                        LIZJ.put(strLIZIZ, strEncode);
                    }
                }
            }
            C1499900p8O.LIZ(editorEdit);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public C842370X2t(Context context) {
        String str = LIZLLL;
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 4, str == null ? "cookieStore" : str);
        this.LIZ = sharedPreferencesLIZJ;
        LIZJ(sharedPreferencesLIZJ.getAll(), true);
        LIZJ(LIZJ, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C842390X2v> LIZIZ(java.net.URI r11) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C842370X2t.LIZIZ(java.net.URI):java.util.List");
    }

    @Override // X.InterfaceC842320X2o
    public final synchronized List<C842390X2v> get(URI uri) {
        return LIZIZ(uri);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038 A[Catch: all -> 0x004e, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x000e, B:8:0x0013, B:11:0x001d, B:13:0x0024, B:14:0x0027, B:16:0x0038, B:18:0x0046, B:17:0x0043), top: B:26:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[Catch: all -> 0x004e, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x000e, B:8:0x0013, B:11:0x001d, B:13:0x0024, B:14:0x0027, B:16:0x0038, B:18:0x0046, B:17:0x0043), top: B:26:0x0001, inners: #0 }] */
    @Override // X.InterfaceC842320X2o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LIZ(X.C842390X2v r6, java.net.URI r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r4 = r6.LLILZ     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto L27
            r0 = 0
            char r1 = r4.charAt(r0)     // Catch: java.lang.Throwable -> L4e
            r0 = 46
            if (r1 != r0) goto L13
            r0 = 1
            java.lang.String r4 = r4.substring(r0)     // Catch: java.lang.Throwable -> L4e
        L13:
            java.net.URI r3 = new java.net.URI     // Catch: java.net.URISyntaxException -> L23 java.lang.Throwable -> L4e
            java.lang.String r2 = "http"
            java.lang.String r1 = r6.LLIZ     // Catch: java.net.URISyntaxException -> L23 java.lang.Throwable -> L4e
            if (r1 != 0) goto L1d
            java.lang.String r1 = "/"
        L1d:
            r0 = 0
            r3.<init>(r2, r4, r1, r0)     // Catch: java.net.URISyntaxException -> L23 java.lang.Throwable -> L4e
            r7 = r3
            goto L27
        L23:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L4e
        L27:
            java.util.Map<java.net.URI, java.util.Set<X.0X2u>> r0 = r5.LIZIZ     // Catch: java.lang.Throwable -> L4e
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r2 = r0.get(r7)     // Catch: java.lang.Throwable -> L4e
            java.util.Set r2 = (java.util.Set) r2     // Catch: java.lang.Throwable -> L4e
            X.0X2u r1 = new X.0X2u     // Catch: java.lang.Throwable -> L4e
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L4e
            if (r2 != 0) goto L43
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L4e
            r2.<init>()     // Catch: java.lang.Throwable -> L4e
            java.util.Map<java.net.URI, java.util.Set<X.0X2u>> r0 = r5.LIZIZ     // Catch: java.lang.Throwable -> L4e
            r0.put(r7, r2)     // Catch: java.lang.Throwable -> L4e
            goto L46
        L43:
            r2.remove(r1)     // Catch: java.lang.Throwable -> L4e
        L46:
            r2.add(r1)     // Catch: java.lang.Throwable -> L4e
            r5.LIZLLL(r7, r1)     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r5)
            return
        L4e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C842370X2t.LIZ(X.0X2v, java.net.URI):void");
    }

    public final synchronized void LIZJ(Map<String, ?> map, boolean z) {
        if (map != null) {
            if (!map.isEmpty()) {
                try {
                    for (Map.Entry<String, ?> entry : map.entrySet()) {
                        try {
                            URI uri = new URI(entry.getKey().split("\\|", 2)[0]);
                            C842380X2u c842380X2uDecode = C842380X2u.decode((String) entry.getValue());
                            Set<C842380X2u> hashSet = this.LIZIZ.get(uri);
                            if (hashSet == null) {
                                hashSet = new HashSet<>();
                                this.LIZIZ.put(uri, hashSet);
                            }
                            if (c842380X2uDecode != null) {
                                hashSet.add(c842380X2uDecode);
                            }
                        } catch (URISyntaxException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    if (z) {
                        RunnableC823120WQs.LIZIZ(new ARunnableS113S0100000_13(this, 160));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
    }

    public final void LIZLLL(URI uri, C842380X2u c842380X2u) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(uri.toString());
        sbLIZ.append("|");
        sbLIZ.append(c842380X2u.getHttpCookie().LLILZLL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String strEncode = c842380X2u.encode();
        if (c842380X2u.getHttpCookie().LLILZIL > 0) {
            SharedPreferences.Editor editorEdit = this.LIZ.edit();
            editorEdit.putString(strLIZIZ, strEncode);
            editorEdit.apply();
            return;
        }
        LIZJ.put(strLIZIZ, strEncode);
    }
}
