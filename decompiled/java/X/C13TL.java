package X;

import Y.ACallableS433S0100000_30;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.13TL, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13TL implements Closeable {
    public final File LL;
    public final C0VSJ LLILLJJLI;
    public final C0VSJ LLILLL;
    public final C0VSJ LLILZ;
    public final long LLILZLL;
    public long LLIZLLLIL;
    public Writer LLJ;
    public int LLJIJIL;
    public final Map<String, C13TM> LLJI = Collections.synchronizedMap(new LinkedHashMap(0, 0.75f, true));
    public long LLJILJIL = 0;
    public final C822650WOx LLJILJILJ = new C822650WOx(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: X.13TQ
        @Override // java.util.concurrent.ThreadFactory
        public final synchronized Thread newThread(Runnable runnable) {
            BPEAThread bPEAThread;
            bPEAThread = new BPEAThread(runnable, "glide-disk-lru-cache-thread");
            ThreadMethodProxy.setPriority(bPEAThread, 1);
            return bPEAThread;
        }
    });
    public final ACallableS433S0100000_30 LLJILLL = new ACallableS433S0100000_30(this, 7);
    public final int LLILZIL = 1;
    public final int LLIZ = 1;

    public final synchronized void LJIJJ() {
        Writer writer = this.LLJ;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new C0VSV(this.LLILLL), C08IG.LIZ));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.LLILZIL));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.LLIZ));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C13TM c13tm : this.LLJI.values()) {
                if (c13tm.LJFF != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("DIRTY ");
                    sbLIZ.append(c13tm.LIZ);
                    sbLIZ.append('\n');
                    bufferedWriter.write(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("CLEAN ");
                    sbLIZ2.append(c13tm.LIZ);
                    sbLIZ2.append(c13tm.LIZ());
                    sbLIZ2.append('\n');
                    bufferedWriter.write(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            bufferedWriter.close();
            if (this.LLILLJJLI.exists()) {
                LJIJJLI(this.LLILLJJLI, this.LLILZ, true);
            }
            LJIJJLI(this.LLILLL, this.LLILLJJLI, false);
            this.LLILZ.delete();
            this.LLJ = new BufferedWriter(new OutputStreamWriter(new C0VSV((File) this.LLILLJJLI, true), C08IG.LIZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            bufferedWriter.close();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.LLJ == null) {
            return;
        }
        Iterator it2 = new ArrayList(this.LLJI.values()).iterator();
        while (it2.hasNext()) {
            C13TO c13to = ((C13TM) it2.next()).LJFF;
            if (c13to != null) {
                c13to.LIZLLL.LIZ(c13to, false);
            }
        }
        LJJ();
        this.LLJ.close();
        this.LLJ = null;
    }

    public final boolean LJI() {
        int i = this.LLJIJIL;
        return i >= 2000 && i >= this.LLJI.size();
    }

    public final void LJIILL() throws IOException {
        LIZIZ(this.LLILLL);
        Iterator<C13TM> it2 = this.LLJI.values().iterator();
        while (it2.hasNext()) {
            C13TM next = it2.next();
            int i = 0;
            if (next.LJFF != null) {
                next.LJFF = null;
                while (i < this.LLIZ) {
                    LIZIZ(next.LIZJ[i]);
                    LIZIZ(next.LIZLLL[i]);
                    i++;
                }
                it2.remove();
            } else {
                while (i < this.LLIZ) {
                    this.LLIZLLLIL += next.LIZIZ[i];
                    i++;
                }
            }
        }
    }

    public final void LJIILLIIL() {
        C13TN c13tn = new C13TN(new C0VSP(this.LLILLJJLI), C08IG.LIZ);
        try {
            String strLIZIZ = c13tn.LIZIZ();
            String strLIZIZ2 = c13tn.LIZIZ();
            String strLIZIZ3 = c13tn.LIZIZ();
            String strLIZIZ4 = c13tn.LIZIZ();
            String strLIZIZ5 = c13tn.LIZIZ();
            if (!"libcore.io.DiskLruCache".equals(strLIZIZ) || !"1".equals(strLIZIZ2) || !Integer.toString(this.LLILZIL).equals(strLIZIZ3) || !Integer.toString(this.LLIZ).equals(strLIZIZ4) || !"".equals(strLIZIZ5)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unexpected journal header: [");
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(", ");
                sbLIZ.append(strLIZIZ2);
                sbLIZ.append(", ");
                sbLIZ.append(strLIZIZ4);
                sbLIZ.append(", ");
                sbLIZ.append(strLIZIZ5);
                sbLIZ.append(e3.f);
                throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
            }
            int i = 0;
            while (true) {
                try {
                    LJIIZILJ(c13tn.LIZIZ());
                    i++;
                } catch (EOFException e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.LLJIJIL = i - this.LLJI.size();
                    if (c13tn.LLILZIL == -1) {
                        LJIJJ();
                    } else {
                        this.LLJ = new BufferedWriter(new OutputStreamWriter(new C0VSV((File) this.LLILLJJLI, true), C08IG.LIZ));
                    }
                    try {
                        c13tn.close();
                        return;
                    } catch (RuntimeException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        throw e2;
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                c13tn.close();
                throw th;
            } catch (RuntimeException e4) {
                TryCatchGuardChecker.doCheck(e4);
                throw e4;
            } catch (Exception e5) {
                TryCatchGuardChecker.doCheck(e5);
                throw th;
            }
        }
    }

    public final void LJJ() {
        while (this.LLIZLLLIL > this.LLILZLL) {
            String key = this.LLJI.entrySet().iterator().next().getKey();
            synchronized (this) {
                if (this.LLJ == null) {
                    throw new IllegalStateException("cache is closed");
                }
                C13TM c13tm = this.LLJI.get(key);
                if (c13tm != null && c13tm.LJFF == null) {
                    for (int i = 0; i < this.LLIZ; i++) {
                        File file = c13tm.LIZJ[i];
                        if (file.exists() && !file.delete()) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("failed to delete ");
                            sbLIZ.append(file);
                            throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
                        }
                        long j = this.LLIZLLLIL;
                        long[] jArr = c13tm.LIZIZ;
                        this.LLIZLLLIL = j - jArr[i];
                        jArr[i] = 0;
                    }
                    this.LLJIJIL++;
                    this.LLJ.append((CharSequence) "REMOVE");
                    this.LLJ.append(' ');
                    this.LLJ.append((CharSequence) key);
                    this.LLJ.append('\n');
                    this.LLJI.remove(key);
                    if (LJI()) {
                        this.LLJILJILJ.submit(this.LLJILLL);
                    }
                }
            }
        }
    }

    public static void LIZIZ(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public final C13TO LIZLLL(String str) {
        synchronized (this) {
            if (this.LLJ != null) {
                C13TM c13tm = this.LLJI.get(str);
                if (c13tm == null) {
                    c13tm = new C13TM(this, str);
                    this.LLJI.put(str, c13tm);
                } else if (c13tm.LJFF != null) {
                    return null;
                }
                C13TO c13to = new C13TO(this, c13tm);
                c13tm.LJFF = c13to;
                this.LLJ.append((CharSequence) "DIRTY");
                this.LLJ.append(' ');
                this.LLJ.append((CharSequence) str);
                this.LLJ.append('\n');
                this.LLJ.flush();
                return c13to;
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized C13TR LJFF(String str) {
        if (this.LLJ != null) {
            C13TM c13tm = this.LLJI.get(str);
            if (c13tm == null) {
                return null;
            }
            if (!c13tm.LJ) {
                return null;
            }
            for (File file : c13tm.LIZJ) {
                if (!file.exists()) {
                    return null;
                }
            }
            this.LLJIJIL++;
            this.LLJ.append((CharSequence) "READ");
            this.LLJ.append(' ');
            this.LLJ.append((CharSequence) str);
            this.LLJ.append('\n');
            if (LJI()) {
                this.LLJILJILJ.submit(this.LLJILLL);
            }
            return new C13TR(c13tm.LIZJ);
        }
        throw new IllegalStateException("cache is closed");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(java.lang.String r8) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13TL.LJIIZILJ(java.lang.String):void");
    }

    public C13TL(File file, long j) {
        this.LL = file;
        this.LLILLJJLI = new C0VSJ(file, "journal");
        this.LLILLL = new C0VSJ(file, "journal.tmp");
        this.LLILZ = new C0VSJ(file, "journal.bkp");
        this.LLILZLL = j;
    }

    public static C13TL LJII(File file, long j) throws IOException {
        if (j > 0) {
            C0VSJ c0vsj = new C0VSJ(file, "journal.bkp");
            if (c0vsj.exists()) {
                C0VSJ c0vsj2 = new C0VSJ(file, "journal");
                if (c0vsj2.exists()) {
                    c0vsj.delete();
                } else {
                    LJIJJLI(c0vsj, c0vsj2, false);
                }
            }
            C13TL c13tl = new C13TL(file, j);
            if (c13tl.LLILLJJLI.exists()) {
                try {
                    c13tl.LJIILLIIL();
                    c13tl.LJIILL();
                    return c13tl;
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("DiskLruCache ");
                    sbLIZ.append(file);
                    sbLIZ.append(" is corrupt: ");
                    sbLIZ.append(e.getMessage());
                    sbLIZ.append(", removing");
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                    c13tl.close();
                    C08IG.LIZ(c13tl.LL);
                }
            }
            file.mkdirs();
            C13TL c13tl2 = new C13TL(file, j);
            c13tl2.LJIJJ();
            return c13tl2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final synchronized void LIZ(C13TO c13to, boolean z) {
        if (this.LLJ == null) {
            return;
        }
        C13TM c13tm = c13to.LIZ;
        if (c13tm.LJFF == c13to) {
            if (z && !c13tm.LJ) {
                for (int i = 0; i < this.LLIZ; i++) {
                    if (c13to.LIZIZ[i]) {
                        if (!c13tm.LIZLLL[i].exists()) {
                            c13to.LIZLLL.LIZ(c13to, false);
                            return;
                        }
                    } else {
                        c13to.LIZLLL.LIZ(c13to, false);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Newly created entry didn't create value for index ");
                        sbLIZ.append(i);
                        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            }
            for (int i2 = 0; i2 < this.LLIZ; i2++) {
                File file = c13tm.LIZLLL[i2];
                if (z) {
                    if (file.exists()) {
                        File file2 = c13tm.LIZJ[i2];
                        file.renameTo(file2);
                        long j = c13tm.LIZIZ[i2];
                        long length = file2.length();
                        c13tm.LIZIZ[i2] = length;
                        this.LLIZLLLIL = (this.LLIZLLLIL - j) + length;
                    }
                } else {
                    LIZIZ(file);
                }
            }
            this.LLJIJIL++;
            c13tm.LJFF = null;
            if (c13tm.LJ | z) {
                c13tm.LJ = true;
                this.LLJ.append((CharSequence) "CLEAN");
                this.LLJ.append(' ');
                this.LLJ.append((CharSequence) c13tm.LIZ);
                this.LLJ.append((CharSequence) c13tm.LIZ());
                this.LLJ.append('\n');
                if (z) {
                    this.LLJILJIL++;
                    c13tm.getClass();
                }
            } else {
                this.LLJI.remove(c13tm.LIZ);
                this.LLJ.append((CharSequence) "REMOVE");
                this.LLJ.append(' ');
                this.LLJ.append((CharSequence) c13tm.LIZ);
                this.LLJ.append('\n');
            }
            this.LLJ.flush();
            if (this.LLIZLLLIL > this.LLILZLL || LJI()) {
                this.LLJILJILJ.submit(this.LLJILLL);
            }
            return;
        }
        throw new IllegalStateException();
    }

    public static void LJIJJLI(C0VSJ c0vsj, C0VSJ c0vsj2, boolean z) throws IOException {
        if (z) {
            LIZIZ(c0vsj2);
        }
        if (c0vsj.renameTo(c0vsj2)) {
        } else {
            throw new IOException();
        }
    }
}
