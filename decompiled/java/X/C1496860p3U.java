package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0p3U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1496860p3U {
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b4, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1496870p3V LIZIZ(okio.ByteString... r13) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1496860p3U.LIZIZ(okio.ByteString[]):X.0p3V");
    }

    public static void LIZ(long j, C1496690p3D c1496690p3D, int i, List list, int i2, int i3, List list2) {
        boolean z;
        int iIntValue;
        int i4 = i;
        int i5 = i2;
        if (i5 < i3) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            for (int i6 = i5; i6 < i3; i6++) {
                if (((ByteString) ListProtector.get(list, i6)).size() < i4) {
                    "Failed requirement.".toString();
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            ByteString byteString = (ByteString) ListProtector.get(list, i5);
            ByteString byteString2 = (ByteString) ListProtector.get(list, i3 - 1);
            if (i4 == byteString.size()) {
                iIntValue = ((Number) ListProtector.get(list2, i5)).intValue();
                i5++;
                byteString = (ByteString) ListProtector.get(list, i5);
            } else {
                iIntValue = -1;
            }
            if (byteString.getByte(i4) != byteString2.getByte(i4)) {
                int i7 = 1;
                for (int i8 = i5 + 1; i8 < i3; i8++) {
                    if (((ByteString) ListProtector.get(list, i8 - 1)).getByte(i4) != ((ByteString) ListProtector.get(list, i8)).getByte(i4)) {
                        i7++;
                    }
                }
                long j2 = 4;
                long j3 = ((long) (i7 * 2)) + j + (c1496690p3D.LLILLJJLI / j2) + ((long) 2);
                c1496690p3D.LJJLIL(i7);
                c1496690p3D.LJJLIL(iIntValue);
                for (int i9 = i5; i9 < i3; i9++) {
                    int i10 = ((ByteString) ListProtector.get(list, i9)).getByte(i4);
                    if (i9 == i5 || i10 != ((ByteString) ListProtector.get(list, i9 - 1)).getByte(i4)) {
                        c1496690p3D.LJJLIL(i10 & 255);
                    }
                }
                C1496690p3D c1496690p3D2 = new C1496690p3D();
                while (i5 < i3) {
                    byte b = ((ByteString) ListProtector.get(list, i5)).getByte(i4);
                    int i11 = i5 + 1;
                    int i12 = i11;
                    while (true) {
                        if (i12 < i3) {
                            if (b != ((ByteString) ListProtector.get(list, i12)).getByte(i4)) {
                                break;
                            } else {
                                i12++;
                            }
                        } else {
                            i12 = i3;
                            break;
                        }
                    }
                    if (i11 == i12 && i4 + 1 == ((ByteString) ListProtector.get(list, i5)).size()) {
                        c1496690p3D.LJJLIL(((Number) ListProtector.get(list2, i5)).intValue());
                    } else {
                        c1496690p3D.LJJLIL(-((int) ((c1496690p3D2.LLILLJJLI / j2) + j3)));
                        LIZ(j3, c1496690p3D2, i4 + 1, list, i5, i12, list2);
                    }
                    i5 = i12;
                }
                c1496690p3D.LLIIJI(c1496690p3D2);
                return;
            }
            int iMin = Math.min(byteString.size(), byteString2.size());
            int i13 = 0;
            for (int i14 = i4; i14 < iMin && byteString.getByte(i14) == byteString2.getByte(i14); i14++) {
                i13++;
            }
            long j4 = 4;
            long j5 = j + (c1496690p3D.LLILLJJLI / j4) + ((long) 2) + ((long) i13) + 1;
            c1496690p3D.LJJLIL(-i13);
            c1496690p3D.LJJLIL(iIntValue);
            int i15 = i13 + i4;
            while (i4 < i15) {
                c1496690p3D.LJJLIL(byteString.getByte(i4) & 255);
                i4++;
            }
            if (i5 + 1 == i3) {
                if (i15 == ((ByteString) ListProtector.get(list, i5)).size()) {
                    c1496690p3D.LJJLIL(((Number) ListProtector.get(list2, i5)).intValue());
                    return;
                } else {
                    "Check failed.".toString();
                    throw new IllegalStateException("Check failed.");
                }
            }
            C1496690p3D c1496690p3D3 = new C1496690p3D();
            c1496690p3D.LJJLIL(-((int) ((c1496690p3D3.LLILLJJLI / j4) + j5)));
            LIZ(j5, c1496690p3D3, i15, list, i5, i3, list2);
            c1496690p3D.LLIIJI(c1496690p3D3);
            return;
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }
}
