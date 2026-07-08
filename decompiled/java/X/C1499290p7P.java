package X;

import com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0p7P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1499290p7P {
    public final boolean LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final List<InetAddress> LJFF;
    public final boolean LJI;
    public final String LJII;

    public final int LIZ() {
        if (!this.LIZ) {
            return 1;
        }
        int i = this.LIZIZ;
        if (i != 0 && i != 4 && i != 5) {
            return 0;
        }
        switch (this.LIZJ) {
        }
        return 0;
    }

    public final int LIZIZ() {
        if (this.LIZ) {
            return NetworkChangeNotifierAutoDetect.LIZIZ(this.LIZIZ, this.LIZJ);
        }
        return 6;
    }

    public C1499290p7P(boolean z, int i, int i2, boolean z2, String str, List<InetAddress> list, boolean z3, String str2) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = z2;
        this.LJ = str == null ? "" : str;
        this.LJFF = list == null ? new ArrayList<>() : list;
        this.LJI = z3;
        this.LJII = str2 == null ? "" : str2;
    }
}
