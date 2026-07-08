package androidx.emoji2.text;

import X.AbstractC20101313kx;
import X.AbstractC20139313r5;
import X.AbstractC21403418pU;
import X.C08IF;
import X.C14IP;
import X.C20139713r9;
import X.C21403018pQ;
import X.C21403318pT;
import X.C21404118pb;
import X.C21404318pd;
import X.C786410Ut5;
import X.C835410Wpv;
import X.InterfaceC20139113r3;
import X.InterfaceC21405018pk;
import X.RunnableC20101213kw;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes33.dex */
public class e {
    public static final Object LJIIIZ = new Object();
    public static volatile e LJIIJ;
    public final ReadWriteLock LIZ;
    public final C835410Wpv LIZIZ;
    public volatile int LIZJ;
    public final Handler LIZLLL;
    public final C21403018pQ LJ;
    public final InterfaceC20139113r3 LJFF;
    public final C21404318pd LJI;
    public final int LJII;
    public final C14IP LJIIIIZZ;

    public static e LIZ() {
        e eVar;
        synchronized (LJIIIZ) {
            try {
                eVar = LJIIJ;
                if (!(eVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return eVar;
    }

    public static boolean LJ() {
        return LJIIJ != null;
    }

    public final int LIZJ() {
        this.LIZ.readLock().lock();
        try {
            int i = this.LIZJ;
            this.LIZ.readLock().unlock();
            return i;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.readLock().unlock();
            throw th;
        }
    }

    public final void LJFF() {
        if (this.LJII != 1) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (LIZJ() == 1) {
            return;
        }
        ((ReentrantReadWriteLock) this.LIZ).writeLock().lock();
        try {
            if (this.LIZJ == 0) {
                ((ReentrantReadWriteLock) this.LIZ).writeLock().unlock();
                return;
            }
            this.LIZJ = 0;
            ((ReentrantReadWriteLock) this.LIZ).writeLock().unlock();
            this.LJ.LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((ReentrantReadWriteLock) this.LIZ).writeLock().unlock();
            throw th;
        }
    }

    public final void LJII() {
        ArrayList arrayList = new ArrayList();
        ((ReentrantReadWriteLock) this.LIZ).writeLock().lock();
        try {
            this.LIZJ = 1;
            arrayList.addAll(this.LIZIZ);
            this.LIZIZ.clear();
            ((ReentrantReadWriteLock) this.LIZ).writeLock().unlock();
            C786410Ut5.LJJZZIII(this.LIZLLL, new RunnableC20101213kw(arrayList, this.LIZJ, null));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((ReentrantReadWriteLock) this.LIZ).writeLock().unlock();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.18pd] */
    public e(AbstractC20139313r5 abstractC20139313r5) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.LIZ = reentrantReadWriteLock;
        this.LIZJ = 3;
        this.LJFF = abstractC20139313r5.LIZ;
        int i = abstractC20139313r5.LIZIZ;
        this.LJII = i;
        this.LJIIIIZZ = abstractC20139313r5.LIZJ;
        this.LIZLLL = new Handler(Looper.getMainLooper());
        this.LIZIZ = new C835410Wpv();
        this.LJI = new InterfaceC21405018pk() { // from class: X.18pd
        };
        C21403018pQ c21403018pQ = new C21403018pQ(this);
        this.LJ = c21403018pQ;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.LIZJ = 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                ((ReentrantReadWriteLock) this.LIZ).writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (LIZJ() == 0) {
            c21403018pQ.LIZ();
        }
    }

    public static void LIZLLL(AbstractC20139313r5 abstractC20139313r5) {
        if (LJIIJ == null) {
            synchronized (LJIIIZ) {
                try {
                    if (LJIIJ == null) {
                        LJIIJ = new e(abstractC20139313r5);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final void LJI(Throwable th) {
        ArrayList arrayList = new ArrayList();
        ((ReentrantReadWriteLock) this.LIZ).writeLock().lock();
        try {
            this.LIZJ = 2;
            arrayList.addAll(this.LIZIZ);
            this.LIZIZ.clear();
            ((ReentrantReadWriteLock) this.LIZ).writeLock().unlock();
            C786410Ut5.LJJZZIII(this.LIZLLL, new RunnableC20101213kw(arrayList, this.LIZJ, th));
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            ((ReentrantReadWriteLock) this.LIZ).writeLock().unlock();
            throw th2;
        }
    }

    public final CharSequence LJIIIZ(CharSequence charSequence) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        return LJIIIIZZ(0, length, charSequence, 0);
    }

    public final void LJIIJ(AbstractC20101313kx abstractC20101313kx) {
        C08IF.LIZLLL(abstractC20101313kx, "initCallback cannot be null");
        ((ReentrantReadWriteLock) this.LIZ).writeLock().lock();
        try {
            if (this.LIZJ != 1 && this.LIZJ != 2) {
                this.LIZIZ.add(abstractC20101313kx);
            } else {
                C786410Ut5.LJJZZIII(this.LIZLLL, new RunnableC20101213kw(Arrays.asList(abstractC20101313kx), this.LIZJ, null));
            }
            ((ReentrantReadWriteLock) this.LIZ).writeLock().unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((ReentrantReadWriteLock) this.LIZ).writeLock().unlock();
            throw th;
        }
    }

    public final void LJIIJJI(EditorInfo editorInfo) {
        int i;
        if (LIZJ() == 1 && editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            C21403018pQ c21403018pQ = this.LJ;
            c21403018pQ.getClass();
            Bundle bundle = editorInfo.extras;
            C20139713r9 c20139713r9 = c21403018pQ.LIZJ.LIZ;
            int iLIZ = c20139713r9.LIZ(4);
            if (iLIZ != 0) {
                i = c20139713r9.LIZIZ.getInt(iLIZ + c20139713r9.LIZ);
            } else {
                i = 0;
            }
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i);
            Bundle bundle2 = editorInfo.extras;
            c21403018pQ.LIZ.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    public final int LIZIZ(int i, CharSequence charSequence) {
        C21403318pT c21403318pT = this.LJ.LIZIZ;
        c21403318pT.getClass();
        if (i >= 0 && i < charSequence.length()) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                AbstractC21403418pU[] abstractC21403418pUArr = (AbstractC21403418pU[]) spanned.getSpans(i, i + 1, AbstractC21403418pU.class);
                if (abstractC21403418pUArr.length > 0) {
                    return spanned.getSpanStart(abstractC21403418pUArr[0]);
                }
            }
            return ((C21404118pb) c21403318pT.LIZJ(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new C21404118pb(i))).LIZIZ;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0081 A[Catch: all -> 0x00e5, TryCatch #0 {all -> 0x00e5, blocks: (B:42:0x0081, B:44:0x008b, B:46:0x0095, B:48:0x0098, B:50:0x009b, B:52:0x00a7, B:53:0x00aa, B:55:0x00b7, B:57:0x00bd, B:59:0x00cf, B:35:0x0064, B:37:0x0068, B:39:0x006c, B:41:0x007b), top: B:80:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence LJIIIIZZ(int r16, int r17, java.lang.CharSequence r18, int r19) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.e.LJIIIIZZ(int, int, java.lang.CharSequence, int):java.lang.CharSequence");
    }
}
