package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O7R, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O7R implements InterfaceC613990O6j {
    public static C0O8O LIZIZ;
    public static final C0O7R LIZ = new C0O7R();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(447));
    public static final C1DEV LIZLLL = C2191201ApK.LIZ();

    @Override // X.InterfaceC613990O6j
    public final <D extends InterfaceC613710O5h> InterfaceC346201Wa<C0O7A<D>> LIZ(C613970O6h<D> c613970O6h, C613980O6i c613980O6i) {
        Object obj;
        AbstractC614210O7f abstractC614210O7f;
        C0O8O c0o8o = c613970O6h.LIZIZ;
        C614220O7g c614220O7g = C0O8F.LIZJ;
        C0O8F c0o8f = (C0O8F) c0o8o.LIZ(c614220O7g);
        if (c0o8f == null || (obj = c0o8f.LIZIZ) == null) {
            obj = AbstractC614210O7f.LIZ;
        }
        AbstractC614210O7f abstractC614210O7f2 = AbstractC614210O7f.LIZ;
        if ((!Intrinsics.LJFF(obj, abstractC614210O7f2)) && obj != null) {
            LIZ.getClass();
            C0O8F c0o8f2 = (C0O8F) c613970O6h.LIZIZ.LIZ(c614220O7g);
            if (c0o8f2 != null && (abstractC614210O7f = c0o8f2.LIZIZ) != null) {
                abstractC614210O7f2 = abstractC614210O7f;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(abstractC614210O7f2.getClass());
            sbLIZ.append('_');
            sbLIZ.append(abstractC614210O7f2.LIZ());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C01GW c01gw = LIZJ;
            C0O7T c0o7t = (C0O7T) ((ConcurrentHashMap) c01gw.getValue()).get(strLIZIZ);
            if (c0o7t == null) {
                c0o7t = new C0O7T(abstractC614210O7f2);
                ((ConcurrentHashMap) c01gw.getValue()).put(strLIZIZ, c0o7t);
            }
            return new C095D(new C0O7S(c613970O6h, c0o7t, c613980O6i, null));
        }
        return c613980O6i.LIZ(c613970O6h);
    }
}
