package X;

import Y.AObjectS299S0200000_30;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Ij, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19987513Ij extends AbstractC19987313Ih {
    public final C13BG LJI;
    public final InterfaceC19983313Gt LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;

    @Override // X.AbstractC19987313Ih, X.C13HB
    public final boolean LJIIZILJ() {
        return !this.LJIIIZ && super.LJIIZILJ();
    }

    @Override // X.AbstractC19987313Ih
    /* JADX INFO: renamed from: LJJJJZI, reason: merged with bridge method [inline-methods] */
    public C13BG LJJJJLI() {
        return this.LJI;
    }

    @Override // X.AbstractC19987313Ih, X.C13HB
    public final InterfaceC19986313Hx LIZIZ(InterfaceC19983313Gt interfaceC19983313Gt) {
        if (interfaceC19983313Gt == this.LJII) {
            AbstractC19987213Ig abstractC19987213Ig = this.LIZLLL;
            AbstractC19979113Fd abstractC19979113FdLJJJJL = LJJJJL();
            String strLJI = this.LJII.LJI();
            if (abstractC19979113FdLJJJJL instanceof C13BG) {
                return new C19987513Ij(abstractC19987213Ig, (C13BG) abstractC19979113FdLJJJJL, this.LJ, this.LJII);
            }
            throw C19988213Iq.LJ("Expected " + C13LE.LIZ(C13BG.class).LJI() + ", but had " + C13LE.LIZ(abstractC19979113FdLJJJJL.getClass()).LJI() + " as the serialized body of " + strLJI + " at element: " + LJJJJJ(), abstractC19979113FdLJJJJL.toString(), -1);
        }
        return super.LIZIZ(interfaceC19983313Gt);
    }

    @Override // X.AbstractC19987313Ih, X.InterfaceC19986313Hx
    public void LJIIJJI(InterfaceC19983313Gt interfaceC19983313Gt) {
        Object obj;
        Iterable iterableKeySet;
        Set<String> setLJIIIZ;
        if (!C19987613Ik.LIZLLL(interfaceC19983313Gt, this.LIZLLL) && !(interfaceC19983313Gt.LIZIZ() instanceof C13GL)) {
            C19987613Ik.LJ(interfaceC19983313Gt, this.LIZLLL);
            if (!this.LJFF.LJIIJJI) {
                setLJIIIZ = C13GE.LIZ(interfaceC19983313Gt);
            } else {
                Set<String> setLIZ = C13GE.LIZ(interfaceC19983313Gt);
                C13J8 c13j8 = this.LIZLLL.LIZJ;
                C13JE<Map<String, Integer>> c13je = C19987613Ik.LIZ;
                Map map = (Map) ((ConcurrentHashMap) c13j8.LIZ).get(interfaceC19983313Gt);
                if (map == null || (obj = map.get(c13je)) == null) {
                    obj = null;
                }
                Map map2 = (Map) obj;
                if (map2 == null || (iterableKeySet = map2.keySet()) == null) {
                    iterableKeySet = C08CX.INSTANCE;
                }
                setLJIIIZ = C15442062u.LJIIIZ(setLIZ, iterableKeySet);
            }
            for (String str : LJJJJLI().keySet()) {
                if (!setLJIIIZ.contains(str) && !Intrinsics.LJFF(str, this.LJ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Encountered an unknown key '");
                    sbLIZ.append(str);
                    sbLIZ.append("' at element: ");
                    sbLIZ.append(LJJJJJ());
                    sbLIZ.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
                    sbLIZ.append((Object) C19988213Iq.LJI(-1, LJJJJLI().toString()));
                    throw C19988213Iq.LIZLLL(-1, C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
    }

    @Override // X.InterfaceC19986313Hx
    public int LJIJJ(InterfaceC19983313Gt interfaceC19983313Gt) {
        C13GN c13gn;
        String strLIZJ;
        boolean z;
        while (this.LJIIIIZZ < interfaceC19983313Gt.LJ()) {
            int i = this.LJIIIIZZ;
            this.LJIIIIZZ = i + 1;
            String strLJJJJIZL = LJJJJIZL(interfaceC19983313Gt, i);
            C13LP.LJJLIIIJL(this.LIZIZ);
            int i2 = this.LJIIIIZZ - 1;
            this.LJIIIZ = false;
            if (LJJJJLI().containsKey(strLJJJJIZL) || LJJJLIIL(interfaceC19983313Gt, i2)) {
                if (!this.LJFF.LJII) {
                    return i2;
                }
                AbstractC19987213Ig abstractC19987213Ig = this.LIZLLL;
                boolean zLJIIIZ = interfaceC19983313Gt.LJIIIZ(i2);
                InterfaceC19983313Gt interfaceC19983313GtLJIIIIZZ = interfaceC19983313Gt.LJIIIIZZ(i2);
                if (!zLJIIIZ || interfaceC19983313GtLJIIIIZZ.LIZ() || !(LJJJJLI().get(strLJJJJIZL) instanceof C13GQ)) {
                    if (Intrinsics.LJFF(interfaceC19983313GtLJIIIIZZ.LIZIZ(), C13GS.LIZ) && (!interfaceC19983313GtLJIIIIZZ.LIZ() || !(LJJJJLI().get(strLJJJJIZL) instanceof C13GQ))) {
                        AbstractC19979113Fd abstractC19979113Fd = (AbstractC19979113Fd) LJJJJLI().get(strLJJJJIZL);
                        if ((abstractC19979113Fd instanceof C13GN) && (c13gn = (C13GN) abstractC19979113Fd) != null) {
                            C13H0 c13h0 = C19988013Io.LIZ;
                            if (!(c13gn instanceof C13GQ) && (strLIZJ = c13gn.LIZJ()) != null) {
                                int iLIZIZ = C19987613Ik.LIZIZ(interfaceC19983313GtLJIIIIZZ, abstractC19987213Ig, strLIZJ);
                                if (!abstractC19987213Ig.LIZ.LJFF && interfaceC19983313GtLJIIIIZZ.LIZ()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (iLIZIZ == -3 && (zLJIIIZ || z)) {
                                    if (LJJJLIIL(interfaceC19983313Gt, i2)) {
                                        return i2;
                                    }
                                }
                            }
                        }
                    }
                    return i2;
                }
            }
        }
        return -1;
    }

    @Override // X.AbstractC19987313Ih
    public AbstractC19979113Fd LJJJJJL(String str) {
        return (AbstractC19979113Fd) C2097608Jq.LJFF(str, LJJJJLI());
    }

    @Override // X.C13J3
    public String LJJJJIZL(InterfaceC19983313Gt interfaceC19983313Gt, int i) {
        Object objInvoke;
        C19987613Ik.LJ(interfaceC19983313Gt, this.LIZLLL);
        String strLIZJ = interfaceC19983313Gt.LIZJ(i);
        if (!this.LJFF.LJIIJJI || LJJJJLI().keySet().contains(strLIZJ)) {
            return strLIZJ;
        }
        AbstractC19987213Ig abstractC19987213Ig = this.LIZLLL;
        C13J8 c13j8 = abstractC19987213Ig.LIZJ;
        C13JE<Map<String, Integer>> c13je = C19987613Ik.LIZ;
        AObjectS299S0200000_30 aObjectS299S0200000_30 = new AObjectS299S0200000_30(interfaceC19983313Gt, abstractC19987213Ig, 1);
        Map map = (Map) ((ConcurrentHashMap) c13j8.LIZ).get(interfaceC19983313Gt);
        Object obj = null;
        if (map == null || (objInvoke = map.get(c13je)) == null) {
            objInvoke = aObjectS299S0200000_30.invoke();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c13j8.LIZ;
            Object concurrentHashMap2 = concurrentHashMap.get(interfaceC19983313Gt);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(interfaceC19983313Gt, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(c13je, objInvoke);
        }
        Map map2 = (Map) objInvoke;
        Iterator<T> it2 = LJJJJLI().keySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            Integer num = (Integer) map2.get(next);
            if (num != null && num.intValue() == i) {
                obj = next;
                break;
            }
        }
        String str = (String) obj;
        if (str != null) {
            return str;
        }
        return strLIZJ;
    }

    public final boolean LJJJLIIL(InterfaceC19983313Gt interfaceC19983313Gt, int i) {
        boolean z;
        if (!this.LIZLLL.LIZ.LJFF && !interfaceC19983313Gt.LJIIIZ(i) && interfaceC19983313Gt.LJIIIIZZ(i).LIZ()) {
            z = true;
        } else {
            z = false;
        }
        this.LJIIIZ = z;
        return z;
    }

    public /* synthetic */ C19987513Ij(AbstractC19987213Ig abstractC19987213Ig, C13BG c13bg, String str, int i) {
        this(abstractC19987213Ig, c13bg, (i & 4) != 0 ? null : str, (InterfaceC19983313Gt) null);
    }

    public C19987513Ij(AbstractC19987213Ig abstractC19987213Ig, C13BG c13bg, String str, InterfaceC19983313Gt interfaceC19983313Gt) {
        super(abstractC19987213Ig, c13bg, str);
        this.LJI = c13bg;
        this.LJII = interfaceC19983313Gt;
    }
}
