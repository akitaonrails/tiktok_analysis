package X;

import com.bytedance.mt.protector.impl.string2number.CastShortProtector;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.16D2, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public abstract class C16D2 {
    public EnumC19524111a3 LIZ;

    public abstract EnumC994240byo LIZ(C16DZ c16dz, C16DY c16dy);

    public abstract EnumC994240byo LIZIZ(C16DX c16dx);

    public abstract C16D6 LIZJ();

    public abstract ByteBuffer LIZLLL(C16DG c16dg);

    public abstract List<C16DG> LJ(String str, boolean z);

    public abstract EnumC994310byv LJI();

    public abstract C16DZ LJII(C16DR c16dr);

    public abstract void LJIIIIZZ(C16D0 c16d0, C16DG c16dg);

    public abstract void LJIIJ();

    public abstract List<C16DG> LJIIJJI(ByteBuffer byteBuffer);

    public String toString() {
        return getClass().getSimpleName();
    }

    public static List LJFF(C16D5 c16d5) {
        StringBuilder sb = new StringBuilder(100);
        if (c16d5 instanceof C16DX) {
            sb.append("GET ");
            sb.append(((C16DX) c16d5).LIZJ());
            sb.append(" HTTP/1.1");
        } else if (c16d5 instanceof C16DY) {
            sb.append("HTTP/1.1 101 ");
            sb.append(((C16DY) c16d5).LIZLLL());
        } else {
            throw new IllegalArgumentException("unknown role");
        }
        sb.append("\r\n");
        Iterator<String> itLIZ = c16d5.LIZ();
        while (itLIZ.hasNext()) {
            String next = itLIZ.next();
            String strLJ = c16d5.LJ(next);
            sb.append(next);
            sb.append(": ");
            sb.append(strLJ);
            sb.append("\r\n");
        }
        sb.append("\r\n");
        byte[] bytes = sb.toString().getBytes(StandardCharsets.US_ASCII);
        c16d5.getContent();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(0 + bytes.length);
        byteBufferAllocate.put(bytes);
        byteBufferAllocate.flip();
        return Collections.singletonList(byteBufferAllocate);
    }

    public static String LJIIIZ(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        byte b = 48;
        while (byteBuffer.hasRemaining()) {
            byte b2 = byteBuffer.get();
            byteBufferAllocate.put(b2);
            if (b == 13 && b2 == 10) {
                byteBufferAllocate.limit(byteBufferAllocate.position() - 2);
                byteBufferAllocate.position(0);
                return new String(byteBufferAllocate.array(), 0, byteBufferAllocate.limit(), StandardCharsets.US_ASCII);
            }
            b = b2;
        }
        byteBuffer.position(byteBuffer.position() - byteBufferAllocate.position());
        return null;
    }

    public final C16DT LJIIL(ByteBuffer byteBuffer) {
        C16DT c16dt;
        EnumC19524111a3 enumC19524111a3 = this.LIZ;
        String strLJIIIZ = LJIIIZ(byteBuffer);
        if (strLJIIIZ != null) {
            String[] strArrSplit = strLJIIIZ.split(" ", 3);
            if (strArrSplit.length == 3) {
                if (enumC19524111a3 == EnumC19524111a3.CLIENT) {
                    if ("101".equals(strArrSplit[1])) {
                        if ("HTTP/1.1".equalsIgnoreCase(strArrSplit[0])) {
                            C16DS c16ds = new C16DS();
                            CastShortProtector.parseShort(strArrSplit[1]);
                            c16ds.LIZIZ = strArrSplit[2];
                            c16dt = c16ds;
                        } else {
                            throw new C16DJ(C786410Ut5.j4("Invalid status line received: %s Status line: %s", new Object[]{strArrSplit[0], strLJIIIZ}));
                        }
                    } else {
                        throw new C16DJ(C786410Ut5.j4("Invalid status code received: %s Status line: %s", new Object[]{strArrSplit[1], strLJIIIZ}));
                    }
                } else if ("GET".equalsIgnoreCase(strArrSplit[0])) {
                    if ("HTTP/1.1".equalsIgnoreCase(strArrSplit[2])) {
                        C16DR c16dr = new C16DR();
                        String str = strArrSplit[1];
                        if (str != null) {
                            c16dr.LIZIZ = str;
                            c16dt = c16dr;
                        } else {
                            throw new IllegalArgumentException("http resource descriptor must not be null");
                        }
                    } else {
                        throw new C16DJ(C786410Ut5.j4("Invalid status line received: %s Status line: %s", new Object[]{strArrSplit[2], strLJIIIZ}));
                    }
                } else {
                    throw new C16DJ(C786410Ut5.j4("Invalid request method received: %s Status line: %s", new Object[]{strArrSplit[0], strLJIIIZ}));
                }
                String strLJIIIZ2 = LJIIIZ(byteBuffer);
                while (strLJIIIZ2 != null) {
                    if (strLJIIIZ2.length() > 0) {
                        String[] strArrSplit2 = strLJIIIZ2.split(":", 2);
                        if (strArrSplit2.length == 2) {
                            if (c16dt.LIZIZ(strArrSplit2[0])) {
                                String str2 = strArrSplit2[0];
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(c16dt.LJ(strArrSplit2[0]));
                                sbLIZ.append("; ");
                                sbLIZ.append(strArrSplit2[1].replaceFirst("^ +", ""));
                                c16dt.LJFF(str2, C2188811AlT.LIZIZ(sbLIZ));
                            } else {
                                c16dt.LJFF(strArrSplit2[0], strArrSplit2[1].replaceFirst("^ +", ""));
                            }
                            strLJIIIZ2 = LJIIIZ(byteBuffer);
                        } else {
                            throw new C16DJ("not an http header");
                        }
                    } else {
                        return c16dt;
                    }
                }
                throw new C16DM();
            }
            throw new C16DJ();
        }
        throw new C16DM(byteBuffer.capacity() + 128);
    }
}
