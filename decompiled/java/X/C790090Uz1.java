package X;

import android.content.Context;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0Uz1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C790090Uz1 {
    public static volatile C790090Uz1 LIZJ;
    public static boolean LIZLLL;
    public final C0VSJ LIZ;
    public final Set<String> LIZIZ;

    public C790090Uz1(Context context) {
        if (C1474810oTv.LLJJI() || !C1474810oTv.LJJIIZ()) {
            this.LIZ = new C0VSJ(C786410Ut5.w2(context), "saved_events");
        }
        this.LIZIZ = new HashSet();
    }
}
