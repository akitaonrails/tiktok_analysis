package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.solution.gear_center.LyraxGearCenterConfig;
import com.ss.solution.gear_center.LyraxGearScheduleData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1D4s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2250001D4s implements C1D4C, C1D5U {
    public C1D51 LIZ;
    public C1D41 LIZLLL;
    public C2249971D4p LJ;
    public EnumC1283150jUn LJFF = EnumC1283150jUn.DEFAULT;
    public final C2250011D4t LIZIZ = new C2250011D4t();
    public final C2250041D4w LIZJ = new C2250041D4w();

    @Override // X.C1D4C
    public final void LIZLLL(LyraxGearCenterConfig lyraxGearCenterConfig) {
    }

    @Override // X.C1D4C
    public final void LJIIJ(LyraxGearScheduleData lyraxGearScheduleData) {
    }

    @Override // X.C1D4C
    public final InterfaceC783690Uoh LIZ() {
        C2250011D4t c2250011D4t = this.LIZIZ;
        if (c2250011D4t != null) {
            return c2250011D4t.LJIJJ;
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a6  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    @Override // X.C1D4C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject LJIIJJI() {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2250001D4s.LJIIJJI():org.json.JSONObject");
    }

    @Override // X.C1D4C
    public final List<C1283050jUd> LJIIZILJ() {
        C2249971D4p c2249971D4p = this.LJ;
        if (c2249971D4p != null) {
            return c2249971D4p.LIZLLL();
        }
        return null;
    }

    @Override // X.C1D4C
    public final void LIZIZ(C1282710jU5 c1282710jU5) {
        C1282930jUR.LIZ.LIZ = c1282710jU5;
    }

    @Override // X.C1D4C
    public final void LIZJ(EnumC2239251Ckd enumC2239251Ckd) {
        C2250011D4t c2250011D4t = this.LIZIZ;
        if (c2250011D4t != null) {
            int i = C2239261Cke.LIZ[enumC2239251Ckd.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    c2250011D4t.LJJIII++;
                    return;
                }
                return;
            }
            C1D48 c1d48 = c2250011D4t.LJIJJLI;
            c1d48.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error_code", 2);
                jSONObject.put("call_livecore_speedtest_timestamp", "-999");
                C1D41 c1d41 = c1d48.LIZ;
                if (c1d41 != null) {
                    c1d41.onEvent("livesdk_golive_speedtest", jSONObject);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            c2250011D4t.LJIILL(EnumC773550UWb.BAD_CONNECTION, c2250011D4t.LJJIJIIJI);
            c2250011D4t.LJIIZILJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x01f2 A[PHI: r4
      0x01f2: PHI (r4v2 java.util.ArrayList) = (r4v1 java.util.ArrayList), (r4v6 java.util.ArrayList) binds: [B:94:0x01f1, B:90:0x01d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f6  */
    @Override // X.C1D4C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1D47 LJ(X.C776580UdE r15) {
        /*
            Method dump skipped, instruction units count: 965
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2250001D4s.LJ(X.0UdE):X.1D47");
    }

    @Override // X.C1D4C
    public final void LJFF(C1267200j54 c1267200j54) {
        C2250011D4t c2250011D4t = this.LIZIZ;
        c2250011D4t.LIZLLL();
        if (c2250011D4t.LJIIIZ != null) {
            C1267200j54 c1267200j542 = new C1267200j54();
            Map<String, ? extends Object> map = c1267200j54.LIZ;
            Map<String, ? extends Object> map2 = c1267200j54.LIZIZ;
            if (map != null) {
                c1267200j542.LIZ = map;
            }
            if (map2 != null) {
                c1267200j542.LIZIZ = map2;
            }
            C1267080j4s c1267080j4s = c2250011D4t.LJIIIZ.LIZIZ;
            c1267080j4s.LIZ(c1267080j4s.LJIILIIL, c1267200j542);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x024f  */
    @Override // X.C1D4C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(X.C1D51 r13) {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2250001D4s.LJI(X.1D51):void");
    }

    @Override // X.C1D4C
    public final void LJII(C1D45 c1d45) {
        C2250051D4x c2250051D4x;
        C2250011D4t c2250011D4t = this.LIZIZ;
        if (c2250011D4t != null) {
            if (c1d45.LIZ) {
                c2250011D4t.LJIJJ(c1d45);
            }
            if (c2250011D4t.LJIL && (c2250051D4x = c2250011D4t.LJIJJ) != null) {
                c2250051D4x.LJIIIZ = 3;
                c2250051D4x.LIZJ.put(EnumC2250061D4y.SPEED_TEST_END_STATUS, String.valueOf(3));
            }
            if (c1d45.LIZIZ == EnumC783720Uok.MANUAL && c2250011D4t.LJIL) {
                c2250011D4t.LJJIJLIJ = true;
            }
            c2250011D4t.LJJIII = 0;
            c2250011D4t.LJIIZILJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c6  */
    /* JADX WARN: Type inference failed for: r6v7, types: [X.1D5H] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.1D5J] */
    @Override // X.C1D4C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(X.C783730Uol r14) {
        /*
            Method dump skipped, instruction units count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2250001D4s.LJIIIIZZ(X.0Uol):void");
    }

    @Override // X.C1D4C
    public final void LJIIIZ(C1D41 c1d41) {
        this.LIZLLL = c1d41;
        C2250011D4t c2250011D4t = this.LIZIZ;
        if (c2250011D4t != null) {
            c2250011D4t.LIZ = c1d41;
            c2250011D4t.LJIJJ.LJIIIIZZ = c1d41;
            c2250011D4t.LJIJJLI.LIZ = c1d41;
        }
    }

    @Override // X.C1D4C
    public final void LJIIL(C1101240elO c1101240elO) {
        C2250011D4t c2250011D4t = this.LIZIZ;
        if (c2250011D4t != null) {
            c2250011D4t.LIZLLL();
            if (c2250011D4t.LJIIIZ != null) {
                C1266550j41 c1266550j41 = new C1266550j41();
                c1266550j41.LIZ = c1101240elO.LJ;
                c1266550j41.LIZIZ = c1101240elO.LJFF;
                C1267080j4s c1267080j4s = c2250011D4t.LJIIIZ.LIZIZ;
                c1267080j4s.LIZ(c1267080j4s.LIZIZ, c1266550j41);
                C1266450j3r c1266450j3r = new C1266450j3r();
                c1266450j3r.LJFF = c1101240elO.LIZ;
                c1266450j3r.LJI = c1101240elO.LIZIZ;
                c1266450j3r.LJII = c1101240elO.LIZJ;
                c1266450j3r.LJ = c1101240elO.LIZLLL;
                c2250011D4t.LJIIIZ.LIZIZ.LIZIZ(c1266450j3r);
            }
        }
    }

    @Override // X.C1D4C
    public final void LJIILJJIL(C1282670jU1 c1282670jU1) {
        C1283030jUb.LIZ.LIZ = c1282670jU1;
    }

    @Override // X.C1D4C
    public final void LJIILL(C1D45 c1d45) {
        C2250011D4t c2250011D4t = this.LIZIZ;
        if (c2250011D4t != null) {
            c2250011D4t.LJIJJ(c1d45);
            c2250011D4t.LJIJ("destroy");
        }
    }

    @Override // X.C1D4C
    public final void LJIILLIIL(C2249981D4q c2249981D4q) {
        C2250041D4w c2250041D4w = this.LIZJ;
        c2250041D4w.LIZIZ = c2249981D4q;
        c2250041D4w.LJIILIIL = c2249981D4q.LJ;
        ((HashMap) c2250041D4w.LIZ).clear();
        c2250041D4w.LIZ("default");
    }

    @Override // X.C1D4C
    public final void LJIJ(int i) {
        C2250071D4z c2250071D4z;
        C2250011D4t c2250011D4t = this.LIZIZ;
        if (c2250011D4t != null && (c2250071D4z = c2250011D4t.LIZJ) != null) {
            c2250071D4z.LJI = i;
        }
    }

    @Override // X.C1D4C
    public final C1D47 LJIJI(C776580UdE c776580UdE) {
        C2250011D4t c2250011D4t = this.LIZIZ;
        if (c2250011D4t == null) {
            C2250041D4w c2250041D4w = this.LIZJ;
            c2250041D4w.getClass();
            return c2250041D4w.LIZIZ(EnumC2249761D3u.SCENE_RECOMMEND);
        }
        C1D49 c1d49LJIIIZ = c2250011D4t.LJIIIZ(c776580UdE);
        if (c1d49LJIIIZ != null) {
            this.LIZJ.LIZJ(c1d49LJIIIZ);
        }
        C2250041D4w c2250041D4w2 = this.LIZJ;
        c2250041D4w2.getClass();
        return c2250041D4w2.LIZIZ(EnumC2249761D3u.SCENE_RECOMMEND);
    }

    public final void LJIJJ(C1D49 c1d49) {
        C2250041D4w c2250041D4w = this.LIZJ;
        if (c2250041D4w != null) {
            c2250041D4w.LIZJ(c1d49);
            if (this.LJFF == EnumC1283150jUn.STAGE) {
                C2250041D4w c2250041D4w2 = this.LIZJ;
                c2250041D4w2.getClass();
                C1D47 c1d47LIZIZ = c2250041D4w2.LIZIZ(EnumC2249761D3u.SCENE_RECOMMEND);
                C1D41 c1d41 = this.LIZLLL;
                if (c1d41 != null) {
                    c1d41.LIZLLL(c1d47LIZIZ);
                    return;
                }
                return;
            }
            C2250041D4w c2250041D4w3 = this.LIZJ;
            c2250041D4w3.getClass();
            C1D47 c1d47LIZIZ2 = c2250041D4w3.LIZIZ(EnumC2249761D3u.SCENE_FINAL_RESULT);
            C1D41 c1d412 = this.LIZLLL;
            if (c1d412 == null) {
                return;
            }
            c1d412.LIZLLL(c1d47LIZIZ2);
        }
    }

    @Override // X.C1D4C
    public final void LJIILIIL(int i, EnumC2249781D3w enumC2249781D3w) {
        C2250041D4w c2250041D4w = this.LIZJ;
        if (c2250041D4w != null) {
            c2250041D4w.LJIIJJI.LJI = i;
            C1D54 c1d54LIZ = c2250041D4w.LIZ("manual");
            if (c1d54LIZ == null) {
                C1283420jVE.LJ("updateManualLevel: failed ManualStrategy not inited");
            } else {
                c1d54LIZ.LIZIZ(i);
                c2250041D4w.LJIIL = enumC2249781D3w;
                c2250041D4w.LJFF |= 1;
            }
        }
        C2250011D4t c2250011D4t = this.LIZIZ;
        if (c2250011D4t != null) {
            c2250011D4t.LJJIJIIJIL = enumC2249781D3w;
        }
    }
}
