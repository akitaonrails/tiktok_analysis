package X;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.1DbX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2259091DbX {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(ByteBuffer byteBuffer) throws C1722690uvj {
        if (byteBuffer.hasRemaining()) {
            ArrayList arrayList = new ArrayList();
            while (byteBuffer.hasRemaining() && byteBuffer.remaining() >= 4) {
                byte b = (byte) (byteBuffer.get() & 248);
                int i = byteBuffer.get() & 255;
                int i2 = byteBuffer.get() & 255;
                byteBuffer.get();
                arrayList.add(new C2259171Dbf(b, i, i2));
            }
            return arrayList;
        }
        throw new C1722690uvj("Unexpected end of buffer, expected Application File Locator");
    }

    public static C2259161Dbe LIZIZ(ByteBuffer byteBuffer) throws C1722690uvj {
        Object next;
        Iterator it2 = ((ArrayList) C2259071DbV.LIZIZ(byteBuffer)).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((C2259081DbW) next).LIZ == 111) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C2259081DbW c2259081DbW = (C2259081DbW) next;
        if (c2259081DbW != null) {
            byte[] bArrLIZ = null;
            C2259151Dbd c2259151Dbd = null;
            for (C2259081DbW c2259081DbW2 : (ArrayList) C2259071DbV.LIZIZ(c2259081DbW.LIZIZ)) {
                int i = c2259081DbW2.LIZ;
                if (i != 132) {
                    if (i == 165) {
                        ArrayList arrayList = null;
                        C2252841DFq c2252841DFq = null;
                        for (C2259081DbW c2259081DbW3 : (ArrayList) C2259071DbV.LIZIZ(c2259081DbW2.LIZIZ)) {
                            int i2 = c2259081DbW3.LIZ;
                            if (i2 != 40760) {
                                if (i2 == 48908) {
                                    List listLIZIZ = C2259071DbV.LIZIZ(c2259081DbW3.LIZIZ);
                                    ArrayList arrayList2 = new ArrayList();
                                    for (C2259081DbW c2259081DbW4 : (ArrayList) listLIZIZ) {
                                        if (c2259081DbW4.LIZ == 97) {
                                            int i3 = 0;
                                            byte[] bArrLIZ2 = null;
                                            for (C2259081DbW c2259081DbW5 : (ArrayList) C2259071DbV.LIZIZ(c2259081DbW4.LIZIZ)) {
                                                int i4 = c2259081DbW5.LIZ;
                                                if (i4 != 79) {
                                                    if (i4 == 135) {
                                                        i3 = c2259081DbW5.LIZIZ.get(0) & 15;
                                                    }
                                                } else {
                                                    bArrLIZ2 = C1COD.LIZ(c2259081DbW5.LIZIZ);
                                                }
                                            }
                                            arrayList2.add(new C2252831DFp(bArrLIZ2, i3));
                                        }
                                    }
                                    C08XD.LJIL(arrayList2);
                                    c2252841DFq = new C2252841DFq(arrayList2);
                                }
                            } else {
                                ByteBuffer byteBuffer2 = c2259081DbW3.LIZIZ;
                                arrayList = new ArrayList();
                                while (byteBuffer2.hasRemaining()) {
                                    arrayList.add(new C2259181Dbg(C2259071DbV.LIZJ(byteBuffer2), C2259071DbV.LIZ(byteBuffer2)));
                                }
                                if (arrayList.isEmpty()) {
                                    arrayList = null;
                                }
                            }
                        }
                        c2259151Dbd = new C2259151Dbd(arrayList, c2252841DFq);
                    }
                } else {
                    bArrLIZ = C1COD.LIZ(c2259081DbW2.LIZIZ);
                }
            }
            return new C2259161Dbe(bArrLIZ, c2259151Dbd);
        }
        throw new C1722690uvj("FCI not found");
    }

    public static C2259191Dbh LIZJ(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        String strLIZ = C13ER.LIZ(bArr);
        int iLJJIZ = a0.LJJIZ(strLIZ, 'D', 0, false, 6);
        String strSubstring = null;
        if (iLJJIZ == -1) {
            return new C2259191Dbh(null, null);
        }
        String strSubstring2 = strLIZ.substring(0, iLJJIZ);
        int i = iLJJIZ + 5;
        if (i <= strLIZ.length()) {
            strSubstring = strLIZ.substring(iLJJIZ + 1, i);
        }
        return new C2259191Dbh(strSubstring2, strSubstring);
    }
}
