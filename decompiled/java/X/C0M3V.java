package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M3V, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M3V extends C0M13 {
    public final C561900M2a LIZIZ;
    public C0M3Y LIZJ;
    public final C01GW LIZLLL;

    public final C0M3W LJFF() {
        return (C0M3W) this.LIZLLL.getValue();
    }

    public C0M3V(C561900M2a c561900M2a) {
        super(c561900M2a);
        this.LIZIZ = c561900M2a;
        this.LIZJ = new C0M3Y(EnumC562200M3e.FIRST_SAVE_TIME);
        this.LIZLLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 1106));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [X.0M2a] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.13BV] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.C0M13
    public final void LIZ(List<? extends C561950M2f> list) {
        ?? arrayList;
        boolean z;
        Object objPrevious;
        C0M0P c0m0p;
        C0M0P c0m0p2;
        Object objPrevious2;
        C0M0P c0m0p3;
        C0M3S c0m3s;
        if (list.isEmpty()) {
            return;
        }
        List<C561950M2f> list2 = this.LIZIZ.LLILLJJLI;
        C0M3W c0m3wLJFF = LJFF();
        c0m3wLJFF.getClass();
        if (list.isEmpty()) {
            arrayList = C13BV.INSTANCE;
        } else {
            boolean z2 = true;
            if (c0m3wLJFF.LIZ.LIZ != EnumC562200M3e.FREE_UP_SPACE) {
                arrayList = new ArrayList(c0m3wLJFF.LIZ(list));
                EnumC562160M3a enumC562160M3aLIZ = c0m3wLJFF.LIZ.LIZ();
                if (enumC562160M3aLIZ != EnumC562160M3a.ONLY_TIMELINE && enumC562160M3aLIZ != EnumC562160M3a.BOTH_TIMELINE_AND_BADGE) {
                    z = false;
                } else {
                    z = true;
                }
                EnumC562160M3a enumC562160M3aLIZ2 = c0m3wLJFF.LIZ.LIZ();
                if (enumC562160M3aLIZ2 != EnumC562160M3a.ONLY_BADGE_STYLE && enumC562160M3aLIZ2 != EnumC562160M3a.BOTH_TIMELINE_AND_BADGE) {
                    z2 = false;
                }
                ArrayList arrayList2 = (ArrayList) list2;
                if (!arrayList2.isEmpty() && !arrayList.isEmpty()) {
                    if (z) {
                        ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
                        while (true) {
                            if (listIterator.hasPrevious()) {
                                objPrevious2 = listIterator.previous();
                                if (objPrevious2 instanceof C0M0P) {
                                    break;
                                }
                            } else {
                                objPrevious2 = null;
                                break;
                            }
                        }
                        if ((objPrevious2 instanceof C0M0P) && (c0m0p3 = (C0M0P) objPrevious2) != null) {
                            String str = c0m0p3.LJJIIJZLJL;
                            Object objLJJJJZI = C13LP.LJJJJZI(arrayList);
                            if ((objLJJJJZI instanceof C0M3S) && (c0m3s = (C0M3S) objLJJJJZI) != null && Intrinsics.LJFF(c0m3s.LJ, str)) {
                                C19719612Di.LJJIIZ(arrayList);
                            }
                        }
                    }
                    if (z2) {
                        ListIterator listIterator2 = arrayList2.listIterator(arrayList2.size());
                        while (true) {
                            if (listIterator2.hasPrevious()) {
                                objPrevious = listIterator2.previous();
                                if (objPrevious instanceof C0M0P) {
                                    break;
                                }
                            } else {
                                objPrevious = null;
                                break;
                            }
                        }
                        if ((objPrevious instanceof C0M0P) && (c0m0p = (C0M0P) objPrevious) != null) {
                            Object objLJJJJZI2 = C13LP.LJJJJZI(arrayList);
                            if ((objLJJJJZI2 instanceof C0M0P) && (c0m0p2 = (C0M0P) objLJJJJZI2) != null && C562270M3l.LJIIIIZZ(c0m0p.LIZIZ(), c0m0p2.LIZIZ())) {
                                c0m0p2.LJJII = false;
                            }
                        }
                    }
                }
            } else {
                arrayList = list;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("appendData, newItems size = ");
        sbLIZ.append(list.size());
        sbLIZ.append(", appendItems size = ");
        sbLIZ.append(arrayList.size());
        C201955140j.LIZIZ("DraftBoxTimelineDataManager", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZIZ.LLLFZ(arrayList);
    }

    @Override // X.C0M13
    public final void LIZIZ(List<? extends C561950M2f> list) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return;
        }
        List<C561950M2f> listLIZ = LJFF().LIZ(list);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initData, items size = ");
        sbLIZ.append(arrayList.size());
        sbLIZ.append(", transformedItems size = ");
        sbLIZ.append(listLIZ.size());
        C201955140j.LIZIZ("DraftBoxTimelineDataManager", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZIZ.LLLIILIL(listLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v5, types: [X.13BV] */
    @Override // X.C0M13
    public final void LIZJ(List<C0M0P> list) {
        EnumC562160M3a enumC562160M3aLIZ;
        ?? arrayList;
        int iIntValue;
        int iIntValue2;
        if (list.isEmpty()) {
            return;
        }
        List<C561950M2f> list2 = this.LIZIZ.LLILLJJLI;
        C0M3Y c0m3y = LJFF().LIZ;
        if (c0m3y.LIZ != EnumC562200M3e.FREE_UP_SPACE && ((enumC562160M3aLIZ = c0m3y.LIZ()) == EnumC562160M3a.ONLY_TIMELINE || enumC562160M3aLIZ == EnumC562160M3a.BOTH_TIMELINE_AND_BADGE)) {
            if (list.isEmpty()) {
                arrayList = C13BV.INSTANCE;
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (C561950M2f c561950M2f : (ArrayList) list2) {
                    if (c561950M2f instanceof C0M0P) {
                        String str = ((C0M0P) c561950M2f).LJJIIJZLJL;
                        Integer num = (Integer) linkedHashMap.get(str);
                        if (num != null) {
                            iIntValue2 = num.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        linkedHashMap.put(str, Integer.valueOf(iIntValue2 + 1));
                    }
                }
                Iterator<C0M0P> it2 = list.iterator();
                while (it2.hasNext()) {
                    String str2 = it2.next().LJJIIJZLJL;
                    Integer num2 = (Integer) linkedHashMap.get(str2);
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    linkedHashMap.put(str2, Integer.valueOf(iIntValue - 1));
                }
                arrayList = new ArrayList();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str3 = (String) entry.getKey();
                    if (((Number) entry.getValue()).intValue() <= 0) {
                        arrayList.add(new C0M3S(str3, 1));
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            arrayList2.addAll(arrayList);
            list = arrayList2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeData, removeList size = ");
        sbLIZ.append(list.size());
        C201955140j.LIZIZ("DraftBoxTimelineDataManager", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZIZ.LLLII(list, new C0M3X(C0M3W.LIZIZ));
        C0M3W c0m3wLJFF = LJFF();
        List<C561950M2f> list3 = this.LIZIZ.LLILLJJLI;
        C0M3Y c0m3y2 = c0m3wLJFF.LIZ;
        if (c0m3y2.LIZ != EnumC562200M3e.FREE_UP_SPACE) {
            int i = C0M3Z.LIZ[c0m3y2.LIZ().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new C1954807lC();
                        }
                        return;
                    } else {
                        C0M3U.LIZJ(list3);
                        return;
                    }
                }
                return;
            }
            C0M3U.LIZLLL(list3, (List) c0m3wLJFF.LIZ.LIZLLL.getValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0280 A[SYNTHETIC] */
    @Override // X.C0M13
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.C0M0P r15) {
        /*
            Method dump skipped, instruction units count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0M3V.LIZLLL(X.0M0P):void");
    }

    @Override // X.C0M13
    public final void LJ(EnumC562200M3e enumC562200M3e) {
        this.LIZJ.getClass();
        this.LIZJ = new C0M3Y(enumC562200M3e);
        C0M3W c0m3wLJFF = LJFF();
        C0M3Y c0m3y = this.LIZJ;
        c0m3wLJFF.LIZ = c0m3y;
        C201955140j.LIZIZ("DraftBoxTimelineDataManager", c0m3y.toString());
    }
}
