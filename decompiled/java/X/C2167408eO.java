package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.soloader.SysUtil;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.08eO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2167408eO extends AbstractC2167908eT {
    public final Map<String, Set<String>> LIZ;
    public final Set<String> LIZIZ;
    public final File LIZJ;

    @Override // X.AbstractC2167908eT
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C2167408eO.class.getName());
        sbLIZ.append("[root = ");
        StringBuilder sb = new StringBuilder(e3.h);
        Iterator<String> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            sb.append(", ");
        }
        sb.append(')');
        sbLIZ.append(sb.toString());
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2167408eO(C0VSJ c0vsj) {
        this.LIZ = new HashMap();
        String name = c0vsj.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        this.LIZIZ = LIZJ(iLastIndexOf > 0 ? name.substring(0, iLastIndexOf) : name);
        this.LIZJ = c0vsj;
    }

    public static Set<String> LIZJ(String str) {
        HashSet hashSet = new HashSet();
        String strLIZ = SysUtil.Api14Utils.LIZ();
        if (strLIZ != null) {
            for (String str2 : strLIZ.split(":")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(".apk!/");
                if (str2.contains(C2188811AlT.LIZIZ(sbLIZ))) {
                    hashSet.add(str2);
                }
            }
        }
        return hashSet;
    }

    @Override // X.AbstractC2167908eT
    public final void LIZIZ(int i) throws IOException {
        int iIndexOf;
        int i2;
        String strSubstring = null;
        for (String str : (HashSet) this.LIZIZ) {
            if (!TextUtils.isEmpty(str) && (iIndexOf = str.indexOf(33)) >= 0 && (i2 = iIndexOf + 2) < str.length()) {
                strSubstring = str.substring(i2);
            }
            if (!TextUtils.isEmpty(strSubstring)) {
                C09NU c09nu = new C09NU(this.LIZJ);
                try {
                    Enumeration<? extends ZipEntry> enumerationEntries = c09nu.entries();
                    while (enumerationEntries.hasMoreElements()) {
                        ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                        if (zipEntryNextElement != null && zipEntryNextElement.getName().startsWith(strSubstring) && zipEntryNextElement.getName().endsWith(".so") && zipEntryNextElement.getMethod() == 0) {
                            String strSubstring2 = zipEntryNextElement.getName().substring(strSubstring.length() + 1);
                            synchronized (this) {
                                if (!((HashMap) this.LIZ).containsKey(str)) {
                                    ((HashMap) this.LIZ).put(str, new HashSet());
                                }
                                ((Set) ((HashMap) this.LIZ).get(str)).add(strSubstring2);
                            }
                        }
                    }
                    c09nu.close();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    try {
                        c09nu.close();
                        throw th;
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
        }
    }

    public C2167408eO(Context context) {
        this.LIZ = new HashMap();
        this.LIZIZ = LIZJ("");
        this.LIZJ = new C0VSJ(context.getApplicationInfo().sourceDir);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        r4 = new X.C2168308eX(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        r3 = X.C2167708eR.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r3 == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        com.facebook.soloader.Api18TraceUtils.LIZ("SoLoader.getElfDependencies[", r12, ttpobfuscated.e3.f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        r8 = X.C2222708nJ.LIZ(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r3 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        android.os.Trace.endSection();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        r6 = r8.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        if (r5 >= r6) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0082, code lost:
    
        r3 = r8[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        monitor-enter(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
    
        r1 = ((java.util.HashMap) r11.LIZ).values().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
    
        if (r1.hasNext() == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
    
        if (((java.util.Set) r1.next()).contains(r3) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a3, code lost:
    
        monitor-exit(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a5, code lost:
    
        monitor-exit(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ac, code lost:
    
        if (r3.startsWith("/") != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ae, code lost:
    
        X.C2167708eR.LJIIIZ(r3, null, r13 | 1, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b4, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b7, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e3, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e4, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e9, code lost:
    
        if (X.C2167708eR.LIZ != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00eb, code lost:
    
        android.os.Trace.endSection();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ee, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ef, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f0, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f3, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fe, code lost:
    
        throw r1;
     */
    /* JADX WARN: Finally extract failed */
    @Override // X.AbstractC2167908eT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZ(java.lang.String r12, int r13, android.os.StrictMode.ThreadPolicy r14) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2167408eO.LIZ(java.lang.String, int, android.os.StrictMode$ThreadPolicy):int");
    }
}
