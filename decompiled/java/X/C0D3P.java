package X;

import com.ss.android.ugc.aweme.commercialize.ucp.api.model.PdpSupplementData;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D3P, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D3P {
    public final C331730CzT LIZ;
    public final InterfaceC497601wk LIZIZ;
    public final InterfaceC332260D0u<AbstractC332980D3o> LIZJ;
    public final C05YC<Integer> LIZLLL;
    public final Function0<PdpSupplementData> LJ;
    public final Function0<C332690D2l> LJFF;
    public final Function1<C0D3K, Unit> LJI;
    public final InterfaceC332260D0u<InterfaceC1901107cX> LJII;
    public final boolean LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public AnonymousClass0956 LJIIJJI;
    public Map<String, String> LJIIL;
    public Integer LJIILIIL;
    public Map<String, String> LJIILJJIL;
    public Map<String, ? extends Map<String, String>> LJIILL;
    public String LJIILLIIL;
    public int LJIIZILJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ce  */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.String> LIZLLL(java.util.Map<java.lang.String, java.lang.String> r14) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D3P.LIZLLL(java.util.Map):java.util.Map");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.0D21] */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.0D21] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v21, types: [X.0D21] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0D3o] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
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
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v3 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public final void LJIIJJI(java.util.Map<java.lang.String, java.lang.String> r43) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D3P.LJIIJJI(java.util.Map):void");
    }

    public final boolean LJIIIIZZ(String str, String str2) {
        C0D21 c0d21;
        Map<String, String> mapLJ;
        if (!Intrinsics.LJFF(str, this.LJIIIZ) || !Intrinsics.LJFF(str2, this.LJIIJ)) {
            return false;
        }
        AbstractC332980D3o value = this.LIZJ.getValue();
        if (!(value instanceof C0D21) || (c0d21 = (C0D21) value) == null) {
            return false;
        }
        C0D3V c0d3v = c0d21.getPageData().skuSelection;
        if (c0d3v == null || (mapLJ = c0d3v.selectedSkuOptions) == null || !(!mapLJ.isEmpty())) {
            C0D3V c0d3v2 = c0d21.getPageData().skuSelection;
            if (c0d3v2 != null) {
                mapLJ = c0d3v2.defaultSkuOptions;
            } else {
                mapLJ = C2097608Jq.LJ();
            }
        }
        return Intrinsics.LJFF(C332850D3b.LIZJ(LIZLLL(mapLJ)), str2);
    }

    public final void LJIIIZ(C0D3K c0d3k, String str) {
        Map<String, String> mapLJ;
        int i;
        C0D3V c0d3v = c0d3k.skuSelection;
        if (c0d3v == null) {
            this.LJIILJJIL = C2097608Jq.LJ();
            this.LJIILL = C2097608Jq.LJ();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (C332830D2z c332830D2z : c0d3v.skuOptions) {
                String lowerCase = c332830D2z.type.toLowerCase(Locale.ROOT);
                if (!linkedHashMap.containsKey(lowerCase)) {
                    linkedHashMap.put(lowerCase, c332830D2z.type);
                }
                Object linkedHashMap3 = linkedHashMap2.get(lowerCase);
                if (linkedHashMap3 == null) {
                    linkedHashMap3 = new LinkedHashMap();
                    linkedHashMap2.put(lowerCase, linkedHashMap3);
                }
                Map map = (Map) linkedHashMap3;
                for (C332800D2w c332800D2w : c332830D2z.options) {
                    String lowerCase2 = c332800D2w.value.toLowerCase(Locale.ROOT);
                    if (!map.containsKey(lowerCase2)) {
                        map.put(lowerCase2, c332800D2w.value);
                    }
                }
            }
            for (Map.Entry<String, String> entry : c0d3v.defaultSkuOptions.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                Locale locale = Locale.ROOT;
                String lowerCase3 = key.toLowerCase(locale);
                if (!linkedHashMap.containsKey(lowerCase3)) {
                    linkedHashMap.put(lowerCase3, key);
                }
                Object linkedHashMap4 = linkedHashMap2.get(lowerCase3);
                if (linkedHashMap4 == null) {
                    linkedHashMap4 = new LinkedHashMap();
                    linkedHashMap2.put(lowerCase3, linkedHashMap4);
                }
                Map map2 = (Map) linkedHashMap4;
                String lowerCase4 = value.toLowerCase(locale);
                if (!map2.containsKey(lowerCase4)) {
                    map2.put(lowerCase4, value);
                }
            }
            this.LJIILJJIL = linkedHashMap;
            this.LJIILL = linkedHashMap2;
        }
        C0D3V c0d3v2 = c0d3k.skuSelection;
        if (c0d3v2 == null || (mapLJ = c0d3v2.selectedSkuOptions) == null || !(!mapLJ.isEmpty())) {
            C0D3V c0d3v3 = c0d3k.skuSelection;
            if (c0d3v3 != null) {
                mapLJ = c0d3v3.defaultSkuOptions;
            } else {
                mapLJ = C2097608Jq.LJ();
            }
        }
        this.LJIIL = LIZLLL(mapLJ);
        this.LJIILLIIL = str;
        C332690D2l c332690D2lInvoke = this.LJFF.invoke();
        if (c332690D2lInvoke != null) {
            i = c332690D2lInvoke.protocolType;
        } else {
            i = 0;
        }
        this.LJIIZILJ = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.lang.String r11, java.util.Map<java.lang.String, java.lang.String> r12, X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto>> r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof X.C332890D3f
            if (r0 == 0) goto L56
            r9 = r13
            X.0D3f r9 = (X.C332890D3f) r9
            int r2 = r9.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L56
            int r2 = r2 - r1
            r9.LLILLL = r2
        L12:
            java.lang.Object r4 = r9.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r9.LLILLL
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L3a
            if (r0 != r1) goto L72
            X.C155000ia.LIZIZ(r4)
            X.00o6 r4 = (X.C189200o6) r4
            java.lang.Object r1 = r4.m10unboximpl()
        L29:
            boolean r0 = X.C189200o6.m8isSuccessimpl(r1)
            if (r0 == 0) goto L5c
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L36
            r2 = r1
        L36:
            X.C189200o6.m2constructorimpl(r2)
            return r2
        L3a:
            X.C155000ia.LIZIZ(r4)
            r7 = r11
            if (r7 == 0) goto L7a
            int r0 = r7.length()
            if (r0 == 0) goto L7a
            X.0CzT r4 = r10.LIZ
            java.lang.String r6 = "catalog.shopify.com"
            int r5 = r10.LJIIZILJ
            r9.LLILLL = r1
            r8 = r12
            java.lang.Object r1 = r4.LIZLLL(r5, r6, r7, r8, r9)
            if (r1 != r3) goto L29
            return r3
        L56:
            X.0D3f r9 = new X.0D3f
            r9.<init>(r10, r13)
            goto L12
        L5c:
            java.lang.Throwable r1 = X.C189200o6.m5exceptionOrNullimpl(r1)
            if (r1 != 0) goto L69
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r0 = "Global fetch failed"
            r1.<init>(r0)
        L69:
            X.00Yq r2 = new X.00Yq
            r2.<init>(r1)
            X.C189200o6.m2constructorimpl(r2)
            return r2
        L72:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L7a:
            X.C189200o6.m2constructorimpl(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D3P.LJFF(java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(java.lang.String r19, java.lang.String r20, java.util.Map<java.lang.String, java.lang.String> r21) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D3P.LJII(java.lang.String, java.lang.String, java.util.Map):void");
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
    public final void LIZ(String str, String str2, Map<String, String> map, boolean z) {
        AbstractC332980D3o value;
        AbstractC332980D3o c0d21;
        List list;
        C0D3G c0d3g;
        if (!LJIIIIZZ(str, str2)) {
            return;
        }
        InterfaceC332260D0u<AbstractC332980D3o> interfaceC332260D0u = this.LIZJ;
        do {
            value = interfaceC332260D0u.getValue();
            AbstractC332980D3o abstractC332980D3o = value;
            boolean z2 = abstractC332980D3o instanceof C0D21;
            c0d21 = abstractC332980D3o;
            if (z2) {
                C0D21 c0d212 = (C0D21) abstractC332980D3o;
                C0D3Q.LIZ.getClass();
                String strLIZJ = C332850D3b.LIZJ(map);
                C0D3I c0d3iLIZ = c0d212.getPageData().productMedia;
                c0d21 = c0d212;
                if (c0d3iLIZ != null) {
                    c0d21 = c0d212;
                    if (c0d3iLIZ.canAcceptCatalogEnrichment(strLIZJ)) {
                        C0D3V c0d3v = c0d212.getPageData().skuSelection;
                        if (c0d3v == null || (list = c0d3v.variants) == null) {
                            list = C13BV.INSTANCE;
                        }
                        Pair pairLIZIZ = C332790D2v.LIZIZ(C332790D2v.LJ(list, map), C13BV.INSTANCE, c0d212.getPageData().entrySpuImageUrls);
                        List list2 = (List) pairLIZIZ.getFirst();
                        EnumC332810D2x enumC332810D2x = (EnumC332810D2x) pairLIZIZ.getSecond();
                        if (list2.isEmpty()) {
                            if (z && !c0d3iLIZ.isLocked()) {
                                c0d3iLIZ = c0d3iLIZ.copy(c0d3iLIZ.imageUrls, c0d3iLIZ.source, c0d3iLIZ.status, c0d3iLIZ.presentation, C0D3G.LOCKED, c0d3iLIZ.selectionFingerprint);
                            }
                        } else if (!Intrinsics.LJFF(list2, c0d3iLIZ.imageUrls) || (z && !c0d3iLIZ.isLocked())) {
                            C0D3F c0d3f = C0D3I.Companion;
                            if (z) {
                                c0d3g = C0D3G.LOCKED;
                            } else {
                                c0d3g = C0D3G.ACCEPT_ENRICHMENT;
                            }
                            c0d3iLIZ = C0D3F.LIZ(c0d3f, list2, strLIZJ, enumC332810D2x, c0d3g, 8);
                        }
                        C0D3K pageData = c0d212.getPageData();
                        c0d21 = new C0D21(pageData.copy(pageData.productId, pageData.entrySpuImageUrls, pageData.shopHeader, c0d3iLIZ, pageData.priceInfo, pageData.titleRating, pageData.skuSelection, pageData.descriptionInfo, pageData.logisticsInfo, pageData.dealsInfo, pageData.reviewInfo, pageData.moreFromShop, pageData.bottomBar));
                    }
                }
            }
        } while (!interfaceC332260D0u.compareAndSet(value, c0d21));
    }

    public final void LIZIZ(String str, String str2, Map<String, String> map, UniversalProductDto universalProductDto) {
        AbstractC332980D3o value;
        AbstractC332980D3o abstractC332980D3oLIZLLL;
        if (universalProductDto != null && LJIIIIZZ(str, str2)) {
            InterfaceC332260D0u<AbstractC332980D3o> interfaceC332260D0u = this.LIZJ;
            do {
                value = interfaceC332260D0u.getValue();
                abstractC332980D3oLIZLLL = value;
                if (abstractC332980D3oLIZLLL instanceof C0D21) {
                    C0D3Q.LIZ.getClass();
                    abstractC332980D3oLIZLLL = C0D3Q.LIZLLL((C0D21) abstractC332980D3oLIZLLL, universalProductDto, map);
                }
            } while (!interfaceC332260D0u.compareAndSet(value, abstractC332980D3oLIZLLL));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.lang.String r15, java.lang.String r16, java.util.Map<java.lang.String, java.lang.String> r17, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto> r18) throws java.lang.Throwable {
        /*
            r14 = this;
            r3 = r18
            boolean r0 = r3 instanceof X.C332900D3g
            if (r0 == 0) goto L23
            r13 = r3
            X.0D3g r13 = (X.C332900D3g) r13
            int r2 = r13.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r13.LLILLL = r2
        L14:
            java.lang.Object r1 = r13.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r13.LLILLL
            r4 = 1
            r7 = 0
            if (r0 == 0) goto L31
            if (r0 != r4) goto L29
            goto L9f
        L23:
            X.0D3g r13 = new X.0D3g
            r13.<init>(r14, r3)
            goto L14
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C155000ia.LIZIZ(r1)
            java.util.Set r0 = r17.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L3c:
            boolean r0 = r2.hasNext()
            r6 = 0
            if (r0 == 0) goto L6a
            java.lang.Object r5 = r2.next()
            r0 = r5
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "color"
            boolean r0 = kotlin.text.u.LJIJI(r1, r0, r4)
            if (r0 != 0) goto L68
            java.lang.String r0 = "colour"
            boolean r0 = kotlin.text.u.LJIJI(r1, r0, r4)
            if (r0 != 0) goto L68
            r0 = 0
        L61:
            if (r0 == 0) goto L3c
        L63:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            if (r5 != 0) goto L6c
            return r7
        L68:
            r0 = 1
            goto L61
        L6a:
            r5 = r7
            goto L63
        L6c:
            java.lang.Object r2 = r5.getKey()
            java.lang.Object r1 = r5.getValue()
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            java.util.Map r12 = X.C2097908Jt.LIZJ(r0)
            int r0 = r14.LJIIZILJ
            if (r0 == r4) goto L8b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = X.C0D1H.LIZ(r0)
            if (r0 == 0) goto L8c
        L8b:
            r6 = 1
        L8c:
            if (r6 == 0) goto L8f
            return r7
        L8f:
            X.0CzT r8 = r14.LIZ     // Catch: java.lang.Exception -> Lb2
            int r9 = r14.LJIIZILJ     // Catch: java.lang.Exception -> Lb2
            r13.LLILLL = r4     // Catch: java.lang.Exception -> Lb2
            r11 = r16
            r10 = r15
            java.lang.Object r1 = r8.LIZJ(r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> Lb2
            if (r1 != r3) goto La8
            return r3
        L9f:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> Lb2
            X.00o6 r1 = (X.C189200o6) r1     // Catch: java.lang.Exception -> Lb2
            java.lang.Object r1 = r1.m10unboximpl()     // Catch: java.lang.Exception -> Lb2
        La8:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)     // Catch: java.lang.Exception -> Lb2
            if (r0 == 0) goto Laf
            r1 = r7
        Laf:
            com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto r1 = (com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto) r1     // Catch: java.lang.Exception -> Lb2
            return r1
        Lb2:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D3P.LJ(java.lang.String, java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r8 >= r9) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0090 -> B:12:0x0036). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(java.lang.String r11, java.util.Map r12, X.InterfaceC1364105Vn r13, boolean r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D3P.LJI(java.lang.String, java.util.Map, X.05Vn, boolean):java.lang.Object");
    }

    public final void LJIIJ(String str, String str2, Map<String, String> map, boolean z, boolean z2, int i) {
        if (i > 3) {
            return;
        }
        this.LJIIJJI = C23250099c.LIZLLL(this.LIZIZ, C0PEM.LIZ, null, new C0D3R(((long) i) * 1000, this, map, str, str2, z, z2, i, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x066a A[SYNTHETIC] */
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
    public final void LIZJ(java.lang.String r57, java.lang.String r58, java.util.Map<java.lang.String, java.lang.String> r59, boolean r60, com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto r61, kotlin.jvm.functions.Function0<kotlin.Unit> r62, kotlin.jvm.functions.Function0<kotlin.Unit> r63) {
        /*
            Method dump skipped, instruction units count: 1746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D3P.LIZJ(java.lang.String, java.lang.String, java.util.Map, boolean, com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0):void");
    }

    public C0D3P(C331730CzT c331730CzT, InterfaceC497601wk interfaceC497601wk, C2252321DDq c2252321DDq, C2252331DDr c2252331DDr, Function0 function0, Function0 function02, Function1 function1, C2252321DDq c2252321DDq2, int i) {
        boolean z;
        c2252321DDq2 = (i & 128) != 0 ? null : c2252321DDq2;
        if ((i & 256) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LIZ = c331730CzT;
        this.LIZIZ = interfaceC497601wk;
        this.LIZJ = c2252321DDq;
        this.LIZLLL = c2252331DDr;
        this.LJ = function0;
        this.LJFF = function02;
        this.LJI = function1;
        this.LJII = c2252321DDq2;
        this.LJIIIIZZ = z;
        this.LJIIIZ = "";
        this.LJIIJ = "";
        this.LJIILJJIL = C2097608Jq.LJ();
        this.LJIILL = C2097608Jq.LJ();
        this.LJIILLIIL = "";
    }
}
