package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS123S1100000_9;
import kotlin.jvm.internal.AwS140S1100000_26;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0v02, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1725360v02 {
    public static final C1725360v02 LIZ = new C1725360v02();
    public static final ConcurrentHashMap<String, InterfaceC1725350v01> LIZIZ = new ConcurrentHashMap<>();

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0v0S] */
    public final InterfaceC1725350v01 LIZ(final String str) {
        ConcurrentHashMap<String, InterfaceC1725350v01> concurrentHashMap = LIZIZ;
        InterfaceC1725350v01 interfaceC1725350v01 = concurrentHashMap.get(str);
        if (interfaceC1725350v01 == null) {
            synchronized (this) {
                try {
                    InterfaceC1725350v01 interfaceC1725350v012 = concurrentHashMap.get(str);
                    if (interfaceC1725350v012 == null) {
                        final ?? r1 = new InterfaceC1725350v01(str) { // from class: X.0v0S
                            public final String LIZ;
                            public final C1725630v0T LIZIZ = new C1725630v0T(0);
                            public Function1<? super JSONObject, Unit> LIZJ;

                            @Override // X.InterfaceC1725350v01
                            public final JSONObject LIZLLL() {
                                C1725630v0T c1725630v0T = this.LIZIZ;
                                if (c1725630v0T.LIZIZ.isEmpty()) {
                                    return null;
                                }
                                return c1725630v0T.LJFF();
                            }

                            @Override // X.InterfaceC1725350v01
                            public final JSONObject LJ() {
                                return this.LIZIZ.LJ();
                            }

                            @Override // X.InterfaceC1725350v01
                            public final JSONObject LJI() {
                                C1725610v0R c1725610v0R = this.LIZIZ.LIZ;
                                if (c1725610v0R != null) {
                                    return C1725610v0R.LIZ(c1725610v0R, false, false, 3);
                                }
                                return null;
                            }

                            {
                                this.LIZ = str;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
                            /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[PHI: r12
                              0x003a: PHI (r12v2 java.lang.String) = (r12v0 java.lang.String), (r12v3 java.lang.String) binds: [B:15:0x0038, B:13:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
                            /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
                            @Override // X.InterfaceC1725350v01
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void LIZ(java.lang.String r15, org.json.JSONObject r16, kotlin.jvm.internal.AwS588S0100000_9 r17) throws org.json.JSONException {
                                /*
                                    r14 = this;
                                    java.lang.String r0 = "OpenContainer_1"
                                    r6 = r15
                                    android.net.Uri r1 = X.C759510Tqn.LIZLLL(r6, r0)
                                    r11 = 0
                                    if (r1 == 0) goto L7b
                                    java.lang.String r0 = "url"
                                    java.lang.String r3 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r1, r0)
                                    if (r3 == 0) goto L7c
                                    java.lang.String r0 = "OpenContainer_2"
                                    android.net.Uri r0 = X.C759510Tqn.LIZLLL(r3, r0)
                                    if (r0 == 0) goto L7c
                                    r0.toString()
                                    java.lang.String r9 = r0.getHost()
                                    java.lang.String r10 = r0.getPath()
                                L25:
                                    java.lang.String r0 = "bdhm_bid"
                                    java.lang.String r11 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r1, r0)
                                L2b:
                                    java.lang.String r13 = ""
                                    if (r1 == 0) goto L37
                                    java.lang.String r0 = "pipo_hybrid_biz"
                                    java.lang.String r12 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r1, r0)
                                    if (r12 != 0) goto L3a
                                L37:
                                    r12 = r13
                                    if (r1 == 0) goto L43
                                L3a:
                                    java.lang.String r0 = "pipo_additional_tracking_params"
                                    java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r1, r0)
                                    if (r0 == 0) goto L43
                                    r13 = r0
                                L43:
                                    X.0v0R r5 = new X.0v0R
                                    long r7 = java.lang.System.currentTimeMillis()
                                    r5.<init>(r6, r7, r9, r10, r11, r12, r13)
                                    X.0v0T r0 = r14.LIZIZ
                                    r0.LIZ = r5
                                    r2 = 1
                                    r4 = 0
                                    r0 = 2
                                    org.json.JSONObject r1 = X.C1725610v0R.LIZ(r5, r2, r4, r0)
                                    org.json.JSONObject[] r0 = new org.json.JSONObject[r0]
                                    r0[r4] = r1
                                    r0[r2] = r16
                                    org.json.JSONObject r2 = X.C1530940pwS.LIZ(r0)
                                    java.lang.String r1 = "schema_length"
                                    int r0 = r6.length()
                                    r2.put(r1, r0)
                                    if (r3 == 0) goto L70
                                    int r4 = r3.length()
                                L70:
                                    java.lang.String r0 = "url_length"
                                    r2.put(r0, r4)
                                    r0 = r17
                                    r0.invoke(r2)
                                    return
                                L7b:
                                    r3 = r11
                                L7c:
                                    r9 = r11
                                    r10 = r11
                                    if (r1 == 0) goto L2b
                                    goto L25
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C1725620v0S.LIZ(java.lang.String, org.json.JSONObject, kotlin.jvm.internal.AwS588S0100000_9):void");
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0017 A[PHI: r3
                              0x0017: PHI (r3v3 java.lang.String) = (r3v0 java.lang.String), (r3v4 java.lang.String) binds: [B:7:0x0015, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
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
                            @Override // X.InterfaceC1725350v01
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void LIZIZ(java.lang.String r16, org.json.JSONObject r17, kotlin.jvm.internal.AwS123S1100000_9 r18) {
                                /*
                                    r15 = this;
                                    java.lang.String r0 = "onPageStarted"
                                    r1 = r16
                                    android.net.Uri r0 = X.C759510Tqn.LIZLLL(r1, r0)
                                    X.0v0T r9 = r15.LIZIZ
                                    java.lang.String r4 = ""
                                    if (r0 == 0) goto L14
                                    java.lang.String r3 = r0.getHost()
                                    if (r3 != 0) goto L17
                                L14:
                                    r3 = r4
                                    if (r0 == 0) goto L1e
                                L17:
                                    java.lang.String r0 = r0.getPath()
                                    if (r0 == 0) goto L1e
                                    r4 = r0
                                L1e:
                                    r9.getClass()
                                    X.0v0U r2 = new X.0v0U
                                    java.lang.String r5 = "decision"
                                    long r6 = java.lang.System.currentTimeMillis()
                                    r8 = 24
                                    r2.<init>(r3, r4, r5, r6, r8)
                                    java.util.ArrayList r14 = new java.util.ArrayList
                                    r14.<init>()
                                    java.util.List<X.0v0U> r0 = r9.LIZIZ
                                    java.lang.Object r13 = X.C13LP.LJJLIIIJL(r0)
                                    X.0v0U r13 = (X.C1725640v0U) r13
                                    if (r13 == 0) goto L5c
                                    java.lang.String r1 = r13.LIZJ
                                    java.lang.String r0 = "decision"
                                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                                    if (r0 == 0) goto L5c
                                    boolean r0 = X.C1725630v0T.LIZLLL(r13, r2)
                                    if (r0 != 0) goto L89
                                    com.ss.android.ugc.aweme.pipo.hybrid.settings.PipoContainerEventReportConfig r0 = X.C1725380v04.LIZ()
                                    boolean r0 = r0.enableAddManualRedirect
                                    if (r0 == 0) goto L5c
                                    long r11 = r13.LJFF
                                    java.lang.String r10 = "redirect"
                                    r9.LIZIZ(r10, r11, r13, r14)
                                L5c:
                                    java.util.List<X.0v0U> r0 = r9.LIZIZ
                                    r0.add(r2)
                                    org.json.JSONObject r0 = r9.LJFF()
                                    r14.add(r0)
                                    java.util.Iterator r3 = r14.iterator()
                                L6c:
                                    boolean r0 = r3.hasNext()
                                    if (r0 == 0) goto L89
                                    java.lang.Object r2 = r3.next()
                                    r0 = 2
                                    org.json.JSONObject[] r1 = new org.json.JSONObject[r0]
                                    r0 = 0
                                    r1[r0] = r2
                                    r0 = 1
                                    r1[r0] = r17
                                    org.json.JSONObject r0 = X.C1530940pwS.LIZ(r1)
                                    r1 = r18
                                    r1.invoke(r0)
                                    goto L6c
                                L89:
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C1725620v0S.LIZIZ(java.lang.String, org.json.JSONObject, kotlin.jvm.internal.AwS123S1100000_9):void");
                            }

                            @Override // X.InterfaceC1725350v01
                            public final void LIZJ(String str2, JSONObject jSONObject, AwS140S1100000_26 awS140S1100000_26) throws JSONException {
                                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                                Uri uriLIZLLL = C759510Tqn.LIZLLL(str2, "CloseContainer_1");
                                String str3 = null;
                                if (uriLIZLLL != null) {
                                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLIZLLL, "url");
                                } else {
                                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
                                }
                                Uri uriLIZLLL2 = C759510Tqn.LIZLLL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "CloseContainer_2");
                                if (uriLIZLLL2 != null) {
                                    uriLIZLLL2.getHost();
                                    uriLIZLLL2.getPath();
                                    UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLIZLLL2, "bdhm_bid");
                                }
                                if (uriLIZLLL2 != null) {
                                    uriLIZLLL2.toString();
                                }
                                C1725610v0R c1725610v0R = this.LIZIZ.LIZ;
                                if (c1725610v0R != null) {
                                    str3 = c1725610v0R.LIZ;
                                }
                                boolean zLJFF = Intrinsics.LJFF(str3, str2);
                                JSONObject jSONObjectLJ = this.LIZIZ.LJ();
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("is_url_changed", !zLJFF ? 1 : 0);
                                awS140S1100000_26.invoke(C1530940pwS.LIZ(jSONObjectLJ, jSONObject2, jSONObject));
                                Function1<? super JSONObject, Unit> function1 = this.LIZJ;
                                if (function1 != null) {
                                    C1725630v0T c1725630v0T = this.LIZIZ;
                                    if (!c1725630v0T.LIZJ.isEmpty()) {
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        for (C1725650v0V c1725650v0V : c1725630v0T.LIZJ) {
                                            String str4 = c1725650v0V.LJFF;
                                            String str5 = "";
                                            if (str4 == null) {
                                                str4 = "";
                                            }
                                            String str6 = c1725650v0V.LJI;
                                            if (str6 != null) {
                                                str5 = str6;
                                            }
                                            Pair pair = new Pair(str4, str5);
                                            if (linkedHashMap.containsKey(pair)) {
                                                List list = (List) linkedHashMap.get(pair);
                                                if (list != null) {
                                                    list.add(c1725650v0V);
                                                }
                                            } else {
                                                linkedHashMap.put(pair, C1697810uHb.LJIILJJIL(c1725650v0V));
                                            }
                                        }
                                        ArrayList arrayList = new ArrayList();
                                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                                            Pair pair2 = (Pair) entry.getKey();
                                            List<C1725650v0V> list2 = (List) entry.getValue();
                                            JSONArray jSONArray = new JSONArray();
                                            Iterator it2 = list2.iterator();
                                            while (it2.hasNext()) {
                                                jSONArray.put(((C1725650v0V) it2.next()).LIZIZ);
                                            }
                                            JSONArray jSONArray2 = new JSONArray();
                                            for (C1725650v0V c1725650v0V2 : list2) {
                                                c1725650v0V2.getClass();
                                                JSONObject jSONObject3 = new JSONObject();
                                                jSONObject3.put("url_host", c1725650v0V2.LIZ);
                                                jSONObject3.put("url_path", c1725650v0V2.LIZIZ);
                                                jSONObject3.put("url_query", c1725650v0V2.LIZJ);
                                                jSONArray2.put(jSONObject3);
                                            }
                                            JSONArray jSONArray3 = new JSONArray();
                                            for (C1725650v0V c1725650v0V3 : list2) {
                                                c1725650v0V3.getClass();
                                                JSONObject jSONObject4 = new JSONObject();
                                                jSONObject4.put("error_code", c1725650v0V3.LIZLLL);
                                                jSONObject4.put("error_message", c1725650v0V3.LJ);
                                                jSONArray3.put(jSONObject4);
                                            }
                                            JSONObject jSONObject5 = new JSONObject();
                                            jSONObject5.put("url_host", pair2.getFirst());
                                            jSONObject5.put("url_path", pair2.getSecond());
                                            jSONObject5.put("resource_error_cnt", list2.size());
                                            jSONObject5.put("resource_error_url_path", jSONArray.toString());
                                            jSONObject5.put("resource_error_url", jSONArray2.toString());
                                            jSONObject5.put("resource_error_codes", jSONArray3.toString());
                                            arrayList.add(jSONObject5);
                                        }
                                        Iterator it3 = arrayList.iterator();
                                        while (it3.hasNext()) {
                                            function1.invoke(it3.next());
                                        }
                                    }
                                }
                                C1725360v02.LIZIZ.remove(this.LIZ);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0019 A[PHI: r10
                              0x0019: PHI (r10v2 java.lang.String) = (r10v0 java.lang.String), (r10v3 java.lang.String) binds: [B:7:0x0017, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
                            @Override // X.InterfaceC1725350v01
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void LJII(java.lang.String r17, org.json.JSONObject r18, kotlin.jvm.internal.AwS123S1100000_9 r19) {
                                /*
                                    Method dump skipped, instruction units count: 230
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C1725620v0S.LJII(java.lang.String, org.json.JSONObject, kotlin.jvm.internal.AwS123S1100000_9):void");
                            }

                            /* JADX WARN: Removed duplicated region for block: B:8:0x0015 A[PHI: r4
                              0x0015: PHI (r4v2 java.lang.String) = (r4v0 java.lang.String), (r4v3 java.lang.String) binds: [B:7:0x0013, B:5:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
                            @Override // X.InterfaceC1725350v01
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void LJFF(java.lang.String r12, java.lang.String r13, java.lang.String r14, org.json.JSONObject r15, kotlin.jvm.functions.Function1<? super org.json.JSONObject, kotlin.Unit> r16) {
                                /*
                                    r11 = this;
                                    java.lang.String r0 = "onResourceError"
                                    android.net.Uri r1 = X.C759510Tqn.LIZLLL(r12, r0)
                                    X.0v0T r3 = r11.LIZIZ
                                    java.lang.String r5 = ""
                                    if (r1 == 0) goto L12
                                    java.lang.String r4 = r1.getHost()
                                    if (r4 != 0) goto L15
                                L12:
                                    r4 = r5
                                    if (r1 == 0) goto L1c
                                L15:
                                    java.lang.String r0 = r1.getPath()
                                    if (r0 == 0) goto L1c
                                    r5 = r0
                                L1c:
                                    r9 = 0
                                    if (r1 == 0) goto L6c
                                    java.lang.String r6 = r1.getQuery()
                                L23:
                                    java.util.List<X.0v0U> r1 = r3.LIZIZ
                                    int r0 = r1.size()
                                    java.util.ListIterator r2 = r1.listIterator(r0)
                                L2d:
                                    boolean r0 = r2.hasPrevious()
                                    if (r0 == 0) goto L6a
                                    java.lang.Object r0 = r2.previous()
                                    X.0v0U r0 = (X.C1725640v0U) r0
                                    java.lang.String r1 = r0.LIZJ
                                    java.lang.String r0 = "decision"
                                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                                    if (r0 == 0) goto L2d
                                    int r1 = r2.nextIndex()
                                    if (r1 < 0) goto L6a
                                    java.util.List<X.0v0U> r0 = r3.LIZIZ
                                    java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r1)
                                    X.0v0U r1 = (X.C1725640v0U) r1
                                L51:
                                    java.util.List<X.0v0V> r0 = r3.LIZJ
                                    X.0v0V r3 = new X.0v0V
                                    if (r1 == 0) goto L68
                                    java.lang.String r9 = r1.LIZ
                                    java.lang.String r10 = r1.LIZIZ
                                L5b:
                                    r8 = r14
                                    r7 = r13
                                    r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                                    r0.add(r3)
                                    r0 = r16
                                    r11.LIZJ = r0
                                    return
                                L68:
                                    r10 = r9
                                    goto L5b
                                L6a:
                                    r1 = r9
                                    goto L51
                                L6c:
                                    r6 = r9
                                    goto L23
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C1725620v0S.LJFF(java.lang.String, java.lang.String, java.lang.String, org.json.JSONObject, kotlin.jvm.functions.Function1):void");
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0017 A[PHI: r8
                              0x0017: PHI (r8v2 java.lang.String) = (r8v0 java.lang.String), (r8v3 java.lang.String) binds: [B:7:0x0015, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
                            @Override // X.InterfaceC1725350v01
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void LJIIIIZZ(java.lang.String r16, java.lang.String r17, java.lang.String r18, org.json.JSONObject r19, kotlin.jvm.functions.Function1<? super org.json.JSONObject, kotlin.Unit> r20) {
                                /*
                                    Method dump skipped, instruction units count: 223
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C1725620v0S.LJIIIIZZ(java.lang.String, java.lang.String, java.lang.String, org.json.JSONObject, kotlin.jvm.functions.Function1):void");
                            }
                        };
                        InterfaceC1725350v01 interfaceC1725350v013 = new InterfaceC1725350v01(r1) { // from class: X.0uzz
                            public final InterfaceC1725350v01 LIZ;

                            @Override // X.InterfaceC1725350v01
                            public final JSONObject LIZLLL() {
                                try {
                                    return this.LIZ.LIZLLL();
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    C1AF0.LJ(th);
                                    return null;
                                }
                            }

                            @Override // X.InterfaceC1725350v01
                            public final JSONObject LJ() {
                                try {
                                    return this.LIZ.LJ();
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    C1AF0.LJ(th);
                                    return null;
                                }
                            }

                            @Override // X.InterfaceC1725350v01
                            public final JSONObject LJI() {
                                try {
                                    return this.LIZ.LJI();
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    C1AF0.LJ(th);
                                    return null;
                                }
                            }

                            {
                                this.LIZ = r1;
                            }

                            @Override // X.InterfaceC1725350v01
                            public final void LIZ(String str2, JSONObject jSONObject, AwS588S0100000_9 awS588S0100000_9) {
                                try {
                                    this.LIZ.LIZ(str2, jSONObject, awS588S0100000_9);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    C1AF0.LJ(th);
                                }
                            }

                            @Override // X.InterfaceC1725350v01
                            public final void LIZIZ(String str2, JSONObject jSONObject, AwS123S1100000_9 awS123S1100000_9) {
                                try {
                                    this.LIZ.LIZIZ(str2, jSONObject, awS123S1100000_9);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    C1AF0.LJ(th);
                                }
                            }

                            @Override // X.InterfaceC1725350v01
                            public final void LIZJ(String str2, JSONObject jSONObject, AwS140S1100000_26 awS140S1100000_26) {
                                try {
                                    this.LIZ.LIZJ(str2, jSONObject, awS140S1100000_26);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    C1AF0.LJ(th);
                                }
                            }

                            @Override // X.InterfaceC1725350v01
                            public final void LJII(String str2, JSONObject jSONObject, AwS123S1100000_9 awS123S1100000_9) {
                                try {
                                    this.LIZ.LJII(str2, jSONObject, awS123S1100000_9);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    C1AF0.LJ(th);
                                }
                            }

                            @Override // X.InterfaceC1725350v01
                            public final void LJFF(String str2, String str3, String str4, JSONObject jSONObject, Function1<? super JSONObject, Unit> function1) {
                                try {
                                    this.LIZ.LJFF(str2, str3, str4, jSONObject, function1);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    C1AF0.LJ(th);
                                }
                            }

                            @Override // X.InterfaceC1725350v01
                            public final void LJIIIIZZ(String str2, String str3, String str4, JSONObject jSONObject, Function1<? super JSONObject, Unit> function1) {
                                try {
                                    this.LIZ.LJIIIIZZ(str2, str3, str4, jSONObject, function1);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    C1AF0.LJ(th);
                                }
                            }
                        };
                        concurrentHashMap.put(str, interfaceC1725350v013);
                        return interfaceC1725350v013;
                    }
                    return interfaceC1725350v012;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return interfaceC1725350v01;
    }
}
