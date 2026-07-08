package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: X.18gN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21346918gN {
    public final BufferedInputStream LIZ;
    public final ByteArrayOutputStream LIZIZ = new ByteArrayOutputStream();

    public C21346918gN(C2479109nZ c2479109nZ) {
        this.LIZ = new BufferedInputStream(c2479109nZ, 1024);
    }

    public final void LIZ(C21348118gZ c21348118gZ) throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        long jLIZ;
        byte[] bArr;
        C21347018gO c21347018gO = new C21347018gO();
        do {
            BufferedInputStream bufferedInputStream = this.LIZ;
            byte bLIZ = C21347018gO.LIZ(bufferedInputStream);
            if ((bLIZ & 128) != 0) {
                z = true;
            } else {
                z = false;
            }
            c21347018gO.LIZ = z;
            if ((bLIZ & 64) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            c21347018gO.LIZIZ = z2;
            if ((bLIZ & 32) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            c21347018gO.LIZJ = z3;
            if ((bLIZ & 16) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            c21347018gO.LIZLLL = z4;
            c21347018gO.LJ = (byte) (bLIZ & 15);
            byte bLIZ2 = C21347018gO.LIZ(bufferedInputStream);
            if ((bLIZ2 & 128) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            c21347018gO.LJFF = z5;
            int iLIZ = (byte) (bLIZ2 & (-129));
            if (iLIZ > 125) {
                if (iLIZ == 126) {
                    iLIZ = ((C21347018gO.LIZ(bufferedInputStream) & 255) << 8) | (C21347018gO.LIZ(bufferedInputStream) & 255);
                    jLIZ = iLIZ;
                } else if (iLIZ == 127) {
                    jLIZ = 0;
                    int i = 0;
                    do {
                        jLIZ = (jLIZ << 8) | ((long) (C21347018gO.LIZ(bufferedInputStream) & 255));
                        i++;
                    } while (i < 8);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unexpected length byte: ");
                    sbLIZ.append(iLIZ);
                    throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
                }
            } else {
                jLIZ = iLIZ;
            }
            c21347018gO.LJI = jLIZ;
            if (c21347018gO.LJFF) {
                int i2 = 4;
                bArr = new byte[4];
                int i3 = 0;
                do {
                    int i4 = bufferedInputStream.read(bArr, i3, i2);
                    if (i4 != -1) {
                        i2 -= i4;
                        i3 += i4;
                    } else {
                        throw new EOFException();
                    }
                } while (i2 > 0);
            } else {
                bArr = null;
            }
            c21347018gO.LJII = bArr;
            int i5 = (int) c21347018gO.LJI;
            byte[] bArr2 = new byte[i5];
            c21347018gO.LJIIIIZZ = bArr2;
            int i6 = 0;
            while (i5 > 0) {
                int i7 = bufferedInputStream.read(bArr2, i6, i5);
                if (i7 != -1) {
                    i5 -= i7;
                    i6 += i7;
                } else {
                    throw new EOFException();
                }
            }
            byte[] bArr3 = c21347018gO.LJII;
            byte[] bArr4 = c21347018gO.LJIIIIZZ;
            int i8 = (int) c21347018gO.LJI;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                int i11 = i8 - 1;
                if (i8 > 0) {
                    bArr4[i9] = (byte) (bArr3[i10 % bArr3.length] ^ bArr4[i9]);
                    i9++;
                    i8 = i11;
                    i10++;
                } else {
                    this.LIZIZ.write(c21347018gO.LJIIIIZZ, 0, (int) c21347018gO.LJI);
                    if (c21347018gO.LIZ) {
                        byte[] byteArray = this.LIZIZ.toByteArray();
                        byte b = c21347018gO.LJ;
                        int length = byteArray.length;
                        c21348118gZ.getClass();
                        if (b != 1) {
                            if (b != 2) {
                                switch (b) {
                                    case 8:
                                        if (length >= 2 && length > 2) {
                                            new String(byteArray, 2, length - 2);
                                        }
                                        if (!c21348118gZ.LIZ.LJ) {
                                            C21346818gM c21346818gM = c21348118gZ.LIZ;
                                            c21346818gM.getClass();
                                            byte[] bArrLIZ = C08GQ.LIZ("Received close frame");
                                            int length2 = bArrLIZ.length + 2;
                                            byte[] bArr5 = new byte[length2];
                                            bArr5[0] = (byte) 3;
                                            bArr5[1] = (byte) 232;
                                            System.arraycopy(bArrLIZ, 0, bArr5, 2, bArrLIZ.length);
                                            c21346818gM.LIZ(C21347418gS.LIZ(bArr5, length2, (byte) 8));
                                            c21346818gM.LJ = true;
                                        }
                                        c21348118gZ.LIZ.LIZIZ();
                                        break;
                                    case BdTuring.TYPE_ECAF /* 9 */:
                                        c21348118gZ.LIZ.LIZ(C21347418gS.LIZ(byteArray, length, (byte) 10));
                                        break;
                                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                        break;
                                    default:
                                        C21346818gM c21346818gM2 = c21348118gZ.LIZ;
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("Unsupported frame opcode=");
                                        sbLIZ2.append((int) b);
                                        new IOException(C2188811AlT.LIZIZ(sbLIZ2));
                                        ((C21344818g2) c21346818gM2.LIZJ).LIZ.LIZIZ(c21346818gM2);
                                        break;
                                }
                            } else {
                                c21348118gZ.LIZ.LIZJ.getClass();
                            }
                        } else {
                            C21346818gM c21346818gM3 = c21348118gZ.LIZ;
                            ((C21344818g2) c21346818gM3.LIZJ).LIZ.LIZJ(c21346818gM3, new String(byteArray, 0, length));
                        }
                        this.LIZIZ.reset();
                    }
                }
            }
        } while (c21347018gO.LJ != 8);
    }
}
