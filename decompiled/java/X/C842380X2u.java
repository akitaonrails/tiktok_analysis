package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: renamed from: X.0X2u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C842380X2u implements Serializable {
    public static final char[] LLILLL = "0123456789ABCDEF".toCharArray();
    public static final long serialVersionUID = 6374381323722046732L;
    public transient C842390X2v LL;
    public long LLILLJJLI = System.currentTimeMillis();

    public String encode() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new ObjectOutputStream(byteArrayOutputStream).writeObject(this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            char[] cArr = new char[byteArray.length * 2];
            for (int i = 0; i < byteArray.length; i++) {
                int i2 = byteArray[i] & 255;
                int i3 = i * 2;
                char[] cArr2 = LLILLL;
                cArr[i3] = cArr2[i2 >>> 4];
                cArr[i3 + 1] = cArr2[i2 & 15];
            }
            return new String(cArr);
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public Long getWhenCreated() {
        return Long.valueOf(this.LLILLJJLI);
    }

    public boolean hasExpired() {
        long j = this.LL.LLILZIL;
        return j != -1 && (System.currentTimeMillis() - this.LLILLJJLI) / 1000 > j;
    }

    public int hashCode() {
        return this.LL.hashCode();
    }

    public C842390X2v getHttpCookie() {
        return this.LL;
    }

    public C842380X2u(C842390X2v c842390X2v) {
        this.LL = c842390X2v;
    }

    public static C842380X2u decode(String str) {
        if (str != null && !str.isEmpty()) {
            int length = str.length();
            byte[] bArr = new byte[length / 2];
            for (int i = 0; i < length; i += 2) {
                bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
            }
            final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                final Class[] clsArr = {C842380X2u.class};
                return (C842380X2u) new ObjectInputStream(byteArrayInputStream, clsArr) { // from class: X.09eX
                    public final Set<String> LL = new HashSet();

                    @Override // java.io.ObjectInputStream
                    public final Class<?> resolveClass(ObjectStreamClass objectStreamClass) {
                        if (objectStreamClass != null && objectStreamClass.getName() != null) {
                            String name = objectStreamClass.getName();
                            if (((HashSet) this.LL).contains(name)) {
                                return super.resolveClass(objectStreamClass);
                            }
                            return Class.forName(name, true, ClassLoader.getSystemClassLoader().getParent());
                        }
                        return super.resolveClass(objectStreamClass);
                    }

                    {
                        for (Class<?> cls : clsArr) {
                            ((HashSet) this.LL).add(cls.getName());
                        }
                    }
                }.readObject();
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (ClassNotFoundException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return null;
            }
        }
        return null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        String lowerCase;
        C842390X2v c842390X2v = new C842390X2v((String) objectInputStream.readObject(), (String) objectInputStream.readObject());
        this.LL = c842390X2v;
        c842390X2v.LL = (String) objectInputStream.readObject();
        this.LL.LLILLJJLI = (String) objectInputStream.readObject();
        C842390X2v c842390X2v2 = this.LL;
        String str = (String) objectInputStream.readObject();
        if (str == null) {
            lowerCase = null;
        } else {
            c842390X2v2.getClass();
            lowerCase = str.toLowerCase(Locale.US);
        }
        c842390X2v2.LLILZ = lowerCase;
        this.LL.LLILZIL = objectInputStream.readLong();
        this.LL.LLIZ = (String) objectInputStream.readObject();
        this.LL.LLIZLLLIL = (String) objectInputStream.readObject();
        C842390X2v c842390X2v3 = this.LL;
        int i = objectInputStream.readInt();
        c842390X2v3.getClass();
        if (i != 0 && i != 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Bad version: ");
            sbLIZ.append(i);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        c842390X2v3.LLJILJIL = i;
        this.LL.LLJ = objectInputStream.readBoolean();
        this.LL.LLILLL = objectInputStream.readBoolean();
        this.LL.LLJI = objectInputStream.readBoolean();
        this.LLILLJJLI = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.LL.LLILZLL);
        objectOutputStream.writeObject(this.LL.LLJIJIL);
        objectOutputStream.writeObject(this.LL.LL);
        objectOutputStream.writeObject(this.LL.LLILLJJLI);
        objectOutputStream.writeObject(this.LL.LLILZ);
        objectOutputStream.writeLong(this.LL.LLILZIL);
        objectOutputStream.writeObject(this.LL.LLIZ);
        objectOutputStream.writeObject(this.LL.LLIZLLLIL);
        objectOutputStream.writeInt(this.LL.LLJILJIL);
        objectOutputStream.writeBoolean(this.LL.LLJ);
        objectOutputStream.writeBoolean(this.LL.LLILLL);
        objectOutputStream.writeBoolean(this.LL.LLJI);
        objectOutputStream.writeLong(this.LLILLJJLI);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C842390X2v) {
            return this.LL.equals(obj);
        }
        if (obj instanceof C842380X2u) {
            return this.LL.equals(((C842380X2u) obj).LL);
        }
        return false;
    }

    public static int getEffectivePort(String str, int i) {
        if (i != -1) {
            return i;
        }
        if ("http".equalsIgnoreCase(str)) {
            return 80;
        }
        if (!"https".equalsIgnoreCase(str)) {
            return -1;
        }
        return 443;
    }
}
