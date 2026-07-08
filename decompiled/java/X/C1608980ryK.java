package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0ryK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1608980ryK {
    public final Map<Integer, Map<String, Set<String>>> LIZ;
    public Map<String, ? extends Set<String>> LIZIZ;
    public Map<EnumC1607270rvZ, ? extends AbstractC1608810ry3<? extends InterfaceC1606880ruw, ? extends InterfaceC426680GoE>> LIZJ;
    public Map<EnumC1607270rvZ, ? extends InterfaceC1608870ry9<?, ?>> LIZLLL;
    public Map<EnumC1607270rvZ, ? extends AbstractC1608790ry1<?, ?>> LJ;
    public final Set<? extends EnumC1608710rxt> LJFF;
    public final C054G LJI;
    public final ConcurrentHashMap<EnumC1608710rxt, List<C1609000ryM>> LJII;
    public final ConcurrentHashMap<EnumC1608710rxt, C1609000ryM> LJIIIIZZ;
    public final ConcurrentHashMap<EnumC1608710rxt, Integer> LJIIIZ;
    public boolean LJIIJ;

    public C1608980ryK() {
        C1608690rxr.LIZ.getClass();
        Map<Integer, Map<String, Set<String>>> map = (Map) C1608690rxr.LIZJ.getValue();
        this.LIZ = map;
        this.LIZIZ = map.get(Integer.valueOf(EnumC992190bvV.DEFAULT.getValue()));
        this.LJFF = (Set) C1608690rxr.LJ.getValue();
        this.LJI = C2296808zG.LIZ(C0PEM.LIZ);
        this.LJII = new ConcurrentHashMap<>();
        this.LJIIIIZZ = new ConcurrentHashMap<>();
        this.LJIIIZ = new ConcurrentHashMap<>();
    }

    public final int LIZJ(C1609000ryM c1609000ryM) {
        Set<String> set;
        Integer numValueOf;
        if (c1609000ryM == null) {
            return LSPassThroughRecordSizeConfig.DEFAULT;
        }
        String string = c1609000ryM.LIZ.getString();
        EnumC1608710rxt nodeType = c1609000ryM.LIZJ.getNodeType();
        Map<String, ? extends Set<String>> map = this.LIZIZ;
        if (map == null || (set = map.get(nodeType.getString())) == null || (numValueOf = Integer.valueOf(C13LP.LJJJZ(string, set))) == null || numValueOf.intValue() == -1) {
            return LSPassThroughRecordSizeConfig.DEFAULT;
        }
        return numValueOf.intValue();
    }

    public final void LIZIZ(Object obj, boolean z, EnumC1607270rvZ enumC1607270rvZ) {
        AbstractC1608810ry3<? extends InterfaceC1606880ruw, ? extends InterfaceC426680GoE> abstractC1608810ry3;
        if (enumC1607270rvZ != null) {
            Map<EnumC1607270rvZ, ? extends AbstractC1608810ry3<? extends InterfaceC1606880ruw, ? extends InterfaceC426680GoE>> map = this.LIZJ;
            if (map != null) {
                abstractC1608810ry3 = map.get(enumC1607270rvZ);
            } else {
                abstractC1608810ry3 = null;
            }
            LIZ(enumC1607270rvZ, abstractC1608810ry3, obj, z);
            return;
        }
        Map<EnumC1607270rvZ, ? extends AbstractC1608810ry3<? extends InterfaceC1606880ruw, ? extends InterfaceC426680GoE>> map2 = this.LIZJ;
        if (map2 == null) {
            return;
        }
        for (Map.Entry<EnumC1607270rvZ, ? extends AbstractC1608810ry3<? extends InterfaceC1606880ruw, ? extends InterfaceC426680GoE>> entry : map2.entrySet()) {
            LIZ(entry.getKey(), entry.getValue(), obj, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e A[Catch: Exception -> 0x00f1, TryCatch #1 {Exception -> 0x00f1, blocks: (B:41:0x0074, B:43:0x007e, B:44:0x0088, B:46:0x0092, B:54:0x00af, B:56:0x00b3, B:57:0x00ba, B:58:0x00d0, B:60:0x00da, B:61:0x00e1, B:52:0x00a9, B:49:0x009e, B:51:0x00a6), top: B:95:0x0074 }] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [X.0ryN] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.EnumC1607270rvZ r20, X.AbstractC1608810ry3<? extends X.InterfaceC1606880ruw, ? extends X.InterfaceC426680GoE> r21, java.lang.Object r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1608980ryK.LIZ(X.0rvZ, X.0ry3, java.lang.Object, boolean):void");
    }
}
