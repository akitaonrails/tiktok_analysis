package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0VIa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C795380VIa {
    public static final C795380VIa LIZIZ;
    public final Map<String, Object> LIZ;

    static {
        C0VI8.LIZIZ("Data");
        LIZIZ = new C795410VId().LIZ();
    }

    public final long LIZIZ() {
        Object obj = ((HashMap) this.LIZ).get("scheduled_timestamp");
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        return 0L;
    }

    public final int hashCode() {
        return this.LIZ.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.LIZ.isEmpty()) {
            for (String str : this.LIZ.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = this.LIZ.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public C795380VIa() {
    }

    public C795380VIa(C795380VIa c795380VIa) {
        this.LIZ = new HashMap(c795380VIa.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0052 -> B:31:0x0055). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C795380VIa LIZ(byte[] r6) throws java.lang.Throwable {
        /*
            int r1 = r6.length
            r0 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r0) goto L72
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
            r4.<init>(r6)
            r2 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3c java.lang.ClassNotFoundException -> L3e
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3c java.lang.ClassNotFoundException -> L3e
            int r2 = r3.readInt()     // Catch: java.lang.ClassNotFoundException -> L35 java.io.IOException -> L37 java.lang.Throwable -> L5b
        L19:
            if (r2 <= 0) goto L29
            java.lang.String r1 = r3.readUTF()     // Catch: java.lang.ClassNotFoundException -> L35 java.io.IOException -> L37 java.lang.Throwable -> L5b
            java.lang.Object r0 = r3.readObject()     // Catch: java.lang.ClassNotFoundException -> L35 java.io.IOException -> L37 java.lang.Throwable -> L5b
            r5.put(r1, r0)     // Catch: java.lang.ClassNotFoundException -> L35 java.io.IOException -> L37 java.lang.Throwable -> L5b
            int r2 = r2 + (-1)
            goto L19
        L29:
            r3.close()     // Catch: java.io.IOException -> L2d
            goto L31
        L2d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L31:
            r4.close()     // Catch: java.io.IOException -> L51
            goto L55
        L35:
            r0 = move-exception
            goto L40
        L37:
            r0 = move-exception
            goto L40
        L39:
            r1 = move-exception
            r3 = r2
            goto L5c
        L3c:
            r0 = move-exception
            goto L3f
        L3e:
            r0 = move-exception
        L3f:
            r3 = r2
        L40:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L5b
            if (r3 == 0) goto L4d
            r3.close()     // Catch: java.io.IOException -> L49
            goto L4d
        L49:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4d:
            r4.close()     // Catch: java.io.IOException -> L51
            goto L55
        L51:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L55:
            X.0VIa r0 = new X.0VIa
            r0.<init>(r5)
            return r0
        L5b:
            r1 = move-exception
        L5c:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L5b
            if (r3 == 0) goto L69
            r3.close()     // Catch: java.io.IOException -> L65
            goto L69
        L65:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L69:
            r4.close()     // Catch: java.io.IOException -> L6d
            throw r1
        L6d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r1
        L72:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C795380VIa.LIZ(byte[]):X.0VIa");
    }

    public static byte[] LIZLLL(C795380VIa c795380VIa) throws IOException {
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            objectOutputStream.writeInt(((HashMap) c795380VIa.LIZ).size());
            for (Map.Entry entry : ((HashMap) c795380VIa.LIZ).entrySet()) {
                objectOutputStream.writeUTF((String) entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException e4) {
            e = e4;
            objectOutputStream2 = objectOutputStream;
            TryCatchGuardChecker.doCheck(e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e5) {
                    TryCatchGuardChecker.doCheck(e5);
                }
            }
            try {
                byteArrayOutputStream.close();
                return byteArray;
            } catch (IOException e6) {
                TryCatchGuardChecker.doCheck(e6);
                return byteArray;
            }
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            TryCatchGuardChecker.doCheck(th);
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e7) {
                    TryCatchGuardChecker.doCheck(e7);
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException e8) {
                TryCatchGuardChecker.doCheck(e8);
                throw th;
            }
        }
    }

    public final String LIZJ(String str) {
        Object obj = ((HashMap) this.LIZ).get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (obj == null || C795380VIa.class != obj.getClass()) {
            return false;
        }
        C795380VIa c795380VIa = (C795380VIa) obj;
        Set<String> setKeySet = this.LIZ.keySet();
        if (!setKeySet.equals(c795380VIa.LIZ.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            Object obj2 = this.LIZ.get(str);
            Object obj3 = c795380VIa.LIZ.get(str);
            if (obj2 != null) {
                if (obj3 != null) {
                    if ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) {
                        zEquals = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                    } else {
                        zEquals = obj2.equals(obj3);
                    }
                    if (!zEquals) {
                    }
                }
                return false;
            }
            if (obj2 != obj3) {
                return false;
            }
        }
        return true;
    }

    public C795380VIa(Map<String, ?> map) {
        this.LIZ = new HashMap(map);
    }
}
