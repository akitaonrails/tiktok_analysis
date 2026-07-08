package X;

/* JADX INFO: renamed from: X.1BCt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2201131BCt {
    public static boolean LIZ;

    public static Object LIZ(InterfaceC1702080uOU interfaceC1702080uOU, C2201141BCu c2201141BCu) {
        if (!LIZ) {
            return c2201141BCu.invoke();
        }
        long jNanoTime = System.nanoTime();
        Object objInvoke = c2201141BCu.invoke();
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("type: ");
        sbLIZ.append(interfaceC1702080uOU);
        sbLIZ.append(", getStateCostTime: ");
        sbLIZ.append(jNanoTime2 / 1000000);
        C2188811AlT.LIZIZ(sbLIZ);
        return objInvoke;
    }
}
