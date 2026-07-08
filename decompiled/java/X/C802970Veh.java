package X;

import java.io.File;

/* JADX INFO: renamed from: X.0Veh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C802970Veh {
    public final int LIZ;
    public final int LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public final int LJFF;
    public C0VSJ LJI;

    public String toString() {
        throw null;
    }

    public final String LIZ() {
        String str;
        if (this.LIZLLL == null) {
            switch (this.LJFF) {
                case 0:
                    str = "npth_xasan";
                    break;
                case 1:
                    str = "npth_heap_tracker";
                    break;
                case 2:
                    str = "npth_fd_tracker";
                    break;
                case 3:
                    str = "npth_vm_monitor";
                    break;
                case 4:
                    str = "npth_tls_monitor";
                    break;
                case 5:
                    str = "npth_ref_monitor";
                    break;
                case 6:
                    str = "npth_setpriority";
                    break;
                default:
                    str = "unknown";
                    break;
            }
            this.LIZLLL = str;
        }
        return this.LIZLLL;
    }

    public final File LIZIZ() {
        C0VSJ c0vsj;
        if (this.LJI == null) {
            switch (this.LJFF) {
                case 0:
                    c0vsj = C803150Vez.LJII.LIZ;
                    break;
                case 1:
                    c0vsj = C803150Vez.LJII.LIZIZ;
                    break;
                case 2:
                    c0vsj = C803150Vez.LJII.LIZLLL;
                    break;
                case 3:
                    c0vsj = C803150Vez.LJII.LIZJ;
                    break;
                case 4:
                    c0vsj = C803150Vez.LJII.LJFF;
                    break;
                case 5:
                    c0vsj = C803150Vez.LJII.LJ;
                    break;
                case 6:
                    c0vsj = C803150Vez.LJII.LJI;
                    break;
                default:
                    c0vsj = null;
                    break;
            }
            this.LJI = c0vsj;
        }
        return this.LJI;
    }

    public C802970Veh(int i, int i2, int i3) {
        this.LIZIZ = i2;
        this.LIZ = i;
        this.LJFF = i3;
    }
}
