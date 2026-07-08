package X;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: X.08Qz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2116708Qz {
    public final ByteArrayOutputStream LIZ;
    public final C08R0 LIZIZ;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.08R0] */
    public C2116708Qz() {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.LIZ = byteArrayOutputStream;
        this.LIZIZ = new DataOutputStream(byteArrayOutputStream) { // from class: X.08R0
        };
    }

    public final void LIZ(ArrayList<Object> arrayList) throws IOException {
        writeInt(2);
        if (arrayList == null) {
            writeInt(0);
            return;
        }
        writeInt(arrayList.size());
        Iterator<Object> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            LIZJ(it2.next());
        }
    }

    public final void LIZIZ(HashMap<String, Object> map) throws IOException {
        writeInt(1);
        if (map == null) {
            writeInt(0);
            return;
        }
        writeInt(map.size());
        for (String str : map.keySet()) {
            C08R0 c08r0 = this.LIZIZ;
            c08r0.getClass();
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            c08r0.writeInt(bytes.length);
            c08r0.write(bytes, 0, bytes.length);
            LIZJ(map.get(str));
        }
    }

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
    public final void LIZJ(Object obj) throws IOException {
        if (obj == null) {
            writeInt(0);
            return;
        }
        if (obj instanceof Boolean) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            writeInt(3);
            writeByte(zBooleanValue ? 1 : 0);
            return;
        }
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            writeInt(4);
            writeInt(iIntValue);
            return;
        }
        if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            writeInt(5);
            writeLong(jLongValue);
            return;
        }
        if (obj instanceof Number) {
            double dDoubleValue = ((Number) obj).doubleValue();
            writeInt(6);
            writeDouble(dDoubleValue);
            return;
        }
        if (obj instanceof String) {
            writeInt(7);
            C08R0 c08r0 = this.LIZIZ;
            c08r0.getClass();
            byte[] bytes = ((String) obj).getBytes(StandardCharsets.UTF_8);
            c08r0.writeInt(bytes.length);
            c08r0.write(bytes, 0, bytes.length);
            return;
        }
        if (obj instanceof ArrayList) {
            LIZ((ArrayList) obj);
        } else if (obj instanceof HashMap) {
            LIZIZ((HashMap) obj);
        } else {
            writeInt(0);
        }
    }
}
