package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0W1V, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W1V implements Closeable {
    public final File LL;
    public final C0VSJ LLILLJJLI;
    public final C0VSJ LLILLL;
    public final int LLILZ;
    public final long LLILZIL;
    public long LLIZ;
    public Writer LLIZLLLIL;
    public int LLJI;
    public final LinkedHashMap<String, C0W1U> LLJ = new LinkedHashMap<>(0, 0.75f, true);
    public long LLJIJIL = 0;
    public final ExecutorService LLJILJIL = C786410Ut5.h4();
    public final C0W1W LLJILJILJ = new Callable<Void>() { // from class: X.0W1W
        @Override // java.util.concurrent.Callable
        public final Void call() {
            C1C7U.LIZ("DiskLruCache@d04c.<field>$5");
            synchronized (this.LL) {
                try {
                    C0W1V c0w1v = this.LL;
                    if (c0w1v.LLIZLLLIL != null) {
                        c0w1v.LJJJJ();
                        if (this.LL.LJIILLIIL()) {
                            this.LL.LJJIZ();
                            this.LL.LLJI = 0;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C1C7U.LIZIZ("DiskLruCache@d04c.<field>$5");
            return null;
        }
    };
    public final int LLILZLL = 1;

    public final synchronized void LJJIZ() {
        Writer writer = this.LLIZLLLIL;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new C794210VDn(this.LLILLL), 8192);
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.LLILZ));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.LLILZLL));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (C0W1U c0w1u : this.LLJ.values()) {
            if (c0w1u.LIZLLL != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("DIRTY ");
                sbLIZ.append(c0w1u.LIZ);
                sbLIZ.append('\n');
                bufferedWriter.write(C2188811AlT.LIZIZ(sbLIZ));
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("CLEAN ");
                sbLIZ2.append(c0w1u.LIZ);
                sbLIZ2.append(c0w1u.LIZJ());
                sbLIZ2.append('\n');
                bufferedWriter.write(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        bufferedWriter.close();
        this.LLILLL.renameTo(this.LLILLJJLI);
        this.LLIZLLLIL = new BufferedWriter(new C794210VDn((File) this.LLILLJJLI, true), 8192);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.LLIZLLLIL == null) {
            return;
        }
        Iterator it2 = new ArrayList(this.LLJ.values()).iterator();
        while (it2.hasNext()) {
            C0W1T c0w1t = ((C0W1U) it2.next()).LIZLLL;
            if (c0w1t != null) {
                c0w1t.LIZJ.LIZLLL(c0w1t, false);
            }
        }
        LJJJJ();
        this.LLIZLLLIL.close();
        this.LLIZLLLIL = null;
    }

    public final synchronized void flush() {
        LIZ();
        LJJJJ();
        this.LLIZLLLIL.flush();
    }

    static {
        Charset.forName("UTF-8");
    }

    public final void LIZ() {
        if (this.LLIZLLLIL == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final boolean LJIILLIIL() {
        int i = this.LLJI;
        return i >= 2000 && i >= this.LLJ.size();
    }

    public final void LJIJJ() throws IOException {
        LJI(this.LLILLL);
        Iterator<C0W1U> it2 = this.LLJ.values().iterator();
        while (it2.hasNext()) {
            C0W1U next = it2.next();
            int i = 0;
            if (next.LIZLLL != null) {
                next.LIZLLL = null;
                while (i < this.LLILZLL) {
                    LJI(next.LIZ(i));
                    LJI(next.LIZIZ(i));
                    i++;
                }
                it2.remove();
            } else {
                while (i < this.LLILZLL) {
                    this.LLIZ += next.LIZIZ[i];
                    i++;
                }
            }
        }
    }

    public final void LJJ() {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new C0VSP(this.LLILLJJLI), 8192);
        try {
            String strLJIJJLI = LJIJJLI(bufferedInputStream);
            String strLJIJJLI2 = LJIJJLI(bufferedInputStream);
            String strLJIJJLI3 = LJIJJLI(bufferedInputStream);
            String strLJIJJLI4 = LJIJJLI(bufferedInputStream);
            String strLJIJJLI5 = LJIJJLI(bufferedInputStream);
            if (!"libcore.io.DiskLruCache".equals(strLJIJJLI) || !"1".equals(strLJIJJLI2) || !Integer.toString(this.LLILZ).equals(strLJIJJLI3) || !Integer.toString(this.LLILZLL).equals(strLJIJJLI4) || !"".equals(strLJIJJLI5)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unexpected journal header: [");
                sbLIZ.append(strLJIJJLI);
                sbLIZ.append(", ");
                sbLIZ.append(strLJIJJLI2);
                sbLIZ.append(", ");
                sbLIZ.append(strLJIJJLI4);
                sbLIZ.append(", ");
                sbLIZ.append(strLJIJJLI5);
                sbLIZ.append(e3.f);
                throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
            }
            while (true) {
                try {
                    LJJIL(LJIJJLI(bufferedInputStream));
                } catch (EOFException e) {
                    TryCatchGuardChecker.doCheck(e);
                    LIZIZ(bufferedInputStream);
                    return;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZIZ(bufferedInputStream);
            throw th;
        }
    }

    public final void LJJJJ() {
        while (this.LLIZ > this.LLILZIL) {
            LJJJ(this.LLJ.entrySet().iterator().next().getKey());
        }
    }

    public static void LIZIZ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public static void LJFF(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    LJFF(file2);
                }
                if (!file2.delete()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("failed to delete file: ");
                    sbLIZ.append(file2);
                    throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("not a directory: ");
        sbLIZ2.append(file);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static void LJI(C0VSJ c0vsj) throws IOException {
        if (c0vsj.exists() && !c0vsj.delete()) {
            throw new IOException();
        }
    }

    public static String LJIJJLI(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder(80);
        while (true) {
            int i = inputStream.read();
            if (i != -1) {
                if (i == 10) {
                    int length = sb.length();
                    if (length > 0) {
                        int i2 = length - 1;
                        if (sb.charAt(i2) == '\r') {
                            sb.setLength(i2);
                        }
                    }
                    return sb.toString();
                }
                sb.append((char) i);
            } else {
                throw new EOFException();
            }
        }
    }

    public static void LJJJJJ(String str) {
        if (!str.contains(" ") && !str.contains("\n") && !str.contains("\r")) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("keys must not contain spaces or newlines: \"");
        sbLIZ.append(str);
        sbLIZ.append("\"");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final C0W1T LJII(String str) {
        synchronized (this) {
            LIZ();
            LJJJJJ(str);
            C0W1U c0w1u = this.LLJ.get(str);
            if (c0w1u == null) {
                c0w1u = new C0W1U(this, str);
                this.LLJ.put(str, c0w1u);
            } else if (c0w1u.LIZLLL != null) {
                return null;
            }
            C0W1T c0w1t = new C0W1T(this, c0w1u);
            c0w1u.LIZLLL = c0w1t;
            Writer writer = this.LLIZLLLIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DIRTY ");
            sbLIZ.append(str);
            sbLIZ.append('\n');
            writer.write(C2188811AlT.LIZIZ(sbLIZ));
            this.LLIZLLLIL.flush();
            return c0w1t;
        }
    }

    public final synchronized C0W1X LJIILL(String str) {
        LIZ();
        LJJJJJ(str);
        C0W1U c0w1u = this.LLJ.get(str);
        if (c0w1u == null) {
            return null;
        }
        if (!c0w1u.LIZJ) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.LLILZLL];
        for (int i = 0; i < this.LLILZLL; i++) {
            try {
                inputStreamArr[i] = new C0VSP(c0w1u.LIZ(i));
            } catch (FileNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        this.LLJI++;
        Writer writer = this.LLIZLLLIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("READ ");
        sbLIZ.append(str);
        sbLIZ.append('\n');
        writer.append((CharSequence) C2188811AlT.LIZIZ(sbLIZ));
        if (LJIILLIIL()) {
            this.LLJILJIL.submit(this.LLJILJILJ);
        }
        return new C0W1X(inputStreamArr);
    }

    public final void LJJIL(String str) throws IOException {
        String[] strArrSplit = str.split(" ");
        if (strArrSplit.length >= 2) {
            String str2 = strArrSplit[1];
            if (strArrSplit[0].equals("REMOVE") && strArrSplit.length == 2) {
                this.LLJ.remove(str2);
                return;
            }
            C0W1U c0w1u = this.LLJ.get(str2);
            if (c0w1u == null) {
                c0w1u = new C0W1U(this, str2);
                this.LLJ.put(str2, c0w1u);
            }
            if (strArrSplit[0].equals("CLEAN") && strArrSplit.length == this.LLILZLL + 2) {
                c0w1u.LIZJ = true;
                c0w1u.LIZLLL = null;
                int length = strArrSplit.length;
                int length2 = strArrSplit.length;
                if (2 <= length) {
                    if (2 <= length2) {
                        int i = length - 2;
                        int iMin = Math.min(i, length2 - 2);
                        Object[] objArr = (Object[]) Array.newInstance(strArrSplit.getClass().getComponentType(), i);
                        System.arraycopy(strArrSplit, 2, objArr, 0, iMin);
                        String[] strArr = (String[]) objArr;
                        if (strArr.length != c0w1u.LJ.LLILZLL) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("unexpected journal line: ");
                            sbLIZ.append(Arrays.toString(strArr));
                            throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
                        }
                        for (int i2 = 0; i2 < strArr.length; i2++) {
                            try {
                                c0w1u.LIZIZ[i2] = CastLongProtector.parseLong(strArr[i2]);
                            } catch (NumberFormatException e) {
                                TryCatchGuardChecker.doCheck(e);
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("unexpected journal line: ");
                                sbLIZ2.append(Arrays.toString(strArr));
                                throw new IOException(C2188811AlT.LIZIZ(sbLIZ2));
                            }
                        }
                        return;
                    }
                    throw new ArrayIndexOutOfBoundsException();
                }
                throw new IllegalArgumentException();
            }
            if (strArrSplit[0].equals("DIRTY") && strArrSplit.length == 2) {
                c0w1u.LIZLLL = new C0W1T(this, c0w1u);
                return;
            } else {
                if (strArrSplit[0].equals("READ") && strArrSplit.length == 2) {
                    return;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("unexpected journal line: ");
                sbLIZ3.append(str);
                throw new IOException(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("unexpected journal line: ");
        sbLIZ4.append(str);
        throw new IOException(C2188811AlT.LIZIZ(sbLIZ4));
    }

    public final synchronized void LJJJ(String str) {
        LIZ();
        LJJJJJ(str);
        C0W1U c0w1u = this.LLJ.get(str);
        if (c0w1u != null && c0w1u.LIZLLL == null) {
            for (int i = 0; i < this.LLILZLL; i++) {
                C0VSJ c0vsjLIZ = c0w1u.LIZ(i);
                if (c0vsjLIZ.delete()) {
                    long j = this.LLIZ;
                    long[] jArr = c0w1u.LIZIZ;
                    this.LLIZ = j - jArr[i];
                    jArr[i] = 0;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("failed to delete ");
                    sbLIZ.append(c0vsjLIZ);
                    throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            this.LLJI++;
            Writer writer = this.LLIZLLLIL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("REMOVE ");
            sbLIZ2.append(str);
            sbLIZ2.append('\n');
            writer.append((CharSequence) C2188811AlT.LIZIZ(sbLIZ2));
            this.LLJ.remove(str);
            if (LJIILLIIL()) {
                this.LLJILJIL.submit(this.LLJILJILJ);
            }
        }
    }

    public final synchronized void LIZLLL(C0W1T c0w1t, boolean z) {
        C0W1U c0w1u = c0w1t.LIZ;
        if (c0w1u.LIZLLL == c0w1t) {
            if (z && !c0w1u.LIZJ) {
                for (int i = 0; i < this.LLILZLL; i++) {
                    if (!c0w1u.LIZIZ(i).exists()) {
                        c0w1t.LIZJ.LIZLLL(c0w1t, false);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("edit didn't create file ");
                        sbLIZ.append(i);
                        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            }
            for (int i2 = 0; i2 < this.LLILZLL; i2++) {
                C0VSJ c0vsjLIZIZ = c0w1u.LIZIZ(i2);
                if (z) {
                    if (c0vsjLIZIZ.exists()) {
                        C0VSJ c0vsjLIZ = c0w1u.LIZ(i2);
                        c0vsjLIZIZ.renameTo(c0vsjLIZ);
                        long j = c0w1u.LIZIZ[i2];
                        long length = c0vsjLIZ.length();
                        c0w1u.LIZIZ[i2] = length;
                        this.LLIZ = (this.LLIZ - j) + length;
                    }
                } else {
                    LJI(c0vsjLIZIZ);
                }
            }
            this.LLJI++;
            c0w1u.LIZLLL = null;
            if (c0w1u.LIZJ | z) {
                c0w1u.LIZJ = true;
                Writer writer = this.LLIZLLLIL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("CLEAN ");
                sbLIZ2.append(c0w1u.LIZ);
                sbLIZ2.append(c0w1u.LIZJ());
                sbLIZ2.append('\n');
                writer.write(C2188811AlT.LIZIZ(sbLIZ2));
                if (z) {
                    this.LLJIJIL++;
                    c0w1u.getClass();
                }
            } else {
                this.LLJ.remove(c0w1u.LIZ);
                Writer writer2 = this.LLIZLLLIL;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("REMOVE ");
                sbLIZ3.append(c0w1u.LIZ);
                sbLIZ3.append('\n');
                writer2.write(C2188811AlT.LIZIZ(sbLIZ3));
            }
            if (this.LLIZ > this.LLILZIL || LJIILLIIL()) {
                this.LLJILJIL.submit(this.LLJILJILJ);
            }
        } else {
            throw new IllegalStateException();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0W1W] */
    public C0W1V(C0VSJ c0vsj, int i, long j) {
        this.LL = c0vsj;
        this.LLILZ = i;
        this.LLILLJJLI = new C0VSJ(c0vsj, "journal");
        this.LLILLL = new C0VSJ(c0vsj, "journal.tmp");
        this.LLILZIL = j;
    }

    public static C0W1V LJIIZILJ(C0VSJ c0vsj, int i, long j) throws IOException {
        if (j > 0) {
            C0W1V c0w1v = new C0W1V(c0vsj, i, j);
            if (c0w1v.LLILLJJLI.exists()) {
                try {
                    c0w1v.LJJ();
                    c0w1v.LJIJJ();
                    c0w1v.LLIZLLLIL = new BufferedWriter(new C794210VDn((File) c0w1v.LLILLJJLI, true), 8192);
                    return c0w1v;
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    c0w1v.close();
                    LJFF(c0w1v.LL);
                }
            }
            c0vsj.mkdirs();
            C0W1V c0w1v2 = new C0W1V(c0vsj, i, j);
            c0w1v2.LJJIZ();
            return c0w1v2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }
}
