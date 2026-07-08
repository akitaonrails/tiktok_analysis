package X;

import Y.ACallableS433S0100000_30;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.13TF, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13TF implements Closeable {
    public static final Pattern LLJJ = PatternProtector.compile("[a-z0-9_-]{1,120}");
    public static final C13TK LLJJI = new OutputStream() { // from class: X.13TK
        @Override // java.io.OutputStream
        public final void write(int i) {
        }
    };
    public final File LL;
    public final C0VSJ LLILLJJLI;
    public final C0VSJ LLILLL;
    public final C0VSJ LLILZ;
    public long LLIZLLLIL;
    public Writer LLJ;
    public int LLJIJIL;
    public final LinkedHashMap<String, C13TH> LLJI = new LinkedHashMap<>(0, 0.75f, true);
    public long LLJILJIL = 0;
    public final C822650WOx LLJILJILJ = new C822650WOx(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public final ACallableS433S0100000_30 LLJILLL = new ACallableS433S0100000_30(this, 4);
    public final int LLILZIL = 100;
    public final int LLIZ = 1;
    public final long LLILZLL = 400;

    public final synchronized void LJIJJ() {
        Writer writer = this.LLJ;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new C0VSV(this.LLILLL), C08IH.LIZ));
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
            for (C13TH c13th : this.LLJI.values()) {
                if (c13th.LIZLLL != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("DIRTY ");
                    sbLIZ.append(c13th.LIZ);
                    sbLIZ.append('\n');
                    bufferedWriter.write(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("CLEAN ");
                    sbLIZ2.append(c13th.LIZ);
                    sbLIZ2.append(c13th.LIZJ());
                    sbLIZ2.append('\n');
                    bufferedWriter.write(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            bufferedWriter.close();
            if (this.LLILLJJLI.exists()) {
                LJJ(this.LLILLJJLI, this.LLILZ, true);
            }
            LJJ(this.LLILLL, this.LLILLJJLI, false);
            this.LLILZ.delete();
            this.LLJ = new BufferedWriter(new OutputStreamWriter(new C0VSV((File) this.LLILLJJLI, true), C08IH.LIZ));
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
            C13TG c13tg = ((C13TH) it2.next()).LIZLLL;
            if (c13tg != null) {
                c13tg.LIZ();
            }
        }
        LJJIL();
        this.LLJ.close();
        this.LLJ = null;
    }

    public final boolean LJI() {
        int i = this.LLJIJIL;
        return i >= 2000 && i >= this.LLJI.size();
    }

    public final void LJIILL() throws IOException {
        LIZIZ(this.LLILLL);
        Iterator<C13TH> it2 = this.LLJI.values().iterator();
        while (it2.hasNext()) {
            C13TH next = it2.next();
            int i = 0;
            if (next.LIZLLL != null) {
                next.LIZLLL = null;
                while (i < this.LLIZ) {
                    LIZIZ(next.LIZ(i));
                    LIZIZ(next.LIZIZ(i));
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
        C13TI c13ti = new C13TI(new C0VSP(this.LLILLJJLI), C08IH.LIZ);
        try {
            String strLIZ = c13ti.LIZ();
            String strLIZ2 = c13ti.LIZ();
            String strLIZ3 = c13ti.LIZ();
            String strLIZ4 = c13ti.LIZ();
            String strLIZ5 = c13ti.LIZ();
            if (!"libcore.io.DiskLruCache".equals(strLIZ) || !"1".equals(strLIZ2) || !Integer.toString(this.LLILZIL).equals(strLIZ3) || !Integer.toString(this.LLIZ).equals(strLIZ4) || !"".equals(strLIZ5)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unexpected journal header: [");
                sbLIZ.append(strLIZ);
                sbLIZ.append(", ");
                sbLIZ.append(strLIZ2);
                sbLIZ.append(", ");
                sbLIZ.append(strLIZ4);
                sbLIZ.append(", ");
                sbLIZ.append(strLIZ5);
                sbLIZ.append(e3.f);
                throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
            }
            int i = 0;
            while (true) {
                try {
                    LJIIZILJ(c13ti.LIZ());
                    i++;
                } catch (EOFException e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.LLJIJIL = i - this.LLJI.size();
                    if (c13ti.LLILZIL == -1) {
                        LJIJJ();
                    } else {
                        this.LLJ = new BufferedWriter(new OutputStreamWriter(new C0VSV((File) this.LLILLJJLI, true), C08IH.LIZ));
                    }
                    C08IH.LIZ(c13ti);
                    return;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C08IH.LIZ(c13ti);
            throw th;
        }
    }

    public final void LJJIL() {
        while (this.LLIZLLLIL > this.LLILZLL) {
            LJIJJLI(this.LLJI.entrySet().iterator().next().getKey());
        }
    }

    public C13TF(C0VSJ c0vsj) {
        this.LL = c0vsj;
        this.LLILLJJLI = new C0VSJ(c0vsj, "journal");
        this.LLILLL = new C0VSJ(c0vsj, "journal.tmp");
        this.LLILZ = new C0VSJ(c0vsj, "journal.bkp");
    }

    public static void LIZIZ(C0VSJ c0vsj) throws IOException {
        if (c0vsj.exists() && !c0vsj.delete()) {
            throw new IOException();
        }
    }

    public static C13TF LJII(C0VSJ c0vsj) throws IOException {
        C0VSJ c0vsj2 = new C0VSJ(c0vsj, "journal.bkp");
        if (c0vsj2.exists()) {
            C0VSJ c0vsj3 = new C0VSJ(c0vsj, "journal");
            if (c0vsj3.exists()) {
                c0vsj2.delete();
            } else {
                LJJ(c0vsj2, c0vsj3, false);
            }
        }
        C13TF c13tf = new C13TF(c0vsj);
        if (c13tf.LLILLJJLI.exists()) {
            try {
                c13tf.LJIILLIIL();
                c13tf.LJIILL();
                return c13tf;
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                c13tf.close();
                C08IH.LIZIZ(c13tf.LL);
            }
        }
        c0vsj.mkdirs();
        C13TF c13tf2 = new C13TF(c0vsj);
        c13tf2.LJIJJ();
        return c13tf2;
    }

    public static void LJJIZ(String str) {
        if (LLJJ.matcher(str).matches()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("keys must match regex [a-z0-9_-]{1,120}: \"");
        sbLIZ.append(str);
        sbLIZ.append("\"");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final C13TG LIZLLL(String str) {
        synchronized (this) {
            if (this.LLJ != null) {
                LJJIZ(str);
                C13TH c13th = this.LLJI.get(str);
                if (c13th == null) {
                    c13th = new C13TH(this, str);
                    this.LLJI.put(str, c13th);
                } else if (c13th.LIZLLL != null) {
                    return null;
                }
                C13TG c13tg = new C13TG(this, c13th);
                c13th.LIZLLL = c13tg;
                Writer writer = this.LLJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("DIRTY ");
                sbLIZ.append(str);
                sbLIZ.append('\n');
                writer.write(C2188811AlT.LIZIZ(sbLIZ));
                this.LLJ.flush();
                return c13tg;
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized C2478909nX LJFF(String str) {
        InputStream inputStream;
        if (this.LLJ != null) {
            LJJIZ(str);
            C13TH c13th = this.LLJI.get(str);
            if (c13th == null) {
                return null;
            }
            if (!c13th.LIZJ) {
                return null;
            }
            InputStream[] inputStreamArr = new InputStream[this.LLIZ];
            for (int i = 0; i < this.LLIZ; i++) {
                try {
                    inputStreamArr[i] = new C0VSP(c13th.LIZ(i));
                } catch (FileNotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    for (int i2 = 0; i2 < this.LLIZ && (inputStream = inputStreamArr[i2]) != null; i2++) {
                        C08IH.LIZ(inputStream);
                    }
                    return null;
                }
            }
            this.LLJIJIL++;
            Writer writer = this.LLJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("READ ");
            sbLIZ.append(str);
            sbLIZ.append('\n');
            writer.append((CharSequence) C2188811AlT.LIZIZ(sbLIZ));
            if (LJI()) {
                this.LLJILJILJ.submit(this.LLJILLL);
            }
            return new C2478909nX(inputStreamArr);
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
        throw new UnsupportedOperationException("Method not decompiled: X.C13TF.LJIIZILJ(java.lang.String):void");
    }

    public final synchronized void LJIJJLI(String str) {
        if (this.LLJ != null) {
            LJJIZ(str);
            C13TH c13th = this.LLJI.get(str);
            if (c13th != null && c13th.LIZLLL == null) {
                for (int i = 0; i < this.LLIZ; i++) {
                    C0VSJ c0vsjLIZ = c13th.LIZ(i);
                    if (c0vsjLIZ.exists() && !c0vsjLIZ.delete()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("failed to delete ");
                        sbLIZ.append(c0vsjLIZ);
                        throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    long j = this.LLIZLLLIL;
                    long[] jArr = c13th.LIZIZ;
                    this.LLIZLLLIL = j - jArr[i];
                    jArr[i] = 0;
                }
                this.LLJIJIL++;
                Writer writer = this.LLJ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("REMOVE ");
                sbLIZ2.append(str);
                sbLIZ2.append('\n');
                writer.append((CharSequence) C2188811AlT.LIZIZ(sbLIZ2));
                this.LLJI.remove(str);
                if (LJI()) {
                    this.LLJILJILJ.submit(this.LLJILLL);
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("cache is closed");
    }

    public final synchronized void LIZ(C13TG c13tg, boolean z) {
        C13TH c13th = c13tg.LIZ;
        if (c13th.LIZLLL == c13tg) {
            if (z && !c13th.LIZJ) {
                for (int i = 0; i < this.LLIZ; i++) {
                    if (c13tg.LIZIZ[i]) {
                        if (!c13th.LIZIZ(i).exists()) {
                            c13tg.LIZ();
                            return;
                        }
                    } else {
                        c13tg.LIZ();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Newly created entry didn't create value for index ");
                        sbLIZ.append(i);
                        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            }
            for (int i2 = 0; i2 < this.LLIZ; i2++) {
                C0VSJ c0vsjLIZIZ = c13th.LIZIZ(i2);
                if (z) {
                    if (c0vsjLIZIZ.exists()) {
                        C0VSJ c0vsjLIZ = c13th.LIZ(i2);
                        c0vsjLIZIZ.renameTo(c0vsjLIZ);
                        long j = c13th.LIZIZ[i2];
                        long length = c0vsjLIZ.length();
                        c13th.LIZIZ[i2] = length;
                        this.LLIZLLLIL = (this.LLIZLLLIL - j) + length;
                    }
                } else {
                    LIZIZ(c0vsjLIZIZ);
                }
            }
            this.LLJIJIL++;
            c13th.LIZLLL = null;
            if (c13th.LIZJ | z) {
                c13th.LIZJ = true;
                Writer writer = this.LLJ;
                if (writer != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("CLEAN ");
                    sbLIZ2.append(c13th.LIZ);
                    sbLIZ2.append(c13th.LIZJ());
                    sbLIZ2.append('\n');
                    writer.write(C2188811AlT.LIZIZ(sbLIZ2));
                }
                if (z) {
                    this.LLJILJIL++;
                    c13th.getClass();
                }
            } else {
                this.LLJI.remove(c13th.LIZ);
                Writer writer2 = this.LLJ;
                if (writer2 != null) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("REMOVE ");
                    sbLIZ3.append(c13th.LIZ);
                    sbLIZ3.append('\n');
                    writer2.write(C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
            Writer writer3 = this.LLJ;
            if (writer3 != null) {
                writer3.flush();
            }
            if (this.LLIZLLLIL > this.LLILZLL || LJI()) {
                this.LLJILJILJ.submit(this.LLJILLL);
            }
            return;
        }
        throw new IllegalStateException();
    }

    public static void LJJ(C0VSJ c0vsj, C0VSJ c0vsj2, boolean z) throws IOException {
        if (z) {
            LIZIZ(c0vsj2);
        }
        if (c0vsj.renameTo(c0vsj2)) {
        } else {
            throw new IOException();
        }
    }
}
