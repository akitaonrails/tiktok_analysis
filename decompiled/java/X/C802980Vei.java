package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vei, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C802980Vei {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;

    public static void LIZIZ() {
        try {
            C803150Vez c803150Vez = C803150Vez.LJII;
            C08SE.LIZIZ(c803150Vez.LIZJ);
            C08SE.LIZIZ(c803150Vez.LIZ);
            C08SE.LIZIZ(c803150Vez.LIZLLL);
            C08SE.LIZIZ(c803150Vez.LIZIZ);
            C08SE.LIZIZ(c803150Vez.LJ);
            C08SE.LIZIZ(c803150Vez.LJFF);
            C08SE.LIZIZ(c803150Vez.LJI);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static final void LIZJ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        boolean z = true;
        if (jSONObject.optInt("allow_loop_monitor") != 1) {
            z = false;
        }
        C803010Vel c803010Vel = new C803010Vel(jSONObject.optInt("track_water_line"), jSONObject.optInt("track_dump_line"), jSONObject.optInt("backtrace_limit"), jSONObject.optInt("track_sleep_time"), z);
        if (C803090Vet.LJIIJ == null) {
            synchronized (C803090Vet.class) {
                try {
                    if (C803090Vet.LJIIJ == null) {
                        C803090Vet.LJIIJ = new C803090Vet();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C803090Vet c803090Vet = C803090Vet.LJIIJ;
        c803090Vet.LJIIIZ = c803010Vel;
        c803090Vet.LIZLLL(c803010Vel);
    }

    public static final void LIZLLL(JSONObject jSONObject) {
        C803000Vek c803000Vek = new C803000Vek(jSONObject.optJSONArray("native_heap_params"));
        if (C803070Ver.LJIIL == null) {
            synchronized (C803070Ver.class) {
                try {
                    if (C803070Ver.LJIIL == null) {
                        C803070Ver.LJIIL = new C803070Ver();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C803070Ver c803070Ver = C803070Ver.LJIIL;
        c803070Ver.LJIIJJI = c803000Vek;
        c803070Ver.LIZLLL(c803000Vek);
    }

    public static final void LJ(JSONObject jSONObject) {
        final int iOptInt = jSONObject.optInt("ref_monitor_type");
        final int iOptInt2 = jSONObject.optInt("ref_monitor_bt_flag");
        final JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ref_monitor_limits");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() < 3) {
            jSONArrayOptJSONArray = new JSONArray();
            jSONArrayOptJSONArray.put(20000);
            jSONArrayOptJSONArray.put(20000);
            jSONArrayOptJSONArray.put(500);
        }
        C802970Veh c802970Veh = new C802970Veh(iOptInt, jSONArrayOptJSONArray, iOptInt2) { // from class: X.0Vej
            public final int LJII;
            public final int LJIIIIZZ;
            public final int LJIIIZ;
            public final int LJIIJ;
            public final int LJIIJJI;
            public final int LJIIL;

            @Override // X.C802970Veh
            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("monitorType=");
                sbLIZ.append(this.LJII);
                sbLIZ.append("\nlimitGlobal=");
                sbLIZ.append(this.LJIIJ);
                sbLIZ.append("\nlimitWeak=");
                sbLIZ.append(this.LJIIJJI);
                sbLIZ.append("\nlimitLocal=");
                sbLIZ.append(this.LJIIL);
                sbLIZ.append("\nbtFlag=");
                sbLIZ.append(this.LJIIIIZZ);
                sbLIZ.append("\ndebugType=");
                sbLIZ.append(this.LJIIIZ);
                sbLIZ.append("\n");
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                super(23, 33, 5);
                this.LJIIJ = 50000;
                this.LJIIJJI = 50000;
                this.LJIIL = 500;
                if (C802300Vdc.LIZIZ()) {
                    this.LJII = 7;
                    this.LJIIIIZZ = 3;
                    this.LJIIJ = LSPassThroughRecordSizeConfig.DEFAULT;
                    this.LJIIJJI = LSPassThroughRecordSizeConfig.DEFAULT;
                    this.LJIIL = 350;
                    this.LJIIIZ = 4;
                    return;
                }
                this.LJII = iOptInt;
                this.LJIIIIZZ = iOptInt2;
                int length = jSONArrayOptJSONArray.length();
                if (length >= 2) {
                    this.LJIIJ = jSONArrayOptJSONArray.optInt(0);
                    this.LJIIJJI = jSONArrayOptJSONArray.optInt(1);
                    if (length == 3) {
                        this.LJIIL = jSONArrayOptJSONArray.optInt(2);
                    }
                }
                this.LJIIJ = Math.max(LSPassThroughRecordSizeConfig.DEFAULT, this.LJIIJ);
                this.LJIIJJI = Math.max(LSPassThroughRecordSizeConfig.DEFAULT, this.LJIIJJI);
                this.LJIIL = Math.max(500, this.LJIIL);
            }
        };
        if (C803350VfJ.LJII == null) {
            synchronized (C803350VfJ.class) {
                try {
                    if (C803350VfJ.LJII == null) {
                        C803350VfJ.LJII = new C803350VfJ();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C803350VfJ c803350VfJ = C803350VfJ.LJII;
        c803350VfJ.getClass();
        c803350VfJ.LIZLLL(c802970Veh);
    }

    public static void LIZ(JSONObject jSONObject, File file) {
        C0VSJ c0vsj = new C0VSJ(file, "ht_leak_tags.txt");
        if (c0vsj.exists()) {
            try {
                C802910Veb c802910Veb = new C802910Veb("MB");
                c802910Veb.LIZJ(new Long[]{0L, 1L, 128L, 256L, 384L, 512L, 768L, 1024L});
                for (String str : C08SE.LIZLLL(c0vsj.getAbsolutePath()).split("\n")) {
                    if (str != null && !str.trim().isEmpty()) {
                        String[] strArrSplit = str.split(":");
                        if (strArrSplit.length == 2) {
                            String strTrim = strArrSplit[1].trim();
                            try {
                                strTrim = c802910Veb.LIZ(CastLongProtector.parseLong(strTrim));
                            } catch (NumberFormatException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            jSONObject.put(strArrSplit[0].trim(), strTrim);
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(org.json.JSONObject r12, org.json.JSONObject r13) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C802980Vei.LJI(org.json.JSONObject, org.json.JSONObject):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJFF(JSONObject jSONObject, boolean z, boolean z2) {
        boolean z3 = z;
        int i = z3;
        if (z2) {
            i = (z3 ? 1 : 0) | 2;
        }
        C803020Vem c803020Vem = new C803020Vem(i, jSONObject.optJSONArray("mmap_water_config"), jSONObject.optJSONArray("mmap_monitor_params"), jSONObject.optJSONArray("mprotect_monitor_prots"), jSONObject.optJSONArray("mmap_phy_config"));
        if (C803060Veq.LJIIL == null) {
            synchronized (C803060Veq.class) {
                try {
                    if (C803060Veq.LJIIL == null) {
                        C803060Veq.LJIIL = new C803060Veq();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C803060Veq c803060Veq = C803060Veq.LJIIL;
        c803060Veq.LJII = c803020Vem;
        c803060Veq.LIZLLL(c803020Vem);
    }
}
