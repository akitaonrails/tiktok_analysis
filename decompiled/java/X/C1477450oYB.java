package X;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0oYB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1477450oYB extends C1477430oY9 {
    @Override // X.C1477430oY9
    public final InterfaceC1475640oVG LIZ() {
        C1477430oY9 c1477430oY9 = new C1477430oY9(this.LIZ);
        c1477430oY9.LIZIZ = this.LIZIZ;
        c1477430oY9.LIZJ = this.LIZJ;
        c1477430oY9.LIZLLL = this.LIZLLL;
        final InterfaceC1475640oVG interfaceC1475640oVGLIZ = c1477430oY9.LIZ();
        final InterfaceC1477480oYE interfaceC1477480oYE = this.LIZ;
        C1477370oY3 c1477370oY3 = new C1477370oY3(interfaceC1477480oYE, interfaceC1475640oVGLIZ) { // from class: X.0oY4
            public final InterfaceC1475640oVG LJFF;
            public final Map<Integer, InterfaceC1475640oVG> LJI;

            public static int LJI(InterfaceC1475360oUo interfaceC1475360oUo) {
                int iHashCode;
                int iHashCode2;
                int iHashCode3;
                int iHashCode4;
                if (interfaceC1475360oUo == null) {
                    return -1;
                }
                Double dValueOf = Double.valueOf(interfaceC1475360oUo.LIZLLL());
                Double dValueOf2 = Double.valueOf(interfaceC1475360oUo.LIZJ());
                Double dValueOf3 = Double.valueOf(interfaceC1475360oUo.LJ());
                Double dValueOf4 = Double.valueOf(interfaceC1475360oUo.LIZIZ());
                Double dValueOf5 = Double.valueOf(interfaceC1475360oUo.LIZ());
                int iHashCode5 = 0;
                if (dValueOf == null) {
                    iHashCode = 0;
                } else {
                    iHashCode = dValueOf.hashCode();
                }
                if (dValueOf2 == null) {
                    iHashCode2 = 0;
                } else {
                    iHashCode2 = dValueOf2.hashCode();
                }
                if (dValueOf3 == null) {
                    iHashCode3 = 0;
                } else {
                    iHashCode3 = dValueOf3.hashCode();
                }
                if (dValueOf4 == null) {
                    iHashCode4 = 0;
                } else {
                    iHashCode4 = dValueOf4.hashCode();
                }
                if (dValueOf5 != null) {
                    iHashCode5 = dValueOf5.hashCode();
                }
                return ((((((((iHashCode + 31) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5;
            }

            {
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                this.LJI = concurrentHashMap;
                this.LJFF = interfaceC1475640oVGLIZ;
                concurrentHashMap.put(Integer.valueOf(LJI(this.LIZLLL)), interfaceC1475640oVGLIZ);
            }

            @Override // X.C1477370oY3, X.InterfaceC1475640oVG
            public final C1477120oXe LIZIZ(List<? extends InterfaceC1477220oXo> list, Map<String, Object> map) {
                Object obj = map.get("KEY_AUTO_BITRATE_SET");
                if (obj instanceof InterfaceC1475360oUo) {
                    InterfaceC1475360oUo interfaceC1475360oUo = (InterfaceC1475360oUo) obj;
                    InterfaceC1475640oVG interfaceC1475640oVGLIZ2 = (InterfaceC1475640oVG) ((ConcurrentHashMap) this.LJI).get(Integer.valueOf(LJI(interfaceC1475360oUo)));
                    if (interfaceC1475640oVGLIZ2 == null) {
                        C1477430oY9 c1477430oY92 = new C1477430oY9(this.LIZ);
                        c1477430oY92.LIZLLL = interfaceC1475360oUo;
                        c1477430oY92.LIZJ = this.LIZJ;
                        c1477430oY92.LIZIZ = this.LIZIZ;
                        interfaceC1475640oVGLIZ2 = c1477430oY92.LIZ();
                        ((ConcurrentHashMap) this.LJI).put(Integer.valueOf(LJI(interfaceC1475360oUo)), interfaceC1475640oVGLIZ2);
                    }
                    return interfaceC1475640oVGLIZ2.LIZIZ(list, map);
                }
                return this.LJFF.LIZIZ(list, map);
            }
        };
        c1477370oY3.LIZIZ = this.LIZIZ;
        c1477370oY3.LIZJ = this.LIZJ;
        c1477370oY3.LIZLLL = this.LIZLLL;
        return c1477370oY3;
    }

    public C1477450oYB(InterfaceC1477480oYE interfaceC1477480oYE) {
        super(interfaceC1477480oYE);
    }
}
