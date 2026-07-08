package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.13pr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20131713pr {
    public static final /* synthetic */ int LLJI = 0;
    public final String LL;
    public C20131913pt LLILLJJLI;
    public String LLILLL;
    public CharSequence LLILZ;
    public final List<C20131513pp> LLILZIL = new ArrayList();
    public final C1119470fEn<C1308870kAH> LLILZLL = new C1119470fEn<>();
    public final Map<String, C1308720kA2> LLIZ = new LinkedHashMap();
    public int LLIZLLLIL;
    public String LLJ;

    static {
        new LinkedHashMap();
    }

    public final Map<String, C1308720kA2> LJIIIZ() {
        return C2097608Jq.LJIIZILJ(this.LLIZ);
    }

    public int hashCode() {
        Set<String> setKeySet;
        Object obj;
        int i = this.LLIZLLLIL * 31;
        String str = this.LLJ;
        int iHashCode = i + (str != null ? str.hashCode() : 0);
        for (C20131513pp c20131513pp : this.LLILZIL) {
            int i2 = iHashCode * 31;
            String str2 = c20131513pp.LIZ;
            int iHashCode2 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = c20131513pp.LIZIZ;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = c20131513pp.LIZJ;
            iHashCode = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        C20307814dA c20307814dA = new C20307814dA(this.LLILZLL, (C1119470fEn<Object>) 2);
        while (c20307814dA.hasNext()) {
            C1308870kAH c1308870kAH = (C1308870kAH) c20307814dA.next();
            int i3 = ((iHashCode * 31) + c1308870kAH.LIZ) * 31;
            C20133813qC c20133813qC = c1308870kAH.LIZIZ;
            iHashCode = i3 + (c20133813qC != null ? c20133813qC.hashCode() : 0);
            Bundle bundle = c1308870kAH.LIZJ;
            if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                Iterator<T> it2 = setKeySet.iterator();
                while (it2.hasNext()) {
                    int i4 = iHashCode * 31;
                    try {
                        obj = c1308870kAH.LIZJ.get((String) it2.next());
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    } catch (OutOfMemoryError e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    int iHashCode4 = obj != null ? obj.hashCode() : 0;
                    iHashCode = i4 + iHashCode4;
                }
            }
        }
        for (String str5 : LJIIIZ().keySet()) {
            int iHashCode5 = ((iHashCode * 31) + str5.hashCode()) * 31;
            C1308720kA2 c1308720kA2 = LJIIIZ().get(str5);
            iHashCode = iHashCode5 + (c1308720kA2 != null ? c1308720kA2.hashCode() : 0);
        }
        return iHashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(e3.h);
        String str = this.LLILLL;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.LLIZLLLIL));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = this.LLJ;
        if (str2 != null && !a0.LJJJIL(str2)) {
            sb.append(" route=");
            sb.append(this.LLJ);
        }
        if (this.LLILZ != null) {
            sb.append(" label=");
            sb.append(this.LLILZ);
        }
        return sb.toString();
    }

    public C20131713pr(AbstractC20133313q7<? extends C20131713pr> abstractC20133313q7) {
        this.LL = C20133013q4.LIZ(abstractC20133313q7.getClass());
    }

    public final void LIZJ(C20131513pp c20131513pp) {
        Map<String, C1308720kA2> mapLJIIIZ = LJIIIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C1308720kA2> entry : mapLJIIIZ.entrySet()) {
            C1308720kA2 value = entry.getValue();
            if (!value.LIZIZ && !value.LIZJ) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            List<String> list = c20131513pp.LIZLLL;
            Collection collectionValues = ((LinkedHashMap) c20131513pp.LJ).values();
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(((C20131613pq) it2.next()).LIZIZ, arrayList2);
            }
            if (!((ArrayList) C13LP.LJLIL(arrayList2, list)).contains(obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            ((ArrayList) this.LLILZIL).add(c20131513pp);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Deep link ");
        sbLIZ.append(c20131513pp.LIZ);
        sbLIZ.append(" can't be used to open destination ");
        sbLIZ.append(this);
        sbLIZ.append(".\nFollowing required arguments are missing: ");
        sbLIZ.append(arrayList);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle LJ(android.os.Bundle r8) {
        /*
            r7 = this;
            r6 = 0
            if (r8 != 0) goto L13
            java.util.Map<java.lang.String, X.0kA2> r0 = r7.LLIZ
            if (r0 == 0) goto L11
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L11
            r0 = 0
        Le:
            if (r0 == 0) goto L13
            return r6
        L11:
            r0 = 1
            goto Le
        L13:
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.util.Map<java.lang.String, X.0kA2> r0 = r7.LLIZ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r5 = r0.iterator()
        L24:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L48
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r3 = r0.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r0.getValue()
            X.0kA2 r2 = (X.C1308720kA2) r2
            boolean r0 = r2.LIZJ
            if (r0 == 0) goto L24
            X.0kA0<java.lang.Object> r1 = r2.LIZ
            java.lang.Object r0 = r2.LIZLLL
            r1.LIZLLL(r4, r3, r0)
            goto L24
        L48:
            if (r8 == 0) goto Lc7
            X.C786410Ut5.LJJIIJZLJL(r4, r8)
            java.util.Map<java.lang.String, X.0kA2> r0 = r7.LLIZ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r1 = r0.iterator()
        L59:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lc7
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r3 = r0.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r0.getValue()
            X.0kA2 r2 = (X.C1308720kA2) r2
            boolean r0 = r2.LIZIZ
            if (r0 != 0) goto L85
            boolean r0 = r4.containsKey(r3)
            if (r0 == 0) goto L85
            java.lang.Object r0 = r4.get(r3)     // Catch: java.lang.Exception -> L80 java.lang.OutOfMemoryError -> L91
            goto L96
        L80:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L95
        L85:
            X.0kA0<java.lang.Object> r0 = r2.LIZ     // Catch: java.lang.ClassCastException -> L8c
            r0.LIZ(r4, r3)     // Catch: java.lang.ClassCastException -> L8c
            r0 = 1
            goto L99
        L8c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L98
        L91:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L95:
            r0 = r6
        L96:
            if (r0 != 0) goto L85
        L98:
            r0 = 0
        L99:
            if (r0 != 0) goto L59
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Wrong argument type for '"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "' in argument bundle. "
            r1.append(r0)
            X.0kA0<java.lang.Object> r0 = r2.LIZ
            java.lang.String r0 = r0.LIZIZ()
            r1.append(r0)
            java.lang.String r0 = " expected."
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1.toString()
            r0.<init>(r1)
            throw r0
        Lc7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20131713pr.LJ(android.os.Bundle):android.os.Bundle");
    }

    public final int[] LJFF(C20131713pr c20131713pr) {
        C13E8 c13e8 = new C13E8();
        C20131713pr c20131713pr2 = this;
        while (true) {
            C20131913pt c20131913pt = c20131713pr2.LLILLJJLI;
            if (c20131713pr != null && c20131713pr.LLILLJJLI != null && c20131713pr.LLILLJJLI.LJIJ(c20131713pr2.LLIZLLLIL, true) == c20131713pr2) {
                c13e8.addFirst(c20131713pr2);
                break;
            }
            if (c20131913pt == null || c20131913pt.LLJILJIL != c20131713pr2.LLIZLLLIL) {
                c13e8.addFirst(c20131713pr2);
            }
            if (Intrinsics.LJFF(c20131913pt, c20131713pr) || c20131913pt == null) {
                break;
            }
            c20131713pr2 = c20131913pt;
        }
        List listLLIIII = C13LP.LLIIII(c13e8);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLIIII, 10));
        Iterator it2 = listLLIIII.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((C20131713pr) it2.next()).LLIZLLLIL));
        }
        return C13LP.LLII(arrayList);
    }

    public final C1308870kAH LJIIIIZZ(int i) {
        boolean z;
        C1308870kAH c1308870kAHLIZLLL;
        if (this.LLILZLL.LJII() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && (c1308870kAHLIZLLL = this.LLILZLL.LIZLLL(i)) != null) {
            return c1308870kAHLIZLLL;
        }
        C20131913pt c20131913pt = this.LLILLJJLI;
        if (c20131913pt == null) {
            return null;
        }
        return c20131913pt.LJIIIIZZ(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.os.BaseBundle, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public C20132213pw LJIIJJI(C20132113pv c20132113pv) {
        ?? bundle;
        boolean z;
        int i;
        Matcher matcher;
        ?? r10;
        StringBuilder sbLIZ;
        String strGroup = null;
        if (((ArrayList) this.LLILZIL).isEmpty()) {
            return null;
        }
        C20132213pw c20132213pw = null;
        for (C20131513pp c20131513pp : (ArrayList) this.LLILZIL) {
            Uri uri = c20132113pv.LIZ;
            if (uri != null) {
                Map<String, C1308720kA2> mapLJIIIZ = LJIIIZ();
                Pattern pattern = (Pattern) c20131513pp.LJI.getValue();
                if (pattern != null && (matcher = pattern.matcher(uri.toString())) != null && matcher.matches()) {
                    bundle = new Bundle();
                    int size = ((ArrayList) c20131513pp.LIZLLL).size();
                    int i2 = 0;
                    while (i2 < size) {
                        String str = (String) ListProtector.get(c20131513pp.LIZLLL, i2);
                        i2++;
                        String strDecode = Uri.decode(matcher.group(i2));
                        C1308720kA2 c1308720kA2 = mapLJIIIZ.get(str);
                        if (c1308720kA2 != null) {
                            try {
                                AbstractC1308700kA0<Object> abstractC1308700kA0 = c1308720kA2.LIZ;
                                abstractC1308700kA0.LIZLLL(bundle, str, abstractC1308700kA0.LIZJ(strDecode));
                            } catch (IllegalArgumentException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        } else {
                            C786410Ut5.LJJJI(str, strDecode, bundle);
                        }
                    }
                    if (c20131513pp.LJII) {
                        for (String str2 : ((LinkedHashMap) c20131513pp.LJ).keySet()) {
                            C20131613pq c20131613pq = (C20131613pq) ((LinkedHashMap) c20131513pp.LJ).get(str2);
                            String queryParameter = UriProtector.getQueryParameter(uri, str2);
                            if (c20131513pp.LJIIIIZZ) {
                                String string = uri.toString();
                                String strLJJLIIJ = a0.LJJLIIJ('?', string, string);
                                if (!Intrinsics.LJFF(strLJJLIIJ, string)) {
                                    queryParameter = strLJJLIIJ;
                                }
                            }
                            if (queryParameter != null) {
                                Matcher matcher2 = PatternProtector.compile(c20131613pq.LIZ, 32).matcher(queryParameter);
                                boolean zMatches = matcher2.matches();
                                r10 = matcher2;
                                if (!zMatches) {
                                    bundle = strGroup;
                                    break;
                                }
                            } else {
                                r10 = strGroup;
                            }
                            Bundle bundle2 = new Bundle();
                            try {
                                int size2 = ((ArrayList) c20131613pq.LIZIZ).size();
                                int i3 = 0;
                                while (i3 < size2) {
                                    if (r10 != 0 && (strGroup = r10.group(i3 + 1)) == null) {
                                        strGroup = "";
                                    }
                                    String str3 = (String) ListProtector.get(c20131613pq.LIZIZ, i3);
                                    C1308720kA2 c1308720kA22 = mapLJIIIZ.get(str3);
                                    if (strGroup != null) {
                                        try {
                                            sbLIZ = C2188811AlT.LIZ();
                                        } catch (IllegalArgumentException e2) {
                                            e = e2;
                                        }
                                        try {
                                            sbLIZ.append('{');
                                            sbLIZ.append(str3);
                                            sbLIZ.append('}');
                                            if (!Intrinsics.LJFF(strGroup, C2188811AlT.LIZIZ(sbLIZ))) {
                                                if (c1308720kA22 != null) {
                                                    AbstractC1308700kA0<Object> abstractC1308700kA02 = c1308720kA22.LIZ;
                                                    abstractC1308700kA02.LIZLLL(bundle2, str3, abstractC1308700kA02.LIZJ(strGroup));
                                                } else {
                                                    C786410Ut5.LJJJI(str3, strGroup, bundle2);
                                                }
                                            }
                                        } catch (IllegalArgumentException e3) {
                                            e = e3;
                                            TryCatchGuardChecker.doCheck(e);
                                            strGroup = null;
                                        }
                                    }
                                    i3++;
                                    strGroup = null;
                                }
                                C786410Ut5.LJJIIJZLJL(bundle, bundle2);
                            } catch (IllegalArgumentException e4) {
                                e = e4;
                            }
                            strGroup = null;
                        }
                    }
                    Iterator<Map.Entry<String, C1308720kA2>> it2 = mapLJIIIZ.entrySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Map.Entry<String, C1308720kA2> next = it2.next();
                        String key = next.getKey();
                        C1308720kA2 value = next.getValue();
                        if (value != null && !value.LIZIZ && !value.LIZJ && !bundle.containsKey(key)) {
                            bundle = 0;
                            break;
                        }
                    }
                } else {
                    bundle = strGroup;
                    break;
                }
            } else {
                bundle = 0;
            }
            String str4 = c20132113pv.LIZIZ;
            if (str4 != null && Intrinsics.LJFF(str4, c20131513pp.LIZIZ)) {
                z = true;
            } else {
                z = false;
            }
            String str5 = c20132113pv.LIZJ;
            if (str5 != null && c20131513pp.LIZJ != null && ((Pattern) c20131513pp.LJIIJ.getValue()).matcher(str5).matches()) {
                C0CND c0cnd = new C0CND(c20131513pp.LIZJ);
                C0CND c0cnd2 = new C0CND(str5);
                if (Intrinsics.LJFF(c0cnd.LL, c0cnd2.LL)) {
                    i = 2;
                } else {
                    i = 0;
                }
                if (Intrinsics.LJFF(c0cnd.LLILLJJLI, c0cnd2.LLILLJJLI)) {
                    i++;
                }
            } else {
                i = -1;
            }
            if (bundle != 0 || z || i > -1) {
                C20132213pw c20132213pw2 = new C20132213pw(this, bundle, c20131513pp.LJIIJJI, z, i);
                if (c20132213pw == null || c20132213pw2.compareTo(c20132213pw) > 0) {
                    c20132213pw = c20132213pw2;
                }
            }
            strGroup = null;
        }
        return c20132213pw;
    }

    public final void LJIILJJIL(String str) {
        Object obj = null;
        if (str == null) {
            this.LLIZLLLIL = 0;
            this.LLILLL = null;
        } else if (!a0.LJJJIL(str)) {
            String strLIZ = C1308920kAM.LIZ(str);
            this.LLIZLLLIL = strLIZ.hashCode();
            this.LLILLL = null;
            C1308860kAG c1308860kAG = new C1308860kAG();
            c1308860kAG.LIZ = strLIZ;
            LIZJ(new C20131513pp(c1308860kAG.LIZ, c1308860kAG.LIZIZ, c1308860kAG.LIZJ));
        } else {
            "Cannot have an empty route".toString();
            throw new IllegalArgumentException("Cannot have an empty route");
        }
        ArrayList arrayList = (ArrayList) this.LLILZIL;
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (Intrinsics.LJFF(((C20131513pp) next).LIZ, C1308920kAM.LIZ(this.LLJ))) {
                obj = next;
                break;
            }
        }
        C19719512Dh.LIZ(arrayList).remove(obj);
        this.LLJ = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r1 < 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0092, code lost:
    
        if (r1 < 0) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20131713pr.equals(java.lang.Object):boolean");
    }

    public void LJIIL(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, R$styleable.Navigator);
        LJIILJJIL(C786410Ut5.Xd(typedArrayObtainAttributes, R$styleable.Navigator_route));
        if (typedArrayObtainAttributes.hasValue(R$styleable.Navigator_android_id)) {
            int resourceId = typedArrayObtainAttributes.getResourceId(R$styleable.Navigator_android_id, 0);
            this.LLIZLLLIL = resourceId;
            this.LLILLL = null;
            this.LLILLL = C1308920kAM.LIZIZ(resourceId, context);
        }
        this.LLILZ = C786410Ut5.Yd(typedArrayObtainAttributes, R$styleable.Navigator_android_label);
        typedArrayObtainAttributes.recycle();
    }

    public final void LJIILIIL(int i, C1308870kAH c1308870kAH) {
        if (!(this instanceof C20132713q1)) {
            if (i != 0) {
                this.LLILZLL.LJFF(i, c1308870kAH);
                return;
            } else {
                "Cannot have an action with actionId 0".toString();
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cannot add action ");
        sbLIZ.append(i);
        sbLIZ.append(" to ");
        sbLIZ.append(this);
        sbLIZ.append(" as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
