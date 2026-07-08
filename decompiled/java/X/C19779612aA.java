package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.12aA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19779612aA extends AbstractC19781512aT implements InterfaceC19786712bJ {
    public final C830490Whz LIZLLL;
    public final C830490Whz LJ;
    public final C830490Whz LJFF;
    public final C830490Whz LJI;
    public final C830490Whz LJII;
    public final C830490Whz LJIIIIZZ;
    public final C19780512aJ LJIIIZ;
    public final C19788912bf LJIIJ;
    public final C830490Whz LJIIJJI;
    public final C830490Whz LJIIL;
    public final C830490Whz LJIILIIL;

    @Override // X.AbstractC19781512aT
    public final boolean LJIIJ() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.12aJ] */
    public C19779612aA(C12Z4 c12z4) {
        super(c12z4);
        this.LIZLLL = new C830490Whz();
        this.LJ = new C830490Whz();
        this.LJFF = new C830490Whz();
        this.LJI = new C830490Whz();
        this.LJII = new C830490Whz();
        this.LJIIJJI = new C830490Whz();
        this.LJIIL = new C830490Whz();
        this.LJIILIIL = new C830490Whz();
        this.LJIIIIZZ = new C830490Whz();
        this.LJIIIZ = new C603820NmG<String, C19793312cN>() { // from class: X.12aJ
            {
                super(20);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v6, types: [X.12cN, java.lang.Object] */
            @Override // X.C603820NmG
            public final /* synthetic */ C19793312cN LIZ(String str) throws Throwable {
                String str2 = str;
                C0W3J.LJI(str2);
                C19779612aA c19779612aA = this.LJI;
                c19779612aA.LJIIIIZZ();
                C0W3J.LJI(str2);
                if (!c19779612aA.LJJIIZ(str2)) {
                    return null;
                }
                if (c19779612aA.LJII.containsKey(str2) && c19779612aA.LJII.get(str2) != 0) {
                    c19779612aA.LJIJJ(str2, (C19779712aB) c19779612aA.LJII.get(str2));
                } else {
                    c19779612aA.LJJIJIIJI(str2);
                }
                return ((LinkedHashMap) c19779612aA.LJIIIZ.LJIIIIZZ()).get(str2);
            }
        };
        this.LJIIJ = new C19788912bf(this);
    }

    public static C830490Whz LJIILL(C19779712aB c19779712aB) {
        C830490Whz c830490Whz = new C830490Whz();
        for (C19780312aH c19780312aH : c19779712aB.zzi) {
            c830490Whz.put(c19780312aH.zzf, c19780312aH.zzg);
        }
        return c830490Whz;
    }

    public static EnumC19776112Zb LJIILLIIL(EnumC19789312bj enumC19789312bj) {
        int i = C19789512bl.LIZIZ[enumC19789312bj.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return null;
                    }
                    return EnumC19776112Zb.AD_PERSONALIZATION;
                }
                return EnumC19776112Zb.AD_USER_DATA;
            }
            return EnumC19776112Zb.ANALYTICS_STORAGE;
        }
        return EnumC19776112Zb.AD_STORAGE;
    }

    public final long LJIIJJI(String str) throws Throwable {
        String strLJIJ = LJIJ(str, "measurement.account.time_zone_offset_minutes");
        if (!TextUtils.isEmpty(strLJIJ)) {
            try {
                return CastLongProtector.parseLong(strLJIJ);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                LJIILJJIL().LJIIIIZZ.LIZIZ(C19806212eS.LJIIJ(str), "Unable to parse timezone offset. appId", e);
                return 0L;
            }
        }
        return 0L;
    }

    public final C19779812aC LJJ(String str) throws Throwable {
        LJ();
        LJJIJIIJI(str);
        C19779712aB c19779712aBLJJIFFI = LJJIFFI(str);
        if (c19779712aBLJJIFFI != null && c19779712aBLJJIFFI.LJJIJ()) {
            return c19779712aBLJJIFFI.LJJIII();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C19779712aB LJJIFFI(String str) throws Throwable {
        LJIIIIZZ();
        LJ();
        C0W3J.LJI(str);
        LJJIJIIJI(str);
        return (C19779712aB) this.LJII.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String LJJIIJZLJL(String str) throws Throwable {
        LJ();
        LJJIJIIJI(str);
        return (String) this.LJIIJJI.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJJIIZ(String str) {
        C19779712aB c19779712aB;
        if (TextUtils.isEmpty(str) || (c19779712aB = (C19779712aB) this.LJII.get(str)) == null || c19779712aB.zzn.size() == 0) {
            return false;
        }
        return true;
    }

    public final boolean LJJIIZI(String str) throws Throwable {
        LJ();
        LJJIJIIJI(str);
        if (this.LJ.get(str) != 0 && ((Set) this.LJ.get(str)).contains("app_instance_id")) {
            return true;
        }
        return false;
    }

    public final boolean LJJIJ(String str) throws Throwable {
        LJ();
        LJJIJIIJI(str);
        if (this.LJ.get(str) != 0) {
            if (((Set) this.LJ.get(str)).contains("os_version") || ((Set) this.LJ.get(str)).contains("device_info")) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJI(java.lang.String r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19779612aA.LJJIJIIJI(java.lang.String):void");
    }

    public final C19779712aB LJIILIIL(String str, byte[] bArr) {
        Long lValueOf;
        if (bArr == null) {
            return C19779712aB.LJJIIZ();
        }
        try {
            C19783812aq c19783812aqLJJIIJ = C19779712aB.LJJIIJ();
            C19777312Zn.LJIJJLI(c19783812aqLJJIIJ, bArr);
            C19779712aB c19779712aB = (C19779712aB) c19783812aqLJJIIJ.LJI();
            C19811612fK c19811612fK = LJIILJJIL().LJIILIIL;
            String str2 = null;
            if (c19779712aB.LJJIJIL()) {
                lValueOf = Long.valueOf(c19779712aB.zzf);
            } else {
                lValueOf = null;
            }
            if (c19779712aB.LJJIJIIJI()) {
                str2 = c19779712aB.zzg;
            }
            c19811612fK.LIZIZ(lValueOf, "Parsed config. version, gmp_app_id", str2);
            return c19779712aB;
        } catch (C19903212u6 e) {
            TryCatchGuardChecker.doCheck(e);
            LJIILJJIL().LJIIIIZZ.LIZIZ(C19806212eS.LJIIJ(str), "Unable to merge remote config. appId", e);
            return C19779712aB.LJJIIZ();
        } catch (RuntimeException e2) {
            TryCatchGuardChecker.doCheck(e2);
            LJIILJJIL().LJIIIIZZ.LIZIZ(C19806212eS.LJIIJ(str), "Unable to merge remote config. appId", e2);
            return C19779712aB.LJJIIZ();
        }
    }

    public final EnumC19782112aZ LJIIZILJ(String str, EnumC19776112Zb enumC19776112Zb) throws Throwable {
        LJ();
        LJJIJIIJI(str);
        C19779812aC c19779812aCLJJ = LJJ(str);
        if (c19779812aCLJJ == null) {
            return EnumC19782112aZ.UNINITIALIZED;
        }
        for (C19789212bi c19789212bi : c19779812aCLJJ.zzj) {
            if (LJIILLIIL(c19789212bi.LJJII()) == enumC19776112Zb) {
                int i = C19789512bl.LIZJ[c19789212bi.LJJIFFI().ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        return EnumC19782112aZ.UNINITIALIZED;
                    }
                    return EnumC19782112aZ.GRANTED;
                }
                return EnumC19782112aZ.DENIED;
            }
        }
        return EnumC19782112aZ.UNINITIALIZED;
    }

    @Override // X.InterfaceC19786712bJ
    public final String LJIJ(String str, String str2) throws Throwable {
        LJ();
        LJJIJIIJI(str);
        Map map = (Map) this.LIZLLL.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final void LJIJI(String str, C19783812aq c19783812aq) {
        HashSet hashSet = new HashSet();
        C830490Whz c830490Whz = new C830490Whz();
        C830490Whz c830490Whz2 = new C830490Whz();
        C830490Whz c830490Whz3 = new C830490Whz();
        Iterator it2 = Collections.unmodifiableList(((C19779712aB) c19783812aq.LLILLJJLI).zzo).iterator();
        while (it2.hasNext()) {
            hashSet.add(((C19787112bN) it2.next()).zzf);
        }
        for (int i = 0; i < ((C19779712aB) c19783812aq.LLILLJJLI).LJJII(); i++) {
            C19781012aO c19781012aOLJIJJ = ((C19779712aB) c19783812aq.LLILLJJLI).LJJI(i).LJIJJ();
            if (c19781012aOLJIJJ.LJIIL().isEmpty()) {
                LJIILJJIL().LJIIIIZZ.LIZJ("EventConfig contained null event name");
            } else {
                String strLJIIL = c19781012aOLJIJJ.LJIIL();
                String strLIZ = C19785212b4.LIZ(c19781012aOLJIJJ.LJIIL(), C19781212aQ.LIZ, C19781212aQ.LIZJ);
                if (!TextUtils.isEmpty(strLIZ)) {
                    c19781012aOLJIJJ.LJIIJ();
                    C19780112aF.LJJIFFI((C19780112aF) c19781012aOLJIJJ.LLILLJJLI, strLIZ);
                    c19783812aq.LJIIJ();
                    C19779712aB.LJJIFFI((C19779712aB) c19783812aq.LLILLJJLI, i, (C19780112aF) c19781012aOLJIJJ.LJI());
                }
                if (((C19780112aF) c19781012aOLJIJJ.LLILLJJLI).LJJIII() && ((C19780112aF) c19781012aOLJIJJ.LLILLJJLI).zzg) {
                    c830490Whz.put(strLJIIL, Boolean.TRUE);
                }
                if (((C19780112aF) c19781012aOLJIJJ.LLILLJJLI).LJJIIJ() && ((C19780112aF) c19781012aOLJIJJ.LLILLJJLI).zzh) {
                    c830490Whz2.put(c19781012aOLJIJJ.LJIIL(), Boolean.TRUE);
                }
                if (((C19780112aF) c19781012aOLJIJJ.LLILLJJLI).LJJIIJZLJL()) {
                    if (((C19780112aF) c19781012aOLJIJJ.LLILLJJLI).LJJI() >= 2 && ((C19780112aF) c19781012aOLJIJJ.LLILLJJLI).LJJI() <= 65535) {
                        c830490Whz3.put(c19781012aOLJIJJ.LJIIL(), Integer.valueOf(((C19780112aF) c19781012aOLJIJJ.LLILLJJLI).LJJI()));
                    } else {
                        LJIILJJIL().LJIIIIZZ.LIZIZ(c19781012aOLJIJJ.LJIIL(), "Invalid sampling rate. Event name, sample rate", Integer.valueOf(((C19780112aF) c19781012aOLJIJJ.LLILLJJLI).LJJI()));
                    }
                }
            }
        }
        this.LJ.put(str, hashSet);
        this.LJFF.put(str, c830490Whz);
        this.LJI.put(str, c830490Whz2);
        this.LJIIIIZZ.put(str, c830490Whz3);
    }

    public final void LJIJJ(final String str, C19779712aB c19779712aB) {
        if (c19779712aB.zzn.size() == 0) {
            LJ(str);
            return;
        }
        LJIILJJIL().LJIILIIL.LIZ(Integer.valueOf(c19779712aB.zzn.size()), "EES programs found");
        C19792112cB c19792112cB = (C19792112cB) ListProtector.get(c19779712aB.zzn, 0);
        try {
            C19793312cN c19793312cN = new C19793312cN();
            ((HashMap) c19793312cN.LIZ.LIZLLL.LIZ).put("internal.remoteConfig", new Callable() { // from class: X.12b1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("zzgy@38f3.call");
                    final C19785712b9 c19785712b9 = new C19785712b9(this.LL, str);
                    AbstractC19795912cn abstractC19795912cn = new AbstractC19795912cn(c19785712b9) { // from class: X.12cU
                        {
                            super("internal.remoteConfig");
                            ((HashMap) this.LLILLJJLI).put("getValue", new AbstractC19795912cn() { // from class: X.12cV
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super("getValue");
                                }

                                @Override // X.AbstractC19795912cn
                                public final InterfaceC19797112cz LIZ(C19795712cl c19795712cl, List<InterfaceC19797112cz> list) {
                                    String str2;
                                    C19796312cr.LJ(2, "getValue", list);
                                    InterfaceC19797112cz interfaceC19797112czLIZIZ = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0));
                                    InterfaceC19797112cz interfaceC19797112czLIZIZ2 = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 1));
                                    String strLJFF = interfaceC19797112czLIZIZ.LJFF();
                                    C19785712b9 c19785712b92 = (C19785712b9) c19785712b9;
                                    Map map = (Map) c19785712b92.LIZIZ.LIZLLL.get(c19785712b92.LIZ);
                                    if (map != null && map.containsKey(strLJFF) && (str2 = (String) map.get(strLJFF)) != null) {
                                        return new C19797512d3(str2);
                                    }
                                    return interfaceC19797112czLIZIZ2;
                                }
                            });
                        }

                        @Override // X.AbstractC19795912cn
                        public final InterfaceC19797112cz LIZ(C19795712cl c19795712cl, List<InterfaceC19797112cz> list) {
                            return InterfaceC19797112cz.LJIILIIL;
                        }
                    };
                    C1C7U.LIZIZ("zzgy@38f3.call");
                    return abstractC19795912cn;
                }
            });
            ((HashMap) c19793312cN.LIZ.LIZLLL.LIZ).put("internal.appMetadata", new Callable() { // from class: X.12au
                /* JADX WARN: Type inference failed for: r0v0, types: [X.12ZK] */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("zzgx@38f2.call");
                    final C19779612aA c19779612aA = this.LL;
                    final String str2 = str;
                    final ?? r0 = new Callable() { // from class: X.12ZK
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            C1C7U.LIZ("zzgv@38f0.call");
                            C19779612aA c19779612aA2 = c19779612aA;
                            String str3 = str2;
                            C12Z5 c12z5LJJJLIIL = c19779612aA2.LJI().LJJJLIIL(str3);
                            HashMap map = new HashMap();
                            map.put("platform", "android");
                            map.put("package_name", str3);
                            map.put("gmp_version", 95001L);
                            if (c12z5LJJJLIIL != null) {
                                String strLJII = c12z5LJJJLIIL.LJII();
                                if (strLJII != null) {
                                    map.put("app_version", strLJII);
                                }
                                map.put("app_version_int", Long.valueOf(c12z5LJJJLIIL.LJIJJLI()));
                                c12z5LJJJLIIL.LIZ.LJIIL().LJ();
                                map.put("dynamite_version", Long.valueOf(c12z5LJJJLIIL.LJIJ));
                            }
                            C1C7U.LIZIZ("zzgv@38f0.call");
                            return map;
                        }
                    };
                    AbstractC19795912cn abstractC19795912cn = new AbstractC19795912cn(r0) { // from class: X.12cT
                        public final Callable<Object> LLILLL;

                        {
                            super("internal.appMetadata");
                            this.LLILLL = r0;
                        }

                        @Override // X.AbstractC19795912cn
                        public final InterfaceC19797112cz LIZ(C19795712cl c19795712cl, List<InterfaceC19797112cz> list) {
                            try {
                                return C19793712cR.LIZIZ(this.LLILLL.call());
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                return InterfaceC19797112cz.LJIILIIL;
                            }
                        }
                    };
                    C1C7U.LIZIZ("zzgx@38f2.call");
                    return abstractC19795912cn;
                }
            });
            ((HashMap) c19793312cN.LIZ.LIZLLL.LIZ).put("internal.logger", new Callable() { // from class: X.12av
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("zzha@38fa.call");
                    C19794712cb c19794712cb = new C19794712cb(this.LL.LJIIJ);
                    C1C7U.LIZIZ("zzha@38fa.call");
                    return c19794712cb;
                }
            });
            c19793312cN.LIZ(c19792112cB);
            LIZLLL(str, c19793312cN);
            LJIILJJIL().LJIILIIL.LIZIZ(str, "EES program loaded for appId, activities", Integer.valueOf(c19792112cB.LJJI().zze.size()));
            Iterator<C19792212cC> it2 = c19792112cB.LJJI().zze.iterator();
            while (it2.hasNext()) {
                LJIILJJIL().LJIILIIL.LIZ(it2.next().zzf, "EES program activity");
            }
        } catch (C19793612cQ e) {
            TryCatchGuardChecker.doCheck(e);
            LJIILJJIL().LJFF.LIZ(str, "Failed to load EES program. appId");
        }
    }

    public final int LJIL(String str, String str2) throws Throwable {
        Integer num;
        LJ();
        LJJIJIIJI(str);
        Map map = (Map) this.LJIIIIZZ.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final EnumC19776112Zb LJJI(String str, EnumC19776112Zb enumC19776112Zb) throws Throwable {
        LJ();
        LJJIJIIJI(str);
        C19779812aC c19779812aCLJJ = LJJ(str);
        if (c19779812aCLJJ == null) {
            return null;
        }
        for (C19789112bh c19789112bh : c19779812aCLJJ.zzg) {
            if (enumC19776112Zb == LJIILLIIL(c19789112bh.LJJII())) {
                return LJIILLIIL(c19789112bh.LJJIFFI());
            }
        }
        return null;
    }

    public final boolean LJJII(String str, String str2) throws Throwable {
        Boolean bool;
        LJ();
        LJJIJIIJI(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.LJI.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean LJJIII(String str, EnumC19776112Zb enumC19776112Zb) throws Throwable {
        LJ();
        LJJIJIIJI(str);
        C19779812aC c19779812aCLJJ = LJJ(str);
        if (c19779812aCLJJ == null) {
            return false;
        }
        Iterator<C19789212bi> it2 = c19779812aCLJJ.zzf.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C19789212bi next = it2.next();
            if (enumC19776112Zb == LJIILLIIL(next.LJJII())) {
                if (next.LJJIFFI() == EnumC19789412bk.GRANTED) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean LJJIIJ(String str, String str2) throws Throwable {
        Boolean bool;
        LJ();
        LJJIJIIJI(str);
        if ("1".equals(LJIJ(str, "measurement.upload.blacklist_internal")) && C19803112dx.LJJLIL(str2)) {
            return true;
        }
        if ("1".equals(LJIJ(str, "measurement.upload.blacklist_public")) && C19803112dx.LJJLJLI(str2)) {
            return true;
        }
        Map map = (Map) this.LJFF.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

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
    public final void LJIJJLI(String str, String str2, String str3, byte[] bArr) {
        Integer numValueOf;
        boolean z;
        byte[] bArrLJIIJ = bArr;
        LJIIIIZZ();
        LJ();
        C0W3J.LJI(str);
        C19783812aq c19783812aqLJIJJ = LJIILIIL(str, bArrLJIIJ).LJIJJ();
        LJIJI(str, c19783812aqLJIJJ);
        LJIJJ(str, (C19779712aB) c19783812aqLJIJJ.LJI());
        this.LJII.put(str, c19783812aqLJIJJ.LJI());
        this.LJIIJJI.put(str, ((C19779712aB) c19783812aqLJIJJ.LLILLJJLI).zzp);
        this.LJIIL.put(str, str2);
        this.LJIILIIL.put(str, str3);
        this.LIZLLL.put(str, LJIILL((C19779712aB) c19783812aqLJIJJ.LJI()));
        C12Z6 c12z6LJI = LJI();
        ArrayList<C19779912aD> arrayList = new ArrayList(Collections.unmodifiableList(((C19779712aB) c19783812aqLJIJJ.LLILLJJLI).zzk));
        for (int i = 0; i < arrayList.size(); i++) {
            AbstractC19899712tX abstractC19899712tXLJIJJ = ((AbstractC19899612tW) ListProtector.get(arrayList, i)).LJIJJ();
            if (((C19779912aD) abstractC19899712tXLJIJJ.LLILLJJLI).zzh.size() != 0) {
                for (int i2 = 0; i2 < ((C19779912aD) abstractC19899712tXLJIJJ.LLILLJJLI).zzh.size(); i2++) {
                    C19782812ag c19782812agLJIJJ = ((C19779912aD) abstractC19899712tXLJIJJ.LLILLJJLI).zzh.get(i2).LJIJJ();
                    AbstractC19899712tX abstractC19899712tX = (AbstractC19899712tX) c19782812agLJIJJ.clone();
                    String strLIZ = C19785212b4.LIZ(((C19778012Zu) c19782812agLJIJJ.LLILLJJLI).zzg, C19781212aQ.LIZ, C19781212aQ.LIZJ);
                    if (strLIZ != null) {
                        abstractC19899712tX.LJIIJ();
                        C19778012Zu.LJJI((C19778012Zu) abstractC19899712tX.LLILLJJLI, strLIZ);
                        z = true;
                    } else {
                        z = false;
                    }
                    for (int i3 = 0; i3 < ((C19778012Zu) c19782812agLJIJJ.LLILLJJLI).zzh.size(); i3++) {
                        C19778612a0 c19778612a0 = ((C19778012Zu) c19782812agLJIJJ.LLILLJJLI).zzh.get(i3);
                        String strLIZ2 = C19785212b4.LIZ(c19778612a0.zzi, C19786812bK.LIZ, C19786812bK.LIZIZ);
                        if (strLIZ2 != null) {
                            C19782912ah c19782912ahLJIJJ = c19778612a0.LJIJJ();
                            c19782912ahLJIJJ.LJIIJ();
                            C19778612a0.LJJI((C19778612a0) c19782912ahLJIJJ.LLILLJJLI, strLIZ2);
                            AbstractC19899612tW abstractC19899612tWLJI = c19782912ahLJIJJ.LJI();
                            abstractC19899712tX.LJIIJ();
                            C19778012Zu c19778012Zu = (C19778012Zu) abstractC19899712tX.LLILLJJLI;
                            int i4 = C19778012Zu.LL;
                            c19778012Zu.getClass();
                            InterfaceC19875012pY<C19778612a0> interfaceC19875012pY = c19778012Zu.zzh;
                            if (!interfaceC19875012pY.LIZIZ()) {
                                c19778012Zu.zzh = AbstractC19899612tW.LJIILIIL(interfaceC19875012pY);
                            }
                            c19778012Zu.zzh.set(i3, abstractC19899612tWLJI);
                            z = true;
                        }
                    }
                    if (z) {
                        abstractC19899712tXLJIJJ.LJIIJ();
                        C19779912aD c19779912aD = (C19779912aD) abstractC19899712tXLJIJJ.LLILLJJLI;
                        AbstractC19899612tW abstractC19899612tWLJI2 = abstractC19899712tX.LJI();
                        int i5 = C19779912aD.LL;
                        c19779912aD.getClass();
                        InterfaceC19875012pY<C19778012Zu> interfaceC19875012pY2 = c19779912aD.zzh;
                        if (!interfaceC19875012pY2.LIZIZ()) {
                            c19779912aD.zzh = AbstractC19899612tW.LJIILIIL(interfaceC19875012pY2);
                        }
                        c19779912aD.zzh.set(i2, abstractC19899612tWLJI2);
                        ListProtector.set(arrayList, i, abstractC19899712tXLJIJJ.LJI());
                    }
                }
            }
            if (((C19779912aD) abstractC19899712tXLJIJJ.LLILLJJLI).zzg.size() != 0) {
                for (int i6 = 0; i6 < ((C19779912aD) abstractC19899712tXLJIJJ.LLILLJJLI).zzg.size(); i6++) {
                    C19778412Zy c19778412Zy = ((C19779912aD) abstractC19899712tXLJIJJ.LLILLJJLI).zzg.get(i6);
                    String strLIZ3 = C19785212b4.LIZ(c19778412Zy.zzg, C19776612Zg.LIZ, C19776612Zg.LIZIZ);
                    if (strLIZ3 != null) {
                        C19783212ak c19783212akLJIJJ = c19778412Zy.LJIJJ();
                        c19783212akLJIJJ.LJIIJ();
                        C19778412Zy.LJJIFFI((C19778412Zy) c19783212akLJIJJ.LLILLJJLI, strLIZ3);
                        abstractC19899712tXLJIJJ.LJIIJ();
                        C19779912aD c19779912aD2 = (C19779912aD) abstractC19899712tXLJIJJ.LLILLJJLI;
                        AbstractC19899612tW abstractC19899612tWLJI3 = c19783212akLJIJJ.LJI();
                        int i7 = C19779912aD.LL;
                        c19779912aD2.getClass();
                        InterfaceC19875012pY<C19778412Zy> interfaceC19875012pY3 = c19779912aD2.zzg;
                        if (!interfaceC19875012pY3.LIZIZ()) {
                            c19779912aD2.zzg = AbstractC19899612tW.LJIILIIL(interfaceC19875012pY3);
                        }
                        c19779912aD2.zzg.set(i6, abstractC19899612tWLJI3);
                        ListProtector.set(arrayList, i, abstractC19899712tXLJIJJ.LJI());
                    }
                }
            }
        }
        c12z6LJI.LJIIIIZZ();
        c12z6LJI.LJ();
        C0W3J.LJI(str);
        SQLiteDatabase sQLiteDatabaseLJIILIIL = c12z6LJI.LJIILIIL();
        sQLiteDatabaseLJIILIIL.beginTransaction();
        try {
            c12z6LJI.LJIIIIZZ();
            c12z6LJI.LJ();
            C0W3J.LJI(str);
            SQLiteDatabase sQLiteDatabaseLJIILIIL2 = c12z6LJI.LJIILIIL();
            sQLiteDatabaseLJIILIIL2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseLJIILIIL2.delete("event_filters", "app_id=?", new String[]{str});
            for (C19779912aD c19779912aD3 : arrayList) {
                c12z6LJI.LJIIIIZZ();
                c12z6LJI.LJ();
                C0W3J.LJI(str);
                C0W3J.LJIIIIZZ(c19779912aD3);
                if (!c19779912aD3.LJJII()) {
                    c12z6LJI.LJIILJJIL().LJIIIIZZ.LIZ(C19806212eS.LJIIJ(str), "Audience with no ID. appId");
                } else {
                    int iLJJI = c19779912aD3.LJJI();
                    Iterator<C19778012Zu> it2 = c19779912aD3.zzh.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!it2.next().LJJIIJZLJL()) {
                                c12z6LJI.LJIILJJIL().LJIIIIZZ.LIZIZ(C19806212eS.LJIIJ(str), "Event filter with no ID. Audience definition ignored. appId, audienceId", Integer.valueOf(iLJJI));
                                break;
                            }
                        } else {
                            Iterator<C19778412Zy> it3 = c19779912aD3.zzg.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (!it3.next().LJJIIJZLJL()) {
                                        c12z6LJI.LJIILJJIL().LJIIIIZZ.LIZIZ(C19806212eS.LJIIJ(str), "Property filter with no ID. Audience definition ignored. appId, audienceId", Integer.valueOf(iLJJI));
                                        break;
                                    }
                                } else {
                                    Iterator<C19778012Zu> it4 = c19779912aD3.zzh.iterator();
                                    while (true) {
                                        if (it4.hasNext()) {
                                            if (!c12z6LJI.LJJIZ(str, iLJJI, it4.next())) {
                                                break;
                                            }
                                        } else {
                                            Iterator<C19778412Zy> it5 = c19779912aD3.zzg.iterator();
                                            while (it5.hasNext()) {
                                                if (!c12z6LJI.LJJJ(str, iLJJI, it5.next())) {
                                                }
                                            }
                                        }
                                    }
                                    c12z6LJI.LJIIIIZZ();
                                    c12z6LJI.LJ();
                                    C0W3J.LJI(str);
                                    SQLiteDatabase sQLiteDatabaseLJIILIIL3 = c12z6LJI.LJIILIIL();
                                    sQLiteDatabaseLJIILIIL3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iLJJI)});
                                    sQLiteDatabaseLJIILIIL3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iLJJI)});
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (C19779912aD c19779912aD4 : arrayList) {
                if (c19779912aD4.LJJII()) {
                    numValueOf = Integer.valueOf(c19779912aD4.LJJI());
                } else {
                    numValueOf = null;
                }
                arrayList2.add(numValueOf);
            }
            c12z6LJI.LJJJJJ(str, arrayList2);
            sQLiteDatabaseLJIILIIL.setTransactionSuccessful();
            sQLiteDatabaseLJIILIIL.endTransaction();
            try {
                c19783812aqLJIJJ.LJIIJ();
                try {
                    C19779712aB c19779712aB = (C19779712aB) c19783812aqLJIJJ.LLILLJJLI;
                    int i8 = C19779712aB.LL;
                    c19779712aB.getClass();
                    c19779712aB.zzk = C19886312rN.LLILZ;
                    bArrLJIIJ = ((C19779712aB) c19783812aqLJIJJ.LJI()).LJIIJ();
                } catch (RuntimeException e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    LJIILJJIL().LJIIIIZZ.LIZIZ(C19806212eS.LJIIJ(str), "Unable to serialize reduced-size config. Storing full config instead. appId", e);
                }
            } catch (RuntimeException e2) {
                e = e2;
            }
            C12Z6 c12z6LJI2 = LJI();
            C0W3J.LJI(str);
            c12z6LJI2.LJ();
            c12z6LJI2.LJIIIIZZ();
            ContentValues contentValues = new ContentValues();
            contentValues.put("remote_config", bArrLJIIJ);
            contentValues.put("config_last_modified_time", str2);
            contentValues.put("e_tag", str3);
            try {
                if (c12z6LJI2.LJIILIIL().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                    c12z6LJI2.LJIILJJIL().LJFF.LIZ(C19806212eS.LJIIJ(str), "Failed to update remote config (got 0). appId");
                }
            } catch (SQLiteException e3) {
                TryCatchGuardChecker.doCheck(e3);
                c12z6LJI2.LJIILJJIL().LJFF.LIZIZ(C19806212eS.LJIIJ(str), "Error storing remote config. appId", e3);
            }
            this.LJII.put(str, c19783812aqLJIJJ.LJI());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            sQLiteDatabaseLJIILIIL.endTransaction();
            throw th;
        }
    }
}
