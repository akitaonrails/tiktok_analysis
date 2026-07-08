package X;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08QK, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08QK extends C08QL<File> {
    public final ArrayDeque<C08QN> LLILLL;
    public final /* synthetic */ C08QE LLILZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.io.File, java.lang.Object] */
    @Override // X.C08QL
    public final void LIZ() {
        ?? LIZ;
        while (true) {
            C08QN c08qnPeek = this.LLILLL.peek();
            if (c08qnPeek == null) {
                this.LL = 2;
                return;
            }
            LIZ = c08qnPeek.LIZ();
            if (LIZ == 0) {
                this.LLILLL.pop();
            } else if (Intrinsics.LJFF(LIZ, c08qnPeek.LIZ) || !LIZ.isDirectory() || this.LLILLL.size() >= this.LLILZ.LJFF) {
                break;
            } else {
                this.LLILLL.push(LIZIZ(LIZ));
            }
        }
        this.LLILLJJLI = LIZ;
        this.LL = 1;
    }

    public C08QK(C08QE c08qe) {
        this.LLILZ = c08qe;
        ArrayDeque<C08QN> arrayDeque = new ArrayDeque<>();
        this.LLILLL = arrayDeque;
        if (c08qe.LIZ.isDirectory()) {
            arrayDeque.push(LIZIZ(c08qe.LIZ));
        } else if (c08qe.LIZ.isFile()) {
            final File file = c08qe.LIZ;
            arrayDeque.push(new C08QN(file) { // from class: X.08QM
                public boolean LIZIZ;

                @Override // X.C08QN
                public final File LIZ() {
                    if (this.LIZIZ) {
                        return null;
                    }
                    this.LIZIZ = true;
                    return this.LIZ;
                }
            });
        } else {
            this.LL = 2;
        }
    }

    public final C08QJ LIZIZ(final File file) {
        int i = C08QF.LIZ[this.LLILZ.LIZIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new C08QJ(file) { // from class: X.08QH
                    public boolean LIZIZ;
                    public File[] LIZJ;
                    public int LIZLLL;
                    public boolean LJ;

                    @Override // X.C08QN
                    public final File LIZ() {
                        int i2;
                        if (!this.LJ && this.LIZJ == null) {
                            Function1<File, Boolean> function1 = this.LJFF.LLILZ.LIZJ;
                            if (function1 != null && !function1.invoke(this.LIZ).booleanValue()) {
                                return null;
                            }
                            File[] fileArrListFiles = this.LIZ.listFiles();
                            this.LIZJ = fileArrListFiles;
                            if (fileArrListFiles == null) {
                                Function2<File, IOException, Unit> function2 = this.LJFF.LLILZ.LJ;
                                if (function2 != null) {
                                    function2.invoke(this.LIZ, new C08NN(this.LIZ, null, "Cannot list files in a directory", 2, null));
                                }
                                this.LJ = true;
                            }
                        }
                        File[] fileArr = this.LIZJ;
                        if (fileArr != null && (i2 = this.LIZLLL) < fileArr.length) {
                            this.LIZLLL = i2 + 1;
                            return fileArr[i2];
                        }
                        if (!this.LIZIZ) {
                            this.LIZIZ = true;
                            return this.LIZ;
                        }
                        Function1<File, Unit> function12 = this.LJFF.LLILZ.LIZLLL;
                        if (function12 != null) {
                            function12.invoke(this.LIZ);
                        }
                        return null;
                    }
                };
            }
            throw new C1954807lC();
        }
        return new C08QJ(file) { // from class: X.08QI
            public boolean LIZIZ;
            public File[] LIZJ;
            public int LIZLLL;

            @Override // X.C08QN
            public final File LIZ() {
                Function2<File, IOException, Unit> function2;
                if (!this.LIZIZ) {
                    Function1<File, Boolean> function1 = this.LJ.LLILZ.LIZJ;
                    if (function1 != null && !function1.invoke(this.LIZ).booleanValue()) {
                        return null;
                    }
                    this.LIZIZ = true;
                    return this.LIZ;
                }
                File[] fileArr = this.LIZJ;
                if (fileArr == null) {
                    File[] fileArrListFiles = this.LIZ.listFiles();
                    this.LIZJ = fileArrListFiles;
                    if (fileArrListFiles == null && (function2 = this.LJ.LLILZ.LJ) != null) {
                        function2.invoke(this.LIZ, new C08NN(this.LIZ, null, "Cannot list files in a directory", 2, null));
                    }
                    File[] fileArr2 = this.LIZJ;
                    if (fileArr2 == null || fileArr2.length == 0) {
                        Function1<File, Unit> function12 = this.LJ.LLILZ.LIZLLL;
                        if (function12 != null) {
                            function12.invoke(this.LIZ);
                        }
                        return null;
                    }
                } else if (this.LIZLLL >= fileArr.length) {
                    Function1<File, Unit> function13 = this.LJ.LLILZ.LIZLLL;
                    if (function13 != null) {
                        function13.invoke(this.LIZ);
                    }
                    return null;
                }
                File[] fileArr3 = this.LIZJ;
                int i2 = this.LIZLLL;
                this.LIZLLL = i2 + 1;
                return fileArr3[i2];
            }
        };
    }
}
