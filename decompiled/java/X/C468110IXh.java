package X;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0IXh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C468110IXh implements InterfaceC468140IXk {
    public static volatile C468110IXh LIZIZ;
    public final Map<String, InterfaceC468130IXj> LIZ;

    public C468110IXh() {
        HashMap map = new HashMap();
        this.LIZ = map;
        map.put("new_style", new InterfaceC468130IXj() { // from class: X.0IUk
            /* JADX WARN: Code restructure failed: missing block: B:63:0x0174, code lost:
            
                if (r13 != null) goto L64;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:95:0x0291  */
            /* JADX WARN: Removed duplicated region for block: B:97:0x0295  */
            /* JADX WARN: Type inference failed for: r3v27, types: [X.0IUX, X.0IVA] */
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
            @Override // X.InterfaceC468130IXj
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LIZ(final java.util.Map<java.lang.String, java.lang.String> r33) {
                /*
                    Method dump skipped, instruction units count: 1305
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C467360IUk.LIZ(java.util.Map):boolean");
            }
        });
    }

    public final boolean LIZ(Map<String, String> map) {
        Set setKeySet = ((HashMap) this.LIZ).keySet();
        if (C086I.LIZIZ(setKeySet)) {
            return false;
        }
        String strRemove = map.remove("intercept");
        if (C2093608Ic.LJ(strRemove) || !setKeySet.contains(strRemove) || ((HashMap) this.LIZ).get(strRemove) == null) {
            return false;
        }
        return ((InterfaceC468130IXj) ((HashMap) this.LIZ).get(strRemove)).LIZ(map);
    }
}
