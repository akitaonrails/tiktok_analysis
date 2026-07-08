package X;

import android.database.sqlite.SQLiteDatabase;
import com.bytedance.applog.engine.Session;
import com.bytedance.applog.store.DbStore;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BeN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2209891BeN extends AbstractC2209821BeG {
    public static final List<String> LJIIJJI = Collections.singletonList("Sender");
    public final long[] LJFF;
    public final ConcurrentHashMap<String, C2210091Beh> LJI;
    public final C2209631Bdx LJII;
    public final String LJIIIIZZ;
    public long LJIIIZ;
    public int LJIIJ;

    @Override // X.AbstractC2209821BeG
    public final boolean LJFF() {
        return !this.LIZJ;
    }

    @Override // X.AbstractC2209821BeG
    public final long LJI() {
        if (this.LJII == null) {
            return this.LIZ.LLILZ.LIZIZ();
        }
        C2209621Bdw c2209621Bdw = this.LIZ.LLILZ.LJIIJJI;
        if (c2209621Bdw != null && c2209621Bdw.LJII) {
            long jLIZIZ = this.LIZ.LLILZ.LIZIZ();
            if (jLIZIZ <= this.LJII.LIZLLL) {
                return jLIZIZ;
            }
        }
        return this.LJII.LIZLLL;
    }

    @Override // X.AbstractC2209821BeG
    public final String LIZLLL() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC2209821BeG
    public final long[] LJ() {
        return this.LJFF;
    }

    public C2209891BeN(C2209911BeP c2209911BeP) {
        super(c2209911BeP);
        this.LJFF = new long[]{10000};
        this.LJI = new ConcurrentHashMap<>();
        this.LJIIIZ = 0L;
        this.LJIIJ = 0;
        this.LJII = null;
        this.LJIIIIZZ = "Sender";
    }

    @Override // X.AbstractC2209821BeG
    public final synchronized boolean LIZJ(int i) {
        String str;
        boolean zLJI = MethodIDManager.LJI(137852);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C2209911BeP c2209911BeP = this.LIZ;
        Session session = c2209911BeP.LLJIJIL;
        C2209791BeD c2209791BeD = c2209911BeP.LLILLL.LJJZZI;
        List<String> list = LJIIJJI;
        Object[] objArr = new Object[4];
        boolean z = false;
        z = false;
        objArr[0] = this.LJIIIIZZ;
        objArr[1] = Long.valueOf(jCurrentTimeMillis);
        if (session == null) {
            str = "null";
        } else {
            str = session.LJIIIIZZ;
        }
        objArr[2] = str;
        objArr[3] = Integer.valueOf(i);
        c2209791BeD.LJIIIZ(0, list, "{} start doWork curTs={}, curSid={}, requestFrom={}", objArr);
        if (this.LIZ.LLILLL.LJJIFFI && !this.LIZ.LLILLL.LJJII) {
            C2210331Bf5 c2210331Bf5 = C2210331Bf5.LJ;
            EnumC2210541BfQ enumC2210541BfQ = EnumC2210541BfQ.DataUpload;
            if (c2210331Bf5.LIZ) {
                c2210331Bf5.LIZJ(enumC2210541BfQ, EnumC2210371Bf9.InterruptionTouristMode, EnumC2210591BfV.Notice, "report interrupted due to tourist mode.", null);
            }
            this.LIZ.LLILLL.LJJZZI.LJ(0, list, "{} not send events in tourist mode", this.LJIIIIZZ);
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return true;
        }
        C2210271Bez c2210271Bez = this.LIZ.LLJJJJLIIL;
        if (c2210271Bez.LIZJ) {
            if (c2210271Bez.LJI && System.currentTimeMillis() - c2210271Bez.LJII > 10000) {
                c2210271Bez.LJI = false;
            }
            if (c2210271Bez.LJI) {
                this.LIZ.LLILLL.LJJJJLI.LIZIZ(EnumC2210021Bea.COLD_START_BLOCK_REQUEST_COUNT, 1);
                this.LIZ.LLILLL.LJJZZI.LJIIIZ(0, list, "{} shouldBlockReporting, will not do send.", this.LJIIIIZZ);
                if (zLJI) {
                    MethodIDManager.LJ();
                }
                return false;
            }
        }
        if (session != null) {
            session.LJ();
        }
        DbStore dbStoreLJFF = this.LIZ.LJFF();
        C2209771BeB c2209771BeB = this.LIZ.LLIZLLLIL;
        if (c2209771BeB.LIZJ) {
            JSONObject jSONObjectLIZ = c2209771BeB.LIZ();
            InterfaceC2209861BeK interfaceC2209861BeK = this.LIZ.LLILLL.LJIILLIIL;
            if (interfaceC2209861BeK != null) {
                try {
                    C2210791Bfp.LIZ(jSONObjectLIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LIZ.LLILLL.LJJJJLI.LIZIZ(EnumC2210021Bea.PACK_ERROR_COUNT, 1);
                    this.LIZ.LLILLL.LJJZZI.LJIIZILJ(LJIIJJI, "header custom callback updateHeader error", th, new Object[0]);
                    this.LIZ.LLILLL.LJJJJLI.LJI("Sender IHeaderCustomTimelyCallback updateHeader failed", th, true);
                }
            }
            C2209631Bdx c2209631Bdx = this.LJII;
            if (c2209631Bdx != null && c2209631Bdx.LIZ != -1) {
                dbStoreLJFF.LJIILL(jSONObjectLIZ, c2209631Bdx, i);
            } else if (C2210531BfP.LJIIJ && (!C2210531BfP.LJIIJJI || this.LJIIJ > 0)) {
                dbStoreLJFF.LJIIZILJ(jSONObjectLIZ, this.LJII, i, this.LIZ.LLILLL.LJJJJ, new C2210251Bex(this, i, jCurrentTimeMillis));
            } else {
                dbStoreLJFF.LJIILJJIL(jSONObjectLIZ, this.LJII, i, this.LIZ.LLILLL.LJJJJ);
            }
            if (this.LJIIIZ > 0 && System.currentTimeMillis() - jCurrentTimeMillis >= this.LJIIIZ) {
                this.LIZ.LLILLL.LJJZZI.LJIIIZ(0, LJIIJJI, "{} work is timeout, will not do send.", this.LJIIIIZZ);
            } else if (!C2210531BfP.LJ) {
                LJIIJJI(i, jCurrentTimeMillis);
            } else {
                for (int i2 = 0; i2 < 10 && LJIIJJI(i, jCurrentTimeMillis); i2++) {
                }
            }
            z = true;
        } else {
            this.LIZ.LLILLL.LJJJJLI.LJI("Sender failed due to invalid did", null, true);
            C2210331Bf5 c2210331Bf52 = C2210331Bf5.LJ;
            EnumC2210541BfQ enumC2210541BfQ2 = EnumC2210541BfQ.DataUpload;
            if (c2210331Bf52.LIZ) {
                c2210331Bf52.LIZJ(enumC2210541BfQ2, EnumC2210371Bf9.InterruptionInvalidDid, EnumC2210591BfV.Notice, "report interrupted due to invalid did.", null);
            }
        }
        C2210271Bez c2210271Bez2 = this.LIZ.LLJJJJLIIL;
        c2210271Bez2.LIZIZ = 0L;
        c2210271Bez2.LIZ = 0L;
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return z;
    }

    public final C2210091Beh LJII(String str) {
        if (!C2200271B9l.LJI(str)) {
            try {
                str = UriProtector.parse(str).getHost();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (!this.LJI.containsKey(str)) {
            ConcurrentHashMap<String, C2210091Beh> concurrentHashMap = this.LJI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LJIIIIZZ);
            sbLIZ.append(":");
            sbLIZ.append(str);
            concurrentHashMap.put(str, new C2210091Beh(C2188811AlT.LIZIZ(sbLIZ), this.LIZ.LLILZ, this.LJII));
        }
        C2210091Beh c2210091Beh = this.LJI.get(str);
        this.LIZ.LLILLL.LJJZZI.LJFF(0, LJIIJJI, "{} congestion for host:{} is {}", this.LJIIIIZZ, str, c2210091Beh);
        return c2210091Beh;
    }

    public C2209891BeN(C2209911BeP c2209911BeP, C2209631Bdx c2209631Bdx) {
        super(c2209911BeP);
        long[] jArr = {10000};
        this.LJFF = jArr;
        this.LJI = new ConcurrentHashMap<>();
        this.LJIIIZ = 0L;
        this.LJIIJ = 0;
        this.LJII = c2209631Bdx;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Sender_p_");
        sbLIZ.append(c2209631Bdx.LIZ);
        this.LJIIIIZZ = C2188811AlT.LIZIZ(sbLIZ);
        long j = c2209631Bdx.LIZLLL;
        if (j < 10000) {
            jArr[0] = j;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0169  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIJJI(int r15, long r16) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2209891BeN.LJIIJJI(int, long):boolean");
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
    public final void LJIIL(C2209881BeM c2209881BeM, boolean z) {
        InterfaceC2211181BgS interfaceC2211181BgSLIZIZ;
        byte[] bArr;
        if (c2209881BeM.LL <= 0) {
            return;
        }
        DbStore dbStoreLJFF = this.LIZ.LJFF();
        ArrayList<C2209881BeM> arrayList = new ArrayList();
        ArrayList<C2209881BeM> arrayList2 = new ArrayList();
        if (z) {
            arrayList.add(c2209881BeM);
        } else {
            arrayList2.add(c2209881BeM);
        }
        dbStoreLJFF.LJII().LJIIIZ(5, null, "setResult: del -> {}, fail -> {}", arrayList, arrayList2);
        Iterator it2 = arrayList2.iterator();
        ArrayList arrayList3 = new ArrayList();
        C2209901BeO c2209901BeO = dbStoreLJFF.LIZ.LLILLL;
        if (c2209901BeO.LJJJJJL == null) {
            interfaceC2211181BgSLIZIZ = C2211101BgK.LIZ.LIZIZ(new Object[0]);
        } else {
            interfaceC2211181BgSLIZIZ = c2209901BeO.LJJJJJL;
        }
        while (it2.hasNext()) {
            C2209881BeM c2209881BeM2 = (C2209881BeM) it2.next();
            interfaceC2211181BgSLIZIZ.LIZIZ();
            if (Math.abs(System.currentTimeMillis() - c2209881BeM2.LLILLJJLI) >= 1209600000) {
                arrayList.add(c2209881BeM2);
                arrayList3.add(c2209881BeM2);
                it2.remove();
            } else {
                interfaceC2211181BgSLIZIZ.LIZ();
                if (C2210531BfP.LJIIL && ((bArr = c2209881BeM2.LLJJJJLIIL) == null || bArr.length <= 20)) {
                    arrayList.add(c2209881BeM2);
                    arrayList3.add(c2209881BeM2);
                    it2.remove();
                    dbStoreLJFF.LJII().LJIILJJIL(5, null, "delete empty pack, pack: {}", c2209881BeM2);
                }
            }
        }
        try {
            SQLiteDatabase writableDatabase = dbStoreLJFF.LIZIZ.getWritableDatabase();
            for (C2209881BeM c2209881BeM3 : arrayList) {
                int iDelete = writableDatabase.delete("pack", "_id = ?", new String[]{String.valueOf(c2209881BeM3.LL)});
                if (iDelete <= 0) {
                    dbStoreLJFF.LJII().LJIILJJIL(5, null, "delete from db failed, pack: {}, rows: {}", c2209881BeM3, Integer.valueOf(iDelete));
                    dbStoreLJFF.LIZ.LLILLL.LJJJJLI.LIZIZ(EnumC2210021Bea.DB_ERROR_COUNT, 1);
                    C2210581BfU c2210581BfU = dbStoreLJFF.LIZ.LLILLL.LJJJJL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("fail delete pack:");
                    sbLIZ.append(c2209881BeM3.LL);
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (!c2210581BfU.LIZ.isEmpty()) {
                        Iterator<InterfaceC2211191BgT> it3 = c2210581BfU.LIZ.iterator();
                        while (it3.hasNext()) {
                            it3.next().LIZIZ();
                        }
                    }
                    dbStoreLJFF.LIZ.LLILLL.LJJJJLI.LJI("delete pack failed for zero", null, true);
                }
            }
            for (C2209881BeM c2209881BeM4 : arrayList2) {
                long j = c2209881BeM4.LL;
                int i = c2209881BeM4.LLJJL + 1;
                c2209881BeM4.LLJJL = i;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("UPDATE pack SET _fail=");
                sbLIZ2.append(i);
                sbLIZ2.append(" WHERE ");
                sbLIZ2.append("_id");
                sbLIZ2.append("=");
                sbLIZ2.append(j);
                writableDatabase.execSQL(C2188811AlT.LIZIZ(sbLIZ2));
            }
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        dbStoreLJFF.LIZIZ.LIZ();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            ((C2209881BeM) it4.next()).LJJI();
        }
    }

    public static void LJIIIIZZ(C2209901BeO c2209901BeO, C2209881BeM c2209881BeM, boolean z) {
        EnumC2210021Bea enumC2210021Bea;
        EnumC2210021Bea enumC2210021Bea2;
        EnumC2210021Bea enumC2210021Bea3;
        EnumC21646419na enumC21646419na;
        if (c2209901BeO.LJJJJLI.LJFF()) {
            for (C21655119oz c21655119oz : (ArrayList) c2209881BeM.LJIL()) {
                C2209921BeQ c2209921BeQ = c2209901BeO.LJJJJLI;
                if (z) {
                    enumC21646419na = EnumC21646419na.REPORT_END;
                } else {
                    enumC21646419na = EnumC21646419na.POST_FAILED;
                }
                C2210101Bei.LIZJ(c2209921BeQ, enumC21646419na, c21655119oz);
            }
        }
        C2209921BeQ c2209921BeQ2 = c2209901BeO.LJJJJLI;
        int i = c2209881BeM.LLLILZ;
        if (i > 0) {
            if (z) {
                enumC2210021Bea3 = EnumC2210021Bea.REPORT_SUCCESS_LAUNCH_COUNT;
            } else {
                enumC2210021Bea3 = EnumC2210021Bea.REPORT_FAILED_LAUNCH_COUNT;
            }
            c2209921BeQ2.LIZIZ(enumC2210021Bea3, i);
        }
        int i2 = c2209881BeM.LLLILZJ;
        if (i2 > 0) {
            if (z) {
                enumC2210021Bea2 = EnumC2210021Bea.REPORT_SUCCESS_TERMINATE_COUNT;
            } else {
                enumC2210021Bea2 = EnumC2210021Bea.REPORT_FAILED_TERMINATE_COUNT;
            }
            c2209921BeQ2.LIZIZ(enumC2210021Bea2, i2);
        }
        int i3 = c2209881BeM.LLLILZLLLI + c2209881BeM.LLLIZZ + c2209881BeM.LLLJ;
        if (i3 > 0) {
            if (z) {
                enumC2210021Bea = EnumC2210021Bea.REPORT_SUCCESS_EVENT_COUNT;
            } else {
                enumC2210021Bea = EnumC2210021Bea.REPORT_FAILED_EVENT_COUNT;
            }
            c2209921BeQ2.LIZIZ(enumC2210021Bea, i3);
        }
        if (!C2210111Bej.LIZIZ()) {
            String str = c2209901BeO.LJIIIZ;
            Set<Long> setLJIJJLI = c2209881BeM.LJIJJLI();
            if (!((HashSet) setLJIJJLI).isEmpty() && !C2210111Bej.LIZIZ()) {
                C2210111Bej.LIZJ("event_upload_eid", new C1490560otK(str, setLJIJJLI, z));
            }
        }
    }

    public final C2210651Bfb LJIIJ(int i, long j, List<C2209881BeM> list) {
        Map<String, String> mapLIZLLL;
        C2209911BeP c2209911BeP = this.LIZ;
        C2209571Bdr c2209571Bdr = c2209911BeP.LLILZ;
        String[] strArrLIZIZ = c2209911BeP.LLILLL.LJ.LIZIZ(c2209911BeP, false, this.LJII);
        if (this.LIZ.LLILLL.LJJJLZIJ) {
            InterfaceC2211401Bgo interfaceC2211401Bgo = this.LIZ.LLILLL.LJJL;
            HashMap map = new HashMap();
            if (interfaceC2211401Bgo != null && (mapLIZLLL = ((C2210851Bfv) interfaceC2211401Bgo).LIZ.LIZLLL()) != null) {
                map.putAll(mapLIZLLL);
            }
            return LJIIIZ(c2209571Bdr, strArrLIZIZ, list, i, map, j);
        }
        return LJIIIZ(c2209571Bdr, strArrLIZIZ, list, i, null, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03de A[PHI: r0
      0x03de: PHI (r0v92 int) = (r0v90 int), (r0v95 int) binds: [B:125:0x038f, B:128:0x03dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v15 */
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
    public final X.C2210651Bfb LJIIIZ(X.C2209571Bdr r37, java.lang.String[] r38, java.util.List<X.C2209881BeM> r39, int r40, java.util.Map<java.lang.String, java.lang.String> r41, long r42) {
        /*
            Method dump skipped, instruction units count: 1360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2209891BeN.LJIIIZ(X.1Bdr, java.lang.String[], java.util.List, int, java.util.Map, long):X.1Bfb");
    }
}
