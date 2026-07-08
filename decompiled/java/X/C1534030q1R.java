package X;

import Y.ARunnableS123S0100000_23;
import Y.ARunnableS29S0201000_23;
import com.bytedance.forest.chain.fetchers.CDNFetcher;
import com.bytedance.forest.experiments.ForestExperiment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS672S0100000_23;
import kotlin.jvm.internal.AwS8S0302000_2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0q1R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1534030q1R extends AbstractC1534170q1f {
    public final String LJI;
    public final int LJII;
    public volatile byte[] LJIIIIZZ;
    public volatile int LJIIIZ;
    public final Boolean LJIIJ;
    public final int LJIIJJI;
    public final C1534910q2r LJIIL;
    public volatile int LJIILIIL;
    public volatile File LJIILJJIL;
    public final RandomAccessFile LJIILL;
    public volatile boolean LJIILLIIL;
    public volatile int LJIIZILJ;

    @Override // X.AbstractC1534170q1f
    public final void LJIIJJI() {
        Unit unit;
        try {
            RandomAccessFile randomAccessFile = this.LJIILL;
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
        if (this.LIZJ) {
            return;
        }
        try {
            File file = this.LJIILJJIL;
            C189200o6.m2constructorimpl(file != null ? Boolean.valueOf(file.delete()) : null);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }

    @Override // X.AbstractC1534170q1f
    public final byte[] LJIIL() {
        return null;
    }

    @Override // X.AbstractC1534170q1f
    public final boolean LJIIIZ() {
        return !this.LJIILLIIL;
    }

    public final void LJIIZILJ() {
        Unit unit;
        try {
            RandomAccessFile randomAccessFile = this.LJIILL;
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
        this.LJIILLIIL = true;
    }

    public final void LJIJ() {
        if (this.LJIIIZ < this.LJIIIIZZ.length) {
            return;
        }
        byte[] bArr = this.LJIIIIZZ;
        C1534910q2r c1534910q2r = this.LJIIL;
        byte[] bArr2 = new byte[this.LJII];
        C1534780q2e c1534780q2e = c1534910q2r.LIZIZ;
        C1534780q2e c1534780q2e2 = new C1534780q2e(bArr2, c1534910q2r.LIZIZ.LIZ + 1);
        c1534780q2e2.LIZJ = c1534910q2r.LIZIZ;
        c1534910q2r.LIZIZ = c1534780q2e2;
        c1534780q2e.LIZIZ = c1534780q2e2;
        this.LJIIIIZZ = bArr2;
        this.LJIIIZ = 0;
        int i = this.LIZLLL;
        Boolean bool = this.LJIIJ;
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            LJIILLIIL(bArr, bArr.length, i - bArr.length);
        } else if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
            C086F c086f = C086F.LIZ;
            ARunnableS29S0201000_23 aRunnableS29S0201000_23 = new ARunnableS29S0201000_23(i, this, bArr, 3);
            c086f.getClass();
            C086F.LIZLLL(aRunnableS29S0201000_23);
        }
    }

    @Override // X.AbstractC1534170q1f
    public final JSONObject LJI() throws JSONException {
        JSONObject jSONObjectLJI = super.LJI();
        File file = this.LJIILJJIL;
        jSONObjectLJI.put("cache_file", file != null ? file.getAbsolutePath() : null);
        RandomAccessFile randomAccessFile = this.LJIILL;
        jSONObjectLJI.put("random_access_file", randomAccessFile != null ? randomAccessFile.toString() : null);
        jSONObjectLJI.put("corrupted", this.LJIILLIIL);
        jSONObjectLJI.put("end_pos", this.LJIIZILJ);
        jSONObjectLJI.put("fixed_size", this.LJII);
        jSONObjectLJI.put("current_page_size", this.LJIIIIZZ.length);
        jSONObjectLJI.put("current_page_ptr", this.LJIIIZ);
        jSONObjectLJI.put("write_strategy", this.LJIIJ);
        jSONObjectLJI.put("first_page_size", this.LJIIJJI);
        jSONObjectLJI.put("file_ptr", this.LJIILIIL);
        return jSONObjectLJI;
    }

    @Override // X.AbstractC1534170q1f
    public final String LJII() {
        return this.LJI;
    }

    @Override // X.AbstractC1534170q1f
    public final void LIZJ(int i) {
        this.LJ = i;
    }

    @Override // X.AbstractC1534170q1f
    public final byte[] LJ(int i) {
        byte[] bArrCopyOf;
        LIZIZ(i);
        this.LJIIZILJ = i;
        if (this.LIZLLL == this.LJIIIIZZ.length) {
            bArrCopyOf = this.LJIIIIZZ;
        } else if (this.LIZLLL < this.LJIIIIZZ.length) {
            bArrCopyOf = Arrays.copyOf(this.LJIIIIZZ, this.LIZLLL);
        } else {
            bArrCopyOf = null;
        }
        Boolean bool = this.LJIIJ;
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            LJIILLIIL(this.LJIIIIZZ, this.LJIIIZ, this.LIZLLL - this.LJIIIZ);
        } else if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
            C086F c086f = C086F.LIZ;
            ARunnableS123S0100000_23 aRunnableS123S0100000_23 = new ARunnableS123S0100000_23(this, 117);
            c086f.getClass();
            C086F.LIZLLL(aRunnableS123S0100000_23);
        }
        this.LJ = i;
        return bArrCopyOf;
    }

    public final boolean LJIILL(int i) throws JSONException, IOException {
        if (!this.LJIILLIIL) {
            if (i <= this.LJIILIIL) {
                if (i == this.LJIILIIL) {
                    return true;
                }
                String str = this.LJI;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("filePtr not match, startPos ");
                sbLIZ.append(i);
                sbLIZ.append(" filePtr ");
                sbLIZ.append(this.LJIILIIL);
                C1534250q1n.LIZJ(str, C2188811AlT.LIZIZ(sbLIZ), null, true);
                return false;
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("filePtr is illegal");
            Function2<? super String, ? super C1535250q3P, Unit> function2 = C1533480q0Y.LIZ;
            String str2 = this.LJI;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("start_pos", i);
            jSONObject.put("file_ptr", this.LJIILIIL);
            C1533480q0Y.LIZJ(str2, null, null, null, null, null, null, illegalArgumentException, this, null, jSONObject, 5502);
            LJIIZILJ();
            throw illegalArgumentException;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("cache corrupted, startPos ");
        sbLIZ2.append(i);
        throw new IOException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.AbstractC1534170q1f
    public final int LIZLLL(InputStream inputStream, int i) throws IOException {
        LIZIZ(i);
        int i2 = 0;
        while (this.LIZLLL < this.LJ) {
            int length = this.LJIIIIZZ.length - this.LJIIIZ;
            int i3 = this.LJ - this.LIZLLL;
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
            this.LIZLLL += i4;
            i2 += i4;
            LJIJ();
        }
        return i2;
    }

    @Override // X.AbstractC1534170q1f
    public final boolean LJIIIIZZ(C0VSJ c0vsj, Function1 function1) throws IOException {
        Unit unit;
        boolean z;
        Boolean bool = this.LJIIJ;
        if (bool == null) {
            return false;
        }
        if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
            C1534910q2r c1534910q2r = this.LJIIL;
            AwS672S0100000_23 awS672S0100000_23 = new AwS672S0100000_23(this, 3);
            C1534780q2e c1534780q2e = c1534910q2r.LIZ;
            do {
                byte[] bArr = c1534780q2e.LIZLLL.get();
                if (bArr != null) {
                    if (c1534780q2e.LIZIZ == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    awS672S0100000_23.invoke(Boolean.valueOf(z), Integer.valueOf(c1534780q2e.LIZ), bArr);
                }
                c1534780q2e = c1534780q2e.LIZIZ;
            } while (c1534780q2e != null);
        }
        if (this.LJIILIIL == this.LIZLLL) {
            try {
                RandomAccessFile randomAccessFile = this.LJIILL;
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
            File file = this.LJIILJJIL;
            if (file != null) {
                if (((Boolean) function1.invoke(file)).booleanValue()) {
                    if (file.renameTo(c0vsj)) {
                        this.LJIILJJIL = c0vsj;
                        return true;
                    }
                    throw new IOException("rename file failed");
                }
                LJIIZILJ();
                throw new IOException("check file failed");
            }
            throw new IOException("cache file not exists");
        }
        IOException iOException = new IOException("flush finished with unexpected file length");
        Function2<? super String, ? super C1535250q3P, Unit> function2 = C1533480q0Y.LIZ;
        C1533480q0Y.LIZJ(this.LJI, null, null, null, null, null, null, iOException, this, null, null, 7550);
        LJIIZILJ();
        throw iOException;
    }

    @Override // X.AbstractC1534170q1f
    public final void LJIILIIL(int i, byte b) {
        LIZIZ(i);
        LJIJ();
        this.LJIIIIZZ[this.LJIIIZ] = b;
        this.LIZLLL++;
        this.LJIIIZ++;
        LJIJ();
    }

    public final void LJIILLIIL(byte[] bArr, int i, int i2) {
        if (this.LJIIJ != null && this.LJIILL != null && i != 0 && !this.LIZJ && LJIILL(i2)) {
            if (!this.LJIILLIIL) {
                synchronized (this) {
                    try {
                        if (!this.LIZJ && LJIILL(i2)) {
                            if (!this.LJIILLIIL) {
                                try {
                                    this.LJIILL.write(bArr, 0, i);
                                    this.LJIILIIL += i;
                                    if (this.LJIILIIL == this.LJIIZILJ) {
                                        String str = this.LJI;
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("load to endPos ");
                                        sbLIZ.append(this.LJIILIIL);
                                        C1534250q1n.LJII(str, C2188811AlT.LIZIZ(sbLIZ), false);
                                        try {
                                            this.LJIILL.close();
                                            C189200o6.m2constructorimpl(Unit.LIZ);
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            C189200o6.m2constructorimpl(new C098200Yq(th));
                                        }
                                    }
                                    if (this.LJIILIIL <= this.LJIIZILJ) {
                                        return;
                                    }
                                    IOException iOException = new IOException("unexpected length of file");
                                    Function2<? super String, ? super C1535250q3P, Unit> function2 = C1533480q0Y.LIZ;
                                    String str2 = this.LJI;
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("start_pos", i2);
                                    jSONObject.put("file_ptr", this.LJIILIIL);
                                    C1533480q0Y.LIZJ(str2, null, null, null, null, null, null, iOException, this, null, jSONObject, 5502);
                                    throw iOException;
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    Function2<? super String, ? super C1535250q3P, Unit> function22 = C1533480q0Y.LIZ;
                                    C1533480q0Y.LIZJ(this.LJI, null, null, null, "write file failed", null, null, th2, this, null, null, 7534);
                                    LJIIZILJ();
                                    throw th2;
                                }
                            }
                            throw new IOException("cache corrupted");
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                    }
                }
            } else {
                throw new IOException("cache corrupted");
            }
        }
    }

    public C1534030q1R(EnumC1534640q2Q enumC1534640q2Q, int i, AbstractC1533800q14 abstractC1533800q14, int i2) {
        this(enumC1534640q2Q, 0, null, i, abstractC1533800q14, i2);
    }

    @Override // X.AbstractC1534170q1f
    public final void LJIILJJIL(int i, byte[] bArr, int i2, int i3) {
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
                            this.LIZLLL += i6;
                            i5 += i6;
                        }
                        LJIJ();
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [X.0q2T] */
    /* JADX WARN: Type inference failed for: r6v5, types: [X.0q2r] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.AbstractC1534170q1f
    public final void LJIIJ(int i, byte[] bArr, int i2, int i3, C1534670q2T c1534670q2T) throws IOException {
        int i4;
        T tValueOf;
        Object obj;
        C1534670q2T c1534670q2T2;
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        Object c098200Yq4;
        InterfaceC1534970q2x interfaceC1534970q2x;
        InterfaceC1534970q2x interfaceC1534970q2x2;
        InterfaceC1534970q2x interfaceC1534970q2x3;
        InterfaceC1534970q2x interfaceC1534970q2x4;
        int i5 = i + i3;
        if (i5 <= this.LIZLLL) {
            C118300cf c118300cf = new C118300cf();
            c118300cf.element = i5;
            int i6 = this.LJIIJJI;
            int i7 = 0;
            if (i5 > i6) {
                int i8 = (i5 - i6) - 1;
                if (i8 < 0) {
                    i8 = 0;
                }
                i4 = (i8 / this.LJII) + 1;
            } else {
                i4 = 0;
            }
            if (i4 < this.LJIIL.LIZIZ.LIZ + 1) {
                C259800zU c259800zU = new C259800zU();
                int i9 = c118300cf.element;
                int i10 = this.LJIIJJI;
                if (i9 <= i10) {
                    tValueOf = Integer.valueOf(i9);
                } else {
                    int i11 = i4 - 1;
                    if (i11 < 0) {
                        i11 = 0;
                    }
                    tValueOf = Integer.valueOf((i9 - (i11 * this.LJII)) - i10);
                }
                c259800zU.element = tValueOf;
                ?? r6 = this.LJIIL;
                AwS8S0302000_2 awS8S0302000_2 = new AwS8S0302000_2(c259800zU, (C259800zU<Integer>) c118300cf, (C118300cf) i, (int) bArr, (byte[]) i2, 1);
                C1534780q2e c1534780q2e = r6.LIZ;
                while (true) {
                    obj = null;
                    if (c1534780q2e.LIZ < i4) {
                        if (c1534780q2e.LIZLLL.get() == null) {
                            c1534780q2e.LIZJ = null;
                            r6.LIZ = c1534780q2e;
                        }
                        c1534780q2e = c1534780q2e.LIZIZ;
                        if (c1534780q2e == null) {
                            break;
                        }
                    } else {
                        do {
                            byte[] bArr2 = c1534780q2e.LIZLLL.get();
                            if (bArr2 == null) {
                                break;
                            }
                            awS8S0302000_2.invoke(bArr2);
                            c1534780q2e = c1534780q2e.LIZJ;
                        } while (c1534780q2e != null);
                    }
                }
                int i12 = c118300cf.element;
                if (i12 == i) {
                    return;
                }
                if (!this.LJIILLIIL) {
                    if (i12 >= i) {
                        try {
                            if (i12 <= this.LJIILIIL) {
                                try {
                                    r6 = c1534670q2T;
                                    InterfaceC1534970q2x interfaceC1534970q2x5 = r6.LIZ;
                                    if (interfaceC1534970q2x5 != null) {
                                        interfaceC1534970q2x5.LJ(i);
                                        interfaceC1534970q2x4 = interfaceC1534970q2x5;
                                    } else {
                                        interfaceC1534970q2x4 = null;
                                    }
                                    C189200o6.m2constructorimpl(interfaceC1534970q2x4);
                                    c098200Yq = interfaceC1534970q2x4;
                                    c1534670q2T2 = r6;
                                } finally {
                                }
                                boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(c098200Yq);
                                Object obj2 = c098200Yq;
                                if (zM7isFailureimpl) {
                                    obj2 = null;
                                }
                                InterfaceC1534970q2x interfaceC1534970q2x6 = (InterfaceC1534970q2x) obj2;
                                if (interfaceC1534970q2x6 == null) {
                                    try {
                                        InterfaceC1534970q2x interfaceC1534970q2xLJI = C1533950q1J.LJI(this.LIZ);
                                        if (interfaceC1534970q2xLJI != null) {
                                            interfaceC1534970q2xLJI.LJ(i);
                                            interfaceC1534970q2x3 = interfaceC1534970q2xLJI;
                                        } else {
                                            interfaceC1534970q2x3 = null;
                                        }
                                        C189200o6.m2constructorimpl(interfaceC1534970q2x3);
                                        c098200Yq2 = interfaceC1534970q2x3;
                                    } catch (Throwable th) {
                                    }
                                    boolean zM7isFailureimpl2 = C189200o6.m7isFailureimpl(c098200Yq2);
                                    Object obj3 = c098200Yq2;
                                    if (zM7isFailureimpl2) {
                                        obj3 = null;
                                    }
                                    interfaceC1534970q2x6 = (InterfaceC1534970q2x) obj3;
                                    if (interfaceC1534970q2x6 == null) {
                                        try {
                                            InterfaceC1534970q2x interfaceC1534970q2xLJFF = C1533950q1J.LJFF(this.LJIILJJIL);
                                            if (interfaceC1534970q2xLJFF != null) {
                                                interfaceC1534970q2xLJFF.LJ(i);
                                                interfaceC1534970q2x2 = interfaceC1534970q2xLJFF;
                                            } else {
                                                interfaceC1534970q2x2 = null;
                                            }
                                            C189200o6.m2constructorimpl(interfaceC1534970q2x2);
                                            c098200Yq3 = interfaceC1534970q2x2;
                                        } catch (Throwable th2) {
                                        }
                                        boolean zM7isFailureimpl3 = C189200o6.m7isFailureimpl(c098200Yq3);
                                        Object obj4 = c098200Yq3;
                                        if (zM7isFailureimpl3) {
                                            obj4 = null;
                                        }
                                        interfaceC1534970q2x6 = (InterfaceC1534970q2x) obj4;
                                        if (interfaceC1534970q2x6 == null) {
                                            try {
                                                InterfaceC1534970q2x interfaceC1534970q2xLJFF2 = C1533950q1J.LJFF(this.LJIILJJIL);
                                                if (interfaceC1534970q2xLJFF2 != null) {
                                                    interfaceC1534970q2xLJFF2.LJ(i);
                                                    interfaceC1534970q2x = interfaceC1534970q2xLJFF2;
                                                } else {
                                                    interfaceC1534970q2x = null;
                                                }
                                                C189200o6.m2constructorimpl(interfaceC1534970q2x);
                                                c098200Yq4 = interfaceC1534970q2x;
                                            } catch (Throwable th3) {
                                            }
                                            if (!C189200o6.m7isFailureimpl(c098200Yq4)) {
                                                obj = c098200Yq4;
                                            }
                                            interfaceC1534970q2x6 = (InterfaceC1534970q2x) obj;
                                            if (interfaceC1534970q2x6 == null) {
                                                throw new IOException("can not get RandomAccessStream");
                                            }
                                        }
                                    }
                                }
                                while (true) {
                                    int i13 = i12 - i;
                                    if (i7 < i13) {
                                        int i14 = interfaceC1534970q2x6.read(bArr, i2 + i7, i13 - i7);
                                        if (i14 != -1) {
                                            i7 += i14;
                                        } else {
                                            IOException iOException = new IOException("unexpected EOF meed");
                                            Function2<? super String, ? super C1535250q3P, Unit> function2 = C1533480q0Y.LIZ;
                                            C1533480q0Y.LIZJ(this.LJI, null, null, null, null, null, null, iOException, this, null, null, 7550);
                                            throw iOException;
                                        }
                                    } else {
                                        if (i7 == i13) {
                                            c1534670q2T2.LIZ = interfaceC1534970q2x6;
                                            c1534670q2T2.LIZIZ = Integer.valueOf(this.LIZIZ);
                                            return;
                                        }
                                        IOException iOException2 = new IOException("unexpected data length");
                                        Function2<? super String, ? super C1535250q3P, Unit> function22 = C1533480q0Y.LIZ;
                                        String str = this.LJI;
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("read_length", i7);
                                        jSONObject.put("expect_length", i13);
                                        C1533480q0Y.LIZJ(str, null, null, null, null, null, null, iOException2, this, null, jSONObject, 5502);
                                        throw iOException2;
                                    }
                                }
                            }
                        } catch (Throwable th4) {
                            TryCatchGuardChecker.doCheck(th4);
                            Function2<? super String, ? super C1535250q3P, Unit> function23 = C1533480q0Y.LIZ;
                            C1533480q0Y.LIZJ(this.LJI, null, null, null, "read from file failed", null, null, th4, this, null, null, 7534);
                            LJIIZILJ();
                        }
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("check match failed, startPos: ");
                    sbLIZ.append(i12);
                    sbLIZ.append(", index: ");
                    sbLIZ.append(i);
                    throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
                }
                throw new IOException("cache corrupted");
            }
            IOException iOException3 = new IOException("read bytes failed since page not enough");
            Function2<? super String, ? super C1535250q3P, Unit> function24 = C1533480q0Y.LIZ;
            C1533480q0Y.LIZJ(this.LJI, null, null, null, null, null, null, iOException3, this, null, null, 7550);
            throw iOException3;
        }
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("expected size is larger than capacity");
        Function2<? super String, ? super C1535250q3P, Unit> function25 = C1533480q0Y.LIZ;
        C1533480q0Y.LIZJ(this.LJI, null, null, null, null, null, null, indexOutOfBoundsException, this, null, null, 7550);
        throw indexOutOfBoundsException;
    }

    public C1534030q1R(EnumC1534640q2Q enumC1534640q2Q, int i, byte[] bArr, int i2, AbstractC1533800q14 abstractC1533800q14, int i3) throws IOException {
        boolean z;
        Boolean boolValueOf;
        super(abstractC1533800q14, i3);
        this.LJI = "DiscreteMeta";
        int defaultPageSize = ForestExperiment.INSTANCE.getDefaultPageSize();
        this.LJII = defaultPageSize;
        this.LJIIIIZZ = bArr == null ? new byte[defaultPageSize] : bArr;
        this.LJIIIZ = i;
        RandomAccessFile randomAccessFile = null;
        if (abstractC1533800q14.LJIILL() != null) {
            boolValueOf = null;
        } else {
            if (enumC1534640q2Q == EnumC1534640q2Q.FORCE_WRITE_BACK) {
                z = true;
            } else {
                z = false;
            }
            boolValueOf = Boolean.valueOf(z);
        }
        this.LJIIJ = boolValueOf;
        this.LJIIJJI = this.LJIIIIZZ.length;
        this.LJIIL = new C1534910q2r(this.LJIIIIZZ);
        this.LJIIZILJ = Integer.MAX_VALUE;
        this.LJ = i2;
        this.LIZLLL = i;
        if (boolValueOf != null) {
            C1529710puT.LIZ.getClass();
            CDNFetcher.Companion.getClass();
            File fileLIZ = C1534430q25.LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(System.currentTimeMillis());
            sbLIZ.append('-');
            sbLIZ.append(UUID.randomUUID());
            sbLIZ.append("_tmp");
            sbLIZ.append("");
            C0VSJ c0vsj = new C0VSJ(fileLIZ, C2188811AlT.LIZIZ(sbLIZ));
            c0vsj.createNewFile();
            this.LJIILJJIL = c0vsj;
            randomAccessFile = new RandomAccessFile(this.LJIILJJIL, "rw");
        } else {
            this.LJIILIIL = Integer.MAX_VALUE;
        }
        this.LJIILL = randomAccessFile;
    }
}
