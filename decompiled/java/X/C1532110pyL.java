package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS567S0100000_23;

/* JADX INFO: renamed from: X.0pyL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532110pyL extends AbstractC1532040pyE {
    public static final byte[] LJIILL = new byte[0];
    public final String LJII;
    public volatile byte[] LJIIIIZZ;
    public volatile int LJIIIZ;
    public volatile int LJIIJ;
    public final int LJIIJJI;
    public final ArrayList<C1532120pyM<byte[]>> LJIIL;
    public volatile File LJIILIIL;
    public volatile RandomAccessFile LJIILJJIL;

    @Override // X.AbstractC1532040pyE
    public final void LJIIJJI() {
        Unit unit;
        try {
            RandomAccessFile randomAccessFile = this.LJIILJJIL;
            if (randomAccessFile != null) {
                randomAccessFile.close();
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (this.LIZLLL) {
            return;
        }
        try {
            File file = this.LJIILIIL;
            C189200o6.m2constructorimpl(file != null ? Boolean.valueOf(file.delete()) : null);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }

    public final void LJIILJJIL() {
        Object c098200Yq;
        Object c098200Yq2;
        synchronized (this) {
            try {
                RandomAccessFile randomAccessFile = this.LJIILJJIL;
                if (randomAccessFile != null && !this.LIZLLL) {
                    while (this.LJIIJ < this.LJIIL.size() - 1) {
                        try {
                            c098200Yq = (C1532120pyM) this.LJIIL.get(this.LJIIJ);
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                        if (thM5exceptionOrNullimpl != null) {
                            C1532920pze c1532920pze = C1532920pze.LIZJ;
                            String str = this.LJII;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("failed to get target page from pages, pages size: ");
                            sbLIZ.append(this.LJIIL.size());
                            sbLIZ.append(", index: ");
                            sbLIZ.append(this.LJIIJ);
                            C1532760pzO.LIZJ(c1532920pze, str, "dumpExceptLastPage", C2188811AlT.LIZIZ(sbLIZ), thM5exceptionOrNullimpl, null, 32);
                            LJIILL();
                            return;
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq)) {
                            c098200Yq = null;
                        }
                        C1532120pyM c1532120pyM = (C1532120pyM) c098200Yq;
                        if (c1532120pyM != null) {
                            Object obj = c1532120pyM.LIZ;
                            if (obj != null) {
                                c1532120pyM.LIZIZ = new WeakReference<>(obj);
                                c1532120pyM.LIZ = null;
                            } else {
                                Reference reference = c1532120pyM.LIZIZ;
                                obj = reference != null ? reference.get() : null;
                            }
                            byte[] bArr = (byte[]) obj;
                            if (bArr != null) {
                                try {
                                    randomAccessFile.write(bArr);
                                    C1532680pzG.LIZ.getClass();
                                    if (C1532680pzG.LJJI) {
                                        c1532120pyM.LIZ = null;
                                        c1532120pyM.LIZIZ = null;
                                    }
                                    int i = this.LJIIJ;
                                    this.LJIIJ = i + 1;
                                    c098200Yq2 = Integer.valueOf(i);
                                    C189200o6.m2constructorimpl(c098200Yq2);
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    c098200Yq2 = new C098200Yq(th2);
                                    C189200o6.m2constructorimpl(c098200Yq2);
                                }
                                if (C189200o6.m5exceptionOrNullimpl(c098200Yq2) != null) {
                                    C1532920pze.LIZJ.LIZIZ(this.LJII, "dumpExceptLastPage", "error occurs when dumping");
                                    LJIILL();
                                    return;
                                }
                            }
                        }
                        C1532760pzO.LIZJ(C1532920pze.LIZJ, this.LJII, "dumpExceptLastPage", "bytes released before dump", null, null, 48);
                        LJIILL();
                        return;
                    }
                }
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                throw th3;
            }
        }
    }

    @Override // X.AbstractC1532040pyE
    public final byte[] LJIIJ() {
        if (this.LJIIL.size() == 1) {
            return (byte[]) ((C1532120pyM) ListProtector.get(this.LJIIL, 0)).LIZ();
        }
        return null;
    }

    public final void LJIILIIL() {
        Object c098200Yq;
        if (this.LJIILJJIL == null) {
            return;
        }
        if (this.LJIIJ < this.LJIIL.size() - 1) {
            LJIILJJIL();
        }
        synchronized (this) {
            try {
                RandomAccessFile randomAccessFile = this.LJIILJJIL;
                if (randomAccessFile == null) {
                    return;
                }
                C1532120pyM c1532120pyM = (C1532120pyM) C13LP.LJJLIIIJJI(this.LJIIL);
                Object obj = c1532120pyM.LIZ;
                if (obj != null) {
                    c1532120pyM.LIZIZ = new WeakReference<>(obj);
                    c1532120pyM.LIZ = null;
                } else {
                    Reference reference = c1532120pyM.LIZIZ;
                    obj = reference != null ? reference.get() : null;
                }
                byte[] bArr = (byte[]) obj;
                if (bArr == null) {
                    C1532760pzO.LIZJ(C1532920pze.LIZJ, this.LJII, "dumpAll", "bytes released before dump", null, null, 48);
                    LJIILL();
                    return;
                }
                try {
                    randomAccessFile.write(bArr);
                    C1532680pzG.LIZ.getClass();
                    if (C1532680pzG.LJJI) {
                        c1532120pyM.LIZ = null;
                        c1532120pyM.LIZIZ = null;
                    }
                    int i = this.LJIIJ;
                    this.LJIIJ = i + 1;
                    c098200Yq = Integer.valueOf(i);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    C1532920pze.LIZJ.LIZIZ(this.LJII, "dumpAll", "error occurs when dumping");
                    LJIILL();
                    return;
                }
                try {
                    randomAccessFile.close();
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                }
                this.LJIILJJIL = null;
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                throw th3;
            }
        }
    }

    public final void LJIILL() {
        if (this.LJIILJJIL != null) {
            RandomAccessFile randomAccessFile = this.LJIILJJIL;
            Unit unit = null;
            this.LJIILJJIL = null;
            try {
                File file = this.LJIILIIL;
                C189200o6.m2constructorimpl(file != null ? Boolean.valueOf(file.delete()) : null);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                    unit = Unit.LIZ;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                }
            }
            C189200o6.m2constructorimpl(unit);
        }
        this.LJIIJ = -1;
    }

    public final void LJIILLIIL() throws IOException {
        if (this.LJIIIZ < this.LJIIIIZZ.length) {
            return;
        }
        int size = this.LJIIL.size() - 1;
        this.LJIIIIZZ = new byte[8192];
        this.LJIIIZ = 0;
        this.LJIIL.add(new C1532120pyM<>(this.LJIIIIZZ, false));
        if (this.LJIILJJIL != null && !this.LIZLLL && size == this.LJIIJ) {
            C1532960pzi.LJ(new AwS567S0100000_23(this, 162));
        } else if (this.LJIILJJIL == null) {
            LJIILL();
            throw new IOException("file corrupted");
        }
    }

    @Override // X.AbstractC1532040pyE
    public final String LJII() {
        return this.LJII;
    }

    @Override // X.AbstractC1532040pyE
    public final void LIZJ(int i) {
        this.LJFF = i;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [T, byte[]] */
    @Override // X.AbstractC1532040pyE
    public final byte[] LJFF(int i) {
        LIZIZ(i);
        if (this.LJIIIZ < this.LJIIIIZZ.length) {
            this.LJIIIIZZ = Arrays.copyOf(this.LJIIIIZZ, this.LJIIIZ);
            ((C1532120pyM) C13LP.LJJLIIIJJI(this.LJIIL)).LIZ = this.LJIIIIZZ;
            this.LJIIIIZZ = LJIILL;
        }
        C1532960pzi.LJ(new AwS567S0100000_23(this, 161));
        this.LJFF = i;
        return LJIIJ();
    }

    @Override // X.AbstractC1532040pyE
    public final int LIZLLL(InputStream inputStream, int i) throws IOException {
        LIZIZ(i);
        int i2 = 0;
        while (this.LJ < this.LJFF) {
            int length = this.LJIIIIZZ.length - this.LJIIIZ;
            int i3 = this.LJFF - this.LJ;
            if (length > i3) {
                length = i3;
            }
            int i4 = inputStream.read(this.LJIIIIZZ, this.LJIIIZ, length);
            if (i4 == -1) {
                if (i2 <= 0) {
                    return -1;
                }
                return i2;
            }
            this.LJIIIZ += i4;
            this.LJ += i4;
            i2 += i4;
            LJIILLIIL();
        }
        return i2;
    }

    @Override // X.AbstractC1532040pyE
    public final boolean LJIIIIZZ(C0VSJ c0vsj, Function1 function1) {
        LJIILIIL();
        synchronized (this) {
            try {
                File file = this.LJIILIIL;
                if (file != null) {
                    if (((Boolean) function1.invoke(file)).booleanValue()) {
                        if (file.renameTo(c0vsj)) {
                            this.LJIILIIL = c0vsj;
                        } else {
                            throw new IOException("rename file failed");
                        }
                    } else {
                        LJIILL();
                        throw new IOException("check file failed");
                    }
                } else {
                    throw new IOException("cache file not exists");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return true;
    }

    @Override // X.AbstractC1532040pyE
    public final void LJIIL(int i, byte b) throws IOException {
        LIZIZ(i);
        LJIILLIIL();
        this.LJIIIIZZ[this.LJIIIZ] = b;
        this.LJ++;
        this.LJIIIZ++;
        LJIILLIIL();
    }

    @Override // X.AbstractC1532040pyE
    public final void LJ(int i, byte[] bArr, int i2, int i3) throws IOException {
        LIZIZ(i);
        if (i >= 0 && i2 >= 0 && i2 <= bArr.length && i3 >= 0) {
            int i4 = i2 + i3;
            if (i4 - bArr.length <= 0) {
                if (i4 <= bArr.length) {
                    int i5 = 0;
                    while (i5 < i3) {
                        int i6 = i3 - i5;
                        int length = this.LJIIIIZZ.length - this.LJIIIZ;
                        if (i6 > length) {
                            i6 = length;
                        }
                        if (i6 != 0) {
                            System.arraycopy(bArr, i2 + i5, this.LJIIIIZZ, this.LJIIIZ, i6);
                            this.LJIIIZ += i6;
                            this.LJ += i6;
                            i5 += i6;
                        }
                        LJIILLIIL();
                    }
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("can not copy bytes from ");
                sbLIZ.append(i2);
                sbLIZ.append(" to ");
                sbLIZ.append(i3);
                sbLIZ.append(", input bytearray size is ");
                sbLIZ.append(bArr.length);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        throw new IndexOutOfBoundsException("bounds check failed");
    }

    public C1532110pyL(int i, byte[] bArr, int i2, File file, int i3) {
        RandomAccessFile randomAccessFile;
        C0VSJ c0vsj;
        super(file, i3, true);
        this.LJII = "ArrayMeta";
        this.LJIIIIZZ = bArr == null ? new byte[i2] : bArr;
        this.LJIIIZ = i;
        this.LJIIJJI = this.LJIIIIZZ.length;
        ArrayList<C1532120pyM<byte[]>> arrayList = new ArrayList<>();
        this.LJIIL = arrayList;
        this.LJIILIIL = file;
        this.LJFF = i2;
        arrayList.add(new C1532120pyM<>(this.LJIIIIZZ, false));
        this.LJ = i;
        if (file == null) {
            List<String> list = C1531200pws.LIZ;
            do {
                File fileLIZ = C1529330ptr.LIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(System.currentTimeMillis());
                sbLIZ.append('-');
                sbLIZ.append(UUID.randomUUID());
                sbLIZ.append("_tmp");
                sbLIZ.append("");
                c0vsj = new C0VSJ(fileLIZ, C2188811AlT.LIZIZ(sbLIZ));
            } while (!c0vsj.createNewFile());
            this.LJIILIIL = c0vsj;
            randomAccessFile = new RandomAccessFile(this.LJIILIIL, "rw");
        } else {
            randomAccessFile = null;
        }
        this.LJIILJJIL = randomAccessFile;
    }

    @Override // X.AbstractC1532040pyE
    public final void LJIIIZ(int i, byte[] bArr, int i2, int i3, C1532070pyH c1532070pyH) throws IOException {
        Pair pair;
        Pair pair2;
        if (i + i3 <= this.LJ) {
            int i4 = this.LJIIJJI;
            int iIntValue = -1;
            if (i > i4) {
                int i5 = i - i4;
                int i6 = i5 - 1;
                if (i6 < 0) {
                    i6 = 0;
                }
                int i7 = (i6 / 8192) + 1;
                pair = new Pair(Integer.valueOf(i7), Integer.valueOf(i5 - ((i7 - 1) * 8192)));
            } else {
                pair = new Pair(0, Integer.valueOf(i));
            }
            int iIntValue2 = ((Number) pair.getFirst()).intValue();
            int iIntValue3 = ((Number) pair.getSecond()).intValue();
            InterfaceC1532130pyN interfaceC1532130pyNLIZJ = c1532070pyH.LIZ;
            Integer num = c1532070pyH.LIZIZ;
            if (num != null) {
                iIntValue = num.intValue();
            }
            int i8 = 0;
            while (i8 < i3) {
                byte[] bArr2 = (byte[]) ((C1532120pyM) ListProtector.get(this.LJIIL, iIntValue2)).LIZ();
                if (bArr2 == null) {
                    if (interfaceC1532130pyNLIZJ == null) {
                        interfaceC1532130pyNLIZJ = C1529330ptr.LIZJ(this.LJIILIIL);
                        if (interfaceC1532130pyNLIZJ == null) {
                            synchronized (this) {
                                try {
                                    interfaceC1532130pyNLIZJ = C1529330ptr.LIZJ(this.LJIILIIL);
                                    if (interfaceC1532130pyNLIZJ == null) {
                                        throw new IOException("can not get RandomAccessStream");
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }
                        iIntValue = 0;
                    }
                    if (iIntValue2 > 0) {
                        int i9 = this.LJIIJJI + ((iIntValue2 - 1) * 8192);
                        Integer numValueOf = Integer.valueOf(i9);
                        int i10 = this.LJFF - i9;
                        if (8192 <= i10) {
                            i10 = 8192;
                        }
                        pair2 = new Pair(numValueOf, Integer.valueOf(i10));
                    } else {
                        pair2 = new Pair(0, Integer.valueOf(this.LJIIJJI));
                    }
                    int iIntValue4 = ((Number) pair2.getFirst()).intValue();
                    int iIntValue5 = ((Number) pair2.getSecond()).intValue();
                    if (iIntValue != iIntValue4) {
                        interfaceC1532130pyNLIZJ.LJ(iIntValue4);
                        iIntValue = iIntValue4;
                    }
                    bArr2 = new byte[iIntValue5];
                    int i11 = 0;
                    while (i11 < iIntValue5) {
                        int i12 = interfaceC1532130pyNLIZJ.read(bArr2, i11, iIntValue5 - i11);
                        if (i12 >= 0) {
                            iIntValue += i12;
                            i11 += i12;
                        } else {
                            C1532760pzO.LIZIZ(C1532920pze.LIZJ, this.LJII, "readBytes", "unexpected EOF occurs", null, null, 48);
                            throw new IOException("unexpected EOF occurs");
                        }
                    }
                    ArrayList<C1532120pyM<byte[]>> arrayList = this.LJIIL;
                    C1532120pyM c1532120pyM = new C1532120pyM(bArr2, false);
                    T t = c1532120pyM.LIZ;
                    if (t != 0) {
                        c1532120pyM.LIZIZ = new WeakReference<>(t);
                        c1532120pyM.LIZ = null;
                    }
                    ListProtector.set(arrayList, iIntValue2, c1532120pyM);
                }
                int length = bArr2.length - iIntValue3;
                int i13 = i3 - i8;
                if (length > i13) {
                    length = i13;
                }
                System.arraycopy(bArr2, iIntValue3, bArr, i2 + i8, length);
                i8 += length;
                iIntValue2++;
                iIntValue3 = 0;
            }
            Integer num2 = c1532070pyH.LIZIZ;
            if (num2 == null || num2.intValue() != iIntValue) {
                c1532070pyH.LIZIZ = Integer.valueOf(iIntValue);
                c1532070pyH.LIZ = interfaceC1532130pyNLIZJ;
                return;
            }
            return;
        }
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("expected size is larger than capacity");
        C1532760pzO.LIZJ(C1532920pze.LIZJ, this.LJII, "readBytes", "expected size is larger than capacity", indexOutOfBoundsException, null, 32);
        throw indexOutOfBoundsException;
    }
}
