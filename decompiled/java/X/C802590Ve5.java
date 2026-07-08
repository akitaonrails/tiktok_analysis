package X;

import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0Ve5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C802590Ve5 {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public long LJ;
    public long LJFF;
    public String LJI;
    public boolean LJII;
    public final boolean LJIIIIZZ;
    public double LJIIIZ;
    public double LJIIJ;
    public double LJIIJJI;
    public double LJIIL;
    public double LJIILIIL;
    public double LJIILJJIL;
    public double LJIILLIIL;
    public double LJIIZILJ;
    public double LJIJ;
    public double LJIJI;
    public double LJIJJ;
    public final /* synthetic */ C802470Vdt LJIL;
    public final ArrayList<C803210Vf5> LJIILL = new ArrayList<>();
    public final ArrayList<Double> LJIJJLI = new ArrayList<>();

    public final C803210Vf5 LIZ() {
        for (C803210Vf5 c803210Vf5 : this.LJIILL) {
            if (c803210Vf5.LJI == this.LJIL.LIZLLL) {
                return c803210Vf5;
            }
        }
        return null;
    }

    public final JSONObject LIZIZ() {
        JSONObject jSONObject = new JSONObject();
        for (C803210Vf5 c803210Vf5 : this.LJIILL) {
            String strValueOf = String.valueOf(c803210Vf5.LJI);
            JSONObject jSONObject2 = new JSONObject();
            C0VJO.LJIIIIZZ(jSONObject2, "process_name", c803210Vf5.LIZ);
            C0VJO.LJIIIIZZ(jSONObject2, "cpu", Double.valueOf(c803210Vf5.LIZIZ));
            C0VJO.LJIIIIZZ(jSONObject, strValueOf, jSONObject2);
        }
        return jSONObject;
    }

    public final void LIZJ() {
        int iIndexOf;
        C803210Vf5 c803210Vf5LIZLLL;
        int i = this.LIZIZ + 1;
        while (i < this.LIZJ && (iIndexOf = this.LIZ.indexOf("\n", i)) >= 0) {
            if (iIndexOf - i <= 4 || this.LIZ.charAt(i + 2) != ' ') {
                try {
                    c803210Vf5LIZLLL = LIZLLL(i, iIndexOf, this.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                if (c803210Vf5LIZLLL == null) {
                    continue;
                } else if (c803210Vf5LIZLLL.LIZIZ < 1.0d) {
                    return;
                } else {
                    this.LJIILL.add(c803210Vf5LIZLLL);
                }
            }
            i = iIndexOf + 1;
        }
    }

    public final void LJ() {
        for (C803210Vf5 c803210Vf5 : this.LJIILL) {
            String str = c803210Vf5.LIZ;
            double d = c803210Vf5.LIZIZ;
            if (str.contains("kworker")) {
                this.LJIJ += d;
            } else if (str.contains("kswapd")) {
                this.LJIILLIIL += d;
            } else if (str.contains("mmcqd")) {
                this.LJIIZILJ += d;
            } else if (str.contains("system_server")) {
                this.LJIJI += d;
            } else if (str.contains("lmkd")) {
                this.LJIJJ += d;
            } else if (str.contains("dex2oat")) {
                this.LJIJJLI.add(Double.valueOf(d));
            }
        }
    }

    public final void LJI(JSONObject jSONObject) {
        try {
            jSONObject.put("kswapd", this.LJIILLIIL);
            jSONObject.put("mmcqd", this.LJIIZILJ);
            jSONObject.put("kwork", this.LJIJ);
            jSONObject.put("system_server", this.LJIJI);
            jSONObject.put("lmkd", this.LJIJJ);
            if (!this.LJIJJLI.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator<Double> it2 = this.LJIJJLI.iterator();
                while (it2.hasNext()) {
                    jSONArray.put(it2.next());
                }
                jSONObject.put("dex2oat", jSONArray);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJFF(JSONObject jSONObject, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if (z) {
            str = "user";
        } else {
            str = "user2";
        }
        try {
            jSONObject.put(str, this.LJIIJ);
            if (z) {
                str2 = "sys";
            } else {
                str2 = "sys2";
            }
            jSONObject.put(str2, this.LJIIJJI);
            if (z) {
                str3 = "iowait";
            } else {
                str3 = "iowait2";
            }
            jSONObject.put(str3, this.LJIIL);
            if (z) {
                str4 = "irq";
            } else {
                str4 = "irq2";
            }
            jSONObject.put(str4, this.LJIILIIL);
            if (z) {
                str5 = "softirq";
            } else {
                str5 = "softirq2";
            }
            jSONObject.put(str5, this.LJIILJJIL);
            C803210Vf5 c803210Vf5LIZ = LIZ();
            if (c803210Vf5LIZ != null) {
                if (z) {
                    str7 = "minor";
                } else {
                    str7 = "minor2";
                }
                jSONObject.put(str7, c803210Vf5LIZ.LJ);
                if (z) {
                    str8 = "major";
                } else {
                    str8 = "major2";
                }
                jSONObject.put(str8, c803210Vf5LIZ.LJFF);
            }
            if (z) {
                str6 = "before_cpu_list";
            } else {
                str6 = "after_cpu_list";
            }
            jSONObject.put(str6, LIZIZ());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public C802590Ve5(C802470Vdt c802470Vdt, String str, int[] iArr) {
        String strLIZ;
        String strLIZ2;
        String strLIZ3;
        double d;
        double d2;
        double d3;
        double d4;
        this.LJIL = c802470Vdt;
        this.LIZ = str;
        boolean z = false;
        int i = iArr[0];
        int i2 = iArr[1];
        this.LIZIZ = i2;
        this.LIZJ = iArr[2];
        this.LIZLLL = iArr[3];
        C803360VfK c803360VfK = new C803360VfK(str.substring(i, i2));
        String strLIZ4 = c803360VfK.LIZ("CPU usage from ", "ms");
        if (strLIZ4 != null && (strLIZ = c803360VfK.LIZ(" to ", "ms")) != null && (strLIZ2 = c803360VfK.LIZ(" ", " ")) != null && (strLIZ3 = c803360VfK.LIZ(e3.h, " t")) != null && c803360VfK.LIZ("o ", ")") != null) {
            try {
                this.LJ = CastLongProtector.parseLong(strLIZ4);
                this.LJFF = CastLongProtector.parseLong(strLIZ);
                this.LJII = "ago".equals(strLIZ2);
                this.LJI = strLIZ3;
                C803360VfK c803360VfK2 = new C803360VfK(this.LIZ.substring(this.LIZJ, this.LIZLLL));
                String strLIZ5 = c803360VfK2.LIZ(null, "% TOTAL:");
                if (strLIZ5 != null) {
                    String strLIZ6 = c803360VfK2.LIZ(" ", "% user");
                    if (strLIZ6 != null) {
                        c803360VfK2.LIZIZ += 2;
                    }
                    String strLIZ7 = c803360VfK2.LIZ(" ", "% kernel");
                    if (strLIZ7 != null) {
                        c803360VfK2.LIZIZ += 2;
                    }
                    String strLIZ8 = c803360VfK2.LIZ(" ", "% iowait");
                    if (strLIZ8 != null) {
                        c803360VfK2.LIZIZ += 2;
                    }
                    String strLIZ9 = c803360VfK2.LIZ(" ", "% irq");
                    if (strLIZ9 != null) {
                        c803360VfK2.LIZIZ += 2;
                    }
                    String strLIZ10 = c803360VfK2.LIZ(" ", "% softirq");
                    try {
                        this.LJIIIZ = CastDoubleProtector.parseDouble(strLIZ5);
                        if (strLIZ6 == null) {
                            d = 0.0d;
                        } else {
                            d = CastDoubleProtector.parseDouble(strLIZ6);
                        }
                        this.LJIIJ = d;
                        if (strLIZ7 == null) {
                            d2 = 0.0d;
                        } else {
                            d2 = CastDoubleProtector.parseDouble(strLIZ7);
                        }
                        this.LJIIJJI = d2;
                        if (strLIZ8 == null) {
                            d3 = 0.0d;
                        } else {
                            d3 = CastDoubleProtector.parseDouble(strLIZ8);
                        }
                        this.LJIIL = d3;
                        if (strLIZ9 == null) {
                            d4 = 0.0d;
                        } else {
                            d4 = CastDoubleProtector.parseDouble(strLIZ9);
                        }
                        this.LJIILIIL = d4;
                        this.LJIILJJIL = strLIZ10 != null ? CastDoubleProtector.parseDouble(strLIZ10) : 0.0d;
                        z = true;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        this.LJIIIIZZ = z;
    }

    public final C803210Vf5 LIZLLL(int i, int i2, String str) {
        int i3;
        int iIndexOf;
        int i4 = i + 2;
        int iIndexOf2 = str.indexOf(37, i4);
        C803210Vf5 c803210Vf5 = null;
        if (iIndexOf2 >= 0 && iIndexOf2 <= i2) {
            double d = CastDoubleProtector.parseDouble(str.substring(i4, iIndexOf2));
            int i5 = iIndexOf2 + 2;
            int iIndexOf3 = str.indexOf(47, i5);
            if (iIndexOf3 >= 0 && iIndexOf3 <= i2) {
                int i6 = CastIntegerProtector.parseInt(str.substring(i5, iIndexOf3));
                int i7 = iIndexOf3 + 1;
                int iIndexOf4 = str.indexOf(": ", i7);
                if (iIndexOf4 >= 0 && iIndexOf4 <= i2) {
                    c803210Vf5 = new C803210Vf5(i6, str.substring(i7, iIndexOf4), d);
                    if (i6 == this.LJIL.LIZLLL && (iIndexOf = str.indexOf("% user + ", (i3 = iIndexOf4 + 2))) >= 0 && iIndexOf <= i2) {
                        c803210Vf5.LIZJ = CastDoubleProtector.parseDouble(str.substring(i3, iIndexOf));
                        int i8 = iIndexOf + 9;
                        int iIndexOf5 = str.indexOf("% kernel", i8);
                        if (iIndexOf5 >= 0 && iIndexOf5 <= i2) {
                            c803210Vf5.LIZLLL = CastDoubleProtector.parseDouble(str.substring(i8, iIndexOf5));
                            int iIndexOf6 = str.indexOf("faults: ", iIndexOf5);
                            if (iIndexOf6 >= 0 && iIndexOf6 <= i2) {
                                int i9 = iIndexOf6 + 8;
                                int iIndexOf7 = str.indexOf(" minor", i9);
                                if (iIndexOf7 > 0 && iIndexOf7 < i2) {
                                    c803210Vf5.LJ = CastLongProtector.parseLong(str.substring(i9, iIndexOf7));
                                    i9 = iIndexOf7 + 7;
                                }
                                int iIndexOf8 = str.indexOf(" major", i9);
                                if (iIndexOf8 > 0 && iIndexOf8 < i2) {
                                    c803210Vf5.LJFF = CastLongProtector.parseLong(str.substring(i9, iIndexOf8));
                                }
                            }
                        }
                    }
                }
            }
        }
        return c803210Vf5;
    }
}
