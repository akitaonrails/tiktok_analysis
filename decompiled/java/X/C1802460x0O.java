package X;

import java.util.HashSet;

/* JADX INFO: renamed from: X.0x0O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final /* synthetic */ class C1802460x0O {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(int i) {
        HashSet<Integer> hashSet = InterfaceC1802450x0N.LIZ;
        if (hashSet.isEmpty()) {
            hashSet.add(42031);
            hashSet.add(42032);
            hashSet.add(42030);
            hashSet.add(4005265);
            hashSet.add(4005269);
            hashSet.add(4005268);
            hashSet.add(4005271);
            hashSet.add(4005270);
            hashSet.add(4005266);
            hashSet.add(4005267);
        }
        return hashSet.contains(Integer.valueOf(i));
    }
}
