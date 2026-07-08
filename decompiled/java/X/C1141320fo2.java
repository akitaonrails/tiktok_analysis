package X;

import Y.ARunnableS117S0100000_17;
import java.util.Map;

/* JADX INFO: renamed from: X.0fo2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1141320fo2 {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public int LJI;

    public static long LIZ() {
        return C1141290fnz.LIZJ().currentTimeMillis();
    }

    public final void LIZIZ() {
        String str;
        long jLIZ = LIZ();
        C1141340fo4 c1141340fo4 = new C1141340fo4("gift_render_spark_prepare", null);
        Integer numValueOf = Integer.valueOf(this.LJI == 6 ? 1 : 0);
        if (numValueOf != null) {
            c1141340fo4.LIZLLL.put("show_success", numValueOf.toString());
        }
        int i = this.LJI;
        if (i != 6) {
            switch (i) {
                case 0:
                    str = "init";
                    break;
                case 1:
                    str = "spark_create";
                    break;
                case 2:
                    str = "resource_load";
                    break;
                case 3:
                    str = "bridge_register";
                    break;
                case 4:
                    str = "first_screen";
                    break;
                case 5:
                    str = "fe_ready";
                    break;
                case 6:
                    str = "shown";
                    break;
                default:
                    str = "unknown";
                    break;
            }
            Map<String, String> map = c1141340fo4.LIZLLL;
            str.toString();
            map.put("terminate_stage", str);
        }
        int i2 = this.LJI;
        if (i2 >= 2) {
            c1141340fo4.LIZ(this.LIZIZ - this.LIZ, "spark_create_time");
        } else if (i2 == 0) {
            c1141340fo4.LIZ(jLIZ - this.LIZ, "spark_create_time");
        }
        int i3 = this.LJI;
        if (i3 >= 3) {
            c1141340fo4.LIZ(this.LIZJ - this.LIZIZ, "resource_load_time");
        } else if (i3 == 2) {
            c1141340fo4.LIZ(jLIZ - this.LIZIZ, "resource_load_time");
        }
        int i4 = this.LJI;
        if (i4 >= 4) {
            c1141340fo4.LIZ(this.LIZLLL - this.LIZJ, "bridge_register_time");
        } else if (i4 == 3) {
            c1141340fo4.LIZ(jLIZ - this.LIZJ, "bridge_register_time");
        }
        int i5 = this.LJI;
        if (i5 >= 5) {
            c1141340fo4.LIZ(this.LJ - this.LIZLLL, "first_screen_time");
        } else if (i5 == 4) {
            c1141340fo4.LIZ(jLIZ - this.LIZLLL, "first_screen_time");
        }
        int i6 = this.LJI;
        if (i6 >= 6) {
            c1141340fo4.LIZ(this.LJFF - this.LJ, "fe_ready_time");
        } else if (i6 == 5) {
            c1141340fo4.LIZ(jLIZ - this.LJ, "fe_ready_time");
        }
        c1141340fo4.LIZ(jLIZ - this.LIZ, "total_duration");
        C823050WQl.LIZIZ().submit(new ARunnableS117S0100000_17(c1141340fo4, 5));
    }
}
