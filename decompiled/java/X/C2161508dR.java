package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.08dR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2161508dR {
    public final List<Integer> LIZ = new ArrayList(1);

    public final synchronized boolean LIZ(int i) {
        if (((ArrayList) this.LIZ).size() >= 256) {
            return false;
        }
        ((ArrayList) this.LIZ).add(Integer.valueOf(i));
        return true;
    }

    public C2161508dR(int i, int i2, int i3, int i4, String str) {
    }
}
