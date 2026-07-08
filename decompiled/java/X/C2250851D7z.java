package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS614S0100000_35;

/* JADX INFO: renamed from: X.1D7z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2250851D7z {
    public final Set<C1D82> LIZ = new LinkedHashSet();
    public final Set<C1D82> LIZIZ = new LinkedHashSet();
    public boolean LIZJ;
    public C1D80 LIZLLL;
    public final C1D82 LJ;

    public final C1404610meh LIZ() {
        ArrayList arrayList = new ArrayList();
        if (this.LIZ.isEmpty()) {
            arrayList.addAll(this.LIZLLL.LJII);
        }
        arrayList.addAll(this.LIZLLL.LJI);
        Set<C1D82> set = this.LIZ;
        ArrayList arrayList2 = new ArrayList();
        Iterator<C1D82> it2 = set.iterator();
        while (it2.hasNext()) {
            AbstractC2250861D8a abstractC2250861D8aLIZJ = it2.next().LIZJ();
            if (abstractC2250861D8aLIZJ == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.bytedance.wave.core.NodeState.Finish.TotalFinish.Success");
            }
            Object obj = ((C1D8N) abstractC2250861D8aLIZJ).LIZLLL;
            if (obj != null) {
                arrayList2.add(obj);
            }
        }
        arrayList.addAll(arrayList2);
        return new C1404610meh(arrayList);
    }

    public C2250851D7z(C1D82 c1d82) {
        this.LJ = c1d82;
    }

    public final void LIZLLL(AbstractC556140LrY abstractC556140LrY) {
        this.LIZLLL.LJI(abstractC556140LrY);
    }

    public final void LIZIZ(C556200Lre c556200Lre, EnumC2251001D8o enumC2251001D8o) {
        this.LIZLLL.LJI(c556200Lre);
        int i = C2251011D8p.LIZ[enumC2251001D8o.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 4) {
                    Iterator<C1D82> it2 = this.LIZIZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().LJFF(c556200Lre.LIZJ);
                    }
                    return;
                }
                return;
            }
            this.LIZLLL.LJIIIIZZ(new AwS614S0100000_35(c556200Lre, 14), true);
            return;
        }
        this.LIZLLL.LJIIIIZZ(new AwS614S0100000_35((Function1) new AwS614S0100000_35(c556200Lre, 13), 1), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZJ(C1435220nS4 c1435220nS4, C556300Lro c556300Lro) {
        AbstractC2250861D8a abstractC2250861D8aLIZJ;
        AbstractC2250861D8a abstractC2250861D8aLIZJ2;
        Object obj;
        Object obj2;
        C2250851D7z c2250851D7z;
        Set<C1D82> set;
        Object obj3;
        Object obj4;
        C1D82 c1d82;
        C2250851D7z c2250851D7z2;
        Set<C1D82> set2;
        Object obj5;
        Object obj6;
        Object obj7;
        this.LIZLLL.LJI(new C556230Lrh(this.LJ.LJIIL, c1435220nS4, c556300Lro));
        if (this.LJ.LJII) {
            this.LIZLLL.LJIIIZ.LJIILLIIL(c1435220nS4, c556300Lro);
            return;
        }
        Iterator<Object> it2 = LIZ().LIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (next instanceof C2250831D7x) {
                if (next != null) {
                    C2250831D7x c2250831D7x = (C2250831D7x) next;
                    Iterator<C1D82> it3 = this.LJ.LIZ.LIZIZ.iterator();
                    while (it3.hasNext()) {
                        Object obj8 = it3.next().LJIIL;
                        Object obj9 = this.LJ.LJIIL;
                        synchronized (c2250831D7x) {
                            C259800zU c259800zU = new C259800zU();
                            c259800zU.element = null;
                            C259800zU c259800zU2 = new C259800zU();
                            c259800zU2.element = null;
                            C259800zU c259800zU3 = new C259800zU();
                            c259800zU3.element = null;
                            c2250831D7x.LIZ.invoke(Boolean.TRUE, new C2250821D7w(obj8, c259800zU, obj9, c259800zU2, c259800zU3));
                            C1D82 c1d822 = (C1D82) c259800zU.element;
                            if (c1d822 != null) {
                                abstractC2250861D8aLIZJ = c1d822.LIZJ();
                            } else {
                                abstractC2250861D8aLIZJ = null;
                            }
                            if ((abstractC2250861D8aLIZJ instanceof C2250911D8f) && (c1d82 = (C1D82) c259800zU.element) != null && (c2250851D7z2 = c1d82.LIZ) != null && (set2 = c2250851D7z2.LIZ) != null && C13LP.LJJJJ((C1D82) c259800zU2.element, set2)) {
                                C1D82 c1d823 = (C1D82) c259800zU2.element;
                                if (c1d823 != null) {
                                    C157K c157k = C157K.LJIIIIZZ;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("WaveDependsOperator: ");
                                    C1D82 c1d824 = (C1D82) c259800zU.element;
                                    if (c1d824 != null) {
                                        obj5 = c1d824.LJIIL;
                                    } else {
                                        obj5 = null;
                                    }
                                    sbLIZ.append(obj5);
                                    sbLIZ.append(" remove depend dynamically: ");
                                    sbLIZ.append(c1d823.LJIIL);
                                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                    c157k.getClass();
                                    C157K.LJFF(strLIZIZ);
                                    if (C13LP.LJJJJ((C1D82) c259800zU.element, c1d823.LIZ.LIZIZ)) {
                                        C1D82 c1d825 = (C1D82) c259800zU.element;
                                        if (c1d825 != null) {
                                            c1d825.LJI(c1d823);
                                        }
                                        c1d823.LIZ.LIZIZ.isEmpty();
                                        C1D82 c1d826 = (C1D82) c259800zU.element;
                                        if (c1d826 != null && c1d826.LJ()) {
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append("WaveDependsOperator: ");
                                            C1D82 c1d827 = (C1D82) c259800zU.element;
                                            if (c1d827 != null) {
                                                obj7 = c1d827.LJIIL;
                                            } else {
                                                obj7 = null;
                                            }
                                            sbLIZ2.append(obj7);
                                            sbLIZ2.append(" is unreachable, virtual end node doesn't depend on it any more");
                                            C157K.LJFF(C2188811AlT.LIZIZ(sbLIZ2));
                                            C1D82 c1d828 = (C1D82) c259800zU3.element;
                                            if (c1d828 != null) {
                                                C2250831D7x.LIZ(c1d828);
                                            }
                                            C157K.LJFF("WaveDependsOperator: try start virtual end when removing depend");
                                            C1D82 c1d829 = (C1D82) c259800zU3.element;
                                            if (c1d829 != null) {
                                                c1d829.LJII();
                                            }
                                        } else {
                                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                            sbLIZ3.append("WaveDependsOperator: try start ");
                                            C1D82 c1d8210 = (C1D82) c259800zU.element;
                                            if (c1d8210 != null) {
                                                obj6 = c1d8210.LJIIL;
                                            } else {
                                                obj6 = null;
                                            }
                                            sbLIZ3.append(obj6);
                                            sbLIZ3.append(" when removing its dependency.");
                                            C157K.LJFF(C2188811AlT.LIZIZ(sbLIZ3));
                                            C1D82 c1d8211 = (C1D82) c259800zU.element;
                                            if (c1d8211 != null) {
                                                c1d8211.LJII();
                                            }
                                        }
                                    }
                                }
                            } else {
                                C1D82 c1d8212 = (C1D82) c259800zU.element;
                                if (c1d8212 != null) {
                                    abstractC2250861D8aLIZJ2 = c1d8212.LIZJ();
                                } else {
                                    abstractC2250861D8aLIZJ2 = null;
                                }
                                if (!(abstractC2250861D8aLIZJ2 instanceof C2250911D8f)) {
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("Can't remove depend because the src node is not new, src tag: ");
                                    C1D82 c1d8213 = (C1D82) c259800zU.element;
                                    if (c1d8213 != null) {
                                        obj3 = c1d8213.LJIIL;
                                    } else {
                                        obj3 = null;
                                    }
                                    sbLIZ4.append(obj3);
                                    sbLIZ4.append(", target tag: ");
                                    C1D82 c1d8214 = (C1D82) c259800zU2.element;
                                    if (c1d8214 != null) {
                                        obj4 = c1d8214.LJIIL;
                                    } else {
                                        obj4 = null;
                                    }
                                    sbLIZ4.append(obj4);
                                    C2250831D7x.LIZIZ(c2250831D7x, C2188811AlT.LIZIZ(sbLIZ4));
                                } else {
                                    C1D82 c1d8215 = (C1D82) c259800zU.element;
                                    if (c1d8215 == null || (c2250851D7z = c1d8215.LIZ) == null || (set = c2250851D7z.LIZ) == null || !C13LP.LJJJJ((C1D82) c259800zU2.element, set)) {
                                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                        sbLIZ5.append("Can't remove depend because the src node hasn't this dependency, src tag: ");
                                        C1D82 c1d8216 = (C1D82) c259800zU.element;
                                        if (c1d8216 != null) {
                                            obj = c1d8216.LJIIL;
                                        } else {
                                            obj = null;
                                        }
                                        sbLIZ5.append(obj);
                                        sbLIZ5.append(", target tag: ");
                                        C1D82 c1d8217 = (C1D82) c259800zU2.element;
                                        if (c1d8217 != null) {
                                            obj2 = c1d8217.LJIIL;
                                        } else {
                                            obj2 = null;
                                        }
                                        sbLIZ5.append(obj2);
                                        C2250831D7x.LIZIZ(c2250831D7x, C2188811AlT.LIZIZ(sbLIZ5));
                                    }
                                }
                            }
                        }
                    }
                    return;
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.wave.core.WaveDependsOperator");
    }

    public final void LJ(Object obj, boolean z, C556300Lro c556300Lro) {
        this.LIZLLL.LJI(new C556250Lrj(this.LJ.LJIIL, obj, z, c556300Lro));
        Iterator<C1D82> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJII();
        }
    }
}
