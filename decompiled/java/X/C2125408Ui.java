package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: X.08Ui, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2125408Ui {
    public static final byte[] LIZ = {112, 114, 111, 0};
    public static final byte[] LIZIZ = {112, 114, 109, 0};

    public static byte[] LIZ(C2125508Uj[] c2125508UjArr, byte[] bArr) throws IOException {
        int i = 0;
        int length = 0;
        for (C2125508Uj c2125508Uj : c2125508UjArr) {
            length += LIZIZ(c2125508Uj.LIZ, c2125508Uj.LIZIZ, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + (c2125508Uj.LJ * 2) + c2125508Uj.LJFF + (((((c2125508Uj.LJI * 2) + 8) - 1) & (-8)) / 8);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, C2125008Ue.LIZJ)) {
            int length2 = c2125508UjArr.length;
            while (i < length2) {
                C2125508Uj c2125508Uj2 = c2125508UjArr[i];
                LJIIL(byteArrayOutputStream, c2125508Uj2, LIZIZ(c2125508Uj2.LIZ, c2125508Uj2.LIZIZ, bArr));
                LJIIJJI(byteArrayOutputStream, c2125508Uj2);
                i++;
            }
        } else {
            for (C2125508Uj c2125508Uj3 : c2125508UjArr) {
                LJIIL(byteArrayOutputStream, c2125508Uj3, LIZIZ(c2125508Uj3.LIZ, c2125508Uj3.LIZIZ, bArr));
            }
            int length3 = c2125508UjArr.length;
            while (i < length3) {
                LJIIJJI(byteArrayOutputStream, c2125508UjArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("The bytes saved do not match expectation. actual=");
        sbLIZ.append(byteArrayOutputStream.size());
        sbLIZ.append(" expected=");
        sbLIZ.append(length);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static int[] LIZLLL(InputStream inputStream, int i) {
        int[] iArr = new int[i];
        int iLJ = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iLJ += C2125808Um.LJ(inputStream);
            iArr[i2] = iLJ;
        }
        return iArr;
    }

    public static void LJIIJ(OutputStream outputStream, C2125508Uj c2125508Uj) throws IOException {
        int iIntValue = 0;
        for (int i : c2125508Uj.LJII) {
            Integer numValueOf = Integer.valueOf(i);
            C2125808Um.LJI(outputStream, numValueOf.intValue() - iIntValue);
            iIntValue = numValueOf.intValue();
        }
    }

    public static void LJIIJJI(OutputStream outputStream, C2125508Uj c2125508Uj) throws IOException {
        LJIILJJIL(outputStream, c2125508Uj);
        LJIIJ(outputStream, c2125508Uj);
        byte[] bArr = new byte[((((c2125508Uj.LJI * 2) + 8) - 1) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : c2125508Uj.LJIIIIZZ.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            if ((iIntValue2 & 2) != 0) {
                int iLIZJ = LIZJ(2, iIntValue, c2125508Uj.LJI);
                int i = iLIZJ / 8;
                bArr[i] = (byte) ((1 << (iLIZJ % 8)) | bArr[i]);
            }
            if ((iIntValue2 & 4) != 0) {
                int iLIZJ2 = LIZJ(4, iIntValue, c2125508Uj.LJI);
                int i2 = iLIZJ2 / 8;
                bArr[i2] = (byte) ((1 << (iLIZJ2 % 8)) | bArr[i2]);
            }
        }
        outputStream.write(bArr);
    }

    public static void LJIILJJIL(OutputStream outputStream, C2125508Uj c2125508Uj) throws IOException {
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : c2125508Uj.LJIIIIZZ.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                C2125808Um.LJI(outputStream, iIntValue - i);
                C2125808Um.LJI(outputStream, 0);
                i = iIntValue;
            }
        }
    }

    public static String LIZIZ(String str, String str2, byte[] bArr) {
        Object obj;
        byte[] bArr2 = C2125008Ue.LJ;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = C2125008Ue.LIZLLL;
        String str3 = "!";
        if (!zEquals && !Arrays.equals(bArr, bArr3)) {
            obj = "!";
        } else {
            obj = ":";
        }
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (!":".equals(obj)) {
                return str2;
            }
            return str2.replace("!", ":");
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (!str2.contains("!") && !str2.contains(":")) {
            if (str2.endsWith(".apk")) {
                return str2;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) {
                str3 = ":";
            }
            sbLIZ.append(str3);
            sbLIZ.append(str2);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if ("!".equals(obj)) {
            return str2.replace(":", "!");
        }
        if (!":".equals(obj)) {
            return str2;
        }
        return str2.replace("!", ":");
    }

    public static int LIZJ(int i, int i2, int i3) {
        if (i != 1) {
            if (i != 2) {
                if (i == 4) {
                    return i2 + i3;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unexpected flag: ");
                sbLIZ.append(i);
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }
            return i2;
        }
        throw new IllegalStateException("HOT methods are not stored in the bitmap");
    }

    public static C2125508Uj[] LJFF(InputStream inputStream, int i, C2125508Uj[] c2125508UjArr) {
        if (inputStream.available() == 0) {
            return new C2125508Uj[0];
        }
        if (i == c2125508UjArr.length) {
            String[] strArr = new String[i];
            int[] iArr = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                int iLJ = C2125808Um.LJ(inputStream);
                iArr[i2] = C2125808Um.LJ(inputStream);
                strArr[i2] = new String(C2125808Um.LIZIZ(inputStream, iLJ), StandardCharsets.UTF_8);
            }
            for (int i3 = 0; i3 < i; i3++) {
                C2125508Uj c2125508Uj = c2125508UjArr[i3];
                if (c2125508Uj.LIZIZ.equals(strArr[i3])) {
                    int i4 = iArr[i3];
                    c2125508Uj.LJ = i4;
                    c2125508Uj.LJII = LIZLLL(inputStream, i4);
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return c2125508UjArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static C2125508Uj[] LJII(InputStream inputStream, byte[] bArr, String str) throws IOException {
        if (Arrays.equals(bArr, C2125008Ue.LIZIZ)) {
            int iLIZLLL = (int) C2125808Um.LIZLLL(inputStream, 1);
            byte[] bArrLIZJ = C2125808Um.LIZJ(inputStream, (int) C2125808Um.LIZLLL(inputStream, 4), (int) C2125808Um.LIZLLL(inputStream, 4));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrLIZJ);
                try {
                    C2125508Uj[] c2125508UjArrLJIIIIZZ = LJIIIIZZ(iLIZLLL, byteArrayInputStream, str);
                    byteArrayInputStream.close();
                    return c2125508UjArrLJIIIIZZ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    try {
                        byteArrayInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported version");
    }

    public static C2125508Uj[] LJIIIIZZ(int i, InputStream inputStream, String str) throws IOException {
        int i2;
        if (inputStream.available() == 0) {
            return new C2125508Uj[0];
        }
        C2125508Uj[] c2125508UjArr = new C2125508Uj[i];
        for (int i3 = 0; i3 < i; i3++) {
            int iLJ = C2125808Um.LJ(inputStream);
            int iLJ2 = C2125808Um.LJ(inputStream);
            c2125508UjArr[i3] = new C2125508Uj(str, new String(C2125808Um.LIZIZ(inputStream, iLJ), StandardCharsets.UTF_8), C2125808Um.LIZLLL(inputStream, 4), iLJ2, (int) C2125808Um.LIZLLL(inputStream, 4), (int) C2125808Um.LIZLLL(inputStream, 4), new int[iLJ2], new TreeMap());
        }
        for (int i4 = 0; i4 < i; i4++) {
            C2125508Uj c2125508Uj = c2125508UjArr[i4];
            int iAvailable = inputStream.available() - c2125508Uj.LJFF;
            int iLJ3 = 0;
            while (inputStream.available() > iAvailable) {
                iLJ3 += C2125808Um.LJ(inputStream);
                c2125508Uj.LJIIIIZZ.put(Integer.valueOf(iLJ3), 1);
                for (int iLJ4 = C2125808Um.LJ(inputStream); iLJ4 > 0; iLJ4--) {
                    C2125808Um.LJ(inputStream);
                    int iLIZLLL = (int) C2125808Um.LIZLLL(inputStream, 1);
                    if (iLIZLLL != 6 && iLIZLLL != 7) {
                        while (iLIZLLL > 0) {
                            C2125808Um.LIZLLL(inputStream, 1);
                            for (int iLIZLLL2 = (int) C2125808Um.LIZLLL(inputStream, 1); iLIZLLL2 > 0; iLIZLLL2--) {
                                C2125808Um.LJ(inputStream);
                            }
                            iLIZLLL--;
                        }
                    }
                }
            }
            if (inputStream.available() == iAvailable) {
                c2125508Uj.LJII = LIZLLL(inputStream, c2125508Uj.LJ);
                BitSet bitSetValueOf = BitSet.valueOf(C2125808Um.LIZIZ(inputStream, ((((c2125508Uj.LJI * 2) + 8) - 1) & (-8)) / 8));
                int i5 = 0;
                while (true) {
                    int i6 = c2125508Uj.LJI;
                    if (i5 < i6) {
                        if (bitSetValueOf.get(LIZJ(2, i5, i6))) {
                            i2 = 2;
                        } else {
                            i2 = 0;
                        }
                        if (bitSetValueOf.get(LIZJ(4, i5, i6))) {
                            i2 |= 4;
                        }
                        if (i2 != 0) {
                            Integer num = c2125508Uj.LJIIIIZZ.get(Integer.valueOf(i5));
                            if (num == null) {
                                num = 0;
                            }
                            c2125508Uj.LJIIIIZZ.put(Integer.valueOf(i5), Integer.valueOf(num.intValue() | i2));
                        }
                        i5++;
                    }
                }
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return c2125508UjArr;
    }

    public static boolean LJIIIZ(OutputStream outputStream, byte[] bArr, C2125508Uj[] c2125508UjArr) throws IOException {
        int length;
        byte[] bArr2 = C2125008Ue.LIZ;
        if (Arrays.equals(bArr, bArr2)) {
            ArrayList arrayList = new ArrayList(3);
            ArrayList arrayList2 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                C2125808Um.LJI(byteArrayOutputStream, c2125508UjArr.length);
                int i = 2;
                for (C2125508Uj c2125508Uj : c2125508UjArr) {
                    C2125808Um.LJFF(byteArrayOutputStream, c2125508Uj.LIZJ, 4);
                    C2125808Um.LJFF(byteArrayOutputStream, c2125508Uj.LIZLLL, 4);
                    C2125808Um.LJFF(byteArrayOutputStream, c2125508Uj.LJI, 4);
                    String strLIZIZ = LIZIZ(c2125508Uj.LIZ, c2125508Uj.LIZIZ, bArr2);
                    int length2 = strLIZIZ.getBytes(StandardCharsets.UTF_8).length;
                    C2125808Um.LJI(byteArrayOutputStream, length2);
                    i = i + 4 + 4 + 4 + 2 + length2;
                    byteArrayOutputStream.write(strLIZIZ.getBytes(StandardCharsets.UTF_8));
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (i == byteArray.length) {
                    C2125708Ul c2125708Ul = new C2125708Ul(EnumC2125608Uk.DEX_FILES, byteArray, false);
                    byteArrayOutputStream.close();
                    arrayList.add(c2125708Ul);
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    int i2 = 0;
                    for (int i3 = 0; i3 < c2125508UjArr.length; i3++) {
                        try {
                            C2125508Uj c2125508Uj2 = c2125508UjArr[i3];
                            C2125808Um.LJI(byteArrayOutputStream2, i3);
                            C2125808Um.LJI(byteArrayOutputStream2, c2125508Uj2.LJ);
                            i2 = i2 + 2 + 2 + (c2125508Uj2.LJ * 2);
                            LJIIJ(byteArrayOutputStream2, c2125508Uj2);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            try {
                                byteArrayOutputStream2.close();
                                throw th;
                            } finally {
                            }
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                    if (i2 == byteArray2.length) {
                        C2125708Ul c2125708Ul2 = new C2125708Ul(EnumC2125608Uk.CLASSES, byteArray2, true);
                        byteArrayOutputStream2.close();
                        arrayList.add(c2125708Ul2);
                        ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                        int i4 = 0;
                        for (int i5 = 0; i5 < c2125508UjArr.length; i5++) {
                            try {
                                C2125508Uj c2125508Uj3 = c2125508UjArr[i5];
                                Iterator<Map.Entry<Integer, Integer>> it2 = c2125508Uj3.LJIIIIZZ.entrySet().iterator();
                                int iIntValue = 0;
                                while (it2.hasNext()) {
                                    iIntValue |= it2.next().getValue().intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                try {
                                    LJIILIIL(byteArrayOutputStream4, iIntValue, c2125508Uj3);
                                    byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                    byteArrayOutputStream4.close();
                                    byteArrayOutputStream4 = new ByteArrayOutputStream();
                                    try {
                                        LJIILJJIL(byteArrayOutputStream4, c2125508Uj3);
                                        byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                                        byteArrayOutputStream4.close();
                                        C2125808Um.LJI(byteArrayOutputStream3, i5);
                                        int length3 = byteArray3.length + 2 + byteArray4.length;
                                        C2125808Um.LJFF(byteArrayOutputStream3, length3, 4);
                                        C2125808Um.LJI(byteArrayOutputStream3, iIntValue);
                                        byteArrayOutputStream3.write(byteArray3);
                                        byteArrayOutputStream3.write(byteArray4);
                                        i4 = i4 + 2 + 4 + length3;
                                    } finally {
                                    }
                                } finally {
                                }
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                try {
                                    byteArrayOutputStream3.close();
                                    throw th2;
                                } finally {
                                }
                            }
                        }
                        byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
                        if (i4 == byteArray5.length) {
                            C2125708Ul c2125708Ul3 = new C2125708Ul(EnumC2125608Uk.METHODS, byteArray5, true);
                            byteArrayOutputStream3.close();
                            arrayList.add(c2125708Ul3);
                            long j = 4;
                            long size = j + j + 4 + ((long) (arrayList.size() * 16));
                            C2125808Um.LJFF(outputStream, arrayList.size(), 4);
                            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                                C2125708Ul c2125708Ul4 = (C2125708Ul) ListProtector.get(arrayList, i6);
                                C2125808Um.LJFF(outputStream, c2125708Ul4.LIZ.LL, 4);
                                C2125808Um.LJFF(outputStream, size, 4);
                                if (c2125708Ul4.LIZJ) {
                                    byte[] bArr3 = c2125708Ul4.LIZIZ;
                                    long length4 = bArr3.length;
                                    byte[] bArrLIZ = C2125808Um.LIZ(bArr3);
                                    arrayList2.add(bArrLIZ);
                                    C2125808Um.LJFF(outputStream, bArrLIZ.length, 4);
                                    C2125808Um.LJFF(outputStream, length4, 4);
                                    length = bArrLIZ.length;
                                } else {
                                    arrayList2.add(c2125708Ul4.LIZIZ);
                                    C2125808Um.LJFF(outputStream, c2125708Ul4.LIZIZ.length, 4);
                                    C2125808Um.LJFF(outputStream, 0L, 4);
                                    length = c2125708Ul4.LIZIZ.length;
                                }
                                size += (long) length;
                            }
                            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                                outputStream.write((byte[]) ListProtector.get(arrayList2, i7));
                            }
                            return true;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Expected size ");
                        sbLIZ.append(i4);
                        sbLIZ.append(", does not match actual size ");
                        sbLIZ.append(byteArray5.length);
                        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Expected size ");
                    sbLIZ2.append(i2);
                    sbLIZ2.append(", does not match actual size ");
                    sbLIZ2.append(byteArray2.length);
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Expected size ");
                sbLIZ3.append(i);
                sbLIZ3.append(", does not match actual size ");
                sbLIZ3.append(byteArray.length);
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ3));
            } catch (Throwable th22) {
                TryCatchGuardChecker.doCheck(th22);
                try {
                    byteArrayOutputStream.close();
                    throw th22;
                } finally {
                }
            }
        }
        byte[] bArr4 = C2125008Ue.LIZIZ;
        if (Arrays.equals(bArr, bArr4)) {
            byte[] bArrLIZ2 = LIZ(c2125508UjArr, bArr4);
            C2125808Um.LJFF(outputStream, c2125508UjArr.length, 1);
            C2125808Um.LJFF(outputStream, bArrLIZ2.length, 4);
            byte[] bArrLIZ3 = C2125808Um.LIZ(bArrLIZ2);
            C2125808Um.LJFF(outputStream, bArrLIZ3.length, 4);
            outputStream.write(bArrLIZ3);
            return true;
        }
        byte[] bArr5 = C2125008Ue.LIZLLL;
        if (Arrays.equals(bArr, bArr5)) {
            C2125808Um.LJFF(outputStream, c2125508UjArr.length, 1);
            for (C2125508Uj c2125508Uj4 : c2125508UjArr) {
                int size2 = c2125508Uj4.LJIIIIZZ.size() * 4;
                String strLIZIZ2 = LIZIZ(c2125508Uj4.LIZ, c2125508Uj4.LIZIZ, bArr5);
                C2125808Um.LJI(outputStream, strLIZIZ2.getBytes(StandardCharsets.UTF_8).length);
                C2125808Um.LJI(outputStream, c2125508Uj4.LJII.length);
                C2125808Um.LJFF(outputStream, size2, 4);
                C2125808Um.LJFF(outputStream, c2125508Uj4.LIZJ, 4);
                outputStream.write(strLIZIZ2.getBytes(StandardCharsets.UTF_8));
                Iterator<Integer> it3 = c2125508Uj4.LJIIIIZZ.keySet().iterator();
                while (it3.hasNext()) {
                    C2125808Um.LJI(outputStream, it3.next().intValue());
                    C2125808Um.LJI(outputStream, 0);
                }
                for (int i8 : c2125508Uj4.LJII) {
                    C2125808Um.LJI(outputStream, i8);
                }
            }
            return true;
        }
        byte[] bArr6 = C2125008Ue.LIZJ;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] bArrLIZ4 = LIZ(c2125508UjArr, bArr6);
            C2125808Um.LJFF(outputStream, c2125508UjArr.length, 1);
            C2125808Um.LJFF(outputStream, bArrLIZ4.length, 4);
            byte[] bArrLIZ5 = C2125808Um.LIZ(bArrLIZ4);
            C2125808Um.LJFF(outputStream, bArrLIZ5.length, 4);
            outputStream.write(bArrLIZ5);
            return true;
        }
        byte[] bArr7 = C2125008Ue.LJ;
        if (Arrays.equals(bArr, bArr7)) {
            C2125808Um.LJI(outputStream, c2125508UjArr.length);
            for (C2125508Uj c2125508Uj5 : c2125508UjArr) {
                String strLIZIZ3 = LIZIZ(c2125508Uj5.LIZ, c2125508Uj5.LIZIZ, bArr7);
                C2125808Um.LJI(outputStream, strLIZIZ3.getBytes(StandardCharsets.UTF_8).length);
                C2125808Um.LJI(outputStream, c2125508Uj5.LJIIIIZZ.size());
                C2125808Um.LJI(outputStream, c2125508Uj5.LJII.length);
                C2125808Um.LJFF(outputStream, c2125508Uj5.LIZJ, 4);
                outputStream.write(strLIZIZ3.getBytes(StandardCharsets.UTF_8));
                Iterator<Integer> it4 = c2125508Uj5.LJIIIIZZ.keySet().iterator();
                while (it4.hasNext()) {
                    C2125808Um.LJI(outputStream, it4.next().intValue());
                }
                for (int i9 : c2125508Uj5.LJII) {
                    C2125808Um.LJI(outputStream, i9);
                }
            }
            return true;
        }
        return false;
    }

    public static void LJIIL(OutputStream outputStream, C2125508Uj c2125508Uj, String str) throws IOException {
        C2125808Um.LJI(outputStream, str.getBytes(StandardCharsets.UTF_8).length);
        C2125808Um.LJI(outputStream, c2125508Uj.LJ);
        C2125808Um.LJFF(outputStream, c2125508Uj.LJFF, 4);
        C2125808Um.LJFF(outputStream, c2125508Uj.LIZJ, 4);
        C2125808Um.LJFF(outputStream, c2125508Uj.LJI, 4);
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    public static void LJIILIIL(OutputStream outputStream, int i, C2125508Uj c2125508Uj) throws IOException {
        byte[] bArr = new byte[((((Integer.bitCount(i & (-2)) * c2125508Uj.LJI) + 8) - 1) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : c2125508Uj.LJIIIIZZ.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int i2 = 0;
            for (int i3 = 1; i3 <= 4; i3 <<= 1) {
                if (i3 != 1 && (i3 & i) != 0) {
                    if ((i3 & iIntValue2) == i3) {
                        int i4 = (c2125508Uj.LJI * i2) + iIntValue;
                        int i5 = i4 / 8;
                        bArr[i5] = (byte) ((1 << (i4 % 8)) | bArr[i5]);
                    }
                    i2++;
                }
            }
        }
        outputStream.write(bArr);
    }

    public static C2125508Uj[] LJ(InputStream inputStream, byte[] bArr, byte[] bArr2, C2125508Uj[] c2125508UjArr) throws IOException {
        byte[] bArr3 = C2125008Ue.LJFF;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(C2125008Ue.LIZ, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int iLIZLLL = (int) C2125808Um.LIZLLL(inputStream, 1);
                    byte[] bArrLIZJ = C2125808Um.LIZJ(inputStream, (int) C2125808Um.LIZLLL(inputStream, 4), (int) C2125808Um.LIZLLL(inputStream, 4));
                    if (inputStream.read() <= 0) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrLIZJ);
                        try {
                            C2125508Uj[] c2125508UjArrLJFF = LJFF(byteArrayInputStream, iLIZLLL, c2125508UjArr);
                            byteArrayInputStream.close();
                            return c2125508UjArrLJFF;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            try {
                                byteArrayInputStream.close();
                                throw th;
                            } finally {
                            }
                        }
                    }
                    throw new IllegalStateException("Content found after the end of file");
                }
                throw new IllegalStateException("Unsupported meta version");
            }
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (Arrays.equals(bArr, C2125008Ue.LJI)) {
            int iLJ = C2125808Um.LJ(inputStream);
            byte[] bArrLIZJ2 = C2125808Um.LIZJ(inputStream, (int) C2125808Um.LIZLLL(inputStream, 4), (int) C2125808Um.LIZLLL(inputStream, 4));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrLIZJ2);
                try {
                    C2125508Uj[] c2125508UjArrLJI = LJI(byteArrayInputStream2, bArr2, iLJ, c2125508UjArr);
                    byteArrayInputStream2.close();
                    return c2125508UjArrLJI;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    try {
                        byteArrayInputStream2.close();
                        throw th2;
                    } finally {
                    }
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported meta version");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        r2 = r11[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r2 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        r2.LIZLLL = r0;
        r1 = LIZLLL(r8, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        if (java.util.Arrays.equals(r9, X.C2125008Ue.LJ) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        r2.LJ = r3;
        r2.LJII = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        r4 = r4 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C2125508Uj[] LJI(java.io.InputStream r8, byte[] r9, int r10, X.C2125508Uj[] r11) throws java.io.IOException {
        /*
            int r1 = r8.available()
            r0 = 0
            if (r1 != 0) goto La
            X.08Uj[] r0 = new X.C2125508Uj[r0]
            return r0
        La:
            int r0 = r11.length
            if (r10 != r0) goto L87
            r4 = 0
        Le:
            if (r4 >= r10) goto L86
            X.C2125808Um.LJ(r8)
            int r0 = X.C2125808Um.LJ(r8)
            java.lang.String r7 = new java.lang.String
            byte[] r1 = X.C2125808Um.LIZIZ(r8, r0)
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            r7.<init>(r1, r0)
            r0 = 4
            long r0 = X.C2125808Um.LIZLLL(r8, r0)
            int r3 = X.C2125808Um.LJ(r8)
            int r2 = r11.length
            if (r2 <= 0) goto L70
            java.lang.String r2 = "!"
            int r2 = r7.indexOf(r2)
            if (r2 >= 0) goto L3c
            java.lang.String r2 = ":"
            int r2 = r7.indexOf(r2)
        L3c:
            if (r2 <= 0) goto L6e
            int r2 = r2 + 1
            java.lang.String r6 = r7.substring(r2)
        L44:
            r5 = 0
        L45:
            int r2 = r11.length
            if (r5 >= r2) goto L70
            r2 = r11[r5]
            java.lang.String r2 = r2.LIZIZ
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L6b
            r2 = r11[r5]
            if (r2 == 0) goto L70
            r2.LIZLLL = r0
            int[] r1 = LIZLLL(r8, r3)
            byte[] r0 = X.C2125008Ue.LJ
            boolean r0 = java.util.Arrays.equals(r9, r0)
            if (r0 == 0) goto L68
            r2.LJ = r3
            r2.LJII = r1
        L68:
            int r4 = r4 + 1
            goto Le
        L6b:
            int r5 = r5 + 1
            goto L45
        L6e:
            r6 = r7
            goto L44
        L70:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Missing profile key: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L86:
            return r11
        L87:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Mismatched number of dex files found in metadata"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2125408Ui.LJI(java.io.InputStream, byte[], int, X.08Uj[]):X.08Uj[]");
    }
}
