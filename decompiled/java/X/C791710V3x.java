package X;

import Y.ARunnableS24S0101000_13;
import com.bytedance.monitor.collector.c;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V3x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C791710V3x implements InterfaceC791730V3z {
    public C791670V3t LIZ;

    public C791710V3x() {
        C0V70.LIZ().LIZIZ();
        C0V70.LIZ().LIZJ(new C0V73() { // from class: X.0V3s
            @Override // X.C0V73
            public final void LIZ(JSONObject jSONObject) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                boolean z5;
                boolean z6;
                boolean z7;
                boolean z8;
                boolean z9;
                boolean z10;
                int i;
                C791710V3x c791710V3x = this.LIZ;
                c791710V3x.getClass();
                if (jSONObject != null) {
                    try {
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("performance_modules").optJSONObject("smooth");
                        if (jSONObjectOptJSONObject != null) {
                            c791710V3x.LIZ = new C791670V3t();
                            boolean z11 = false;
                            if (jSONObjectOptJSONObject.optInt("enable_stack_sampling", 0) == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            c791710V3x.LIZ.LIZ = z;
                            if (jSONObjectOptJSONObject.optInt("enable_trace", 0) == 1) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c791710V3x.LIZ.LIZIZ = z2;
                            c791710V3x.LIZ.LIZJ = jSONObjectOptJSONObject.optLong("atrace_tag", 0L);
                            if (jSONObjectOptJSONObject.optInt("block_dump_stack_enable", 1) == 1) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            c791710V3x.LIZ.LIZLLL = z3;
                            if (jSONObjectOptJSONObject.optInt("enable_gfx_monitor", 0) == 1) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            c791710V3x.LIZ.LJ = z4;
                            c791710V3x.LIZ.LJFF = jSONObjectOptJSONObject.optInt("block_monitor_mode", 1001);
                            if (jSONObjectOptJSONObject.optInt("serious_block_enable_upload", 1) == 1) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            c791710V3x.LIZ.LJI = z5;
                            c791710V3x.LIZ.LJII = jSONObjectOptJSONObject.optLong("serious_block_threshold", 4000L);
                            if (jSONObjectOptJSONObject.optInt("slow_method_enable_upload", 0) == 1) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            c791710V3x.LIZ.LJIIIIZZ = z6;
                            if (jSONObjectOptJSONObject.optInt("drop_enable_upload", 1) == 1) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            c791710V3x.LIZ.LJIIIZ = z7;
                            if (jSONObjectOptJSONObject.optInt("enable_upload", 0) == 1) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            c791710V3x.LIZ.LJIIJ = z8;
                            c791710V3x.LIZ.LJIIJJI = jSONObjectOptJSONObject.optLong("block_threshold", 2500L);
                            c791710V3x.LIZ.LJIIL = jSONObjectOptJSONObject.optLong("drop_threshold", 1000L);
                            if (jSONObjectOptJSONObject.optInt("block_enable_upload", 0) == 1) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            c791710V3x.LIZ.LJIILIIL = z9;
                            c791710V3x.LIZ.LJIILJJIL = jSONObjectOptJSONObject.optBoolean("drop_slow_method_switch", false);
                            if (jSONObjectOptJSONObject.optInt("enable_slow_method_ext", 0) == 1) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            c791710V3x.LIZ.LJIILL = z10;
                            jSONObjectOptJSONObject.optJSONObject("scene_enable_upload");
                            c791710V3x.LIZ.getClass();
                            C791700V3w c791700V3w = C791690V3v.LIZ;
                            C791670V3t c791670V3t = c791710V3x.LIZ;
                            c791700V3w.getClass();
                            if (c791670V3t != null) {
                                C791600V3m.LIZ().getClass();
                                C791560V3i.LIZLLL().LIZLLL = true;
                                C791600V3m c791600V3mLIZ = C791600V3m.LIZ();
                                int i2 = c791670V3t.LJFF;
                                c791600V3mLIZ.getClass();
                                if (i2 != 11) {
                                    if (i2 != 101) {
                                        if (i2 != 1001) {
                                            i = 1;
                                        } else {
                                            i = 0;
                                        }
                                    } else {
                                        i = 3;
                                    }
                                } else {
                                    i = 2;
                                }
                                c791600V3mLIZ.LIZ = i;
                                C791560V3i c791560V3iLIZLLL = C791560V3i.LIZLLL();
                                int i3 = c791600V3mLIZ.LIZ;
                                if (c791560V3iLIZLLL.LIZLLL) {
                                    for (c cVar : (CopyOnWriteArrayList) c791560V3iLIZLLL.LIZ) {
                                        if (cVar != null) {
                                            C791640V3q c791640V3q = new C791640V3q(EnumC792960V8s.LIGHT_WEIGHT, new ARunnableS24S0101000_13(i3, cVar, 0), "refreshConfig");
                                            C791750V4b c791750V4b = cVar.LIZLLL;
                                            if (c791750V4b != null) {
                                                c791750V4b.LJII(c791640V3q);
                                            }
                                        }
                                    }
                                }
                                List<InterfaceC791720V3y> list = C791680V3u.LIZ;
                                synchronized (C791680V3u.class) {
                                    for (InterfaceC791720V3y interfaceC791720V3y : (ArrayList) C791680V3u.LIZ) {
                                        if (interfaceC791720V3y != null) {
                                            interfaceC791720V3y.LIZIZ(c791670V3t);
                                        }
                                    }
                                }
                                if ((C798700VUu.LIZ() || c791670V3t.LJIIIIZZ) && (C798700VUu.LIZ() || c791670V3t.LJIILJJIL)) {
                                    z11 = true;
                                }
                                C0V2F.LIZ(c791670V3t.LJIIL, z11, c791670V3t.LJIILL);
                            }
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
        });
    }
}
