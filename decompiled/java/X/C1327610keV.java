package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: renamed from: X.0keV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1327610keV implements InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>> {
    public final InterfaceC1325150kaX<InterfaceC1324680kZm, AbstractC1327750kej> LIZ;
    public final C1325170kaZ LIZIZ;
    public final InterfaceC1325590kbF LIZJ;
    public final InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>> LIZLLL;
    public boolean LJ;

    public String LIZJ() {
        return "BitmapMemoryCacheProducer";
    }

    @Override // X.InterfaceC1327390ke9
    public final void LIZIZ(InterfaceC1328020kfA<C1323050kX9<AbstractC1327750kej>> interfaceC1328020kfA, InterfaceC1327930kf1 interfaceC1327930kf1) {
        C1323050kX9<AbstractC1327750kej> c1323050kX9;
        Map<String, String> mapOf;
        int i;
        Map<String, String> mapOf2;
        C1325170kaZ c1325170kaZ;
        try {
            C1336010ks3.LIZIZ();
            InterfaceC1325690kbP interfaceC1325690kbPLIZ = interfaceC1327930kf1.LIZ();
            String id = interfaceC1327930kf1.getId();
            interfaceC1325690kbPLIZ.LJI(id, LIZJ());
            C1325710kbR c1325710kbRLJFF = interfaceC1327930kf1.LJFF();
            Object objLIZJ = interfaceC1327930kf1.LIZJ();
            InterfaceC1291910jiv interfaceC1291910jiv = c1325710kbRLJFF.LJIJJ;
            if (interfaceC1291910jiv != null) {
                this.LJ = "SRPostProcessor".equalsIgnoreCase(interfaceC1291910jiv.getName());
            } else {
                this.LJ = false;
            }
            InterfaceC1324680kZm interfaceC1324680kZmLIZJ = C1324660kZk.LIZJ(this.LIZJ.LIZJ(c1325710kbRLJFF, objLIZJ));
            Map<String, String> mapOf3 = null;
            if (!C1328130kfL.LJIILIIL().LJJIIJ || (c1325170kaZ = this.LIZIZ) == null || (c1323050kX9 = c1325170kaZ.get(interfaceC1324680kZmLIZJ)) == null) {
                c1323050kX9 = this.LIZ.get(interfaceC1324680kZmLIZJ);
            }
            if (c1323050kX9 != null) {
                if (((C1328060kfE) c1323050kX9.get().getQualityInfo()).LIZJ && !c1323050kX9.get().isThumbCache) {
                    i = 1;
                    String strLIZJ = LIZJ();
                    if (interfaceC1325690kbPLIZ.LJIIJ(id)) {
                        mapOf2 = C19871212ow.of("cached_value_found", "true");
                    } else {
                        mapOf2 = null;
                    }
                    interfaceC1325690kbPLIZ.LIZIZ(id, strLIZJ, mapOf2);
                    interfaceC1325690kbPLIZ.LJIIIZ(id, LIZJ(), true);
                    interfaceC1328020kfA.LIZ(1.0f);
                } else {
                    i = 0;
                }
                interfaceC1328020kfA.LIZJ(i, c1323050kX9);
                c1323050kX9.close();
                if (i != 0) {
                    C1336010ks3.LIZIZ();
                    return;
                }
            }
            if (interfaceC1327930kf1.LIZIZ().getValue() >= EnumC1320950kTl.BITMAP_MEMORY_CACHE.getValue()) {
                String strLIZJ2 = LIZJ();
                if (interfaceC1325690kbPLIZ.LJIIJ(id)) {
                    mapOf = C19871212ow.of("cached_value_found", "false");
                } else {
                    mapOf = null;
                }
                interfaceC1325690kbPLIZ.LIZIZ(id, strLIZJ2, mapOf);
                interfaceC1325690kbPLIZ.LJIIIZ(id, LIZJ(), false);
                interfaceC1328020kfA.LIZJ(1, null);
                C1336010ks3.LIZIZ();
                return;
            }
            InterfaceC1328020kfA<C1323050kX9<AbstractC1327750kej>> interfaceC1328020kfALIZLLL = LIZLLL(interfaceC1328020kfA, interfaceC1324680kZmLIZJ, interfaceC1327930kf1.LJFF().LJIJI);
            String strLIZJ3 = LIZJ();
            if (interfaceC1325690kbPLIZ.LJIIJ(id)) {
                mapOf3 = C19871212ow.of("cached_value_found", "false");
            }
            interfaceC1325690kbPLIZ.LIZIZ(id, strLIZJ3, mapOf3);
            C1336010ks3.LIZIZ();
            this.LIZLLL.LIZIZ(interfaceC1328020kfALIZLLL, interfaceC1327930kf1);
            C1336010ks3.LIZIZ();
            C1336010ks3.LIZIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1336010ks3.LIZIZ();
            throw th;
        }
    }

    public C1327610keV(InterfaceC1325150kaX<InterfaceC1324680kZm, AbstractC1327750kej> interfaceC1325150kaX, InterfaceC1325590kbF interfaceC1325590kbF, InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>> interfaceC1327390ke9) {
        C1325170kaZ<InterfaceC1324680kZm, AbstractC1327750kej> c1325170kaZLJFF;
        this.LIZ = interfaceC1325150kaX;
        if (C1328130kfL.LJIILIIL().LJJIIJ) {
            c1325170kaZLJFF = C1328130kfL.LJIILIIL().LJFF();
        } else {
            c1325170kaZLJFF = null;
        }
        this.LIZIZ = c1325170kaZLJFF;
        this.LIZJ = interfaceC1325590kbF;
        this.LIZLLL = interfaceC1327390ke9;
    }

    public InterfaceC1328020kfA<C1323050kX9<AbstractC1327750kej>> LIZLLL(final InterfaceC1328020kfA<C1323050kX9<AbstractC1327750kej>> interfaceC1328020kfA, final InterfaceC1324680kZm interfaceC1324680kZm, final boolean z) {
        return new AbstractC1328840kgU<C1323050kX9<AbstractC1327750kej>, C1323050kX9<AbstractC1327750kej>>(interfaceC1328020kfA) { // from class: X.0keZ
            /* JADX WARN: Removed duplicated region for block: B:32:0x0089 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:3:0x0002, B:6:0x000e, B:7:0x0015, B:9:0x0021, B:12:0x002b, B:14:0x0039, B:16:0x003f, B:31:0x0086, B:26:0x007a, B:29:0x0082, B:30:0x0085, B:18:0x0045, B:32:0x0089, B:34:0x008d, B:36:0x0093, B:38:0x0097, B:40:0x00a4, B:42:0x00aa, B:44:0x00bf, B:46:0x00c5, B:47:0x00cc, B:54:0x00e7, B:57:0x00ef, B:58:0x00f2, B:59:0x00f3, B:49:0x00d8, B:50:0x00df, B:53:0x00e4, B:20:0x004f, B:22:0x006a, B:25:0x0075), top: B:68:0x0002, inners: #0, #2 }] */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00cc A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:3:0x0002, B:6:0x000e, B:7:0x0015, B:9:0x0021, B:12:0x002b, B:14:0x0039, B:16:0x003f, B:31:0x0086, B:26:0x007a, B:29:0x0082, B:30:0x0085, B:18:0x0045, B:32:0x0089, B:34:0x008d, B:36:0x0093, B:38:0x0097, B:40:0x00a4, B:42:0x00aa, B:44:0x00bf, B:46:0x00c5, B:47:0x00cc, B:54:0x00e7, B:57:0x00ef, B:58:0x00f2, B:59:0x00f3, B:49:0x00d8, B:50:0x00df, B:53:0x00e4, B:20:0x004f, B:22:0x006a, B:25:0x0075), top: B:68:0x0002, inners: #0, #2 }] */
            /* JADX WARN: Removed duplicated region for block: B:52:0x00e3  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x00d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.AbstractC1327820keq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJII(int r7, java.lang.Object r8) {
                /*
                    Method dump skipped, instruction units count: 260
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1327650keZ.LJII(int, java.lang.Object):void");
            }
        };
    }
}
