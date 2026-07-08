package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0t8f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1653830t8f {
    public static void LIZ(C539960LFq c539960LFq, C1652290t6B c1652290t6B, C1647120sxq c1647120sxq) {
        EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
        C1653950t8r.LIZ.clear();
        C0LEK c0lek = c539960LFq.LIZ;
        C559610Lx9 c559610Lx9 = new C559610Lx9(c0lek, "shoot_mode_switch");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register component ");
        sbLIZ.append(C1653850t8h.class.getName());
        sbLIZ.append(" api ");
        sbLIZ.append(InterfaceC1653800t8c.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c0lek.LIZ("shoot_mode_switch", enumC1642750sqn, null, InterfaceC1653800t8c.class, C1653850t8h.class, new AwS391S0200000_25(new C0ET4(), c559610Lx9, (C19A3) c1652290t6B, 370));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<C1654080t94> it2 = c1647120sxq.LIZ.LIZ.LIZ.iterator();
        while (it2.hasNext()) {
            Iterator<C1657380tEO> it3 = it2.next().LIZJ.iterator();
            while (it3.hasNext()) {
                linkedHashSet.add(it3.next().LIZIZ);
            }
        }
        EnumC1653870t8j enumC1653870t8j = EnumC1653870t8j.STORY;
        if (linkedHashSet.contains(enumC1653870t8j)) {
            InterfaceC1654170t9D interfaceC1654170t9D = new InterfaceC1654170t9D() { // from class: X.0t8u
                public boolean LIZ = false;

                @Override // X.InterfaceC1654170t9D
                public final C1170704i1 LIZIZ() {
                    return null;
                }

                @Override // X.InterfaceC1654170t9D
                public final void LJIIL() {
                }

                @Override // X.InterfaceC1654170t9D
                public final String LIZ() {
                    return C0MTD.LIZ(EnumC1653870t8j.STORY.getNameResId());
                }

                @Override // X.InterfaceC1654170t9D
                public final EnumC1653870t8j LJIIJJI() {
                    return EnumC1653870t8j.STORY;
                }

                @Override // X.InterfaceC1654170t9D
                public final boolean isDefault() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC1654170t9D
                public final void LIZJ(boolean z) {
                    this.LIZ = z;
                }
            };
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("register component ");
            sbLIZ2.append(C1648740t0S.class.getName());
            sbLIZ2.append(" api ");
            sbLIZ2.append(InterfaceC1648780t0W.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            c559610Lx9.LIZ.LIZ(c559610Lx9.LIZIZ, enumC1642750sqn, null, InterfaceC1648780t0W.class, C1648740t0S.class, new AwS604S0100000_25(new C0ET4(), c559610Lx9, 863));
            C1653950t8r.LIZ.put(enumC1653870t8j, interfaceC1654170t9D);
        }
        EnumC1653870t8j enumC1653870t8j2 = EnumC1653870t8j.REVEAL;
        if (linkedHashSet.contains(enumC1653870t8j2)) {
            InterfaceC1654170t9D interfaceC1654170t9D2 = new InterfaceC1654170t9D() { // from class: X.0t8t
                public boolean LIZ;
                public final boolean LIZIZ = !C12866051s.LIZ("reveal_story_guide_camera_tab_tooltip_shown");

                @Override // X.InterfaceC1654170t9D
                public final void LJIIL() {
                }

                @Override // X.InterfaceC1654170t9D
                public final String LIZ() {
                    return C0MTD.LIZ(EnumC1653870t8j.REVEAL.getNameResId());
                }

                @Override // X.InterfaceC1654170t9D
                public final C1170704i1 LIZIZ() {
                    if (this.LIZIZ) {
                        return new C1170704i1(C0MTD.LIZ(2131849080));
                    }
                    return null;
                }

                @Override // X.InterfaceC1654170t9D
                public final EnumC1653870t8j LJIIJJI() {
                    return EnumC1653870t8j.REVEAL;
                }

                @Override // X.InterfaceC1654170t9D
                public final boolean isDefault() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC1654170t9D
                public final void LIZJ(boolean z) {
                    this.LIZ = z;
                }
            };
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("register component ");
            sbLIZ3.append(C1648790t0X.class.getName());
            sbLIZ3.append(" api ");
            sbLIZ3.append(InterfaceC1648810t0Z.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
            c559610Lx9.LIZ.LIZ(c559610Lx9.LIZIZ, enumC1642750sqn, null, InterfaceC1648810t0Z.class, C1648790t0X.class, new AwS604S0100000_25(new C0ET4(), c559610Lx9, 867));
            C1653950t8r.LIZ.put(enumC1653870t8j2, interfaceC1654170t9D2);
        }
        for (C1654080t94 c1654080t94 : c1647120sxq.LIZ.LIZ.LIZ) {
            HashMap<EnumC1653890t8l, InterfaceC1654200t9G> map = C1653950t8r.LIZIZ;
            EnumC1653890t8l enumC1653890t8l = c1654080t94.LIZIZ;
            if (C1653880t8k.LIZ[enumC1653890t8l.ordinal()] == 1) {
                final InterfaceC1654170t9D interfaceC1654170t9D3 = C1653950t8r.LIZ.get(((C1657380tEO) c1654080t94.LJ.getValue()).LIZIZ);
                if (interfaceC1654170t9D3 != null) {
                    map.put(enumC1653890t8l, new InterfaceC1654200t9G(interfaceC1654170t9D3) { // from class: X.0t8s
                        public final InterfaceC1654170t9D LIZ;

                        @Override // X.InterfaceC1654200t9G
                        public final void LJIIL() {
                        }

                        @Override // X.InterfaceC1654200t9G
                        public final String LIZ() {
                            return C0MTD.LIZ(EnumC1653890t8l.STORY.getNameResId());
                        }

                        @Override // X.InterfaceC1654200t9G
                        public final EnumC1653890t8l LJIIJJI() {
                            return EnumC1653890t8l.STORY;
                        }

                        @Override // X.InterfaceC1654200t9G
                        public final InterfaceC1654170t9D LJIILIIL() {
                            return this.LIZ;
                        }

                        {
                            this.LIZ = interfaceC1654170t9D3;
                        }
                    });
                } else {
                    throw new IllegalStateException("top camera mode must exist");
                }
            } else {
                throw new C1954807lC();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C539960LFq r11, X.C1652290t6B r12, X.C1647120sxq r13) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1653830t8f.LIZIZ(X.0LFq, X.0t6B, X.0sxq):void");
    }
}
